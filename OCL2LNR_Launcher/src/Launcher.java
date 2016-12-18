import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.emf.common.util.URI;

import transformation.OCL2Debug;
public class Launcher {

	public static void main(String[] args) {
		
		// INIT OCL pivot standalone
//		org.eclipse.ocl.pivot.//.OCL.initialize(null);
		org.eclipse.ocl.pivot.model.OCLstdlib.install();
		
		// URIs to input / ouput models
		URI projectBase = URI.createFileURI(System.getProperty("user.dir"));
		URI mBase = projectBase.appendSegment("models");
		
		//Get oclas 
		File folder = new File(mBase.path());
		File[] files = folder.listFiles(new FilenameFilter() {
		    public boolean accept(File folder, String name) {
		        return name.toLowerCase().endsWith(".oclas");
		    }
		});
		
		
		// input : OCL (PIVOT) abstract syntax
		URI oclASURI = mBase.appendSegment(files[0].getName());
		// output : LNR 
		URI outputURI = mBase.appendSegment(files[0].getName()+"_Output.xmi");
		
		// strings for ATL
		String oclASPath = oclASURI.toString();
		String outputPath = outputURI.toString();
		
		// run the transformation
		try {
			OCL2Debug.run(oclASPath,outputPath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
