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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'El/La'", "'Los/Las'", "'Coleccion de'", "'de un/una'", "'debe ser'", "'debe estar'", "'no'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'.'", "'y'", "'o'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
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

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
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
    // InternalGramatica.g:145:1: ruleOracion returns [EObject current=null] : ( ( (lv_contenido_0_0= ruleSimple ) ) | this_Compuesta_1= ruleCompuesta ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject lv_contenido_0_0 = null;

        EObject this_Compuesta_1 = null;



        	enterRule();

        try {
            // InternalGramatica.g:151:2: ( ( ( (lv_contenido_0_0= ruleSimple ) ) | this_Compuesta_1= ruleCompuesta ) )
            // InternalGramatica.g:152:2: ( ( (lv_contenido_0_0= ruleSimple ) ) | this_Compuesta_1= ruleCompuesta )
            {
            // InternalGramatica.g:152:2: ( ( (lv_contenido_0_0= ruleSimple ) ) | this_Compuesta_1= ruleCompuesta )
            int alt2=2;
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
                    // InternalGramatica.g:173:3: this_Compuesta_1= ruleCompuesta
                    {

                    			newCompositeNode(grammarAccess.getOracionAccess().getCompuestaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compuesta_1=ruleCompuesta();

                    state._fsp--;


                    			current = this_Compuesta_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // InternalGramatica.g:185:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:185:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:186:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:192:1: ruleSimple returns [EObject current=null] : ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? ) ;
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
            // InternalGramatica.g:198:2: ( ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? ) )
            // InternalGramatica.g:199:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? )
            {
            // InternalGramatica.g:199:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? )
            // InternalGramatica.g:200:3: ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )?
            {
            // InternalGramatica.g:200:3: ( (lv_determinante_0_0= ruleDeterminante ) )
            // InternalGramatica.g:201:4: (lv_determinante_0_0= ruleDeterminante )
            {
            // InternalGramatica.g:201:4: (lv_determinante_0_0= ruleDeterminante )
            // InternalGramatica.g:202:5: lv_determinante_0_0= ruleDeterminante
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

            // InternalGramatica.g:219:3: ( (lv_atributo_1_0= ruleAtributo ) )
            // InternalGramatica.g:220:4: (lv_atributo_1_0= ruleAtributo )
            {
            // InternalGramatica.g:220:4: (lv_atributo_1_0= ruleAtributo )
            // InternalGramatica.g:221:5: lv_atributo_1_0= ruleAtributo
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

            // InternalGramatica.g:238:3: ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) )
            // InternalGramatica.g:239:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:239:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            // InternalGramatica.g:240:5: lv_Sintagma_2_0= ruleSintagmaPreposicional
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalGramatica.g:257:3: ( (lv_contexto_3_0= ruleClase ) )
            // InternalGramatica.g:258:4: (lv_contexto_3_0= ruleClase )
            {
            // InternalGramatica.g:258:4: (lv_contexto_3_0= ruleClase )
            // InternalGramatica.g:259:5: lv_contexto_3_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalGramatica.g:276:3: ( (lv_obligacion_4_0= ruleObligacion ) )
            // InternalGramatica.g:277:4: (lv_obligacion_4_0= ruleObligacion )
            {
            // InternalGramatica.g:277:4: (lv_obligacion_4_0= ruleObligacion )
            // InternalGramatica.g:278:5: lv_obligacion_4_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalGramatica.g:295:3: ( (lv_operacion_5_0= ruleOperacion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=24)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:296:4: (lv_operacion_5_0= ruleOperacion )
                    {
                    // InternalGramatica.g:296:4: (lv_operacion_5_0= ruleOperacion )
                    // InternalGramatica.g:297:5: lv_operacion_5_0= ruleOperacion
                    {

                    					newCompositeNode(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalGramatica.g:314:3: ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:315:4: ( (lv_literal_6_0= ruleLiteral ) )
                    {
                    // InternalGramatica.g:315:4: ( (lv_literal_6_0= ruleLiteral ) )
                    // InternalGramatica.g:316:5: (lv_literal_6_0= ruleLiteral )
                    {
                    // InternalGramatica.g:316:5: (lv_literal_6_0= ruleLiteral )
                    // InternalGramatica.g:317:6: lv_literal_6_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_11);
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
                    // InternalGramatica.g:335:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    {
                    // InternalGramatica.g:335:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    // InternalGramatica.g:336:5: (lv_atributo_7_0= ruleAtributo )
                    {
                    // InternalGramatica.g:336:5: (lv_atributo_7_0= ruleAtributo )
                    // InternalGramatica.g:337:6: lv_atributo_7_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            // InternalGramatica.g:355:3: ( (lv_finOracion_8_0= ruleFinOracion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:356:4: (lv_finOracion_8_0= ruleFinOracion )
                    {
                    // InternalGramatica.g:356:4: (lv_finOracion_8_0= ruleFinOracion )
                    // InternalGramatica.g:357:5: lv_finOracion_8_0= ruleFinOracion
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
    // InternalGramatica.g:378:1: entryRuleDeterminante returns [EObject current=null] : iv_ruleDeterminante= ruleDeterminante EOF ;
    public final EObject entryRuleDeterminante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterminante = null;


        try {
            // InternalGramatica.g:378:53: (iv_ruleDeterminante= ruleDeterminante EOF )
            // InternalGramatica.g:379:2: iv_ruleDeterminante= ruleDeterminante EOF
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
    // InternalGramatica.g:385:1: ruleDeterminante returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) ) ;
    public final EObject ruleDeterminante() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:391:2: ( ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) ) )
            // InternalGramatica.g:392:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) )
            {
            // InternalGramatica.g:392:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) )
            // InternalGramatica.g:393:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) )
            {
            // InternalGramatica.g:393:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) )
            // InternalGramatica.g:394:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' )
            {
            // InternalGramatica.g:394:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:395:5: lv_descripcion_0_1= 'El/La'
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
                    // InternalGramatica.g:406:5: lv_descripcion_0_2= 'Los/Las'
                    {
                    lv_descripcion_0_2=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeterminanteRule());
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
    // $ANTLR end "ruleDeterminante"


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:422:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:422:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:423:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:429:1: ruleAtributo returns [EObject current=null] : ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:435:2: ( ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGramatica.g:436:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGramatica.g:436:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGramatica.g:437:3: (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGramatica.g:437:3: (otherlv_0= 'Coleccion de' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:438:4: otherlv_0= 'Coleccion de'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getColeccionDeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGramatica.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGramatica.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalGramatica.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleSintagmaPreposicional"
    // InternalGramatica.g:465:1: entryRuleSintagmaPreposicional returns [EObject current=null] : iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF ;
    public final EObject entryRuleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSintagmaPreposicional = null;


        try {
            // InternalGramatica.g:465:62: (iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:466:2: iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF
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
    // InternalGramatica.g:472:1: ruleSintagmaPreposicional returns [EObject current=null] : ( (lv_descripcion_0_0= 'de un/una' ) ) ;
    public final EObject ruleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:478:2: ( ( (lv_descripcion_0_0= 'de un/una' ) ) )
            // InternalGramatica.g:479:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            {
            // InternalGramatica.g:479:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            // InternalGramatica.g:480:3: (lv_descripcion_0_0= 'de un/una' )
            {
            // InternalGramatica.g:480:3: (lv_descripcion_0_0= 'de un/una' )
            // InternalGramatica.g:481:4: lv_descripcion_0_0= 'de un/una'
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
    // InternalGramatica.g:496:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:496:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:497:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalGramatica.g:503:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        EObject lv_negacion_0_0 = null;

        EObject lv_obligacionDeber_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:509:2: ( ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) )
            // InternalGramatica.g:510:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            {
            // InternalGramatica.g:510:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            // InternalGramatica.g:511:3: ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            {
            // InternalGramatica.g:511:3: ( (lv_negacion_0_0= ruleNegacion ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:512:4: (lv_negacion_0_0= ruleNegacion )
                    {
                    // InternalGramatica.g:512:4: (lv_negacion_0_0= ruleNegacion )
                    // InternalGramatica.g:513:5: lv_negacion_0_0= ruleNegacion
                    {

                    					newCompositeNode(grammarAccess.getObligacionAccess().getNegacionNegacionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_8);
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

            // InternalGramatica.g:530:3: ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            // InternalGramatica.g:531:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            {
            // InternalGramatica.g:531:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            // InternalGramatica.g:532:5: lv_obligacionDeber_1_0= ruleObligacionDeber
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
    // InternalGramatica.g:553:1: entryRuleObligacionDeber returns [EObject current=null] : iv_ruleObligacionDeber= ruleObligacionDeber EOF ;
    public final EObject entryRuleObligacionDeber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacionDeber = null;


        try {
            // InternalGramatica.g:553:56: (iv_ruleObligacionDeber= ruleObligacionDeber EOF )
            // InternalGramatica.g:554:2: iv_ruleObligacionDeber= ruleObligacionDeber EOF
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
    // InternalGramatica.g:560:1: ruleObligacionDeber returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) ;
    public final EObject ruleObligacionDeber() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:566:2: ( ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) )
            // InternalGramatica.g:567:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            {
            // InternalGramatica.g:567:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            // InternalGramatica.g:568:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            {
            // InternalGramatica.g:568:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            // InternalGramatica.g:569:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            {
            // InternalGramatica.g:569:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:570:5: lv_descripcion_0_1= 'debe ser'
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
                    // InternalGramatica.g:581:5: lv_descripcion_0_2= 'debe estar'
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
    // InternalGramatica.g:597:1: entryRuleNegacion returns [EObject current=null] : iv_ruleNegacion= ruleNegacion EOF ;
    public final EObject entryRuleNegacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegacion = null;


        try {
            // InternalGramatica.g:597:49: (iv_ruleNegacion= ruleNegacion EOF )
            // InternalGramatica.g:598:2: iv_ruleNegacion= ruleNegacion EOF
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
    // InternalGramatica.g:604:1: ruleNegacion returns [EObject current=null] : ( (lv_descripcion_0_0= 'no' ) ) ;
    public final EObject ruleNegacion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:610:2: ( ( (lv_descripcion_0_0= 'no' ) ) )
            // InternalGramatica.g:611:2: ( (lv_descripcion_0_0= 'no' ) )
            {
            // InternalGramatica.g:611:2: ( (lv_descripcion_0_0= 'no' ) )
            // InternalGramatica.g:612:3: (lv_descripcion_0_0= 'no' )
            {
            // InternalGramatica.g:612:3: (lv_descripcion_0_0= 'no' )
            // InternalGramatica.g:613:4: lv_descripcion_0_0= 'no'
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
    // InternalGramatica.g:628:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalGramatica.g:628:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalGramatica.g:629:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalGramatica.g:635:1: ruleOperacion returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;
        Token lv_descripcion_0_3=null;
        Token lv_descripcion_0_4=null;
        Token lv_descripcion_0_5=null;
        Token lv_descripcion_0_6=null;
        Token lv_descripcion_0_7=null;


        	enterRule();

        try {
            // InternalGramatica.g:641:2: ( ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) )
            // InternalGramatica.g:642:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            {
            // InternalGramatica.g:642:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            // InternalGramatica.g:643:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            {
            // InternalGramatica.g:643:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            // InternalGramatica.g:644:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            {
            // InternalGramatica.g:644:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 23:
                {
                alt10=6;
                }
                break;
            case 24:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:645:5: lv_descripcion_0_1= 'mayor que'
                    {
                    lv_descripcion_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:656:5: lv_descripcion_0_2= 'menor que'
                    {
                    lv_descripcion_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:667:5: lv_descripcion_0_3= 'igual a'
                    {
                    lv_descripcion_0_3=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:678:5: lv_descripcion_0_4= 'mayor o igual a'
                    {
                    lv_descripcion_0_4=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_4, grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:689:5: lv_descripcion_0_5= 'menor o igual a'
                    {
                    lv_descripcion_0_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_5, grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:700:5: lv_descripcion_0_6= 'distinto de'
                    {
                    lv_descripcion_0_6=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_6, grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:711:5: lv_descripcion_0_7= 'al menos'
                    {
                    lv_descripcion_0_7=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_7, grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_7, null);
                    				

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
    // InternalGramatica.g:727:1: entryRuleClase returns [EObject current=null] : iv_ruleClase= ruleClase EOF ;
    public final EObject entryRuleClase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClase = null;


        try {
            // InternalGramatica.g:727:46: (iv_ruleClase= ruleClase EOF )
            // InternalGramatica.g:728:2: iv_ruleClase= ruleClase EOF
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
    // InternalGramatica.g:734:1: ruleClase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:740:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGramatica.g:741:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:741:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGramatica.g:742:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGramatica.g:742:3: (lv_name_0_0= RULE_ID )
            // InternalGramatica.g:743:4: lv_name_0_0= RULE_ID
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
    // InternalGramatica.g:762:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:762:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:763:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGramatica.g:769:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:775:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalGramatica.g:776:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalGramatica.g:776:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:777:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:785:3: this_STRING_1= RULE_STRING
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
    // InternalGramatica.g:796:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalGramatica.g:796:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalGramatica.g:797:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalGramatica.g:803:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramatica.g:809:2: (kw= '.' )
            // InternalGramatica.g:810:2: kw= '.'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalGramatica.g:818:1: entryRuleCompuesta returns [EObject current=null] : iv_ruleCompuesta= ruleCompuesta EOF ;
    public final EObject entryRuleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompuesta = null;


        try {
            // InternalGramatica.g:818:50: (iv_ruleCompuesta= ruleCompuesta EOF )
            // InternalGramatica.g:819:2: iv_ruleCompuesta= ruleCompuesta EOF
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
    // InternalGramatica.g:825:1: ruleCompuesta returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ) ;
    public final EObject ruleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_nexo_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:831:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ) )
            // InternalGramatica.g:832:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) )
            {
            // InternalGramatica.g:832:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) )
            // InternalGramatica.g:833:3: ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) )
            {
            // InternalGramatica.g:833:3: ( (lv_simple_0_0= ruleSimple ) )
            // InternalGramatica.g:834:4: (lv_simple_0_0= ruleSimple )
            {
            // InternalGramatica.g:834:4: (lv_simple_0_0= ruleSimple )
            // InternalGramatica.g:835:5: lv_simple_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_simple_0_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompuestaRule());
            					}
            					set(
            						current,
            						"simple",
            						lv_simple_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:852:3: ( (lv_nexo_1_0= ruleNexo ) )
            // InternalGramatica.g:853:4: (lv_nexo_1_0= ruleNexo )
            {
            // InternalGramatica.g:853:4: (lv_nexo_1_0= ruleNexo )
            // InternalGramatica.g:854:5: lv_nexo_1_0= ruleNexo
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nexo_1_0=ruleNexo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompuestaRule());
            					}
            					set(
            						current,
            						"nexo",
            						lv_nexo_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Nexo");
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
    // $ANTLR end "ruleCompuesta"


    // $ANTLR start "entryRuleNexo"
    // InternalGramatica.g:875:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalGramatica.g:875:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalGramatica.g:876:2: iv_ruleNexo= ruleNexo EOF
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
    // InternalGramatica.g:882:1: ruleNexo returns [EObject current=null] : ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:888:2: ( ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' ) )
            // InternalGramatica.g:889:2: ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' )
            {
            // InternalGramatica.g:889:2: ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:890:3: ( (lv_descripcion_0_0= 'y' ) )
                    {
                    // InternalGramatica.g:890:3: ( (lv_descripcion_0_0= 'y' ) )
                    // InternalGramatica.g:891:4: (lv_descripcion_0_0= 'y' )
                    {
                    // InternalGramatica.g:891:4: (lv_descripcion_0_0= 'y' )
                    // InternalGramatica.g:892:5: lv_descripcion_0_0= 'y'
                    {
                    lv_descripcion_0_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_0, grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_0, "y");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:905:3: otherlv_1= 'o'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getNexoAccess().getOKeyword_1());
                    		

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
    // $ANTLR end "ruleNexo"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\21\uffff\2\26\1\uffff\2\26\2\uffff";
    static final String dfa_3s = "\1\13\3\5\1\16\1\5\2\17\11\4\2\13\1\5\2\13\2\uffff";
    static final String dfa_4s = "\1\14\2\15\1\5\1\16\1\5\1\21\1\20\2\30\7\15\2\33\1\5\2\33\2\uffff";
    static final String dfa_5s = "\26\uffff\1\1\1\2";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\4\7\uffff\1\3",
            "\1\4\7\uffff\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\11\1\7",
            "\1\10\1\11",
            "\1\22\1\24\1\21\6\uffff\1\23\4\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\22\1\24\1\21\6\uffff\1\23\4\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\1\22\1\24\1\21\6\uffff\1\23",
            "\2\26\14\uffff\1\25\2\27",
            "\2\26\14\uffff\1\25\2\27",
            "\1\24",
            "\2\26\14\uffff\1\25\2\27",
            "\2\26\15\uffff\2\27",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "152:2: ( ( (lv_contenido_0_0= ruleSimple ) ) | this_Compuesta_1= ruleCompuesta )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FC2070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C000000L});

}