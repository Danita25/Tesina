/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
grammar InternalGramatica;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.tesis.gramatica.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.tesis.gramatica.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.tesis.gramatica.services.GramaticaGrammarAccess;

}
@parser::members {
	private GramaticaGrammarAccess grammarAccess;

	public void setGrammarAccess(GramaticaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDocumento
entryRuleDocumento
:
{ before(grammarAccess.getDocumentoRule()); }
	 ruleDocumento
{ after(grammarAccess.getDocumentoRule()); } 
	 EOF 
;

// Rule Documento
ruleDocumento 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDocumentoAccess().getGroup()); }
		(rule__Documento__Group__0)
		{ after(grammarAccess.getDocumentoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOracion
entryRuleOracion
:
{ before(grammarAccess.getOracionRule()); }
	 ruleOracion
{ after(grammarAccess.getOracionRule()); } 
	 EOF 
;

// Rule Oracion
ruleOracion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOracionAccess().getGroup()); }
		(rule__Oracion__Group__0)
		{ after(grammarAccess.getOracionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContenido
entryRuleContenido
:
{ before(grammarAccess.getContenidoRule()); }
	 ruleContenido
{ after(grammarAccess.getContenidoRule()); } 
	 EOF 
;

// Rule Contenido
ruleContenido 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContenidoAccess().getGroup()); }
		(rule__Contenido__Group__0)
		{ after(grammarAccess.getContenidoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimple
entryRuleSimple
:
{ before(grammarAccess.getSimpleRule()); }
	 ruleSimple
{ after(grammarAccess.getSimpleRule()); } 
	 EOF 
;

// Rule Simple
ruleSimple 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleAccess().getGroup()); }
		(rule__Simple__Group__0)
		{ after(grammarAccess.getSimpleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComposicion
entryRuleComposicion
:
{ before(grammarAccess.getComposicionRule()); }
	 ruleComposicion
{ after(grammarAccess.getComposicionRule()); } 
	 EOF 
;

// Rule Composicion
ruleComposicion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComposicionAccess().getGroup()); }
		(rule__Composicion__Group__0)
		{ after(grammarAccess.getComposicionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNexo
entryRuleNexo
:
{ before(grammarAccess.getNexoRule()); }
	 ruleNexo
{ after(grammarAccess.getNexoRule()); } 
	 EOF 
;

// Rule Nexo
ruleNexo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNexoAccess().getValorAssignment()); }
		(rule__Nexo__ValorAssignment)
		{ after(grammarAccess.getNexoAccess().getValorAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpresion
entryRuleExpresion
:
{ before(grammarAccess.getExpresionRule()); }
	 ruleExpresion
{ after(grammarAccess.getExpresionRule()); } 
	 EOF 
;

// Rule Expresion
ruleExpresion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpresionAccess().getExpresionAssignment()); }
		(rule__Expresion__ExpresionAssignment)
		{ after(grammarAccess.getExpresionAccess().getExpresionAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparacion
entryRuleComparacion
:
{ before(grammarAccess.getComparacionRule()); }
	 ruleComparacion
{ after(grammarAccess.getComparacionRule()); } 
	 EOF 
;

// Rule Comparacion
ruleComparacion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparacionAccess().getGroup()); }
		(rule__Comparacion__Group__0)
		{ after(grammarAccess.getComparacionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropiedad
entryRulePropiedad
:
{ before(grammarAccess.getPropiedadRule()); }
	 rulePropiedad
{ after(grammarAccess.getPropiedadRule()); } 
	 EOF 
;

// Rule Propiedad
rulePropiedad 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropiedadAccess().getGroup()); }
		(rule__Propiedad__Group__0)
		{ after(grammarAccess.getPropiedadAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFinOracion
entryRuleFinOracion
:
{ before(grammarAccess.getFinOracionRule()); }
	 ruleFinOracion
{ after(grammarAccess.getFinOracionRule()); } 
	 EOF 
;

// Rule FinOracion
ruleFinOracion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFinOracionAccess().getFullStopControl000dControl000aKeyword()); }
		'.\r\n'
		{ after(grammarAccess.getFinOracionAccess().getFullStopControl000dControl000aKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtributo
entryRuleAtributo
:
{ before(grammarAccess.getAtributoRule()); }
	 ruleAtributo
{ after(grammarAccess.getAtributoRule()); } 
	 EOF 
;

// Rule Atributo
ruleAtributo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtributoAccess().getGroup()); }
		(rule__Atributo__Group__0)
		{ after(grammarAccess.getAtributoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTermino
entryRuleTermino
:
{ before(grammarAccess.getTerminoRule()); }
	 ruleTermino
{ after(grammarAccess.getTerminoRule()); } 
	 EOF 
;

// Rule Termino
ruleTermino 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminoAccess().getGroup()); }
		(rule__Termino__Group__0)
		{ after(grammarAccess.getTerminoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObligacion
entryRuleObligacion
:
{ before(grammarAccess.getObligacionRule()); }
	 ruleObligacion
{ after(grammarAccess.getObligacionRule()); } 
	 EOF 
;

// Rule Obligacion
ruleObligacion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObligacionAccess().getGroup()); }
		(rule__Obligacion__Group__0)
		{ after(grammarAccess.getObligacionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperacion
entryRuleOperacion
:
{ before(grammarAccess.getOperacionRule()); }
	 ruleOperacion
{ after(grammarAccess.getOperacionRule()); } 
	 EOF 
;

// Rule Operacion
ruleOperacion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionAssignment()); }
		(rule__Operacion__OperacionAssignment)
		{ after(grammarAccess.getOperacionAccess().getOperacionAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteral
entryRuleLiteral
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleLiteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule Literal
ruleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralAccess().getValorAssignment()); }
		(rule__Literal__ValorAssignment)
		{ after(grammarAccess.getLiteralAccess().getValorAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nexo__ValorAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); }
		'y'
		{ after(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNexoAccess().getValorOKeyword_0_1()); }
		'o'
		{ after(grammarAccess.getNexoAccess().getValorOKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__ExpresionAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpresionAccess().getExpresionLiteralParserRuleCall_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getExpresionAccess().getExpresionLiteralParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpresionAccess().getExpresionPropiedadParserRuleCall_0_1()); }
		rulePropiedad
		{ after(grammarAccess.getExpresionAccess().getExpresionPropiedadParserRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operacion__OperacionAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); }
		'mayor que'
		{ after(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); }
		'menor que'
		{ after(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); }
		'igual a'
		{ after(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); }
		'mayor o igual a'
		{ after(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); }
		'menor o igual a'
		{ after(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); }
		'distinto de'
		{ after(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Documento__Group__0__Impl
	rule__Documento__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); }
	(rule__Documento__PathModeloAssignment_0)
	{ after(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Documento__Group__1__Impl
	rule__Documento__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); }
	(rule__Documento__PathOclAssignment_1)
	{ after(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Documento__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); }
	(rule__Documento__OracionesAssignment_2)*
	{ after(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Oracion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Oracion__Group__0__Impl
	rule__Oracion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Oracion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); }
	(rule__Oracion__ContenidoAssignment_0)
	{ after(grammarAccess.getOracionAccess().getContenidoAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Oracion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Oracion__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Oracion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOracionAccess().getFinOracionParserRuleCall_1()); }
	ruleFinOracion
	{ after(grammarAccess.getOracionAccess().getFinOracionParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contenido__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contenido__Group__0__Impl
	rule__Contenido__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contenido__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContenidoAccess().getSimpleAssignment_0()); }
	(rule__Contenido__SimpleAssignment_0)
	{ after(grammarAccess.getContenidoAccess().getSimpleAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contenido__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contenido__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contenido__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContenidoAccess().getComposicionAssignment_1()); }
	(rule__Contenido__ComposicionAssignment_1)?
	{ after(grammarAccess.getContenidoAccess().getComposicionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Simple__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__0__Impl
	rule__Simple__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); }
	(rule__Simple__Expresion_izqAssignment_0)
	{ after(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__1__Impl
	rule__Simple__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getComparacionAssignment_1()); }
	(rule__Simple__ComparacionAssignment_1)
	{ after(grammarAccess.getSimpleAccess().getComparacionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getExpresion_derAssignment_2()); }
	(rule__Simple__Expresion_derAssignment_2)
	{ after(grammarAccess.getSimpleAccess().getExpresion_derAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composicion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composicion__Group__0__Impl
	rule__Composicion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composicion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposicionAccess().getNexoAssignment_0()); }
	(rule__Composicion__NexoAssignment_0)
	{ after(grammarAccess.getComposicionAccess().getNexoAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composicion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composicion__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composicion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); }
	(rule__Composicion__ContenidoAssignment_1)
	{ after(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparacion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparacion__Group__0__Impl
	rule__Comparacion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparacion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparacionAccess().getObligacionAssignment_0()); }
	(rule__Comparacion__ObligacionAssignment_0)
	{ after(grammarAccess.getComparacionAccess().getObligacionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparacion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparacion__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparacion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); }
	(rule__Comparacion__OperacionAssignment_1)
	{ after(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Propiedad__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propiedad__Group__0__Impl
	rule__Propiedad__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Propiedad__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); }
		(rule__Propiedad__AtributoAssignment_0)
		{ after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); }
	)
	(
		{ before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); }
		(rule__Propiedad__AtributoAssignment_0)*
		{ after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propiedad__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propiedad__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Propiedad__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); }
	(rule__Propiedad__TerminoAssignment_1)
	{ after(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atributo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atributo__Group__0__Impl
	rule__Atributo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); }
	(rule__Atributo__DeterminanteAssignment_0)
	{ after(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atributo__Group__1__Impl
	rule__Atributo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtributoAccess().getPrefijoAssignment_1()); }
	(rule__Atributo__PrefijoAssignment_1)?
	{ after(grammarAccess.getAtributoAccess().getPrefijoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atributo__Group__2__Impl
	rule__Atributo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtributoAccess().getNombreAssignment_2()); }
	(rule__Atributo__NombreAssignment_2)
	{ after(grammarAccess.getAtributoAccess().getNombreAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atributo__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); }
	(rule__Atributo__EnlaceAssignment_3)
	{ after(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Termino__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Termino__Group__0__Impl
	rule__Termino__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Termino__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); }
	(rule__Termino__IndeterminanteAssignment_0)
	{ after(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Termino__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Termino__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Termino__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminoAccess().getContextoAssignment_1()); }
	(rule__Termino__ContextoAssignment_1)
	{ after(grammarAccess.getTerminoAccess().getContextoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Obligacion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Obligacion__Group__0__Impl
	rule__Obligacion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Obligacion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); }
	(rule__Obligacion__NegacionAssignment_0)?
	{ after(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Obligacion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Obligacion__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Obligacion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObligacionAccess().getObligacionAssignment_1()); }
	(rule__Obligacion__ObligacionAssignment_1)
	{ after(grammarAccess.getObligacionAccess().getObligacionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Documento__PathModeloAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDocumentoAccess().getPathModeloSTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getDocumentoAccess().getPathModeloSTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__PathOclAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDocumentoAccess().getPathOclSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDocumentoAccess().getPathOclSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Documento__OracionesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_2_0()); }
		ruleOracion
		{ after(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Oracion__ContenidoAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0()); }
		ruleContenido
		{ after(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contenido__SimpleAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0()); }
		ruleSimple
		{ after(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contenido__ComposicionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_1_0()); }
		ruleComposicion
		{ after(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Expresion_izqAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getExpresion_izqExpresionParserRuleCall_0_0()); }
		ruleExpresion
		{ after(grammarAccess.getSimpleAccess().getExpresion_izqExpresionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__ComparacionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getComparacionComparacionParserRuleCall_1_0()); }
		ruleComparacion
		{ after(grammarAccess.getSimpleAccess().getComparacionComparacionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Expresion_derAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getExpresion_derExpresionParserRuleCall_2_0()); }
		ruleExpresion
		{ after(grammarAccess.getSimpleAccess().getExpresion_derExpresionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composicion__NexoAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0()); }
		ruleNexo
		{ after(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composicion__ContenidoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposicionAccess().getContenidoContenidoParserRuleCall_1_0()); }
		ruleContenido
		{ after(grammarAccess.getComposicionAccess().getContenidoContenidoParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nexo__ValorAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNexoAccess().getValorAlternatives_0()); }
		(rule__Nexo__ValorAlternatives_0)
		{ after(grammarAccess.getNexoAccess().getValorAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__ExpresionAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); }
		(rule__Expresion__ExpresionAlternatives_0)
		{ after(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparacion__ObligacionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0()); }
		ruleObligacion
		{ after(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparacion__OperacionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparacionAccess().getOperacionOperacionParserRuleCall_1_0()); }
		ruleOperacion
		{ after(grammarAccess.getComparacionAccess().getOperacionOperacionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propiedad__AtributoAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0()); }
		ruleAtributo
		{ after(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propiedad__TerminoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropiedadAccess().getTerminoTerminoParserRuleCall_1_0()); }
		ruleTermino
		{ after(grammarAccess.getPropiedadAccess().getTerminoTerminoParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__DeterminanteAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); }
		(
			{ before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); }
			'el/la'
			{ after(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); }
		)
		{ after(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__PrefijoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); }
		(
			{ before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); }
			'cantidad de'
			{ after(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); }
		)
		{ after(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__NombreAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__EnlaceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); }
		(
			{ before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); }
			'de'
			{ after(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); }
		)
		{ after(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Termino__IndeterminanteAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); }
		(
			{ before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); }
			'un/una'
			{ after(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); }
		)
		{ after(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Termino__ContextoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminoAccess().getContextoIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTerminoAccess().getContextoIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Obligacion__NegacionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); }
		(
			{ before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); }
			'no'
			{ after(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); }
		)
		{ after(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Obligacion__ObligacionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); }
		(
			{ before(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); }
			'debe ser'
			{ after(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); }
		)
		{ after(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operacion__OperacionAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); }
		(rule__Operacion__OperacionAlternatives_0)
		{ after(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__ValorAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralAccess().getValorSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getLiteralAccess().getValorSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
