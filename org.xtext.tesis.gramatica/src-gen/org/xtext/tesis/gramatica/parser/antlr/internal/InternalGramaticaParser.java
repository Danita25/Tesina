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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'y'", "'o'", "'.\\r\\n'", "'el/la'", "'cantidad de'", "'de'", "'un/una'", "'no'", "'debe ser'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'"
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

                if ( (LA1_0==RULE_STRING||LA1_0==14) ) {
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
    // InternalGramatica.g:145:1: ruleOracion returns [EObject current=null] : ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject lv_contenido_0_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:151:2: ( ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion ) )
            // InternalGramatica.g:152:2: ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion )
            {
            // InternalGramatica.g:152:2: ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion )
            // InternalGramatica.g:153:3: ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion
            {
            // InternalGramatica.g:153:3: ( (lv_contenido_0_0= ruleContenido ) )
            // InternalGramatica.g:154:4: (lv_contenido_0_0= ruleContenido )
            {
            // InternalGramatica.g:154:4: (lv_contenido_0_0= ruleContenido )
            // InternalGramatica.g:155:5: lv_contenido_0_0= ruleContenido
            {

            					newCompositeNode(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_contenido_0_0=ruleContenido();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOracionRule());
            					}
            					set(
            						current,
            						"contenido",
            						lv_contenido_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Contenido");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleContenido"
    // InternalGramatica.g:183:1: entryRuleContenido returns [EObject current=null] : iv_ruleContenido= ruleContenido EOF ;
    public final EObject entryRuleContenido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContenido = null;


        try {
            // InternalGramatica.g:183:50: (iv_ruleContenido= ruleContenido EOF )
            // InternalGramatica.g:184:2: iv_ruleContenido= ruleContenido EOF
            {
             newCompositeNode(grammarAccess.getContenidoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContenido=ruleContenido();

            state._fsp--;

             current =iv_ruleContenido; 
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
    // $ANTLR end "entryRuleContenido"


    // $ANTLR start "ruleContenido"
    // InternalGramatica.g:190:1: ruleContenido returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_composicion_1_0= ruleComposicion ) )? ) ;
    public final EObject ruleContenido() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_composicion_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:196:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_composicion_1_0= ruleComposicion ) )? ) )
            // InternalGramatica.g:197:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_composicion_1_0= ruleComposicion ) )? )
            {
            // InternalGramatica.g:197:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_composicion_1_0= ruleComposicion ) )? )
            // InternalGramatica.g:198:3: ( (lv_simple_0_0= ruleSimple ) ) ( (lv_composicion_1_0= ruleComposicion ) )?
            {
            // InternalGramatica.g:198:3: ( (lv_simple_0_0= ruleSimple ) )
            // InternalGramatica.g:199:4: (lv_simple_0_0= ruleSimple )
            {
            // InternalGramatica.g:199:4: (lv_simple_0_0= ruleSimple )
            // InternalGramatica.g:200:5: lv_simple_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_simple_0_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContenidoRule());
            					}
            					set(
            						current,
            						"simple",
            						lv_simple_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:217:3: ( (lv_composicion_1_0= ruleComposicion ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:218:4: (lv_composicion_1_0= ruleComposicion )
                    {
                    // InternalGramatica.g:218:4: (lv_composicion_1_0= ruleComposicion )
                    // InternalGramatica.g:219:5: lv_composicion_1_0= ruleComposicion
                    {

                    					newCompositeNode(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_composicion_1_0=ruleComposicion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContenidoRule());
                    					}
                    					set(
                    						current,
                    						"composicion",
                    						lv_composicion_1_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Composicion");
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
    // $ANTLR end "ruleContenido"


    // $ANTLR start "entryRuleSimple"
    // InternalGramatica.g:240:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:240:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:241:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:247:1: ruleSimple returns [EObject current=null] : ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        EObject lv_expresion_izq_0_0 = null;

        EObject lv_comparacion_1_0 = null;

        EObject lv_expresion_der_2_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:253:2: ( ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) ) )
            // InternalGramatica.g:254:2: ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) )
            {
            // InternalGramatica.g:254:2: ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) )
            // InternalGramatica.g:255:3: ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) )
            {
            // InternalGramatica.g:255:3: ( (lv_expresion_izq_0_0= ruleExpresion ) )
            // InternalGramatica.g:256:4: (lv_expresion_izq_0_0= ruleExpresion )
            {
            // InternalGramatica.g:256:4: (lv_expresion_izq_0_0= ruleExpresion )
            // InternalGramatica.g:257:5: lv_expresion_izq_0_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getExpresion_izqExpresionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_expresion_izq_0_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"expresion_izq",
            						lv_expresion_izq_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:274:3: ( (lv_comparacion_1_0= ruleComparacion ) )
            // InternalGramatica.g:275:4: (lv_comparacion_1_0= ruleComparacion )
            {
            // InternalGramatica.g:275:4: (lv_comparacion_1_0= ruleComparacion )
            // InternalGramatica.g:276:5: lv_comparacion_1_0= ruleComparacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getComparacionComparacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_comparacion_1_0=ruleComparacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"comparacion",
            						lv_comparacion_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Comparacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:293:3: ( (lv_expresion_der_2_0= ruleExpresion ) )
            // InternalGramatica.g:294:4: (lv_expresion_der_2_0= ruleExpresion )
            {
            // InternalGramatica.g:294:4: (lv_expresion_der_2_0= ruleExpresion )
            // InternalGramatica.g:295:5: lv_expresion_der_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getExpresion_derExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expresion_der_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"expresion_der",
            						lv_expresion_der_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.Expresion");
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


    // $ANTLR start "entryRuleComposicion"
    // InternalGramatica.g:316:1: entryRuleComposicion returns [EObject current=null] : iv_ruleComposicion= ruleComposicion EOF ;
    public final EObject entryRuleComposicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposicion = null;


        try {
            // InternalGramatica.g:316:52: (iv_ruleComposicion= ruleComposicion EOF )
            // InternalGramatica.g:317:2: iv_ruleComposicion= ruleComposicion EOF
            {
             newCompositeNode(grammarAccess.getComposicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposicion=ruleComposicion();

            state._fsp--;

             current =iv_ruleComposicion; 
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
    // $ANTLR end "entryRuleComposicion"


    // $ANTLR start "ruleComposicion"
    // InternalGramatica.g:323:1: ruleComposicion returns [EObject current=null] : ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) ;
    public final EObject ruleComposicion() throws RecognitionException {
        EObject current = null;

        EObject lv_nexo_0_0 = null;

        EObject lv_contenido_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:329:2: ( ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) )
            // InternalGramatica.g:330:2: ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            {
            // InternalGramatica.g:330:2: ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            // InternalGramatica.g:331:3: ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) )
            {
            // InternalGramatica.g:331:3: ( (lv_nexo_0_0= ruleNexo ) )
            // InternalGramatica.g:332:4: (lv_nexo_0_0= ruleNexo )
            {
            // InternalGramatica.g:332:4: (lv_nexo_0_0= ruleNexo )
            // InternalGramatica.g:333:5: lv_nexo_0_0= ruleNexo
            {

            					newCompositeNode(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_nexo_0_0=ruleNexo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComposicionRule());
            					}
            					set(
            						current,
            						"nexo",
            						lv_nexo_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Nexo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:350:3: ( (lv_contenido_1_0= ruleContenido ) )
            // InternalGramatica.g:351:4: (lv_contenido_1_0= ruleContenido )
            {
            // InternalGramatica.g:351:4: (lv_contenido_1_0= ruleContenido )
            // InternalGramatica.g:352:5: lv_contenido_1_0= ruleContenido
            {

            					newCompositeNode(grammarAccess.getComposicionAccess().getContenidoContenidoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_contenido_1_0=ruleContenido();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComposicionRule());
            					}
            					set(
            						current,
            						"contenido",
            						lv_contenido_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Contenido");
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
    // $ANTLR end "ruleComposicion"


    // $ANTLR start "entryRuleNexo"
    // InternalGramatica.g:373:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalGramatica.g:373:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalGramatica.g:374:2: iv_ruleNexo= ruleNexo EOF
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
    // InternalGramatica.g:380:1: ruleNexo returns [EObject current=null] : ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_1=null;
        Token lv_valor_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:386:2: ( ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) ) )
            // InternalGramatica.g:387:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) )
            {
            // InternalGramatica.g:387:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) )
            // InternalGramatica.g:388:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) )
            {
            // InternalGramatica.g:388:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) )
            // InternalGramatica.g:389:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' )
            {
            // InternalGramatica.g:389:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' )
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
                    // InternalGramatica.g:390:5: lv_valor_0_1= 'y'
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
                    // InternalGramatica.g:401:5: lv_valor_0_2= 'o'
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


    // $ANTLR start "entryRuleExpresion"
    // InternalGramatica.g:417:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalGramatica.g:417:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalGramatica.g:418:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalGramatica.g:424:1: ruleExpresion returns [EObject current=null] : ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject lv_expresion_0_1 = null;

        EObject lv_expresion_0_2 = null;



        	enterRule();

        try {
            // InternalGramatica.g:430:2: ( ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) ) )
            // InternalGramatica.g:431:2: ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) )
            {
            // InternalGramatica.g:431:2: ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) )
            // InternalGramatica.g:432:3: ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) )
            {
            // InternalGramatica.g:432:3: ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) )
            // InternalGramatica.g:433:4: (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad )
            {
            // InternalGramatica.g:433:4: (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:434:5: lv_expresion_0_1= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getExpresionAccess().getExpresionLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expresion_0_1=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionRule());
                    					}
                    					set(
                    						current,
                    						"expresion",
                    						lv_expresion_0_1,
                    						"org.xtext.tesis.gramatica.Gramatica.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:450:5: lv_expresion_0_2= rulePropiedad
                    {

                    					newCompositeNode(grammarAccess.getExpresionAccess().getExpresionPropiedadParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expresion_0_2=rulePropiedad();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionRule());
                    					}
                    					set(
                    						current,
                    						"expresion",
                    						lv_expresion_0_2,
                    						"org.xtext.tesis.gramatica.Gramatica.Propiedad");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleComparacion"
    // InternalGramatica.g:471:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // InternalGramatica.g:471:52: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalGramatica.g:472:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
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
    // $ANTLR end "entryRuleComparacion"


    // $ANTLR start "ruleComparacion"
    // InternalGramatica.g:478:1: ruleComparacion returns [EObject current=null] : ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject lv_obligacion_0_0 = null;

        EObject lv_operacion_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:484:2: ( ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) ) )
            // InternalGramatica.g:485:2: ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) )
            {
            // InternalGramatica.g:485:2: ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) )
            // InternalGramatica.g:486:3: ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) )
            {
            // InternalGramatica.g:486:3: ( (lv_obligacion_0_0= ruleObligacion ) )
            // InternalGramatica.g:487:4: (lv_obligacion_0_0= ruleObligacion )
            {
            // InternalGramatica.g:487:4: (lv_obligacion_0_0= ruleObligacion )
            // InternalGramatica.g:488:5: lv_obligacion_0_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_obligacion_0_0=ruleObligacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparacionRule());
            					}
            					set(
            						current,
            						"obligacion",
            						lv_obligacion_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Obligacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:505:3: ( (lv_operacion_1_0= ruleOperacion ) )
            // InternalGramatica.g:506:4: (lv_operacion_1_0= ruleOperacion )
            {
            // InternalGramatica.g:506:4: (lv_operacion_1_0= ruleOperacion )
            // InternalGramatica.g:507:5: lv_operacion_1_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getComparacionAccess().getOperacionOperacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operacion_1_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparacionRule());
            					}
            					set(
            						current,
            						"operacion",
            						lv_operacion_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Operacion");
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
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRulePropiedad"
    // InternalGramatica.g:528:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // InternalGramatica.g:528:50: (iv_rulePropiedad= rulePropiedad EOF )
            // InternalGramatica.g:529:2: iv_rulePropiedad= rulePropiedad EOF
            {
             newCompositeNode(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropiedad=rulePropiedad();

            state._fsp--;

             current =iv_rulePropiedad; 
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
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // InternalGramatica.g:535:1: rulePropiedad returns [EObject current=null] : ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) ) ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject lv_atributo_0_0 = null;

        EObject lv_termino_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:541:2: ( ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) ) ) )
            // InternalGramatica.g:542:2: ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) ) )
            {
            // InternalGramatica.g:542:2: ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) ) )
            // InternalGramatica.g:543:3: ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )
            {
            // InternalGramatica.g:543:3: ( (lv_atributo_0_0= ruleAtributo ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGramatica.g:544:4: (lv_atributo_0_0= ruleAtributo )
            	    {
            	    // InternalGramatica.g:544:4: (lv_atributo_0_0= ruleAtributo )
            	    // InternalGramatica.g:545:5: lv_atributo_0_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_atributo_0_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropiedadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributo",
            	    						lv_atributo_0_0,
            	    						"org.xtext.tesis.gramatica.Gramatica.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalGramatica.g:562:3: ( (lv_termino_1_0= ruleTermino ) )
            // InternalGramatica.g:563:4: (lv_termino_1_0= ruleTermino )
            {
            // InternalGramatica.g:563:4: (lv_termino_1_0= ruleTermino )
            // InternalGramatica.g:564:5: lv_termino_1_0= ruleTermino
            {

            					newCompositeNode(grammarAccess.getPropiedadAccess().getTerminoTerminoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_termino_1_0=ruleTermino();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropiedadRule());
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
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:585:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalGramatica.g:585:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalGramatica.g:586:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalGramatica.g:592:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.\\r\\n' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramatica.g:598:2: (kw= '.\\r\\n' )
            // InternalGramatica.g:599:2: kw= '.\\r\\n'
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


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:607:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:607:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:608:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:614:1: ruleAtributo returns [EObject current=null] : ( ( (lv_determinante_0_0= 'el/la' ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_determinante_0_0=null;
        Token lv_prefijo_1_0=null;
        Token lv_nombre_2_0=null;
        Token lv_enlace_3_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:620:2: ( ( ( (lv_determinante_0_0= 'el/la' ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) ) )
            // InternalGramatica.g:621:2: ( ( (lv_determinante_0_0= 'el/la' ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) )
            {
            // InternalGramatica.g:621:2: ( ( (lv_determinante_0_0= 'el/la' ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) )
            // InternalGramatica.g:622:3: ( (lv_determinante_0_0= 'el/la' ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) )
            {
            // InternalGramatica.g:622:3: ( (lv_determinante_0_0= 'el/la' ) )
            // InternalGramatica.g:623:4: (lv_determinante_0_0= 'el/la' )
            {
            // InternalGramatica.g:623:4: (lv_determinante_0_0= 'el/la' )
            // InternalGramatica.g:624:5: lv_determinante_0_0= 'el/la'
            {
            lv_determinante_0_0=(Token)match(input,14,FOLLOW_11); 

            					newLeafNode(lv_determinante_0_0, grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(current, "determinante", lv_determinante_0_0, "el/la");
            				

            }


            }

            // InternalGramatica.g:636:3: ( (lv_prefijo_1_0= 'cantidad de' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:637:4: (lv_prefijo_1_0= 'cantidad de' )
                    {
                    // InternalGramatica.g:637:4: (lv_prefijo_1_0= 'cantidad de' )
                    // InternalGramatica.g:638:5: lv_prefijo_1_0= 'cantidad de'
                    {
                    lv_prefijo_1_0=(Token)match(input,15,FOLLOW_12); 

                    					newLeafNode(lv_prefijo_1_0, grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoRule());
                    					}
                    					setWithLastConsumed(current, "prefijo", lv_prefijo_1_0, "cantidad de");
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:650:3: ( (lv_nombre_2_0= RULE_ID ) )
            // InternalGramatica.g:651:4: (lv_nombre_2_0= RULE_ID )
            {
            // InternalGramatica.g:651:4: (lv_nombre_2_0= RULE_ID )
            // InternalGramatica.g:652:5: lv_nombre_2_0= RULE_ID
            {
            lv_nombre_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGramatica.g:668:3: ( (lv_enlace_3_0= 'de' ) )
            // InternalGramatica.g:669:4: (lv_enlace_3_0= 'de' )
            {
            // InternalGramatica.g:669:4: (lv_enlace_3_0= 'de' )
            // InternalGramatica.g:670:5: lv_enlace_3_0= 'de'
            {
            lv_enlace_3_0=(Token)match(input,16,FOLLOW_2); 

            					newLeafNode(lv_enlace_3_0, grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(current, "enlace", lv_enlace_3_0, "de");
            				

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


    // $ANTLR start "entryRuleTermino"
    // InternalGramatica.g:686:1: entryRuleTermino returns [EObject current=null] : iv_ruleTermino= ruleTermino EOF ;
    public final EObject entryRuleTermino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermino = null;


        try {
            // InternalGramatica.g:686:48: (iv_ruleTermino= ruleTermino EOF )
            // InternalGramatica.g:687:2: iv_ruleTermino= ruleTermino EOF
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
    // InternalGramatica.g:693:1: ruleTermino returns [EObject current=null] : ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTermino() throws RecognitionException {
        EObject current = null;

        Token lv_indeterminante_0_0=null;
        Token lv_contexto_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:699:2: ( ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) ) )
            // InternalGramatica.g:700:2: ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) )
            {
            // InternalGramatica.g:700:2: ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) )
            // InternalGramatica.g:701:3: ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) )
            {
            // InternalGramatica.g:701:3: ( (lv_indeterminante_0_0= 'un/una' ) )
            // InternalGramatica.g:702:4: (lv_indeterminante_0_0= 'un/una' )
            {
            // InternalGramatica.g:702:4: (lv_indeterminante_0_0= 'un/una' )
            // InternalGramatica.g:703:5: lv_indeterminante_0_0= 'un/una'
            {
            lv_indeterminante_0_0=(Token)match(input,17,FOLLOW_12); 

            					newLeafNode(lv_indeterminante_0_0, grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminoRule());
            					}
            					setWithLastConsumed(current, "indeterminante", lv_indeterminante_0_0, "un/una");
            				

            }


            }

            // InternalGramatica.g:715:3: ( (lv_contexto_1_0= RULE_ID ) )
            // InternalGramatica.g:716:4: (lv_contexto_1_0= RULE_ID )
            {
            // InternalGramatica.g:716:4: (lv_contexto_1_0= RULE_ID )
            // InternalGramatica.g:717:5: lv_contexto_1_0= RULE_ID
            {
            lv_contexto_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_contexto_1_0, grammarAccess.getTerminoAccess().getContextoIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contexto",
            						lv_contexto_1_0,
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
    // $ANTLR end "ruleTermino"


    // $ANTLR start "entryRuleObligacion"
    // InternalGramatica.g:737:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:737:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:738:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalGramatica.g:744:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacion_0_0=null;
        Token lv_obligacion_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:750:2: ( ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) ) )
            // InternalGramatica.g:751:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) )
            {
            // InternalGramatica.g:751:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) )
            // InternalGramatica.g:752:3: ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) )
            {
            // InternalGramatica.g:752:3: ( (lv_negacion_0_0= 'no' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:753:4: (lv_negacion_0_0= 'no' )
                    {
                    // InternalGramatica.g:753:4: (lv_negacion_0_0= 'no' )
                    // InternalGramatica.g:754:5: lv_negacion_0_0= 'no'
                    {
                    lv_negacion_0_0=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(lv_negacion_0_0, grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionRule());
                    					}
                    					setWithLastConsumed(current, "negacion", lv_negacion_0_0, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:766:3: ( (lv_obligacion_1_0= 'debe ser' ) )
            // InternalGramatica.g:767:4: (lv_obligacion_1_0= 'debe ser' )
            {
            // InternalGramatica.g:767:4: (lv_obligacion_1_0= 'debe ser' )
            // InternalGramatica.g:768:5: lv_obligacion_1_0= 'debe ser'
            {
            lv_obligacion_1_0=(Token)match(input,19,FOLLOW_2); 

            					newLeafNode(lv_obligacion_1_0, grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObligacionRule());
            					}
            					setWithLastConsumed(current, "obligacion", lv_obligacion_1_0, "debe ser");
            				

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
    // InternalGramatica.g:784:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalGramatica.g:784:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalGramatica.g:785:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalGramatica.g:791:1: ruleOperacion returns [EObject current=null] : ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token lv_operacion_0_1=null;
        Token lv_operacion_0_2=null;
        Token lv_operacion_0_3=null;
        Token lv_operacion_0_4=null;
        Token lv_operacion_0_5=null;
        Token lv_operacion_0_6=null;


        	enterRule();

        try {
            // InternalGramatica.g:797:2: ( ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) ) )
            // InternalGramatica.g:798:2: ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) )
            {
            // InternalGramatica.g:798:2: ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) )
            // InternalGramatica.g:799:3: ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) )
            {
            // InternalGramatica.g:799:3: ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) )
            // InternalGramatica.g:800:4: (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' )
            {
            // InternalGramatica.g:800:4: (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:801:5: lv_operacion_0_1= 'mayor que'
                    {
                    lv_operacion_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_1, grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:812:5: lv_operacion_0_2= 'menor que'
                    {
                    lv_operacion_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_2, grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:823:5: lv_operacion_0_3= 'igual a'
                    {
                    lv_operacion_0_3=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_3, grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:834:5: lv_operacion_0_4= 'mayor o igual a'
                    {
                    lv_operacion_0_4=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_4, grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:845:5: lv_operacion_0_5= 'menor o igual a'
                    {
                    lv_operacion_0_5=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_5, grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:856:5: lv_operacion_0_6= 'distinto de'
                    {
                    lv_operacion_0_6=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_6, grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_6, null);
                    				

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


    // $ANTLR start "entryRuleLiteral"
    // InternalGramatica.g:872:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:872:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:873:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGramatica.g:879:1: ruleLiteral returns [EObject current=null] : ( (lv_valor_0_0= RULE_STRING ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:885:2: ( ( (lv_valor_0_0= RULE_STRING ) ) )
            // InternalGramatica.g:886:2: ( (lv_valor_0_0= RULE_STRING ) )
            {
            // InternalGramatica.g:886:2: ( (lv_valor_0_0= RULE_STRING ) )
            // InternalGramatica.g:887:3: (lv_valor_0_0= RULE_STRING )
            {
            // InternalGramatica.g:887:3: (lv_valor_0_0= RULE_STRING )
            // InternalGramatica.g:888:4: lv_valor_0_0= RULE_STRING
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});

}