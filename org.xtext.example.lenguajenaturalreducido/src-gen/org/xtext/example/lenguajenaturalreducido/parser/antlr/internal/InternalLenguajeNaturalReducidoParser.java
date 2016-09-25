package org.xtext.example.lenguajenaturalreducido.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.lenguajenaturalreducido.services.LenguajeNaturalReducidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLenguajeNaturalReducidoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'y'", "'o'", "'entonces'", "'El/La'", "'de'", "'un/una'", "'debe ser'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalLenguajeNaturalReducido.g:71:1: ruleDocumento returns [EObject current=null] : ( (lv_oraciones_0_0= ruleOracion ) )* ;
    public final EObject ruleDocumento() throws RecognitionException {
        EObject current = null;

        EObject lv_oraciones_0_0 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:77:2: ( ( (lv_oraciones_0_0= ruleOracion ) )* )
            // InternalLenguajeNaturalReducido.g:78:2: ( (lv_oraciones_0_0= ruleOracion ) )*
            {
            // InternalLenguajeNaturalReducido.g:78:2: ( (lv_oraciones_0_0= ruleOracion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:79:3: (lv_oraciones_0_0= ruleOracion )
            	    {
            	    // InternalLenguajeNaturalReducido.g:79:3: (lv_oraciones_0_0= ruleOracion )
            	    // InternalLenguajeNaturalReducido.g:80:4: lv_oraciones_0_0= ruleOracion
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
            	    					"org.xtext.example.lenguajenaturalreducido.LenguajeNaturalReducido.Oracion");
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
    // InternalLenguajeNaturalReducido.g:100:1: entryRuleOracion returns [EObject current=null] : iv_ruleOracion= ruleOracion EOF ;
    public final EObject entryRuleOracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracion = null;


        try {
            // InternalLenguajeNaturalReducido.g:100:48: (iv_ruleOracion= ruleOracion EOF )
            // InternalLenguajeNaturalReducido.g:101:2: iv_ruleOracion= ruleOracion EOF
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
    // InternalLenguajeNaturalReducido.g:107:1: ruleOracion returns [EObject current=null] : ( ( ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) ) ) ruleFinOracion ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_oracion_0_1 = null;

        AntlrDatatypeRuleToken lv_oracion_0_2 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:113:2: ( ( ( ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) ) ) ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:114:2: ( ( ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) ) ) ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:114:2: ( ( ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) ) ) ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:115:3: ( ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) ) ) ruleFinOracion
            {
            // InternalLenguajeNaturalReducido.g:115:3: ( ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) ) )
            // InternalLenguajeNaturalReducido.g:116:4: ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) )
            {
            // InternalLenguajeNaturalReducido.g:116:4: ( (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta ) )
            // InternalLenguajeNaturalReducido.g:117:5: (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta )
            {
            // InternalLenguajeNaturalReducido.g:117:5: (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:118:6: lv_oracion_0_1= ruleSimple
                    {

                    						newCompositeNode(grammarAccess.getOracionAccess().getOracionSimpleParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_oracion_0_1=ruleSimple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracionRule());
                    						}
                    						set(
                    							current,
                    							"oracion",
                    							lv_oracion_0_1,
                    							"org.xtext.example.lenguajenaturalreducido.LenguajeNaturalReducido.Simple");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:134:6: lv_oracion_0_2= ruleCompuesta
                    {

                    						newCompositeNode(grammarAccess.getOracionAccess().getOracionCompuestaParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_4);
                    lv_oracion_0_2=ruleCompuesta();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracionRule());
                    						}
                    						set(
                    							current,
                    							"oracion",
                    							lv_oracion_0_2,
                    							"org.xtext.example.lenguajenaturalreducido.LenguajeNaturalReducido.Compuesta");
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


    // $ANTLR start "entryRuleFinOracion"
    // InternalLenguajeNaturalReducido.g:163:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalLenguajeNaturalReducido.g:163:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalLenguajeNaturalReducido.g:164:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalLenguajeNaturalReducido.g:170:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.\\r\\n' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:176:2: (kw= '.\\r\\n' )
            // InternalLenguajeNaturalReducido.g:177:2: kw= '.\\r\\n'
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


    // $ANTLR start "entryRuleCompuesta"
    // InternalLenguajeNaturalReducido.g:185:1: entryRuleCompuesta returns [String current=null] : iv_ruleCompuesta= ruleCompuesta EOF ;
    public final String entryRuleCompuesta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompuesta = null;


        try {
            // InternalLenguajeNaturalReducido.g:185:49: (iv_ruleCompuesta= ruleCompuesta EOF )
            // InternalLenguajeNaturalReducido.g:186:2: iv_ruleCompuesta= ruleCompuesta EOF
            {
             newCompositeNode(grammarAccess.getCompuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompuesta=ruleCompuesta();

            state._fsp--;

             current =iv_ruleCompuesta.getText(); 
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
    // InternalLenguajeNaturalReducido.g:192:1: ruleCompuesta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Simple_0= ruleSimple (this_Nexo_1= ruleNexo this_Simple_2= ruleSimple )+ ) ;
    public final AntlrDatatypeRuleToken ruleCompuesta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Simple_0 = null;

        AntlrDatatypeRuleToken this_Nexo_1 = null;

        AntlrDatatypeRuleToken this_Simple_2 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:198:2: ( (this_Simple_0= ruleSimple (this_Nexo_1= ruleNexo this_Simple_2= ruleSimple )+ ) )
            // InternalLenguajeNaturalReducido.g:199:2: (this_Simple_0= ruleSimple (this_Nexo_1= ruleNexo this_Simple_2= ruleSimple )+ )
            {
            // InternalLenguajeNaturalReducido.g:199:2: (this_Simple_0= ruleSimple (this_Nexo_1= ruleNexo this_Simple_2= ruleSimple )+ )
            // InternalLenguajeNaturalReducido.g:200:3: this_Simple_0= ruleSimple (this_Nexo_1= ruleNexo this_Simple_2= ruleSimple )+
            {

            			newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Simple_0=ruleSimple();

            state._fsp--;


            			current.merge(this_Simple_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLenguajeNaturalReducido.g:210:3: (this_Nexo_1= ruleNexo this_Simple_2= ruleSimple )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=12 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:211:4: this_Nexo_1= ruleNexo this_Simple_2= ruleSimple
            	    {

            	    				newCompositeNode(grammarAccess.getCompuestaAccess().getNexoParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_6);
            	    this_Nexo_1=ruleNexo();

            	    state._fsp--;


            	    				current.merge(this_Nexo_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_Simple_2=ruleSimple();

            	    state._fsp--;


            	    				current.merge(this_Simple_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalLenguajeNaturalReducido.g:236:1: entryRuleNexo returns [String current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final String entryRuleNexo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNexo = null;


        try {
            // InternalLenguajeNaturalReducido.g:236:44: (iv_ruleNexo= ruleNexo EOF )
            // InternalLenguajeNaturalReducido.g:237:2: iv_ruleNexo= ruleNexo EOF
            {
             newCompositeNode(grammarAccess.getNexoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNexo=ruleNexo();

            state._fsp--;

             current =iv_ruleNexo.getText(); 
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
    // InternalLenguajeNaturalReducido.g:243:1: ruleNexo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'y' | kw= 'o' | kw= 'entonces' ) ;
    public final AntlrDatatypeRuleToken ruleNexo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:249:2: ( (kw= 'y' | kw= 'o' | kw= 'entonces' ) )
            // InternalLenguajeNaturalReducido.g:250:2: (kw= 'y' | kw= 'o' | kw= 'entonces' )
            {
            // InternalLenguajeNaturalReducido.g:250:2: (kw= 'y' | kw= 'o' | kw= 'entonces' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:251:3: kw= 'y'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNexoAccess().getYKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:257:3: kw= 'o'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNexoAccess().getOKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:263:3: kw= 'entonces'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNexoAccess().getEntoncesKeyword_2());
                    		

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


    // $ANTLR start "entryRuleSimple"
    // InternalLenguajeNaturalReducido.g:272:1: entryRuleSimple returns [String current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final String entryRuleSimple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimple = null;


        try {
            // InternalLenguajeNaturalReducido.g:272:46: (iv_ruleSimple= ruleSimple EOF )
            // InternalLenguajeNaturalReducido.g:273:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple.getText(); 
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
    // InternalLenguajeNaturalReducido.g:279:1: ruleSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Determinante_0= ruleDeterminante this_Atributo_1= ruleAtributo this_SintagmaPreposicional_2= ruleSintagmaPreposicional this_Obligacion_3= ruleObligacion this_Operacion_4= ruleOperacion (this_Literal_5= ruleLiteral | this_Atributo_6= ruleAtributo ) ) ;
    public final AntlrDatatypeRuleToken ruleSimple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Determinante_0 = null;

        AntlrDatatypeRuleToken this_Atributo_1 = null;

        AntlrDatatypeRuleToken this_SintagmaPreposicional_2 = null;

        AntlrDatatypeRuleToken this_Obligacion_3 = null;

        AntlrDatatypeRuleToken this_Operacion_4 = null;

        AntlrDatatypeRuleToken this_Literal_5 = null;

        AntlrDatatypeRuleToken this_Atributo_6 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:285:2: ( (this_Determinante_0= ruleDeterminante this_Atributo_1= ruleAtributo this_SintagmaPreposicional_2= ruleSintagmaPreposicional this_Obligacion_3= ruleObligacion this_Operacion_4= ruleOperacion (this_Literal_5= ruleLiteral | this_Atributo_6= ruleAtributo ) ) )
            // InternalLenguajeNaturalReducido.g:286:2: (this_Determinante_0= ruleDeterminante this_Atributo_1= ruleAtributo this_SintagmaPreposicional_2= ruleSintagmaPreposicional this_Obligacion_3= ruleObligacion this_Operacion_4= ruleOperacion (this_Literal_5= ruleLiteral | this_Atributo_6= ruleAtributo ) )
            {
            // InternalLenguajeNaturalReducido.g:286:2: (this_Determinante_0= ruleDeterminante this_Atributo_1= ruleAtributo this_SintagmaPreposicional_2= ruleSintagmaPreposicional this_Obligacion_3= ruleObligacion this_Operacion_4= ruleOperacion (this_Literal_5= ruleLiteral | this_Atributo_6= ruleAtributo ) )
            // InternalLenguajeNaturalReducido.g:287:3: this_Determinante_0= ruleDeterminante this_Atributo_1= ruleAtributo this_SintagmaPreposicional_2= ruleSintagmaPreposicional this_Obligacion_3= ruleObligacion this_Operacion_4= ruleOperacion (this_Literal_5= ruleLiteral | this_Atributo_6= ruleAtributo )
            {

            			newCompositeNode(grammarAccess.getSimpleAccess().getDeterminanteParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Determinante_0=ruleDeterminante();

            state._fsp--;


            			current.merge(this_Determinante_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getSimpleAccess().getAtributoParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Atributo_1=ruleAtributo();

            state._fsp--;


            			current.merge(this_Atributo_1);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getSimpleAccess().getSintagmaPreposicionalParserRuleCall_2());
            		
            pushFollow(FOLLOW_10);
            this_SintagmaPreposicional_2=ruleSintagmaPreposicional();

            state._fsp--;


            			current.merge(this_SintagmaPreposicional_2);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getSimpleAccess().getObligacionParserRuleCall_3());
            		
            pushFollow(FOLLOW_11);
            this_Obligacion_3=ruleObligacion();

            state._fsp--;


            			current.merge(this_Obligacion_3);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getSimpleAccess().getOperacionParserRuleCall_4());
            		
            pushFollow(FOLLOW_12);
            this_Operacion_4=ruleOperacion();

            state._fsp--;


            			current.merge(this_Operacion_4);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLenguajeNaturalReducido.g:337:3: (this_Literal_5= ruleLiteral | this_Atributo_6= ruleAtributo )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:338:4: this_Literal_5= ruleLiteral
                    {

                    				newCompositeNode(grammarAccess.getSimpleAccess().getLiteralParserRuleCall_5_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Literal_5=ruleLiteral();

                    state._fsp--;


                    				current.merge(this_Literal_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:349:4: this_Atributo_6= ruleAtributo
                    {

                    				newCompositeNode(grammarAccess.getSimpleAccess().getAtributoParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Atributo_6=ruleAtributo();

                    state._fsp--;


                    				current.merge(this_Atributo_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

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
    // InternalLenguajeNaturalReducido.g:364:1: entryRuleDeterminante returns [String current=null] : iv_ruleDeterminante= ruleDeterminante EOF ;
    public final String entryRuleDeterminante() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeterminante = null;


        try {
            // InternalLenguajeNaturalReducido.g:364:52: (iv_ruleDeterminante= ruleDeterminante EOF )
            // InternalLenguajeNaturalReducido.g:365:2: iv_ruleDeterminante= ruleDeterminante EOF
            {
             newCompositeNode(grammarAccess.getDeterminanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeterminante=ruleDeterminante();

            state._fsp--;

             current =iv_ruleDeterminante.getText(); 
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
    // InternalLenguajeNaturalReducido.g:371:1: ruleDeterminante returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'El/La' ;
    public final AntlrDatatypeRuleToken ruleDeterminante() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:377:2: (kw= 'El/La' )
            // InternalLenguajeNaturalReducido.g:378:2: kw= 'El/La'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDeterminanteAccess().getElLaKeyword());
            	

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


    // $ANTLR start "entryRuleSintagmaPreposicional"
    // InternalLenguajeNaturalReducido.g:386:1: entryRuleSintagmaPreposicional returns [String current=null] : iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF ;
    public final String entryRuleSintagmaPreposicional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSintagmaPreposicional = null;


        try {
            // InternalLenguajeNaturalReducido.g:386:61: (iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF )
            // InternalLenguajeNaturalReducido.g:387:2: iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF
            {
             newCompositeNode(grammarAccess.getSintagmaPreposicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSintagmaPreposicional=ruleSintagmaPreposicional();

            state._fsp--;

             current =iv_ruleSintagmaPreposicional.getText(); 
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
    // InternalLenguajeNaturalReducido.g:393:1: ruleSintagmaPreposicional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Enlace_0= ruleEnlace this_Termino_1= ruleTermino ) ;
    public final AntlrDatatypeRuleToken ruleSintagmaPreposicional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Enlace_0 = null;

        AntlrDatatypeRuleToken this_Termino_1 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:399:2: ( (this_Enlace_0= ruleEnlace this_Termino_1= ruleTermino ) )
            // InternalLenguajeNaturalReducido.g:400:2: (this_Enlace_0= ruleEnlace this_Termino_1= ruleTermino )
            {
            // InternalLenguajeNaturalReducido.g:400:2: (this_Enlace_0= ruleEnlace this_Termino_1= ruleTermino )
            // InternalLenguajeNaturalReducido.g:401:3: this_Enlace_0= ruleEnlace this_Termino_1= ruleTermino
            {

            			newCompositeNode(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Enlace_0=ruleEnlace();

            state._fsp--;


            			current.merge(this_Enlace_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getSintagmaPreposicionalAccess().getTerminoParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Termino_1=ruleTermino();

            state._fsp--;


            			current.merge(this_Termino_1);
            		

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
    // $ANTLR end "ruleSintagmaPreposicional"


    // $ANTLR start "entryRuleEnlace"
    // InternalLenguajeNaturalReducido.g:425:1: entryRuleEnlace returns [String current=null] : iv_ruleEnlace= ruleEnlace EOF ;
    public final String entryRuleEnlace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnlace = null;


        try {
            // InternalLenguajeNaturalReducido.g:425:46: (iv_ruleEnlace= ruleEnlace EOF )
            // InternalLenguajeNaturalReducido.g:426:2: iv_ruleEnlace= ruleEnlace EOF
            {
             newCompositeNode(grammarAccess.getEnlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnlace=ruleEnlace();

            state._fsp--;

             current =iv_ruleEnlace.getText(); 
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
    // InternalLenguajeNaturalReducido.g:432:1: ruleEnlace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'de' ;
    public final AntlrDatatypeRuleToken ruleEnlace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:438:2: (kw= 'de' )
            // InternalLenguajeNaturalReducido.g:439:2: kw= 'de'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEnlaceAccess().getDeKeyword());
            	

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
    // InternalLenguajeNaturalReducido.g:447:1: entryRuleTermino returns [String current=null] : iv_ruleTermino= ruleTermino EOF ;
    public final String entryRuleTermino() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTermino = null;


        try {
            // InternalLenguajeNaturalReducido.g:447:47: (iv_ruleTermino= ruleTermino EOF )
            // InternalLenguajeNaturalReducido.g:448:2: iv_ruleTermino= ruleTermino EOF
            {
             newCompositeNode(grammarAccess.getTerminoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermino=ruleTermino();

            state._fsp--;

             current =iv_ruleTermino.getText(); 
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
    // InternalLenguajeNaturalReducido.g:454:1: ruleTermino returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Indeterminante_0= ruleIndeterminante this_Clase_1= ruleClase ) ;
    public final AntlrDatatypeRuleToken ruleTermino() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Indeterminante_0 = null;

        AntlrDatatypeRuleToken this_Clase_1 = null;



        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:460:2: ( (this_Indeterminante_0= ruleIndeterminante this_Clase_1= ruleClase ) )
            // InternalLenguajeNaturalReducido.g:461:2: (this_Indeterminante_0= ruleIndeterminante this_Clase_1= ruleClase )
            {
            // InternalLenguajeNaturalReducido.g:461:2: (this_Indeterminante_0= ruleIndeterminante this_Clase_1= ruleClase )
            // InternalLenguajeNaturalReducido.g:462:3: this_Indeterminante_0= ruleIndeterminante this_Clase_1= ruleClase
            {

            			newCompositeNode(grammarAccess.getTerminoAccess().getIndeterminanteParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Indeterminante_0=ruleIndeterminante();

            state._fsp--;


            			current.merge(this_Indeterminante_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getTerminoAccess().getClaseParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Clase_1=ruleClase();

            state._fsp--;


            			current.merge(this_Clase_1);
            		

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
    // $ANTLR end "ruleTermino"


    // $ANTLR start "entryRuleIndeterminante"
    // InternalLenguajeNaturalReducido.g:486:1: entryRuleIndeterminante returns [String current=null] : iv_ruleIndeterminante= ruleIndeterminante EOF ;
    public final String entryRuleIndeterminante() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndeterminante = null;


        try {
            // InternalLenguajeNaturalReducido.g:486:54: (iv_ruleIndeterminante= ruleIndeterminante EOF )
            // InternalLenguajeNaturalReducido.g:487:2: iv_ruleIndeterminante= ruleIndeterminante EOF
            {
             newCompositeNode(grammarAccess.getIndeterminanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndeterminante=ruleIndeterminante();

            state._fsp--;

             current =iv_ruleIndeterminante.getText(); 
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
    // InternalLenguajeNaturalReducido.g:493:1: ruleIndeterminante returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'un/una' ;
    public final AntlrDatatypeRuleToken ruleIndeterminante() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:499:2: (kw= 'un/una' )
            // InternalLenguajeNaturalReducido.g:500:2: kw= 'un/una'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getIndeterminanteAccess().getUnUnaKeyword());
            	

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
    // InternalLenguajeNaturalReducido.g:508:1: entryRuleObligacion returns [String current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final String entryRuleObligacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObligacion = null;


        try {
            // InternalLenguajeNaturalReducido.g:508:50: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalLenguajeNaturalReducido.g:509:2: iv_ruleObligacion= ruleObligacion EOF
            {
             newCompositeNode(grammarAccess.getObligacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObligacion=ruleObligacion();

            state._fsp--;

             current =iv_ruleObligacion.getText(); 
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
    // InternalLenguajeNaturalReducido.g:515:1: ruleObligacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'debe ser' ;
    public final AntlrDatatypeRuleToken ruleObligacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:521:2: (kw= 'debe ser' )
            // InternalLenguajeNaturalReducido.g:522:2: kw= 'debe ser'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getObligacionAccess().getDebeSerKeyword());
            	

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
    // InternalLenguajeNaturalReducido.g:530:1: entryRuleOperacion returns [String current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final String entryRuleOperacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperacion = null;


        try {
            // InternalLenguajeNaturalReducido.g:530:49: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalLenguajeNaturalReducido.g:531:2: iv_ruleOperacion= ruleOperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacion=ruleOperacion();

            state._fsp--;

             current =iv_ruleOperacion.getText(); 
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
    // InternalLenguajeNaturalReducido.g:537:1: ruleOperacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mayor que' | kw= 'menor que' | kw= 'igual a' | kw= 'mayor o igual a' | kw= 'menor o igual a' | kw= 'distinto de' ) ;
    public final AntlrDatatypeRuleToken ruleOperacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:543:2: ( (kw= 'mayor que' | kw= 'menor que' | kw= 'igual a' | kw= 'mayor o igual a' | kw= 'menor o igual a' | kw= 'distinto de' ) )
            // InternalLenguajeNaturalReducido.g:544:2: (kw= 'mayor que' | kw= 'menor que' | kw= 'igual a' | kw= 'mayor o igual a' | kw= 'menor o igual a' | kw= 'distinto de' )
            {
            // InternalLenguajeNaturalReducido.g:544:2: (kw= 'mayor que' | kw= 'menor que' | kw= 'igual a' | kw= 'mayor o igual a' | kw= 'menor o igual a' | kw= 'distinto de' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:545:3: kw= 'mayor que'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacionAccess().getMayorQueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:551:3: kw= 'menor que'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacionAccess().getMenorQueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:557:3: kw= 'igual a'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacionAccess().getIgualAKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:563:3: kw= 'mayor o igual a'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacionAccess().getMayorOIgualAKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLenguajeNaturalReducido.g:569:3: kw= 'menor o igual a'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacionAccess().getMenorOIgualAKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalLenguajeNaturalReducido.g:575:3: kw= 'distinto de'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacionAccess().getDistintoDeKeyword_5());
                    		

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
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleLiteral"
    // InternalLenguajeNaturalReducido.g:584:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalLenguajeNaturalReducido.g:584:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalLenguajeNaturalReducido.g:585:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalLenguajeNaturalReducido.g:591:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:597:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalLenguajeNaturalReducido.g:598:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalLenguajeNaturalReducido.g:598:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:599:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:607:3: this_STRING_1= RULE_STRING
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


    // $ANTLR start "entryRuleAtributo"
    // InternalLenguajeNaturalReducido.g:618:1: entryRuleAtributo returns [String current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final String entryRuleAtributo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtributo = null;


        try {
            // InternalLenguajeNaturalReducido.g:618:48: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalLenguajeNaturalReducido.g:619:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo.getText(); 
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
    // InternalLenguajeNaturalReducido.g:625:1: ruleAtributo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleAtributo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:631:2: (this_ID_0= RULE_ID )
            // InternalLenguajeNaturalReducido.g:632:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getAtributoAccess().getIDTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleClase"
    // InternalLenguajeNaturalReducido.g:642:1: entryRuleClase returns [String current=null] : iv_ruleClase= ruleClase EOF ;
    public final String entryRuleClase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClase = null;


        try {
            // InternalLenguajeNaturalReducido.g:642:45: (iv_ruleClase= ruleClase EOF )
            // InternalLenguajeNaturalReducido.g:643:2: iv_ruleClase= ruleClase EOF
            {
             newCompositeNode(grammarAccess.getClaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClase=ruleClase();

            state._fsp--;

             current =iv_ruleClase.getText(); 
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
    // InternalLenguajeNaturalReducido.g:649:1: ruleClase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalLenguajeNaturalReducido.g:655:2: (this_ID_0= RULE_ID )
            // InternalLenguajeNaturalReducido.g:656:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getClaseAccess().getIDTerminalRuleCall());
            	

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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\17\1\6\1\20\1\21\1\6\1\22\1\23\6\4\3\13\2\uffff";
    static final String dfa_3s = "\1\17\1\6\1\20\1\21\1\6\1\22\1\30\6\6\3\16\2\uffff";
    static final String dfa_4s = "\20\uffff\1\2\1\1";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\15\1\16\1\17",
            "\1\15\1\16\1\17",
            "\1\15\1\16\1\17",
            "\1\15\1\16\1\17",
            "\1\15\1\16\1\17",
            "\1\15\1\16\1\17",
            "\1\21\3\20",
            "\1\21\3\20",
            "\1\21\3\20",
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
            return "117:5: (lv_oracion_0_1= ruleSimple | lv_oracion_0_2= ruleCompuesta )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});

}