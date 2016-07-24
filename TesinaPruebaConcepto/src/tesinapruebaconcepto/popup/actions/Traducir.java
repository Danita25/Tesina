package tesinapruebaconcepto.popup.actions;


import java.io.FileInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import tesinapruebaconcepto.Activator;


public class Traducir implements IObjectActionDelegate {

	private static final String AUTENTIA_TRANSLATOR = null;
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
		String sourceFileName = sourceFile.getName().replace("."+sourceFile.getFileExtension(), "");
		System.out.println("Source File Name: "+sourceFileName);
		System.out.println("Source File Location: "+sourceFile.getLocation());
		
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
		
		// create a new Target file
	      IFile targetFile = filesFolder.getFile(sourceFileName+".ln");
	      try {
			targetFile.create(sourceFile.getContents(), true, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			System.out.println("File Creation Fail");
			e.printStackTrace();
		}
	      // create closes the file stream, so no worries.   

	}
	

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	   System.out.println("SelectionChanged");
	}
	

}
