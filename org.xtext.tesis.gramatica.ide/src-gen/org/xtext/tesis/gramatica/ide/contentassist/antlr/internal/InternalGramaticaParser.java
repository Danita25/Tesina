package org.xtext.tesis.gramatica.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.tesis.gramatica.services.GramaticaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGramaticaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'El/La'", "'Los/Las'", "'ser'", "'estar'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'seleccionamos'", "'para todos'", "'existe'", "'es no vacio'", "'es vacio | tamanio'", "'de'", "'un/una'", "'no'", "'debe'", "'.'", "'Para todos/as'", "'tal que'", "'('", "'donde'", "')'", "'Coleccion de'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(GramaticaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGramatica"
    // InternalGramatica.g:53:1: entryRuleGramatica : ruleGramatica EOF ;
    public final void entryRuleGramatica() throws RecognitionException {
        try {
            // InternalGramatica.g:54:1: ( ruleGramatica EOF )
            // InternalGramatica.g:55:1: ruleGramatica EOF
            {
             before(grammarAccess.getGramaticaRule()); 
            pushFollow(FOLLOW_1);
            ruleGramatica();

            state._fsp--;

             after(grammarAccess.getGramaticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGramatica"


    // $ANTLR start "ruleGramatica"
    // InternalGramatica.g:62:1: ruleGramatica : ( ( rule__Gramatica__OracionesAssignment )* ) ;
    public final void ruleGramatica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:66:2: ( ( ( rule__Gramatica__OracionesAssignment )* ) )
            // InternalGramatica.g:67:2: ( ( rule__Gramatica__OracionesAssignment )* )
            {
            // InternalGramatica.g:67:2: ( ( rule__Gramatica__OracionesAssignment )* )
            // InternalGramatica.g:68:3: ( rule__Gramatica__OracionesAssignment )*
            {
             before(grammarAccess.getGramaticaAccess().getOracionesAssignment()); 
            // InternalGramatica.g:69:3: ( rule__Gramatica__OracionesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:69:4: rule__Gramatica__OracionesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Gramatica__OracionesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGramaticaAccess().getOracionesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGramatica"


    // $ANTLR start "entryRuleOracion"
    // InternalGramatica.g:78:1: entryRuleOracion : ruleOracion EOF ;
    public final void entryRuleOracion() throws RecognitionException {
        try {
            // InternalGramatica.g:79:1: ( ruleOracion EOF )
            // InternalGramatica.g:80:1: ruleOracion EOF
            {
             before(grammarAccess.getOracionRule()); 
            pushFollow(FOLLOW_1);
            ruleOracion();

            state._fsp--;

             after(grammarAccess.getOracionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOracion"


    // $ANTLR start "ruleOracion"
    // InternalGramatica.g:87:1: ruleOracion : ( ( rule__Oracion__Alternatives ) ) ;
    public final void ruleOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:91:2: ( ( ( rule__Oracion__Alternatives ) ) )
            // InternalGramatica.g:92:2: ( ( rule__Oracion__Alternatives ) )
            {
            // InternalGramatica.g:92:2: ( ( rule__Oracion__Alternatives ) )
            // InternalGramatica.g:93:3: ( rule__Oracion__Alternatives )
            {
             before(grammarAccess.getOracionAccess().getAlternatives()); 
            // InternalGramatica.g:94:3: ( rule__Oracion__Alternatives )
            // InternalGramatica.g:94:4: rule__Oracion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOracionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOracion"


    // $ANTLR start "entryRuleSimple"
    // InternalGramatica.g:103:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalGramatica.g:104:1: ( ruleSimple EOF )
            // InternalGramatica.g:105:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalGramatica.g:112:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:116:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalGramatica.g:117:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalGramatica.g:117:2: ( ( rule__Simple__Group__0 ) )
            // InternalGramatica.g:118:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalGramatica.g:119:3: ( rule__Simple__Group__0 )
            // InternalGramatica.g:119:4: rule__Simple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleCompleja"
    // InternalGramatica.g:128:1: entryRuleCompleja : ruleCompleja EOF ;
    public final void entryRuleCompleja() throws RecognitionException {
        try {
            // InternalGramatica.g:129:1: ( ruleCompleja EOF )
            // InternalGramatica.g:130:1: ruleCompleja EOF
            {
             before(grammarAccess.getComplejaRule()); 
            pushFollow(FOLLOW_1);
            ruleCompleja();

            state._fsp--;

             after(grammarAccess.getComplejaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompleja"


    // $ANTLR start "ruleCompleja"
    // InternalGramatica.g:137:1: ruleCompleja : ( ( rule__Compleja__Group__0 ) ) ;
    public final void ruleCompleja() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:141:2: ( ( ( rule__Compleja__Group__0 ) ) )
            // InternalGramatica.g:142:2: ( ( rule__Compleja__Group__0 ) )
            {
            // InternalGramatica.g:142:2: ( ( rule__Compleja__Group__0 ) )
            // InternalGramatica.g:143:3: ( rule__Compleja__Group__0 )
            {
             before(grammarAccess.getComplejaAccess().getGroup()); 
            // InternalGramatica.g:144:3: ( rule__Compleja__Group__0 )
            // InternalGramatica.g:144:4: rule__Compleja__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompleja"


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:153:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalGramatica.g:154:1: ( ruleAtributo EOF )
            // InternalGramatica.g:155:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalGramatica.g:162:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:166:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalGramatica.g:167:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalGramatica.g:167:2: ( ( rule__Atributo__Group__0 ) )
            // InternalGramatica.g:168:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalGramatica.g:169:3: ( rule__Atributo__Group__0 )
            // InternalGramatica.g:169:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleClase"
    // InternalGramatica.g:178:1: entryRuleClase : ruleClase EOF ;
    public final void entryRuleClase() throws RecognitionException {
        try {
            // InternalGramatica.g:179:1: ( ruleClase EOF )
            // InternalGramatica.g:180:1: ruleClase EOF
            {
             before(grammarAccess.getClaseRule()); 
            pushFollow(FOLLOW_1);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getClaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClase"


    // $ANTLR start "ruleClase"
    // InternalGramatica.g:187:1: ruleClase : ( ( rule__Clase__NameAssignment ) ) ;
    public final void ruleClase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:191:2: ( ( ( rule__Clase__NameAssignment ) ) )
            // InternalGramatica.g:192:2: ( ( rule__Clase__NameAssignment ) )
            {
            // InternalGramatica.g:192:2: ( ( rule__Clase__NameAssignment ) )
            // InternalGramatica.g:193:3: ( rule__Clase__NameAssignment )
            {
             before(grammarAccess.getClaseAccess().getNameAssignment()); 
            // InternalGramatica.g:194:3: ( rule__Clase__NameAssignment )
            // InternalGramatica.g:194:4: rule__Clase__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Clase__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClaseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClase"


    // $ANTLR start "entryRuleLiteral"
    // InternalGramatica.g:203:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalGramatica.g:204:1: ( ruleLiteral EOF )
            // InternalGramatica.g:205:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalGramatica.g:212:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:216:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalGramatica.g:217:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalGramatica.g:217:2: ( ( rule__Literal__Alternatives ) )
            // InternalGramatica.g:218:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalGramatica.g:219:3: ( rule__Literal__Alternatives )
            // InternalGramatica.g:219:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__Oracion__Alternatives"
    // InternalGramatica.g:227:1: rule__Oracion__Alternatives : ( ( ruleSimple ) | ( ruleCompleja ) );
    public final void rule__Oracion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:231:1: ( ( ruleSimple ) | ( ruleCompleja ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:232:2: ( ruleSimple )
                    {
                    // InternalGramatica.g:232:2: ( ruleSimple )
                    // InternalGramatica.g:233:3: ruleSimple
                    {
                     before(grammarAccess.getOracionAccess().getSimpleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getSimpleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:238:2: ( ruleCompleja )
                    {
                    // InternalGramatica.g:238:2: ( ruleCompleja )
                    // InternalGramatica.g:239:3: ruleCompleja
                    {
                     before(grammarAccess.getOracionAccess().getComplejaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompleja();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getComplejaParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracion__Alternatives"


    // $ANTLR start "rule__Simple__Alternatives_0"
    // InternalGramatica.g:248:1: rule__Simple__Alternatives_0 : ( ( 'El/La' ) | ( 'Los/Las' ) );
    public final void rule__Simple__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:252:1: ( ( 'El/La' ) | ( 'Los/Las' ) )
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
                    // InternalGramatica.g:253:2: ( 'El/La' )
                    {
                    // InternalGramatica.g:253:2: ( 'El/La' )
                    // InternalGramatica.g:254:3: 'El/La'
                    {
                     before(grammarAccess.getSimpleAccess().getElLaKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getElLaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:259:2: ( 'Los/Las' )
                    {
                    // InternalGramatica.g:259:2: ( 'Los/Las' )
                    // InternalGramatica.g:260:3: 'Los/Las'
                    {
                     before(grammarAccess.getSimpleAccess().getLosLasKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getLosLasKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Alternatives_0"


    // $ANTLR start "rule__Simple__Alternatives_7"
    // InternalGramatica.g:269:1: rule__Simple__Alternatives_7 : ( ( 'ser' ) | ( 'estar' ) );
    public final void rule__Simple__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:273:1: ( ( 'ser' ) | ( 'estar' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
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
                    // InternalGramatica.g:274:2: ( 'ser' )
                    {
                    // InternalGramatica.g:274:2: ( 'ser' )
                    // InternalGramatica.g:275:3: 'ser'
                    {
                     before(grammarAccess.getSimpleAccess().getSerKeyword_7_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getSerKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:280:2: ( 'estar' )
                    {
                    // InternalGramatica.g:280:2: ( 'estar' )
                    // InternalGramatica.g:281:3: 'estar'
                    {
                     before(grammarAccess.getSimpleAccess().getEstarKeyword_7_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getEstarKeyword_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Alternatives_7"


    // $ANTLR start "rule__Simple__Alternatives_8"
    // InternalGramatica.g:290:1: rule__Simple__Alternatives_8 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Simple__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:294:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
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
                    // InternalGramatica.g:295:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:295:2: ( 'mayor que' )
                    // InternalGramatica.g:296:3: 'mayor que'
                    {
                     before(grammarAccess.getSimpleAccess().getMayorQueKeyword_8_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getMayorQueKeyword_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:301:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:301:2: ( 'menor que' )
                    // InternalGramatica.g:302:3: 'menor que'
                    {
                     before(grammarAccess.getSimpleAccess().getMenorQueKeyword_8_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getMenorQueKeyword_8_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:307:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:307:2: ( 'igual a' )
                    // InternalGramatica.g:308:3: 'igual a'
                    {
                     before(grammarAccess.getSimpleAccess().getIgualAKeyword_8_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getIgualAKeyword_8_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:313:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:313:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:314:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getSimpleAccess().getMayorOIgualAKeyword_8_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getMayorOIgualAKeyword_8_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:319:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:319:2: ( 'menor o igual a' )
                    // InternalGramatica.g:320:3: 'menor o igual a'
                    {
                     before(grammarAccess.getSimpleAccess().getMenorOIgualAKeyword_8_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getMenorOIgualAKeyword_8_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:325:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:325:2: ( 'distinto de' )
                    // InternalGramatica.g:326:3: 'distinto de'
                    {
                     before(grammarAccess.getSimpleAccess().getDistintoDeKeyword_8_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getDistintoDeKeyword_8_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:331:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:331:2: ( 'al menos' )
                    // InternalGramatica.g:332:3: 'al menos'
                    {
                     before(grammarAccess.getSimpleAccess().getAlMenosKeyword_8_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlMenosKeyword_8_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Alternatives_8"


    // $ANTLR start "rule__Simple__Alternatives_9"
    // InternalGramatica.g:341:1: rule__Simple__Alternatives_9 : ( ( ( rule__Simple__LiteralAssignment_9_0 ) ) | ( ( rule__Simple__AtributoAssignment_9_1 ) ) );
    public final void rule__Simple__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:345:1: ( ( ( rule__Simple__LiteralAssignment_9_0 ) ) | ( ( rule__Simple__AtributoAssignment_9_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==37) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:346:2: ( ( rule__Simple__LiteralAssignment_9_0 ) )
                    {
                    // InternalGramatica.g:346:2: ( ( rule__Simple__LiteralAssignment_9_0 ) )
                    // InternalGramatica.g:347:3: ( rule__Simple__LiteralAssignment_9_0 )
                    {
                     before(grammarAccess.getSimpleAccess().getLiteralAssignment_9_0()); 
                    // InternalGramatica.g:348:3: ( rule__Simple__LiteralAssignment_9_0 )
                    // InternalGramatica.g:348:4: rule__Simple__LiteralAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__LiteralAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAccess().getLiteralAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:352:2: ( ( rule__Simple__AtributoAssignment_9_1 ) )
                    {
                    // InternalGramatica.g:352:2: ( ( rule__Simple__AtributoAssignment_9_1 ) )
                    // InternalGramatica.g:353:3: ( rule__Simple__AtributoAssignment_9_1 )
                    {
                     before(grammarAccess.getSimpleAccess().getAtributoAssignment_9_1()); 
                    // InternalGramatica.g:354:3: ( rule__Simple__AtributoAssignment_9_1 )
                    // InternalGramatica.g:354:4: rule__Simple__AtributoAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__AtributoAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAccess().getAtributoAssignment_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Alternatives_9"


    // $ANTLR start "rule__Compleja__Alternatives_7"
    // InternalGramatica.g:362:1: rule__Compleja__Alternatives_7 : ( ( 'seleccionamos' ) | ( 'para todos' ) | ( 'existe' ) );
    public final void rule__Compleja__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:366:1: ( ( 'seleccionamos' ) | ( 'para todos' ) | ( 'existe' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:367:2: ( 'seleccionamos' )
                    {
                    // InternalGramatica.g:367:2: ( 'seleccionamos' )
                    // InternalGramatica.g:368:3: 'seleccionamos'
                    {
                     before(grammarAccess.getComplejaAccess().getSeleccionamosKeyword_7_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getSeleccionamosKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:373:2: ( 'para todos' )
                    {
                    // InternalGramatica.g:373:2: ( 'para todos' )
                    // InternalGramatica.g:374:3: 'para todos'
                    {
                     before(grammarAccess.getComplejaAccess().getParaTodosKeyword_7_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getParaTodosKeyword_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:379:2: ( 'existe' )
                    {
                    // InternalGramatica.g:379:2: ( 'existe' )
                    // InternalGramatica.g:380:3: 'existe'
                    {
                     before(grammarAccess.getComplejaAccess().getExisteKeyword_7_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getExisteKeyword_7_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Alternatives_7"


    // $ANTLR start "rule__Compleja__Alternatives_12"
    // InternalGramatica.g:389:1: rule__Compleja__Alternatives_12 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Compleja__Alternatives_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:393:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 21:
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
                    // InternalGramatica.g:394:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:394:2: ( 'mayor que' )
                    // InternalGramatica.g:395:3: 'mayor que'
                    {
                     before(grammarAccess.getComplejaAccess().getMayorQueKeyword_12_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMayorQueKeyword_12_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:400:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:400:2: ( 'menor que' )
                    // InternalGramatica.g:401:3: 'menor que'
                    {
                     before(grammarAccess.getComplejaAccess().getMenorQueKeyword_12_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMenorQueKeyword_12_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:406:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:406:2: ( 'igual a' )
                    // InternalGramatica.g:407:3: 'igual a'
                    {
                     before(grammarAccess.getComplejaAccess().getIgualAKeyword_12_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getIgualAKeyword_12_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:412:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:412:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:413:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_12_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_12_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:418:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:418:2: ( 'menor o igual a' )
                    // InternalGramatica.g:419:3: 'menor o igual a'
                    {
                     before(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_12_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_12_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:424:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:424:2: ( 'distinto de' )
                    // InternalGramatica.g:425:3: 'distinto de'
                    {
                     before(grammarAccess.getComplejaAccess().getDistintoDeKeyword_12_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getDistintoDeKeyword_12_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:430:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:430:2: ( 'al menos' )
                    // InternalGramatica.g:431:3: 'al menos'
                    {
                     before(grammarAccess.getComplejaAccess().getAlMenosKeyword_12_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getAlMenosKeyword_12_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Alternatives_12"


    // $ANTLR start "rule__Compleja__Alternatives_13"
    // InternalGramatica.g:440:1: rule__Compleja__Alternatives_13 : ( ( ( rule__Compleja__LiteralAssignment_13_0 ) ) | ( ( rule__Compleja__AtributoAssignment_13_1 ) ) );
    public final void rule__Compleja__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:444:1: ( ( ( rule__Compleja__LiteralAssignment_13_0 ) ) | ( ( rule__Compleja__AtributoAssignment_13_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==37) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:445:2: ( ( rule__Compleja__LiteralAssignment_13_0 ) )
                    {
                    // InternalGramatica.g:445:2: ( ( rule__Compleja__LiteralAssignment_13_0 ) )
                    // InternalGramatica.g:446:3: ( rule__Compleja__LiteralAssignment_13_0 )
                    {
                     before(grammarAccess.getComplejaAccess().getLiteralAssignment_13_0()); 
                    // InternalGramatica.g:447:3: ( rule__Compleja__LiteralAssignment_13_0 )
                    // InternalGramatica.g:447:4: rule__Compleja__LiteralAssignment_13_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__LiteralAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getLiteralAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:451:2: ( ( rule__Compleja__AtributoAssignment_13_1 ) )
                    {
                    // InternalGramatica.g:451:2: ( ( rule__Compleja__AtributoAssignment_13_1 ) )
                    // InternalGramatica.g:452:3: ( rule__Compleja__AtributoAssignment_13_1 )
                    {
                     before(grammarAccess.getComplejaAccess().getAtributoAssignment_13_1()); 
                    // InternalGramatica.g:453:3: ( rule__Compleja__AtributoAssignment_13_1 )
                    // InternalGramatica.g:453:4: rule__Compleja__AtributoAssignment_13_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__AtributoAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getAtributoAssignment_13_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Alternatives_13"


    // $ANTLR start "rule__Compleja__Alternatives_16"
    // InternalGramatica.g:461:1: rule__Compleja__Alternatives_16 : ( ( 'es no vacio' ) | ( 'es vacio | tamanio' ) );
    public final void rule__Compleja__Alternatives_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:465:1: ( ( 'es no vacio' ) | ( 'es vacio | tamanio' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:466:2: ( 'es no vacio' )
                    {
                    // InternalGramatica.g:466:2: ( 'es no vacio' )
                    // InternalGramatica.g:467:3: 'es no vacio'
                    {
                     before(grammarAccess.getComplejaAccess().getEsNoVacioKeyword_16_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getEsNoVacioKeyword_16_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:472:2: ( 'es vacio | tamanio' )
                    {
                    // InternalGramatica.g:472:2: ( 'es vacio | tamanio' )
                    // InternalGramatica.g:473:3: 'es vacio | tamanio'
                    {
                     before(grammarAccess.getComplejaAccess().getEsVacioTamanioKeyword_16_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getEsVacioTamanioKeyword_16_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Alternatives_16"


    // $ANTLR start "rule__Compleja__Alternatives_17_0"
    // InternalGramatica.g:482:1: rule__Compleja__Alternatives_17_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Compleja__Alternatives_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:486:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            case 18:
                {
                alt11=4;
                }
                break;
            case 19:
                {
                alt11=5;
                }
                break;
            case 20:
                {
                alt11=6;
                }
                break;
            case 21:
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
                    // InternalGramatica.g:487:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:487:2: ( 'mayor que' )
                    // InternalGramatica.g:488:3: 'mayor que'
                    {
                     before(grammarAccess.getComplejaAccess().getMayorQueKeyword_17_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMayorQueKeyword_17_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:493:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:493:2: ( 'menor que' )
                    // InternalGramatica.g:494:3: 'menor que'
                    {
                     before(grammarAccess.getComplejaAccess().getMenorQueKeyword_17_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMenorQueKeyword_17_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:499:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:499:2: ( 'igual a' )
                    // InternalGramatica.g:500:3: 'igual a'
                    {
                     before(grammarAccess.getComplejaAccess().getIgualAKeyword_17_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getIgualAKeyword_17_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:505:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:505:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:506:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_17_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMayorOIgualAKeyword_17_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:511:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:511:2: ( 'menor o igual a' )
                    // InternalGramatica.g:512:3: 'menor o igual a'
                    {
                     before(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_17_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getMenorOIgualAKeyword_17_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:517:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:517:2: ( 'distinto de' )
                    // InternalGramatica.g:518:3: 'distinto de'
                    {
                     before(grammarAccess.getComplejaAccess().getDistintoDeKeyword_17_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getDistintoDeKeyword_17_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:523:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:523:2: ( 'al menos' )
                    // InternalGramatica.g:524:3: 'al menos'
                    {
                     before(grammarAccess.getComplejaAccess().getAlMenosKeyword_17_0_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComplejaAccess().getAlMenosKeyword_17_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Alternatives_17_0"


    // $ANTLR start "rule__Compleja__Alternatives_17_1"
    // InternalGramatica.g:533:1: rule__Compleja__Alternatives_17_1 : ( ( ( rule__Compleja__LiteralAssignment_17_1_0 ) ) | ( ( rule__Compleja__AtributoAssignment_17_1_1 ) ) );
    public final void rule__Compleja__Alternatives_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:537:1: ( ( ( rule__Compleja__LiteralAssignment_17_1_0 ) ) | ( ( rule__Compleja__AtributoAssignment_17_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||LA12_0==37) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:538:2: ( ( rule__Compleja__LiteralAssignment_17_1_0 ) )
                    {
                    // InternalGramatica.g:538:2: ( ( rule__Compleja__LiteralAssignment_17_1_0 ) )
                    // InternalGramatica.g:539:3: ( rule__Compleja__LiteralAssignment_17_1_0 )
                    {
                     before(grammarAccess.getComplejaAccess().getLiteralAssignment_17_1_0()); 
                    // InternalGramatica.g:540:3: ( rule__Compleja__LiteralAssignment_17_1_0 )
                    // InternalGramatica.g:540:4: rule__Compleja__LiteralAssignment_17_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__LiteralAssignment_17_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getLiteralAssignment_17_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:544:2: ( ( rule__Compleja__AtributoAssignment_17_1_1 ) )
                    {
                    // InternalGramatica.g:544:2: ( ( rule__Compleja__AtributoAssignment_17_1_1 ) )
                    // InternalGramatica.g:545:3: ( rule__Compleja__AtributoAssignment_17_1_1 )
                    {
                     before(grammarAccess.getComplejaAccess().getAtributoAssignment_17_1_1()); 
                    // InternalGramatica.g:546:3: ( rule__Compleja__AtributoAssignment_17_1_1 )
                    // InternalGramatica.g:546:4: rule__Compleja__AtributoAssignment_17_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__AtributoAssignment_17_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getAtributoAssignment_17_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Alternatives_17_1"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalGramatica.g:554:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:558:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGramatica.g:559:2: ( RULE_INT )
                    {
                    // InternalGramatica.g:559:2: ( RULE_INT )
                    // InternalGramatica.g:560:3: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:565:2: ( RULE_STRING )
                    {
                    // InternalGramatica.g:565:2: ( RULE_STRING )
                    // InternalGramatica.g:566:3: RULE_STRING
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalGramatica.g:575:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:579:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:580:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Simple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0"


    // $ANTLR start "rule__Simple__Group__0__Impl"
    // InternalGramatica.g:587:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__Alternatives_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:591:1: ( ( ( rule__Simple__Alternatives_0 ) ) )
            // InternalGramatica.g:592:1: ( ( rule__Simple__Alternatives_0 ) )
            {
            // InternalGramatica.g:592:1: ( ( rule__Simple__Alternatives_0 ) )
            // InternalGramatica.g:593:2: ( rule__Simple__Alternatives_0 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_0()); 
            // InternalGramatica.g:594:2: ( rule__Simple__Alternatives_0 )
            // InternalGramatica.g:594:3: rule__Simple__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0__Impl"


    // $ANTLR start "rule__Simple__Group__1"
    // InternalGramatica.g:602:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:606:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:607:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Simple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1"


    // $ANTLR start "rule__Simple__Group__1__Impl"
    // InternalGramatica.g:614:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AtributoAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:618:1: ( ( ( rule__Simple__AtributoAssignment_1 ) ) )
            // InternalGramatica.g:619:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            {
            // InternalGramatica.g:619:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            // InternalGramatica.g:620:2: ( rule__Simple__AtributoAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); 
            // InternalGramatica.g:621:2: ( rule__Simple__AtributoAssignment_1 )
            // InternalGramatica.g:621:3: rule__Simple__AtributoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple__AtributoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1__Impl"


    // $ANTLR start "rule__Simple__Group__2"
    // InternalGramatica.g:629:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:633:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalGramatica.g:634:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Simple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__2"


    // $ANTLR start "rule__Simple__Group__2__Impl"
    // InternalGramatica.g:641:1: rule__Simple__Group__2__Impl : ( 'de' ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:645:1: ( ( 'de' ) )
            // InternalGramatica.g:646:1: ( 'de' )
            {
            // InternalGramatica.g:646:1: ( 'de' )
            // InternalGramatica.g:647:2: 'de'
            {
             before(grammarAccess.getSimpleAccess().getDeKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getDeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__2__Impl"


    // $ANTLR start "rule__Simple__Group__3"
    // InternalGramatica.g:656:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:660:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalGramatica.g:661:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Simple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__3"


    // $ANTLR start "rule__Simple__Group__3__Impl"
    // InternalGramatica.g:668:1: rule__Simple__Group__3__Impl : ( 'un/una' ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:672:1: ( ( 'un/una' ) )
            // InternalGramatica.g:673:1: ( 'un/una' )
            {
            // InternalGramatica.g:673:1: ( 'un/una' )
            // InternalGramatica.g:674:2: 'un/una'
            {
             before(grammarAccess.getSimpleAccess().getUnUnaKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getUnUnaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__3__Impl"


    // $ANTLR start "rule__Simple__Group__4"
    // InternalGramatica.g:683:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:687:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalGramatica.g:688:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Simple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__4"


    // $ANTLR start "rule__Simple__Group__4__Impl"
    // InternalGramatica.g:695:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__ContextoAssignment_4 ) ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:699:1: ( ( ( rule__Simple__ContextoAssignment_4 ) ) )
            // InternalGramatica.g:700:1: ( ( rule__Simple__ContextoAssignment_4 ) )
            {
            // InternalGramatica.g:700:1: ( ( rule__Simple__ContextoAssignment_4 ) )
            // InternalGramatica.g:701:2: ( rule__Simple__ContextoAssignment_4 )
            {
             before(grammarAccess.getSimpleAccess().getContextoAssignment_4()); 
            // InternalGramatica.g:702:2: ( rule__Simple__ContextoAssignment_4 )
            // InternalGramatica.g:702:3: rule__Simple__ContextoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ContextoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getContextoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__4__Impl"


    // $ANTLR start "rule__Simple__Group__5"
    // InternalGramatica.g:710:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl rule__Simple__Group__6 ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:714:1: ( rule__Simple__Group__5__Impl rule__Simple__Group__6 )
            // InternalGramatica.g:715:2: rule__Simple__Group__5__Impl rule__Simple__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Simple__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__5"


    // $ANTLR start "rule__Simple__Group__5__Impl"
    // InternalGramatica.g:722:1: rule__Simple__Group__5__Impl : ( ( 'no' )? ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:726:1: ( ( ( 'no' )? ) )
            // InternalGramatica.g:727:1: ( ( 'no' )? )
            {
            // InternalGramatica.g:727:1: ( ( 'no' )? )
            // InternalGramatica.g:728:2: ( 'no' )?
            {
             before(grammarAccess.getSimpleAccess().getNoKeyword_5()); 
            // InternalGramatica.g:729:2: ( 'no' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGramatica.g:729:3: 'no'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getNoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__5__Impl"


    // $ANTLR start "rule__Simple__Group__6"
    // InternalGramatica.g:737:1: rule__Simple__Group__6 : rule__Simple__Group__6__Impl rule__Simple__Group__7 ;
    public final void rule__Simple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:741:1: ( rule__Simple__Group__6__Impl rule__Simple__Group__7 )
            // InternalGramatica.g:742:2: rule__Simple__Group__6__Impl rule__Simple__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Simple__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__6"


    // $ANTLR start "rule__Simple__Group__6__Impl"
    // InternalGramatica.g:749:1: rule__Simple__Group__6__Impl : ( 'debe' ) ;
    public final void rule__Simple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:753:1: ( ( 'debe' ) )
            // InternalGramatica.g:754:1: ( 'debe' )
            {
            // InternalGramatica.g:754:1: ( 'debe' )
            // InternalGramatica.g:755:2: 'debe'
            {
             before(grammarAccess.getSimpleAccess().getDebeKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getDebeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__6__Impl"


    // $ANTLR start "rule__Simple__Group__7"
    // InternalGramatica.g:764:1: rule__Simple__Group__7 : rule__Simple__Group__7__Impl rule__Simple__Group__8 ;
    public final void rule__Simple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:768:1: ( rule__Simple__Group__7__Impl rule__Simple__Group__8 )
            // InternalGramatica.g:769:2: rule__Simple__Group__7__Impl rule__Simple__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Simple__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__7"


    // $ANTLR start "rule__Simple__Group__7__Impl"
    // InternalGramatica.g:776:1: rule__Simple__Group__7__Impl : ( ( rule__Simple__Alternatives_7 ) ) ;
    public final void rule__Simple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:780:1: ( ( ( rule__Simple__Alternatives_7 ) ) )
            // InternalGramatica.g:781:1: ( ( rule__Simple__Alternatives_7 ) )
            {
            // InternalGramatica.g:781:1: ( ( rule__Simple__Alternatives_7 ) )
            // InternalGramatica.g:782:2: ( rule__Simple__Alternatives_7 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_7()); 
            // InternalGramatica.g:783:2: ( rule__Simple__Alternatives_7 )
            // InternalGramatica.g:783:3: rule__Simple__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__7__Impl"


    // $ANTLR start "rule__Simple__Group__8"
    // InternalGramatica.g:791:1: rule__Simple__Group__8 : rule__Simple__Group__8__Impl rule__Simple__Group__9 ;
    public final void rule__Simple__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:795:1: ( rule__Simple__Group__8__Impl rule__Simple__Group__9 )
            // InternalGramatica.g:796:2: rule__Simple__Group__8__Impl rule__Simple__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Simple__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__8"


    // $ANTLR start "rule__Simple__Group__8__Impl"
    // InternalGramatica.g:803:1: rule__Simple__Group__8__Impl : ( ( rule__Simple__Alternatives_8 )? ) ;
    public final void rule__Simple__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:807:1: ( ( ( rule__Simple__Alternatives_8 )? ) )
            // InternalGramatica.g:808:1: ( ( rule__Simple__Alternatives_8 )? )
            {
            // InternalGramatica.g:808:1: ( ( rule__Simple__Alternatives_8 )? )
            // InternalGramatica.g:809:2: ( rule__Simple__Alternatives_8 )?
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_8()); 
            // InternalGramatica.g:810:2: ( rule__Simple__Alternatives_8 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=15 && LA15_0<=21)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGramatica.g:810:3: rule__Simple__Alternatives_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__Alternatives_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__8__Impl"


    // $ANTLR start "rule__Simple__Group__9"
    // InternalGramatica.g:818:1: rule__Simple__Group__9 : rule__Simple__Group__9__Impl rule__Simple__Group__10 ;
    public final void rule__Simple__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:822:1: ( rule__Simple__Group__9__Impl rule__Simple__Group__10 )
            // InternalGramatica.g:823:2: rule__Simple__Group__9__Impl rule__Simple__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Simple__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__9"


    // $ANTLR start "rule__Simple__Group__9__Impl"
    // InternalGramatica.g:830:1: rule__Simple__Group__9__Impl : ( ( rule__Simple__Alternatives_9 ) ) ;
    public final void rule__Simple__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:834:1: ( ( ( rule__Simple__Alternatives_9 ) ) )
            // InternalGramatica.g:835:1: ( ( rule__Simple__Alternatives_9 ) )
            {
            // InternalGramatica.g:835:1: ( ( rule__Simple__Alternatives_9 ) )
            // InternalGramatica.g:836:2: ( rule__Simple__Alternatives_9 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_9()); 
            // InternalGramatica.g:837:2: ( rule__Simple__Alternatives_9 )
            // InternalGramatica.g:837:3: rule__Simple__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__9__Impl"


    // $ANTLR start "rule__Simple__Group__10"
    // InternalGramatica.g:845:1: rule__Simple__Group__10 : rule__Simple__Group__10__Impl ;
    public final void rule__Simple__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:849:1: ( rule__Simple__Group__10__Impl )
            // InternalGramatica.g:850:2: rule__Simple__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__10"


    // $ANTLR start "rule__Simple__Group__10__Impl"
    // InternalGramatica.g:856:1: rule__Simple__Group__10__Impl : ( '.' ) ;
    public final void rule__Simple__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:860:1: ( ( '.' ) )
            // InternalGramatica.g:861:1: ( '.' )
            {
            // InternalGramatica.g:861:1: ( '.' )
            // InternalGramatica.g:862:2: '.'
            {
             before(grammarAccess.getSimpleAccess().getFullStopKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getFullStopKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__10__Impl"


    // $ANTLR start "rule__Compleja__Group__0"
    // InternalGramatica.g:872:1: rule__Compleja__Group__0 : rule__Compleja__Group__0__Impl rule__Compleja__Group__1 ;
    public final void rule__Compleja__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:876:1: ( rule__Compleja__Group__0__Impl rule__Compleja__Group__1 )
            // InternalGramatica.g:877:2: rule__Compleja__Group__0__Impl rule__Compleja__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Compleja__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__0"


    // $ANTLR start "rule__Compleja__Group__0__Impl"
    // InternalGramatica.g:884:1: rule__Compleja__Group__0__Impl : ( 'Para todos/as' ) ;
    public final void rule__Compleja__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:888:1: ( ( 'Para todos/as' ) )
            // InternalGramatica.g:889:1: ( 'Para todos/as' )
            {
            // InternalGramatica.g:889:1: ( 'Para todos/as' )
            // InternalGramatica.g:890:2: 'Para todos/as'
            {
             before(grammarAccess.getComplejaAccess().getParaTodosAsKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getParaTodosAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__0__Impl"


    // $ANTLR start "rule__Compleja__Group__1"
    // InternalGramatica.g:899:1: rule__Compleja__Group__1 : rule__Compleja__Group__1__Impl rule__Compleja__Group__2 ;
    public final void rule__Compleja__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:903:1: ( rule__Compleja__Group__1__Impl rule__Compleja__Group__2 )
            // InternalGramatica.g:904:2: rule__Compleja__Group__1__Impl rule__Compleja__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Compleja__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__1"


    // $ANTLR start "rule__Compleja__Group__1__Impl"
    // InternalGramatica.g:911:1: rule__Compleja__Group__1__Impl : ( ( rule__Compleja__AtributoAssignment_1 ) ) ;
    public final void rule__Compleja__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:915:1: ( ( ( rule__Compleja__AtributoAssignment_1 ) ) )
            // InternalGramatica.g:916:1: ( ( rule__Compleja__AtributoAssignment_1 ) )
            {
            // InternalGramatica.g:916:1: ( ( rule__Compleja__AtributoAssignment_1 ) )
            // InternalGramatica.g:917:2: ( rule__Compleja__AtributoAssignment_1 )
            {
             before(grammarAccess.getComplejaAccess().getAtributoAssignment_1()); 
            // InternalGramatica.g:918:2: ( rule__Compleja__AtributoAssignment_1 )
            // InternalGramatica.g:918:3: rule__Compleja__AtributoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__AtributoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAtributoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__1__Impl"


    // $ANTLR start "rule__Compleja__Group__2"
    // InternalGramatica.g:926:1: rule__Compleja__Group__2 : rule__Compleja__Group__2__Impl rule__Compleja__Group__3 ;
    public final void rule__Compleja__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:930:1: ( rule__Compleja__Group__2__Impl rule__Compleja__Group__3 )
            // InternalGramatica.g:931:2: rule__Compleja__Group__2__Impl rule__Compleja__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Compleja__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__2"


    // $ANTLR start "rule__Compleja__Group__2__Impl"
    // InternalGramatica.g:938:1: rule__Compleja__Group__2__Impl : ( 'de' ) ;
    public final void rule__Compleja__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:942:1: ( ( 'de' ) )
            // InternalGramatica.g:943:1: ( 'de' )
            {
            // InternalGramatica.g:943:1: ( 'de' )
            // InternalGramatica.g:944:2: 'de'
            {
             before(grammarAccess.getComplejaAccess().getDeKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getDeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__2__Impl"


    // $ANTLR start "rule__Compleja__Group__3"
    // InternalGramatica.g:953:1: rule__Compleja__Group__3 : rule__Compleja__Group__3__Impl rule__Compleja__Group__4 ;
    public final void rule__Compleja__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:957:1: ( rule__Compleja__Group__3__Impl rule__Compleja__Group__4 )
            // InternalGramatica.g:958:2: rule__Compleja__Group__3__Impl rule__Compleja__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Compleja__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__3"


    // $ANTLR start "rule__Compleja__Group__3__Impl"
    // InternalGramatica.g:965:1: rule__Compleja__Group__3__Impl : ( 'un/una' ) ;
    public final void rule__Compleja__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:969:1: ( ( 'un/una' ) )
            // InternalGramatica.g:970:1: ( 'un/una' )
            {
            // InternalGramatica.g:970:1: ( 'un/una' )
            // InternalGramatica.g:971:2: 'un/una'
            {
             before(grammarAccess.getComplejaAccess().getUnUnaKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getUnUnaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__3__Impl"


    // $ANTLR start "rule__Compleja__Group__4"
    // InternalGramatica.g:980:1: rule__Compleja__Group__4 : rule__Compleja__Group__4__Impl rule__Compleja__Group__5 ;
    public final void rule__Compleja__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:984:1: ( rule__Compleja__Group__4__Impl rule__Compleja__Group__5 )
            // InternalGramatica.g:985:2: rule__Compleja__Group__4__Impl rule__Compleja__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Compleja__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__4"


    // $ANTLR start "rule__Compleja__Group__4__Impl"
    // InternalGramatica.g:992:1: rule__Compleja__Group__4__Impl : ( ( rule__Compleja__ContextoAssignment_4 ) ) ;
    public final void rule__Compleja__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:996:1: ( ( ( rule__Compleja__ContextoAssignment_4 ) ) )
            // InternalGramatica.g:997:1: ( ( rule__Compleja__ContextoAssignment_4 ) )
            {
            // InternalGramatica.g:997:1: ( ( rule__Compleja__ContextoAssignment_4 ) )
            // InternalGramatica.g:998:2: ( rule__Compleja__ContextoAssignment_4 )
            {
             before(grammarAccess.getComplejaAccess().getContextoAssignment_4()); 
            // InternalGramatica.g:999:2: ( rule__Compleja__ContextoAssignment_4 )
            // InternalGramatica.g:999:3: rule__Compleja__ContextoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__ContextoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getContextoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__4__Impl"


    // $ANTLR start "rule__Compleja__Group__5"
    // InternalGramatica.g:1007:1: rule__Compleja__Group__5 : rule__Compleja__Group__5__Impl rule__Compleja__Group__6 ;
    public final void rule__Compleja__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1011:1: ( rule__Compleja__Group__5__Impl rule__Compleja__Group__6 )
            // InternalGramatica.g:1012:2: rule__Compleja__Group__5__Impl rule__Compleja__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Compleja__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__5"


    // $ANTLR start "rule__Compleja__Group__5__Impl"
    // InternalGramatica.g:1019:1: rule__Compleja__Group__5__Impl : ( 'tal que' ) ;
    public final void rule__Compleja__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1023:1: ( ( 'tal que' ) )
            // InternalGramatica.g:1024:1: ( 'tal que' )
            {
            // InternalGramatica.g:1024:1: ( 'tal que' )
            // InternalGramatica.g:1025:2: 'tal que'
            {
             before(grammarAccess.getComplejaAccess().getTalQueKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getTalQueKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__5__Impl"


    // $ANTLR start "rule__Compleja__Group__6"
    // InternalGramatica.g:1034:1: rule__Compleja__Group__6 : rule__Compleja__Group__6__Impl rule__Compleja__Group__7 ;
    public final void rule__Compleja__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1038:1: ( rule__Compleja__Group__6__Impl rule__Compleja__Group__7 )
            // InternalGramatica.g:1039:2: rule__Compleja__Group__6__Impl rule__Compleja__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Compleja__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__6"


    // $ANTLR start "rule__Compleja__Group__6__Impl"
    // InternalGramatica.g:1046:1: rule__Compleja__Group__6__Impl : ( '(' ) ;
    public final void rule__Compleja__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1050:1: ( ( '(' ) )
            // InternalGramatica.g:1051:1: ( '(' )
            {
            // InternalGramatica.g:1051:1: ( '(' )
            // InternalGramatica.g:1052:2: '('
            {
             before(grammarAccess.getComplejaAccess().getLeftParenthesisKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__6__Impl"


    // $ANTLR start "rule__Compleja__Group__7"
    // InternalGramatica.g:1061:1: rule__Compleja__Group__7 : rule__Compleja__Group__7__Impl rule__Compleja__Group__8 ;
    public final void rule__Compleja__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1065:1: ( rule__Compleja__Group__7__Impl rule__Compleja__Group__8 )
            // InternalGramatica.g:1066:2: rule__Compleja__Group__7__Impl rule__Compleja__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Compleja__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__7"


    // $ANTLR start "rule__Compleja__Group__7__Impl"
    // InternalGramatica.g:1073:1: rule__Compleja__Group__7__Impl : ( ( rule__Compleja__Alternatives_7 ) ) ;
    public final void rule__Compleja__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1077:1: ( ( ( rule__Compleja__Alternatives_7 ) ) )
            // InternalGramatica.g:1078:1: ( ( rule__Compleja__Alternatives_7 ) )
            {
            // InternalGramatica.g:1078:1: ( ( rule__Compleja__Alternatives_7 ) )
            // InternalGramatica.g:1079:2: ( rule__Compleja__Alternatives_7 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_7()); 
            // InternalGramatica.g:1080:2: ( rule__Compleja__Alternatives_7 )
            // InternalGramatica.g:1080:3: rule__Compleja__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__7__Impl"


    // $ANTLR start "rule__Compleja__Group__8"
    // InternalGramatica.g:1088:1: rule__Compleja__Group__8 : rule__Compleja__Group__8__Impl rule__Compleja__Group__9 ;
    public final void rule__Compleja__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1092:1: ( rule__Compleja__Group__8__Impl rule__Compleja__Group__9 )
            // InternalGramatica.g:1093:2: rule__Compleja__Group__8__Impl rule__Compleja__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Compleja__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__8"


    // $ANTLR start "rule__Compleja__Group__8__Impl"
    // InternalGramatica.g:1100:1: rule__Compleja__Group__8__Impl : ( 'Los/Las' ) ;
    public final void rule__Compleja__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1104:1: ( ( 'Los/Las' ) )
            // InternalGramatica.g:1105:1: ( 'Los/Las' )
            {
            // InternalGramatica.g:1105:1: ( 'Los/Las' )
            // InternalGramatica.g:1106:2: 'Los/Las'
            {
             before(grammarAccess.getComplejaAccess().getLosLasKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getLosLasKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__8__Impl"


    // $ANTLR start "rule__Compleja__Group__9"
    // InternalGramatica.g:1115:1: rule__Compleja__Group__9 : rule__Compleja__Group__9__Impl rule__Compleja__Group__10 ;
    public final void rule__Compleja__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1119:1: ( rule__Compleja__Group__9__Impl rule__Compleja__Group__10 )
            // InternalGramatica.g:1120:2: rule__Compleja__Group__9__Impl rule__Compleja__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Compleja__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__9"


    // $ANTLR start "rule__Compleja__Group__9__Impl"
    // InternalGramatica.g:1127:1: rule__Compleja__Group__9__Impl : ( ( rule__Compleja__AtributoAssignment_9 ) ) ;
    public final void rule__Compleja__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1131:1: ( ( ( rule__Compleja__AtributoAssignment_9 ) ) )
            // InternalGramatica.g:1132:1: ( ( rule__Compleja__AtributoAssignment_9 ) )
            {
            // InternalGramatica.g:1132:1: ( ( rule__Compleja__AtributoAssignment_9 ) )
            // InternalGramatica.g:1133:2: ( rule__Compleja__AtributoAssignment_9 )
            {
             before(grammarAccess.getComplejaAccess().getAtributoAssignment_9()); 
            // InternalGramatica.g:1134:2: ( rule__Compleja__AtributoAssignment_9 )
            // InternalGramatica.g:1134:3: rule__Compleja__AtributoAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__AtributoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAtributoAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__9__Impl"


    // $ANTLR start "rule__Compleja__Group__10"
    // InternalGramatica.g:1142:1: rule__Compleja__Group__10 : rule__Compleja__Group__10__Impl rule__Compleja__Group__11 ;
    public final void rule__Compleja__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1146:1: ( rule__Compleja__Group__10__Impl rule__Compleja__Group__11 )
            // InternalGramatica.g:1147:2: rule__Compleja__Group__10__Impl rule__Compleja__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Compleja__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__10"


    // $ANTLR start "rule__Compleja__Group__10__Impl"
    // InternalGramatica.g:1154:1: rule__Compleja__Group__10__Impl : ( 'donde' ) ;
    public final void rule__Compleja__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1158:1: ( ( 'donde' ) )
            // InternalGramatica.g:1159:1: ( 'donde' )
            {
            // InternalGramatica.g:1159:1: ( 'donde' )
            // InternalGramatica.g:1160:2: 'donde'
            {
             before(grammarAccess.getComplejaAccess().getDondeKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getDondeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__10__Impl"


    // $ANTLR start "rule__Compleja__Group__11"
    // InternalGramatica.g:1169:1: rule__Compleja__Group__11 : rule__Compleja__Group__11__Impl rule__Compleja__Group__12 ;
    public final void rule__Compleja__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1173:1: ( rule__Compleja__Group__11__Impl rule__Compleja__Group__12 )
            // InternalGramatica.g:1174:2: rule__Compleja__Group__11__Impl rule__Compleja__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Compleja__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__11"


    // $ANTLR start "rule__Compleja__Group__11__Impl"
    // InternalGramatica.g:1181:1: rule__Compleja__Group__11__Impl : ( ( rule__Compleja__AtributoAssignment_11 ) ) ;
    public final void rule__Compleja__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1185:1: ( ( ( rule__Compleja__AtributoAssignment_11 ) ) )
            // InternalGramatica.g:1186:1: ( ( rule__Compleja__AtributoAssignment_11 ) )
            {
            // InternalGramatica.g:1186:1: ( ( rule__Compleja__AtributoAssignment_11 ) )
            // InternalGramatica.g:1187:2: ( rule__Compleja__AtributoAssignment_11 )
            {
             before(grammarAccess.getComplejaAccess().getAtributoAssignment_11()); 
            // InternalGramatica.g:1188:2: ( rule__Compleja__AtributoAssignment_11 )
            // InternalGramatica.g:1188:3: rule__Compleja__AtributoAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__AtributoAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAtributoAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__11__Impl"


    // $ANTLR start "rule__Compleja__Group__12"
    // InternalGramatica.g:1196:1: rule__Compleja__Group__12 : rule__Compleja__Group__12__Impl rule__Compleja__Group__13 ;
    public final void rule__Compleja__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1200:1: ( rule__Compleja__Group__12__Impl rule__Compleja__Group__13 )
            // InternalGramatica.g:1201:2: rule__Compleja__Group__12__Impl rule__Compleja__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Compleja__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__12"


    // $ANTLR start "rule__Compleja__Group__12__Impl"
    // InternalGramatica.g:1208:1: rule__Compleja__Group__12__Impl : ( ( rule__Compleja__Alternatives_12 ) ) ;
    public final void rule__Compleja__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1212:1: ( ( ( rule__Compleja__Alternatives_12 ) ) )
            // InternalGramatica.g:1213:1: ( ( rule__Compleja__Alternatives_12 ) )
            {
            // InternalGramatica.g:1213:1: ( ( rule__Compleja__Alternatives_12 ) )
            // InternalGramatica.g:1214:2: ( rule__Compleja__Alternatives_12 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_12()); 
            // InternalGramatica.g:1215:2: ( rule__Compleja__Alternatives_12 )
            // InternalGramatica.g:1215:3: rule__Compleja__Alternatives_12
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_12();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__12__Impl"


    // $ANTLR start "rule__Compleja__Group__13"
    // InternalGramatica.g:1223:1: rule__Compleja__Group__13 : rule__Compleja__Group__13__Impl rule__Compleja__Group__14 ;
    public final void rule__Compleja__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1227:1: ( rule__Compleja__Group__13__Impl rule__Compleja__Group__14 )
            // InternalGramatica.g:1228:2: rule__Compleja__Group__13__Impl rule__Compleja__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Compleja__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__13"


    // $ANTLR start "rule__Compleja__Group__13__Impl"
    // InternalGramatica.g:1235:1: rule__Compleja__Group__13__Impl : ( ( rule__Compleja__Alternatives_13 ) ) ;
    public final void rule__Compleja__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1239:1: ( ( ( rule__Compleja__Alternatives_13 ) ) )
            // InternalGramatica.g:1240:1: ( ( rule__Compleja__Alternatives_13 ) )
            {
            // InternalGramatica.g:1240:1: ( ( rule__Compleja__Alternatives_13 ) )
            // InternalGramatica.g:1241:2: ( rule__Compleja__Alternatives_13 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_13()); 
            // InternalGramatica.g:1242:2: ( rule__Compleja__Alternatives_13 )
            // InternalGramatica.g:1242:3: rule__Compleja__Alternatives_13
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__13__Impl"


    // $ANTLR start "rule__Compleja__Group__14"
    // InternalGramatica.g:1250:1: rule__Compleja__Group__14 : rule__Compleja__Group__14__Impl rule__Compleja__Group__15 ;
    public final void rule__Compleja__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1254:1: ( rule__Compleja__Group__14__Impl rule__Compleja__Group__15 )
            // InternalGramatica.g:1255:2: rule__Compleja__Group__14__Impl rule__Compleja__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Compleja__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__14"


    // $ANTLR start "rule__Compleja__Group__14__Impl"
    // InternalGramatica.g:1262:1: rule__Compleja__Group__14__Impl : ( ')' ) ;
    public final void rule__Compleja__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1266:1: ( ( ')' ) )
            // InternalGramatica.g:1267:1: ( ')' )
            {
            // InternalGramatica.g:1267:1: ( ')' )
            // InternalGramatica.g:1268:2: ')'
            {
             before(grammarAccess.getComplejaAccess().getRightParenthesisKeyword_14()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getRightParenthesisKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__14__Impl"


    // $ANTLR start "rule__Compleja__Group__15"
    // InternalGramatica.g:1277:1: rule__Compleja__Group__15 : rule__Compleja__Group__15__Impl rule__Compleja__Group__16 ;
    public final void rule__Compleja__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1281:1: ( rule__Compleja__Group__15__Impl rule__Compleja__Group__16 )
            // InternalGramatica.g:1282:2: rule__Compleja__Group__15__Impl rule__Compleja__Group__16
            {
            pushFollow(FOLLOW_20);
            rule__Compleja__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__15"


    // $ANTLR start "rule__Compleja__Group__15__Impl"
    // InternalGramatica.g:1289:1: rule__Compleja__Group__15__Impl : ( 'tal que' ) ;
    public final void rule__Compleja__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1293:1: ( ( 'tal que' ) )
            // InternalGramatica.g:1294:1: ( 'tal que' )
            {
            // InternalGramatica.g:1294:1: ( 'tal que' )
            // InternalGramatica.g:1295:2: 'tal que'
            {
             before(grammarAccess.getComplejaAccess().getTalQueKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getTalQueKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__15__Impl"


    // $ANTLR start "rule__Compleja__Group__16"
    // InternalGramatica.g:1304:1: rule__Compleja__Group__16 : rule__Compleja__Group__16__Impl rule__Compleja__Group__17 ;
    public final void rule__Compleja__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1308:1: ( rule__Compleja__Group__16__Impl rule__Compleja__Group__17 )
            // InternalGramatica.g:1309:2: rule__Compleja__Group__16__Impl rule__Compleja__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__Compleja__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__16"


    // $ANTLR start "rule__Compleja__Group__16__Impl"
    // InternalGramatica.g:1316:1: rule__Compleja__Group__16__Impl : ( ( rule__Compleja__Alternatives_16 ) ) ;
    public final void rule__Compleja__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1320:1: ( ( ( rule__Compleja__Alternatives_16 ) ) )
            // InternalGramatica.g:1321:1: ( ( rule__Compleja__Alternatives_16 ) )
            {
            // InternalGramatica.g:1321:1: ( ( rule__Compleja__Alternatives_16 ) )
            // InternalGramatica.g:1322:2: ( rule__Compleja__Alternatives_16 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_16()); 
            // InternalGramatica.g:1323:2: ( rule__Compleja__Alternatives_16 )
            // InternalGramatica.g:1323:3: rule__Compleja__Alternatives_16
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_16();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__16__Impl"


    // $ANTLR start "rule__Compleja__Group__17"
    // InternalGramatica.g:1331:1: rule__Compleja__Group__17 : rule__Compleja__Group__17__Impl rule__Compleja__Group__18 ;
    public final void rule__Compleja__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1335:1: ( rule__Compleja__Group__17__Impl rule__Compleja__Group__18 )
            // InternalGramatica.g:1336:2: rule__Compleja__Group__17__Impl rule__Compleja__Group__18
            {
            pushFollow(FOLLOW_21);
            rule__Compleja__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__17"


    // $ANTLR start "rule__Compleja__Group__17__Impl"
    // InternalGramatica.g:1343:1: rule__Compleja__Group__17__Impl : ( ( rule__Compleja__Group_17__0 )? ) ;
    public final void rule__Compleja__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1347:1: ( ( ( rule__Compleja__Group_17__0 )? ) )
            // InternalGramatica.g:1348:1: ( ( rule__Compleja__Group_17__0 )? )
            {
            // InternalGramatica.g:1348:1: ( ( rule__Compleja__Group_17__0 )? )
            // InternalGramatica.g:1349:2: ( rule__Compleja__Group_17__0 )?
            {
             before(grammarAccess.getComplejaAccess().getGroup_17()); 
            // InternalGramatica.g:1350:2: ( rule__Compleja__Group_17__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=15 && LA16_0<=21)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGramatica.g:1350:3: rule__Compleja__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__17__Impl"


    // $ANTLR start "rule__Compleja__Group__18"
    // InternalGramatica.g:1358:1: rule__Compleja__Group__18 : rule__Compleja__Group__18__Impl ;
    public final void rule__Compleja__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1362:1: ( rule__Compleja__Group__18__Impl )
            // InternalGramatica.g:1363:2: rule__Compleja__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__18"


    // $ANTLR start "rule__Compleja__Group__18__Impl"
    // InternalGramatica.g:1369:1: rule__Compleja__Group__18__Impl : ( '.' ) ;
    public final void rule__Compleja__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1373:1: ( ( '.' ) )
            // InternalGramatica.g:1374:1: ( '.' )
            {
            // InternalGramatica.g:1374:1: ( '.' )
            // InternalGramatica.g:1375:2: '.'
            {
             before(grammarAccess.getComplejaAccess().getFullStopKeyword_18()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComplejaAccess().getFullStopKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group__18__Impl"


    // $ANTLR start "rule__Compleja__Group_17__0"
    // InternalGramatica.g:1385:1: rule__Compleja__Group_17__0 : rule__Compleja__Group_17__0__Impl rule__Compleja__Group_17__1 ;
    public final void rule__Compleja__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1389:1: ( rule__Compleja__Group_17__0__Impl rule__Compleja__Group_17__1 )
            // InternalGramatica.g:1390:2: rule__Compleja__Group_17__0__Impl rule__Compleja__Group_17__1
            {
            pushFollow(FOLLOW_18);
            rule__Compleja__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group_17__0"


    // $ANTLR start "rule__Compleja__Group_17__0__Impl"
    // InternalGramatica.g:1397:1: rule__Compleja__Group_17__0__Impl : ( ( rule__Compleja__Alternatives_17_0 ) ) ;
    public final void rule__Compleja__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1401:1: ( ( ( rule__Compleja__Alternatives_17_0 ) ) )
            // InternalGramatica.g:1402:1: ( ( rule__Compleja__Alternatives_17_0 ) )
            {
            // InternalGramatica.g:1402:1: ( ( rule__Compleja__Alternatives_17_0 ) )
            // InternalGramatica.g:1403:2: ( rule__Compleja__Alternatives_17_0 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_17_0()); 
            // InternalGramatica.g:1404:2: ( rule__Compleja__Alternatives_17_0 )
            // InternalGramatica.g:1404:3: rule__Compleja__Alternatives_17_0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_17_0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group_17__0__Impl"


    // $ANTLR start "rule__Compleja__Group_17__1"
    // InternalGramatica.g:1412:1: rule__Compleja__Group_17__1 : rule__Compleja__Group_17__1__Impl ;
    public final void rule__Compleja__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1416:1: ( rule__Compleja__Group_17__1__Impl )
            // InternalGramatica.g:1417:2: rule__Compleja__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group_17__1"


    // $ANTLR start "rule__Compleja__Group_17__1__Impl"
    // InternalGramatica.g:1423:1: rule__Compleja__Group_17__1__Impl : ( ( rule__Compleja__Alternatives_17_1 ) ) ;
    public final void rule__Compleja__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1427:1: ( ( ( rule__Compleja__Alternatives_17_1 ) ) )
            // InternalGramatica.g:1428:1: ( ( rule__Compleja__Alternatives_17_1 ) )
            {
            // InternalGramatica.g:1428:1: ( ( rule__Compleja__Alternatives_17_1 ) )
            // InternalGramatica.g:1429:2: ( rule__Compleja__Alternatives_17_1 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_17_1()); 
            // InternalGramatica.g:1430:2: ( rule__Compleja__Alternatives_17_1 )
            // InternalGramatica.g:1430:3: rule__Compleja__Alternatives_17_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_17_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__Group_17__1__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalGramatica.g:1439:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1443:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalGramatica.g:1444:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalGramatica.g:1451:1: rule__Atributo__Group__0__Impl : ( ( 'Coleccion de' )? ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1455:1: ( ( ( 'Coleccion de' )? ) )
            // InternalGramatica.g:1456:1: ( ( 'Coleccion de' )? )
            {
            // InternalGramatica.g:1456:1: ( ( 'Coleccion de' )? )
            // InternalGramatica.g:1457:2: ( 'Coleccion de' )?
            {
             before(grammarAccess.getAtributoAccess().getColeccionDeKeyword_0()); 
            // InternalGramatica.g:1458:2: ( 'Coleccion de' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGramatica.g:1458:3: 'Coleccion de'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getColeccionDeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalGramatica.g:1466:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1470:1: ( rule__Atributo__Group__1__Impl )
            // InternalGramatica.g:1471:2: rule__Atributo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalGramatica.g:1477:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1481:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalGramatica.g:1482:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalGramatica.g:1482:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalGramatica.g:1483:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalGramatica.g:1484:2: ( rule__Atributo__NameAssignment_1 )
            // InternalGramatica.g:1484:3: rule__Atributo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Gramatica__OracionesAssignment"
    // InternalGramatica.g:1493:1: rule__Gramatica__OracionesAssignment : ( ruleOracion ) ;
    public final void rule__Gramatica__OracionesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1497:1: ( ( ruleOracion ) )
            // InternalGramatica.g:1498:2: ( ruleOracion )
            {
            // InternalGramatica.g:1498:2: ( ruleOracion )
            // InternalGramatica.g:1499:3: ruleOracion
            {
             before(grammarAccess.getGramaticaAccess().getOracionesOracionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOracion();

            state._fsp--;

             after(grammarAccess.getGramaticaAccess().getOracionesOracionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gramatica__OracionesAssignment"


    // $ANTLR start "rule__Simple__AtributoAssignment_1"
    // InternalGramatica.g:1508:1: rule__Simple__AtributoAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1512:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1513:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1513:2: ( ruleAtributo )
            // InternalGramatica.g:1514:3: ruleAtributo
            {
             before(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__AtributoAssignment_1"


    // $ANTLR start "rule__Simple__ContextoAssignment_4"
    // InternalGramatica.g:1523:1: rule__Simple__ContextoAssignment_4 : ( ruleClase ) ;
    public final void rule__Simple__ContextoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1527:1: ( ( ruleClase ) )
            // InternalGramatica.g:1528:2: ( ruleClase )
            {
            // InternalGramatica.g:1528:2: ( ruleClase )
            // InternalGramatica.g:1529:3: ruleClase
            {
             before(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__ContextoAssignment_4"


    // $ANTLR start "rule__Simple__LiteralAssignment_9_0"
    // InternalGramatica.g:1538:1: rule__Simple__LiteralAssignment_9_0 : ( ruleLiteral ) ;
    public final void rule__Simple__LiteralAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1542:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:1543:2: ( ruleLiteral )
            {
            // InternalGramatica.g:1543:2: ( ruleLiteral )
            // InternalGramatica.g:1544:3: ruleLiteral
            {
             before(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__LiteralAssignment_9_0"


    // $ANTLR start "rule__Simple__AtributoAssignment_9_1"
    // InternalGramatica.g:1553:1: rule__Simple__AtributoAssignment_9_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1557:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1558:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1558:2: ( ruleAtributo )
            // InternalGramatica.g:1559:3: ruleAtributo
            {
             before(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__AtributoAssignment_9_1"


    // $ANTLR start "rule__Compleja__AtributoAssignment_1"
    // InternalGramatica.g:1568:1: rule__Compleja__AtributoAssignment_1 : ( ruleClase ) ;
    public final void rule__Compleja__AtributoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1572:1: ( ( ruleClase ) )
            // InternalGramatica.g:1573:2: ( ruleClase )
            {
            // InternalGramatica.g:1573:2: ( ruleClase )
            // InternalGramatica.g:1574:3: ruleClase
            {
             before(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__AtributoAssignment_1"


    // $ANTLR start "rule__Compleja__ContextoAssignment_4"
    // InternalGramatica.g:1583:1: rule__Compleja__ContextoAssignment_4 : ( ruleClase ) ;
    public final void rule__Compleja__ContextoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1587:1: ( ( ruleClase ) )
            // InternalGramatica.g:1588:2: ( ruleClase )
            {
            // InternalGramatica.g:1588:2: ( ruleClase )
            // InternalGramatica.g:1589:3: ruleClase
            {
             before(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__ContextoAssignment_4"


    // $ANTLR start "rule__Compleja__AtributoAssignment_9"
    // InternalGramatica.g:1598:1: rule__Compleja__AtributoAssignment_9 : ( ruleClase ) ;
    public final void rule__Compleja__AtributoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1602:1: ( ( ruleClase ) )
            // InternalGramatica.g:1603:2: ( ruleClase )
            {
            // InternalGramatica.g:1603:2: ( ruleClase )
            // InternalGramatica.g:1604:3: ruleClase
            {
             before(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtributoClaseParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__AtributoAssignment_9"


    // $ANTLR start "rule__Compleja__AtributoAssignment_11"
    // InternalGramatica.g:1613:1: rule__Compleja__AtributoAssignment_11 : ( ruleAtributo ) ;
    public final void rule__Compleja__AtributoAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1617:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1618:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1618:2: ( ruleAtributo )
            // InternalGramatica.g:1619:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__AtributoAssignment_11"


    // $ANTLR start "rule__Compleja__LiteralAssignment_13_0"
    // InternalGramatica.g:1628:1: rule__Compleja__LiteralAssignment_13_0 : ( ruleLiteral ) ;
    public final void rule__Compleja__LiteralAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1632:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:1633:2: ( ruleLiteral )
            {
            // InternalGramatica.g:1633:2: ( ruleLiteral )
            // InternalGramatica.g:1634:3: ruleLiteral
            {
             before(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__LiteralAssignment_13_0"


    // $ANTLR start "rule__Compleja__AtributoAssignment_13_1"
    // InternalGramatica.g:1643:1: rule__Compleja__AtributoAssignment_13_1 : ( ruleAtributo ) ;
    public final void rule__Compleja__AtributoAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1647:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1648:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1648:2: ( ruleAtributo )
            // InternalGramatica.g:1649:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__AtributoAssignment_13_1"


    // $ANTLR start "rule__Compleja__LiteralAssignment_17_1_0"
    // InternalGramatica.g:1658:1: rule__Compleja__LiteralAssignment_17_1_0 : ( ruleLiteral ) ;
    public final void rule__Compleja__LiteralAssignment_17_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1662:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:1663:2: ( ruleLiteral )
            {
            // InternalGramatica.g:1663:2: ( ruleLiteral )
            // InternalGramatica.g:1664:3: ruleLiteral
            {
             before(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_17_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getLiteralLiteralParserRuleCall_17_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__LiteralAssignment_17_1_0"


    // $ANTLR start "rule__Compleja__AtributoAssignment_17_1_1"
    // InternalGramatica.g:1673:1: rule__Compleja__AtributoAssignment_17_1_1 : ( ruleAtributo ) ;
    public final void rule__Compleja__AtributoAssignment_17_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1677:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1678:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1678:2: ( ruleAtributo )
            // InternalGramatica.g:1679:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_17_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtributoAtributoParserRuleCall_17_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compleja__AtributoAssignment_17_1_1"


    // $ANTLR start "rule__Atributo__NameAssignment_1"
    // InternalGramatica.g:1688:1: rule__Atributo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1692:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1693:2: ( RULE_ID )
            {
            // InternalGramatica.g:1693:2: ( RULE_ID )
            // InternalGramatica.g:1694:3: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NameAssignment_1"


    // $ANTLR start "rule__Clase__NameAssignment"
    // InternalGramatica.g:1703:1: rule__Clase__NameAssignment : ( RULE_ID ) ;
    public final void rule__Clase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1707:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1708:2: ( RULE_ID )
            {
            // InternalGramatica.g:1708:2: ( RULE_ID )
            // InternalGramatica.g:1709:3: RULE_ID
            {
             before(grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clase__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000020003F8070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000803F8000L});

}