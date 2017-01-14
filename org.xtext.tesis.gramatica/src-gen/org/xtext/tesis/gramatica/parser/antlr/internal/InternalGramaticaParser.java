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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tal que'", "'y'", "'o'", "'.\\r\\n'", "'el/la'", "'cantidad de'", "'seleccion de'", "'de'", "'un/una'", "'no'", "'debe ser'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    // InternalGramatica.g:71:1: ruleDocumento returns [EObject current=null] : ( (lv_oraciones_0_0= ruleOracion ) )* ;
    public final EObject ruleDocumento() throws RecognitionException {
        EObject current = null;

        EObject lv_oraciones_0_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:77:2: ( ( (lv_oraciones_0_0= ruleOracion ) )* )
            // InternalGramatica.g:78:2: ( (lv_oraciones_0_0= ruleOracion ) )*
            {
            // InternalGramatica.g:78:2: ( (lv_oraciones_0_0= ruleOracion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:79:3: (lv_oraciones_0_0= ruleOracion )
            	    {
            	    // InternalGramatica.g:79:3: (lv_oraciones_0_0= ruleOracion )
            	    // InternalGramatica.g:80:4: lv_oraciones_0_0= ruleOracion
            	    {

            	    				newCompositeNode(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_oraciones_0_0=ruleOracion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDocumentoRule());
            	    				}
            	    				add(
            	    					current,
            	    					"oraciones",
            	    					lv_oraciones_0_0,
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
    // InternalGramatica.g:100:1: entryRuleOracion returns [EObject current=null] : iv_ruleOracion= ruleOracion EOF ;
    public final EObject entryRuleOracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracion = null;


        try {
            // InternalGramatica.g:100:48: (iv_ruleOracion= ruleOracion EOF )
            // InternalGramatica.g:101:2: iv_ruleOracion= ruleOracion EOF
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
    // InternalGramatica.g:107:1: ruleOracion returns [EObject current=null] : ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject lv_contenido_0_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:113:2: ( ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion ) )
            // InternalGramatica.g:114:2: ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion )
            {
            // InternalGramatica.g:114:2: ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion )
            // InternalGramatica.g:115:3: ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion
            {
            // InternalGramatica.g:115:3: ( (lv_contenido_0_0= ruleContenido ) )
            // InternalGramatica.g:116:4: (lv_contenido_0_0= ruleContenido )
            {
            // InternalGramatica.g:116:4: (lv_contenido_0_0= ruleContenido )
            // InternalGramatica.g:117:5: lv_contenido_0_0= ruleContenido
            {

            					newCompositeNode(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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


    // $ANTLR start "entryRuleIteracion"
    // InternalGramatica.g:145:1: entryRuleIteracion returns [EObject current=null] : iv_ruleIteracion= ruleIteracion EOF ;
    public final EObject entryRuleIteracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteracion = null;


        try {
            // InternalGramatica.g:145:50: (iv_ruleIteracion= ruleIteracion EOF )
            // InternalGramatica.g:146:2: iv_ruleIteracion= ruleIteracion EOF
            {
             newCompositeNode(grammarAccess.getIteracionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIteracion=ruleIteracion();

            state._fsp--;

             current =iv_ruleIteracion; 
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
    // $ANTLR end "entryRuleIteracion"


    // $ANTLR start "ruleIteracion"
    // InternalGramatica.g:152:1: ruleIteracion returns [EObject current=null] : ( ( (lv_propiedad_0_0= rulePropiedad ) ) ( (lv_conector_1_0= 'tal que' ) ) ( (lv_contenido_2_0= ruleContenido ) ) ( (lv_comparacion_3_0= ruleComparacion ) )? ( (lv_expresion_4_0= ruleExpresion ) )? ) ;
    public final EObject ruleIteracion() throws RecognitionException {
        EObject current = null;

        Token lv_conector_1_0=null;
        EObject lv_propiedad_0_0 = null;

        EObject lv_contenido_2_0 = null;

        EObject lv_comparacion_3_0 = null;

        EObject lv_expresion_4_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:158:2: ( ( ( (lv_propiedad_0_0= rulePropiedad ) ) ( (lv_conector_1_0= 'tal que' ) ) ( (lv_contenido_2_0= ruleContenido ) ) ( (lv_comparacion_3_0= ruleComparacion ) )? ( (lv_expresion_4_0= ruleExpresion ) )? ) )
            // InternalGramatica.g:159:2: ( ( (lv_propiedad_0_0= rulePropiedad ) ) ( (lv_conector_1_0= 'tal que' ) ) ( (lv_contenido_2_0= ruleContenido ) ) ( (lv_comparacion_3_0= ruleComparacion ) )? ( (lv_expresion_4_0= ruleExpresion ) )? )
            {
            // InternalGramatica.g:159:2: ( ( (lv_propiedad_0_0= rulePropiedad ) ) ( (lv_conector_1_0= 'tal que' ) ) ( (lv_contenido_2_0= ruleContenido ) ) ( (lv_comparacion_3_0= ruleComparacion ) )? ( (lv_expresion_4_0= ruleExpresion ) )? )
            // InternalGramatica.g:160:3: ( (lv_propiedad_0_0= rulePropiedad ) ) ( (lv_conector_1_0= 'tal que' ) ) ( (lv_contenido_2_0= ruleContenido ) ) ( (lv_comparacion_3_0= ruleComparacion ) )? ( (lv_expresion_4_0= ruleExpresion ) )?
            {
            // InternalGramatica.g:160:3: ( (lv_propiedad_0_0= rulePropiedad ) )
            // InternalGramatica.g:161:4: (lv_propiedad_0_0= rulePropiedad )
            {
            // InternalGramatica.g:161:4: (lv_propiedad_0_0= rulePropiedad )
            // InternalGramatica.g:162:5: lv_propiedad_0_0= rulePropiedad
            {

            					newCompositeNode(grammarAccess.getIteracionAccess().getPropiedadPropiedadParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_propiedad_0_0=rulePropiedad();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteracionRule());
            					}
            					set(
            						current,
            						"propiedad",
            						lv_propiedad_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.Propiedad");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:179:3: ( (lv_conector_1_0= 'tal que' ) )
            // InternalGramatica.g:180:4: (lv_conector_1_0= 'tal que' )
            {
            // InternalGramatica.g:180:4: (lv_conector_1_0= 'tal que' )
            // InternalGramatica.g:181:5: lv_conector_1_0= 'tal que'
            {
            lv_conector_1_0=(Token)match(input,11,FOLLOW_6); 

            					newLeafNode(lv_conector_1_0, grammarAccess.getIteracionAccess().getConectorTalQueKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIteracionRule());
            					}
            					setWithLastConsumed(current, "conector", lv_conector_1_0, "tal que");
            				

            }


            }

            // InternalGramatica.g:193:3: ( (lv_contenido_2_0= ruleContenido ) )
            // InternalGramatica.g:194:4: (lv_contenido_2_0= ruleContenido )
            {
            // InternalGramatica.g:194:4: (lv_contenido_2_0= ruleContenido )
            // InternalGramatica.g:195:5: lv_contenido_2_0= ruleContenido
            {

            					newCompositeNode(grammarAccess.getIteracionAccess().getContenidoContenidoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_contenido_2_0=ruleContenido();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteracionRule());
            					}
            					set(
            						current,
            						"contenido",
            						lv_contenido_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.Contenido");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:212:3: ( (lv_comparacion_3_0= ruleComparacion ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:213:4: (lv_comparacion_3_0= ruleComparacion )
                    {
                    // InternalGramatica.g:213:4: (lv_comparacion_3_0= ruleComparacion )
                    // InternalGramatica.g:214:5: lv_comparacion_3_0= ruleComparacion
                    {

                    					newCompositeNode(grammarAccess.getIteracionAccess().getComparacionComparacionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_comparacion_3_0=ruleComparacion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIteracionRule());
                    					}
                    					set(
                    						current,
                    						"comparacion",
                    						lv_comparacion_3_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Comparacion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:231:3: ( (lv_expresion_4_0= ruleExpresion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:232:4: (lv_expresion_4_0= ruleExpresion )
                    {
                    // InternalGramatica.g:232:4: (lv_expresion_4_0= ruleExpresion )
                    // InternalGramatica.g:233:5: lv_expresion_4_0= ruleExpresion
                    {

                    					newCompositeNode(grammarAccess.getIteracionAccess().getExpresionExpresionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expresion_4_0=ruleExpresion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIteracionRule());
                    					}
                    					set(
                    						current,
                    						"expresion",
                    						lv_expresion_4_0,
                    						"org.xtext.tesis.gramatica.Gramatica.Expresion");
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
    // $ANTLR end "ruleIteracion"


    // $ANTLR start "entryRuleContenido"
    // InternalGramatica.g:254:1: entryRuleContenido returns [EObject current=null] : iv_ruleContenido= ruleContenido EOF ;
    public final EObject entryRuleContenido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContenido = null;


        try {
            // InternalGramatica.g:254:50: (iv_ruleContenido= ruleContenido EOF )
            // InternalGramatica.g:255:2: iv_ruleContenido= ruleContenido EOF
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
    // InternalGramatica.g:261:1: ruleContenido returns [EObject current=null] : ( ( ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) ) ) ( (lv_composicion_1_0= ruleComposicion ) )? ) ;
    public final EObject ruleContenido() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_1 = null;

        EObject lv_simple_0_2 = null;

        EObject lv_composicion_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:267:2: ( ( ( ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) ) ) ( (lv_composicion_1_0= ruleComposicion ) )? ) )
            // InternalGramatica.g:268:2: ( ( ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) ) ) ( (lv_composicion_1_0= ruleComposicion ) )? )
            {
            // InternalGramatica.g:268:2: ( ( ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) ) ) ( (lv_composicion_1_0= ruleComposicion ) )? )
            // InternalGramatica.g:269:3: ( ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) ) ) ( (lv_composicion_1_0= ruleComposicion ) )?
            {
            // InternalGramatica.g:269:3: ( ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) ) )
            // InternalGramatica.g:270:4: ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) )
            {
            // InternalGramatica.g:270:4: ( (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion ) )
            // InternalGramatica.g:271:5: (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion )
            {
            // InternalGramatica.g:271:5: (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:272:6: lv_simple_0_1= ruleSimple
                    {

                    						newCompositeNode(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_simple_0_1=ruleSimple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContenidoRule());
                    						}
                    						set(
                    							current,
                    							"simple",
                    							lv_simple_0_1,
                    							"org.xtext.tesis.gramatica.Gramatica.Simple");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:288:6: lv_simple_0_2= ruleIteracion
                    {

                    						newCompositeNode(grammarAccess.getContenidoAccess().getSimpleIteracionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_simple_0_2=ruleIteracion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContenidoRule());
                    						}
                    						set(
                    							current,
                    							"simple",
                    							lv_simple_0_2,
                    							"org.xtext.tesis.gramatica.Gramatica.Iteracion");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalGramatica.g:306:3: ( (lv_composicion_1_0= ruleComposicion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:307:4: (lv_composicion_1_0= ruleComposicion )
                    {
                    // InternalGramatica.g:307:4: (lv_composicion_1_0= ruleComposicion )
                    // InternalGramatica.g:308:5: lv_composicion_1_0= ruleComposicion
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
    // InternalGramatica.g:329:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:329:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:330:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:336:1: ruleSimple returns [EObject current=null] : ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        EObject lv_expresion_izq_0_0 = null;

        EObject lv_comparacion_1_0 = null;

        EObject lv_expresion_der_2_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:342:2: ( ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) ) )
            // InternalGramatica.g:343:2: ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) )
            {
            // InternalGramatica.g:343:2: ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) ) )
            // InternalGramatica.g:344:3: ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_comparacion_1_0= ruleComparacion ) ) ( (lv_expresion_der_2_0= ruleExpresion ) )
            {
            // InternalGramatica.g:344:3: ( (lv_expresion_izq_0_0= ruleExpresion ) )
            // InternalGramatica.g:345:4: (lv_expresion_izq_0_0= ruleExpresion )
            {
            // InternalGramatica.g:345:4: (lv_expresion_izq_0_0= ruleExpresion )
            // InternalGramatica.g:346:5: lv_expresion_izq_0_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getExpresion_izqExpresionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalGramatica.g:363:3: ( (lv_comparacion_1_0= ruleComparacion ) )
            // InternalGramatica.g:364:4: (lv_comparacion_1_0= ruleComparacion )
            {
            // InternalGramatica.g:364:4: (lv_comparacion_1_0= ruleComparacion )
            // InternalGramatica.g:365:5: lv_comparacion_1_0= ruleComparacion
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getComparacionComparacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalGramatica.g:382:3: ( (lv_expresion_der_2_0= ruleExpresion ) )
            // InternalGramatica.g:383:4: (lv_expresion_der_2_0= ruleExpresion )
            {
            // InternalGramatica.g:383:4: (lv_expresion_der_2_0= ruleExpresion )
            // InternalGramatica.g:384:5: lv_expresion_der_2_0= ruleExpresion
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
    // InternalGramatica.g:405:1: entryRuleComposicion returns [EObject current=null] : iv_ruleComposicion= ruleComposicion EOF ;
    public final EObject entryRuleComposicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposicion = null;


        try {
            // InternalGramatica.g:405:52: (iv_ruleComposicion= ruleComposicion EOF )
            // InternalGramatica.g:406:2: iv_ruleComposicion= ruleComposicion EOF
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
    // InternalGramatica.g:412:1: ruleComposicion returns [EObject current=null] : ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) ;
    public final EObject ruleComposicion() throws RecognitionException {
        EObject current = null;

        EObject lv_nexo_0_0 = null;

        EObject lv_contenido_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:418:2: ( ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) )
            // InternalGramatica.g:419:2: ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            {
            // InternalGramatica.g:419:2: ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            // InternalGramatica.g:420:3: ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) )
            {
            // InternalGramatica.g:420:3: ( (lv_nexo_0_0= ruleNexo ) )
            // InternalGramatica.g:421:4: (lv_nexo_0_0= ruleNexo )
            {
            // InternalGramatica.g:421:4: (lv_nexo_0_0= ruleNexo )
            // InternalGramatica.g:422:5: lv_nexo_0_0= ruleNexo
            {

            					newCompositeNode(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalGramatica.g:439:3: ( (lv_contenido_1_0= ruleContenido ) )
            // InternalGramatica.g:440:4: (lv_contenido_1_0= ruleContenido )
            {
            // InternalGramatica.g:440:4: (lv_contenido_1_0= ruleContenido )
            // InternalGramatica.g:441:5: lv_contenido_1_0= ruleContenido
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
    // InternalGramatica.g:462:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalGramatica.g:462:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalGramatica.g:463:2: iv_ruleNexo= ruleNexo EOF
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
    // InternalGramatica.g:469:1: ruleNexo returns [EObject current=null] : ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_1=null;
        Token lv_valor_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:475:2: ( ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) ) )
            // InternalGramatica.g:476:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) )
            {
            // InternalGramatica.g:476:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) ) )
            // InternalGramatica.g:477:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) )
            {
            // InternalGramatica.g:477:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' ) )
            // InternalGramatica.g:478:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' )
            {
            // InternalGramatica.g:478:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:479:5: lv_valor_0_1= 'y'
                    {
                    lv_valor_0_1=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_valor_0_1, grammarAccess.getNexoAccess().getValorYKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "valor", lv_valor_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:490:5: lv_valor_0_2= 'o'
                    {
                    lv_valor_0_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalGramatica.g:506:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalGramatica.g:506:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalGramatica.g:507:2: iv_ruleExpresion= ruleExpresion EOF
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
    // InternalGramatica.g:513:1: ruleExpresion returns [EObject current=null] : ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject lv_expresion_0_1 = null;

        EObject lv_expresion_0_2 = null;



        	enterRule();

        try {
            // InternalGramatica.g:519:2: ( ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) ) )
            // InternalGramatica.g:520:2: ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) )
            {
            // InternalGramatica.g:520:2: ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) )
            // InternalGramatica.g:521:3: ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) )
            {
            // InternalGramatica.g:521:3: ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) )
            // InternalGramatica.g:522:4: (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad )
            {
            // InternalGramatica.g:522:4: (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:523:5: lv_expresion_0_1= ruleLiteral
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
                    // InternalGramatica.g:539:5: lv_expresion_0_2= rulePropiedad
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
    // InternalGramatica.g:560:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // InternalGramatica.g:560:52: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalGramatica.g:561:2: iv_ruleComparacion= ruleComparacion EOF
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
    // InternalGramatica.g:567:1: ruleComparacion returns [EObject current=null] : ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject lv_obligacion_0_0 = null;

        EObject lv_operacion_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:573:2: ( ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) ) )
            // InternalGramatica.g:574:2: ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) )
            {
            // InternalGramatica.g:574:2: ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) )
            // InternalGramatica.g:575:3: ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) )
            {
            // InternalGramatica.g:575:3: ( (lv_obligacion_0_0= ruleObligacion ) )
            // InternalGramatica.g:576:4: (lv_obligacion_0_0= ruleObligacion )
            {
            // InternalGramatica.g:576:4: (lv_obligacion_0_0= ruleObligacion )
            // InternalGramatica.g:577:5: lv_obligacion_0_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalGramatica.g:594:3: ( (lv_operacion_1_0= ruleOperacion ) )
            // InternalGramatica.g:595:4: (lv_operacion_1_0= ruleOperacion )
            {
            // InternalGramatica.g:595:4: (lv_operacion_1_0= ruleOperacion )
            // InternalGramatica.g:596:5: lv_operacion_1_0= ruleOperacion
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
    // InternalGramatica.g:617:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // InternalGramatica.g:617:50: (iv_rulePropiedad= rulePropiedad EOF )
            // InternalGramatica.g:618:2: iv_rulePropiedad= rulePropiedad EOF
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
    // InternalGramatica.g:624:1: rulePropiedad returns [EObject current=null] : ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject lv_atributo_0_0 = null;

        EObject lv_termino_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:630:2: ( ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ) )
            // InternalGramatica.g:631:2: ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? )
            {
            // InternalGramatica.g:631:2: ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? )
            // InternalGramatica.g:632:3: ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )?
            {
            // InternalGramatica.g:632:3: ( (lv_atributo_0_0= ruleAtributo ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGramatica.g:633:4: (lv_atributo_0_0= ruleAtributo )
            	    {
            	    // InternalGramatica.g:633:4: (lv_atributo_0_0= ruleAtributo )
            	    // InternalGramatica.g:634:5: lv_atributo_0_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalGramatica.g:651:3: ( (lv_termino_1_0= ruleTermino ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:652:4: (lv_termino_1_0= ruleTermino )
                    {
                    // InternalGramatica.g:652:4: (lv_termino_1_0= ruleTermino )
                    // InternalGramatica.g:653:5: lv_termino_1_0= ruleTermino
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
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:674:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalGramatica.g:674:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalGramatica.g:675:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalGramatica.g:681:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.\\r\\n' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramatica.g:687:2: (kw= '.\\r\\n' )
            // InternalGramatica.g:688:2: kw= '.\\r\\n'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGramatica.g:696:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:696:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:697:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:703:1: ruleAtributo returns [EObject current=null] : ( ( (lv_determinante_0_0= 'el/la' ) ) ( ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_determinante_0_0=null;
        Token lv_prefijo_1_1=null;
        Token lv_prefijo_1_2=null;
        Token lv_nombre_2_0=null;
        Token lv_enlace_3_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:709:2: ( ( ( (lv_determinante_0_0= 'el/la' ) ) ( ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) ) )
            // InternalGramatica.g:710:2: ( ( (lv_determinante_0_0= 'el/la' ) ) ( ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) )
            {
            // InternalGramatica.g:710:2: ( ( (lv_determinante_0_0= 'el/la' ) ) ( ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) )
            // InternalGramatica.g:711:3: ( (lv_determinante_0_0= 'el/la' ) ) ( ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) )
            {
            // InternalGramatica.g:711:3: ( (lv_determinante_0_0= 'el/la' ) )
            // InternalGramatica.g:712:4: (lv_determinante_0_0= 'el/la' )
            {
            // InternalGramatica.g:712:4: (lv_determinante_0_0= 'el/la' )
            // InternalGramatica.g:713:5: lv_determinante_0_0= 'el/la'
            {
            lv_determinante_0_0=(Token)match(input,15,FOLLOW_13); 

            					newLeafNode(lv_determinante_0_0, grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(current, "determinante", lv_determinante_0_0, "el/la");
            				

            }


            }

            // InternalGramatica.g:725:3: ( ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=16 && LA11_0<=17)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:726:4: ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) )
                    {
                    // InternalGramatica.g:726:4: ( (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' ) )
                    // InternalGramatica.g:727:5: (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' )
                    {
                    // InternalGramatica.g:727:5: (lv_prefijo_1_1= 'cantidad de' | lv_prefijo_1_2= 'seleccion de' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==16) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==17) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGramatica.g:728:6: lv_prefijo_1_1= 'cantidad de'
                            {
                            lv_prefijo_1_1=(Token)match(input,16,FOLLOW_14); 

                            						newLeafNode(lv_prefijo_1_1, grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAtributoRule());
                            						}
                            						setWithLastConsumed(current, "prefijo", lv_prefijo_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalGramatica.g:739:6: lv_prefijo_1_2= 'seleccion de'
                            {
                            lv_prefijo_1_2=(Token)match(input,17,FOLLOW_14); 

                            						newLeafNode(lv_prefijo_1_2, grammarAccess.getAtributoAccess().getPrefijoSeleccionDeKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAtributoRule());
                            						}
                            						setWithLastConsumed(current, "prefijo", lv_prefijo_1_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalGramatica.g:752:3: ( (lv_nombre_2_0= RULE_ID ) )
            // InternalGramatica.g:753:4: (lv_nombre_2_0= RULE_ID )
            {
            // InternalGramatica.g:753:4: (lv_nombre_2_0= RULE_ID )
            // InternalGramatica.g:754:5: lv_nombre_2_0= RULE_ID
            {
            lv_nombre_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalGramatica.g:770:3: ( (lv_enlace_3_0= 'de' ) )
            // InternalGramatica.g:771:4: (lv_enlace_3_0= 'de' )
            {
            // InternalGramatica.g:771:4: (lv_enlace_3_0= 'de' )
            // InternalGramatica.g:772:5: lv_enlace_3_0= 'de'
            {
            lv_enlace_3_0=(Token)match(input,18,FOLLOW_2); 

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
    // InternalGramatica.g:788:1: entryRuleTermino returns [EObject current=null] : iv_ruleTermino= ruleTermino EOF ;
    public final EObject entryRuleTermino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermino = null;


        try {
            // InternalGramatica.g:788:48: (iv_ruleTermino= ruleTermino EOF )
            // InternalGramatica.g:789:2: iv_ruleTermino= ruleTermino EOF
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
    // InternalGramatica.g:795:1: ruleTermino returns [EObject current=null] : ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTermino() throws RecognitionException {
        EObject current = null;

        Token lv_indeterminante_0_0=null;
        Token lv_contexto_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:801:2: ( ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) ) )
            // InternalGramatica.g:802:2: ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) )
            {
            // InternalGramatica.g:802:2: ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) )
            // InternalGramatica.g:803:3: ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) )
            {
            // InternalGramatica.g:803:3: ( (lv_indeterminante_0_0= 'un/una' ) )
            // InternalGramatica.g:804:4: (lv_indeterminante_0_0= 'un/una' )
            {
            // InternalGramatica.g:804:4: (lv_indeterminante_0_0= 'un/una' )
            // InternalGramatica.g:805:5: lv_indeterminante_0_0= 'un/una'
            {
            lv_indeterminante_0_0=(Token)match(input,19,FOLLOW_14); 

            					newLeafNode(lv_indeterminante_0_0, grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminoRule());
            					}
            					setWithLastConsumed(current, "indeterminante", lv_indeterminante_0_0, "un/una");
            				

            }


            }

            // InternalGramatica.g:817:3: ( (lv_contexto_1_0= RULE_ID ) )
            // InternalGramatica.g:818:4: (lv_contexto_1_0= RULE_ID )
            {
            // InternalGramatica.g:818:4: (lv_contexto_1_0= RULE_ID )
            // InternalGramatica.g:819:5: lv_contexto_1_0= RULE_ID
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
    // InternalGramatica.g:839:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:839:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:840:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalGramatica.g:846:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacion_0_0=null;
        Token lv_obligacion_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:852:2: ( ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) ) )
            // InternalGramatica.g:853:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) )
            {
            // InternalGramatica.g:853:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) ) )
            // InternalGramatica.g:854:3: ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'debe ser' ) )
            {
            // InternalGramatica.g:854:3: ( (lv_negacion_0_0= 'no' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:855:4: (lv_negacion_0_0= 'no' )
                    {
                    // InternalGramatica.g:855:4: (lv_negacion_0_0= 'no' )
                    // InternalGramatica.g:856:5: lv_negacion_0_0= 'no'
                    {
                    lv_negacion_0_0=(Token)match(input,20,FOLLOW_16); 

                    					newLeafNode(lv_negacion_0_0, grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionRule());
                    					}
                    					setWithLastConsumed(current, "negacion", lv_negacion_0_0, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalGramatica.g:868:3: ( (lv_obligacion_1_0= 'debe ser' ) )
            // InternalGramatica.g:869:4: (lv_obligacion_1_0= 'debe ser' )
            {
            // InternalGramatica.g:869:4: (lv_obligacion_1_0= 'debe ser' )
            // InternalGramatica.g:870:5: lv_obligacion_1_0= 'debe ser'
            {
            lv_obligacion_1_0=(Token)match(input,21,FOLLOW_2); 

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
    // InternalGramatica.g:886:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalGramatica.g:886:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalGramatica.g:887:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalGramatica.g:893:1: ruleOperacion returns [EObject current=null] : ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) ) ;
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
            // InternalGramatica.g:899:2: ( ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) ) )
            // InternalGramatica.g:900:2: ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) )
            {
            // InternalGramatica.g:900:2: ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) )
            // InternalGramatica.g:901:3: ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) )
            {
            // InternalGramatica.g:901:3: ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) )
            // InternalGramatica.g:902:4: (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' )
            {
            // InternalGramatica.g:902:4: (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 25:
                {
                alt13=4;
                }
                break;
            case 26:
                {
                alt13=5;
                }
                break;
            case 27:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGramatica.g:903:5: lv_operacion_0_1= 'mayor que'
                    {
                    lv_operacion_0_1=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_1, grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:914:5: lv_operacion_0_2= 'menor que'
                    {
                    lv_operacion_0_2=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_2, grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:925:5: lv_operacion_0_3= 'igual a'
                    {
                    lv_operacion_0_3=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_3, grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:936:5: lv_operacion_0_4= 'mayor o igual a'
                    {
                    lv_operacion_0_4=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_4, grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:947:5: lv_operacion_0_5= 'menor o igual a'
                    {
                    lv_operacion_0_5=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_5, grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:958:5: lv_operacion_0_6= 'distinto de'
                    {
                    lv_operacion_0_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalGramatica.g:974:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:974:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:975:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGramatica.g:981:1: ruleLiteral returns [EObject current=null] : ( (lv_valor_0_0= RULE_STRING ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:987:2: ( ( (lv_valor_0_0= RULE_STRING ) ) )
            // InternalGramatica.g:988:2: ( (lv_valor_0_0= RULE_STRING ) )
            {
            // InternalGramatica.g:988:2: ( (lv_valor_0_0= RULE_STRING ) )
            // InternalGramatica.g:989:3: (lv_valor_0_0= RULE_STRING )
            {
            // InternalGramatica.g:989:3: (lv_valor_0_0= RULE_STRING )
            // InternalGramatica.g:990:4: lv_valor_0_0= RULE_STRING
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\1\uffff\3\4\1\22\1\13\1\4\1\uffff\1\13";
    static final String dfa_3s = "\1\17\1\uffff\1\21\2\4\1\22\1\25\1\4\1\uffff\1\25";
    static final String dfa_4s = "\1\uffff\1\1\6\uffff\1\2\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\5\13\uffff\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\10\3\uffff\1\2\3\uffff\1\7\2\1",
            "\1\11",
            "",
            "\1\10\10\uffff\2\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "271:5: (lv_simple_0_1= ruleSimple | lv_simple_0_2= ruleIteracion )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000308020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000308022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});

}