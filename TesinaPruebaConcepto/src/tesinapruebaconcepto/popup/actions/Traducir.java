package tesinapruebaconcepto.popup.actions;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.Visitor;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import tesinapruebaconcepto.Activator;


public class Traducir implements IObjectActionDelegate {

	private Shell shell;
	
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
		shell = targetPart.getSite().getShell();
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
		String ecoreFileName = sourceFile.getLocation().removeLastSegments(1).append(sourceFile.getName().replace("."+sourceFile.getFileExtension(), ".ecore")).toString();
		System.out.println("eCore File Name: "+ecoreFileName);
		
		
	/*CompleteOCLCSResource completeOCLFile = loadOcl(sourceFile.getLocation().toString());
		CS2AS cs2as = completeOCLFile.getCS2AS();
*/
		
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
			this.parseOCL(ecoreFileName, sourceFile);
		} catch (IOException | ParserException e) {
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
	
	public void parseOCL (String ecoreFileName, IFile file) throws IOException, ParserException {
		EPackage.Registry registry = new EPackageRegistryImpl();
		//EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		//ePackage.setName("RandL");
		
		//registry.put()
		EPackage ePackage = loadPackage(ecoreFileName);

		registry.put(ePackage.getName(), ePackage);
		EcoreEnvironmentFactory environmentFactory = new EcoreEnvironmentFactory(registry); //param registry
		OCL ocl = OCL.newInstance(environmentFactory);

		// get an OCL text file via some hypothetical API
;
		InputStream in = null;
		try {
			in = file.getContents();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map<String, Constraint> constraintMap = new HashMap<String, Constraint>();

		// parse the contents as an OCL document
		try {
		    OCLInput document = new OCLInput(in);
		    
		    List<Constraint> constraints = ocl.parse(document);
		    for (Constraint next : constraints) {
		        constraintMap.put(next.getName(), next);
		     //   System.out.println(next.getSpecification().getContextVariable());
		        OCLExpression<EClassifier> body = next.getSpecification().getBodyExpression();
		    //    System.out.printf("%s: %s%n", next.getName(), body);
		            }
		} finally {
		    in.close();
		}
		/*
		//Trying to process model
		for (EClassifier c : ePackage.getEClassifiers())
		{
			System.out.println(c.getName());
			System.out.println(c.getClass().toString());
		}
		TreeIterator itr = ePackage.eAllContents();
		while (itr.hasNext()){
			System.out.println(itr.next().toString());
		}
		*/
//		InputStream in = null;
		try {
			in = file.getContents();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		OCLInput document = new OCLInput(in);
		 List<Constraint>  constraints =  ocl.parse(document);
		 

		for (Constraint c : constraints)
		{ 
			Visitor v = new StringTraducirVisitor();
			System.out.println("Spec es " + c.getSpecification().accept(v));
/*			ExpressionInOCL<EClassifier, EParameter> expr = c.getSpecification();
			System.out.println("Context => "+expr.getContextVariable());
			System.out.println("Body => "+expr.getBodyExpression());
			System.out.println("Result => "+expr.getResultVariable());
			System.out.println("Generted Type => "+expr.getGeneratedType());
			System.out.println("Parameter => "+expr.getParameterVariable());
			System.out.println("Body Expression Type => "+expr.getBodyExpression().getType());
			System.out.println(c.eClass()); //Constraint
			ExpressionInOCL e = (ExpressionInOCL) c; //Expression in OCL
			e.getBodyExpression(); //OclExpression
*/		}
/*        //Creando un helper
        OCLHelper helper = ocl.createOCLHelper();
        ocl.*/
	}

	private CompleteOCLCSResource loadOcl(String oclFileName) {
		// Create a resource set. 
		ResourceSet resourceSet = new ResourceSetImpl(); 

		// Register the default resource factory -- only needed for stand-alone! 
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
		//"ocl", new OCLResourceFactoryImpl()); 

		// Get the URI of the model file. 
		URI fileURI = URI.createFileURI(new File(oclFileName).getAbsolutePath()); 

		// Demand load the resource for this file. 
		Resource resource = resourceSet.getResource(fileURI, true); 
        
		// Print the contents of the resource to System.out. 
		return (CompleteOCLCSResource) resource;
	}
	
	private EPackage loadPackage(String ecoreFileName) {
		// Create a resource set. 
		ResourceSet resourceSet = new ResourceSetImpl(); 

		// Register the default resource factory -- only needed for stand-alone! 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
		"ecore", new EcoreResourceFactoryImpl()); 

		// Register the package -- only needed for stand-alone! 
		EcorePackage ecorePackage = EcorePackage.eINSTANCE; 

		// Get the URI of the model file. 
		URI fileURI = URI.createFileURI(new File(ecoreFileName).getAbsolutePath()); 

		// Demand load the resource for this file. 
		Resource resource = resourceSet.getResource(fileURI, true); 
 
		// Print the contents of the resource to System.out. 
		return (EPackage) resource.getContents().get(0);
	}
	
}
