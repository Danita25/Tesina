/*
 * generated by Xtext 2.10.0
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

// Entry rule entryRuleGramatica
entryRuleGramatica
:
{ before(grammarAccess.getGramaticaRule()); }
	 ruleGramatica
{ after(grammarAccess.getGramaticaRule()); } 
	 EOF 
;

// Rule Gramatica
ruleGramatica 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGramaticaAccess().getOracionesAssignment()); }
		(rule__Gramatica__OracionesAssignment)*
		{ after(grammarAccess.getGramaticaAccess().getOracionesAssignment()); }
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
		{ before(grammarAccess.getOracionAccess().getAlternatives()); }
		(rule__Oracion__Alternatives)
		{ after(grammarAccess.getOracionAccess().getAlternatives()); }
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

// Entry rule entryRuleCompleja
entryRuleCompleja
:
{ before(grammarAccess.getComplejaRule()); }
	 ruleCompleja
{ after(grammarAccess.getComplejaRule()); } 
	 EOF 
;

// Rule Compleja
ruleCompleja 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComplejaAccess().getGroup()); }
		(rule__Compleja__Group__0)
		{ after(grammarAccess.getComplejaAccess().getGroup()); }
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

// Entry rule entryRuleClase
entryRuleClase
:
{ before(grammarAccess.getClaseRule()); }
	 ruleClase
{ after(grammarAccess.getClaseRule()); } 
	 EOF 
;

// Rule Clase
ruleClase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClaseAccess().getNameAssignment()); }
		(rule__Clase__NameAssignment)
		{ after(grammarAccess.getClaseAccess().getNameAssignment()); }
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
		{ before(grammarAccess.getLiteralAccess().getAlternatives()); }
		(rule__Literal__Alternatives)
		{ after(grammarAccess.getLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Oracion__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOracionAccess().getSimpleParserRuleCall_0()); }
		ruleSimple
		{ after(grammarAccess.getOracionAccess().getSimpleParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOracionAccess().getComplejaParserRuleCall_1()); }
		ruleCompleja
		{ after(grammarAccess.getOracionAccess().getComplejaParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getElLaKeyword_0_0()); }
		'El/La'
		{ after(grammarAccess.getSimpleAccess().getElLaKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getLosLasKeyword_0_1()); }
		'Los/Las'
		{ after(grammarAccess.getSimpleAccess().getLosLasKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Alternatives_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getSerKeyword_7_0()); }
		'ser'
		{ after(grammarAccess.getSimpleAccess().getSerKeyword_7_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getEstarKeyword_7_1()); }
		'estar'
		{ after(grammarAccess.getSimpleAccess().getEstarKeyword_7_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Alternatives_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getMayorQueKeyword_8_0()); }
		'mayor que'
		{ after(grammarAccess.getSimpleAccess().getMayorQueKeyword_8_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getMenorQueKeyword_8_1()); }
		'menor que'
		{ after(grammarAccess.getSimpleAccess().getMenorQueKeyword_8_1()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getIgualAKeyword_8_2()); }
		'igual a'
		{ after(grammarAccess.getSimpleAccess().getIgualAKeyword_8_2()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getMayorOIgualAKeyword_8_3()); }
		'mayor o igual a'
		{ after(grammarAccess.getSimpleAccess().getMayorOIgualAKeyword_8_3()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getMenorOIgualAKeyword_8_4()); }
		'menor o igual a'
		{ after(grammarAccess.getSimpleAccess().getMenorOIgualAKeyword_8_4()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getDistintoDeKeyword_8_5()); }
		'distinto de'
		{ after(grammarAccess.getSimpleAccess().getDistintoDeKeyword_8_5()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlMenosKeyword_8_6()); }
		'al menos'
		{ after(grammarAccess.getSimpleAccess().getAlMenosKeyword_8_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Alternatives_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getLiteralAssignment_9_0()); }
		(rule__Simple__LiteralAssignment_9_0)
		{ after(grammarAccess.getSimpleAccess().getLiteralAssignment_9_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAtributoAssignment_9_1()); }
		(rule__Simple__AtributoAssignment_9_1)
		{ after(grammarAccess.getSimpleAccess().getAtributoAssignment_9_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Alternatives_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getSeleccionamosKeyword_7_0()); }
		'seleccionamos'
		{ after(grammarAccess.getComplejaAccess().getSeleccionamosKeyword_7_0()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getParaTodosKeyword_7_1()); }
		'para todos'
		{ after(grammarAccess.getComplejaAccess().getParaTodosKeyword_7_1()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getExisteKeyword_7_2()); }
		'existe'
		{ after(grammarAccess.getComplejaAccess().getExisteKeyword_7_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Alternatives_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getMayorQueKeyword_12_0()); }
		'mayor que'
		{ after(grammarAccess.getComplejaAccess().getMayorQueKeyword_12_0()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getMenorQueKeyword_12_1()); }
		'menor que'
		{ after(grammarAccess.getComplejaAccess().getMenorQueKeyword_12_1()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getIgualAKeyword_12_2()); }
		'igual a'
		{ after(grammarAccess.getComplejaAccess().getIgualAKeyword_12_2()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_12_3()); }
		'mayor o igual a'
		{ after(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_12_3()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_12_4()); }
		'menor o igual a'
		{ after(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_12_4()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getDistintoDeKeyword_12_5()); }
		'distinto de'
		{ after(grammarAccess.getComplejaAccess().getDistintoDeKeyword_12_5()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getAlMenosKeyword_12_6()); }
		'al menos'
		{ after(grammarAccess.getComplejaAccess().getAlMenosKeyword_12_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Alternatives_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getLiteralAssignment_13_0()); }
		(rule__Compleja__LiteralAssignment_13_0)
		{ after(grammarAccess.getComplejaAccess().getLiteralAssignment_13_0()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoAssignment_13_1()); }
		(rule__Compleja__AtributoAssignment_13_1)
		{ after(grammarAccess.getComplejaAccess().getAtributoAssignment_13_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Alternatives_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getEsNoVacioKeyword_16_0()); }
		'es no vacio'
		{ after(grammarAccess.getComplejaAccess().getEsNoVacioKeyword_16_0()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getEsVacioTamanioKeyword_16_1()); }
		'es vacio | tamanio'
		{ after(grammarAccess.getComplejaAccess().getEsVacioTamanioKeyword_16_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Alternatives_17_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getMayorQueKeyword_17_0_0()); }
		'mayor que'
		{ after(grammarAccess.getComplejaAccess().getMayorQueKeyword_17_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getMenorQueKeyword_17_0_1()); }
		'menor que'
		{ after(grammarAccess.getComplejaAccess().getMenorQueKeyword_17_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getIgualAKeyword_17_0_2()); }
		'igual a'
		{ after(grammarAccess.getComplejaAccess().getIgualAKeyword_17_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_17_0_3()); }
		'mayor o igual a'
		{ after(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_17_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_17_0_4()); }
		'menor o igual a'
		{ after(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_17_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getDistintoDeKeyword_17_0_5()); }
		'distinto de'
		{ after(grammarAccess.getComplejaAccess().getDistintoDeKeyword_17_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getAlMenosKeyword_17_0_6()); }
		'al menos'
		{ after(grammarAccess.getComplejaAccess().getAlMenosKeyword_17_0_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Alternatives_17_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getLiteralAssignment_17_1_0()); }
		(rule__Compleja__LiteralAssignment_17_1_0)
		{ after(grammarAccess.getComplejaAccess().getLiteralAssignment_17_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoAssignment_17_1_1()); }
		(rule__Compleja__AtributoAssignment_17_1_1)
		{ after(grammarAccess.getComplejaAccess().getAtributoAssignment_17_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); }
		RULE_STRING
		{ after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); }
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
	{ before(grammarAccess.getSimpleAccess().getAlternatives_0()); }
	(rule__Simple__Alternatives_0)
	{ after(grammarAccess.getSimpleAccess().getAlternatives_0()); }
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
	{ before(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); }
	(rule__Simple__AtributoAssignment_1)
	{ after(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); }
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
	rule__Simple__Group__3
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
	{ before(grammarAccess.getSimpleAccess().getDeKeyword_2()); }
	'de'
	{ after(grammarAccess.getSimpleAccess().getDeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__3__Impl
	rule__Simple__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getUnUnaKeyword_3()); }
	'un/una'
	{ after(grammarAccess.getSimpleAccess().getUnUnaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__4__Impl
	rule__Simple__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getContextoAssignment_4()); }
	(rule__Simple__ContextoAssignment_4)
	{ after(grammarAccess.getSimpleAccess().getContextoAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__5__Impl
	rule__Simple__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getNoKeyword_5()); }
	('no')?
	{ after(grammarAccess.getSimpleAccess().getNoKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__6__Impl
	rule__Simple__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getDebeKeyword_6()); }
	'debe'
	{ after(grammarAccess.getSimpleAccess().getDebeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__7__Impl
	rule__Simple__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getAlternatives_7()); }
	(rule__Simple__Alternatives_7)
	{ after(grammarAccess.getSimpleAccess().getAlternatives_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__8__Impl
	rule__Simple__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getAlternatives_8()); }
	(rule__Simple__Alternatives_8)?
	{ after(grammarAccess.getSimpleAccess().getAlternatives_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__9__Impl
	rule__Simple__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getAlternatives_9()); }
	(rule__Simple__Alternatives_9)
	{ after(grammarAccess.getSimpleAccess().getAlternatives_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getFullStopKeyword_10()); }
	'.'
	{ after(grammarAccess.getSimpleAccess().getFullStopKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compleja__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__0__Impl
	rule__Compleja__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getParaTodosAsKeyword_0()); }
	'Para todos/as'
	{ after(grammarAccess.getComplejaAccess().getParaTodosAsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__1__Impl
	rule__Compleja__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAtributoAssignment_1()); }
	(rule__Compleja__AtributoAssignment_1)
	{ after(grammarAccess.getComplejaAccess().getAtributoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__2__Impl
	rule__Compleja__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getDeKeyword_2()); }
	'de'
	{ after(grammarAccess.getComplejaAccess().getDeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__3__Impl
	rule__Compleja__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getUnUnaKeyword_3()); }
	'un/una'
	{ after(grammarAccess.getComplejaAccess().getUnUnaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__4__Impl
	rule__Compleja__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getContextoAssignment_4()); }
	(rule__Compleja__ContextoAssignment_4)
	{ after(grammarAccess.getComplejaAccess().getContextoAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__5__Impl
	rule__Compleja__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getTalQueKeyword_5()); }
	'tal que'
	{ after(grammarAccess.getComplejaAccess().getTalQueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__6__Impl
	rule__Compleja__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getLeftParenthesisKeyword_6()); }
	'('
	{ after(grammarAccess.getComplejaAccess().getLeftParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__7__Impl
	rule__Compleja__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAlternatives_7()); }
	(rule__Compleja__Alternatives_7)
	{ after(grammarAccess.getComplejaAccess().getAlternatives_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__8__Impl
	rule__Compleja__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getLosLasKeyword_8()); }
	'Los/Las'
	{ after(grammarAccess.getComplejaAccess().getLosLasKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__9__Impl
	rule__Compleja__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAtributoAssignment_9()); }
	(rule__Compleja__AtributoAssignment_9)
	{ after(grammarAccess.getComplejaAccess().getAtributoAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__10__Impl
	rule__Compleja__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getDondeKeyword_10()); }
	'donde'
	{ after(grammarAccess.getComplejaAccess().getDondeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__11__Impl
	rule__Compleja__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAtributoAssignment_11()); }
	(rule__Compleja__AtributoAssignment_11)
	{ after(grammarAccess.getComplejaAccess().getAtributoAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__12__Impl
	rule__Compleja__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAlternatives_12()); }
	(rule__Compleja__Alternatives_12)
	{ after(grammarAccess.getComplejaAccess().getAlternatives_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__13__Impl
	rule__Compleja__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAlternatives_13()); }
	(rule__Compleja__Alternatives_13)
	{ after(grammarAccess.getComplejaAccess().getAlternatives_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__14__Impl
	rule__Compleja__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getRightParenthesisKeyword_14()); }
	')'
	{ after(grammarAccess.getComplejaAccess().getRightParenthesisKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__15__Impl
	rule__Compleja__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getTalQueKeyword_15()); }
	'tal que'
	{ after(grammarAccess.getComplejaAccess().getTalQueKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__16__Impl
	rule__Compleja__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAlternatives_16()); }
	(rule__Compleja__Alternatives_16)
	{ after(grammarAccess.getComplejaAccess().getAlternatives_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__17__Impl
	rule__Compleja__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getGroup_17()); }
	(rule__Compleja__Group_17__0)?
	{ after(grammarAccess.getComplejaAccess().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getFullStopKeyword_18()); }
	'.'
	{ after(grammarAccess.getComplejaAccess().getFullStopKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compleja__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group_17__0__Impl
	rule__Compleja__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAlternatives_17_0()); }
	(rule__Compleja__Alternatives_17_0)
	{ after(grammarAccess.getComplejaAccess().getAlternatives_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compleja__Group_17__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComplejaAccess().getAlternatives_17_1()); }
	(rule__Compleja__Alternatives_17_1)
	{ after(grammarAccess.getComplejaAccess().getAlternatives_17_1()); }
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
	{ before(grammarAccess.getAtributoAccess().getColeccionDeKeyword_0()); }
	('Coleccion de')?
	{ after(grammarAccess.getAtributoAccess().getColeccionDeKeyword_0()); }
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
	{ before(grammarAccess.getAtributoAccess().getNameAssignment_1()); }
	(rule__Atributo__NameAssignment_1)
	{ after(grammarAccess.getAtributoAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Gramatica__OracionesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGramaticaAccess().getOracionesOracionParserRuleCall_0()); }
		ruleOracion
		{ after(grammarAccess.getGramaticaAccess().getOracionesOracionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__AtributoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0()); }
		ruleAtributo
		{ after(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__ContextoAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_4_0()); }
		ruleClase
		{ after(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__LiteralAssignment_9_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_9_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_9_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__AtributoAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_9_1_0()); }
		ruleAtributo
		{ after(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__AtributoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_1_0()); }
		ruleClase
		{ after(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__ContextoAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_4_0()); }
		ruleClase
		{ after(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__AtributoAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_9_0()); }
		ruleClase
		{ after(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__AtributoAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_11_0()); }
		ruleAtributo
		{ after(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__LiteralAssignment_13_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_13_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_13_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__AtributoAssignment_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_13_1_0()); }
		ruleAtributo
		{ after(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__LiteralAssignment_17_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_17_1_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_17_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compleja__AtributoAssignment_17_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_17_1_1_0()); }
		ruleAtributo
		{ after(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_17_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atributo__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clase__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_0()); }
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