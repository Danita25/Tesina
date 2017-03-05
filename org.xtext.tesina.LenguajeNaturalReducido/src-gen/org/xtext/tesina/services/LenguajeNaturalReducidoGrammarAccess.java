/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LenguajeNaturalReducidoGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DocumentoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Documento");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEncabezadoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEncabezadoSTRINGTerminalRuleCall_0_0 = (RuleCall)cEncabezadoAssignment_0.eContents().get(0);
		private final RuleCall cFinOracionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cOracionesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOracionesOracionParserRuleCall_2_0 = (RuleCall)cOracionesAssignment_2.eContents().get(0);
		
		//Documento:
		//	encabezado=STRING FinOracion
		//	oraciones+=Oracion*
		//	//		extraStr = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//encabezado=STRING FinOracion oraciones+=Oracion*
		public Group getGroup() { return cGroup; }
		
		//encabezado=STRING
		public Assignment getEncabezadoAssignment_0() { return cEncabezadoAssignment_0; }
		
		//STRING
		public RuleCall getEncabezadoSTRINGTerminalRuleCall_0_0() { return cEncabezadoSTRINGTerminalRuleCall_0_0; }
		
		//FinOracion
		public RuleCall getFinOracionParserRuleCall_1() { return cFinOracionParserRuleCall_1; }
		
		//oraciones+=Oracion*
		public Assignment getOracionesAssignment_2() { return cOracionesAssignment_2; }
		
		//Oracion
		public RuleCall getOracionesOracionParserRuleCall_2_0() { return cOracionesOracionParserRuleCall_2_0; }
	}
	public class OracionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Oracion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cContenidoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cContenidoContenidoParserRuleCall_0_0 = (RuleCall)cContenidoAssignment_0.eContents().get(0);
		private final RuleCall cFinOracionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Oracion:
		//	contenido=Contenido FinOracion;
		@Override public ParserRule getRule() { return rule; }
		
		//contenido=Contenido FinOracion
		public Group getGroup() { return cGroup; }
		
		//contenido=Contenido
		public Assignment getContenidoAssignment_0() { return cContenidoAssignment_0; }
		
		//Contenido
		public RuleCall getContenidoContenidoParserRuleCall_0_0() { return cContenidoContenidoParserRuleCall_0_0; }
		
		//FinOracion
		public RuleCall getFinOracionParserRuleCall_1() { return cFinOracionParserRuleCall_1; }
	}
	public class FinOracionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.FinOracion");
		private final Keyword cFullStopControl000dControl000aKeyword = (Keyword)rule.eContents().get(1);
		
		//FinOracion:
		//	'.\r\n';
		@Override public ParserRule getRule() { return rule; }
		
		//'.\r\n'
		public Keyword getFullStopControl000dControl000aKeyword() { return cFullStopControl000dControl000aKeyword; }
	}
	public class ContenidoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Contenido");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrefijoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrefijoSiKeyword_0_0 = (Keyword)cPrefijoAssignment_0.eContents().get(0);
		private final Assignment cSimpleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSimpleSimpleParserRuleCall_1_0 = (RuleCall)cSimpleAssignment_1.eContents().get(0);
		private final Assignment cComposicionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cComposicionComposicionParserRuleCall_2_0 = (RuleCall)cComposicionAssignment_2.eContents().get(0);
		
		//Contenido:
		//	prefijo='si'? //para el implies
		//	simple=Simple
		//	composicion=Composicion?;
		@Override public ParserRule getRule() { return rule; }
		
		//prefijo='si'? //para el implies
		//simple=Simple composicion=Composicion?
		public Group getGroup() { return cGroup; }
		
		//prefijo='si'?
		public Assignment getPrefijoAssignment_0() { return cPrefijoAssignment_0; }
		
		//'si'
		public Keyword getPrefijoSiKeyword_0_0() { return cPrefijoSiKeyword_0_0; }
		
		////para el implies
		//simple=Simple
		public Assignment getSimpleAssignment_1() { return cSimpleAssignment_1; }
		
		//Simple
		public RuleCall getSimpleSimpleParserRuleCall_1_0() { return cSimpleSimpleParserRuleCall_1_0; }
		
		//composicion=Composicion?
		public Assignment getComposicionAssignment_2() { return cComposicionAssignment_2; }
		
		//Composicion
		public RuleCall getComposicionComposicionParserRuleCall_2_0() { return cComposicionComposicionParserRuleCall_2_0; }
	}
	public class SimpleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Simple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpresion_izqAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpresion_izqExpresionParserRuleCall_0_0 = (RuleCall)cExpresion_izqAssignment_0.eContents().get(0);
		private final Assignment cExpresion_derAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpresion_derExpresionDerechaParserRuleCall_1_0 = (RuleCall)cExpresion_derAssignment_1.eContents().get(0);
		
		//Simple:
		//	expresion_izq=Expresion
		//	expresion_der=ExpresionDerecha?;
		@Override public ParserRule getRule() { return rule; }
		
		//expresion_izq=Expresion expresion_der=ExpresionDerecha?
		public Group getGroup() { return cGroup; }
		
		//expresion_izq=Expresion
		public Assignment getExpresion_izqAssignment_0() { return cExpresion_izqAssignment_0; }
		
		//Expresion
		public RuleCall getExpresion_izqExpresionParserRuleCall_0_0() { return cExpresion_izqExpresionParserRuleCall_0_0; }
		
		//expresion_der=ExpresionDerecha?
		public Assignment getExpresion_derAssignment_1() { return cExpresion_derAssignment_1; }
		
		//ExpresionDerecha
		public RuleCall getExpresion_derExpresionDerechaParserRuleCall_1_0() { return cExpresion_derExpresionDerechaParserRuleCall_1_0; }
	}
	public class ExpresionDerechaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.ExpresionDerecha");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cComparacionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cComparacionComparacionParserRuleCall_0_0 = (RuleCall)cComparacionAssignment_0.eContents().get(0);
		private final Assignment cExpresionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpresionExpresionParserRuleCall_1_0 = (RuleCall)cExpresionAssignment_1.eContents().get(0);
		
		//ExpresionDerecha:
		//	comparacion=Comparacion
		//	expresion=Expresion;
		@Override public ParserRule getRule() { return rule; }
		
		//comparacion=Comparacion expresion=Expresion
		public Group getGroup() { return cGroup; }
		
		//comparacion=Comparacion
		public Assignment getComparacionAssignment_0() { return cComparacionAssignment_0; }
		
		//Comparacion
		public RuleCall getComparacionComparacionParserRuleCall_0_0() { return cComparacionComparacionParserRuleCall_0_0; }
		
		//expresion=Expresion
		public Assignment getExpresionAssignment_1() { return cExpresionAssignment_1; }
		
		//Expresion
		public RuleCall getExpresionExpresionParserRuleCall_1_0() { return cExpresionExpresionParserRuleCall_1_0; }
	}
	public class ComposicionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Composicion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNexoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNexoNexoParserRuleCall_0_0 = (RuleCall)cNexoAssignment_0.eContents().get(0);
		private final Assignment cContenidoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContenidoContenidoParserRuleCall_1_0 = (RuleCall)cContenidoAssignment_1.eContents().get(0);
		
		//Composicion:
		//	nexo=Nexo
		//	contenido=Contenido;
		@Override public ParserRule getRule() { return rule; }
		
		//nexo=Nexo contenido=Contenido
		public Group getGroup() { return cGroup; }
		
		//nexo=Nexo
		public Assignment getNexoAssignment_0() { return cNexoAssignment_0; }
		
		//Nexo
		public RuleCall getNexoNexoParserRuleCall_0_0() { return cNexoNexoParserRuleCall_0_0; }
		
		//contenido=Contenido
		public Assignment getContenidoAssignment_1() { return cContenidoAssignment_1; }
		
		//Contenido
		public RuleCall getContenidoContenidoParserRuleCall_1_0() { return cContenidoContenidoParserRuleCall_1_0; }
	}
	public class NexoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Nexo");
		private final Assignment cValorAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cValorAlternatives_0 = (Alternatives)cValorAssignment.eContents().get(0);
		private final Keyword cValorYKeyword_0_0 = (Keyword)cValorAlternatives_0.eContents().get(0);
		private final Keyword cValorOKeyword_0_1 = (Keyword)cValorAlternatives_0.eContents().get(1);
		private final Keyword cValorEntoncesKeyword_0_2 = (Keyword)cValorAlternatives_0.eContents().get(2);
		
		//Nexo:
		//	valor=('y' | 'o' | 'entonces');
		@Override public ParserRule getRule() { return rule; }
		
		//valor=('y' | 'o' | 'entonces')
		public Assignment getValorAssignment() { return cValorAssignment; }
		
		//('y' | 'o' | 'entonces')
		public Alternatives getValorAlternatives_0() { return cValorAlternatives_0; }
		
		//'y'
		public Keyword getValorYKeyword_0_0() { return cValorYKeyword_0_0; }
		
		//'o'
		public Keyword getValorOKeyword_0_1() { return cValorOKeyword_0_1; }
		
		//'entonces'
		public Keyword getValorEntoncesKeyword_0_2() { return cValorEntoncesKeyword_0_2; }
	}
	public class ExpresionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Expresion");
		private final Assignment cExpresionAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cExpresionAlternatives_0 = (Alternatives)cExpresionAssignment.eContents().get(0);
		private final RuleCall cExpresionLiteralParserRuleCall_0_0 = (RuleCall)cExpresionAlternatives_0.eContents().get(0);
		private final RuleCall cExpresionPropiedadParserRuleCall_0_1 = (RuleCall)cExpresionAlternatives_0.eContents().get(1);
		
		//Expresion:
		//	expresion=(Literal | Propiedad);
		@Override public ParserRule getRule() { return rule; }
		
		//expresion=(Literal | Propiedad)
		public Assignment getExpresionAssignment() { return cExpresionAssignment; }
		
		//(Literal | Propiedad)
		public Alternatives getExpresionAlternatives_0() { return cExpresionAlternatives_0; }
		
		//Literal
		public RuleCall getExpresionLiteralParserRuleCall_0_0() { return cExpresionLiteralParserRuleCall_0_0; }
		
		//Propiedad
		public RuleCall getExpresionPropiedadParserRuleCall_0_1() { return cExpresionPropiedadParserRuleCall_0_1; }
	}
	public class ComparacionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Comparacion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObligacionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObligacionObligacionParserRuleCall_0_0 = (RuleCall)cObligacionAssignment_0.eContents().get(0);
		private final Assignment cOperacionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperacionOperacionParserRuleCall_1_0 = (RuleCall)cOperacionAssignment_1.eContents().get(0);
		
		//Comparacion:
		//	obligacion=Obligacion
		//	operacion=Operacion;
		@Override public ParserRule getRule() { return rule; }
		
		//obligacion=Obligacion operacion=Operacion
		public Group getGroup() { return cGroup; }
		
		//obligacion=Obligacion
		public Assignment getObligacionAssignment_0() { return cObligacionAssignment_0; }
		
		//Obligacion
		public RuleCall getObligacionObligacionParserRuleCall_0_0() { return cObligacionObligacionParserRuleCall_0_0; }
		
		//operacion=Operacion
		public Assignment getOperacionAssignment_1() { return cOperacionAssignment_1; }
		
		//Operacion
		public RuleCall getOperacionOperacionParserRuleCall_1_0() { return cOperacionOperacionParserRuleCall_1_0; }
	}
	public class PropiedadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Propiedad");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAtributoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAtributoAtributoParserRuleCall_0_0 = (RuleCall)cAtributoAssignment_0.eContents().get(0);
		private final Assignment cTerminoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTerminoTerminoParserRuleCall_1_0 = (RuleCall)cTerminoAssignment_1.eContents().get(0);
		private final Assignment cIteracionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIteracionIteracionParserRuleCall_2_0 = (RuleCall)cIteracionAssignment_2.eContents().get(0);
		
		//Propiedad:
		//	atributo+=Atributo+
		//	termino=Termino?
		//	iteracion+=Iteracion* //coleccion
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//atributo+=Atributo+ termino=Termino? iteracion+=Iteracion*
		public Group getGroup() { return cGroup; }
		
		//atributo+=Atributo+
		public Assignment getAtributoAssignment_0() { return cAtributoAssignment_0; }
		
		//Atributo
		public RuleCall getAtributoAtributoParserRuleCall_0_0() { return cAtributoAtributoParserRuleCall_0_0; }
		
		//termino=Termino?
		public Assignment getTerminoAssignment_1() { return cTerminoAssignment_1; }
		
		//Termino
		public RuleCall getTerminoTerminoParserRuleCall_1_0() { return cTerminoTerminoParserRuleCall_1_0; }
		
		//iteracion+=Iteracion*
		public Assignment getIteracionAssignment_2() { return cIteracionAssignment_2; }
		
		//Iteracion
		public RuleCall getIteracionIteracionParserRuleCall_2_0() { return cIteracionIteracionParserRuleCall_2_0; }
	}
	public class IteracionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Iteracion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConectorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cConectorAlternatives_0_0 = (Alternatives)cConectorAssignment_0.eContents().get(0);
		private final Keyword cConectorTalQueKeyword_0_0_0 = (Keyword)cConectorAlternatives_0_0.eContents().get(0);
		private final Keyword cConectorSatisfacenQueKeyword_0_0_1 = (Keyword)cConectorAlternatives_0_0.eContents().get(1);
		private final Keyword cConectorExisteUnoTalQueKeyword_0_0_2 = (Keyword)cConectorAlternatives_0_0.eContents().get(2);
		private final Assignment cContenidoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContenidoContenidoParserRuleCall_1_0 = (RuleCall)cContenidoAssignment_1.eContents().get(0);
		
		//Iteracion:
		//	conector=('tal que' | 'satisfacen que' | 'existe uno tal que') contenido=Contenido;
		@Override public ParserRule getRule() { return rule; }
		
		//conector=('tal que' | 'satisfacen que' | 'existe uno tal que') contenido=Contenido
		public Group getGroup() { return cGroup; }
		
		//conector=('tal que' | 'satisfacen que' | 'existe uno tal que')
		public Assignment getConectorAssignment_0() { return cConectorAssignment_0; }
		
		//('tal que' | 'satisfacen que' | 'existe uno tal que')
		public Alternatives getConectorAlternatives_0_0() { return cConectorAlternatives_0_0; }
		
		//'tal que'
		public Keyword getConectorTalQueKeyword_0_0_0() { return cConectorTalQueKeyword_0_0_0; }
		
		//'satisfacen que'
		public Keyword getConectorSatisfacenQueKeyword_0_0_1() { return cConectorSatisfacenQueKeyword_0_0_1; }
		
		//'existe uno tal que'
		public Keyword getConectorExisteUnoTalQueKeyword_0_0_2() { return cConectorExisteUnoTalQueKeyword_0_0_2; }
		
		//contenido=Contenido
		public Assignment getContenidoAssignment_1() { return cContenidoAssignment_1; }
		
		//Contenido
		public RuleCall getContenidoContenidoParserRuleCall_1_0() { return cContenidoContenidoParserRuleCall_1_0; }
	}
	public class AtributoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Atributo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeterminanteAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cDeterminanteAlternatives_0_0 = (Alternatives)cDeterminanteAssignment_0.eContents().get(0);
		private final Keyword cDeterminanteElLaKeyword_0_0_0 = (Keyword)cDeterminanteAlternatives_0_0.eContents().get(0);
		private final Keyword cDeterminanteTodosLosLasKeyword_0_0_1 = (Keyword)cDeterminanteAlternatives_0_0.eContents().get(1);
		private final Keyword cDeterminanteExisteUnKeyword_0_0_2 = (Keyword)cDeterminanteAlternatives_0_0.eContents().get(2);
		private final Keyword cDeterminanteEntreLosKeyword_0_0_3 = (Keyword)cDeterminanteAlternatives_0_0.eContents().get(3);
		private final Assignment cPrefijoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrefijoCantidadDeKeyword_1_0 = (Keyword)cPrefijoAssignment_1.eContents().get(0);
		private final Assignment cNombreAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNombreIDTerminalRuleCall_2_0 = (RuleCall)cNombreAssignment_2.eContents().get(0);
		private final Assignment cEnlaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cEnlaceDeKeyword_3_0 = (Keyword)cEnlaceAssignment_3.eContents().get(0);
		
		//Atributo:
		//	determinante=('el/la' | 'todos los/las' | 'existe un' | 'entre los') prefijo='cantidad de'?
		//	nombre=ID
		//	enlace='de';
		@Override public ParserRule getRule() { return rule; }
		
		//determinante=('el/la' | 'todos los/las' | 'existe un' | 'entre los') prefijo='cantidad de'? nombre=ID enlace='de'
		public Group getGroup() { return cGroup; }
		
		//determinante=('el/la' | 'todos los/las' | 'existe un' | 'entre los')
		public Assignment getDeterminanteAssignment_0() { return cDeterminanteAssignment_0; }
		
		//('el/la' | 'todos los/las' | 'existe un' | 'entre los')
		public Alternatives getDeterminanteAlternatives_0_0() { return cDeterminanteAlternatives_0_0; }
		
		//'el/la'
		public Keyword getDeterminanteElLaKeyword_0_0_0() { return cDeterminanteElLaKeyword_0_0_0; }
		
		//'todos los/las'
		public Keyword getDeterminanteTodosLosLasKeyword_0_0_1() { return cDeterminanteTodosLosLasKeyword_0_0_1; }
		
		//'existe un'
		public Keyword getDeterminanteExisteUnKeyword_0_0_2() { return cDeterminanteExisteUnKeyword_0_0_2; }
		
		//'entre los'
		public Keyword getDeterminanteEntreLosKeyword_0_0_3() { return cDeterminanteEntreLosKeyword_0_0_3; }
		
		////Determinante
		//prefijo='cantidad de'?
		public Assignment getPrefijoAssignment_1() { return cPrefijoAssignment_1; }
		
		//'cantidad de'
		public Keyword getPrefijoCantidadDeKeyword_1_0() { return cPrefijoCantidadDeKeyword_1_0; }
		
		//nombre=ID
		public Assignment getNombreAssignment_2() { return cNombreAssignment_2; }
		
		//ID
		public RuleCall getNombreIDTerminalRuleCall_2_0() { return cNombreIDTerminalRuleCall_2_0; }
		
		//enlace='de'
		public Assignment getEnlaceAssignment_3() { return cEnlaceAssignment_3; }
		
		//'de'
		public Keyword getEnlaceDeKeyword_3_0() { return cEnlaceDeKeyword_3_0; }
	}
	public class TerminoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Termino");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIndeterminanteAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIndeterminanteUnUnaKeyword_0_0 = (Keyword)cIndeterminanteAssignment_0.eContents().get(0);
		private final Assignment cContextoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContextoIDTerminalRuleCall_1_0 = (RuleCall)cContextoAssignment_1.eContents().get(0);
		
		//Termino:
		//	indeterminante='un/una' //Indeterminante
		//	contexto=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//indeterminante='un/una' //Indeterminante
		//contexto=ID
		public Group getGroup() { return cGroup; }
		
		//indeterminante='un/una'
		public Assignment getIndeterminanteAssignment_0() { return cIndeterminanteAssignment_0; }
		
		//'un/una'
		public Keyword getIndeterminanteUnUnaKeyword_0_0() { return cIndeterminanteUnUnaKeyword_0_0; }
		
		////Indeterminante
		//contexto=ID
		public Assignment getContextoAssignment_1() { return cContextoAssignment_1; }
		
		//ID
		public RuleCall getContextoIDTerminalRuleCall_1_0() { return cContextoIDTerminalRuleCall_1_0; }
	}
	public class ObligacionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Obligacion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNegacionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNegacionNoKeyword_0_0 = (Keyword)cNegacionAssignment_0.eContents().get(0);
		private final Assignment cObligacionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cObligacionEsKeyword_1_0 = (Keyword)cObligacionAssignment_1.eContents().get(0);
		
		////Contexto
		//Obligacion:
		//	negacion='no'? obligacion='es';
		@Override public ParserRule getRule() { return rule; }
		
		//negacion='no'? obligacion='es'
		public Group getGroup() { return cGroup; }
		
		//negacion='no'?
		public Assignment getNegacionAssignment_0() { return cNegacionAssignment_0; }
		
		//'no'
		public Keyword getNegacionNoKeyword_0_0() { return cNegacionNoKeyword_0_0; }
		
		//obligacion='es'
		public Assignment getObligacionAssignment_1() { return cObligacionAssignment_1; }
		
		//'es'
		public Keyword getObligacionEsKeyword_1_0() { return cObligacionEsKeyword_1_0; }
	}
	public class OperacionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Operacion");
		private final Assignment cOperacionAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cOperacionAlternatives_0 = (Alternatives)cOperacionAssignment.eContents().get(0);
		private final Keyword cOperacionMayorQueKeyword_0_0 = (Keyword)cOperacionAlternatives_0.eContents().get(0);
		private final Keyword cOperacionMenorQueKeyword_0_1 = (Keyword)cOperacionAlternatives_0.eContents().get(1);
		private final Keyword cOperacionIgualAKeyword_0_2 = (Keyword)cOperacionAlternatives_0.eContents().get(2);
		private final Keyword cOperacionMayorOIgualAKeyword_0_3 = (Keyword)cOperacionAlternatives_0.eContents().get(3);
		private final Keyword cOperacionMenorOIgualAKeyword_0_4 = (Keyword)cOperacionAlternatives_0.eContents().get(4);
		private final Keyword cOperacionDistintoDeKeyword_0_5 = (Keyword)cOperacionAlternatives_0.eContents().get(5);
		
		//Operacion:
		//	operacion=('mayor que' | 'menor que' | 'igual a' | 'mayor o igual a' | 'menor o igual a' | 'distinto de');
		@Override public ParserRule getRule() { return rule; }
		
		//operacion=('mayor que' | 'menor que' | 'igual a' | 'mayor o igual a' | 'menor o igual a' | 'distinto de')
		public Assignment getOperacionAssignment() { return cOperacionAssignment; }
		
		//('mayor que' | 'menor que' | 'igual a' | 'mayor o igual a' | 'menor o igual a' | 'distinto de')
		public Alternatives getOperacionAlternatives_0() { return cOperacionAlternatives_0; }
		
		//'mayor que'
		public Keyword getOperacionMayorQueKeyword_0_0() { return cOperacionMayorQueKeyword_0_0; }
		
		//'menor que'
		public Keyword getOperacionMenorQueKeyword_0_1() { return cOperacionMenorQueKeyword_0_1; }
		
		//'igual a'
		public Keyword getOperacionIgualAKeyword_0_2() { return cOperacionIgualAKeyword_0_2; }
		
		//'mayor o igual a'
		public Keyword getOperacionMayorOIgualAKeyword_0_3() { return cOperacionMayorOIgualAKeyword_0_3; }
		
		//'menor o igual a'
		public Keyword getOperacionMenorOIgualAKeyword_0_4() { return cOperacionMenorOIgualAKeyword_0_4; }
		
		//'distinto de'
		public Keyword getOperacionDistintoDeKeyword_0_5() { return cOperacionDistintoDeKeyword_0_5; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tesina.LenguajeNaturalReducido.Literal");
		private final Assignment cValorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValorSTRINGTerminalRuleCall_0 = (RuleCall)cValorAssignment.eContents().get(0);
		
		//Literal:
		//	valor=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//valor=STRING
		public Assignment getValorAssignment() { return cValorAssignment; }
		
		//STRING
		public RuleCall getValorSTRINGTerminalRuleCall_0() { return cValorSTRINGTerminalRuleCall_0; }
	}
	
	
	private final DocumentoElements pDocumento;
	private final OracionElements pOracion;
	private final FinOracionElements pFinOracion;
	private final ContenidoElements pContenido;
	private final SimpleElements pSimple;
	private final ExpresionDerechaElements pExpresionDerecha;
	private final ComposicionElements pComposicion;
	private final NexoElements pNexo;
	private final ExpresionElements pExpresion;
	private final ComparacionElements pComparacion;
	private final PropiedadElements pPropiedad;
	private final IteracionElements pIteracion;
	private final AtributoElements pAtributo;
	private final TerminoElements pTermino;
	private final ObligacionElements pObligacion;
	private final OperacionElements pOperacion;
	private final LiteralElements pLiteral;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LenguajeNaturalReducidoGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDocumento = new DocumentoElements();
		this.pOracion = new OracionElements();
		this.pFinOracion = new FinOracionElements();
		this.pContenido = new ContenidoElements();
		this.pSimple = new SimpleElements();
		this.pExpresionDerecha = new ExpresionDerechaElements();
		this.pComposicion = new ComposicionElements();
		this.pNexo = new NexoElements();
		this.pExpresion = new ExpresionElements();
		this.pComparacion = new ComparacionElements();
		this.pPropiedad = new PropiedadElements();
		this.pIteracion = new IteracionElements();
		this.pAtributo = new AtributoElements();
		this.pTermino = new TerminoElements();
		this.pObligacion = new ObligacionElements();
		this.pOperacion = new OperacionElements();
		this.pLiteral = new LiteralElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.tesina.LenguajeNaturalReducido".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Documento:
	//	encabezado=STRING FinOracion
	//	oraciones+=Oracion*
	//	//		extraStr = STRING
	//;
	public DocumentoElements getDocumentoAccess() {
		return pDocumento;
	}
	
	public ParserRule getDocumentoRule() {
		return getDocumentoAccess().getRule();
	}
	
	//Oracion:
	//	contenido=Contenido FinOracion;
	public OracionElements getOracionAccess() {
		return pOracion;
	}
	
	public ParserRule getOracionRule() {
		return getOracionAccess().getRule();
	}
	
	//FinOracion:
	//	'.\r\n';
	public FinOracionElements getFinOracionAccess() {
		return pFinOracion;
	}
	
	public ParserRule getFinOracionRule() {
		return getFinOracionAccess().getRule();
	}
	
	//Contenido:
	//	prefijo='si'? //para el implies
	//	simple=Simple
	//	composicion=Composicion?;
	public ContenidoElements getContenidoAccess() {
		return pContenido;
	}
	
	public ParserRule getContenidoRule() {
		return getContenidoAccess().getRule();
	}
	
	//Simple:
	//	expresion_izq=Expresion
	//	expresion_der=ExpresionDerecha?;
	public SimpleElements getSimpleAccess() {
		return pSimple;
	}
	
	public ParserRule getSimpleRule() {
		return getSimpleAccess().getRule();
	}
	
	//ExpresionDerecha:
	//	comparacion=Comparacion
	//	expresion=Expresion;
	public ExpresionDerechaElements getExpresionDerechaAccess() {
		return pExpresionDerecha;
	}
	
	public ParserRule getExpresionDerechaRule() {
		return getExpresionDerechaAccess().getRule();
	}
	
	//Composicion:
	//	nexo=Nexo
	//	contenido=Contenido;
	public ComposicionElements getComposicionAccess() {
		return pComposicion;
	}
	
	public ParserRule getComposicionRule() {
		return getComposicionAccess().getRule();
	}
	
	//Nexo:
	//	valor=('y' | 'o' | 'entonces');
	public NexoElements getNexoAccess() {
		return pNexo;
	}
	
	public ParserRule getNexoRule() {
		return getNexoAccess().getRule();
	}
	
	//Expresion:
	//	expresion=(Literal | Propiedad);
	public ExpresionElements getExpresionAccess() {
		return pExpresion;
	}
	
	public ParserRule getExpresionRule() {
		return getExpresionAccess().getRule();
	}
	
	//Comparacion:
	//	obligacion=Obligacion
	//	operacion=Operacion;
	public ComparacionElements getComparacionAccess() {
		return pComparacion;
	}
	
	public ParserRule getComparacionRule() {
		return getComparacionAccess().getRule();
	}
	
	//Propiedad:
	//	atributo+=Atributo+
	//	termino=Termino?
	//	iteracion+=Iteracion* //coleccion
	//;
	public PropiedadElements getPropiedadAccess() {
		return pPropiedad;
	}
	
	public ParserRule getPropiedadRule() {
		return getPropiedadAccess().getRule();
	}
	
	//Iteracion:
	//	conector=('tal que' | 'satisfacen que' | 'existe uno tal que') contenido=Contenido;
	public IteracionElements getIteracionAccess() {
		return pIteracion;
	}
	
	public ParserRule getIteracionRule() {
		return getIteracionAccess().getRule();
	}
	
	//Atributo:
	//	determinante=('el/la' | 'todos los/las' | 'existe un' | 'entre los') prefijo='cantidad de'?
	//	nombre=ID
	//	enlace='de';
	public AtributoElements getAtributoAccess() {
		return pAtributo;
	}
	
	public ParserRule getAtributoRule() {
		return getAtributoAccess().getRule();
	}
	
	//Termino:
	//	indeterminante='un/una' //Indeterminante
	//	contexto=ID;
	public TerminoElements getTerminoAccess() {
		return pTermino;
	}
	
	public ParserRule getTerminoRule() {
		return getTerminoAccess().getRule();
	}
	
	////Contexto
	//Obligacion:
	//	negacion='no'? obligacion='es';
	public ObligacionElements getObligacionAccess() {
		return pObligacion;
	}
	
	public ParserRule getObligacionRule() {
		return getObligacionAccess().getRule();
	}
	
	//Operacion:
	//	operacion=('mayor que' | 'menor que' | 'igual a' | 'mayor o igual a' | 'menor o igual a' | 'distinto de');
	public OperacionElements getOperacionAccess() {
		return pOperacion;
	}
	
	public ParserRule getOperacionRule() {
		return getOperacionAccess().getRule();
	}
	
	//Literal:
	//	valor=STRING;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
