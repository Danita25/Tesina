package tesinapruebaconcepto.popup.actions;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.swt.widgets.Shell;

abstract class AbstractTraducir {
	protected Shell shell;
	protected EcorePackage ecorePackage;
	
	protected static final String FOLDER_SRC_TRADUCCIONES="Traducciones";
	protected static final String FOLDER_TRADUCCIONES="Traducciones/";
	protected static final String FOLDER_MODELS="models/";
	
	protected static final String FILE="file://";
	protected static final String FILE_XMI="OCL2LNR_Output.xmi";
	
	protected static final String EXTENSION_OCL=".ocl";
	protected static final String EXTENSION_ECORE=".ecore";
	protected static final String EXTENSION_LNR=".lnr";
	
	protected static final String PROJECT_TRANSFORMADOR="OCL2LNR_Transformador";
	protected static final String FORMAT_DATE="dd-MM-yy-HHmmss";
	
	protected static final String CLEAN_OCL="ocl.";
	protected static final String CLEAN_OCL_OCLAS=".ocl.oclas";
	
	protected static final String GUION_BAJO="_";
	
	protected static final String REFERENCE_FILE="reference:file:/";
	
	protected static final String VACIO="";
	
	protected static final String BARRA_INVERTIDA="/";
	
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
