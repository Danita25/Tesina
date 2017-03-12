package tesinapruebaconcepto.popup.actions;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
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

		//Obtener nomber del projecto activo.
		IProject myProject = sourceFile.getProject();
		//System.out.println("My Project: "+myProject.getName());
		
		//Crear carpeta Traducciones (solo si no existe)
		IFolder filesFolder = myProject.getFolder("Traducciones");
		if (!filesFolder.exists()){
			try {
				filesFolder.create(false, true, null);
			} catch (CoreException e) {
				System.out.println("Creacion de carpeta Traducciones ha fallado.");
				e.printStackTrace();
			}
		}
		try {
			this.traducirOCL(sourceFile);
		} catch (Exception e) {
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
	public void traducirOCL(IFile sourceFile) throws Exception {
		
		copyRequiredFiles(sourceFile); //Copia los archivos .ocl.oclas y .ecore a la carpeta models que se encuentra en el projecto Transformador.

		//Transformacion en ATL 
		String FilePathXmiStr = getATLModelsURL()+"OCL2LNR_Output.xmi";
		String FilePathOclasStr = getATLModelsURL() + sourceFile.getName().replace("ocl.", ""); //por alguna razon remueve el .ocl del .ocl.oclas
		
		OCL2LNR.run("file://"+FilePathOclasStr, "file://"+FilePathXmiStr);
	
		//Traducir XMI usando Xtext
		TraducirDesdeXtext xtext = new TraducirDesdeXtext();
		FileInputStream f = new FileInputStream(FilePathXmiStr);
		EObject result = xtext.parseXmi(f);
		String traduccion = xtext.serialize(result);
		System.out.println("TEST PASSED ==>"+xtext.testOutput(traduccion));
		System.out.println(traduccion);
		String srcDir = (sourceFile.getLocation().removeLastSegments(2).toString())+"/";
	    DateFormat df = new SimpleDateFormat("dd-MM-yy-HHmmss");
		String now = df.format(new Date()).toString();
		String outputFileName = srcDir +"Traducciones/"+ sourceFile.getName().replace(".ocl.oclas", "_"+now)+ ".lnr";
		FileOutputStream os = new FileOutputStream(outputFileName);
		xtext.writeLnr(os, result);
		
		//Remover archivos movidos al proyecto transformador (.ocl, .ecore, .xmi)
		//Files.delete(Paths.get(getATLModelsURL()+"OCL2LNR_Output.xmi"));
		Files.deleteIfExists(Paths.get(FilePathXmiStr));
		Files.deleteIfExists(Paths.get(FilePathOclasStr));
		Files.deleteIfExists(Paths.get(getATLModelsURL() + sourceFile.getName().replace("ocl.", "")));
		
		//Refresh del projecto de usuaio para mostrar el nuevo archivo generado.
		sourceFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);

	}

	private void copyRequiredFiles(IFile sourceFile) throws IOException
	{ 
		//Determinar path del proyecto de transformacion ATL
		String destDir = getATLModelsURL();
	
		//Determinar path del projecto que contiene el archivo .ocl.oclas
		String srcDir = (sourceFile.getLocation().removeLastSegments(1).toString())+"/";
		
		//Mover el archivo ocl.oclas
		Files.copy(Paths.get(srcDir + sourceFile.getName()), Paths.get(destDir + sourceFile.getName().replace("ocl.", "")) , StandardCopyOption.REPLACE_EXISTING);

		//mover el archivo .ecore  que posee el mismo nombre que el archivo ocl.oclas
		String sourceStr = sourceFile.getName().split(".ocl")[0].concat(".ecore");
		Files.copy( Paths.get(srcDir + sourceStr),  Paths.get(destDir + sourceStr) , StandardCopyOption.REPLACE_EXISTING);
	}

	private String getATLModelsURL() {
		return Platform.getBundle("OCL2LNR_Transformador").getLocation().replaceAll("reference:file:/", "").concat("models/");
	}

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
