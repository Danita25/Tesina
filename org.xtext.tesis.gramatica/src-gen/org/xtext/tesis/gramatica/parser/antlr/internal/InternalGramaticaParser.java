package org.xtext.tesis.gramatica.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tesis.gramatica.services.GramaticaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGramaticaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'El/La'", "'Los/Las'", "'Para todos/as Los/Las'", "'de un/una'", "'debe ser'", "'debe estar'", "'no'", "'implica'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'.'", "'Compuesta'", "'y'", "'o'", "'tal que'", "'donde'", "'seleccionamos'", "'para todos'", "'existe'", "'es no vacio'", "'es vacio'", "'tamanio'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGramaticaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGramaticaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGramaticaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGramatica.g"; }



     	private GramaticaGrammarAccess grammarAccess;

        public InternalGramaticaParser(TokenStream input, GramaticaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Documento";
       	}

       	@Override
       	protected GramaticaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocumento"
    // InternalGramatica.g:64:1: entryRuleDocumento returns [EObject current=null] : iv_ruleDocumento= ruleDocumento EOF ;
    public final EObject entryRuleDocumento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumento = null;


        try {
            // InternalGramatica.g:64:50: (iv_ruleDocumento= ruleDocumento EOF )
            // InternalGramatica.g:65:2: iv_ruleDocumento= ruleDocumento EOF
            {
             newCompositeNode(grammarAccess.getDocumentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumento=ruleDocumento();

            state._fsp--;

             current =iv_ruleDocumento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumento"


    // $ANTLR start "ruleDocumento"
    // InternalGramatica.g:71:1: ruleDocumento returns [EObject current=null] : ( ( (lv_pathModelo_0_0= RULE_STRING ) ) ( (lv_pathOcl_1_0= RULE_STRING ) ) ( (lv_oraciones_2_0= ruleOracion ) )* ) ;
    public final EObject ruleDocumento() throws RecognitionException {
        EObject current = null;

        Token lv_pathModelo_0_0=null;
        Token lv_pathOcl_1_0=null;
        EObject lv_oraciones_2_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:77:2: ( ( ( (lv_pathModelo_0_0= RULE_STRING ) ) ( (lv_pathOcl_1_0= RULE_STRING ) ) ( (lv_oraciones_2_0= ruleOracion ) )* ) )
            // InternalGramatica.g:78:2: ( ( (lv_pathModelo_0_0= RULE_STRING ) ) ( (lv_pathOcl_1_0= RULE_STRING ) ) ( (lv_oraciones_2_0= ruleOracion ) )* )
            {
            // InternalGramatica.g:78:2: ( ( (lv_pathModelo_0_0= RULE_STRING ) ) ( (lv_pathOcl_1_0= RULE_STRING ) ) ( (lv_oraciones_2_0= ruleOracion ) )* )
            // InternalGramatica.g:79:3: ( (lv_pathModelo_0_0= RULE_STRING ) ) ( (lv_pathOcl_1_0= RULE_STRING ) ) ( (lv_oraciones_2_0= ruleOracion ) )*
            {
            // InternalGramatica.g:79:3: ( (lv_pathModelo_0_0= RULE_STRING ) )
            // InternalGramatica.g:80:4: (lv_pathModelo_0_0= RULE_STRING )
            {
            // InternalGramatica.g:80:4: (lv_pathModelo_0_0= RULE_STRING )
            // InternalGramatica.g:81:5: lv_pathModelo_0_0= RULE_STRING
            {
            lv_pathModelo_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_pathModelo_0_0, grammarAccess.getDocumentoAccess().getPathModeloSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pathModelo",
            						lv_pathModelo_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGramatica.g:97:3: ( (lv_pathOcl_1_0= RULE_STRING ) )
            // InternalGramatica.g:98:4: (lv_pathOcl_1_0= RULE_STRING )
            {
            // InternalGramatica.g:98:4: (lv_pathOcl_1_0= RULE_STRING )
            // InternalGramatica.g:99:5: lv_pathOcl_1_0= RULE_STRING
            {
            lv_pathOcl_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_pathOcl_1_0, grammarAccess.getDocumentoAccess().getPathOclSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pathOcl",
            						lv_pathOcl_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGramatica.g:115:3: ( (lv_oraciones_2_0= ruleOracion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:116:4: (lv_oraciones_2_0= ruleOracion )
            	    {
            	    // InternalGramatica.g:116:4: (lv_oraciones_2_0= ruleOracion )
            	    // InternalGramatica.g:117:5: lv_oraciones_2_0= ruleOracion
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_oraciones_2_0=ruleOracion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"oraciones",
            	    						lv_oraciones_2_0,
            	    						"org.xtext.tesis.gramatica.Gramatica.Oracion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumento"


    // $ANTLR start "entryRuleOracion"
    // InternalGramatica.g:138:1: entryRuleOracion returns [EObject current=null] : iv_ruleOracion= ruleOracion EOF ;
    public final EObject entryRuleOracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracion = null;


        try {
            // InternalGramatica.g:138:48: (iv_ruleOracion= ruleOracion EOF )
            // InternalGramatica.g:139:2: iv_ruleOracion= ruleOracion EOF
            {
             newCompositeNode(grammarAccess.getOracionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOracion=ruleOracion();

            state._fsp--;

             current =iv_ruleOracion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOracion"


    // $ANTLR start "ruleOracion"
    // InternalGramatica.g:145:1: ruleOracion returns [EObject current=null] : ( ( (lv_contenido_0_0= ruleSimple ) ) | ( (lv_contenido_1_0= ruleCompuesta ) ) | ( (lv_contenido_2_0= ruleCompleja ) ) ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject lv_contenido_0_0 = null;

        EObject lv_contenido_1_0 = null;

        EObject lv_contenido_2_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:151:2: ( ( ( (lv_contenido_0_0= ruleSimple ) ) | ( (lv_contenido_1_0= ruleCompuesta ) ) | ( (lv_contenido_2_0= ruleCompleja ) ) ) )
            // InternalGramatica.g:152:2: ( ( (lv_contenido_0_0= ruleSimple ) ) | ( (lv_contenido_1_0= ruleCompuesta ) ) | ( (lv_contenido_2_0= ruleCompleja ) ) )
            {
            // InternalGramatica.g:152:2: ( ( (lv_contenido_0_0= ruleSimple ) ) | ( (lv_contenido_1_0= ruleCompuesta ) ) | ( (lv_contenido_2_0= ruleCompleja ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:153:3: ( (lv_contenido_0_0= ruleSimple ) )
                    {
                    // InternalGramatica.g:153:3: ( (lv_contenido_0_0= ruleSimple ) )
                    // InternalGramatica.g:154:4: (lv_contenido_0_0= ruleSimple )
                    {
                    // InternalGramatica.g:154:4: (lv_contenido_0_0= ruleSimple )
                    // InternalGramatica.g:155:5: lv_contenido_0_0= ruleSimple
                    {

                    					newCompositeNode(grammarAccess.getOracionAccess().getContenidoSimpleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_contenido_0_0=ruleSimple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOracionRule());
                    					}
                    					set(
                    						current,
                    						"contenido",
                    						lv_contenido_0_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Simple");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:173:3: ( (lv_contenido_1_0= ruleCompuesta ) )
                    {
                    // InternalGramatica.g:173:3: ( (lv_contenido_1_0= ruleCompuesta ) )
                    // InternalGramatica.g:174:4: (lv_contenido_1_0= ruleCompuesta )
                    {
                    // InternalGramatica.g:174:4: (lv_contenido_1_0= ruleCompuesta )
                    // InternalGramatica.g:175:5: lv_contenido_1_0= ruleCompuesta
                    {

                    					newCompositeNode(grammarAccess.getOracionAccess().getContenidoCompuestaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_contenido_1_0=ruleCompuesta();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOracionRule());
                    					}
                    					set(
                    						current,
                    						"contenido",
                    						lv_contenido_1_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Compuesta");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:193:3: ( (lv_contenido_2_0= ruleCompleja ) )
                    {
                    // InternalGramatica.g:193:3: ( (lv_contenido_2_0= ruleCompleja ) )
                    // InternalGramatica.g:194:4: (lv_contenido_2_0= ruleCompleja )
                    {
                    // InternalGramatica.g:194:4: (lv_contenido_2_0= ruleCompleja )
                    // InternalGramatica.g:195:5: lv_contenido_2_0= ruleCompleja
                    {

                    					newCompositeNode(grammarAccess.getOracionAccess().getContenidoComplejaParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_contenido_2_0=ruleCompleja();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOracionRule());
                    					}
                    					set(
                    						current,
                    						"contenido",
                    						lv_contenido_2_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Compleja");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOracion"


    // $ANTLR start "entryRuleSimple"
    // InternalGramatica.g:216:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:216:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:217:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalGramatica.g:223:1: ruleSimple returns [EObject current=null] : ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        EObject lv_determinante_0_0 = null;

        EObject lv_atributo_1_0 = null;

        EObject lv_Sintagma_2_0 = null;

        EObject lv_contexto_3_0 = null;

        EObject lv_obligacion_4_0 = null;

        EObject lv_operacion_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_6_0 = null;

        EObject lv_atributo_7_0 = null;

        AntlrDatatypeRuleToken lv_finOracion_8_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:229:2: ( ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? ) )
            // InternalGramatica.g:230:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? )
            {
            // InternalGramatica.g:230:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? )
            // InternalGramatica.g:231:3: ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )?
            {
            // InternalGramatica.g:231:3: ( (lv_determinante_0_0= ruleDeterminante ) )
            // InternalGramatica.g:232:4: (lv_determinante_0_0= ruleDeterminante )
            {
            // InternalGramatica.g:232:4: (lv_determinante_0_0= ruleDeterminante )
            // InternalGramatica.g:233:5: lv_determinante_0_0= ruleDeterminante
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getDeterminanteDeterminanteParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_determinante_0_0=ruleDeterminante();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"determinante",
            						lv_determinante_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Determinante");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:250:3: ( (lv_atributo_1_0= ruleAtributo ) )
            // InternalGramatica.g:251:4: (lv_atributo_1_0= ruleAtributo )
            {
            // InternalGramatica.g:251:4: (lv_atributo_1_0= ruleAtributo )
            // InternalGramatica.g:252:5: lv_atributo_1_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_atributo_1_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"atributo",
            						lv_atributo_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:269:3: ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) )
            // InternalGramatica.g:270:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:270:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            // InternalGramatica.g:271:5: lv_Sintagma_2_0= ruleSintagmaPreposicional
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_Sintagma_2_0=ruleSintagmaPreposicional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"Sintagma",
            						lv_Sintagma_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.SintagmaPreposicional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:288:3: ( (lv_contexto_3_0= ruleClase ) )
            // InternalGramatica.g:289:4: (lv_contexto_3_0= ruleClase )
            {
            // InternalGramatica.g:289:4: (lv_contexto_3_0= ruleClase )
            // InternalGramatica.g:290:5: lv_contexto_3_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_contexto_3_0=ruleClase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"contexto",
            						lv_contexto_3_0,
            						"org.xtext.tesis.gramatica.Gramatica.Clase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:307:3: ( (lv_obligacion_4_0= ruleObligacion ) )
            // InternalGramatica.g:308:4: (lv_obligacion_4_0= ruleObligacion )
            {
            // InternalGramatica.g:308:4: (lv_obligacion_4_0= ruleObligacion )
            // InternalGramatica.g:309:5: lv_obligacion_4_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_obligacion_4_0=ruleObligacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"obligacion",
            						lv_obligacion_4_0,
            						"org.xtext.tesis.gramatica.Gramatica.Obligacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:326:3: ( (lv_operacion_5_0= ruleOperacion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=25)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:327:4: (lv_operacion_5_0= ruleOperacion )
                    {
                    // InternalGramatica.g:327:4: (lv_operacion_5_0= ruleOperacion )
                    // InternalGramatica.g:328:5: lv_operacion_5_0= ruleOperacion
                    {

                    					newCompositeNode(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_operacion_5_0=ruleOperacion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleRule());
                    					}
                    					set(
                    						current,
                    						"operacion",
                    						lv_operacion_5_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Operacion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:345:3: ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:346:4: ( (lv_literal_6_0= ruleLiteral ) )
                    {
                    // InternalGramatica.g:346:4: ( (lv_literal_6_0= ruleLiteral ) )
                    // InternalGramatica.g:347:5: (lv_literal_6_0= ruleLiteral )
                    {
                    // InternalGramatica.g:347:5: (lv_literal_6_0= ruleLiteral )
                    // InternalGramatica.g:348:6: lv_literal_6_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_literal_6_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_6_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:366:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    {
                    // InternalGramatica.g:366:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    // InternalGramatica.g:367:5: (lv_atributo_7_0= ruleAtributo )
                    {
                    // InternalGramatica.g:367:5: (lv_atributo_7_0= ruleAtributo )
                    // InternalGramatica.g:368:6: lv_atributo_7_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_atributo_7_0=ruleAtributo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"atributo",
                    							lv_atributo_7_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Atributo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGramatica.g:386:3: ( (lv_finOracion_8_0= ruleFinOracion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:387:4: (lv_finOracion_8_0= ruleFinOracion )
                    {
                    // InternalGramatica.g:387:4: (lv_finOracion_8_0= ruleFinOracion )
                    // InternalGramatica.g:388:5: lv_finOracion_8_0= ruleFinOracion
                    {

                    					newCompositeNode(grammarAccess.getSimpleAccess().getFinOracionFinOracionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_finOracion_8_0=ruleFinOracion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleRule());
                    					}
                    					set(
                    						current,
                    						"finOracion",
                    						lv_finOracion_8_0,
                    						"org.xtext.tesis.gramatica.Gramatica.FinOracion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleDeterminante"
    // InternalGramatica.g:409:1: entryRuleDeterminante returns [EObject current=null] : iv_ruleDeterminante= ruleDeterminante EOF ;
    public final EObject entryRuleDeterminante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterminante = null;


        try {
            // InternalGramatica.g:409:53: (iv_ruleDeterminante= ruleDeterminante EOF )
            // InternalGramatica.g:410:2: iv_ruleDeterminante= ruleDeterminante EOF
            {
             newCompositeNode(grammarAccess.getDeterminanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeterminante=ruleDeterminante();

            state._fsp--;

             current =iv_ruleDeterminante; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeterminante"


    // $ANTLR start "ruleDeterminante"
    // InternalGramatica.g:416:1: ruleDeterminante returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' ) ) ) ;
    public final EObject ruleDeterminante() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;
        Token lv_descripcion_0_3=null;


        	enterRule();

        try {
            // InternalGramatica.g:422:2: ( ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' ) ) ) )
            // InternalGramatica.g:423:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' ) ) )
            {
            // InternalGramatica.g:423:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' ) ) )
            // InternalGramatica.g:424:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' ) )
            {
            // InternalGramatica.g:424:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' ) )
            // InternalGramatica.g:425:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' )
            {
            // InternalGramatica.g:425:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' | lv_descripcion_0_3= 'Para todos/as Los/Las' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:426:5: lv_descripcion_0_1= 'El/La'
                    {
                    lv_descripcion_0_1=(Token)match(input,11,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeterminanteRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:437:5: lv_descripcion_0_2= 'Los/Las'
                    {
                    lv_descripcion_0_2=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeterminanteRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:448:5: lv_descripcion_0_3= 'Para todos/as Los/Las'
                    {
                    lv_descripcion_0_3=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getDeterminanteAccess().getDescripcionParaTodosAsLosLasKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeterminanteRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeterminante"


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:464:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:464:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:465:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalGramatica.g:471:1: ruleAtributo returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:477:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGramatica.g:478:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:478:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGramatica.g:479:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGramatica.g:479:3: (lv_name_0_0= RULE_ID )
            // InternalGramatica.g:480:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtributoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleSintagmaPreposicional"
    // InternalGramatica.g:499:1: entryRuleSintagmaPreposicional returns [EObject current=null] : iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF ;
    public final EObject entryRuleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSintagmaPreposicional = null;


        try {
            // InternalGramatica.g:499:62: (iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:500:2: iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF
            {
             newCompositeNode(grammarAccess.getSintagmaPreposicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSintagmaPreposicional=ruleSintagmaPreposicional();

            state._fsp--;

             current =iv_ruleSintagmaPreposicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSintagmaPreposicional"


    // $ANTLR start "ruleSintagmaPreposicional"
    // InternalGramatica.g:506:1: ruleSintagmaPreposicional returns [EObject current=null] : ( (lv_descripcion_0_0= 'de un/una' ) ) ;
    public final EObject ruleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:512:2: ( ( (lv_descripcion_0_0= 'de un/una' ) ) )
            // InternalGramatica.g:513:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            {
            // InternalGramatica.g:513:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            // InternalGramatica.g:514:3: (lv_descripcion_0_0= 'de un/una' )
            {
            // InternalGramatica.g:514:3: (lv_descripcion_0_0= 'de un/una' )
            // InternalGramatica.g:515:4: lv_descripcion_0_0= 'de un/una'
            {
            lv_descripcion_0_0=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(lv_descripcion_0_0, grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSintagmaPreposicionalRule());
            				}
            				setWithLastConsumed(current, "descripcion", lv_descripcion_0_0, "de un/una");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSintagmaPreposicional"


    // $ANTLR start "entryRuleObligacion"
    // InternalGramatica.g:530:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:530:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:531:2: iv_ruleObligacion= ruleObligacion EOF
            {
             newCompositeNode(grammarAccess.getObligacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObligacion=ruleObligacion();

            state._fsp--;

             current =iv_ruleObligacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObligacion"


    // $ANTLR start "ruleObligacion"
    // InternalGramatica.g:537:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        EObject lv_negacion_0_0 = null;

        EObject lv_obligacionDeber_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:543:2: ( ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) )
            // InternalGramatica.g:544:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            {
            // InternalGramatica.g:544:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            // InternalGramatica.g:545:3: ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            {
            // InternalGramatica.g:545:3: ( (lv_negacion_0_0= ruleNegacion ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:546:4: (lv_negacion_0_0= ruleNegacion )
                    {
                    // InternalGramatica.g:546:4: (lv_negacion_0_0= ruleNegacion )
                    // InternalGramatica.g:547:5: lv_negacion_0_0= ruleNegacion
                    {

                    					newCompositeNode(grammarAccess.getObligacionAccess().getNegacionNegacionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_negacion_0_0=ruleNegacion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObligacionRule());
                    					}
                    					set(
                    						current,
                    						"negacion",
                    						lv_negacion_0_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Negacion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:564:3: ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            // InternalGramatica.g:565:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            {
            // InternalGramatica.g:565:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            // InternalGramatica.g:566:5: lv_obligacionDeber_1_0= ruleObligacionDeber
            {

            					newCompositeNode(grammarAccess.getObligacionAccess().getObligacionDeberObligacionDeberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_obligacionDeber_1_0=ruleObligacionDeber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObligacionRule());
            					}
            					set(
            						current,
            						"obligacionDeber",
            						lv_obligacionDeber_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.ObligacionDeber");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObligacion"


    // $ANTLR start "entryRuleObligacionDeber"
    // InternalGramatica.g:587:1: entryRuleObligacionDeber returns [EObject current=null] : iv_ruleObligacionDeber= ruleObligacionDeber EOF ;
    public final EObject entryRuleObligacionDeber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacionDeber = null;


        try {
            // InternalGramatica.g:587:56: (iv_ruleObligacionDeber= ruleObligacionDeber EOF )
            // InternalGramatica.g:588:2: iv_ruleObligacionDeber= ruleObligacionDeber EOF
            {
             newCompositeNode(grammarAccess.getObligacionDeberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObligacionDeber=ruleObligacionDeber();

            state._fsp--;

             current =iv_ruleObligacionDeber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObligacionDeber"


    // $ANTLR start "ruleObligacionDeber"
    // InternalGramatica.g:594:1: ruleObligacionDeber returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) ;
    public final EObject ruleObligacionDeber() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:600:2: ( ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) )
            // InternalGramatica.g:601:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            {
            // InternalGramatica.g:601:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            // InternalGramatica.g:602:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            {
            // InternalGramatica.g:602:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            // InternalGramatica.g:603:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            {
            // InternalGramatica.g:603:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:604:5: lv_descripcion_0_1= 'debe ser'
                    {
                    lv_descripcion_0_1=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionDeberRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:615:5: lv_descripcion_0_2= 'debe estar'
                    {
                    lv_descripcion_0_2=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getObligacionDeberAccess().getDescripcionDebeEstarKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionDeberRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObligacionDeber"


    // $ANTLR start "entryRuleNegacion"
    // InternalGramatica.g:631:1: entryRuleNegacion returns [EObject current=null] : iv_ruleNegacion= ruleNegacion EOF ;
    public final EObject entryRuleNegacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegacion = null;


        try {
            // InternalGramatica.g:631:49: (iv_ruleNegacion= ruleNegacion EOF )
            // InternalGramatica.g:632:2: iv_ruleNegacion= ruleNegacion EOF
            {
             newCompositeNode(grammarAccess.getNegacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegacion=ruleNegacion();

            state._fsp--;

             current =iv_ruleNegacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegacion"


    // $ANTLR start "ruleNegacion"
    // InternalGramatica.g:638:1: ruleNegacion returns [EObject current=null] : ( (lv_descripcion_0_0= 'no' ) ) ;
    public final EObject ruleNegacion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:644:2: ( ( (lv_descripcion_0_0= 'no' ) ) )
            // InternalGramatica.g:645:2: ( (lv_descripcion_0_0= 'no' ) )
            {
            // InternalGramatica.g:645:2: ( (lv_descripcion_0_0= 'no' ) )
            // InternalGramatica.g:646:3: (lv_descripcion_0_0= 'no' )
            {
            // InternalGramatica.g:646:3: (lv_descripcion_0_0= 'no' )
            // InternalGramatica.g:647:4: lv_descripcion_0_0= 'no'
            {
            lv_descripcion_0_0=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(lv_descripcion_0_0, grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNegacionRule());
            				}
            				setWithLastConsumed(current, "descripcion", lv_descripcion_0_0, "no");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegacion"


    // $ANTLR start "entryRuleOperacion"
    // InternalGramatica.g:662:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalGramatica.g:662:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalGramatica.g:663:2: iv_ruleOperacion= ruleOperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacion=ruleOperacion();

            state._fsp--;

             current =iv_ruleOperacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalGramatica.g:669:1: ruleOperacion returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' ) ) ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;
        Token lv_descripcion_0_3=null;
        Token lv_descripcion_0_4=null;
        Token lv_descripcion_0_5=null;
        Token lv_descripcion_0_6=null;
        Token lv_descripcion_0_7=null;
        Token lv_descripcion_0_8=null;


        	enterRule();

        try {
            // InternalGramatica.g:675:2: ( ( ( (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' ) ) ) )
            // InternalGramatica.g:676:2: ( ( (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' ) ) )
            {
            // InternalGramatica.g:676:2: ( ( (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' ) ) )
            // InternalGramatica.g:677:3: ( (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' ) )
            {
            // InternalGramatica.g:677:3: ( (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' ) )
            // InternalGramatica.g:678:4: (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' )
            {
            // InternalGramatica.g:678:4: (lv_descripcion_0_1= 'implica' | lv_descripcion_0_2= 'mayor que' | lv_descripcion_0_3= 'menor que' | lv_descripcion_0_4= 'igual a' | lv_descripcion_0_5= 'mayor o igual a' | lv_descripcion_0_6= 'menor o igual a' | lv_descripcion_0_7= 'distinto de' | lv_descripcion_0_8= 'al menos' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            case 24:
                {
                alt9=7;
                }
                break;
            case 25:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:679:5: lv_descripcion_0_1= 'implica'
                    {
                    lv_descripcion_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getOperacionAccess().getDescripcionImplicaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:690:5: lv_descripcion_0_2= 'mayor que'
                    {
                    lv_descripcion_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:701:5: lv_descripcion_0_3= 'menor que'
                    {
                    lv_descripcion_0_3=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:712:5: lv_descripcion_0_4= 'igual a'
                    {
                    lv_descripcion_0_4=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_4, grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:723:5: lv_descripcion_0_5= 'mayor o igual a'
                    {
                    lv_descripcion_0_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_5, grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:734:5: lv_descripcion_0_6= 'menor o igual a'
                    {
                    lv_descripcion_0_6=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_6, grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:745:5: lv_descripcion_0_7= 'distinto de'
                    {
                    lv_descripcion_0_7=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_7, grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalGramatica.g:756:5: lv_descripcion_0_8= 'al menos'
                    {
                    lv_descripcion_0_8=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_8, grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_8, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleClase"
    // InternalGramatica.g:772:1: entryRuleClase returns [EObject current=null] : iv_ruleClase= ruleClase EOF ;
    public final EObject entryRuleClase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClase = null;


        try {
            // InternalGramatica.g:772:46: (iv_ruleClase= ruleClase EOF )
            // InternalGramatica.g:773:2: iv_ruleClase= ruleClase EOF
            {
             newCompositeNode(grammarAccess.getClaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClase=ruleClase();

            state._fsp--;

             current =iv_ruleClase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClase"


    // $ANTLR start "ruleClase"
    // InternalGramatica.g:779:1: ruleClase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:785:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGramatica.g:786:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:786:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGramatica.g:787:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGramatica.g:787:3: (lv_name_0_0= RULE_ID )
            // InternalGramatica.g:788:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClaseRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClase"


    // $ANTLR start "entryRuleLiteral"
    // InternalGramatica.g:807:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:807:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:808:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalGramatica.g:814:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:820:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalGramatica.g:821:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalGramatica.g:821:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:822:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:830:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:841:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalGramatica.g:841:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalGramatica.g:842:2: iv_ruleFinOracion= ruleFinOracion EOF
            {
             newCompositeNode(grammarAccess.getFinOracionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinOracion=ruleFinOracion();

            state._fsp--;

             current =iv_ruleFinOracion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinOracion"


    // $ANTLR start "ruleFinOracion"
    // InternalGramatica.g:848:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramatica.g:854:2: (kw= '.' )
            // InternalGramatica.g:855:2: kw= '.'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFinOracionAccess().getFullStopKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinOracion"


    // $ANTLR start "entryRuleCompuesta"
    // InternalGramatica.g:863:1: entryRuleCompuesta returns [EObject current=null] : iv_ruleCompuesta= ruleCompuesta EOF ;
    public final EObject entryRuleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompuesta = null;


        try {
            // InternalGramatica.g:863:50: (iv_ruleCompuesta= ruleCompuesta EOF )
            // InternalGramatica.g:864:2: iv_ruleCompuesta= ruleCompuesta EOF
            {
             newCompositeNode(grammarAccess.getCompuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompuesta=ruleCompuesta();

            state._fsp--;

             current =iv_ruleCompuesta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompuesta"


    // $ANTLR start "ruleCompuesta"
    // InternalGramatica.g:870:1: ruleCompuesta returns [EObject current=null] : (otherlv_0= 'Compuesta' ( (lv_simpleInicial_1_0= ruleSimple ) ) ( ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) ) )* ) ;
    public final EObject ruleCompuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_simpleInicial_1_0 = null;

        EObject lv_nexo_2_0 = null;

        EObject lv_simpleFinal_3_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:876:2: ( (otherlv_0= 'Compuesta' ( (lv_simpleInicial_1_0= ruleSimple ) ) ( ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) ) )* ) )
            // InternalGramatica.g:877:2: (otherlv_0= 'Compuesta' ( (lv_simpleInicial_1_0= ruleSimple ) ) ( ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) ) )* )
            {
            // InternalGramatica.g:877:2: (otherlv_0= 'Compuesta' ( (lv_simpleInicial_1_0= ruleSimple ) ) ( ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) ) )* )
            // InternalGramatica.g:878:3: otherlv_0= 'Compuesta' ( (lv_simpleInicial_1_0= ruleSimple ) ) ( ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCompuestaAccess().getCompuestaKeyword_0());
            		
            // InternalGramatica.g:882:3: ( (lv_simpleInicial_1_0= ruleSimple ) )
            // InternalGramatica.g:883:4: (lv_simpleInicial_1_0= ruleSimple )
            {
            // InternalGramatica.g:883:4: (lv_simpleInicial_1_0= ruleSimple )
            // InternalGramatica.g:884:5: lv_simpleInicial_1_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleInicialSimpleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_simpleInicial_1_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompuestaRule());
            					}
            					set(
            						current,
            						"simpleInicial",
            						lv_simpleInicial_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:901:3: ( ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGramatica.g:902:4: ( (lv_nexo_2_0= ruleNexo ) ) ( (lv_simpleFinal_3_0= ruleSimple ) )
            	    {
            	    // InternalGramatica.g:902:4: ( (lv_nexo_2_0= ruleNexo ) )
            	    // InternalGramatica.g:903:5: (lv_nexo_2_0= ruleNexo )
            	    {
            	    // InternalGramatica.g:903:5: (lv_nexo_2_0= ruleNexo )
            	    // InternalGramatica.g:904:6: lv_nexo_2_0= ruleNexo
            	    {

            	    						newCompositeNode(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_nexo_2_0=ruleNexo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompuestaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"nexo",
            	    							lv_nexo_2_0,
            	    							"org.xtext.tesis.gramatica.Gramatica.Nexo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGramatica.g:921:4: ( (lv_simpleFinal_3_0= ruleSimple ) )
            	    // InternalGramatica.g:922:5: (lv_simpleFinal_3_0= ruleSimple )
            	    {
            	    // InternalGramatica.g:922:5: (lv_simpleFinal_3_0= ruleSimple )
            	    // InternalGramatica.g:923:6: lv_simpleFinal_3_0= ruleSimple
            	    {

            	    						newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleFinalSimpleParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_simpleFinal_3_0=ruleSimple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompuestaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"simpleFinal",
            	    							lv_simpleFinal_3_0,
            	    							"org.xtext.tesis.gramatica.Gramatica.Simple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompuesta"


    // $ANTLR start "entryRuleNexo"
    // InternalGramatica.g:945:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalGramatica.g:945:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalGramatica.g:946:2: iv_ruleNexo= ruleNexo EOF
            {
             newCompositeNode(grammarAccess.getNexoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNexo=ruleNexo();

            state._fsp--;

             current =iv_ruleNexo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNexo"


    // $ANTLR start "ruleNexo"
    // InternalGramatica.g:952:1: ruleNexo returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' ) ) ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:958:2: ( ( ( (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' ) ) ) )
            // InternalGramatica.g:959:2: ( ( (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' ) ) )
            {
            // InternalGramatica.g:959:2: ( ( (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' ) ) )
            // InternalGramatica.g:960:3: ( (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' ) )
            {
            // InternalGramatica.g:960:3: ( (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' ) )
            // InternalGramatica.g:961:4: (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' )
            {
            // InternalGramatica.g:961:4: (lv_descripcion_0_1= 'y' | lv_descripcion_0_2= 'o' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:962:5: lv_descripcion_0_1= 'y'
                    {
                    lv_descripcion_0_1=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:973:5: lv_descripcion_0_2= 'o'
                    {
                    lv_descripcion_0_2=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getNexoAccess().getDescripcionOKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNexo"


    // $ANTLR start "entryRuleCompleja"
    // InternalGramatica.g:989:1: entryRuleCompleja returns [EObject current=null] : iv_ruleCompleja= ruleCompleja EOF ;
    public final EObject entryRuleCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleja = null;


        try {
            // InternalGramatica.g:989:49: (iv_ruleCompleja= ruleCompleja EOF )
            // InternalGramatica.g:990:2: iv_ruleCompleja= ruleCompleja EOF
            {
             newCompositeNode(grammarAccess.getComplejaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleja=ruleCompleja();

            state._fsp--;

             current =iv_ruleCompleja; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleja"


    // $ANTLR start "ruleCompleja"
    // InternalGramatica.g:996:1: ruleCompleja returns [EObject current=null] : ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atr_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_conect_4_0= ruleConector ) ) ( ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )? )? ( (lv_opeCol_19_0= ruleOperacionColeccion ) )? ( ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) ) )? ( (lv_finOracion_23_0= ruleFinOracion ) ) ) ;
    public final EObject ruleCompleja() throws RecognitionException {
        EObject current = null;

        EObject lv_determinante_0_0 = null;

        EObject lv_atr_1_0 = null;

        EObject lv_Sintagma_2_0 = null;

        EObject lv_contexto_3_0 = null;

        EObject lv_conect_4_0 = null;

        EObject lv_operacionColeccion_5_0 = null;

        EObject lv_determinante1_6_0 = null;

        EObject lv_clase_7_0 = null;

        EObject lv_conect1_8_0 = null;

        EObject lv_atr1_9_0 = null;

        EObject lv_ope3_10_0 = null;

        AntlrDatatypeRuleToken lv_lit1_11_0 = null;

        EObject lv_atr2_12_0 = null;

        EObject lv_ope4_13_0 = null;

        EObject lv_atr4_14_0 = null;

        EObject lv_ope5_15_0 = null;

        AntlrDatatypeRuleToken lv_lit2_16_0 = null;

        EObject lv_atr5_17_0 = null;

        EObject lv_conec1_18_0 = null;

        EObject lv_opeCol_19_0 = null;

        EObject lv_ope6_20_0 = null;

        AntlrDatatypeRuleToken lv_lit3_21_0 = null;

        EObject lv_atr3_22_0 = null;

        AntlrDatatypeRuleToken lv_finOracion_23_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:1002:2: ( ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atr_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_conect_4_0= ruleConector ) ) ( ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )? )? ( (lv_opeCol_19_0= ruleOperacionColeccion ) )? ( ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) ) )? ( (lv_finOracion_23_0= ruleFinOracion ) ) ) )
            // InternalGramatica.g:1003:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atr_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_conect_4_0= ruleConector ) ) ( ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )? )? ( (lv_opeCol_19_0= ruleOperacionColeccion ) )? ( ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) ) )? ( (lv_finOracion_23_0= ruleFinOracion ) ) )
            {
            // InternalGramatica.g:1003:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atr_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_conect_4_0= ruleConector ) ) ( ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )? )? ( (lv_opeCol_19_0= ruleOperacionColeccion ) )? ( ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) ) )? ( (lv_finOracion_23_0= ruleFinOracion ) ) )
            // InternalGramatica.g:1004:3: ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atr_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_conect_4_0= ruleConector ) ) ( ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )? )? ( (lv_opeCol_19_0= ruleOperacionColeccion ) )? ( ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) ) )? ( (lv_finOracion_23_0= ruleFinOracion ) )
            {
            // InternalGramatica.g:1004:3: ( (lv_determinante_0_0= ruleDeterminante ) )
            // InternalGramatica.g:1005:4: (lv_determinante_0_0= ruleDeterminante )
            {
            // InternalGramatica.g:1005:4: (lv_determinante_0_0= ruleDeterminante )
            // InternalGramatica.g:1006:5: lv_determinante_0_0= ruleDeterminante
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getDeterminanteDeterminanteParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_determinante_0_0=ruleDeterminante();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"determinante",
            						lv_determinante_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Determinante");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:1023:3: ( (lv_atr_1_0= ruleAtributo ) )
            // InternalGramatica.g:1024:4: (lv_atr_1_0= ruleAtributo )
            {
            // InternalGramatica.g:1024:4: (lv_atr_1_0= ruleAtributo )
            // InternalGramatica.g:1025:5: lv_atr_1_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getAtrAtributoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_atr_1_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"atr",
            						lv_atr_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:1042:3: ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) )
            // InternalGramatica.g:1043:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:1043:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            // InternalGramatica.g:1044:5: lv_Sintagma_2_0= ruleSintagmaPreposicional
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_Sintagma_2_0=ruleSintagmaPreposicional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"Sintagma",
            						lv_Sintagma_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.SintagmaPreposicional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:1061:3: ( (lv_contexto_3_0= ruleClase ) )
            // InternalGramatica.g:1062:4: (lv_contexto_3_0= ruleClase )
            {
            // InternalGramatica.g:1062:4: (lv_contexto_3_0= ruleClase )
            // InternalGramatica.g:1063:5: lv_contexto_3_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_contexto_3_0=ruleClase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"contexto",
            						lv_contexto_3_0,
            						"org.xtext.tesis.gramatica.Gramatica.Clase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:1080:3: ( (lv_conect_4_0= ruleConector ) )
            // InternalGramatica.g:1081:4: (lv_conect_4_0= ruleConector )
            {
            // InternalGramatica.g:1081:4: (lv_conect_4_0= ruleConector )
            // InternalGramatica.g:1082:5: lv_conect_4_0= ruleConector
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getConectConectorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_conect_4_0=ruleConector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"conect",
            						lv_conect_4_0,
            						"org.xtext.tesis.gramatica.Gramatica.Conector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:1099:3: ( ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )? )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>=11 && LA19_1<=13)) ) {
                        alt19=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA19_2 = input.LA(2);

                    if ( ((LA19_2>=11 && LA19_2<=13)) ) {
                        alt19=1;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA19_3 = input.LA(2);

                    if ( ((LA19_3>=11 && LA19_3<=13)) ) {
                        alt19=1;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA19_4 = input.LA(2);

                    if ( ((LA19_4>=11 && LA19_4<=13)) ) {
                        alt19=1;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA19_5 = input.LA(2);

                    if ( ((LA19_5>=11 && LA19_5<=13)) ) {
                        alt19=1;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA19_6 = input.LA(2);

                    if ( ((LA19_6>=11 && LA19_6<=13)) ) {
                        alt19=1;
                    }
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalGramatica.g:1100:4: ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) ) ( (lv_determinante1_6_0= ruleDeterminante ) ) ( (lv_clase_7_0= ruleClase ) ) ( (lv_conect1_8_0= ruleConector ) ) ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )? ( (lv_conec1_18_0= ruleConector ) )?
                    {
                    // InternalGramatica.g:1100:4: ( (lv_operacionColeccion_5_0= ruleOperacionColeccion ) )
                    // InternalGramatica.g:1101:5: (lv_operacionColeccion_5_0= ruleOperacionColeccion )
                    {
                    // InternalGramatica.g:1101:5: (lv_operacionColeccion_5_0= ruleOperacionColeccion )
                    // InternalGramatica.g:1102:6: lv_operacionColeccion_5_0= ruleOperacionColeccion
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getOperacionColeccionOperacionColeccionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operacionColeccion_5_0=ruleOperacionColeccion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"operacionColeccion",
                    							lv_operacionColeccion_5_0,
                    							"org.xtext.tesis.gramatica.Gramatica.OperacionColeccion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGramatica.g:1119:4: ( (lv_determinante1_6_0= ruleDeterminante ) )
                    // InternalGramatica.g:1120:5: (lv_determinante1_6_0= ruleDeterminante )
                    {
                    // InternalGramatica.g:1120:5: (lv_determinante1_6_0= ruleDeterminante )
                    // InternalGramatica.g:1121:6: lv_determinante1_6_0= ruleDeterminante
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getDeterminante1DeterminanteParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_determinante1_6_0=ruleDeterminante();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"determinante1",
                    							lv_determinante1_6_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Determinante");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGramatica.g:1138:4: ( (lv_clase_7_0= ruleClase ) )
                    // InternalGramatica.g:1139:5: (lv_clase_7_0= ruleClase )
                    {
                    // InternalGramatica.g:1139:5: (lv_clase_7_0= ruleClase )
                    // InternalGramatica.g:1140:6: lv_clase_7_0= ruleClase
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getClaseClaseParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_clase_7_0=ruleClase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"clase",
                    							lv_clase_7_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Clase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGramatica.g:1157:4: ( (lv_conect1_8_0= ruleConector ) )
                    // InternalGramatica.g:1158:5: (lv_conect1_8_0= ruleConector )
                    {
                    // InternalGramatica.g:1158:5: (lv_conect1_8_0= ruleConector )
                    // InternalGramatica.g:1159:6: lv_conect1_8_0= ruleConector
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getConect1ConectorParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_conect1_8_0=ruleConector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"conect1",
                    							lv_conect1_8_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Conector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGramatica.g:1176:4: ( ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGramatica.g:1177:5: ( (lv_atr1_9_0= ruleAtributo ) ) ( (lv_ope3_10_0= ruleOperacion ) ) ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) ) ( (lv_ope4_13_0= ruleOperacion ) )? ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )?
                            {
                            // InternalGramatica.g:1177:5: ( (lv_atr1_9_0= ruleAtributo ) )
                            // InternalGramatica.g:1178:6: (lv_atr1_9_0= ruleAtributo )
                            {
                            // InternalGramatica.g:1178:6: (lv_atr1_9_0= ruleAtributo )
                            // InternalGramatica.g:1179:7: lv_atr1_9_0= ruleAtributo
                            {

                            							newCompositeNode(grammarAccess.getComplejaAccess().getAtr1AtributoParserRuleCall_5_4_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_atr1_9_0=ruleAtributo();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComplejaRule());
                            							}
                            							set(
                            								current,
                            								"atr1",
                            								lv_atr1_9_0,
                            								"org.xtext.tesis.gramatica.Gramatica.Atributo");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGramatica.g:1196:5: ( (lv_ope3_10_0= ruleOperacion ) )
                            // InternalGramatica.g:1197:6: (lv_ope3_10_0= ruleOperacion )
                            {
                            // InternalGramatica.g:1197:6: (lv_ope3_10_0= ruleOperacion )
                            // InternalGramatica.g:1198:7: lv_ope3_10_0= ruleOperacion
                            {

                            							newCompositeNode(grammarAccess.getComplejaAccess().getOpe3OperacionParserRuleCall_5_4_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_ope3_10_0=ruleOperacion();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComplejaRule());
                            							}
                            							set(
                            								current,
                            								"ope3",
                            								lv_ope3_10_0,
                            								"org.xtext.tesis.gramatica.Gramatica.Operacion");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGramatica.g:1215:5: ( ( (lv_lit1_11_0= ruleLiteral ) ) | ( (lv_atr2_12_0= ruleAtributo ) ) )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==RULE_STRING||LA13_0==RULE_INT) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==RULE_ID) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalGramatica.g:1216:6: ( (lv_lit1_11_0= ruleLiteral ) )
                                    {
                                    // InternalGramatica.g:1216:6: ( (lv_lit1_11_0= ruleLiteral ) )
                                    // InternalGramatica.g:1217:7: (lv_lit1_11_0= ruleLiteral )
                                    {
                                    // InternalGramatica.g:1217:7: (lv_lit1_11_0= ruleLiteral )
                                    // InternalGramatica.g:1218:8: lv_lit1_11_0= ruleLiteral
                                    {

                                    								newCompositeNode(grammarAccess.getComplejaAccess().getLit1LiteralParserRuleCall_5_4_2_0_0());
                                    							
                                    pushFollow(FOLLOW_15);
                                    lv_lit1_11_0=ruleLiteral();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getComplejaRule());
                                    								}
                                    								set(
                                    									current,
                                    									"lit1",
                                    									lv_lit1_11_0,
                                    									"org.xtext.tesis.gramatica.Gramatica.Literal");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalGramatica.g:1236:6: ( (lv_atr2_12_0= ruleAtributo ) )
                                    {
                                    // InternalGramatica.g:1236:6: ( (lv_atr2_12_0= ruleAtributo ) )
                                    // InternalGramatica.g:1237:7: (lv_atr2_12_0= ruleAtributo )
                                    {
                                    // InternalGramatica.g:1237:7: (lv_atr2_12_0= ruleAtributo )
                                    // InternalGramatica.g:1238:8: lv_atr2_12_0= ruleAtributo
                                    {

                                    								newCompositeNode(grammarAccess.getComplejaAccess().getAtr2AtributoParserRuleCall_5_4_2_1_0());
                                    							
                                    pushFollow(FOLLOW_15);
                                    lv_atr2_12_0=ruleAtributo();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getComplejaRule());
                                    								}
                                    								set(
                                    									current,
                                    									"atr2",
                                    									lv_atr2_12_0,
                                    									"org.xtext.tesis.gramatica.Gramatica.Atributo");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalGramatica.g:1256:5: ( (lv_ope4_13_0= ruleOperacion ) )?
                            int alt14=2;
                            alt14 = dfa14.predict(input);
                            switch (alt14) {
                                case 1 :
                                    // InternalGramatica.g:1257:6: (lv_ope4_13_0= ruleOperacion )
                                    {
                                    // InternalGramatica.g:1257:6: (lv_ope4_13_0= ruleOperacion )
                                    // InternalGramatica.g:1258:7: lv_ope4_13_0= ruleOperacion
                                    {

                                    							newCompositeNode(grammarAccess.getComplejaAccess().getOpe4OperacionParserRuleCall_5_4_3_0());
                                    						
                                    pushFollow(FOLLOW_15);
                                    lv_ope4_13_0=ruleOperacion();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getComplejaRule());
                                    							}
                                    							set(
                                    								current,
                                    								"ope4",
                                    								lv_ope4_13_0,
                                    								"org.xtext.tesis.gramatica.Gramatica.Operacion");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalGramatica.g:1275:5: ( ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) ) )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==RULE_ID) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalGramatica.g:1276:6: ( (lv_atr4_14_0= ruleAtributo ) ) ( (lv_ope5_15_0= ruleOperacion ) ) ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) )
                                    {
                                    // InternalGramatica.g:1276:6: ( (lv_atr4_14_0= ruleAtributo ) )
                                    // InternalGramatica.g:1277:7: (lv_atr4_14_0= ruleAtributo )
                                    {
                                    // InternalGramatica.g:1277:7: (lv_atr4_14_0= ruleAtributo )
                                    // InternalGramatica.g:1278:8: lv_atr4_14_0= ruleAtributo
                                    {

                                    								newCompositeNode(grammarAccess.getComplejaAccess().getAtr4AtributoParserRuleCall_5_4_4_0_0());
                                    							
                                    pushFollow(FOLLOW_16);
                                    lv_atr4_14_0=ruleAtributo();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getComplejaRule());
                                    								}
                                    								set(
                                    									current,
                                    									"atr4",
                                    									lv_atr4_14_0,
                                    									"org.xtext.tesis.gramatica.Gramatica.Atributo");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalGramatica.g:1295:6: ( (lv_ope5_15_0= ruleOperacion ) )
                                    // InternalGramatica.g:1296:7: (lv_ope5_15_0= ruleOperacion )
                                    {
                                    // InternalGramatica.g:1296:7: (lv_ope5_15_0= ruleOperacion )
                                    // InternalGramatica.g:1297:8: lv_ope5_15_0= ruleOperacion
                                    {

                                    								newCompositeNode(grammarAccess.getComplejaAccess().getOpe5OperacionParserRuleCall_5_4_4_1_0());
                                    							
                                    pushFollow(FOLLOW_9);
                                    lv_ope5_15_0=ruleOperacion();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getComplejaRule());
                                    								}
                                    								set(
                                    									current,
                                    									"ope5",
                                    									lv_ope5_15_0,
                                    									"org.xtext.tesis.gramatica.Gramatica.Operacion");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalGramatica.g:1314:6: ( ( (lv_lit2_16_0= ruleLiteral ) ) | ( (lv_atr5_17_0= ruleAtributo ) ) )
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0==RULE_STRING||LA15_0==RULE_INT) ) {
                                        alt15=1;
                                    }
                                    else if ( (LA15_0==RULE_ID) ) {
                                        alt15=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 15, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // InternalGramatica.g:1315:7: ( (lv_lit2_16_0= ruleLiteral ) )
                                            {
                                            // InternalGramatica.g:1315:7: ( (lv_lit2_16_0= ruleLiteral ) )
                                            // InternalGramatica.g:1316:8: (lv_lit2_16_0= ruleLiteral )
                                            {
                                            // InternalGramatica.g:1316:8: (lv_lit2_16_0= ruleLiteral )
                                            // InternalGramatica.g:1317:9: lv_lit2_16_0= ruleLiteral
                                            {

                                            									newCompositeNode(grammarAccess.getComplejaAccess().getLit2LiteralParserRuleCall_5_4_4_2_0_0());
                                            								
                                            pushFollow(FOLLOW_17);
                                            lv_lit2_16_0=ruleLiteral();

                                            state._fsp--;


                                            									if (current==null) {
                                            										current = createModelElementForParent(grammarAccess.getComplejaRule());
                                            									}
                                            									set(
                                            										current,
                                            										"lit2",
                                            										lv_lit2_16_0,
                                            										"org.xtext.tesis.gramatica.Gramatica.Literal");
                                            									afterParserOrEnumRuleCall();
                                            								

                                            }


                                            }


                                            }
                                            break;
                                        case 2 :
                                            // InternalGramatica.g:1335:7: ( (lv_atr5_17_0= ruleAtributo ) )
                                            {
                                            // InternalGramatica.g:1335:7: ( (lv_atr5_17_0= ruleAtributo ) )
                                            // InternalGramatica.g:1336:8: (lv_atr5_17_0= ruleAtributo )
                                            {
                                            // InternalGramatica.g:1336:8: (lv_atr5_17_0= ruleAtributo )
                                            // InternalGramatica.g:1337:9: lv_atr5_17_0= ruleAtributo
                                            {

                                            									newCompositeNode(grammarAccess.getComplejaAccess().getAtr5AtributoParserRuleCall_5_4_4_2_1_0());
                                            								
                                            pushFollow(FOLLOW_17);
                                            lv_atr5_17_0=ruleAtributo();

                                            state._fsp--;


                                            									if (current==null) {
                                            										current = createModelElementForParent(grammarAccess.getComplejaRule());
                                            									}
                                            									set(
                                            										current,
                                            										"atr5",
                                            										lv_atr5_17_0,
                                            										"org.xtext.tesis.gramatica.Gramatica.Atributo");
                                            									afterParserOrEnumRuleCall();
                                            								

                                            }


                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalGramatica.g:1357:4: ( (lv_conec1_18_0= ruleConector ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=30 && LA18_0<=31)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalGramatica.g:1358:5: (lv_conec1_18_0= ruleConector )
                            {
                            // InternalGramatica.g:1358:5: (lv_conec1_18_0= ruleConector )
                            // InternalGramatica.g:1359:6: lv_conec1_18_0= ruleConector
                            {

                            						newCompositeNode(grammarAccess.getComplejaAccess().getConec1ConectorParserRuleCall_5_5_0());
                            					
                            pushFollow(FOLLOW_14);
                            lv_conec1_18_0=ruleConector();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getComplejaRule());
                            						}
                            						set(
                            							current,
                            							"conec1",
                            							lv_conec1_18_0,
                            							"org.xtext.tesis.gramatica.Gramatica.Conector");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGramatica.g:1377:3: ( (lv_opeCol_19_0= ruleOperacionColeccion ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=32 && LA20_0<=37)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGramatica.g:1378:4: (lv_opeCol_19_0= ruleOperacionColeccion )
                    {
                    // InternalGramatica.g:1378:4: (lv_opeCol_19_0= ruleOperacionColeccion )
                    // InternalGramatica.g:1379:5: lv_opeCol_19_0= ruleOperacionColeccion
                    {

                    					newCompositeNode(grammarAccess.getComplejaAccess().getOpeColOperacionColeccionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_opeCol_19_0=ruleOperacionColeccion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplejaRule());
                    					}
                    					set(
                    						current,
                    						"opeCol",
                    						lv_opeCol_19_0,
                    						"org.xtext.tesis.gramatica.Gramatica.OperacionColeccion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:1396:3: ( ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=18 && LA22_0<=25)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGramatica.g:1397:4: ( (lv_ope6_20_0= ruleOperacion ) ) ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) )
                    {
                    // InternalGramatica.g:1397:4: ( (lv_ope6_20_0= ruleOperacion ) )
                    // InternalGramatica.g:1398:5: (lv_ope6_20_0= ruleOperacion )
                    {
                    // InternalGramatica.g:1398:5: (lv_ope6_20_0= ruleOperacion )
                    // InternalGramatica.g:1399:6: lv_ope6_20_0= ruleOperacion
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getOpe6OperacionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_ope6_20_0=ruleOperacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"ope6",
                    							lv_ope6_20_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Operacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGramatica.g:1416:4: ( ( (lv_lit3_21_0= ruleLiteral ) ) | ( (lv_atr3_22_0= ruleAtributo ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_STRING||LA21_0==RULE_INT) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_ID) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGramatica.g:1417:5: ( (lv_lit3_21_0= ruleLiteral ) )
                            {
                            // InternalGramatica.g:1417:5: ( (lv_lit3_21_0= ruleLiteral ) )
                            // InternalGramatica.g:1418:6: (lv_lit3_21_0= ruleLiteral )
                            {
                            // InternalGramatica.g:1418:6: (lv_lit3_21_0= ruleLiteral )
                            // InternalGramatica.g:1419:7: lv_lit3_21_0= ruleLiteral
                            {

                            							newCompositeNode(grammarAccess.getComplejaAccess().getLit3LiteralParserRuleCall_7_1_0_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_lit3_21_0=ruleLiteral();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComplejaRule());
                            							}
                            							set(
                            								current,
                            								"lit3",
                            								lv_lit3_21_0,
                            								"org.xtext.tesis.gramatica.Gramatica.Literal");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGramatica.g:1437:5: ( (lv_atr3_22_0= ruleAtributo ) )
                            {
                            // InternalGramatica.g:1437:5: ( (lv_atr3_22_0= ruleAtributo ) )
                            // InternalGramatica.g:1438:6: (lv_atr3_22_0= ruleAtributo )
                            {
                            // InternalGramatica.g:1438:6: (lv_atr3_22_0= ruleAtributo )
                            // InternalGramatica.g:1439:7: lv_atr3_22_0= ruleAtributo
                            {

                            							newCompositeNode(grammarAccess.getComplejaAccess().getAtr3AtributoParserRuleCall_7_1_1_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_atr3_22_0=ruleAtributo();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComplejaRule());
                            							}
                            							set(
                            								current,
                            								"atr3",
                            								lv_atr3_22_0,
                            								"org.xtext.tesis.gramatica.Gramatica.Atributo");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGramatica.g:1458:3: ( (lv_finOracion_23_0= ruleFinOracion ) )
            // InternalGramatica.g:1459:4: (lv_finOracion_23_0= ruleFinOracion )
            {
            // InternalGramatica.g:1459:4: (lv_finOracion_23_0= ruleFinOracion )
            // InternalGramatica.g:1460:5: lv_finOracion_23_0= ruleFinOracion
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getFinOracionFinOracionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_finOracion_23_0=ruleFinOracion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"finOracion",
            						lv_finOracion_23_0,
            						"org.xtext.tesis.gramatica.Gramatica.FinOracion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompleja"


    // $ANTLR start "entryRuleConector"
    // InternalGramatica.g:1481:1: entryRuleConector returns [EObject current=null] : iv_ruleConector= ruleConector EOF ;
    public final EObject entryRuleConector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConector = null;


        try {
            // InternalGramatica.g:1481:49: (iv_ruleConector= ruleConector EOF )
            // InternalGramatica.g:1482:2: iv_ruleConector= ruleConector EOF
            {
             newCompositeNode(grammarAccess.getConectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConector=ruleConector();

            state._fsp--;

             current =iv_ruleConector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConector"


    // $ANTLR start "ruleConector"
    // InternalGramatica.g:1488:1: ruleConector returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' ) ) ) ;
    public final EObject ruleConector() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:1494:2: ( ( ( (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' ) ) ) )
            // InternalGramatica.g:1495:2: ( ( (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' ) ) )
            {
            // InternalGramatica.g:1495:2: ( ( (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' ) ) )
            // InternalGramatica.g:1496:3: ( (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' ) )
            {
            // InternalGramatica.g:1496:3: ( (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' ) )
            // InternalGramatica.g:1497:4: (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' )
            {
            // InternalGramatica.g:1497:4: (lv_descripcion_0_1= 'tal que' | lv_descripcion_0_2= 'donde' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            else if ( (LA23_0==31) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGramatica.g:1498:5: lv_descripcion_0_1= 'tal que'
                    {
                    lv_descripcion_0_1=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getConectorAccess().getDescripcionTalQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConectorRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:1509:5: lv_descripcion_0_2= 'donde'
                    {
                    lv_descripcion_0_2=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getConectorAccess().getDescripcionDondeKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConectorRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConector"


    // $ANTLR start "entryRuleOperacionColeccion"
    // InternalGramatica.g:1525:1: entryRuleOperacionColeccion returns [EObject current=null] : iv_ruleOperacionColeccion= ruleOperacionColeccion EOF ;
    public final EObject entryRuleOperacionColeccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionColeccion = null;


        try {
            // InternalGramatica.g:1525:59: (iv_ruleOperacionColeccion= ruleOperacionColeccion EOF )
            // InternalGramatica.g:1526:2: iv_ruleOperacionColeccion= ruleOperacionColeccion EOF
            {
             newCompositeNode(grammarAccess.getOperacionColeccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacionColeccion=ruleOperacionColeccion();

            state._fsp--;

             current =iv_ruleOperacionColeccion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacionColeccion"


    // $ANTLR start "ruleOperacionColeccion"
    // InternalGramatica.g:1532:1: ruleOperacionColeccion returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' ) ) ) ;
    public final EObject ruleOperacionColeccion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;
        Token lv_descripcion_0_3=null;
        Token lv_descripcion_0_4=null;
        Token lv_descripcion_0_5=null;
        Token lv_descripcion_0_6=null;


        	enterRule();

        try {
            // InternalGramatica.g:1538:2: ( ( ( (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' ) ) ) )
            // InternalGramatica.g:1539:2: ( ( (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' ) ) )
            {
            // InternalGramatica.g:1539:2: ( ( (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' ) ) )
            // InternalGramatica.g:1540:3: ( (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' ) )
            {
            // InternalGramatica.g:1540:3: ( (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' ) )
            // InternalGramatica.g:1541:4: (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' )
            {
            // InternalGramatica.g:1541:4: (lv_descripcion_0_1= 'seleccionamos' | lv_descripcion_0_2= 'para todos' | lv_descripcion_0_3= 'existe' | lv_descripcion_0_4= 'es no vacio' | lv_descripcion_0_5= 'es vacio' | lv_descripcion_0_6= 'tamanio' )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt24=1;
                }
                break;
            case 33:
                {
                alt24=2;
                }
                break;
            case 34:
                {
                alt24=3;
                }
                break;
            case 35:
                {
                alt24=4;
                }
                break;
            case 36:
                {
                alt24=5;
                }
                break;
            case 37:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalGramatica.g:1542:5: lv_descripcion_0_1= 'seleccionamos'
                    {
                    lv_descripcion_0_1=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getOperacionColeccionAccess().getDescripcionSeleccionamosKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionColeccionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:1553:5: lv_descripcion_0_2= 'para todos'
                    {
                    lv_descripcion_0_2=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getOperacionColeccionAccess().getDescripcionParaTodosKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionColeccionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:1564:5: lv_descripcion_0_3= 'existe'
                    {
                    lv_descripcion_0_3=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getOperacionColeccionAccess().getDescripcionExisteKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionColeccionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:1575:5: lv_descripcion_0_4= 'es no vacio'
                    {
                    lv_descripcion_0_4=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_4, grammarAccess.getOperacionColeccionAccess().getDescripcionEsNoVacioKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionColeccionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:1586:5: lv_descripcion_0_5= 'es vacio'
                    {
                    lv_descripcion_0_5=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_5, grammarAccess.getOperacionColeccionAccess().getDescripcionEsVacioKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionColeccionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:1597:5: lv_descripcion_0_6= 'tamanio'
                    {
                    lv_descripcion_0_6=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_6, grammarAccess.getOperacionColeccionAccess().getDescripcionTamanioKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionColeccionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_6, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacionColeccion"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\13\3\5\1\uffff\1\16\1\5\1\17\2\uffff";
    static final String dfa_3s = "\1\33\3\5\1\uffff\1\16\1\5\1\37\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\3\uffff\1\1\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\15\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\3\10\14\uffff\2\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "152:2: ( ( (lv_contenido_0_0= ruleSimple ) ) | ( (lv_contenido_1_0= ruleCompuesta ) ) | ( (lv_contenido_2_0= ruleCompleja ) ) )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\5\10\4\1\uffff\1\22\1\uffff";
    static final String dfa_9s = "\11\45\1\uffff\1\32\1\uffff";
    static final String dfa_10s = "\11\uffff\1\2\1\uffff\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\14\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\10\11",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "\1\11\1\12\1\11\13\uffff\11\13\3\uffff\10\13",
            "",
            "\10\13\1\11",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1256:5: ( (lv_ope4_13_0= ruleOperacion ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008003802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003FC0070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003F07FC0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003FC7FC0020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003FC7FC0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}