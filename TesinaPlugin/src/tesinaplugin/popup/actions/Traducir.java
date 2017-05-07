package tesinaplugin.popup.actions;


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
import org.eclipse.core.runtime.IPath;
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
import org.eclipse.ui.SubActionBars;

import tesinaplugin.Activator;
import tesinaplugin.exception.genericException;
import transformation.OCL2LNR;


public class Traducir extends AbstractTraducir implements IObjectActionDelegate {

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

		//Obtener nombre del projecto activo.
		IProject myProject = sourceFile.getProject();
		
		//Crear carpeta Traducciones (solo si no existe)
		IFolder filesFolder = myProject.getFolder(FOLDER_SRC_TRADUCCIONES);
		if (!filesFolder.exists()){
			try {
				filesFolder.create(false, true, null);
			} catch (CoreException e) {
				throw new genericException(
						String.format("Creacion de carpeta Traducciones ha fallado. %s", e.getMessage()), e);
			}
		}
		try {
			this.traducirOCL(sourceFile);
		} catch (Exception e) {
			throw new genericException(e);
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
		String FilePathXmiStr = getATLModelsURL().concat( FILE_XMI);
		String FilePathOclasStr = getATLModelsURL().concat(sourceFile.getName().replace(CLEAN_OCL, VACIO)); //por alguna razon remueve el .ocl del .ocl.oclas
		
		OCL2LNR.run(FILE.concat(FilePathOclasStr), FILE.concat(FilePathXmiStr));
	
		//Traducir XMI usando Xtext
		TraducirDesdeXtext xtext = new TraducirDesdeXtext();
		FileInputStream f = new FileInputStream(FilePathXmiStr);
		EObject result = xtext.parseXmi(f);
		String srcDir = (sourceFile.getLocation().removeLastSegments(2).toString()).concat(BARRA_INVERTIDA);
	    DateFormat df = new SimpleDateFormat(FORMAT_DATE);
		String now = df.format(new Date()).toString();
		String outputFileName = srcDir.concat(FOLDER_TRADUCCIONES.concat(sourceFile.getName().replace(CLEAN_OCL_OCLAS,GUION_BAJO.concat(now)).concat(EXTENSION_LNR)));
		FileOutputStream os = new FileOutputStream(outputFileName);
		xtext.writeLnr(os, result);
		
		//Remover archivos movidos al proyecto transformador (.ocl, .ecore, .xmi)
		Files.deleteIfExists(Paths.get(FilePathXmiStr));
		Files.deleteIfExists(Paths.get(FilePathOclasStr));
		Files.deleteIfExists(Paths.get(getATLModelsURL().concat(sourceFile.getName().replace(CLEAN_OCL, VACIO))));
		
		//Refresh del projecto de usuaio para mostrar el nuevo archivo generado.
		sourceFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private void copyRequiredFiles(IFile sourceFile) throws IOException
	{ 
		//Determinar path del proyecto de transformacion ATL
		String destDir = getATLModelsURL();
	
		//Determinar path del projecto que contiene el archivo .ocl.oclas
		String srcDir = (sourceFile.getLocation().removeLastSegments(1).toString()).concat(BARRA_INVERTIDA);
		
		//Mover el archivo ocl.oclas
		Files.copy(Paths.get(srcDir.concat(sourceFile.getName())), Paths.get(destDir.concat(sourceFile.getName().replace(CLEAN_OCL, VACIO))) , StandardCopyOption.REPLACE_EXISTING);

		//mover el archivo .ecore  que posee el mismo nombre que el archivo ocl.oclas
		String sourceStr = sourceFile.getName().split(EXTENSION_OCL)[0].concat(EXTENSION_ECORE);
		Files.copy( Paths.get(srcDir.concat(sourceStr)),  Paths.get(destDir.concat(sourceStr)) , StandardCopyOption.REPLACE_EXISTING);
	}

	private String getATLModelsURL() {
		if(System.getProperty(OS).startsWith(OS_WIN)){
			return Platform.getBundle(PROJECT_TRANSFORMADOR).getLocation().replaceAll(REFERENCE_FILE_WINDOWS, VACIO).concat(FOLDER_MODELS);
		}else{
			return Platform.getBundle(PROJECT_TRANSFORMADOR).getLocation().replaceAll(REFERENCE_FILE_OTHERS, VACIO).concat(FOLDER_MODELS);
		}
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
