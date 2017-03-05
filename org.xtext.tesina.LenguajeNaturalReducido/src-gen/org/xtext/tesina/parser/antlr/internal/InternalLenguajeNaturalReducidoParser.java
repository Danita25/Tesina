package org.xtext.tesina.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tesina.services.LenguajeNaturalReducidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLenguajeNaturalReducidoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'si'", "'y'", "'o'", "'entonces'", "'tal que'", "'satisfacen que'", "'existe uno tal que'", "'el/la'", "'todos los/las'", "'existe un'", "'entre los'", "'cantidad de'", "'de'", "'un/una'", "'no'", "'es'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalLenguajeNaturalReducidoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLenguajeNaturalReducidoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLenguajeNaturalReducidoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLenguajeNaturalReducido.g"; }



     	private LenguajeNaturalReducidoGrammarAccess grammarAccess;

        public InternalLenguajeNaturalReducidoParser(TokenStream input, LenguajeNaturalReducidoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Documento";
       	}

       	@Override
       	protected LenguajeNaturalReducidoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocumento"
    // InternalLenguajeNaturalReducido.g:64:1: entryRuleDocumento returns [EObject current=null] : iv_ruleDocumento= ruleDocumento EOF ;
    public final EObject entryRuleDocumento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumento = null;


        try {
            // InternalLenguajeNaturalReducido.g:64:50: (iv_ruleDocumento= ruleDocumento EOF )
            // InternalLenguajeNaturalReducido.g:65:2: iv_ruleDocumento= ruleDocumento EOF
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
    // InternalLenguajeNaturalReducido.g:71:1: ruleDocumento returns [EObject current=null] : ( ( (lv_encabezado_0_0= RULE_STRING ) ) ruleFinOracion ( (lv_oraciones_2_0= ruleOracion ) )* ) ;
    public final EObject ruleDocumento() throws RecognitionException {
        EObject current = null;

        Token lv_encabezado_0_0=null;
        EObject lv_oraciones_2_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:77:2: ( ( ( (lv_encabezado_0_0= RULE_STRING ) ) ruleFinOracion ( (lv_oraciones_2_0= ruleOracion ) )* ) )
            // InternalLenguajeNaturalReducido.g:78:2: ( ( (lv_encabezado_0_0= RULE_STRING ) ) ruleFinOracion ( (lv_oraciones_2_0= ruleOracion ) )* )
            {
            // InternalLenguajeNaturalReducido.g:78:2: ( ( (lv_encabezado_0_0= RULE_STRING ) ) ruleFinOracion ( (lv_oraciones_2_0= ruleOracion ) )* )
            // InternalLenguajeNaturalReducido.g:79:3: ( (lv_encabezado_0_0= RULE_STRING ) ) ruleFinOracion ( (lv_oraciones_2_0= ruleOracion ) )*
            {
            // InternalLenguajeNaturalReducido.g:79:3: ( (lv_encabezado_0_0= RULE_STRING ) )
            // InternalLenguajeNaturalReducido.g:80:4: (lv_encabezado_0_0= RULE_STRING )
            {
            // InternalLenguajeNaturalReducido.g:80:4: (lv_encabezado_0_0= RULE_STRING )
            // InternalLenguajeNaturalReducido.g:81:5: lv_encabezado_0_0= RULE_STRING
            {
            lv_encabezado_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_encabezado_0_0, grammarAccess.getDocumentoAccess().getEncabezadoSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"encabezado",
            						lv_encabezado_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            			newCompositeNode(grammarAccess.getDocumentoAccess().getFinOracionParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            ruleFinOracion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalLenguajeNaturalReducido.g:104:3: ( (lv_oraciones_2_0= ruleOracion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==12||(LA1_0>=19 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:105:4: (lv_oraciones_2_0= ruleOracion )
            	    {
            	    // InternalLenguajeNaturalReducido.g:105:4: (lv_oraciones_2_0= ruleOracion )
            	    // InternalLenguajeNaturalReducido.g:106:5: lv_oraciones_2_0= ruleOracion
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
            	    						"org.xtext.tesina.LenguajeNaturalReducido.Oracion");
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
    // InternalLenguajeNaturalReducido.g:127:1: entryRuleOracion returns [EObject current=null] : iv_ruleOracion= ruleOracion EOF ;
    public final EObject entryRuleOracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracion = null;


        try {
            // InternalLenguajeNaturalReducido.g:127:48: (iv_ruleOracion= ruleOracion EOF )
            // InternalLenguajeNaturalReducido.g:128:2: iv_ruleOracion= ruleOracion EOF
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
    // InternalLenguajeNaturalReducido.g:134:1: ruleOracion returns [EObject current=null] : ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject lv_contenido_0_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:140:2: ( ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:141:2: ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:141:2: ( ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:142:3: ( (lv_contenido_0_0= ruleContenido ) ) ruleFinOracion
            {
            // InternalLenguajeNaturalReducido.g:142:3: ( (lv_contenido_0_0= ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:143:4: (lv_contenido_0_0= ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:143:4: (lv_contenido_0_0= ruleContenido )
            // InternalLenguajeNaturalReducido.g:144:5: lv_contenido_0_0= ruleContenido
            {

            					newCompositeNode(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_contenido_0_0=ruleContenido();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOracionRule());
            					}
            					set(
            						current,
            						"contenido",
            						lv_contenido_0_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Contenido");
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


    // $ANTLR start "entryRuleFinOracion"
    // InternalLenguajeNaturalReducido.g:172:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalLenguajeNaturalReducido.g:172:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalLenguajeNaturalReducido.g:173:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalLenguajeNaturalReducido.g:179:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.\\r\\n' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:185:2: (kw= '.\\r\\n' )
            // InternalLenguajeNaturalReducido.g:186:2: kw= '.\\r\\n'
            {
            kw=(Token)match(input,11,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContenido"
    // InternalLenguajeNaturalReducido.g:194:1: entryRuleContenido returns [EObject current=null] : iv_ruleContenido= ruleContenido EOF ;
    public final EObject entryRuleContenido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContenido = null;


        try {
            // InternalLenguajeNaturalReducido.g:194:50: (iv_ruleContenido= ruleContenido EOF )
            // InternalLenguajeNaturalReducido.g:195:2: iv_ruleContenido= ruleContenido EOF
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
    // InternalLenguajeNaturalReducido.g:201:1: ruleContenido returns [EObject current=null] : ( ( (lv_prefijo_0_0= 'si' ) )? ( (lv_simple_1_0= ruleSimple ) ) ( (lv_composicion_2_0= ruleComposicion ) )? ) ;
    public final EObject ruleContenido() throws RecognitionException {
        EObject current = null;

        Token lv_prefijo_0_0=null;
        EObject lv_simple_1_0 = null;

        EObject lv_composicion_2_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:207:2: ( ( ( (lv_prefijo_0_0= 'si' ) )? ( (lv_simple_1_0= ruleSimple ) ) ( (lv_composicion_2_0= ruleComposicion ) )? ) )
            // InternalLenguajeNaturalReducido.g:208:2: ( ( (lv_prefijo_0_0= 'si' ) )? ( (lv_simple_1_0= ruleSimple ) ) ( (lv_composicion_2_0= ruleComposicion ) )? )
            {
            // InternalLenguajeNaturalReducido.g:208:2: ( ( (lv_prefijo_0_0= 'si' ) )? ( (lv_simple_1_0= ruleSimple ) ) ( (lv_composicion_2_0= ruleComposicion ) )? )
            // InternalLenguajeNaturalReducido.g:209:3: ( (lv_prefijo_0_0= 'si' ) )? ( (lv_simple_1_0= ruleSimple ) ) ( (lv_composicion_2_0= ruleComposicion ) )?
            {
            // InternalLenguajeNaturalReducido.g:209:3: ( (lv_prefijo_0_0= 'si' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:210:4: (lv_prefijo_0_0= 'si' )
                    {
                    // InternalLenguajeNaturalReducido.g:210:4: (lv_prefijo_0_0= 'si' )
                    // InternalLenguajeNaturalReducido.g:211:5: lv_prefijo_0_0= 'si'
                    {
                    lv_prefijo_0_0=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(lv_prefijo_0_0, grammarAccess.getContenidoAccess().getPrefijoSiKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContenidoRule());
                    					}
                    					setWithLastConsumed(current, "prefijo", lv_prefijo_0_0, "si");
                    				

                    }


                    }
                    break;

            }

            // InternalLenguajeNaturalReducido.g:223:3: ( (lv_simple_1_0= ruleSimple ) )
            // InternalLenguajeNaturalReducido.g:224:4: (lv_simple_1_0= ruleSimple )
            {
            // InternalLenguajeNaturalReducido.g:224:4: (lv_simple_1_0= ruleSimple )
            // InternalLenguajeNaturalReducido.g:225:5: lv_simple_1_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_simple_1_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContenidoRule());
            					}
            					set(
            						current,
            						"simple",
            						lv_simple_1_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajeNaturalReducido.g:242:3: ( (lv_composicion_2_0= ruleComposicion ) )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case 13:
                    {
                    alt3=1;
                    }
                    break;
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                case 15:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:243:4: (lv_composicion_2_0= ruleComposicion )
                    {
                    // InternalLenguajeNaturalReducido.g:243:4: (lv_composicion_2_0= ruleComposicion )
                    // InternalLenguajeNaturalReducido.g:244:5: lv_composicion_2_0= ruleComposicion
                    {

                    					newCompositeNode(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_composicion_2_0=ruleComposicion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContenidoRule());
                    					}
                    					set(
                    						current,
                    						"composicion",
                    						lv_composicion_2_0,
                    						"org.xtext.tesina.LenguajeNaturalReducido.Composicion");
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
    // InternalLenguajeNaturalReducido.g:265:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalLenguajeNaturalReducido.g:265:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalLenguajeNaturalReducido.g:266:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalLenguajeNaturalReducido.g:272:1: ruleSimple returns [EObject current=null] : ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_expresion_der_1_0= ruleExpresionDerecha ) )? ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        EObject lv_expresion_izq_0_0 = null;

        EObject lv_expresion_der_1_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:278:2: ( ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_expresion_der_1_0= ruleExpresionDerecha ) )? ) )
            // InternalLenguajeNaturalReducido.g:279:2: ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_expresion_der_1_0= ruleExpresionDerecha ) )? )
            {
            // InternalLenguajeNaturalReducido.g:279:2: ( ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_expresion_der_1_0= ruleExpresionDerecha ) )? )
            // InternalLenguajeNaturalReducido.g:280:3: ( (lv_expresion_izq_0_0= ruleExpresion ) ) ( (lv_expresion_der_1_0= ruleExpresionDerecha ) )?
            {
            // InternalLenguajeNaturalReducido.g:280:3: ( (lv_expresion_izq_0_0= ruleExpresion ) )
            // InternalLenguajeNaturalReducido.g:281:4: (lv_expresion_izq_0_0= ruleExpresion )
            {
            // InternalLenguajeNaturalReducido.g:281:4: (lv_expresion_izq_0_0= ruleExpresion )
            // InternalLenguajeNaturalReducido.g:282:5: lv_expresion_izq_0_0= ruleExpresion
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
            						"org.xtext.tesina.LenguajeNaturalReducido.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajeNaturalReducido.g:299:3: ( (lv_expresion_der_1_0= ruleExpresionDerecha ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:300:4: (lv_expresion_der_1_0= ruleExpresionDerecha )
                    {
                    // InternalLenguajeNaturalReducido.g:300:4: (lv_expresion_der_1_0= ruleExpresionDerecha )
                    // InternalLenguajeNaturalReducido.g:301:5: lv_expresion_der_1_0= ruleExpresionDerecha
                    {

                    					newCompositeNode(grammarAccess.getSimpleAccess().getExpresion_derExpresionDerechaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expresion_der_1_0=ruleExpresionDerecha();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleRule());
                    					}
                    					set(
                    						current,
                    						"expresion_der",
                    						lv_expresion_der_1_0,
                    						"org.xtext.tesina.LenguajeNaturalReducido.ExpresionDerecha");
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


    // $ANTLR start "entryRuleExpresionDerecha"
    // InternalLenguajeNaturalReducido.g:322:1: entryRuleExpresionDerecha returns [EObject current=null] : iv_ruleExpresionDerecha= ruleExpresionDerecha EOF ;
    public final EObject entryRuleExpresionDerecha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionDerecha = null;


        try {
            // InternalLenguajeNaturalReducido.g:322:57: (iv_ruleExpresionDerecha= ruleExpresionDerecha EOF )
            // InternalLenguajeNaturalReducido.g:323:2: iv_ruleExpresionDerecha= ruleExpresionDerecha EOF
            {
             newCompositeNode(grammarAccess.getExpresionDerechaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionDerecha=ruleExpresionDerecha();

            state._fsp--;

             current =iv_ruleExpresionDerecha; 
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
    // $ANTLR end "entryRuleExpresionDerecha"


    // $ANTLR start "ruleExpresionDerecha"
    // InternalLenguajeNaturalReducido.g:329:1: ruleExpresionDerecha returns [EObject current=null] : ( ( (lv_comparacion_0_0= ruleComparacion ) ) ( (lv_expresion_1_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionDerecha() throws RecognitionException {
        EObject current = null;

        EObject lv_comparacion_0_0 = null;

        EObject lv_expresion_1_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:335:2: ( ( ( (lv_comparacion_0_0= ruleComparacion ) ) ( (lv_expresion_1_0= ruleExpresion ) ) ) )
            // InternalLenguajeNaturalReducido.g:336:2: ( ( (lv_comparacion_0_0= ruleComparacion ) ) ( (lv_expresion_1_0= ruleExpresion ) ) )
            {
            // InternalLenguajeNaturalReducido.g:336:2: ( ( (lv_comparacion_0_0= ruleComparacion ) ) ( (lv_expresion_1_0= ruleExpresion ) ) )
            // InternalLenguajeNaturalReducido.g:337:3: ( (lv_comparacion_0_0= ruleComparacion ) ) ( (lv_expresion_1_0= ruleExpresion ) )
            {
            // InternalLenguajeNaturalReducido.g:337:3: ( (lv_comparacion_0_0= ruleComparacion ) )
            // InternalLenguajeNaturalReducido.g:338:4: (lv_comparacion_0_0= ruleComparacion )
            {
            // InternalLenguajeNaturalReducido.g:338:4: (lv_comparacion_0_0= ruleComparacion )
            // InternalLenguajeNaturalReducido.g:339:5: lv_comparacion_0_0= ruleComparacion
            {

            					newCompositeNode(grammarAccess.getExpresionDerechaAccess().getComparacionComparacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_comparacion_0_0=ruleComparacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionDerechaRule());
            					}
            					set(
            						current,
            						"comparacion",
            						lv_comparacion_0_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Comparacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajeNaturalReducido.g:356:3: ( (lv_expresion_1_0= ruleExpresion ) )
            // InternalLenguajeNaturalReducido.g:357:4: (lv_expresion_1_0= ruleExpresion )
            {
            // InternalLenguajeNaturalReducido.g:357:4: (lv_expresion_1_0= ruleExpresion )
            // InternalLenguajeNaturalReducido.g:358:5: lv_expresion_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionDerechaAccess().getExpresionExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expresion_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionDerechaRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_1_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Expresion");
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
    // $ANTLR end "ruleExpresionDerecha"


    // $ANTLR start "entryRuleComposicion"
    // InternalLenguajeNaturalReducido.g:379:1: entryRuleComposicion returns [EObject current=null] : iv_ruleComposicion= ruleComposicion EOF ;
    public final EObject entryRuleComposicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposicion = null;


        try {
            // InternalLenguajeNaturalReducido.g:379:52: (iv_ruleComposicion= ruleComposicion EOF )
            // InternalLenguajeNaturalReducido.g:380:2: iv_ruleComposicion= ruleComposicion EOF
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
    // InternalLenguajeNaturalReducido.g:386:1: ruleComposicion returns [EObject current=null] : ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) ;
    public final EObject ruleComposicion() throws RecognitionException {
        EObject current = null;

        EObject lv_nexo_0_0 = null;

        EObject lv_contenido_1_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:392:2: ( ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) )
            // InternalLenguajeNaturalReducido.g:393:2: ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            {
            // InternalLenguajeNaturalReducido.g:393:2: ( ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            // InternalLenguajeNaturalReducido.g:394:3: ( (lv_nexo_0_0= ruleNexo ) ) ( (lv_contenido_1_0= ruleContenido ) )
            {
            // InternalLenguajeNaturalReducido.g:394:3: ( (lv_nexo_0_0= ruleNexo ) )
            // InternalLenguajeNaturalReducido.g:395:4: (lv_nexo_0_0= ruleNexo )
            {
            // InternalLenguajeNaturalReducido.g:395:4: (lv_nexo_0_0= ruleNexo )
            // InternalLenguajeNaturalReducido.g:396:5: lv_nexo_0_0= ruleNexo
            {

            					newCompositeNode(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_nexo_0_0=ruleNexo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComposicionRule());
            					}
            					set(
            						current,
            						"nexo",
            						lv_nexo_0_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Nexo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajeNaturalReducido.g:413:3: ( (lv_contenido_1_0= ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:414:4: (lv_contenido_1_0= ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:414:4: (lv_contenido_1_0= ruleContenido )
            // InternalLenguajeNaturalReducido.g:415:5: lv_contenido_1_0= ruleContenido
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
            						"org.xtext.tesina.LenguajeNaturalReducido.Contenido");
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
    // InternalLenguajeNaturalReducido.g:436:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalLenguajeNaturalReducido.g:436:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalLenguajeNaturalReducido.g:437:2: iv_ruleNexo= ruleNexo EOF
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
    // InternalLenguajeNaturalReducido.g:443:1: ruleNexo returns [EObject current=null] : ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' ) ) ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_1=null;
        Token lv_valor_0_2=null;
        Token lv_valor_0_3=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:449:2: ( ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' ) ) ) )
            // InternalLenguajeNaturalReducido.g:450:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' ) ) )
            {
            // InternalLenguajeNaturalReducido.g:450:2: ( ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' ) ) )
            // InternalLenguajeNaturalReducido.g:451:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' ) )
            {
            // InternalLenguajeNaturalReducido.g:451:3: ( (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' ) )
            // InternalLenguajeNaturalReducido.g:452:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' )
            {
            // InternalLenguajeNaturalReducido.g:452:4: (lv_valor_0_1= 'y' | lv_valor_0_2= 'o' | lv_valor_0_3= 'entonces' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:453:5: lv_valor_0_1= 'y'
                    {
                    lv_valor_0_1=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_valor_0_1, grammarAccess.getNexoAccess().getValorYKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "valor", lv_valor_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:464:5: lv_valor_0_2= 'o'
                    {
                    lv_valor_0_2=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_valor_0_2, grammarAccess.getNexoAccess().getValorOKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "valor", lv_valor_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:475:5: lv_valor_0_3= 'entonces'
                    {
                    lv_valor_0_3=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_valor_0_3, grammarAccess.getNexoAccess().getValorEntoncesKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNexoRule());
                    					}
                    					setWithLastConsumed(current, "valor", lv_valor_0_3, null);
                    				

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
    // InternalLenguajeNaturalReducido.g:491:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalLenguajeNaturalReducido.g:491:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalLenguajeNaturalReducido.g:492:2: iv_ruleExpresion= ruleExpresion EOF
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
    // InternalLenguajeNaturalReducido.g:498:1: ruleExpresion returns [EObject current=null] : ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject lv_expresion_0_1 = null;

        EObject lv_expresion_0_2 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:504:2: ( ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) ) )
            // InternalLenguajeNaturalReducido.g:505:2: ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) )
            {
            // InternalLenguajeNaturalReducido.g:505:2: ( ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) ) )
            // InternalLenguajeNaturalReducido.g:506:3: ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) )
            {
            // InternalLenguajeNaturalReducido.g:506:3: ( (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad ) )
            // InternalLenguajeNaturalReducido.g:507:4: (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad )
            {
            // InternalLenguajeNaturalReducido.g:507:4: (lv_expresion_0_1= ruleLiteral | lv_expresion_0_2= rulePropiedad )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=22)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:508:5: lv_expresion_0_1= ruleLiteral
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
                    						"org.xtext.tesina.LenguajeNaturalReducido.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:524:5: lv_expresion_0_2= rulePropiedad
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
                    						"org.xtext.tesina.LenguajeNaturalReducido.Propiedad");
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
    // InternalLenguajeNaturalReducido.g:545:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // InternalLenguajeNaturalReducido.g:545:52: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalLenguajeNaturalReducido.g:546:2: iv_ruleComparacion= ruleComparacion EOF
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
    // InternalLenguajeNaturalReducido.g:552:1: ruleComparacion returns [EObject current=null] : ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject lv_obligacion_0_0 = null;

        EObject lv_operacion_1_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:558:2: ( ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) ) )
            // InternalLenguajeNaturalReducido.g:559:2: ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) )
            {
            // InternalLenguajeNaturalReducido.g:559:2: ( ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) ) )
            // InternalLenguajeNaturalReducido.g:560:3: ( (lv_obligacion_0_0= ruleObligacion ) ) ( (lv_operacion_1_0= ruleOperacion ) )
            {
            // InternalLenguajeNaturalReducido.g:560:3: ( (lv_obligacion_0_0= ruleObligacion ) )
            // InternalLenguajeNaturalReducido.g:561:4: (lv_obligacion_0_0= ruleObligacion )
            {
            // InternalLenguajeNaturalReducido.g:561:4: (lv_obligacion_0_0= ruleObligacion )
            // InternalLenguajeNaturalReducido.g:562:5: lv_obligacion_0_0= ruleObligacion
            {

            					newCompositeNode(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_obligacion_0_0=ruleObligacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparacionRule());
            					}
            					set(
            						current,
            						"obligacion",
            						lv_obligacion_0_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Obligacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajeNaturalReducido.g:579:3: ( (lv_operacion_1_0= ruleOperacion ) )
            // InternalLenguajeNaturalReducido.g:580:4: (lv_operacion_1_0= ruleOperacion )
            {
            // InternalLenguajeNaturalReducido.g:580:4: (lv_operacion_1_0= ruleOperacion )
            // InternalLenguajeNaturalReducido.g:581:5: lv_operacion_1_0= ruleOperacion
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
            						"org.xtext.tesina.LenguajeNaturalReducido.Operacion");
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
    // InternalLenguajeNaturalReducido.g:602:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // InternalLenguajeNaturalReducido.g:602:50: (iv_rulePropiedad= rulePropiedad EOF )
            // InternalLenguajeNaturalReducido.g:603:2: iv_rulePropiedad= rulePropiedad EOF
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
    // InternalLenguajeNaturalReducido.g:609:1: rulePropiedad returns [EObject current=null] : ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ( (lv_iteracion_2_0= ruleIteracion ) )* ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject lv_atributo_0_0 = null;

        EObject lv_termino_1_0 = null;

        EObject lv_iteracion_2_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:615:2: ( ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ( (lv_iteracion_2_0= ruleIteracion ) )* ) )
            // InternalLenguajeNaturalReducido.g:616:2: ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ( (lv_iteracion_2_0= ruleIteracion ) )* )
            {
            // InternalLenguajeNaturalReducido.g:616:2: ( ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ( (lv_iteracion_2_0= ruleIteracion ) )* )
            // InternalLenguajeNaturalReducido.g:617:3: ( (lv_atributo_0_0= ruleAtributo ) )+ ( (lv_termino_1_0= ruleTermino ) )? ( (lv_iteracion_2_0= ruleIteracion ) )*
            {
            // InternalLenguajeNaturalReducido.g:617:3: ( (lv_atributo_0_0= ruleAtributo ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:618:4: (lv_atributo_0_0= ruleAtributo )
            	    {
            	    // InternalLenguajeNaturalReducido.g:618:4: (lv_atributo_0_0= ruleAtributo )
            	    // InternalLenguajeNaturalReducido.g:619:5: lv_atributo_0_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_atributo_0_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropiedadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributo",
            	    						lv_atributo_0_0,
            	    						"org.xtext.tesina.LenguajeNaturalReducido.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalLenguajeNaturalReducido.g:636:3: ( (lv_termino_1_0= ruleTermino ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:637:4: (lv_termino_1_0= ruleTermino )
                    {
                    // InternalLenguajeNaturalReducido.g:637:4: (lv_termino_1_0= ruleTermino )
                    // InternalLenguajeNaturalReducido.g:638:5: lv_termino_1_0= ruleTermino
                    {

                    					newCompositeNode(grammarAccess.getPropiedadAccess().getTerminoTerminoParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_termino_1_0=ruleTermino();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropiedadRule());
                    					}
                    					set(
                    						current,
                    						"termino",
                    						lv_termino_1_0,
                    						"org.xtext.tesina.LenguajeNaturalReducido.Termino");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLenguajeNaturalReducido.g:655:3: ( (lv_iteracion_2_0= ruleIteracion ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt9=1;
                    }
                    break;
                case 17:
                    {
                    alt9=1;
                    }
                    break;
                case 18:
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:656:4: (lv_iteracion_2_0= ruleIteracion )
            	    {
            	    // InternalLenguajeNaturalReducido.g:656:4: (lv_iteracion_2_0= ruleIteracion )
            	    // InternalLenguajeNaturalReducido.g:657:5: lv_iteracion_2_0= ruleIteracion
            	    {

            	    					newCompositeNode(grammarAccess.getPropiedadAccess().getIteracionIteracionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_iteracion_2_0=ruleIteracion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropiedadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"iteracion",
            	    						lv_iteracion_2_0,
            	    						"org.xtext.tesina.LenguajeNaturalReducido.Iteracion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleIteracion"
    // InternalLenguajeNaturalReducido.g:678:1: entryRuleIteracion returns [EObject current=null] : iv_ruleIteracion= ruleIteracion EOF ;
    public final EObject entryRuleIteracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteracion = null;


        try {
            // InternalLenguajeNaturalReducido.g:678:50: (iv_ruleIteracion= ruleIteracion EOF )
            // InternalLenguajeNaturalReducido.g:679:2: iv_ruleIteracion= ruleIteracion EOF
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
    // InternalLenguajeNaturalReducido.g:685:1: ruleIteracion returns [EObject current=null] : ( ( ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) ;
    public final EObject ruleIteracion() throws RecognitionException {
        EObject current = null;

        Token lv_conector_0_1=null;
        Token lv_conector_0_2=null;
        Token lv_conector_0_3=null;
        EObject lv_contenido_1_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:691:2: ( ( ( ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) ) ) ( (lv_contenido_1_0= ruleContenido ) ) ) )
            // InternalLenguajeNaturalReducido.g:692:2: ( ( ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            {
            // InternalLenguajeNaturalReducido.g:692:2: ( ( ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) ) ) ( (lv_contenido_1_0= ruleContenido ) ) )
            // InternalLenguajeNaturalReducido.g:693:3: ( ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) ) ) ( (lv_contenido_1_0= ruleContenido ) )
            {
            // InternalLenguajeNaturalReducido.g:693:3: ( ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) ) )
            // InternalLenguajeNaturalReducido.g:694:4: ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) )
            {
            // InternalLenguajeNaturalReducido.g:694:4: ( (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' ) )
            // InternalLenguajeNaturalReducido.g:695:5: (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' )
            {
            // InternalLenguajeNaturalReducido.g:695:5: (lv_conector_0_1= 'tal que' | lv_conector_0_2= 'satisfacen que' | lv_conector_0_3= 'existe uno tal que' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:696:6: lv_conector_0_1= 'tal que'
                    {
                    lv_conector_0_1=(Token)match(input,16,FOLLOW_5); 

                    						newLeafNode(lv_conector_0_1, grammarAccess.getIteracionAccess().getConectorTalQueKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIteracionRule());
                    						}
                    						setWithLastConsumed(current, "conector", lv_conector_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:707:6: lv_conector_0_2= 'satisfacen que'
                    {
                    lv_conector_0_2=(Token)match(input,17,FOLLOW_5); 

                    						newLeafNode(lv_conector_0_2, grammarAccess.getIteracionAccess().getConectorSatisfacenQueKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIteracionRule());
                    						}
                    						setWithLastConsumed(current, "conector", lv_conector_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:718:6: lv_conector_0_3= 'existe uno tal que'
                    {
                    lv_conector_0_3=(Token)match(input,18,FOLLOW_5); 

                    						newLeafNode(lv_conector_0_3, grammarAccess.getIteracionAccess().getConectorExisteUnoTalQueKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIteracionRule());
                    						}
                    						setWithLastConsumed(current, "conector", lv_conector_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalLenguajeNaturalReducido.g:731:3: ( (lv_contenido_1_0= ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:732:4: (lv_contenido_1_0= ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:732:4: (lv_contenido_1_0= ruleContenido )
            // InternalLenguajeNaturalReducido.g:733:5: lv_contenido_1_0= ruleContenido
            {

            					newCompositeNode(grammarAccess.getIteracionAccess().getContenidoContenidoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_contenido_1_0=ruleContenido();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteracionRule());
            					}
            					set(
            						current,
            						"contenido",
            						lv_contenido_1_0,
            						"org.xtext.tesina.LenguajeNaturalReducido.Contenido");
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
    // $ANTLR end "ruleIteracion"


    // $ANTLR start "entryRuleAtributo"
    // InternalLenguajeNaturalReducido.g:754:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalLenguajeNaturalReducido.g:754:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalLenguajeNaturalReducido.g:755:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalLenguajeNaturalReducido.g:761:1: ruleAtributo returns [EObject current=null] : ( ( ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_determinante_0_1=null;
        Token lv_determinante_0_2=null;
        Token lv_determinante_0_3=null;
        Token lv_determinante_0_4=null;
        Token lv_prefijo_1_0=null;
        Token lv_nombre_2_0=null;
        Token lv_enlace_3_0=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:767:2: ( ( ( ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) ) )
            // InternalLenguajeNaturalReducido.g:768:2: ( ( ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) )
            {
            // InternalLenguajeNaturalReducido.g:768:2: ( ( ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) ) )
            // InternalLenguajeNaturalReducido.g:769:3: ( ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) ) ) ( (lv_prefijo_1_0= 'cantidad de' ) )? ( (lv_nombre_2_0= RULE_ID ) ) ( (lv_enlace_3_0= 'de' ) )
            {
            // InternalLenguajeNaturalReducido.g:769:3: ( ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) ) )
            // InternalLenguajeNaturalReducido.g:770:4: ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) )
            {
            // InternalLenguajeNaturalReducido.g:770:4: ( (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' ) )
            // InternalLenguajeNaturalReducido.g:771:5: (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' )
            {
            // InternalLenguajeNaturalReducido.g:771:5: (lv_determinante_0_1= 'el/la' | lv_determinante_0_2= 'todos los/las' | lv_determinante_0_3= 'existe un' | lv_determinante_0_4= 'entre los' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:772:6: lv_determinante_0_1= 'el/la'
                    {
                    lv_determinante_0_1=(Token)match(input,19,FOLLOW_11); 

                    						newLeafNode(lv_determinante_0_1, grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtributoRule());
                    						}
                    						setWithLastConsumed(current, "determinante", lv_determinante_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:783:6: lv_determinante_0_2= 'todos los/las'
                    {
                    lv_determinante_0_2=(Token)match(input,20,FOLLOW_11); 

                    						newLeafNode(lv_determinante_0_2, grammarAccess.getAtributoAccess().getDeterminanteTodosLosLasKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtributoRule());
                    						}
                    						setWithLastConsumed(current, "determinante", lv_determinante_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:794:6: lv_determinante_0_3= 'existe un'
                    {
                    lv_determinante_0_3=(Token)match(input,21,FOLLOW_11); 

                    						newLeafNode(lv_determinante_0_3, grammarAccess.getAtributoAccess().getDeterminanteExisteUnKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtributoRule());
                    						}
                    						setWithLastConsumed(current, "determinante", lv_determinante_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:805:6: lv_determinante_0_4= 'entre los'
                    {
                    lv_determinante_0_4=(Token)match(input,22,FOLLOW_11); 

                    						newLeafNode(lv_determinante_0_4, grammarAccess.getAtributoAccess().getDeterminanteEntreLosKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtributoRule());
                    						}
                    						setWithLastConsumed(current, "determinante", lv_determinante_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalLenguajeNaturalReducido.g:818:3: ( (lv_prefijo_1_0= 'cantidad de' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:819:4: (lv_prefijo_1_0= 'cantidad de' )
                    {
                    // InternalLenguajeNaturalReducido.g:819:4: (lv_prefijo_1_0= 'cantidad de' )
                    // InternalLenguajeNaturalReducido.g:820:5: lv_prefijo_1_0= 'cantidad de'
                    {
                    lv_prefijo_1_0=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(lv_prefijo_1_0, grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoRule());
                    					}
                    					setWithLastConsumed(current, "prefijo", lv_prefijo_1_0, "cantidad de");
                    				

                    }


                    }
                    break;

            }

            // InternalLenguajeNaturalReducido.g:832:3: ( (lv_nombre_2_0= RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:833:4: (lv_nombre_2_0= RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:833:4: (lv_nombre_2_0= RULE_ID )
            // InternalLenguajeNaturalReducido.g:834:5: lv_nombre_2_0= RULE_ID
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

            // InternalLenguajeNaturalReducido.g:850:3: ( (lv_enlace_3_0= 'de' ) )
            // InternalLenguajeNaturalReducido.g:851:4: (lv_enlace_3_0= 'de' )
            {
            // InternalLenguajeNaturalReducido.g:851:4: (lv_enlace_3_0= 'de' )
            // InternalLenguajeNaturalReducido.g:852:5: lv_enlace_3_0= 'de'
            {
            lv_enlace_3_0=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLenguajeNaturalReducido.g:868:1: entryRuleTermino returns [EObject current=null] : iv_ruleTermino= ruleTermino EOF ;
    public final EObject entryRuleTermino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermino = null;


        try {
            // InternalLenguajeNaturalReducido.g:868:48: (iv_ruleTermino= ruleTermino EOF )
            // InternalLenguajeNaturalReducido.g:869:2: iv_ruleTermino= ruleTermino EOF
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
    // InternalLenguajeNaturalReducido.g:875:1: ruleTermino returns [EObject current=null] : ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTermino() throws RecognitionException {
        EObject current = null;

        Token lv_indeterminante_0_0=null;
        Token lv_contexto_1_0=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:881:2: ( ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) ) )
            // InternalLenguajeNaturalReducido.g:882:2: ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) )
            {
            // InternalLenguajeNaturalReducido.g:882:2: ( ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) ) )
            // InternalLenguajeNaturalReducido.g:883:3: ( (lv_indeterminante_0_0= 'un/una' ) ) ( (lv_contexto_1_0= RULE_ID ) )
            {
            // InternalLenguajeNaturalReducido.g:883:3: ( (lv_indeterminante_0_0= 'un/una' ) )
            // InternalLenguajeNaturalReducido.g:884:4: (lv_indeterminante_0_0= 'un/una' )
            {
            // InternalLenguajeNaturalReducido.g:884:4: (lv_indeterminante_0_0= 'un/una' )
            // InternalLenguajeNaturalReducido.g:885:5: lv_indeterminante_0_0= 'un/una'
            {
            lv_indeterminante_0_0=(Token)match(input,25,FOLLOW_12); 

            					newLeafNode(lv_indeterminante_0_0, grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminoRule());
            					}
            					setWithLastConsumed(current, "indeterminante", lv_indeterminante_0_0, "un/una");
            				

            }


            }

            // InternalLenguajeNaturalReducido.g:897:3: ( (lv_contexto_1_0= RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:898:4: (lv_contexto_1_0= RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:898:4: (lv_contexto_1_0= RULE_ID )
            // InternalLenguajeNaturalReducido.g:899:5: lv_contexto_1_0= RULE_ID
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
    // InternalLenguajeNaturalReducido.g:919:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalLenguajeNaturalReducido.g:919:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalLenguajeNaturalReducido.g:920:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalLenguajeNaturalReducido.g:926:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'es' ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacion_0_0=null;
        Token lv_obligacion_1_0=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:932:2: ( ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'es' ) ) ) )
            // InternalLenguajeNaturalReducido.g:933:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'es' ) ) )
            {
            // InternalLenguajeNaturalReducido.g:933:2: ( ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'es' ) ) )
            // InternalLenguajeNaturalReducido.g:934:3: ( (lv_negacion_0_0= 'no' ) )? ( (lv_obligacion_1_0= 'es' ) )
            {
            // InternalLenguajeNaturalReducido.g:934:3: ( (lv_negacion_0_0= 'no' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:935:4: (lv_negacion_0_0= 'no' )
                    {
                    // InternalLenguajeNaturalReducido.g:935:4: (lv_negacion_0_0= 'no' )
                    // InternalLenguajeNaturalReducido.g:936:5: lv_negacion_0_0= 'no'
                    {
                    lv_negacion_0_0=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(lv_negacion_0_0, grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionRule());
                    					}
                    					setWithLastConsumed(current, "negacion", lv_negacion_0_0, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalLenguajeNaturalReducido.g:948:3: ( (lv_obligacion_1_0= 'es' ) )
            // InternalLenguajeNaturalReducido.g:949:4: (lv_obligacion_1_0= 'es' )
            {
            // InternalLenguajeNaturalReducido.g:949:4: (lv_obligacion_1_0= 'es' )
            // InternalLenguajeNaturalReducido.g:950:5: lv_obligacion_1_0= 'es'
            {
            lv_obligacion_1_0=(Token)match(input,27,FOLLOW_2); 

            					newLeafNode(lv_obligacion_1_0, grammarAccess.getObligacionAccess().getObligacionEsKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObligacionRule());
            					}
            					setWithLastConsumed(current, "obligacion", lv_obligacion_1_0, "es");
            				

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
    // InternalLenguajeNaturalReducido.g:966:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalLenguajeNaturalReducido.g:966:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalLenguajeNaturalReducido.g:967:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalLenguajeNaturalReducido.g:973:1: ruleOperacion returns [EObject current=null] : ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) ) ;
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
            // InternalLenguajeNaturalReducido.g:979:2: ( ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) ) )
            // InternalLenguajeNaturalReducido.g:980:2: ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) )
            {
            // InternalLenguajeNaturalReducido.g:980:2: ( ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) ) )
            // InternalLenguajeNaturalReducido.g:981:3: ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) )
            {
            // InternalLenguajeNaturalReducido.g:981:3: ( (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' ) )
            // InternalLenguajeNaturalReducido.g:982:4: (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' )
            {
            // InternalLenguajeNaturalReducido.g:982:4: (lv_operacion_0_1= 'mayor que' | lv_operacion_0_2= 'menor que' | lv_operacion_0_3= 'igual a' | lv_operacion_0_4= 'mayor o igual a' | lv_operacion_0_5= 'menor o igual a' | lv_operacion_0_6= 'distinto de' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            case 32:
                {
                alt14=5;
                }
                break;
            case 33:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:983:5: lv_operacion_0_1= 'mayor que'
                    {
                    lv_operacion_0_1=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_1, grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:994:5: lv_operacion_0_2= 'menor que'
                    {
                    lv_operacion_0_2=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_2, grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:1005:5: lv_operacion_0_3= 'igual a'
                    {
                    lv_operacion_0_3=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_3, grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:1016:5: lv_operacion_0_4= 'mayor o igual a'
                    {
                    lv_operacion_0_4=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_4, grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalLenguajeNaturalReducido.g:1027:5: lv_operacion_0_5= 'menor o igual a'
                    {
                    lv_operacion_0_5=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_operacion_0_5, grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "operacion", lv_operacion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalLenguajeNaturalReducido.g:1038:5: lv_operacion_0_6= 'distinto de'
                    {
                    lv_operacion_0_6=(Token)match(input,33,FOLLOW_2); 

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
    // InternalLenguajeNaturalReducido.g:1054:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalLenguajeNaturalReducido.g:1054:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalLenguajeNaturalReducido.g:1055:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalLenguajeNaturalReducido.g:1061:1: ruleLiteral returns [EObject current=null] : ( (lv_valor_0_0= RULE_STRING ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:1067:2: ( ( (lv_valor_0_0= RULE_STRING ) ) )
            // InternalLenguajeNaturalReducido.g:1068:2: ( (lv_valor_0_0= RULE_STRING ) )
            {
            // InternalLenguajeNaturalReducido.g:1068:2: ( (lv_valor_0_0= RULE_STRING ) )
            // InternalLenguajeNaturalReducido.g:1069:3: (lv_valor_0_0= RULE_STRING )
            {
            // InternalLenguajeNaturalReducido.g:1069:3: (lv_valor_0_0= RULE_STRING )
            // InternalLenguajeNaturalReducido.g:1070:4: lv_valor_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000781012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000781010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000027F1012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});

}