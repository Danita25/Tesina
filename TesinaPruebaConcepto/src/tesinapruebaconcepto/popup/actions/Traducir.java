package tesinapruebaconcepto.popup.actions;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.examples.interpreter.console.OCLResource;
//import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCLCSResource
//import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;
import org.eclipse.ocl.expressions.OCLExpression;
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
		System.out.println(sourceFile.getName());
		String ecoreFileName = sourceFile.getLocation().removeLastSegments(1).append(sourceFile.getName().replace("."+sourceFile.getFileExtension(), ".ecore")).toString();
/*		System.out.println("Source File Name: "+sourceFileName);
		System.out.println("Source File Location: "+sourceFile.getLocation());*/
		System.out.println("eCore File Name: "+ecoreFileName);
		loadOcl(sourceFile.getLocation().toString());

		
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
		        
		        OCLExpression<EClassifier> body = next.getSpecification().getBodyExpression();
		        System.out.printf("%s: %s%n", next.getName(), body);
		    }
		} finally {
		    in.close();
		}
	}

	private void loadOcl(String oclFileName) {
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
		//return (CompleteOCLCSResource) resource;
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
