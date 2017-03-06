/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.util.EmfFormatter
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.tesina.lenguajeNaturalReducido.Documento

@RunWith(XtextRunner)
@InjectWith(LenguajeNaturalReducidoInjectorProvider)
class LenguajeNaturalReducidoParsingTest{

	@Inject
	ParseHelper<Documento> parseHelper
	@Inject
	ISerializer serializer
	
	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			el/la seleccion de libros  de un/una biblioteca tal que el/la titulo de un/una libro es igual a 'El Alquimista'		''')
		//Assert.assertNotNull(result))
		println(EmfFormatter.objToStr(result))
		println("    ============        ")
		println(serializer.serialize(result))
	}

}