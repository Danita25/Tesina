/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.lenguajenaturalreducido.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.lenguajenaturalreducido.ui.internal.LenguajenaturalreducidoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LenguajeNaturalReducidoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LenguajenaturalreducidoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LenguajenaturalreducidoActivator.getInstance().getInjector(LenguajenaturalreducidoActivator.ORG_XTEXT_EXAMPLE_LENGUAJENATURALREDUCIDO_LENGUAJENATURALREDUCIDO);
	}
	
}
