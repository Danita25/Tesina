package tesinapruebaconcepto.popup.actions;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import tesinapruebaconcepto.Activator;
import transformation.OCL2LNR;


public class Traducir implements IObjectActionDelegate {

	private Shell shell;
	private EcorePackage ecorePackage;
	
	/**
	 * Constructor for Action1.
	 */
	public Traducir() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		setShell(targetPart.getSite().getShell());
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IEditorPart editor = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor();
		IEditorInput input= editor.getEditorInput();
		IFile sourceFile = input.getAdapter(IFile.class);
	
		
		//Source File info
		//String sourceFileName = sourceFile.getName().replace("."+sourceFile.getFileExtension(), "");
		String ecoreFileName = sourceFile.getLocation().toString().split(".ocl")[0].concat(".ecore");
		//String ecoreFileName = sourceFile.getLocation().removeLastSegments(1).append(sourceFile.getName().replace("."+sourceFile.getFileExtension(), ".ecore")).toString();
		System.out.println("eCore File Name: "+ecoreFileName);
		
		
		//Get Active Project
		IProject myProject = sourceFile.getProject();
		System.out.println("My Project: "+myProject.getName());
		
		//Create Traducciones folder (if does not exist)
		IFolder filesFolder = myProject.getFolder("Traducciones");
		if (!filesFolder.exists()){
			try {
				filesFolder.create(false, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				System.out.println("Folder Creation Fail");
				e.printStackTrace();
			}
		}
		try {
	//		this.parseOCL2(ecoreFileName, sourceFile);
			this.parseOCL(sourceFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	   System.out.println("SelectionChanged");
	}
	
	//Recibe el .ocl file de entrada, deberia generar el oclas para pasarselo de entrada a  la trasformacion ATL
	public void parseOCL(IFile sourceFile) throws Exception {
		
		copyRequiredFiles(sourceFile); //copies .ocl.oclas and .ecore to models folder into the transformador project.

		//Transformacion en ATL 
		OCL2LNR.run("file://"+getATLModelsURL() + sourceFile.getName().replace("ocl.", ""), "file://"+getATLModelsURL()+"OCL2LNR_Output.xmi");
	
		//Traducir XMI usando Xtext
		TraducirDesdeXtext xtext = new TraducirDesdeXtext();
		FileInputStream f = new FileInputStream( getATLModelsURL()+"OCL2LNR_Output.xmi");
		EObject result = xtext.parseXmi(f);
		System.out.println(xtext.serialize(result));
		String srcDir = (sourceFile.getLocation().removeLastSegments(1).toString())+"/";
		String outputFileName = srcDir + sourceFile.getName().replace("ocl.", "").replace(".oclas", ".gramatica");
		FileOutputStream os = new FileOutputStream(outputFileName);
		xtext.writeLnr(os, result);
	}

	private void copyRequiredFiles(IFile sourceFile) throws IOException
	{ 
		/*Determinar path del proyecto de transformacion ATL*/
		String destDir = getATLModelsURL();
	
		/*Determinar path del projecto que contiene el archivo .ocl.oclas*/
		String srcDir = (sourceFile.getLocation().removeLastSegments(1).toString())+"/";
		
		/*Move ocl.oclas file*/
		Files.copy(Paths.get(srcDir + sourceFile.getName()), Paths.get(destDir + sourceFile.getName().replace("ocl.", "")) , StandardCopyOption.REPLACE_EXISTING);

		/*move .ecore mismo nombre que ocl.oclas*/
		String sourceStr = sourceFile.getName().split(".ocl")[0].concat(".ecore");
		Files.copy( Paths.get(srcDir + sourceStr),  Paths.get(destDir + sourceStr) , StandardCopyOption.REPLACE_EXISTING);
	}

	private String getATLModelsURL() {
		return Platform.getBundle("OCL2LNR_Transformador").getLocation().replaceAll("reference:file:/", "").concat("models/");
		//return Platform.getBundle("OCL2LNR_Transformador").getLocation().replaceAll("reference:", "").concat("models/");
	}
//	public void parseOCL2 (String ecoreFileName, IFile file) throws IOException, ParserException {
//		EPackage.Registry registry = new EPackageRegistryImpl();
//		//EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
//		//ePackage.setName("RandL");
//		
//		//registry.put()
//		EPackage ePackage = loadPackage(ecoreFileName);
//
//		registry.put(ePackage.getName(), ePackage);
//		EcoreEnvironmentFactory environmentFactory = new EcoreEnvironmentFactory(registry); //param registry
//		OCL ocl = OCL.newInstance(environmentFactory);
//
//		// get an OCL text file via some hypothetical API
//;
//		InputStream in = null;
//		try {
//			in = file.getContents();
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		Map<String, Constraint> constraintMap = new HashMap<String, Constraint>();
//
//		// parse the contents as an OCL document
//		try {
//		    OCLInput document = new OCLInput(in);
//		    
//		    List<Constraint> constraints = ocl.parse(document);
//		    for (Constraint next : constraints) {
//		        constraintMap.put(next.getName(), next);
//		     //   System.out.println(next.getSpecification().getContextVariable());
//		        OCLExpression<EClassifier> body = next.getSpecification().getBodyExpression();
//		    //    System.out.printf("%s: %s%n", next.getName(), body);
//		            }
//		} finally {
//		    in.close();
//		}
//
//		try {
//			in = file.getContents();
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		OCLInput document = new OCLInput(in);
//		 List<Constraint>  constraints =  ocl.parse(document);
//		 
//		Visitor v = new StringTraducirVisitor();
//		for (Constraint c : constraints)
//		{ 
//			c.getSpecification().accept(v);
//			//System.out.println("Spec es " + c.getSpecification().accept(v));
///*			ExpressionInOCL<EClassifier, EParameter> expr = c.getSpecification();
//			System.out.println("Context => "+expr.getContextVariable());
//			System.out.println("Body => "+expr.getBodyExpression());
//			System.out.println("Result => "+expr.getResultVariable());
//			System.out.println("Generted Type => "+expr.getGeneratedType());
//			System.out.println("Parameter => "+expr.getParameterVariable());
//			System.out.println("Body Expression Type => "+expr.getBodyExpression().getType());
//			System.out.println(c.eClass()); //Constraint
//			ExpressionInOCL e = (ExpressionInOCL) c; //Expression in OCL
//			e.getBodyExpression(); //OclExpression
//*/		}
///*        //Creando un helper
//        OCLHelper helper = ocl.createOCLHelper();
//        ocl.*/
//	}

//	private EPackage loadPackage(String ecoreFileName) {
//		// Create a resource set. 
//		ResourceSet resourceSet = new ResourceSetImpl(); 
//
//		// Register the default resource factory -- only needed for stand-alone! 
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
//		"ecore", new EcoreResourceFactoryImpl()); 
//
//		setEcorePackage(EcorePackage.eINSTANCE); 
//
//		// Get the URI of the model file. 
//		URI fileURI = URI.createFileURI(new File(ecoreFileName).getAbsolutePath()); 
//
//		// Demand load the resource for this file. 
//		Resource resource = resourceSet.getResource(fileURI, true); 
// 
//		// Print the contents of the resource to System.out. 
//		return (EPackage) resource.getContents().get(0);
//	}
//	

	public Shell getShell() {
		return shell;
	}
	

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public EcorePackage getEcorePackage() {
		return ecorePackage;
	}

	public void setEcorePackage(EcorePackage ecorePackage) {
		this.ecorePackage = ecorePackage;
	}
	
}
