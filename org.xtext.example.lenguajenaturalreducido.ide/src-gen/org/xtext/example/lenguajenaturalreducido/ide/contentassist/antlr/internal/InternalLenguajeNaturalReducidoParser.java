package org.xtext.example.lenguajenaturalreducido.ide.contentassist.antlr.internal;

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
import org.xtext.example.lenguajenaturalreducido.services.LenguajeNaturalReducidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLenguajeNaturalReducidoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'El/La'", "'de'", "'un/una'", "'debe ser'", "'y'", "'o'", "'entonces'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(LenguajeNaturalReducidoGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDocumento"
    // InternalLenguajeNaturalReducido.g:53:1: entryRuleDocumento : ruleDocumento EOF ;
    public final void entryRuleDocumento() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:54:1: ( ruleDocumento EOF )
            // InternalLenguajeNaturalReducido.g:55:1: ruleDocumento EOF
            {
             before(grammarAccess.getDocumentoRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumento();

            state._fsp--;

             after(grammarAccess.getDocumentoRule()); 
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
    // $ANTLR end "entryRuleDocumento"


    // $ANTLR start "ruleDocumento"
    // InternalLenguajeNaturalReducido.g:62:1: ruleDocumento : ( ( rule__Documento__OracionesAssignment )* ) ;
    public final void ruleDocumento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:66:2: ( ( ( rule__Documento__OracionesAssignment )* ) )
            // InternalLenguajeNaturalReducido.g:67:2: ( ( rule__Documento__OracionesAssignment )* )
            {
            // InternalLenguajeNaturalReducido.g:67:2: ( ( rule__Documento__OracionesAssignment )* )
            // InternalLenguajeNaturalReducido.g:68:3: ( rule__Documento__OracionesAssignment )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment()); 
            // InternalLenguajeNaturalReducido.g:69:3: ( rule__Documento__OracionesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:69:4: rule__Documento__OracionesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Documento__OracionesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDocumentoAccess().getOracionesAssignment()); 

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
    // $ANTLR end "ruleDocumento"


    // $ANTLR start "entryRuleOracion"
    // InternalLenguajeNaturalReducido.g:78:1: entryRuleOracion : ruleOracion EOF ;
    public final void entryRuleOracion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:79:1: ( ruleOracion EOF )
            // InternalLenguajeNaturalReducido.g:80:1: ruleOracion EOF
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
    // InternalLenguajeNaturalReducido.g:87:1: ruleOracion : ( ( rule__Oracion__Group__0 ) ) ;
    public final void ruleOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:91:2: ( ( ( rule__Oracion__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:92:2: ( ( rule__Oracion__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:92:2: ( ( rule__Oracion__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:93:3: ( rule__Oracion__Group__0 )
            {
             before(grammarAccess.getOracionAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:94:3: ( rule__Oracion__Group__0 )
            // InternalLenguajeNaturalReducido.g:94:4: rule__Oracion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOracionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleFinOracion"
    // InternalLenguajeNaturalReducido.g:103:1: entryRuleFinOracion : ruleFinOracion EOF ;
    public final void entryRuleFinOracion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:104:1: ( ruleFinOracion EOF )
            // InternalLenguajeNaturalReducido.g:105:1: ruleFinOracion EOF
            {
             before(grammarAccess.getFinOracionRule()); 
            pushFollow(FOLLOW_1);
            ruleFinOracion();

            state._fsp--;

             after(grammarAccess.getFinOracionRule()); 
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
    // $ANTLR end "entryRuleFinOracion"


    // $ANTLR start "ruleFinOracion"
    // InternalLenguajeNaturalReducido.g:112:1: ruleFinOracion : ( '.\\r\\n' ) ;
    public final void ruleFinOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:116:2: ( ( '.\\r\\n' ) )
            // InternalLenguajeNaturalReducido.g:117:2: ( '.\\r\\n' )
            {
            // InternalLenguajeNaturalReducido.g:117:2: ( '.\\r\\n' )
            // InternalLenguajeNaturalReducido.g:118:3: '.\\r\\n'
            {
             before(grammarAccess.getFinOracionAccess().getFullStopControl000dControl000aKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFinOracionAccess().getFullStopControl000dControl000aKeyword()); 

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
    // $ANTLR end "ruleFinOracion"


    // $ANTLR start "entryRuleCompuesta"
    // InternalLenguajeNaturalReducido.g:128:1: entryRuleCompuesta : ruleCompuesta EOF ;
    public final void entryRuleCompuesta() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:129:1: ( ruleCompuesta EOF )
            // InternalLenguajeNaturalReducido.g:130:1: ruleCompuesta EOF
            {
             before(grammarAccess.getCompuestaRule()); 
            pushFollow(FOLLOW_1);
            ruleCompuesta();

            state._fsp--;

             after(grammarAccess.getCompuestaRule()); 
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
    // $ANTLR end "entryRuleCompuesta"


    // $ANTLR start "ruleCompuesta"
    // InternalLenguajeNaturalReducido.g:137:1: ruleCompuesta : ( ( rule__Compuesta__Group__0 ) ) ;
    public final void ruleCompuesta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:141:2: ( ( ( rule__Compuesta__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:142:2: ( ( rule__Compuesta__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:142:2: ( ( rule__Compuesta__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:143:3: ( rule__Compuesta__Group__0 )
            {
             before(grammarAccess.getCompuestaAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:144:3: ( rule__Compuesta__Group__0 )
            // InternalLenguajeNaturalReducido.g:144:4: rule__Compuesta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getGroup()); 

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
    // $ANTLR end "ruleCompuesta"


    // $ANTLR start "entryRuleNexo"
    // InternalLenguajeNaturalReducido.g:153:1: entryRuleNexo : ruleNexo EOF ;
    public final void entryRuleNexo() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:154:1: ( ruleNexo EOF )
            // InternalLenguajeNaturalReducido.g:155:1: ruleNexo EOF
            {
             before(grammarAccess.getNexoRule()); 
            pushFollow(FOLLOW_1);
            ruleNexo();

            state._fsp--;

             after(grammarAccess.getNexoRule()); 
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
    // $ANTLR end "entryRuleNexo"


    // $ANTLR start "ruleNexo"
    // InternalLenguajeNaturalReducido.g:162:1: ruleNexo : ( ( rule__Nexo__Alternatives ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:166:2: ( ( ( rule__Nexo__Alternatives ) ) )
            // InternalLenguajeNaturalReducido.g:167:2: ( ( rule__Nexo__Alternatives ) )
            {
            // InternalLenguajeNaturalReducido.g:167:2: ( ( rule__Nexo__Alternatives ) )
            // InternalLenguajeNaturalReducido.g:168:3: ( rule__Nexo__Alternatives )
            {
             before(grammarAccess.getNexoAccess().getAlternatives()); 
            // InternalLenguajeNaturalReducido.g:169:3: ( rule__Nexo__Alternatives )
            // InternalLenguajeNaturalReducido.g:169:4: rule__Nexo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNexo"


    // $ANTLR start "entryRuleSimple"
    // InternalLenguajeNaturalReducido.g:178:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:179:1: ( ruleSimple EOF )
            // InternalLenguajeNaturalReducido.g:180:1: ruleSimple EOF
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
    // InternalLenguajeNaturalReducido.g:187:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:191:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:192:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:192:2: ( ( rule__Simple__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:193:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:194:3: ( rule__Simple__Group__0 )
            // InternalLenguajeNaturalReducido.g:194:4: rule__Simple__Group__0
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


    // $ANTLR start "entryRuleDeterminante"
    // InternalLenguajeNaturalReducido.g:203:1: entryRuleDeterminante : ruleDeterminante EOF ;
    public final void entryRuleDeterminante() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:204:1: ( ruleDeterminante EOF )
            // InternalLenguajeNaturalReducido.g:205:1: ruleDeterminante EOF
            {
             before(grammarAccess.getDeterminanteRule()); 
            pushFollow(FOLLOW_1);
            ruleDeterminante();

            state._fsp--;

             after(grammarAccess.getDeterminanteRule()); 
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
    // $ANTLR end "entryRuleDeterminante"


    // $ANTLR start "ruleDeterminante"
    // InternalLenguajeNaturalReducido.g:212:1: ruleDeterminante : ( 'El/La' ) ;
    public final void ruleDeterminante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:216:2: ( ( 'El/La' ) )
            // InternalLenguajeNaturalReducido.g:217:2: ( 'El/La' )
            {
            // InternalLenguajeNaturalReducido.g:217:2: ( 'El/La' )
            // InternalLenguajeNaturalReducido.g:218:3: 'El/La'
            {
             before(grammarAccess.getDeterminanteAccess().getElLaKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeterminanteAccess().getElLaKeyword()); 

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
    // $ANTLR end "ruleDeterminante"


    // $ANTLR start "entryRuleSintagmaPreposicional"
    // InternalLenguajeNaturalReducido.g:228:1: entryRuleSintagmaPreposicional : ruleSintagmaPreposicional EOF ;
    public final void entryRuleSintagmaPreposicional() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:229:1: ( ruleSintagmaPreposicional EOF )
            // InternalLenguajeNaturalReducido.g:230:1: ruleSintagmaPreposicional EOF
            {
             before(grammarAccess.getSintagmaPreposicionalRule()); 
            pushFollow(FOLLOW_1);
            ruleSintagmaPreposicional();

            state._fsp--;

             after(grammarAccess.getSintagmaPreposicionalRule()); 
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
    // $ANTLR end "entryRuleSintagmaPreposicional"


    // $ANTLR start "ruleSintagmaPreposicional"
    // InternalLenguajeNaturalReducido.g:237:1: ruleSintagmaPreposicional : ( ( rule__SintagmaPreposicional__Group__0 ) ) ;
    public final void ruleSintagmaPreposicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:241:2: ( ( ( rule__SintagmaPreposicional__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:242:2: ( ( rule__SintagmaPreposicional__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:242:2: ( ( rule__SintagmaPreposicional__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:243:3: ( rule__SintagmaPreposicional__Group__0 )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:244:3: ( rule__SintagmaPreposicional__Group__0 )
            // InternalLenguajeNaturalReducido.g:244:4: rule__SintagmaPreposicional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SintagmaPreposicional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSintagmaPreposicionalAccess().getGroup()); 

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
    // $ANTLR end "ruleSintagmaPreposicional"


    // $ANTLR start "entryRuleEnlace"
    // InternalLenguajeNaturalReducido.g:253:1: entryRuleEnlace : ruleEnlace EOF ;
    public final void entryRuleEnlace() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:254:1: ( ruleEnlace EOF )
            // InternalLenguajeNaturalReducido.g:255:1: ruleEnlace EOF
            {
             before(grammarAccess.getEnlaceRule()); 
            pushFollow(FOLLOW_1);
            ruleEnlace();

            state._fsp--;

             after(grammarAccess.getEnlaceRule()); 
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
    // $ANTLR end "entryRuleEnlace"


    // $ANTLR start "ruleEnlace"
    // InternalLenguajeNaturalReducido.g:262:1: ruleEnlace : ( 'de' ) ;
    public final void ruleEnlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:266:2: ( ( 'de' ) )
            // InternalLenguajeNaturalReducido.g:267:2: ( 'de' )
            {
            // InternalLenguajeNaturalReducido.g:267:2: ( 'de' )
            // InternalLenguajeNaturalReducido.g:268:3: 'de'
            {
             before(grammarAccess.getEnlaceAccess().getDeKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnlaceAccess().getDeKeyword()); 

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
    // $ANTLR end "ruleEnlace"


    // $ANTLR start "entryRuleTermino"
    // InternalLenguajeNaturalReducido.g:278:1: entryRuleTermino : ruleTermino EOF ;
    public final void entryRuleTermino() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:279:1: ( ruleTermino EOF )
            // InternalLenguajeNaturalReducido.g:280:1: ruleTermino EOF
            {
             before(grammarAccess.getTerminoRule()); 
            pushFollow(FOLLOW_1);
            ruleTermino();

            state._fsp--;

             after(grammarAccess.getTerminoRule()); 
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
    // $ANTLR end "entryRuleTermino"


    // $ANTLR start "ruleTermino"
    // InternalLenguajeNaturalReducido.g:287:1: ruleTermino : ( ( rule__Termino__Group__0 ) ) ;
    public final void ruleTermino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:291:2: ( ( ( rule__Termino__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:292:2: ( ( rule__Termino__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:292:2: ( ( rule__Termino__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:293:3: ( rule__Termino__Group__0 )
            {
             before(grammarAccess.getTerminoAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:294:3: ( rule__Termino__Group__0 )
            // InternalLenguajeNaturalReducido.g:294:4: rule__Termino__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Termino__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminoAccess().getGroup()); 

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
    // $ANTLR end "ruleTermino"


    // $ANTLR start "entryRuleIndeterminante"
    // InternalLenguajeNaturalReducido.g:303:1: entryRuleIndeterminante : ruleIndeterminante EOF ;
    public final void entryRuleIndeterminante() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:304:1: ( ruleIndeterminante EOF )
            // InternalLenguajeNaturalReducido.g:305:1: ruleIndeterminante EOF
            {
             before(grammarAccess.getIndeterminanteRule()); 
            pushFollow(FOLLOW_1);
            ruleIndeterminante();

            state._fsp--;

             after(grammarAccess.getIndeterminanteRule()); 
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
    // $ANTLR end "entryRuleIndeterminante"


    // $ANTLR start "ruleIndeterminante"
    // InternalLenguajeNaturalReducido.g:312:1: ruleIndeterminante : ( 'un/una' ) ;
    public final void ruleIndeterminante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:316:2: ( ( 'un/una' ) )
            // InternalLenguajeNaturalReducido.g:317:2: ( 'un/una' )
            {
            // InternalLenguajeNaturalReducido.g:317:2: ( 'un/una' )
            // InternalLenguajeNaturalReducido.g:318:3: 'un/una'
            {
             before(grammarAccess.getIndeterminanteAccess().getUnUnaKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIndeterminanteAccess().getUnUnaKeyword()); 

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
    // $ANTLR end "ruleIndeterminante"


    // $ANTLR start "entryRuleObligacion"
    // InternalLenguajeNaturalReducido.g:328:1: entryRuleObligacion : ruleObligacion EOF ;
    public final void entryRuleObligacion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:329:1: ( ruleObligacion EOF )
            // InternalLenguajeNaturalReducido.g:330:1: ruleObligacion EOF
            {
             before(grammarAccess.getObligacionRule()); 
            pushFollow(FOLLOW_1);
            ruleObligacion();

            state._fsp--;

             after(grammarAccess.getObligacionRule()); 
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
    // $ANTLR end "entryRuleObligacion"


    // $ANTLR start "ruleObligacion"
    // InternalLenguajeNaturalReducido.g:337:1: ruleObligacion : ( 'debe ser' ) ;
    public final void ruleObligacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:341:2: ( ( 'debe ser' ) )
            // InternalLenguajeNaturalReducido.g:342:2: ( 'debe ser' )
            {
            // InternalLenguajeNaturalReducido.g:342:2: ( 'debe ser' )
            // InternalLenguajeNaturalReducido.g:343:3: 'debe ser'
            {
             before(grammarAccess.getObligacionAccess().getDebeSerKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObligacionAccess().getDebeSerKeyword()); 

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
    // $ANTLR end "ruleObligacion"


    // $ANTLR start "entryRuleOperacion"
    // InternalLenguajeNaturalReducido.g:353:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:354:1: ( ruleOperacion EOF )
            // InternalLenguajeNaturalReducido.g:355:1: ruleOperacion EOF
            {
             before(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getOperacionRule()); 
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
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalLenguajeNaturalReducido.g:362:1: ruleOperacion : ( ( rule__Operacion__Alternatives ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:366:2: ( ( ( rule__Operacion__Alternatives ) ) )
            // InternalLenguajeNaturalReducido.g:367:2: ( ( rule__Operacion__Alternatives ) )
            {
            // InternalLenguajeNaturalReducido.g:367:2: ( ( rule__Operacion__Alternatives ) )
            // InternalLenguajeNaturalReducido.g:368:3: ( rule__Operacion__Alternatives )
            {
             before(grammarAccess.getOperacionAccess().getAlternatives()); 
            // InternalLenguajeNaturalReducido.g:369:3: ( rule__Operacion__Alternatives )
            // InternalLenguajeNaturalReducido.g:369:4: rule__Operacion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleLiteral"
    // InternalLenguajeNaturalReducido.g:378:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:379:1: ( ruleLiteral EOF )
            // InternalLenguajeNaturalReducido.g:380:1: ruleLiteral EOF
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
    // InternalLenguajeNaturalReducido.g:387:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:391:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalLenguajeNaturalReducido.g:392:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalLenguajeNaturalReducido.g:392:2: ( ( rule__Literal__Alternatives ) )
            // InternalLenguajeNaturalReducido.g:393:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalLenguajeNaturalReducido.g:394:3: ( rule__Literal__Alternatives )
            // InternalLenguajeNaturalReducido.g:394:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleAtributo"
    // InternalLenguajeNaturalReducido.g:403:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:404:1: ( ruleAtributo EOF )
            // InternalLenguajeNaturalReducido.g:405:1: ruleAtributo EOF
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
    // InternalLenguajeNaturalReducido.g:412:1: ruleAtributo : ( RULE_ID ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:416:2: ( ( RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:417:2: ( RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:417:2: ( RULE_ID )
            // InternalLenguajeNaturalReducido.g:418:3: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getIDTerminalRuleCall()); 

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
    // InternalLenguajeNaturalReducido.g:428:1: entryRuleClase : ruleClase EOF ;
    public final void entryRuleClase() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:429:1: ( ruleClase EOF )
            // InternalLenguajeNaturalReducido.g:430:1: ruleClase EOF
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
    // InternalLenguajeNaturalReducido.g:437:1: ruleClase : ( RULE_ID ) ;
    public final void ruleClase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:441:2: ( ( RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:442:2: ( RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:442:2: ( RULE_ID )
            // InternalLenguajeNaturalReducido.g:443:3: RULE_ID
            {
             before(grammarAccess.getClaseAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClaseAccess().getIDTerminalRuleCall()); 

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


    // $ANTLR start "rule__Oracion__OracionAlternatives_0_0"
    // InternalLenguajeNaturalReducido.g:452:1: rule__Oracion__OracionAlternatives_0_0 : ( ( ruleSimple ) | ( ruleCompuesta ) );
    public final void rule__Oracion__OracionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:456:1: ( ( ruleSimple ) | ( ruleCompuesta ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:457:2: ( ruleSimple )
                    {
                    // InternalLenguajeNaturalReducido.g:457:2: ( ruleSimple )
                    // InternalLenguajeNaturalReducido.g:458:3: ruleSimple
                    {
                     before(grammarAccess.getOracionAccess().getOracionSimpleParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getOracionSimpleParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:463:2: ( ruleCompuesta )
                    {
                    // InternalLenguajeNaturalReducido.g:463:2: ( ruleCompuesta )
                    // InternalLenguajeNaturalReducido.g:464:3: ruleCompuesta
                    {
                     before(grammarAccess.getOracionAccess().getOracionCompuestaParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompuesta();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getOracionCompuestaParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Oracion__OracionAlternatives_0_0"


    // $ANTLR start "rule__Nexo__Alternatives"
    // InternalLenguajeNaturalReducido.g:473:1: rule__Nexo__Alternatives : ( ( 'y' ) | ( 'o' ) | ( 'entonces' ) );
    public final void rule__Nexo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:477:1: ( ( 'y' ) | ( 'o' ) | ( 'entonces' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:478:2: ( 'y' )
                    {
                    // InternalLenguajeNaturalReducido.g:478:2: ( 'y' )
                    // InternalLenguajeNaturalReducido.g:479:3: 'y'
                    {
                     before(grammarAccess.getNexoAccess().getYKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getYKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:484:2: ( 'o' )
                    {
                    // InternalLenguajeNaturalReducido.g:484:2: ( 'o' )
                    // InternalLenguajeNaturalReducido.g:485:3: 'o'
                    {
                     before(grammarAccess.getNexoAccess().getOKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getOKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:490:2: ( 'entonces' )
                    {
                    // InternalLenguajeNaturalReducido.g:490:2: ( 'entonces' )
                    // InternalLenguajeNaturalReducido.g:491:3: 'entonces'
                    {
                     before(grammarAccess.getNexoAccess().getEntoncesKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getEntoncesKeyword_2()); 

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
    // $ANTLR end "rule__Nexo__Alternatives"


    // $ANTLR start "rule__Simple__Alternatives_5"
    // InternalLenguajeNaturalReducido.g:500:1: rule__Simple__Alternatives_5 : ( ( ruleLiteral ) | ( ruleAtributo ) );
    public final void rule__Simple__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:504:1: ( ( ruleLiteral ) | ( ruleAtributo ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:505:2: ( ruleLiteral )
                    {
                    // InternalLenguajeNaturalReducido.g:505:2: ( ruleLiteral )
                    // InternalLenguajeNaturalReducido.g:506:3: ruleLiteral
                    {
                     before(grammarAccess.getSimpleAccess().getLiteralParserRuleCall_5_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getSimpleAccess().getLiteralParserRuleCall_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:511:2: ( ruleAtributo )
                    {
                    // InternalLenguajeNaturalReducido.g:511:2: ( ruleAtributo )
                    // InternalLenguajeNaturalReducido.g:512:3: ruleAtributo
                    {
                     before(grammarAccess.getSimpleAccess().getAtributoParserRuleCall_5_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributo();

                    state._fsp--;

                     after(grammarAccess.getSimpleAccess().getAtributoParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__Simple__Alternatives_5"


    // $ANTLR start "rule__Operacion__Alternatives"
    // InternalLenguajeNaturalReducido.g:521:1: rule__Operacion__Alternatives : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) );
    public final void rule__Operacion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:525:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) )
            int alt5=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:526:2: ( 'mayor que' )
                    {
                    // InternalLenguajeNaturalReducido.g:526:2: ( 'mayor que' )
                    // InternalLenguajeNaturalReducido.g:527:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getMayorQueKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getMayorQueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:532:2: ( 'menor que' )
                    {
                    // InternalLenguajeNaturalReducido.g:532:2: ( 'menor que' )
                    // InternalLenguajeNaturalReducido.g:533:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getMenorQueKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getMenorQueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:538:2: ( 'igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:538:2: ( 'igual a' )
                    // InternalLenguajeNaturalReducido.g:539:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getIgualAKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getIgualAKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:544:2: ( 'mayor o igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:544:2: ( 'mayor o igual a' )
                    // InternalLenguajeNaturalReducido.g:545:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getMayorOIgualAKeyword_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getMayorOIgualAKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajeNaturalReducido.g:550:2: ( 'menor o igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:550:2: ( 'menor o igual a' )
                    // InternalLenguajeNaturalReducido.g:551:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getMenorOIgualAKeyword_4()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getMenorOIgualAKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLenguajeNaturalReducido.g:556:2: ( 'distinto de' )
                    {
                    // InternalLenguajeNaturalReducido.g:556:2: ( 'distinto de' )
                    // InternalLenguajeNaturalReducido.g:557:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getDistintoDeKeyword_5()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDistintoDeKeyword_5()); 

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
    // $ANTLR end "rule__Operacion__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalLenguajeNaturalReducido.g:566:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:570:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:571:2: ( RULE_INT )
                    {
                    // InternalLenguajeNaturalReducido.g:571:2: ( RULE_INT )
                    // InternalLenguajeNaturalReducido.g:572:3: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:577:2: ( RULE_STRING )
                    {
                    // InternalLenguajeNaturalReducido.g:577:2: ( RULE_STRING )
                    // InternalLenguajeNaturalReducido.g:578:3: RULE_STRING
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


    // $ANTLR start "rule__Oracion__Group__0"
    // InternalLenguajeNaturalReducido.g:587:1: rule__Oracion__Group__0 : rule__Oracion__Group__0__Impl rule__Oracion__Group__1 ;
    public final void rule__Oracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:591:1: ( rule__Oracion__Group__0__Impl rule__Oracion__Group__1 )
            // InternalLenguajeNaturalReducido.g:592:2: rule__Oracion__Group__0__Impl rule__Oracion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Oracion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oracion__Group__1();

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
    // $ANTLR end "rule__Oracion__Group__0"


    // $ANTLR start "rule__Oracion__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:599:1: rule__Oracion__Group__0__Impl : ( ( rule__Oracion__OracionAssignment_0 ) ) ;
    public final void rule__Oracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:603:1: ( ( ( rule__Oracion__OracionAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:604:1: ( ( rule__Oracion__OracionAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:604:1: ( ( rule__Oracion__OracionAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:605:2: ( rule__Oracion__OracionAssignment_0 )
            {
             before(grammarAccess.getOracionAccess().getOracionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:606:2: ( rule__Oracion__OracionAssignment_0 )
            // InternalLenguajeNaturalReducido.g:606:3: rule__Oracion__OracionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__OracionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOracionAccess().getOracionAssignment_0()); 

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
    // $ANTLR end "rule__Oracion__Group__0__Impl"


    // $ANTLR start "rule__Oracion__Group__1"
    // InternalLenguajeNaturalReducido.g:614:1: rule__Oracion__Group__1 : rule__Oracion__Group__1__Impl ;
    public final void rule__Oracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:618:1: ( rule__Oracion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:619:2: rule__Oracion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__Group__1__Impl();

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
    // $ANTLR end "rule__Oracion__Group__1"


    // $ANTLR start "rule__Oracion__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:625:1: rule__Oracion__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Oracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:629:1: ( ( ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:630:1: ( ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:630:1: ( ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:631:2: ruleFinOracion
            {
             before(grammarAccess.getOracionAccess().getFinOracionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleFinOracion();

            state._fsp--;

             after(grammarAccess.getOracionAccess().getFinOracionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Oracion__Group__1__Impl"


    // $ANTLR start "rule__Compuesta__Group__0"
    // InternalLenguajeNaturalReducido.g:641:1: rule__Compuesta__Group__0 : rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 ;
    public final void rule__Compuesta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:645:1: ( rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 )
            // InternalLenguajeNaturalReducido.g:646:2: rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Compuesta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesta__Group__1();

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
    // $ANTLR end "rule__Compuesta__Group__0"


    // $ANTLR start "rule__Compuesta__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:653:1: rule__Compuesta__Group__0__Impl : ( ruleSimple ) ;
    public final void rule__Compuesta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:657:1: ( ( ruleSimple ) )
            // InternalLenguajeNaturalReducido.g:658:1: ( ruleSimple )
            {
            // InternalLenguajeNaturalReducido.g:658:1: ( ruleSimple )
            // InternalLenguajeNaturalReducido.g:659:2: ruleSimple
            {
             before(grammarAccess.getCompuestaAccess().getSimpleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getSimpleParserRuleCall_0()); 

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
    // $ANTLR end "rule__Compuesta__Group__0__Impl"


    // $ANTLR start "rule__Compuesta__Group__1"
    // InternalLenguajeNaturalReducido.g:668:1: rule__Compuesta__Group__1 : rule__Compuesta__Group__1__Impl ;
    public final void rule__Compuesta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:672:1: ( rule__Compuesta__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:673:2: rule__Compuesta__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__Group__1__Impl();

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
    // $ANTLR end "rule__Compuesta__Group__1"


    // $ANTLR start "rule__Compuesta__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:679:1: rule__Compuesta__Group__1__Impl : ( ( ( rule__Compuesta__Group_1__0 ) ) ( ( rule__Compuesta__Group_1__0 )* ) ) ;
    public final void rule__Compuesta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:683:1: ( ( ( ( rule__Compuesta__Group_1__0 ) ) ( ( rule__Compuesta__Group_1__0 )* ) ) )
            // InternalLenguajeNaturalReducido.g:684:1: ( ( ( rule__Compuesta__Group_1__0 ) ) ( ( rule__Compuesta__Group_1__0 )* ) )
            {
            // InternalLenguajeNaturalReducido.g:684:1: ( ( ( rule__Compuesta__Group_1__0 ) ) ( ( rule__Compuesta__Group_1__0 )* ) )
            // InternalLenguajeNaturalReducido.g:685:2: ( ( rule__Compuesta__Group_1__0 ) ) ( ( rule__Compuesta__Group_1__0 )* )
            {
            // InternalLenguajeNaturalReducido.g:685:2: ( ( rule__Compuesta__Group_1__0 ) )
            // InternalLenguajeNaturalReducido.g:686:3: ( rule__Compuesta__Group_1__0 )
            {
             before(grammarAccess.getCompuestaAccess().getGroup_1()); 
            // InternalLenguajeNaturalReducido.g:687:3: ( rule__Compuesta__Group_1__0 )
            // InternalLenguajeNaturalReducido.g:687:4: rule__Compuesta__Group_1__0
            {
            pushFollow(FOLLOW_6);
            rule__Compuesta__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getGroup_1()); 

            }

            // InternalLenguajeNaturalReducido.g:690:2: ( ( rule__Compuesta__Group_1__0 )* )
            // InternalLenguajeNaturalReducido.g:691:3: ( rule__Compuesta__Group_1__0 )*
            {
             before(grammarAccess.getCompuestaAccess().getGroup_1()); 
            // InternalLenguajeNaturalReducido.g:692:3: ( rule__Compuesta__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:692:4: rule__Compuesta__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Compuesta__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCompuestaAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__Compuesta__Group__1__Impl"


    // $ANTLR start "rule__Compuesta__Group_1__0"
    // InternalLenguajeNaturalReducido.g:702:1: rule__Compuesta__Group_1__0 : rule__Compuesta__Group_1__0__Impl rule__Compuesta__Group_1__1 ;
    public final void rule__Compuesta__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:706:1: ( rule__Compuesta__Group_1__0__Impl rule__Compuesta__Group_1__1 )
            // InternalLenguajeNaturalReducido.g:707:2: rule__Compuesta__Group_1__0__Impl rule__Compuesta__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Compuesta__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesta__Group_1__1();

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
    // $ANTLR end "rule__Compuesta__Group_1__0"


    // $ANTLR start "rule__Compuesta__Group_1__0__Impl"
    // InternalLenguajeNaturalReducido.g:714:1: rule__Compuesta__Group_1__0__Impl : ( ruleNexo ) ;
    public final void rule__Compuesta__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:718:1: ( ( ruleNexo ) )
            // InternalLenguajeNaturalReducido.g:719:1: ( ruleNexo )
            {
            // InternalLenguajeNaturalReducido.g:719:1: ( ruleNexo )
            // InternalLenguajeNaturalReducido.g:720:2: ruleNexo
            {
             before(grammarAccess.getCompuestaAccess().getNexoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNexo();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getNexoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Compuesta__Group_1__0__Impl"


    // $ANTLR start "rule__Compuesta__Group_1__1"
    // InternalLenguajeNaturalReducido.g:729:1: rule__Compuesta__Group_1__1 : rule__Compuesta__Group_1__1__Impl ;
    public final void rule__Compuesta__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:733:1: ( rule__Compuesta__Group_1__1__Impl )
            // InternalLenguajeNaturalReducido.g:734:2: rule__Compuesta__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__Group_1__1__Impl();

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
    // $ANTLR end "rule__Compuesta__Group_1__1"


    // $ANTLR start "rule__Compuesta__Group_1__1__Impl"
    // InternalLenguajeNaturalReducido.g:740:1: rule__Compuesta__Group_1__1__Impl : ( ruleSimple ) ;
    public final void rule__Compuesta__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:744:1: ( ( ruleSimple ) )
            // InternalLenguajeNaturalReducido.g:745:1: ( ruleSimple )
            {
            // InternalLenguajeNaturalReducido.g:745:1: ( ruleSimple )
            // InternalLenguajeNaturalReducido.g:746:2: ruleSimple
            {
             before(grammarAccess.getCompuestaAccess().getSimpleParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getSimpleParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Compuesta__Group_1__1__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalLenguajeNaturalReducido.g:756:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:760:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalLenguajeNaturalReducido.g:761:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLenguajeNaturalReducido.g:768:1: rule__Simple__Group__0__Impl : ( ruleDeterminante ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:772:1: ( ( ruleDeterminante ) )
            // InternalLenguajeNaturalReducido.g:773:1: ( ruleDeterminante )
            {
            // InternalLenguajeNaturalReducido.g:773:1: ( ruleDeterminante )
            // InternalLenguajeNaturalReducido.g:774:2: ruleDeterminante
            {
             before(grammarAccess.getSimpleAccess().getDeterminanteParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeterminante();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getDeterminanteParserRuleCall_0()); 

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
    // InternalLenguajeNaturalReducido.g:783:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:787:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalLenguajeNaturalReducido.g:788:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalLenguajeNaturalReducido.g:795:1: rule__Simple__Group__1__Impl : ( ruleAtributo ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:799:1: ( ( ruleAtributo ) )
            // InternalLenguajeNaturalReducido.g:800:1: ( ruleAtributo )
            {
            // InternalLenguajeNaturalReducido.g:800:1: ( ruleAtributo )
            // InternalLenguajeNaturalReducido.g:801:2: ruleAtributo
            {
             before(grammarAccess.getSimpleAccess().getAtributoParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getAtributoParserRuleCall_1()); 

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
    // InternalLenguajeNaturalReducido.g:810:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:814:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalLenguajeNaturalReducido.g:815:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalLenguajeNaturalReducido.g:822:1: rule__Simple__Group__2__Impl : ( ruleSintagmaPreposicional ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:826:1: ( ( ruleSintagmaPreposicional ) )
            // InternalLenguajeNaturalReducido.g:827:1: ( ruleSintagmaPreposicional )
            {
            // InternalLenguajeNaturalReducido.g:827:1: ( ruleSintagmaPreposicional )
            // InternalLenguajeNaturalReducido.g:828:2: ruleSintagmaPreposicional
            {
             before(grammarAccess.getSimpleAccess().getSintagmaPreposicionalParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleSintagmaPreposicional();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getSintagmaPreposicionalParserRuleCall_2()); 

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
    // InternalLenguajeNaturalReducido.g:837:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:841:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalLenguajeNaturalReducido.g:842:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalLenguajeNaturalReducido.g:849:1: rule__Simple__Group__3__Impl : ( ruleObligacion ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:853:1: ( ( ruleObligacion ) )
            // InternalLenguajeNaturalReducido.g:854:1: ( ruleObligacion )
            {
            // InternalLenguajeNaturalReducido.g:854:1: ( ruleObligacion )
            // InternalLenguajeNaturalReducido.g:855:2: ruleObligacion
            {
             before(grammarAccess.getSimpleAccess().getObligacionParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleObligacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getObligacionParserRuleCall_3()); 

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
    // InternalLenguajeNaturalReducido.g:864:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:868:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalLenguajeNaturalReducido.g:869:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalLenguajeNaturalReducido.g:876:1: rule__Simple__Group__4__Impl : ( ruleOperacion ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:880:1: ( ( ruleOperacion ) )
            // InternalLenguajeNaturalReducido.g:881:1: ( ruleOperacion )
            {
            // InternalLenguajeNaturalReducido.g:881:1: ( ruleOperacion )
            // InternalLenguajeNaturalReducido.g:882:2: ruleOperacion
            {
             before(grammarAccess.getSimpleAccess().getOperacionParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getOperacionParserRuleCall_4()); 

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
    // InternalLenguajeNaturalReducido.g:891:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:895:1: ( rule__Simple__Group__5__Impl )
            // InternalLenguajeNaturalReducido.g:896:2: rule__Simple__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__5__Impl();

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
    // InternalLenguajeNaturalReducido.g:902:1: rule__Simple__Group__5__Impl : ( ( rule__Simple__Alternatives_5 ) ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:906:1: ( ( ( rule__Simple__Alternatives_5 ) ) )
            // InternalLenguajeNaturalReducido.g:907:1: ( ( rule__Simple__Alternatives_5 ) )
            {
            // InternalLenguajeNaturalReducido.g:907:1: ( ( rule__Simple__Alternatives_5 ) )
            // InternalLenguajeNaturalReducido.g:908:2: ( rule__Simple__Alternatives_5 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_5()); 
            // InternalLenguajeNaturalReducido.g:909:2: ( rule__Simple__Alternatives_5 )
            // InternalLenguajeNaturalReducido.g:909:3: rule__Simple__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlternatives_5()); 

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


    // $ANTLR start "rule__SintagmaPreposicional__Group__0"
    // InternalLenguajeNaturalReducido.g:918:1: rule__SintagmaPreposicional__Group__0 : rule__SintagmaPreposicional__Group__0__Impl rule__SintagmaPreposicional__Group__1 ;
    public final void rule__SintagmaPreposicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:922:1: ( rule__SintagmaPreposicional__Group__0__Impl rule__SintagmaPreposicional__Group__1 )
            // InternalLenguajeNaturalReducido.g:923:2: rule__SintagmaPreposicional__Group__0__Impl rule__SintagmaPreposicional__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SintagmaPreposicional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SintagmaPreposicional__Group__1();

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
    // $ANTLR end "rule__SintagmaPreposicional__Group__0"


    // $ANTLR start "rule__SintagmaPreposicional__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:930:1: rule__SintagmaPreposicional__Group__0__Impl : ( ruleEnlace ) ;
    public final void rule__SintagmaPreposicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:934:1: ( ( ruleEnlace ) )
            // InternalLenguajeNaturalReducido.g:935:1: ( ruleEnlace )
            {
            // InternalLenguajeNaturalReducido.g:935:1: ( ruleEnlace )
            // InternalLenguajeNaturalReducido.g:936:2: ruleEnlace
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEnlace();

            state._fsp--;

             after(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceParserRuleCall_0()); 

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
    // $ANTLR end "rule__SintagmaPreposicional__Group__0__Impl"


    // $ANTLR start "rule__SintagmaPreposicional__Group__1"
    // InternalLenguajeNaturalReducido.g:945:1: rule__SintagmaPreposicional__Group__1 : rule__SintagmaPreposicional__Group__1__Impl ;
    public final void rule__SintagmaPreposicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:949:1: ( rule__SintagmaPreposicional__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:950:2: rule__SintagmaPreposicional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SintagmaPreposicional__Group__1__Impl();

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
    // $ANTLR end "rule__SintagmaPreposicional__Group__1"


    // $ANTLR start "rule__SintagmaPreposicional__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:956:1: rule__SintagmaPreposicional__Group__1__Impl : ( ruleTermino ) ;
    public final void rule__SintagmaPreposicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:960:1: ( ( ruleTermino ) )
            // InternalLenguajeNaturalReducido.g:961:1: ( ruleTermino )
            {
            // InternalLenguajeNaturalReducido.g:961:1: ( ruleTermino )
            // InternalLenguajeNaturalReducido.g:962:2: ruleTermino
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getTerminoParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTermino();

            state._fsp--;

             after(grammarAccess.getSintagmaPreposicionalAccess().getTerminoParserRuleCall_1()); 

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
    // $ANTLR end "rule__SintagmaPreposicional__Group__1__Impl"


    // $ANTLR start "rule__Termino__Group__0"
    // InternalLenguajeNaturalReducido.g:972:1: rule__Termino__Group__0 : rule__Termino__Group__0__Impl rule__Termino__Group__1 ;
    public final void rule__Termino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:976:1: ( rule__Termino__Group__0__Impl rule__Termino__Group__1 )
            // InternalLenguajeNaturalReducido.g:977:2: rule__Termino__Group__0__Impl rule__Termino__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Termino__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Termino__Group__1();

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
    // $ANTLR end "rule__Termino__Group__0"


    // $ANTLR start "rule__Termino__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:984:1: rule__Termino__Group__0__Impl : ( ruleIndeterminante ) ;
    public final void rule__Termino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:988:1: ( ( ruleIndeterminante ) )
            // InternalLenguajeNaturalReducido.g:989:1: ( ruleIndeterminante )
            {
            // InternalLenguajeNaturalReducido.g:989:1: ( ruleIndeterminante )
            // InternalLenguajeNaturalReducido.g:990:2: ruleIndeterminante
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIndeterminante();

            state._fsp--;

             after(grammarAccess.getTerminoAccess().getIndeterminanteParserRuleCall_0()); 

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
    // $ANTLR end "rule__Termino__Group__0__Impl"


    // $ANTLR start "rule__Termino__Group__1"
    // InternalLenguajeNaturalReducido.g:999:1: rule__Termino__Group__1 : rule__Termino__Group__1__Impl ;
    public final void rule__Termino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1003:1: ( rule__Termino__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1004:2: rule__Termino__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Termino__Group__1__Impl();

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
    // $ANTLR end "rule__Termino__Group__1"


    // $ANTLR start "rule__Termino__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:1010:1: rule__Termino__Group__1__Impl : ( ruleClase ) ;
    public final void rule__Termino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1014:1: ( ( ruleClase ) )
            // InternalLenguajeNaturalReducido.g:1015:1: ( ruleClase )
            {
            // InternalLenguajeNaturalReducido.g:1015:1: ( ruleClase )
            // InternalLenguajeNaturalReducido.g:1016:2: ruleClase
            {
             before(grammarAccess.getTerminoAccess().getClaseParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getTerminoAccess().getClaseParserRuleCall_1()); 

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
    // $ANTLR end "rule__Termino__Group__1__Impl"


    // $ANTLR start "rule__Documento__OracionesAssignment"
    // InternalLenguajeNaturalReducido.g:1026:1: rule__Documento__OracionesAssignment : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1030:1: ( ( ruleOracion ) )
            // InternalLenguajeNaturalReducido.g:1031:2: ( ruleOracion )
            {
            // InternalLenguajeNaturalReducido.g:1031:2: ( ruleOracion )
            // InternalLenguajeNaturalReducido.g:1032:3: ruleOracion
            {
             before(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOracion();

            state._fsp--;

             after(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Documento__OracionesAssignment"


    // $ANTLR start "rule__Oracion__OracionAssignment_0"
    // InternalLenguajeNaturalReducido.g:1041:1: rule__Oracion__OracionAssignment_0 : ( ( rule__Oracion__OracionAlternatives_0_0 ) ) ;
    public final void rule__Oracion__OracionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1045:1: ( ( ( rule__Oracion__OracionAlternatives_0_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1046:2: ( ( rule__Oracion__OracionAlternatives_0_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1046:2: ( ( rule__Oracion__OracionAlternatives_0_0 ) )
            // InternalLenguajeNaturalReducido.g:1047:3: ( rule__Oracion__OracionAlternatives_0_0 )
            {
             before(grammarAccess.getOracionAccess().getOracionAlternatives_0_0()); 
            // InternalLenguajeNaturalReducido.g:1048:3: ( rule__Oracion__OracionAlternatives_0_0 )
            // InternalLenguajeNaturalReducido.g:1048:4: rule__Oracion__OracionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__OracionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOracionAccess().getOracionAlternatives_0_0()); 

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
    // $ANTLR end "rule__Oracion__OracionAssignment_0"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\14\1\4\1\15\1\16\1\4\1\17\1\23\6\4\3\13\2\uffff";
    static final String dfa_3s = "\1\14\1\4\1\15\1\16\1\4\1\17\1\30\6\6\3\22\2\uffff";
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
            "\1\17\1\15\1\16",
            "\1\17\1\15\1\16",
            "\1\17\1\15\1\16",
            "\1\17\1\15\1\16",
            "\1\17\1\15\1\16",
            "\1\17\1\15\1\16",
            "\1\21\4\uffff\3\20",
            "\1\21\4\uffff\3\20",
            "\1\21\4\uffff\3\20",
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
            return "452:1: rule__Oracion__OracionAlternatives_0_0 : ( ( ruleSimple ) | ( ruleCompuesta ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});

}