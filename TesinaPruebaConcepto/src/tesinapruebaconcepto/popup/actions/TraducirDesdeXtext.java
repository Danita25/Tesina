package tesinapruebaconcepto.popup.actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNodeWithSyntaxError;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.ISerializer;
import org.xtext.tesina.LenguajeNaturalReducidoStandaloneSetup;
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
		Injector injector = new LenguajeNaturalReducidoStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
	}
	
	public EObject parseXmi(InputStream in) throws IOException {
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.xmi"));
		resource.load(in, resourceSet.getLoadOptions());
		EList<EObject> contents = resource.getContents();
		return contents.get(0);
	}
		
	public EObject writeXmi(OutputStream os, EObject content) throws IOException {
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.xmi"));
		EList<EObject> contents = resource.getContents();
		contents.add(content);
		resource.save(os, resourceSet.getLoadOptions());
		return contents.get(0);
	}

	public void writeLnr(OutputStream os, EObject content) throws IOException {
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.lnr"));
		EList<EObject> contents = resource.getContents();
		contents.add(content);
		resource.save(os, null);
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
	
	public String serialize(EObject result) {
		return serializer.serialize(result);
	}
	
	public static void main(String[] args) throws IOException {
		TraducirDesdeXtext xtext = new TraducirDesdeXtext();
		FileInputStream f = new FileInputStream("C:\\Users\\Danae\\git\\OCL2LNR_Transformador\\models\\LNR_Output.xmi");
		EObject result = xtext.parseXmi(f);
		System.out.println(xtext.serialize(result));
	}


}