package tesinapruebaconcepto.popup.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNodeWithSyntaxError;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.ISerializer;
import org.xtext.tesis.gramatica.GramaticaStandaloneSetup;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class TraducirDesdeXtext {

	@Inject
	private IParser parser;
	@Inject
	private ISerializer serializer;
	
	@Inject
	XtextResourceSet resourceSet;

	public TraducirDesdeXtext() {
		setupParser();
	}

	private void setupParser() {
		Injector injector = new GramaticaStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
	}
	
	public EObject parseXmi(InputStream in) throws IOException {
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.xmi"));
		resource.load(in, resourceSet.getLoadOptions());
		EList<EObject> contents = resource.getContents();
		return contents.get(0);
	}
		

	/**
	 * Parses data provided by an input reader using Xtext and returns the root
	 * node of the resulting object tree.
	 * 
	 * @param reader
	 *            Input reader
	 * @return root object node
	 * @throws IOException
	 *             when errors occur during the parsing process
	 */
	public EObject parse(Reader reader) throws IOException {
		IParseResult result = parser.parse(reader);
		if (result.hasSyntaxErrors()) {
			for (INode e : result.getSyntaxErrors()) {
				LeafNodeWithSyntaxError err = (LeafNodeWithSyntaxError) e;
				System.out.println(err.getSyntaxErrorMessage());
			}
			throw new ParseException("Provided input contains syntax errors.");
		}
		return result.getRootASTElement();
	}
	
	private String serialize(EObject result) {
		return serializer.serialize(result);
	}
	
	public static void main(String[] args) throws IOException {
		TraducirDesdeXtext xtext = new TraducirDesdeXtext();
		FileInputStream f = new FileInputStream("C:\\Users\\Danae\\workspace\\OCL2LNR_Launcher\\models\\LNR_Output.xmi");
		EObject result = xtext.parseXmi(f);
		System.out.println(xtext.serialize(result));
	}


}