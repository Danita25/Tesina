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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'El/La'", "'Los/Las'", "'de'", "'un/una'", "'no'", "'debe'", "'ser'", "'estar'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'.'", "'Para todos/as'", "'tal que'", "'('", "'seleccionamos'", "'para todos'", "'existe'", "'donde'", "')'", "'es no vacio'", "'es vacio | tamanio'", "'Coleccion de'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
        	return "Gramatica";
       	}

       	@Override
       	protected GramaticaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGramatica"
    // InternalGramatica.g:64:1: entryRuleGramatica returns [EObject current=null] : iv_ruleGramatica= ruleGramatica EOF ;
    public final EObject entryRuleGramatica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGramatica = null;


        try {
            // InternalGramatica.g:64:50: (iv_ruleGramatica= ruleGramatica EOF )
            // InternalGramatica.g:65:2: iv_ruleGramatica= ruleGramatica EOF
            {
             newCompositeNode(grammarAccess.getGramaticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGramatica=ruleGramatica();

            state._fsp--;

             current =iv_ruleGramatica; 
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
    // $ANTLR end "entryRuleGramatica"


    // $ANTLR start "ruleGramatica"
    // InternalGramatica.g:71:1: ruleGramatica returns [EObject current=null] : ( (lv_oraciones_0_0= ruleOracion ) )* ;
    public final EObject ruleGramatica() throws RecognitionException {
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

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:79:3: (lv_oraciones_0_0= ruleOracion )
            	    {
            	    // InternalGramatica.g:79:3: (lv_oraciones_0_0= ruleOracion )
            	    // InternalGramatica.g:80:4: lv_oraciones_0_0= ruleOracion
            	    {

            	    				newCompositeNode(grammarAccess.getGramaticaAccess().getOracionesOracionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_oraciones_0_0=ruleOracion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGramaticaRule());
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
    // $ANTLR end "ruleGramatica"


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
    // InternalGramatica.g:107:1: ruleOracion returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Compleja_1= ruleCompleja ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;

        EObject this_Compleja_1 = null;



        	enterRule();

        try {
            // InternalGramatica.g:113:2: ( (this_Simple_0= ruleSimple | this_Compleja_1= ruleCompleja ) )
            // InternalGramatica.g:114:2: (this_Simple_0= ruleSimple | this_Compleja_1= ruleCompleja )
            {
            // InternalGramatica.g:114:2: (this_Simple_0= ruleSimple | this_Compleja_1= ruleCompleja )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:115:3: this_Simple_0= ruleSimple
                    {

                    			newCompositeNode(grammarAccess.getOracionAccess().getSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simple_0=ruleSimple();

                    state._fsp--;


                    			current = this_Simple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:124:3: this_Compleja_1= ruleCompleja
                    {

                    			newCompositeNode(grammarAccess.getOracionAccess().getComplejaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compleja_1=ruleCompleja();

                    state._fsp--;


                    			current = this_Compleja_1;
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
    // InternalGramatica.g:136:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:136:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:137:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:143:1: ruleSimple returns [EObject current=null] : ( (otherlv_0= 'El/La' | otherlv_1= 'Los/Las' ) ( (lv_atributo_2_0= ruleAtributo ) ) otherlv_3= 'de' otherlv_4= 'un/una' ( (lv_contexto_5_0= ruleClase ) ) (otherlv_6= 'no' )? otherlv_7= 'debe' (otherlv_8= 'ser' | otherlv_9= 'estar' ) (otherlv_10= 'mayor que' | otherlv_11= 'menor que' | otherlv_12= 'igual a' | otherlv_13= 'mayor o igual a' | otherlv_14= 'menor o igual a' | otherlv_15= 'distinto de' | otherlv_16= 'al menos' )? ( ( (lv_literal_17_0= ruleLiteral ) ) | ( (lv_atributo_18_0= ruleAtributo ) ) ) otherlv_19= '.' ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        EObject lv_atributo_2_0 = null;

        EObject lv_contexto_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_17_0 = null;

        EObject lv_atributo_18_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:149:2: ( ( (otherlv_0= 'El/La' | otherlv_1= 'Los/Las' ) ( (lv_atributo_2_0= ruleAtributo ) ) otherlv_3= 'de' otherlv_4= 'un/una' ( (lv_contexto_5_0= ruleClase ) ) (otherlv_6= 'no' )? otherlv_7= 'debe' (otherlv_8= 'ser' | otherlv_9= 'estar' ) (otherlv_10= 'mayor que' | otherlv_11= 'menor que' | otherlv_12= 'igual a' | otherlv_13= 'mayor o igual a' | otherlv_14= 'menor o igual a' | otherlv_15= 'distinto de' | otherlv_16= 'al menos' )? ( ( (lv_literal_17_0= ruleLiteral ) ) | ( (lv_atributo_18_0= ruleAtributo ) ) ) otherlv_19= '.' ) )
            // InternalGramatica.g:150:2: ( (otherlv_0= 'El/La' | otherlv_1= 'Los/Las' ) ( (lv_atributo_2_0= ruleAtributo ) ) otherlv_3= 'de' otherlv_4= 'un/una' ( (lv_contexto_5_0= ruleClase ) ) (otherlv_6= 'no' )? otherlv_7= 'debe' (otherlv_8= 'ser' | otherlv_9= 'estar' ) (otherlv_10= 'mayor que' | otherlv_11= 'menor que' | otherlv_12= 'igual a' | otherlv_13= 'mayor o igual a' | otherlv_14= 'menor o igual a' | otherlv_15= 'distinto de' | otherlv_16= 'al menos' )? ( ( (lv_literal_17_0= ruleLiteral ) ) | ( (lv_atributo_18_0= ruleAtributo ) ) ) otherlv_19= '.' )
            {
            // InternalGramatica.g:150:2: ( (otherlv_0= 'El/La' | otherlv_1= 'Los/Las' ) ( (lv_atributo_2_0= ruleAtributo ) ) otherlv_3= 'de' otherlv_4= 'un/una' ( (lv_contexto_5_0= ruleClase ) ) (otherlv_6= 'no' )? otherlv_7= 'debe' (otherlv_8= 'ser' | otherlv_9= 'estar' ) (otherlv_10= 'mayor que' | otherlv_11= 'menor que' | otherlv_12= 'igual a' | otherlv_13= 'mayor o igual a' | otherlv_14= 'menor o igual a' | otherlv_15= 'distinto de' | otherlv_16= 'al menos' )? ( ( (lv_literal_17_0= ruleLiteral ) ) | ( (lv_atributo_18_0= ruleAtributo ) ) ) otherlv_19= '.' )
            // InternalGramatica.g:151:3: (otherlv_0= 'El/La' | otherlv_1= 'Los/Las' ) ( (lv_atributo_2_0= ruleAtributo ) ) otherlv_3= 'de' otherlv_4= 'un/una' ( (lv_contexto_5_0= ruleClase ) ) (otherlv_6= 'no' )? otherlv_7= 'debe' (otherlv_8= 'ser' | otherlv_9= 'estar' ) (otherlv_10= 'mayor que' | otherlv_11= 'menor que' | otherlv_12= 'igual a' | otherlv_13= 'mayor o igual a' | otherlv_14= 'menor o igual a' | otherlv_15= 'distinto de' | otherlv_16= 'al menos' )? ( ( (lv_literal_17_0= ruleLiteral ) ) | ( (lv_atributo_18_0= ruleAtributo ) ) ) otherlv_19= '.'
            {
            // InternalGramatica.g:151:3: (otherlv_0= 'El/La' | otherlv_1= 'Los/Las' )
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
                    // InternalGramatica.g:152:4: otherlv_0= 'El/La'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getSimpleAccess().getElLaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:157:4: otherlv_1= 'Los/Las'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getLosLasKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:162:3: ( (lv_atributo_2_0= ruleAtributo ) )
            // InternalGramatica.g:163:4: (lv_atributo_2_0= ruleAtributo )
            {
            // InternalGramatica.g:163:4: (lv_atributo_2_0= ruleAtributo )
            // InternalGramatica.g:164:5: lv_atributo_2_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_atributo_2_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"atributo",
            						lv_atributo_2_0,
            						"org.xtext.tesis.gramatica.Gramatica.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getDeKeyword_2());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getUnUnaKeyword_3());
            		
            // InternalGramatica.g:189:3: ( (lv_contexto_5_0= ruleClase ) )
            // InternalGramatica.g:190:4: (lv_contexto_5_0= ruleClase )
            {
            // InternalGramatica.g:190:4: (lv_contexto_5_0= ruleClase )
            // InternalGramatica.g:191:5: lv_contexto_5_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_contexto_5_0=ruleClase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"contexto",
            						lv_contexto_5_0,
            						"org.xtext.tesis.gramatica.Gramatica.Clase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:208:3: (otherlv_6= 'no' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:209:4: otherlv_6= 'no'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleAccess().getNoKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getSimpleAccess().getDebeKeyword_6());
            		
            // InternalGramatica.g:218:3: (otherlv_8= 'ser' | otherlv_9= 'estar' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:219:4: otherlv_8= 'ser'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimpleAccess().getSerKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:224:4: otherlv_9= 'estar'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getSimpleAccess().getEstarKeyword_7_1());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:229:3: (otherlv_10= 'mayor que' | otherlv_11= 'menor que' | otherlv_12= 'igual a' | otherlv_13= 'mayor o igual a' | otherlv_14= 'menor o igual a' | otherlv_15= 'distinto de' | otherlv_16= 'al menos' )?
            int alt6=8;
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
                case 25:
                    {
                    alt6=7;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:230:4: otherlv_10= 'mayor que'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimpleAccess().getMayorQueKeyword_8_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:235:4: otherlv_11= 'menor que'
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimpleAccess().getMenorQueKeyword_8_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:240:4: otherlv_12= 'igual a'
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getSimpleAccess().getIgualAKeyword_8_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:245:4: otherlv_13= 'mayor o igual a'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getSimpleAccess().getMayorOIgualAKeyword_8_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:250:4: otherlv_14= 'menor o igual a'
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getSimpleAccess().getMenorOIgualAKeyword_8_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:255:4: otherlv_15= 'distinto de'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimpleAccess().getDistintoDeKeyword_8_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:260:4: otherlv_16= 'al menos'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getSimpleAccess().getAlMenosKeyword_8_6());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:265:3: ( ( (lv_literal_17_0= ruleLiteral ) ) | ( (lv_atributo_18_0= ruleAtributo ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:266:4: ( (lv_literal_17_0= ruleLiteral ) )
                    {
                    // InternalGramatica.g:266:4: ( (lv_literal_17_0= ruleLiteral ) )
                    // InternalGramatica.g:267:5: (lv_literal_17_0= ruleLiteral )
                    {
                    // InternalGramatica.g:267:5: (lv_literal_17_0= ruleLiteral )
                    // InternalGramatica.g:268:6: lv_literal_17_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_literal_17_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_17_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:286:4: ( (lv_atributo_18_0= ruleAtributo ) )
                    {
                    // InternalGramatica.g:286:4: ( (lv_atributo_18_0= ruleAtributo ) )
                    // InternalGramatica.g:287:5: (lv_atributo_18_0= ruleAtributo )
                    {
                    // InternalGramatica.g:287:5: (lv_atributo_18_0= ruleAtributo )
                    // InternalGramatica.g:288:6: lv_atributo_18_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_atributo_18_0=ruleAtributo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"atributo",
                    							lv_atributo_18_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Atributo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSimpleAccess().getFullStopKeyword_10());
            		

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


    // $ANTLR start "entryRuleCompleja"
    // InternalGramatica.g:314:1: entryRuleCompleja returns [EObject current=null] : iv_ruleCompleja= ruleCompleja EOF ;
    public final EObject entryRuleCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleja = null;


        try {
            // InternalGramatica.g:314:49: (iv_ruleCompleja= ruleCompleja EOF )
            // InternalGramatica.g:315:2: iv_ruleCompleja= ruleCompleja EOF
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
    // InternalGramatica.g:321:1: ruleCompleja returns [EObject current=null] : (otherlv_0= 'Para todos/as' ( (lv_atributo_1_0= ruleClase ) ) otherlv_2= 'de' otherlv_3= 'un/una' ( (lv_contexto_4_0= ruleClase ) ) otherlv_5= 'tal que' otherlv_6= '(' (otherlv_7= 'seleccionamos' | otherlv_8= 'para todos' | otherlv_9= 'existe' ) otherlv_10= 'Los/Las' ( (lv_atributo_11_0= ruleClase ) ) otherlv_12= 'donde' ( (lv_atributo_13_0= ruleAtributo ) ) (otherlv_14= 'mayor que' | otherlv_15= 'menor que' | otherlv_16= 'igual a' | otherlv_17= 'mayor o igual a' | otherlv_18= 'menor o igual a' | otherlv_19= 'distinto de' | otherlv_20= 'al menos' ) ( ( (lv_literal_21_0= ruleLiteral ) ) | ( (lv_atributo_22_0= ruleAtributo ) ) ) otherlv_23= ')' otherlv_24= 'tal que' (otherlv_25= 'es no vacio' | otherlv_26= 'es vacio | tamanio' ) ( (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) ) )? otherlv_36= '.' ) ;
    public final EObject ruleCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_36=null;
        EObject lv_atributo_1_0 = null;

        EObject lv_contexto_4_0 = null;

        EObject lv_atributo_11_0 = null;

        EObject lv_atributo_13_0 = null;

        AntlrDatatypeRuleToken lv_literal_21_0 = null;

        EObject lv_atributo_22_0 = null;

        AntlrDatatypeRuleToken lv_literal_34_0 = null;

        EObject lv_atributo_35_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:327:2: ( (otherlv_0= 'Para todos/as' ( (lv_atributo_1_0= ruleClase ) ) otherlv_2= 'de' otherlv_3= 'un/una' ( (lv_contexto_4_0= ruleClase ) ) otherlv_5= 'tal que' otherlv_6= '(' (otherlv_7= 'seleccionamos' | otherlv_8= 'para todos' | otherlv_9= 'existe' ) otherlv_10= 'Los/Las' ( (lv_atributo_11_0= ruleClase ) ) otherlv_12= 'donde' ( (lv_atributo_13_0= ruleAtributo ) ) (otherlv_14= 'mayor que' | otherlv_15= 'menor que' | otherlv_16= 'igual a' | otherlv_17= 'mayor o igual a' | otherlv_18= 'menor o igual a' | otherlv_19= 'distinto de' | otherlv_20= 'al menos' ) ( ( (lv_literal_21_0= ruleLiteral ) ) | ( (lv_atributo_22_0= ruleAtributo ) ) ) otherlv_23= ')' otherlv_24= 'tal que' (otherlv_25= 'es no vacio' | otherlv_26= 'es vacio | tamanio' ) ( (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) ) )? otherlv_36= '.' ) )
            // InternalGramatica.g:328:2: (otherlv_0= 'Para todos/as' ( (lv_atributo_1_0= ruleClase ) ) otherlv_2= 'de' otherlv_3= 'un/una' ( (lv_contexto_4_0= ruleClase ) ) otherlv_5= 'tal que' otherlv_6= '(' (otherlv_7= 'seleccionamos' | otherlv_8= 'para todos' | otherlv_9= 'existe' ) otherlv_10= 'Los/Las' ( (lv_atributo_11_0= ruleClase ) ) otherlv_12= 'donde' ( (lv_atributo_13_0= ruleAtributo ) ) (otherlv_14= 'mayor que' | otherlv_15= 'menor que' | otherlv_16= 'igual a' | otherlv_17= 'mayor o igual a' | otherlv_18= 'menor o igual a' | otherlv_19= 'distinto de' | otherlv_20= 'al menos' ) ( ( (lv_literal_21_0= ruleLiteral ) ) | ( (lv_atributo_22_0= ruleAtributo ) ) ) otherlv_23= ')' otherlv_24= 'tal que' (otherlv_25= 'es no vacio' | otherlv_26= 'es vacio | tamanio' ) ( (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) ) )? otherlv_36= '.' )
            {
            // InternalGramatica.g:328:2: (otherlv_0= 'Para todos/as' ( (lv_atributo_1_0= ruleClase ) ) otherlv_2= 'de' otherlv_3= 'un/una' ( (lv_contexto_4_0= ruleClase ) ) otherlv_5= 'tal que' otherlv_6= '(' (otherlv_7= 'seleccionamos' | otherlv_8= 'para todos' | otherlv_9= 'existe' ) otherlv_10= 'Los/Las' ( (lv_atributo_11_0= ruleClase ) ) otherlv_12= 'donde' ( (lv_atributo_13_0= ruleAtributo ) ) (otherlv_14= 'mayor que' | otherlv_15= 'menor que' | otherlv_16= 'igual a' | otherlv_17= 'mayor o igual a' | otherlv_18= 'menor o igual a' | otherlv_19= 'distinto de' | otherlv_20= 'al menos' ) ( ( (lv_literal_21_0= ruleLiteral ) ) | ( (lv_atributo_22_0= ruleAtributo ) ) ) otherlv_23= ')' otherlv_24= 'tal que' (otherlv_25= 'es no vacio' | otherlv_26= 'es vacio | tamanio' ) ( (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) ) )? otherlv_36= '.' )
            // InternalGramatica.g:329:3: otherlv_0= 'Para todos/as' ( (lv_atributo_1_0= ruleClase ) ) otherlv_2= 'de' otherlv_3= 'un/una' ( (lv_contexto_4_0= ruleClase ) ) otherlv_5= 'tal que' otherlv_6= '(' (otherlv_7= 'seleccionamos' | otherlv_8= 'para todos' | otherlv_9= 'existe' ) otherlv_10= 'Los/Las' ( (lv_atributo_11_0= ruleClase ) ) otherlv_12= 'donde' ( (lv_atributo_13_0= ruleAtributo ) ) (otherlv_14= 'mayor que' | otherlv_15= 'menor que' | otherlv_16= 'igual a' | otherlv_17= 'mayor o igual a' | otherlv_18= 'menor o igual a' | otherlv_19= 'distinto de' | otherlv_20= 'al menos' ) ( ( (lv_literal_21_0= ruleLiteral ) ) | ( (lv_atributo_22_0= ruleAtributo ) ) ) otherlv_23= ')' otherlv_24= 'tal que' (otherlv_25= 'es no vacio' | otherlv_26= 'es vacio | tamanio' ) ( (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) ) )? otherlv_36= '.'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComplejaAccess().getParaTodosAsKeyword_0());
            		
            // InternalGramatica.g:333:3: ( (lv_atributo_1_0= ruleClase ) )
            // InternalGramatica.g:334:4: (lv_atributo_1_0= ruleClase )
            {
            // InternalGramatica.g:334:4: (lv_atributo_1_0= ruleClase )
            // InternalGramatica.g:335:5: lv_atributo_1_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_atributo_1_0=ruleClase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"atributo",
            						lv_atributo_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.Clase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getComplejaAccess().getDeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getComplejaAccess().getUnUnaKeyword_3());
            		
            // InternalGramatica.g:360:3: ( (lv_contexto_4_0= ruleClase ) )
            // InternalGramatica.g:361:4: (lv_contexto_4_0= ruleClase )
            {
            // InternalGramatica.g:361:4: (lv_contexto_4_0= ruleClase )
            // InternalGramatica.g:362:5: lv_contexto_4_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_contexto_4_0=ruleClase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"contexto",
            						lv_contexto_4_0,
            						"org.xtext.tesis.gramatica.Gramatica.Clase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getComplejaAccess().getTalQueKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getComplejaAccess().getLeftParenthesisKeyword_6());
            		
            // InternalGramatica.g:387:3: (otherlv_7= 'seleccionamos' | otherlv_8= 'para todos' | otherlv_9= 'existe' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:388:4: otherlv_7= 'seleccionamos'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getComplejaAccess().getSeleccionamosKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:393:4: otherlv_8= 'para todos'
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplejaAccess().getParaTodosKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:398:4: otherlv_9= 'existe'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getComplejaAccess().getExisteKeyword_7_2());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getComplejaAccess().getLosLasKeyword_8());
            		
            // InternalGramatica.g:407:3: ( (lv_atributo_11_0= ruleClase ) )
            // InternalGramatica.g:408:4: (lv_atributo_11_0= ruleClase )
            {
            // InternalGramatica.g:408:4: (lv_atributo_11_0= ruleClase )
            // InternalGramatica.g:409:5: lv_atributo_11_0= ruleClase
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_atributo_11_0=ruleClase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"atributo",
            						lv_atributo_11_0,
            						"org.xtext.tesis.gramatica.Gramatica.Clase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getComplejaAccess().getDondeKeyword_10());
            		
            // InternalGramatica.g:430:3: ( (lv_atributo_13_0= ruleAtributo ) )
            // InternalGramatica.g:431:4: (lv_atributo_13_0= ruleAtributo )
            {
            // InternalGramatica.g:431:4: (lv_atributo_13_0= ruleAtributo )
            // InternalGramatica.g:432:5: lv_atributo_13_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_19);
            lv_atributo_13_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplejaRule());
            					}
            					set(
            						current,
            						"atributo",
            						lv_atributo_13_0,
            						"org.xtext.tesis.gramatica.Gramatica.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:449:3: (otherlv_14= 'mayor que' | otherlv_15= 'menor que' | otherlv_16= 'igual a' | otherlv_17= 'mayor o igual a' | otherlv_18= 'menor o igual a' | otherlv_19= 'distinto de' | otherlv_20= 'al menos' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:450:4: otherlv_14= 'mayor que'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getComplejaAccess().getMayorQueKeyword_12_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:455:4: otherlv_15= 'menor que'
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getComplejaAccess().getMenorQueKeyword_12_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:460:4: otherlv_16= 'igual a'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getComplejaAccess().getIgualAKeyword_12_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:465:4: otherlv_17= 'mayor o igual a'
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_12_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:470:4: otherlv_18= 'menor o igual a'
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_12_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:475:4: otherlv_19= 'distinto de'
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getComplejaAccess().getDistintoDeKeyword_12_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:480:4: otherlv_20= 'al menos'
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getComplejaAccess().getAlMenosKeyword_12_6());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:485:3: ( ( (lv_literal_21_0= ruleLiteral ) ) | ( (lv_atributo_22_0= ruleAtributo ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:486:4: ( (lv_literal_21_0= ruleLiteral ) )
                    {
                    // InternalGramatica.g:486:4: ( (lv_literal_21_0= ruleLiteral ) )
                    // InternalGramatica.g:487:5: (lv_literal_21_0= ruleLiteral )
                    {
                    // InternalGramatica.g:487:5: (lv_literal_21_0= ruleLiteral )
                    // InternalGramatica.g:488:6: lv_literal_21_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_literal_21_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_21_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:506:4: ( (lv_atributo_22_0= ruleAtributo ) )
                    {
                    // InternalGramatica.g:506:4: ( (lv_atributo_22_0= ruleAtributo ) )
                    // InternalGramatica.g:507:5: (lv_atributo_22_0= ruleAtributo )
                    {
                    // InternalGramatica.g:507:5: (lv_atributo_22_0= ruleAtributo )
                    // InternalGramatica.g:508:6: lv_atributo_22_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_atributo_22_0=ruleAtributo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplejaRule());
                    						}
                    						set(
                    							current,
                    							"atributo",
                    							lv_atributo_22_0,
                    							"org.xtext.tesis.gramatica.Gramatica.Atributo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_23, grammarAccess.getComplejaAccess().getRightParenthesisKeyword_14());
            		
            otherlv_24=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_24, grammarAccess.getComplejaAccess().getTalQueKeyword_15());
            		
            // InternalGramatica.g:534:3: (otherlv_25= 'es no vacio' | otherlv_26= 'es vacio | tamanio' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==36) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:535:4: otherlv_25= 'es no vacio'
                    {
                    otherlv_25=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_25, grammarAccess.getComplejaAccess().getEsNoVacioKeyword_16_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:540:4: otherlv_26= 'es vacio | tamanio'
                    {
                    otherlv_26=(Token)match(input,36,FOLLOW_22); 

                    				newLeafNode(otherlv_26, grammarAccess.getComplejaAccess().getEsVacioTamanioKeyword_16_1());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:545:3: ( (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=25)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGramatica.g:546:4: (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' ) ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) )
                    {
                    // InternalGramatica.g:546:4: (otherlv_27= 'mayor que' | otherlv_28= 'menor que' | otherlv_29= 'igual a' | otherlv_30= 'mayor o igual a' | otherlv_31= 'menor o igual a' | otherlv_32= 'distinto de' | otherlv_33= 'al menos' )
                    int alt12=7;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt12=1;
                        }
                        break;
                    case 20:
                        {
                        alt12=2;
                        }
                        break;
                    case 21:
                        {
                        alt12=3;
                        }
                        break;
                    case 22:
                        {
                        alt12=4;
                        }
                        break;
                    case 23:
                        {
                        alt12=5;
                        }
                        break;
                    case 24:
                        {
                        alt12=6;
                        }
                        break;
                    case 25:
                        {
                        alt12=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalGramatica.g:547:5: otherlv_27= 'mayor que'
                            {
                            otherlv_27=(Token)match(input,19,FOLLOW_12); 

                            					newLeafNode(otherlv_27, grammarAccess.getComplejaAccess().getMayorQueKeyword_17_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGramatica.g:552:5: otherlv_28= 'menor que'
                            {
                            otherlv_28=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_28, grammarAccess.getComplejaAccess().getMenorQueKeyword_17_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalGramatica.g:557:5: otherlv_29= 'igual a'
                            {
                            otherlv_29=(Token)match(input,21,FOLLOW_12); 

                            					newLeafNode(otherlv_29, grammarAccess.getComplejaAccess().getIgualAKeyword_17_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalGramatica.g:562:5: otherlv_30= 'mayor o igual a'
                            {
                            otherlv_30=(Token)match(input,22,FOLLOW_12); 

                            					newLeafNode(otherlv_30, grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_17_0_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalGramatica.g:567:5: otherlv_31= 'menor o igual a'
                            {
                            otherlv_31=(Token)match(input,23,FOLLOW_12); 

                            					newLeafNode(otherlv_31, grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_17_0_4());
                            				

                            }
                            break;
                        case 6 :
                            // InternalGramatica.g:572:5: otherlv_32= 'distinto de'
                            {
                            otherlv_32=(Token)match(input,24,FOLLOW_12); 

                            					newLeafNode(otherlv_32, grammarAccess.getComplejaAccess().getDistintoDeKeyword_17_0_5());
                            				

                            }
                            break;
                        case 7 :
                            // InternalGramatica.g:577:5: otherlv_33= 'al menos'
                            {
                            otherlv_33=(Token)match(input,25,FOLLOW_12); 

                            					newLeafNode(otherlv_33, grammarAccess.getComplejaAccess().getAlMenosKeyword_17_0_6());
                            				

                            }
                            break;

                    }

                    // InternalGramatica.g:582:4: ( ( (lv_literal_34_0= ruleLiteral ) ) | ( (lv_atributo_35_0= ruleAtributo ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_ID||LA13_0==37) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGramatica.g:583:5: ( (lv_literal_34_0= ruleLiteral ) )
                            {
                            // InternalGramatica.g:583:5: ( (lv_literal_34_0= ruleLiteral ) )
                            // InternalGramatica.g:584:6: (lv_literal_34_0= ruleLiteral )
                            {
                            // InternalGramatica.g:584:6: (lv_literal_34_0= ruleLiteral )
                            // InternalGramatica.g:585:7: lv_literal_34_0= ruleLiteral
                            {

                            							newCompositeNode(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_17_1_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_literal_34_0=ruleLiteral();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComplejaRule());
                            							}
                            							set(
                            								current,
                            								"literal",
                            								lv_literal_34_0,
                            								"org.xtext.tesis.gramatica.Gramatica.Literal");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGramatica.g:603:5: ( (lv_atributo_35_0= ruleAtributo ) )
                            {
                            // InternalGramatica.g:603:5: ( (lv_atributo_35_0= ruleAtributo ) )
                            // InternalGramatica.g:604:6: (lv_atributo_35_0= ruleAtributo )
                            {
                            // InternalGramatica.g:604:6: (lv_atributo_35_0= ruleAtributo )
                            // InternalGramatica.g:605:7: lv_atributo_35_0= ruleAtributo
                            {

                            							newCompositeNode(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_17_1_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_atributo_35_0=ruleAtributo();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComplejaRule());
                            							}
                            							set(
                            								current,
                            								"atributo",
                            								lv_atributo_35_0,
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

            otherlv_36=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getComplejaAccess().getFullStopKeyword_18());
            		

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


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:632:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:632:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:633:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:639:1: ruleAtributo returns [EObject current=null] : ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:645:2: ( ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGramatica.g:646:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGramatica.g:646:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGramatica.g:647:3: (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGramatica.g:647:3: (otherlv_0= 'Coleccion de' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGramatica.g:648:4: otherlv_0= 'Coleccion de'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getColeccionDeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:653:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGramatica.g:654:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGramatica.g:654:4: (lv_name_1_0= RULE_ID )
            // InternalGramatica.g:655:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleClase"
    // InternalGramatica.g:675:1: entryRuleClase returns [EObject current=null] : iv_ruleClase= ruleClase EOF ;
    public final EObject entryRuleClase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClase = null;


        try {
            // InternalGramatica.g:675:46: (iv_ruleClase= ruleClase EOF )
            // InternalGramatica.g:676:2: iv_ruleClase= ruleClase EOF
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
    // InternalGramatica.g:682:1: ruleClase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:688:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGramatica.g:689:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:689:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGramatica.g:690:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGramatica.g:690:3: (lv_name_0_0= RULE_ID )
            // InternalGramatica.g:691:4: lv_name_0_0= RULE_ID
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
    // InternalGramatica.g:710:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:710:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:711:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGramatica.g:717:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:723:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalGramatica.g:724:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalGramatica.g:724:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGramatica.g:725:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:733:3: this_STRING_1= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002003F80070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007F80000L});

}