/*
 * generated by Xtext 2.10.0
 */
package org.xtext.tesis.gramatica.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGramaticaValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.tesis.gramatica.gramatica.GramaticaPackage.eINSTANCE);
		return result;
	}
	
}