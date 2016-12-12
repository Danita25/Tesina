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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'y'", "'o'", "'El/La'", "'Los/Las'", "'Coleccion de'", "'de un/una'", "'debe ser'", "'debe estar'", "'no'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'.'"
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
    // InternalGramatica.g:71:1: ruleDocumento returns [EObject current=null] : ( ( (lv_pathModelo_0_0= rulePathModelo ) ) ( (lv_pathOcl_1_0= rulePathOcl ) ) ( (lv_oraciones_2_0= ruleOracion ) )* ) ;
    public final EObject ruleDocumento() throws RecognitionException {
        EObject current = null;

        EObject lv_pathModelo_0_0 = null;

        EObject lv_pathOcl_1_0 = null;

        EObject lv_oraciones_2_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:77:2: ( ( ( (lv_pathModelo_0_0= rulePathModelo ) ) ( (lv_pathOcl_1_0= rulePathOcl ) ) ( (lv_oraciones_2_0= ruleOracion ) )* ) )
            // InternalGramatica.g:78:2: ( ( (lv_pathModelo_0_0= rulePathModelo ) ) ( (lv_pathOcl_1_0= rulePathOcl ) ) ( (lv_oraciones_2_0= ruleOracion ) )* )
            {
            // InternalGramatica.g:78:2: ( ( (lv_pathModelo_0_0= rulePathModelo ) ) ( (lv_pathOcl_1_0= rulePathOcl ) ) ( (lv_oraciones_2_0= ruleOracion ) )* )
            // InternalGramatica.g:79:3: ( (lv_pathModelo_0_0= rulePathModelo ) ) ( (lv_pathOcl_1_0= rulePathOcl ) ) ( (lv_oraciones_2_0= ruleOracion ) )*
            {
            // InternalGramatica.g:79:3: ( (lv_pathModelo_0_0= rulePathModelo ) )
            // InternalGramatica.g:80:4: (lv_pathModelo_0_0= rulePathModelo )
            {
            // InternalGramatica.g:80:4: (lv_pathModelo_0_0= rulePathModelo )
            // InternalGramatica.g:81:5: lv_pathModelo_0_0= rulePathModelo
            {

            					newCompositeNode(grammarAccess.getDocumentoAccess().getPathModeloPathModeloParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_pathModelo_0_0=rulePathModelo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentoRule());
            					}
            					set(
            						current,
            						"pathModelo",
            						lv_pathModelo_0_0,
            						"org.xtext.tesis.gramatica.Gramatica.PathModelo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:98:3: ( (lv_pathOcl_1_0= rulePathOcl ) )
            // InternalGramatica.g:99:4: (lv_pathOcl_1_0= rulePathOcl )
            {
            // InternalGramatica.g:99:4: (lv_pathOcl_1_0= rulePathOcl )
            // InternalGramatica.g:100:5: lv_pathOcl_1_0= rulePathOcl
            {

            					newCompositeNode(grammarAccess.getDocumentoAccess().getPathOclPathOclParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_pathOcl_1_0=rulePathOcl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentoRule());
            					}
            					set(
            						current,
            						"pathOcl",
            						lv_pathOcl_1_0,
            						"org.xtext.tesis.gramatica.Gramatica.PathOcl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramatica.g:117:3: ( (lv_oraciones_2_0= ruleOracion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:118:4: (lv_oraciones_2_0= ruleOracion )
            	    {
            	    // InternalGramatica.g:118:4: (lv_oraciones_2_0= ruleOracion )
            	    // InternalGramatica.g:119:5: lv_oraciones_2_0= ruleOracion
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


    // $ANTLR start "entryRulePathModelo"
    // InternalGramatica.g:140:1: entryRulePathModelo returns [EObject current=null] : iv_rulePathModelo= rulePathModelo EOF ;
    public final EObject entryRulePathModelo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathModelo = null;


        try {
            // InternalGramatica.g:140:51: (iv_rulePathModelo= rulePathModelo EOF )
            // InternalGramatica.g:141:2: iv_rulePathModelo= rulePathModelo EOF
            {
             newCompositeNode(grammarAccess.getPathModeloRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathModelo=rulePathModelo();

            state._fsp--;

             current =iv_rulePathModelo; 
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
    // $ANTLR end "entryRulePathModelo"


    // $ANTLR start "rulePathModelo"
    // InternalGramatica.g:147:1: rulePathModelo returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject rulePathModelo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:153:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalGramatica.g:154:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalGramatica.g:154:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalGramatica.g:155:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalGramatica.g:155:3: (lv_name_0_0= RULE_STRING )
            // InternalGramatica.g:156:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPathModeloAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPathModeloRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "rulePathModelo"


    // $ANTLR start "entryRulePathOcl"
    // InternalGramatica.g:175:1: entryRulePathOcl returns [EObject current=null] : iv_rulePathOcl= rulePathOcl EOF ;
    public final EObject entryRulePathOcl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathOcl = null;


        try {
            // InternalGramatica.g:175:48: (iv_rulePathOcl= rulePathOcl EOF )
            // InternalGramatica.g:176:2: iv_rulePathOcl= rulePathOcl EOF
            {
             newCompositeNode(grammarAccess.getPathOclRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathOcl=rulePathOcl();

            state._fsp--;

             current =iv_rulePathOcl; 
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
    // $ANTLR end "entryRulePathOcl"


    // $ANTLR start "rulePathOcl"
    // InternalGramatica.g:182:1: rulePathOcl returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject rulePathOcl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:188:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalGramatica.g:189:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalGramatica.g:189:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalGramatica.g:190:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalGramatica.g:190:3: (lv_name_0_0= RULE_STRING )
            // InternalGramatica.g:191:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPathOclAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPathOclRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "rulePathOcl"


    // $ANTLR start "entryRuleOracion"
    // InternalGramatica.g:210:1: entryRuleOracion returns [EObject current=null] : iv_ruleOracion= ruleOracion EOF ;
    public final EObject entryRuleOracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracion = null;


        try {
            // InternalGramatica.g:210:48: (iv_ruleOracion= ruleOracion EOF )
            // InternalGramatica.g:211:2: iv_ruleOracion= ruleOracion EOF
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
    // InternalGramatica.g:217:1: ruleOracion returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Compuesta_1= ruleCompuesta ) ;
    public final EObject ruleOracion() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;

        EObject this_Compuesta_1 = null;



        	enterRule();

        try {
            // InternalGramatica.g:223:2: ( (this_Simple_0= ruleSimple | this_Compuesta_1= ruleCompuesta ) )
            // InternalGramatica.g:224:2: (this_Simple_0= ruleSimple | this_Compuesta_1= ruleCompuesta )
            {
            // InternalGramatica.g:224:2: (this_Simple_0= ruleSimple | this_Compuesta_1= ruleCompuesta )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:225:3: this_Simple_0= ruleSimple
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
                    // InternalGramatica.g:234:3: this_Compuesta_1= ruleCompuesta
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


    // $ANTLR start "entryRuleCompuesta"
    // InternalGramatica.g:246:1: entryRuleCompuesta returns [EObject current=null] : iv_ruleCompuesta= ruleCompuesta EOF ;
    public final EObject entryRuleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompuesta = null;


        try {
            // InternalGramatica.g:246:50: (iv_ruleCompuesta= ruleCompuesta EOF )
            // InternalGramatica.g:247:2: iv_ruleCompuesta= ruleCompuesta EOF
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
    // InternalGramatica.g:253:1: ruleCompuesta returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ) ;
    public final EObject ruleCompuesta() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_nexo_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:259:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) ) )
            // InternalGramatica.g:260:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) )
            {
            // InternalGramatica.g:260:2: ( ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) ) )
            // InternalGramatica.g:261:3: ( (lv_simple_0_0= ruleSimple ) ) ( (lv_nexo_1_0= ruleNexo ) )
            {
            // InternalGramatica.g:261:3: ( (lv_simple_0_0= ruleSimple ) )
            // InternalGramatica.g:262:4: (lv_simple_0_0= ruleSimple )
            {
            // InternalGramatica.g:262:4: (lv_simple_0_0= ruleSimple )
            // InternalGramatica.g:263:5: lv_simple_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getCompuestaAccess().getSimpleSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalGramatica.g:280:3: ( (lv_nexo_1_0= ruleNexo ) )
            // InternalGramatica.g:281:4: (lv_nexo_1_0= ruleNexo )
            {
            // InternalGramatica.g:281:4: (lv_nexo_1_0= ruleNexo )
            // InternalGramatica.g:282:5: lv_nexo_1_0= ruleNexo
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


    // $ANTLR start "entryRuleSimple"
    // InternalGramatica.g:303:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalGramatica.g:303:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalGramatica.g:304:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalGramatica.g:310:1: ruleSimple returns [EObject current=null] : ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? ) ;
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
            // InternalGramatica.g:316:2: ( ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? ) )
            // InternalGramatica.g:317:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? )
            {
            // InternalGramatica.g:317:2: ( ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )? )
            // InternalGramatica.g:318:3: ( (lv_determinante_0_0= ruleDeterminante ) ) ( (lv_atributo_1_0= ruleAtributo ) ) ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) ) ( (lv_contexto_3_0= ruleClase ) ) ( (lv_obligacion_4_0= ruleObligacion ) ) ( (lv_operacion_5_0= ruleOperacion ) )? ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) ) ( (lv_finOracion_8_0= ruleFinOracion ) )?
            {
            // InternalGramatica.g:318:3: ( (lv_determinante_0_0= ruleDeterminante ) )
            // InternalGramatica.g:319:4: (lv_determinante_0_0= ruleDeterminante )
            {
            // InternalGramatica.g:319:4: (lv_determinante_0_0= ruleDeterminante )
            // InternalGramatica.g:320:5: lv_determinante_0_0= ruleDeterminante
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

            // InternalGramatica.g:337:3: ( (lv_atributo_1_0= ruleAtributo ) )
            // InternalGramatica.g:338:4: (lv_atributo_1_0= ruleAtributo )
            {
            // InternalGramatica.g:338:4: (lv_atributo_1_0= ruleAtributo )
            // InternalGramatica.g:339:5: lv_atributo_1_0= ruleAtributo
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

            // InternalGramatica.g:356:3: ( (lv_Sintagma_2_0= ruleSintagmaPreposicional ) )
            // InternalGramatica.g:357:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:357:4: (lv_Sintagma_2_0= ruleSintagmaPreposicional )
            // InternalGramatica.g:358:5: lv_Sintagma_2_0= ruleSintagmaPreposicional
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

            // InternalGramatica.g:375:3: ( (lv_contexto_3_0= ruleClase ) )
            // InternalGramatica.g:376:4: (lv_contexto_3_0= ruleClase )
            {
            // InternalGramatica.g:376:4: (lv_contexto_3_0= ruleClase )
            // InternalGramatica.g:377:5: lv_contexto_3_0= ruleClase
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

            // InternalGramatica.g:394:3: ( (lv_obligacion_4_0= ruleObligacion ) )
            // InternalGramatica.g:395:4: (lv_obligacion_4_0= ruleObligacion )
            {
            // InternalGramatica.g:395:4: (lv_obligacion_4_0= ruleObligacion )
            // InternalGramatica.g:396:5: lv_obligacion_4_0= ruleObligacion
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

            // InternalGramatica.g:413:3: ( (lv_operacion_5_0= ruleOperacion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=20 && LA3_0<=26)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:414:4: (lv_operacion_5_0= ruleOperacion )
                    {
                    // InternalGramatica.g:414:4: (lv_operacion_5_0= ruleOperacion )
                    // InternalGramatica.g:415:5: lv_operacion_5_0= ruleOperacion
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

            // InternalGramatica.g:432:3: ( ( (lv_literal_6_0= ruleLiteral ) ) | ( (lv_atributo_7_0= ruleAtributo ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:433:4: ( (lv_literal_6_0= ruleLiteral ) )
                    {
                    // InternalGramatica.g:433:4: ( (lv_literal_6_0= ruleLiteral ) )
                    // InternalGramatica.g:434:5: (lv_literal_6_0= ruleLiteral )
                    {
                    // InternalGramatica.g:434:5: (lv_literal_6_0= ruleLiteral )
                    // InternalGramatica.g:435:6: lv_literal_6_0= ruleLiteral
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
                    // InternalGramatica.g:453:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    {
                    // InternalGramatica.g:453:4: ( (lv_atributo_7_0= ruleAtributo ) )
                    // InternalGramatica.g:454:5: (lv_atributo_7_0= ruleAtributo )
                    {
                    // InternalGramatica.g:454:5: (lv_atributo_7_0= ruleAtributo )
                    // InternalGramatica.g:455:6: lv_atributo_7_0= ruleAtributo
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

            // InternalGramatica.g:473:3: ( (lv_finOracion_8_0= ruleFinOracion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:474:4: (lv_finOracion_8_0= ruleFinOracion )
                    {
                    // InternalGramatica.g:474:4: (lv_finOracion_8_0= ruleFinOracion )
                    // InternalGramatica.g:475:5: lv_finOracion_8_0= ruleFinOracion
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


    // $ANTLR start "entryRuleNexo"
    // InternalGramatica.g:496:1: entryRuleNexo returns [EObject current=null] : iv_ruleNexo= ruleNexo EOF ;
    public final EObject entryRuleNexo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNexo = null;


        try {
            // InternalGramatica.g:496:45: (iv_ruleNexo= ruleNexo EOF )
            // InternalGramatica.g:497:2: iv_ruleNexo= ruleNexo EOF
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
    // InternalGramatica.g:503:1: ruleNexo returns [EObject current=null] : ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' ) ;
    public final EObject ruleNexo() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:509:2: ( ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' ) )
            // InternalGramatica.g:510:2: ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' )
            {
            // InternalGramatica.g:510:2: ( ( (lv_descripcion_0_0= 'y' ) ) | otherlv_1= 'o' )
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
                    // InternalGramatica.g:511:3: ( (lv_descripcion_0_0= 'y' ) )
                    {
                    // InternalGramatica.g:511:3: ( (lv_descripcion_0_0= 'y' ) )
                    // InternalGramatica.g:512:4: (lv_descripcion_0_0= 'y' )
                    {
                    // InternalGramatica.g:512:4: (lv_descripcion_0_0= 'y' )
                    // InternalGramatica.g:513:5: lv_descripcion_0_0= 'y'
                    {
                    lv_descripcion_0_0=(Token)match(input,11,FOLLOW_2); 

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
                    // InternalGramatica.g:526:3: otherlv_1= 'o'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDeterminante"
    // InternalGramatica.g:534:1: entryRuleDeterminante returns [EObject current=null] : iv_ruleDeterminante= ruleDeterminante EOF ;
    public final EObject entryRuleDeterminante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterminante = null;


        try {
            // InternalGramatica.g:534:53: (iv_ruleDeterminante= ruleDeterminante EOF )
            // InternalGramatica.g:535:2: iv_ruleDeterminante= ruleDeterminante EOF
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
    // InternalGramatica.g:541:1: ruleDeterminante returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) ) ;
    public final EObject ruleDeterminante() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:547:2: ( ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) ) )
            // InternalGramatica.g:548:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) )
            {
            // InternalGramatica.g:548:2: ( ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) ) )
            // InternalGramatica.g:549:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) )
            {
            // InternalGramatica.g:549:3: ( (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' ) )
            // InternalGramatica.g:550:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' )
            {
            // InternalGramatica.g:550:4: (lv_descripcion_0_1= 'El/La' | lv_descripcion_0_2= 'Los/Las' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:551:5: lv_descripcion_0_1= 'El/La'
                    {
                    lv_descripcion_0_1=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeterminanteRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:562:5: lv_descripcion_0_2= 'Los/Las'
                    {
                    lv_descripcion_0_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGramatica.g:578:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalGramatica.g:578:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalGramatica.g:579:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalGramatica.g:585:1: ruleAtributo returns [EObject current=null] : ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:591:2: ( ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGramatica.g:592:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGramatica.g:592:2: ( (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGramatica.g:593:3: (otherlv_0= 'Coleccion de' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGramatica.g:593:3: (otherlv_0= 'Coleccion de' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:594:4: otherlv_0= 'Coleccion de'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getColeccionDeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGramatica.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGramatica.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGramatica.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalGramatica.g:601:5: lv_name_1_0= RULE_ID
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
    // InternalGramatica.g:621:1: entryRuleSintagmaPreposicional returns [EObject current=null] : iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF ;
    public final EObject entryRuleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSintagmaPreposicional = null;


        try {
            // InternalGramatica.g:621:62: (iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:622:2: iv_ruleSintagmaPreposicional= ruleSintagmaPreposicional EOF
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
    // InternalGramatica.g:628:1: ruleSintagmaPreposicional returns [EObject current=null] : ( (lv_descripcion_0_0= 'de un/una' ) ) ;
    public final EObject ruleSintagmaPreposicional() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:634:2: ( ( (lv_descripcion_0_0= 'de un/una' ) ) )
            // InternalGramatica.g:635:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            {
            // InternalGramatica.g:635:2: ( (lv_descripcion_0_0= 'de un/una' ) )
            // InternalGramatica.g:636:3: (lv_descripcion_0_0= 'de un/una' )
            {
            // InternalGramatica.g:636:3: (lv_descripcion_0_0= 'de un/una' )
            // InternalGramatica.g:637:4: lv_descripcion_0_0= 'de un/una'
            {
            lv_descripcion_0_0=(Token)match(input,16,FOLLOW_2); 

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
    // InternalGramatica.g:652:1: entryRuleObligacion returns [EObject current=null] : iv_ruleObligacion= ruleObligacion EOF ;
    public final EObject entryRuleObligacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacion = null;


        try {
            // InternalGramatica.g:652:51: (iv_ruleObligacion= ruleObligacion EOF )
            // InternalGramatica.g:653:2: iv_ruleObligacion= ruleObligacion EOF
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
    // InternalGramatica.g:659:1: ruleObligacion returns [EObject current=null] : ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) ;
    public final EObject ruleObligacion() throws RecognitionException {
        EObject current = null;

        EObject lv_negacion_0_0 = null;

        EObject lv_obligacionDeber_1_0 = null;



        	enterRule();

        try {
            // InternalGramatica.g:665:2: ( ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) ) )
            // InternalGramatica.g:666:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            {
            // InternalGramatica.g:666:2: ( ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) ) )
            // InternalGramatica.g:667:3: ( (lv_negacion_0_0= ruleNegacion ) )? ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            {
            // InternalGramatica.g:667:3: ( (lv_negacion_0_0= ruleNegacion ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:668:4: (lv_negacion_0_0= ruleNegacion )
                    {
                    // InternalGramatica.g:668:4: (lv_negacion_0_0= ruleNegacion )
                    // InternalGramatica.g:669:5: lv_negacion_0_0= ruleNegacion
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

            // InternalGramatica.g:686:3: ( (lv_obligacionDeber_1_0= ruleObligacionDeber ) )
            // InternalGramatica.g:687:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            {
            // InternalGramatica.g:687:4: (lv_obligacionDeber_1_0= ruleObligacionDeber )
            // InternalGramatica.g:688:5: lv_obligacionDeber_1_0= ruleObligacionDeber
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
    // InternalGramatica.g:709:1: entryRuleObligacionDeber returns [EObject current=null] : iv_ruleObligacionDeber= ruleObligacionDeber EOF ;
    public final EObject entryRuleObligacionDeber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligacionDeber = null;


        try {
            // InternalGramatica.g:709:56: (iv_ruleObligacionDeber= ruleObligacionDeber EOF )
            // InternalGramatica.g:710:2: iv_ruleObligacionDeber= ruleObligacionDeber EOF
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
    // InternalGramatica.g:716:1: ruleObligacionDeber returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) ;
    public final EObject ruleObligacionDeber() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_1=null;
        Token lv_descripcion_0_2=null;


        	enterRule();

        try {
            // InternalGramatica.g:722:2: ( ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) ) )
            // InternalGramatica.g:723:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            {
            // InternalGramatica.g:723:2: ( ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) ) )
            // InternalGramatica.g:724:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            {
            // InternalGramatica.g:724:3: ( (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' ) )
            // InternalGramatica.g:725:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            {
            // InternalGramatica.g:725:4: (lv_descripcion_0_1= 'debe ser' | lv_descripcion_0_2= 'debe estar' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:726:5: lv_descripcion_0_1= 'debe ser'
                    {
                    lv_descripcion_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObligacionDeberRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:737:5: lv_descripcion_0_2= 'debe estar'
                    {
                    lv_descripcion_0_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalGramatica.g:753:1: entryRuleNegacion returns [EObject current=null] : iv_ruleNegacion= ruleNegacion EOF ;
    public final EObject entryRuleNegacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegacion = null;


        try {
            // InternalGramatica.g:753:49: (iv_ruleNegacion= ruleNegacion EOF )
            // InternalGramatica.g:754:2: iv_ruleNegacion= ruleNegacion EOF
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
    // InternalGramatica.g:760:1: ruleNegacion returns [EObject current=null] : ( (lv_descripcion_0_0= 'no' ) ) ;
    public final EObject ruleNegacion() throws RecognitionException {
        EObject current = null;

        Token lv_descripcion_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:766:2: ( ( (lv_descripcion_0_0= 'no' ) ) )
            // InternalGramatica.g:767:2: ( (lv_descripcion_0_0= 'no' ) )
            {
            // InternalGramatica.g:767:2: ( (lv_descripcion_0_0= 'no' ) )
            // InternalGramatica.g:768:3: (lv_descripcion_0_0= 'no' )
            {
            // InternalGramatica.g:768:3: (lv_descripcion_0_0= 'no' )
            // InternalGramatica.g:769:4: lv_descripcion_0_0= 'no'
            {
            lv_descripcion_0_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalGramatica.g:791:1: ruleOperacion returns [EObject current=null] : ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) ;
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
            // InternalGramatica.g:797:2: ( ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) ) )
            // InternalGramatica.g:798:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            {
            // InternalGramatica.g:798:2: ( ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) ) )
            // InternalGramatica.g:799:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            {
            // InternalGramatica.g:799:3: ( (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' ) )
            // InternalGramatica.g:800:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            {
            // InternalGramatica.g:800:4: (lv_descripcion_0_1= 'mayor que' | lv_descripcion_0_2= 'menor que' | lv_descripcion_0_3= 'igual a' | lv_descripcion_0_4= 'mayor o igual a' | lv_descripcion_0_5= 'menor o igual a' | lv_descripcion_0_6= 'distinto de' | lv_descripcion_0_7= 'al menos' )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            case 24:
                {
                alt11=5;
                }
                break;
            case 25:
                {
                alt11=6;
                }
                break;
            case 26:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:801:5: lv_descripcion_0_1= 'mayor que'
                    {
                    lv_descripcion_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_1, grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:812:5: lv_descripcion_0_2= 'menor que'
                    {
                    lv_descripcion_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_2, grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalGramatica.g:823:5: lv_descripcion_0_3= 'igual a'
                    {
                    lv_descripcion_0_3=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_3, grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalGramatica.g:834:5: lv_descripcion_0_4= 'mayor o igual a'
                    {
                    lv_descripcion_0_4=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_4, grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalGramatica.g:845:5: lv_descripcion_0_5= 'menor o igual a'
                    {
                    lv_descripcion_0_5=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_5, grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalGramatica.g:856:5: lv_descripcion_0_6= 'distinto de'
                    {
                    lv_descripcion_0_6=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_0_6, grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacionRule());
                    					}
                    					setWithLastConsumed(current, "descripcion", lv_descripcion_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalGramatica.g:867:5: lv_descripcion_0_7= 'al menos'
                    {
                    lv_descripcion_0_7=(Token)match(input,26,FOLLOW_2); 

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
    // InternalGramatica.g:883:1: entryRuleClase returns [EObject current=null] : iv_ruleClase= ruleClase EOF ;
    public final EObject entryRuleClase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClase = null;


        try {
            // InternalGramatica.g:883:46: (iv_ruleClase= ruleClase EOF )
            // InternalGramatica.g:884:2: iv_ruleClase= ruleClase EOF
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
    // InternalGramatica.g:890:1: ruleClase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGramatica.g:896:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGramatica.g:897:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGramatica.g:897:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGramatica.g:898:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGramatica.g:898:3: (lv_name_0_0= RULE_ID )
            // InternalGramatica.g:899:4: lv_name_0_0= RULE_ID
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
    // InternalGramatica.g:918:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalGramatica.g:918:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGramatica.g:919:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGramatica.g:925:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalGramatica.g:931:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalGramatica.g:932:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalGramatica.g:932:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:933:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramatica.g:941:3: this_STRING_1= RULE_STRING
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
    // InternalGramatica.g:952:1: entryRuleFinOracion returns [String current=null] : iv_ruleFinOracion= ruleFinOracion EOF ;
    public final String entryRuleFinOracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinOracion = null;


        try {
            // InternalGramatica.g:952:50: (iv_ruleFinOracion= ruleFinOracion EOF )
            // InternalGramatica.g:953:2: iv_ruleFinOracion= ruleFinOracion EOF
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
    // InternalGramatica.g:959:1: ruleFinOracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleFinOracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramatica.g:965:2: (kw= '.' )
            // InternalGramatica.g:966:2: kw= '.'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\21\uffff\2\26\1\uffff\2\26\2\uffff";
    static final String dfa_3s = "\1\15\3\5\1\20\1\5\2\21\11\4\2\13\1\5\2\13\2\uffff";
    static final String dfa_4s = "\1\16\2\17\1\5\1\20\1\5\1\23\1\22\2\32\7\17\2\33\1\5\1\33\1\16\2\uffff";
    static final String dfa_5s = "\26\uffff\1\1\1\2";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\4\11\uffff\1\3",
            "\1\4\11\uffff\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\11\1\7",
            "\1\10\1\11",
            "\1\22\1\24\1\21\10\uffff\1\23\4\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\22\1\24\1\21\10\uffff\1\23\4\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\1\22\1\24\1\21\10\uffff\1\23",
            "\2\27\2\26\14\uffff\1\25",
            "\2\27\2\26\14\uffff\1\25",
            "\1\24",
            "\2\27\2\26\14\uffff\1\25",
            "\2\27\2\26",
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
            return "224:2: (this_Simple_0= ruleSimple | this_Compuesta_1= ruleCompuesta )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007F08070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000002L});

}