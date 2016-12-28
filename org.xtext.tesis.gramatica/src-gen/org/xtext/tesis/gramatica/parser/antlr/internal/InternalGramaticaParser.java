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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'y'", "'o'", "'.\\r\\n'", "'El/La'", "'de'", "'un/una'", "'no'", "'debe ser'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'"
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

                if ( (LA1_0==14) ) {
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
    // InternalGramatica.g:145:1: ruleOracion returns [EObject current=null] : ( ( ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) ) ) ruleFinOracion ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject lv_contenido_0_1 = null;

        EObject lv_contenido_0_2 = null;



        	enterRule();

        try {
            // InternalGramatica.g:151:2: ( ( ( ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) ) ) ruleFinOracion ) )
            // InternalGramatica.g:152:2: ( ( ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) ) ) ruleFinOracion )
            {
            // InternalGramatica.g:152:2: ( ( ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) ) ) ruleFinOracion )
            // InternalGramatica.g:153:3: ( ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) ) ) ruleFinOracion
            {
            // InternalGramatica.g:153:3: ( ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) ) )
            // InternalGramatica.g:154:4: ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) )
            {
            // InternalGramatica.g:154:4: ( (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple ) )
            // InternalGramatica.g:155:5: (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple )
            {
            // InternalGramatica.g:155:5: (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:156:6: lv_contenido_0_1= ruleCompuesta
                    {

                    						newCompositeNode(grammarAccess.getOracionAccess().getContenidoCompuestaParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_contenido_0_1=ruleCompuesta();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracionRule());
                    						}
                    						set(
                    							current,
                    							"contenido",
                    							lv_contenido_0_1,
                    							"org.xtext.tesis.gramatica.Gramatica.Compuesta");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:172:6: lv_contenido_0_2= ruleSimple
                    {

                    						newCompositeNode(grammarAccess.getOracionAccess().getContenidoSimpleParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_contenido_0_2=ruleSimple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracionRule());
                    						}
                    						set(
                    							current,
                    							"contenido",
                    							lv_contenido_0_2,
                    							"org.xtext.tesis.gramatica.Gramatica.Simple");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            			newCompositeNode(grammarAccess.getOracionAccess().getFinOracionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            ruleFinOracion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // InternalGramatica.g:201:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:201:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:202:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:208:1: ruleSimple returns [EObject current=null] : ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_obligacion_3_0= ruleObligacion ) ) ( (lv_operacion_4_0= ruleOperacion ) ) ( (lv_literal_5_0= ruleLiteral ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        EObject lv_determinante_0_0 = null;

        EObject lv_atributo_1_0 = null;

        EObject lv_sintagma_2_0 = null;

        EObject lv_obligacion_3_0 = null;

        EObject lv_operacion_4_0 = null;

        EObject lv_literal_5_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:214:2: ( ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_obligacion_3_0= ruleObligacion ) ) ( (lv_operacion_4_0= ruleOperacion ) ) ( (lv_literal_5_0= ruleLiteral ) ) ) )
            // InternalGramatica.g:215:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_obligacion_3_0= ruleObligacion ) ) ( (lv_operacion_4_0= ruleOperacion ) ) ( (lv_literal_5_0= ruleLiteral ) ) )
            {
            // InternalGramatica.g:215:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_obligacion_3_0= ruleObligacion ) ) ( (lv_operacion_4_0= ruleOperacion ) ) ( (lv_literal_5_0= ruleLiteral ) ) )
            // InternalGramatica.g:216:3: ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_obligacion_3_0= ruleObligacion ) ) ( (lv_operacion_4_0= ruleOperacion ) ) ( (lv_literal_5_0= ruleLiteral ) )
            {
            // InternalGramatica.g:216:3: ( (lv_determinante_0_0= ruleDeterminante ) )
            // InternalGramatica.g:217:4: (lv_determinante_0_0= ruleDeterminante )
            {
            // InternalGramatica.g:217:4: (lv_determinante_0_0= ruleDeterminante )
            // InternalGramatica.g:218:5: lv_determinante_0_0= ruleDeterminante
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getDeterminanteDeterminanteParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalGramatica.g:235:3: ( (lv_atributo_1_0= ruleAtributo ) )
            // InternalGramatica.g:236:4: (lv_atributo_1_0= ruleAtributo )
            {
            // InternalGramatica.g:236:4: (lv_atributo_1_0= ruleAtributo )
            // InternalGramatica.g:237:5: lv_atributo_1_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalGramatica.g:254:3: ( (lv_sintagma_2_0= ruleSintagmaPreposicional ) )
            // InternalGramatica.g:255:4: (lv_sintagma_2_0= ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:255:4: (lv_sintagma_2_0= ruleSintagmaPreposicional )
            // InternalGramatica.g:256:5: lv_sintagma_2_0= ruleSintagmaPreposicional
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_sintagma_2_0=ruleSintagmaPreposicional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"sintagma",
            						lv_sintagma_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.SintagmaPreposicional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:273:3: ( (lv_obligacion_3_0= ruleObligacion ) )
            // InternalGramatica.g:274:4: (lv_obligacion_3_0= ruleObligacion )
            {
            // InternalGramatica.g:274:4: (lv_obligacion_3_0= ruleObligacion )
            // InternalGramatica.g:275:5: lv_obligacion_3_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_obligacion_3_0=ruleObligacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"obligacion",
            						lv_obligacion_3_0,
            						"org.xtext.tesis.gramatica.Gramatica.Obligacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:292:3: ( (lv_operacion_4_0= ruleOperacion ) )
            // InternalGramatica.g:293:4: (lv_operacion_4_0= ruleOperacion )
            {
            // InternalGramatica.g:293:4: (lv_operacion_4_0= ruleOperacion )
            // InternalGramatica.g:294:5: lv_operacion_4_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_operacion_4_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"operacion",
            						lv_operacion_4_0,
            						"org.xtext.tesis.gramatica.Gramatica.Operacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:311:3: ( (lv_literal_5_0= ruleLiteral ) )
            // InternalGramatica.g:312:4: (lv_literal_5_0= ruleLiteral )
            {
            // InternalGramatica.g:312:4: (lv_literal_5_0= ruleLiteral )
            // InternalGramatica.g:313:5: lv_literal_5_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_literal_5_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_5_0,
            						"org.xtext.tesis.gramatica.Gramatica.Literal");
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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleCompuesta"
    // InternalGramatica.g:334:1: entryRuleCompuesta returns [EObject current=null] : iv_ruleCompuesta= ruleCompuesta EOF ;
    public final EObject entryRuleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompuesta = null;


        try {
            // InternalGramatica.g:334:50: (iv_ruleCompuesta= ruleCompuesta EOF )
            // InternalGramatica.g:335:2: iv_ruleCompuesta= ruleCompuesta EOF
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
    // InternalGramatica.g:341:1: ruleCompuesta returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ( (lv_oracion_2_0= ruleOracion ) ) ) ;
    public final EObject ruleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_nexo_1_0 = null;

        EObject lv_oracion_2_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:347:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ( (lv_oracion_2_0= ruleOracion ) ) ) )
            // InternalGramatica.g:348:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ( (lv_oracion_2_0= ruleOracion ) ) )
            {
            // InternalGramatica.g:348:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ( (lv_oracion_2_0= ruleOracion ) ) )
            // InternalGramatica.g:349:3: ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ( (lv_oracion_2_0= ruleOracion ) )
            {
            // InternalGramatica.g:349:3: ( (lv_simple_0_0= ruleSimple ) )
            // InternalGramatica.g:350:4: (lv_simple_0_0= ruleSimple )
            {
            // InternalGramatica.g:350:4: (lv_simple_0_0= ruleSimple )
            // InternalGramatica.g:351:5: lv_simple_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalGramatica.g:368:3: ( (lv_nexo_1_0= ruleNexo ) )
            // InternalGramatica.g:369:4: (lv_nexo_1_0= ruleNexo )
            {
            // InternalGramatica.g:369:4: (lv_nexo_1_0= ruleNexo )
            // InternalGramatica.g:370:5: lv_nexo_1_0= ruleNexo
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalGramatica.g:387:3: ( (lv_oracion_2_0= ruleOracion ) )
            // InternalGramatica.g:388:4: (lv_oracion_2_0= ruleOracion )
            {
            // InternalGramatica.g:388:4: (lv_oracion_2_0= ruleOracion )
            // InternalGramatica.g:389:5: lv_oracion_2_0= ruleOracion
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getOracionOracionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_oracion_2_0=ruleOracion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompuestaRule());
            					}
            					set(
            						current,
            						"oracion",
            						lv_oracion_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.Oracion");
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
    // InternalGramatica.g:410:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalGramatica.g:410:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalGramatica.g:411:2: iv_ruleNexo= ruleNexo EOF
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
    // InternalGramatica.g:417:1: ruleNexo returns [EObject current=null] : ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_1=null;
        Token lv_valor_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:423:2: ( ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) ) )
            // InternalGramatica.g:424:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) )
            {
            // InternalGramatica.g:424:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) )
            // InternalGramatica.g:425:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) )
            {
            // InternalGramatica.g:425:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) )
            // InternalGramatica.g:426:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' )
            {
            // InternalGramatica.g:426:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:427:5: lv_valor_0_1= 'y'
                    {
                    lv_valor_0_1=(Token)match(input,11,FOLLOW_2); 

                    					newLeafNode(lv_valor_0_1, grammarAccess.getNexoAccess().getValorYKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "valor", lv_valor_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:438:5: lv_valor_0_2= 'o'
                    {
                    lv_valor_0_2=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_valor_0_2, grammarAccess.getNexoAccess().getValorOKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "valor", lv_valor_0_2, null);
                    				

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


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:454:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalGramatica.g:454:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalGramatica.g:455:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalGramatica.g:461:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.\\r\\n' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramatica.g:467:2: (kw= '.\\r\\n' )
            // InternalGramatica.g:468:2: kw= '.\\r\\n'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFinOracionAccess().getFullStopControl000dControl000aKeyword());
            	

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


    // $ANTLR start "entryRuleDeterminante"
    // InternalGramatica.g:476:1: entryRuleDeterminante returns [EObject current=null] : iv_ruleDeterminante= ruleDeterminante EOF ;
    public final EObject entryRuleDeterminante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterminante = null;


        try {
            // InternalGramatica.g:476:53: (iv_ruleDeterminante= ruleDeterminante EOF )
            // InternalGramatica.g:477:2: iv_ruleDeterminante= ruleDeterminante EOF
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
    // InternalGramatica.g:483:1: ruleDeterminante returns [EObject current=null] : ( (lv_valor_0_0= 'El/La' ) ) ;
    public final EObject ruleDeterminante() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:489:2: ( ( (lv_valor_0_0= 'El/La' ) ) )
            // InternalGramatica.g:490:2: ( (lv_valor_0_0= 'El/La' ) )
            {
            // InternalGramatica.g:490:2: ( (lv_valor_0_0= 'El/La' ) )
            // InternalGramatica.g:491:3: (lv_valor_0_0= 'El/La' )
            {
            // InternalGramatica.g:491:3: (lv_valor_0_0= 'El/La' )
            // InternalGramatica.g:492:4: lv_valor_0_0= 'El/La'
            {
            lv_valor_0_0=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(lv_valor_0_0, grammarAccess.getDeterminanteAccess().getValorElLaKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeterminanteRule());
            				}
            				setWithLastConsumed(current, "valor", lv_valor_0_0, "El/La");
            			

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
    // InternalGramatica.g:507:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:507:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:508:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:514:1: ruleAtributo returns [EObject current=null] : ( (lv_nombre_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:520:2: ( ( (lv_nombre_0_0= RULE_ID ) ) )
            // InternalGramatica.g:521:2: ( (lv_nombre_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:521:2: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalGramatica.g:522:3: (lv_nombre_0_0= RULE_ID )
            {
            // InternalGramatica.g:522:3: (lv_nombre_0_0= RULE_ID )
            // InternalGramatica.g:523:4: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_nombre_0_0, grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtributoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nombre",
            					lv_nombre_0_0,
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
    // InternalGramatica.g:542:1: entryRuleSintagmaPreposicional returns [EObject current=null] : iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF ;
    public final EObject entryRuleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSintagmaPreposicional = null;


        try {
            // InternalGramatica.g:542:62: (iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:543:2: iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF
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
    // InternalGramatica.g:549:1: ruleSintagmaPreposicional returns [EObject current=null] : ( ( (lv_enlace_0_0= ruleEnlace ) ) ( (lv_termino_1_0= ruleTermino ) ) ) ;
    public final EObject ruleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        EObject lv_enlace_0_0 = null;

        EObject lv_termino_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:555:2: ( ( ( (lv_enlace_0_0= ruleEnlace ) ) ( (lv_termino_1_0= ruleTermino ) ) ) )
            // InternalGramatica.g:556:2: ( ( (lv_enlace_0_0= ruleEnlace ) ) ( (lv_termino_1_0= ruleTermino ) ) )
            {
            // InternalGramatica.g:556:2: ( ( (lv_enlace_0_0= ruleEnlace ) ) ( (lv_termino_1_0= ruleTermino ) ) )
            // InternalGramatica.g:557:3: ( (lv_enlace_0_0= ruleEnlace ) ) ( (lv_termino_1_0= ruleTermino ) )
            {
            // InternalGramatica.g:557:3: ( (lv_enlace_0_0= ruleEnlace ) )
            // InternalGramatica.g:558:4: (lv_enlace_0_0= ruleEnlace )
            {
            // InternalGramatica.g:558:4: (lv_enlace_0_0= ruleEnlace )
            // InternalGramatica.g:559:5: lv_enlace_0_0= ruleEnlace
            {

            					newCompositeNode(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceEnlaceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_enlace_0_0=ruleEnlace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSintagmaPreposicionalRule());
            					}
            					set(
            						current,
            						"enlace",
            						lv_enlace_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Enlace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:576:3: ( (lv_termino_1_0= ruleTermino ) )
            // InternalGramatica.g:577:4: (lv_termino_1_0= ruleTermino )
            {
            // InternalGramatica.g:577:4: (lv_termino_1_0= ruleTermino )
            // InternalGramatica.g:578:5: lv_termino_1_0= ruleTermino
            {

            					newCompositeNode(grammarAccess.getSintagmaPreposicionalAccess().getTerminoTerminoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_termino_1_0=ruleTermino();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSintagmaPreposicionalRule());
            					}
            					set(
            						current,
            						"termino",
            						lv_termino_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Termino");
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
    // $ANTLR end "ruleSintagmaPreposicional"


    // $ANTLR start "entryRuleEnlace"
    // InternalGramatica.g:599:1: entryRuleEnlace returns [EObject current=null] : iv_ruleEnlace= ruleEnlace EOF ;
    public final EObject entryRuleEnlace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnlace = null;


        try {
            // InternalGramatica.g:599:47: (iv_ruleEnlace= ruleEnlace EOF )
            // InternalGramatica.g:600:2: iv_ruleEnlace= ruleEnlace EOF
            {
             newCompositeNode(grammarAccess.getEnlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnlace=ruleEnlace();

            state._fsp--;

             current =iv_ruleEnlace; 
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
    // $ANTLR end "entryRuleEnlace"


    // $ANTLR start "ruleEnlace"
    // InternalGramatica.g:606:1: ruleEnlace returns [EObject current=null] : ( (lv_valor_0_0= 'de' ) ) ;
    public final EObject ruleEnlace() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:612:2: ( ( (lv_valor_0_0= 'de' ) ) )
            // InternalGramatica.g:613:2: ( (lv_valor_0_0= 'de' ) )
            {
            // InternalGramatica.g:613:2: ( (lv_valor_0_0= 'de' ) )
            // InternalGramatica.g:614:3: (lv_valor_0_0= 'de' )
            {
            // InternalGramatica.g:614:3: (lv_valor_0_0= 'de' )
            // InternalGramatica.g:615:4: lv_valor_0_0= 'de'
            {
            lv_valor_0_0=(Token)match(input,15,FOLLOW_2); 

            				newLeafNode(lv_valor_0_0, grammarAccess.getEnlaceAccess().getValorDeKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnlaceRule());
            				}
            				setWithLastConsumed(current, "valor", lv_valor_0_0, "de");
            			

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
    // $ANTLR end "ruleEnlace"


    // $ANTLR start "entryRuleTermino"
    // InternalGramatica.g:630:1: entryRuleTermino returns [EObject current=null] : iv_ruleTermino= ruleTermino EOF ;
    public final EObject entryRuleTermino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermino = null;


        try {
            // InternalGramatica.g:630:48: (iv_ruleTermino= ruleTermino EOF )
            // InternalGramatica.g:631:2: iv_ruleTermino= ruleTermino EOF
            {
             newCompositeNode(grammarAccess.getTerminoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermino=ruleTermino();

            state._fsp--;

             current =iv_ruleTermino; 
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
    // $ANTLR end "entryRuleTermino"


    // $ANTLR start "ruleTermino"
    // InternalGramatica.g:637:1: ruleTermino returns [EObject current=null] : ( ( (lv_indeterminante_0_0= ruleIndeterminante ) ) ( (lv_contexto_1_0= ruleContexto ) ) ) ;
    public final EObject ruleTermino() throws RecognitionException {
        EObject current = null;

        EObject lv_indeterminante_0_0 = null;

        EObject lv_contexto_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:643:2: ( ( ( (lv_indeterminante_0_0= ruleIndeterminante ) ) ( (lv_contexto_1_0= ruleContexto ) ) ) )
            // InternalGramatica.g:644:2: ( ( (lv_indeterminante_0_0= ruleIndeterminante ) ) ( (lv_contexto_1_0= ruleContexto ) ) )
            {
            // InternalGramatica.g:644:2: ( ( (lv_indeterminante_0_0= ruleIndeterminante ) ) ( (lv_contexto_1_0= ruleContexto ) ) )
            // InternalGramatica.g:645:3: ( (lv_indeterminante_0_0= ruleIndeterminante ) ) ( (lv_contexto_1_0= ruleContexto ) )
            {
            // InternalGramatica.g:645:3: ( (lv_indeterminante_0_0= ruleIndeterminante ) )
            // InternalGramatica.g:646:4: (lv_indeterminante_0_0= ruleIndeterminante )
            {
            // InternalGramatica.g:646:4: (lv_indeterminante_0_0= ruleIndeterminante )
            // InternalGramatica.g:647:5: lv_indeterminante_0_0= ruleIndeterminante
            {

            					newCompositeNode(grammarAccess.getTerminoAccess().getIndeterminanteIndeterminanteParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_indeterminante_0_0=ruleIndeterminante();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminoRule());
            					}
            					set(
            						current,
            						"indeterminante",
            						lv_indeterminante_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Indeterminante");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:664:3: ( (lv_contexto_1_0= ruleContexto ) )
            // InternalGramatica.g:665:4: (lv_contexto_1_0= ruleContexto )
            {
            // InternalGramatica.g:665:4: (lv_contexto_1_0= ruleContexto )
            // InternalGramatica.g:666:5: lv_contexto_1_0= ruleContexto
            {

            					newCompositeNode(grammarAccess.getTerminoAccess().getContextoContextoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_contexto_1_0=ruleContexto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminoRule());
            					}
            					set(
            						current,
            						"contexto",
            						lv_contexto_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Contexto");
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
    // $ANTLR end "ruleTermino"


    // $ANTLR start "entryRuleIndeterminante"
    // InternalGramatica.g:687:1: entryRuleIndeterminante returns [EObject current=null] : iv_ruleIndeterminante= ruleIndeterminante EOF ;
    public final EObject entryRuleIndeterminante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndeterminante = null;


        try {
            // InternalGramatica.g:687:55: (iv_ruleIndeterminante= ruleIndeterminante EOF )
            // InternalGramatica.g:688:2: iv_ruleIndeterminante= ruleIndeterminante EOF
            {
             newCompositeNode(grammarAccess.getIndeterminanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndeterminante=ruleIndeterminante();

            state._fsp--;

             current =iv_ruleIndeterminante; 
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
    // $ANTLR end "entryRuleIndeterminante"


    // $ANTLR start "ruleIndeterminante"
    // InternalGramatica.g:694:1: ruleIndeterminante returns [EObject current=null] : ( (lv_valor_0_0= 'un/una' ) ) ;
    public final EObject ruleIndeterminante() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:700:2: ( ( (lv_valor_0_0= 'un/una' ) ) )
            // InternalGramatica.g:701:2: ( (lv_valor_0_0= 'un/una' ) )
            {
            // InternalGramatica.g:701:2: ( (lv_valor_0_0= 'un/una' ) )
            // InternalGramatica.g:702:3: (lv_valor_0_0= 'un/una' )
            {
            // InternalGramatica.g:702:3: (lv_valor_0_0= 'un/una' )
            // InternalGramatica.g:703:4: lv_valor_0_0= 'un/una'
            {
            lv_valor_0_0=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(lv_valor_0_0, grammarAccess.getIndeterminanteAccess().getValorUnUnaKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIndeterminanteRule());
            				}
            				setWithLastConsumed(current, "valor", lv_valor_0_0, "un/una");
            			

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
    // $ANTLR end "ruleIndeterminante"


    // $ANTLR start "entryRuleObligacion"
    // InternalGramatica.g:718:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:718:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:719:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalGramatica.g:725:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacionDeber_1_0= 'debe ser' ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacion_0_0=null;
        Token lv_obligacionDeber_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:731:2: ( ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacionDeber_1_0= 'debe ser' ) ) ) )
            // InternalGramatica.g:732:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacionDeber_1_0= 'debe ser' ) ) )
            {
            // InternalGramatica.g:732:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacionDeber_1_0= 'debe ser' ) ) )
            // InternalGramatica.g:733:3: ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacionDeber_1_0= 'debe ser' ) )
            {
            // InternalGramatica.g:733:3: ( (lv_negacion_0_0= 'no' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:734:4: (lv_negacion_0_0= 'no' )
                    {
                    // InternalGramatica.g:734:4: (lv_negacion_0_0= 'no' )
                    // InternalGramatica.g:735:5: lv_negacion_0_0= 'no'
                    {
                    lv_negacion_0_0=(Token)match(input,17,FOLLOW_13); 

                    					newLeafNode(lv_negacion_0_0, grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionRule());
                    					}
                    					setWithLastConsumed(current, "negacion", lv_negacion_0_0, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:747:3: ( (lv_obligacionDeber_1_0= 'debe ser' ) )
            // InternalGramatica.g:748:4: (lv_obligacionDeber_1_0= 'debe ser' )
            {
            // InternalGramatica.g:748:4: (lv_obligacionDeber_1_0= 'debe ser' )
            // InternalGramatica.g:749:5: lv_obligacionDeber_1_0= 'debe ser'
            {
            lv_obligacionDeber_1_0=(Token)match(input,18,FOLLOW_2); 

            					newLeafNode(lv_obligacionDeber_1_0, grammarAccess.getObligacionAccess().getObligacionDeberDebeSerKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObligacionRule());
            					}
            					setWithLastConsumed(current, "obligacionDeber", lv_obligacionDeber_1_0, "debe ser");
            				

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


    // $ANTLR start "entryRuleOperacion"
    // InternalGramatica.g:765:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalGramatica.g:765:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalGramatica.g:766:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalGramatica.g:772:1: ruleOperacion returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) ;
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
            // InternalGramatica.g:778:2: ( ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) )
            // InternalGramatica.g:779:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            {
            // InternalGramatica.g:779:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            // InternalGramatica.g:780:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            {
            // InternalGramatica.g:780:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            // InternalGramatica.g:781:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            {
            // InternalGramatica.g:781:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            case 25:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:782:5: lv_descripcion_0_1= 'mayor que'
                    {
                    lv_descripcion_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:793:5: lv_descripcion_0_2= 'menor que'
                    {
                    lv_descripcion_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:804:5: lv_descripcion_0_3= 'igual a'
                    {
                    lv_descripcion_0_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:815:5: lv_descripcion_0_4= 'mayor o igual a'
                    {
                    lv_descripcion_0_4=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_4, grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:826:5: lv_descripcion_0_5= 'menor o igual a'
                    {
                    lv_descripcion_0_5=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_5, grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:837:5: lv_descripcion_0_6= 'distinto de'
                    {
                    lv_descripcion_0_6=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_6, grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:848:5: lv_descripcion_0_7= 'al menos'
                    {
                    lv_descripcion_0_7=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContexto"
    // InternalGramatica.g:864:1: entryRuleContexto returns [EObject current=null] : iv_ruleContexto= ruleContexto EOF ;
    public final EObject entryRuleContexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContexto = null;


        try {
            // InternalGramatica.g:864:49: (iv_ruleContexto= ruleContexto EOF )
            // InternalGramatica.g:865:2: iv_ruleContexto= ruleContexto EOF
            {
             newCompositeNode(grammarAccess.getContextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContexto=ruleContexto();

            state._fsp--;

             current =iv_ruleContexto; 
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
    // $ANTLR end "entryRuleContexto"


    // $ANTLR start "ruleContexto"
    // InternalGramatica.g:871:1: ruleContexto returns [EObject current=null] : ( (lv_nombre_0_0= RULE_ID ) ) ;
    public final EObject ruleContexto() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:877:2: ( ( (lv_nombre_0_0= RULE_ID ) ) )
            // InternalGramatica.g:878:2: ( (lv_nombre_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:878:2: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalGramatica.g:879:3: (lv_nombre_0_0= RULE_ID )
            {
            // InternalGramatica.g:879:3: (lv_nombre_0_0= RULE_ID )
            // InternalGramatica.g:880:4: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_nombre_0_0, grammarAccess.getContextoAccess().getNombreIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getContextoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nombre",
            					lv_nombre_0_0,
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
    // $ANTLR end "ruleContexto"


    // $ANTLR start "entryRuleLiteral"
    // InternalGramatica.g:899:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:899:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:900:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // InternalGramatica.g:906:1: ruleLiteral returns [EObject current=null] : ( (lv_valor_0_0= RULE_STRING ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:912:2: ( ( (lv_valor_0_0= RULE_STRING ) ) )
            // InternalGramatica.g:913:2: ( (lv_valor_0_0= RULE_STRING ) )
            {
            // InternalGramatica.g:913:2: ( (lv_valor_0_0= RULE_STRING ) )
            // InternalGramatica.g:914:3: (lv_valor_0_0= RULE_STRING )
            {
            // InternalGramatica.g:914:3: (lv_valor_0_0= RULE_STRING )
            // InternalGramatica.g:915:4: lv_valor_0_0= RULE_STRING
            {
            lv_valor_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_valor_0_0, grammarAccess.getLiteralAccess().getValorSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"valor",
            					lv_valor_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleLiteral"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\16\1\5\1\17\1\20\1\5\1\21\1\22\1\23\7\4\1\13\2\uffff";
    static final String dfa_3s = "\1\16\1\5\1\17\1\20\1\5\2\22\1\31\7\4\1\15\2\uffff";
    static final String dfa_4s = "\20\uffff\1\1\1\2";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\7",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\2\20\1\21",
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
            return "155:5: (lv_contenido_0_1= ruleCompuesta | lv_contenido_0_2= ruleSimple )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}