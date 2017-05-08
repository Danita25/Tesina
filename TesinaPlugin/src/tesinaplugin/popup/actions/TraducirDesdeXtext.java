package tesinaplugin.popup.actions;

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
import org.junit.Assert;
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
		FileInputStream f = new FileInputStream("..\\OCL2LNR_Transformador\\models\\LNR_Output.xmi");
		EObject result = xtext.parseXmi(f);
		String actual = xtext.serialize(result);
		if (xtext.testOutput(actual)) {
			System.out.println("TEST PASSED");}
		else {
			System.out.println("TEST FAILED");
			System.out.println(actual);
		}
		

	}
	
	public boolean testOutput (String actual){
		String expected = "\"Las siguientes afirmaciones deben ser verdaderas en el sistema:\" .\r\n"
				+ " el/la cantidad de libros de un/una Biblioteca es mayor que \"0\" .\r\n"
				+ " entre los/las empleados de un/una Biblioteca existe uno/una tal que el/la rol de un/una Empleado es igual a \"Bibliotecario/a\" .\r\n"
			
				+ " el/la cantidad de libros de un/una Biblioteca tal que el/la titulo de un/una Libro es igual a \"El Alquimista\" es mayor que \"5\" .\r\n"
				+ " el/la cantidad de libros de un/una Biblioteca tal que el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" y el/la titulo de un/una Libro es igual a \"El Alquimista\" es mayor que \"1\" .\r\n"
				+ " el/la cantidad de libros de un/una Biblioteca tal que si el/la titulo de un/una Libro es igual a \"El Alquimista\" entonces el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" es mayor que \"1\" .\r\n"
				+ " todos los/las libros de un/una Biblioteca satisfacen que el/la fechaDeEdicion de un/una Libro es mayor que \"01-01-1900\" .\r\n"
				+ " entre los/las libros de un/una Biblioteca existe uno/una tal que el/la titulo de un/una Libro es igual a \"El Principito\" .\r\n"
				+ " entre los/las libros de un/una Biblioteca existe uno/una tal que el/la nombre de el/la autor de un/una Libro es igual a \" Antoine de Saint-Exupery\" y el/la titulo de un/una Libro es igual a \"El Principito\" .\r\n"
				+ " entre los/las libros de un/una Biblioteca existe uno/una tal que el/la titulo de un/una Libro es igual a \"El Principito\" y entre los/las libros de un/una Biblioteca existe uno/una tal que el/la titulo de un/una Libro es igual a \"Harry potter\" .\r\n"
				+ " el/la cantidad de libros de un/una Biblioteca tal que el/la titulo de un/una Libro es igual a \"El caballero de la armadura oxidada\" es igual a \"0\" .\r\n"
				+ " entre los/las libros de un/una Biblioteca tal que el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" existe uno/una tal que el/la titulo de un/una Libro es igual a \"Veronica decide morir\" .\r\n"
				+ " el/la cantidad de libros de un/una Biblioteca tal que el/la titulo de un/una Libro es igual a \"Veronica decide morir\" y el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" es mayor que \"0\" .\r\n"
				+ " todos los/las libros de un/una Biblioteca tal que el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" satisfacen que el/la editorial de un/una Libro es igual a \"Planeta\" .\r\n"
				+ " todos los/las libros de un/una Biblioteca satisfacen que si el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" entonces el/la editorial de un/una Libro es igual a \"Planeta\" .\r\n"
				
				+ " el/la edad de un/una Empleado es mayor o igual a \"18\" .\r\n"
				+ " el/la cantidad de copias de un/una Libro es mayor o igual a \"1\" .\r\n"
				+ " el/la cantidad de copias de un/una Libro tal que el/la estadoDeLaCopia de un/una Copia es igual a \"Bueno\" es mayor que \"0\" .\r\n"
				
				+ " el/la titulo de un/una Libro es distinto de \"\" .\r\n"
				+ " el/la titulo de un/una Libro no es igual a \"\" .\r\n"
				+ " si el/la titulo de un/una Libro es igual a \"El Alquimista\" entonces el/la nombre de el/la autor de un/una Libro es igual a \"Paulo Coelho\" .\r\n"
				+ " \"\" es distinto de el/la titulo de un/una Libro .\r\n"
				+ " el/la cantidad de copias de un/una Libro es mayor que \"6\" .\r\n"
				+ " el/la cantidad de copias de un/una Libro es igual a \"0\" .\r\n"
				+ " el/la cantidad de copias de un/una Libro es mayor que \"0\" .\r\n"
				+ " el/la cantidad de prestamos de el/la solicitante de un/una Prestamo es mayor o igual a \"1\" .\r\n"
				+ " el/la cantidad de prestamos de el/la solicitante de un/una Prestamo tal que el/la fechaDeFin de un/una Prestamo es distinto de \"1980\" es mayor o igual a \"1\" .\r\n"
				
				+ " el/la apellido de un/una Socio es distinto de \"\" y el/la nombre de un/una Socio es distinto de \"\" y el/la direccion de un/una Socio es distinto de \"\" .\r\n"
				
				+ " el/la nombre de un/una Socio es distinto de \"\" o el/la direccion de un/una Socio es distinto de \"\" .\r\n"
				+ " el/la nombre de un/una Socio es distinto de \"\" y el/la direccion de un/una Socio es distinto de \"\" .\r\n"
				+ " el/la cantidad de multas de un/una Socio es menor o igual a el/la cantidad de prestamos de un/una Socio .\r\n";
			 	
		//System.out.println("EXPECTED\r\n"+expected);
		System.out.println("ACTUAL\r\n"+actual);
		Assert.assertEquals(expected, actual);
		return expected.equals(actual);
	}

}