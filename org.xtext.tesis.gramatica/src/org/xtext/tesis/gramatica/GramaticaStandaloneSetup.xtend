/*
 * generated by Xtext 2.10.0
 */
package org.xtext.tesis.gramatica


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GramaticaStandaloneSetup extends GramaticaStandaloneSetupGenerated {

	def static void doSetup() {
		new GramaticaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
