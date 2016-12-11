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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pathModelo:'", "'pathOcl:'", "'.'", "'El/La'", "'Los/Las'", "'Coleccion de'", "'de un/una'", "'debe ser'", "'debe estar'", "'no'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'"
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
    // InternalGramatica.g:71:1: ruleDocumento returns [EObject current=null] : ( ( (lv_pathModelo_0_0= 'pathModelo:' ) ) this_STRING_1= RULE_STRING ( (lv_pathOcl_2_0= 'pathOcl:' ) ) this_STRING_3= RULE_STRING ( (lv_oraciones_4_0= ruleOracion ) )* ) ;
    public final EObject ruleDocumento() throws RecognitionException {
        EObject current = null;

        Token lv_pathModelo_0_0=null;
        Token this_STRING_1=null;
        Token lv_pathOcl_2_0=null;
        Token this_STRING_3=null;
        EObject lv_oraciones_4_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:77:2: ( ( ( (lv_pathModelo_0_0= 'pathModelo:' ) ) this_STRING_1= RULE_STRING ( (lv_pathOcl_2_0= 'pathOcl:' ) ) this_STRING_3= RULE_STRING ( (lv_oraciones_4_0= ruleOracion ) )* ) )
            // InternalGramatica.g:78:2: ( ( (lv_pathModelo_0_0= 'pathModelo:' ) ) this_STRING_1= RULE_STRING ( (lv_pathOcl_2_0= 'pathOcl:' ) ) this_STRING_3= RULE_STRING ( (lv_oraciones_4_0= ruleOracion ) )* )
            {
            // InternalGramatica.g:78:2: ( ( (lv_pathModelo_0_0= 'pathModelo:' ) ) this_STRING_1= RULE_STRING ( (lv_pathOcl_2_0= 'pathOcl:' ) ) this_STRING_3= RULE_STRING ( (lv_oraciones_4_0= ruleOracion ) )* )
            // InternalGramatica.g:79:3: ( (lv_pathModelo_0_0= 'pathModelo:' ) ) this_STRING_1= RULE_STRING ( (lv_pathOcl_2_0= 'pathOcl:' ) ) this_STRING_3= RULE_STRING ( (lv_oraciones_4_0= ruleOracion ) )*
            {
            // InternalGramatica.g:79:3: ( (lv_pathModelo_0_0= 'pathModelo:' ) )
            // InternalGramatica.g:80:4: (lv_pathModelo_0_0= 'pathModelo:' )
            {
            // InternalGramatica.g:80:4: (lv_pathModelo_0_0= 'pathModelo:' )
            // InternalGramatica.g:81:5: lv_pathModelo_0_0= 'pathModelo:'
            {
            lv_pathModelo_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_pathModelo_0_0, grammarAccess.getDocumentoAccess().getPathModeloPathModeloKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentoRule());
            					}
            					setWithLastConsumed(current, "pathModelo", lv_pathModelo_0_0, "pathModelo:");
            				

            }


            }

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(this_STRING_1, grammarAccess.getDocumentoAccess().getSTRINGTerminalRuleCall_1());
            		
            // InternalGramatica.g:97:3: ( (lv_pathOcl_2_0= 'pathOcl:' ) )
            // InternalGramatica.g:98:4: (lv_pathOcl_2_0= 'pathOcl:' )
            {
            // InternalGramatica.g:98:4: (lv_pathOcl_2_0= 'pathOcl:' )
            // InternalGramatica.g:99:5: lv_pathOcl_2_0= 'pathOcl:'
            {
            lv_pathOcl_2_0=(Token)match(input,12,FOLLOW_3); 

            					newLeafNode(lv_pathOcl_2_0, grammarAccess.getDocumentoAccess().getPathOclPathOclKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentoRule());
            					}
            					setWithLastConsumed(current, "pathOcl", lv_pathOcl_2_0, "pathOcl:");
            				

            }


            }

            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(this_STRING_3, grammarAccess.getDocumentoAccess().getSTRINGTerminalRuleCall_3());
            		
            // InternalGramatica.g:115:3: ( (lv_oraciones_4_0= ruleOracion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:116:4: (lv_oraciones_4_0= ruleOracion )
            	    {
            	    // InternalGramatica.g:116:4: (lv_oraciones_4_0= ruleOracion )
            	    // InternalGramatica.g:117:5: lv_oraciones_4_0= ruleOracion
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_oraciones_4_0=ruleOracion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"oraciones",
            	    						lv_oraciones_4_0,
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
    // InternalGramatica.g:145:1: ruleOracion returns [EObject current=null] : this_Simple_0= ruleSimple ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:151:2: (this_Simple_0= ruleSimple )
            // InternalGramatica.g:152:2: this_Simple_0= ruleSimple
            {

            		newCompositeNode(grammarAccess.getOracionAccess().getSimpleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Simple_0=ruleSimple();

            state._fsp--;


            		current = this_Simple_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalGramatica.g:163:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:163:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:164:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:170:1: ruleSimple returns [EObject current=null] : ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) otherlv_8= '.' ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject lv_determinante_0_0 = null;

        EObject lv_atributo_1_0 = null;

        EObject lv_Sintagma_2_0 = null;

        EObject lv_contexto_3_0 = null;

        EObject lv_obligacion_4_0 = null;

        EObject lv_operacion_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_6_0 = null;

        EObject lv_atributo_7_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:176:2: ( ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) otherlv_8= '.' ) )
            // InternalGramatica.g:177:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) otherlv_8= '.' )
            {
            // InternalGramatica.g:177:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) otherlv_8= '.' )
            // InternalGramatica.g:178:3: ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) otherlv_8= '.'
            {
            // InternalGramatica.g:178:3: ( (lv_determinante_0_0= ruleDeterminante ) )
            // InternalGramatica.g:179:4: (lv_determinante_0_0= ruleDeterminante )
            {
            // InternalGramatica.g:179:4: (lv_determinante_0_0= ruleDeterminante )
            // InternalGramatica.g:180:5: lv_determinante_0_0= ruleDeterminante
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

            // InternalGramatica.g:197:3: ( (lv_atributo_1_0= ruleAtributo ) )
            // InternalGramatica.g:198:4: (lv_atributo_1_0= ruleAtributo )
            {
            // InternalGramatica.g:198:4: (lv_atributo_1_0= ruleAtributo )
            // InternalGramatica.g:199:5: lv_atributo_1_0= ruleAtributo
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

            // InternalGramatica.g:216:3: ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) )
            // InternalGramatica.g:217:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:217:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            // InternalGramatica.g:218:5: lv_Sintagma_2_0= ruleSintagmaPreposicional
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalGramatica.g:235:3: ( (lv_contexto_3_0= ruleClase ) )
            // InternalGramatica.g:236:4: (lv_contexto_3_0= ruleClase )
            {
            // InternalGramatica.g:236:4: (lv_contexto_3_0= ruleClase )
            // InternalGramatica.g:237:5: lv_contexto_3_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalGramatica.g:254:3: ( (lv_obligacion_4_0= ruleObligacion ) )
            // InternalGramatica.g:255:4: (lv_obligacion_4_0= ruleObligacion )
            {
            // InternalGramatica.g:255:4: (lv_obligacion_4_0= ruleObligacion )
            // InternalGramatica.g:256:5: lv_obligacion_4_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalGramatica.g:273:3: ( (lv_operacion_5_0= ruleOperacion ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=21 && LA2_0<=27)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:274:4: (lv_operacion_5_0= ruleOperacion )
                    {
                    // InternalGramatica.g:274:4: (lv_operacion_5_0= ruleOperacion )
                    // InternalGramatica.g:275:5: lv_operacion_5_0= ruleOperacion
                    {

                    					newCompositeNode(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_11);
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

            // InternalGramatica.g:292:3: ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING||LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:293:4: ( (lv_literal_6_0= ruleLiteral ) )
                    {
                    // InternalGramatica.g:293:4: ( (lv_literal_6_0= ruleLiteral ) )
                    // InternalGramatica.g:294:5: (lv_literal_6_0= ruleLiteral )
                    {
                    // InternalGramatica.g:294:5: (lv_literal_6_0= ruleLiteral )
                    // InternalGramatica.g:295:6: lv_literal_6_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_12);
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
                    // InternalGramatica.g:313:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    {
                    // InternalGramatica.g:313:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    // InternalGramatica.g:314:5: (lv_atributo_7_0= ruleAtributo )
                    {
                    // InternalGramatica.g:314:5: (lv_atributo_7_0= ruleAtributo )
                    // InternalGramatica.g:315:6: lv_atributo_7_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSimpleAccess().getFullStopKeyword_7());
            		

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
    // InternalGramatica.g:341:1: entryRuleDeterminante returns [EObject current=null] : iv_ruleDeterminante= ruleDeterminante EOF ;
    public final EObject entryRuleDeterminante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterminante = null;


        try {
            // InternalGramatica.g:341:53: (iv_ruleDeterminante= ruleDeterminante EOF )
            // InternalGramatica.g:342:2: iv_ruleDeterminante= ruleDeterminante EOF
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
    // InternalGramatica.g:348:1: ruleDeterminante returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) ) ;
    public final EObject ruleDeterminante() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:354:2: ( ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) ) )
            // InternalGramatica.g:355:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) )
            {
            // InternalGramatica.g:355:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) )
            // InternalGramatica.g:356:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) )
            {
            // InternalGramatica.g:356:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) )
            // InternalGramatica.g:357:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' )
            {
            // InternalGramatica.g:357:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:358:5: lv_descripcion_0_1= 'El/La'
                    {
                    lv_descripcion_0_1=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeterminanteRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:369:5: lv_descripcion_0_2= 'Los/Las'
                    {
                    lv_descripcion_0_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGramatica.g:385:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:385:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:386:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:392:1: ruleAtributo returns [EObject current=null] : ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:398:2: ( ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGramatica.g:399:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGramatica.g:399:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGramatica.g:400:3: (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGramatica.g:400:3: (otherlv_0= 'Coleccion de' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:401:4: otherlv_0= 'Coleccion de'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getColeccionDeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:406:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGramatica.g:407:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGramatica.g:407:4: (lv_name_1_0= RULE_ID )
            // InternalGramatica.g:408:5: lv_name_1_0= RULE_ID
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
    // InternalGramatica.g:428:1: entryRuleSintagmaPreposicional returns [EObject current=null] : iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF ;
    public final EObject entryRuleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSintagmaPreposicional = null;


        try {
            // InternalGramatica.g:428:62: (iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:429:2: iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF
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
    // InternalGramatica.g:435:1: ruleSintagmaPreposicional returns [EObject current=null] : ( (lv_descripcion_0_0= 'de un/una' ) ) ;
    public final EObject ruleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:441:2: ( ( (lv_descripcion_0_0= 'de un/una' ) ) )
            // InternalGramatica.g:442:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            {
            // InternalGramatica.g:442:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            // InternalGramatica.g:443:3: (lv_descripcion_0_0= 'de un/una' )
            {
            // InternalGramatica.g:443:3: (lv_descripcion_0_0= 'de un/una' )
            // InternalGramatica.g:444:4: lv_descripcion_0_0= 'de un/una'
            {
            lv_descripcion_0_0=(Token)match(input,17,FOLLOW_2); 

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
    // InternalGramatica.g:459:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:459:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:460:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalGramatica.g:466:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        EObject lv_negacion_0_0 = null;

        EObject lv_obligacionDeber_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:472:2: ( ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) )
            // InternalGramatica.g:473:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            {
            // InternalGramatica.g:473:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            // InternalGramatica.g:474:3: ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            {
            // InternalGramatica.g:474:3: ( (lv_negacion_0_0= ruleNegacion ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:475:4: (lv_negacion_0_0= ruleNegacion )
                    {
                    // InternalGramatica.g:475:4: (lv_negacion_0_0= ruleNegacion )
                    // InternalGramatica.g:476:5: lv_negacion_0_0= ruleNegacion
                    {

                    					newCompositeNode(grammarAccess.getObligacionAccess().getNegacionNegacionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
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

            // InternalGramatica.g:493:3: ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            // InternalGramatica.g:494:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            {
            // InternalGramatica.g:494:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            // InternalGramatica.g:495:5: lv_obligacionDeber_1_0= ruleObligacionDeber
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
    // InternalGramatica.g:516:1: entryRuleObligacionDeber returns [EObject current=null] : iv_ruleObligacionDeber= ruleObligacionDeber EOF ;
    public final EObject entryRuleObligacionDeber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacionDeber = null;


        try {
            // InternalGramatica.g:516:56: (iv_ruleObligacionDeber= ruleObligacionDeber EOF )
            // InternalGramatica.g:517:2: iv_ruleObligacionDeber= ruleObligacionDeber EOF
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
    // InternalGramatica.g:523:1: ruleObligacionDeber returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) ;
    public final EObject ruleObligacionDeber() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:529:2: ( ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) )
            // InternalGramatica.g:530:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            {
            // InternalGramatica.g:530:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            // InternalGramatica.g:531:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            {
            // InternalGramatica.g:531:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            // InternalGramatica.g:532:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            {
            // InternalGramatica.g:532:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:533:5: lv_descripcion_0_1= 'debe ser'
                    {
                    lv_descripcion_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionDeberRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:544:5: lv_descripcion_0_2= 'debe estar'
                    {
                    lv_descripcion_0_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalGramatica.g:560:1: entryRuleNegacion returns [EObject current=null] : iv_ruleNegacion= ruleNegacion EOF ;
    public final EObject entryRuleNegacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegacion = null;


        try {
            // InternalGramatica.g:560:49: (iv_ruleNegacion= ruleNegacion EOF )
            // InternalGramatica.g:561:2: iv_ruleNegacion= ruleNegacion EOF
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
    // InternalGramatica.g:567:1: ruleNegacion returns [EObject current=null] : ( (lv_descripcion_0_0= 'no' ) ) ;
    public final EObject ruleNegacion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:573:2: ( ( (lv_descripcion_0_0= 'no' ) ) )
            // InternalGramatica.g:574:2: ( (lv_descripcion_0_0= 'no' ) )
            {
            // InternalGramatica.g:574:2: ( (lv_descripcion_0_0= 'no' ) )
            // InternalGramatica.g:575:3: (lv_descripcion_0_0= 'no' )
            {
            // InternalGramatica.g:575:3: (lv_descripcion_0_0= 'no' )
            // InternalGramatica.g:576:4: lv_descripcion_0_0= 'no'
            {
            lv_descripcion_0_0=(Token)match(input,20,FOLLOW_2); 

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
    // InternalGramatica.g:591:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalGramatica.g:591:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalGramatica.g:592:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalGramatica.g:598:1: ruleOperacion returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) ;
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
            // InternalGramatica.g:604:2: ( ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) )
            // InternalGramatica.g:605:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            {
            // InternalGramatica.g:605:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            // InternalGramatica.g:606:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            {
            // InternalGramatica.g:606:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            // InternalGramatica.g:607:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            {
            // InternalGramatica.g:607:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:608:5: lv_descripcion_0_1= 'mayor que'
                    {
                    lv_descripcion_0_1=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:619:5: lv_descripcion_0_2= 'menor que'
                    {
                    lv_descripcion_0_2=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:630:5: lv_descripcion_0_3= 'igual a'
                    {
                    lv_descripcion_0_3=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:641:5: lv_descripcion_0_4= 'mayor o igual a'
                    {
                    lv_descripcion_0_4=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_4, grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:652:5: lv_descripcion_0_5= 'menor o igual a'
                    {
                    lv_descripcion_0_5=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_5, grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:663:5: lv_descripcion_0_6= 'distinto de'
                    {
                    lv_descripcion_0_6=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_6, grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:674:5: lv_descripcion_0_7= 'al menos'
                    {
                    lv_descripcion_0_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalGramatica.g:690:1: entryRuleClase returns [EObject current=null] : iv_ruleClase= ruleClase EOF ;
    public final EObject entryRuleClase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClase = null;


        try {
            // InternalGramatica.g:690:46: (iv_ruleClase= ruleClase EOF )
            // InternalGramatica.g:691:2: iv_ruleClase= ruleClase EOF
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
    // InternalGramatica.g:697:1: ruleClase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:703:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGramatica.g:704:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:704:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGramatica.g:705:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGramatica.g:705:3: (lv_name_0_0= RULE_ID )
            // InternalGramatica.g:706:4: lv_name_0_0= RULE_ID
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
    // InternalGramatica.g:725:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:725:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:726:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGramatica.g:732:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:738:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalGramatica.g:739:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalGramatica.g:739:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:740:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:748:3: this_STRING_1= RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000FE10070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});

}