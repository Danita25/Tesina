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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'y'", "'o'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'El/La'", "'de'", "'un/una'", "'no'", "'debe ser'"
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



    // $ANTLR start "entryRuleDocumento"
    // InternalGramatica.g:53:1: entryRuleDocumento : ruleDocumento EOF ;
    public final void entryRuleDocumento() throws RecognitionException {
        try {
            // InternalGramatica.g:54:1: ( ruleDocumento EOF )
            // InternalGramatica.g:55:1: ruleDocumento EOF
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
    // InternalGramatica.g:62:1: ruleDocumento : ( ( rule__Documento__Group__0 ) ) ;
    public final void ruleDocumento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:66:2: ( ( ( rule__Documento__Group__0 ) ) )
            // InternalGramatica.g:67:2: ( ( rule__Documento__Group__0 ) )
            {
            // InternalGramatica.g:67:2: ( ( rule__Documento__Group__0 ) )
            // InternalGramatica.g:68:3: ( rule__Documento__Group__0 )
            {
             before(grammarAccess.getDocumentoAccess().getGroup()); 
            // InternalGramatica.g:69:3: ( rule__Documento__Group__0 )
            // InternalGramatica.g:69:4: rule__Documento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Documento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentoAccess().getGroup()); 

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
    // InternalGramatica.g:87:1: ruleOracion : ( ( rule__Oracion__Group__0 ) ) ;
    public final void ruleOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:91:2: ( ( ( rule__Oracion__Group__0 ) ) )
            // InternalGramatica.g:92:2: ( ( rule__Oracion__Group__0 ) )
            {
            // InternalGramatica.g:92:2: ( ( rule__Oracion__Group__0 ) )
            // InternalGramatica.g:93:3: ( rule__Oracion__Group__0 )
            {
             before(grammarAccess.getOracionAccess().getGroup()); 
            // InternalGramatica.g:94:3: ( rule__Oracion__Group__0 )
            // InternalGramatica.g:94:4: rule__Oracion__Group__0
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


    // $ANTLR start "entryRuleCompuesta"
    // InternalGramatica.g:128:1: entryRuleCompuesta : ruleCompuesta EOF ;
    public final void entryRuleCompuesta() throws RecognitionException {
        try {
            // InternalGramatica.g:129:1: ( ruleCompuesta EOF )
            // InternalGramatica.g:130:1: ruleCompuesta EOF
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
    // InternalGramatica.g:137:1: ruleCompuesta : ( ( rule__Compuesta__Group__0 ) ) ;
    public final void ruleCompuesta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:141:2: ( ( ( rule__Compuesta__Group__0 ) ) )
            // InternalGramatica.g:142:2: ( ( rule__Compuesta__Group__0 ) )
            {
            // InternalGramatica.g:142:2: ( ( rule__Compuesta__Group__0 ) )
            // InternalGramatica.g:143:3: ( rule__Compuesta__Group__0 )
            {
             before(grammarAccess.getCompuestaAccess().getGroup()); 
            // InternalGramatica.g:144:3: ( rule__Compuesta__Group__0 )
            // InternalGramatica.g:144:4: rule__Compuesta__Group__0
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
    // InternalGramatica.g:153:1: entryRuleNexo : ruleNexo EOF ;
    public final void entryRuleNexo() throws RecognitionException {
        try {
            // InternalGramatica.g:154:1: ( ruleNexo EOF )
            // InternalGramatica.g:155:1: ruleNexo EOF
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
    // InternalGramatica.g:162:1: ruleNexo : ( ( rule__Nexo__ValorAssignment ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:166:2: ( ( ( rule__Nexo__ValorAssignment ) ) )
            // InternalGramatica.g:167:2: ( ( rule__Nexo__ValorAssignment ) )
            {
            // InternalGramatica.g:167:2: ( ( rule__Nexo__ValorAssignment ) )
            // InternalGramatica.g:168:3: ( rule__Nexo__ValorAssignment )
            {
             before(grammarAccess.getNexoAccess().getValorAssignment()); 
            // InternalGramatica.g:169:3: ( rule__Nexo__ValorAssignment )
            // InternalGramatica.g:169:4: rule__Nexo__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getValorAssignment()); 

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


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:178:1: entryRuleFinOracion : ruleFinOracion EOF ;
    public final void entryRuleFinOracion() throws RecognitionException {
        try {
            // InternalGramatica.g:179:1: ( ruleFinOracion EOF )
            // InternalGramatica.g:180:1: ruleFinOracion EOF
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
    // InternalGramatica.g:187:1: ruleFinOracion : ( '.\\r\\n' ) ;
    public final void ruleFinOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:191:2: ( ( '.\\r\\n' ) )
            // InternalGramatica.g:192:2: ( '.\\r\\n' )
            {
            // InternalGramatica.g:192:2: ( '.\\r\\n' )
            // InternalGramatica.g:193:3: '.\\r\\n'
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


    // $ANTLR start "entryRuleDeterminante"
    // InternalGramatica.g:203:1: entryRuleDeterminante : ruleDeterminante EOF ;
    public final void entryRuleDeterminante() throws RecognitionException {
        try {
            // InternalGramatica.g:204:1: ( ruleDeterminante EOF )
            // InternalGramatica.g:205:1: ruleDeterminante EOF
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
    // InternalGramatica.g:212:1: ruleDeterminante : ( ( rule__Determinante__ValorAssignment ) ) ;
    public final void ruleDeterminante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:216:2: ( ( ( rule__Determinante__ValorAssignment ) ) )
            // InternalGramatica.g:217:2: ( ( rule__Determinante__ValorAssignment ) )
            {
            // InternalGramatica.g:217:2: ( ( rule__Determinante__ValorAssignment ) )
            // InternalGramatica.g:218:3: ( rule__Determinante__ValorAssignment )
            {
             before(grammarAccess.getDeterminanteAccess().getValorAssignment()); 
            // InternalGramatica.g:219:3: ( rule__Determinante__ValorAssignment )
            // InternalGramatica.g:219:4: rule__Determinante__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Determinante__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeterminanteAccess().getValorAssignment()); 

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


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:228:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalGramatica.g:229:1: ( ruleAtributo EOF )
            // InternalGramatica.g:230:1: ruleAtributo EOF
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
    // InternalGramatica.g:237:1: ruleAtributo : ( ( rule__Atributo__NombreAssignment ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:241:2: ( ( ( rule__Atributo__NombreAssignment ) ) )
            // InternalGramatica.g:242:2: ( ( rule__Atributo__NombreAssignment ) )
            {
            // InternalGramatica.g:242:2: ( ( rule__Atributo__NombreAssignment ) )
            // InternalGramatica.g:243:3: ( rule__Atributo__NombreAssignment )
            {
             before(grammarAccess.getAtributoAccess().getNombreAssignment()); 
            // InternalGramatica.g:244:3: ( rule__Atributo__NombreAssignment )
            // InternalGramatica.g:244:4: rule__Atributo__NombreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NombreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNombreAssignment()); 

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


    // $ANTLR start "entryRuleSintagmaPreposicional"
    // InternalGramatica.g:253:1: entryRuleSintagmaPreposicional : ruleSintagmaPreposicional EOF ;
    public final void entryRuleSintagmaPreposicional() throws RecognitionException {
        try {
            // InternalGramatica.g:254:1: ( ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:255:1: ruleSintagmaPreposicional EOF
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
    // InternalGramatica.g:262:1: ruleSintagmaPreposicional : ( ( rule__SintagmaPreposicional__Group__0 ) ) ;
    public final void ruleSintagmaPreposicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:266:2: ( ( ( rule__SintagmaPreposicional__Group__0 ) ) )
            // InternalGramatica.g:267:2: ( ( rule__SintagmaPreposicional__Group__0 ) )
            {
            // InternalGramatica.g:267:2: ( ( rule__SintagmaPreposicional__Group__0 ) )
            // InternalGramatica.g:268:3: ( rule__SintagmaPreposicional__Group__0 )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getGroup()); 
            // InternalGramatica.g:269:3: ( rule__SintagmaPreposicional__Group__0 )
            // InternalGramatica.g:269:4: rule__SintagmaPreposicional__Group__0
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
    // InternalGramatica.g:278:1: entryRuleEnlace : ruleEnlace EOF ;
    public final void entryRuleEnlace() throws RecognitionException {
        try {
            // InternalGramatica.g:279:1: ( ruleEnlace EOF )
            // InternalGramatica.g:280:1: ruleEnlace EOF
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
    // InternalGramatica.g:287:1: ruleEnlace : ( ( rule__Enlace__ValorAssignment ) ) ;
    public final void ruleEnlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:291:2: ( ( ( rule__Enlace__ValorAssignment ) ) )
            // InternalGramatica.g:292:2: ( ( rule__Enlace__ValorAssignment ) )
            {
            // InternalGramatica.g:292:2: ( ( rule__Enlace__ValorAssignment ) )
            // InternalGramatica.g:293:3: ( rule__Enlace__ValorAssignment )
            {
             before(grammarAccess.getEnlaceAccess().getValorAssignment()); 
            // InternalGramatica.g:294:3: ( rule__Enlace__ValorAssignment )
            // InternalGramatica.g:294:4: rule__Enlace__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Enlace__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnlaceAccess().getValorAssignment()); 

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
    // InternalGramatica.g:303:1: entryRuleTermino : ruleTermino EOF ;
    public final void entryRuleTermino() throws RecognitionException {
        try {
            // InternalGramatica.g:304:1: ( ruleTermino EOF )
            // InternalGramatica.g:305:1: ruleTermino EOF
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
    // InternalGramatica.g:312:1: ruleTermino : ( ( rule__Termino__Group__0 ) ) ;
    public final void ruleTermino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:316:2: ( ( ( rule__Termino__Group__0 ) ) )
            // InternalGramatica.g:317:2: ( ( rule__Termino__Group__0 ) )
            {
            // InternalGramatica.g:317:2: ( ( rule__Termino__Group__0 ) )
            // InternalGramatica.g:318:3: ( rule__Termino__Group__0 )
            {
             before(grammarAccess.getTerminoAccess().getGroup()); 
            // InternalGramatica.g:319:3: ( rule__Termino__Group__0 )
            // InternalGramatica.g:319:4: rule__Termino__Group__0
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
    // InternalGramatica.g:328:1: entryRuleIndeterminante : ruleIndeterminante EOF ;
    public final void entryRuleIndeterminante() throws RecognitionException {
        try {
            // InternalGramatica.g:329:1: ( ruleIndeterminante EOF )
            // InternalGramatica.g:330:1: ruleIndeterminante EOF
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
    // InternalGramatica.g:337:1: ruleIndeterminante : ( ( rule__Indeterminante__ValorAssignment ) ) ;
    public final void ruleIndeterminante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:341:2: ( ( ( rule__Indeterminante__ValorAssignment ) ) )
            // InternalGramatica.g:342:2: ( ( rule__Indeterminante__ValorAssignment ) )
            {
            // InternalGramatica.g:342:2: ( ( rule__Indeterminante__ValorAssignment ) )
            // InternalGramatica.g:343:3: ( rule__Indeterminante__ValorAssignment )
            {
             before(grammarAccess.getIndeterminanteAccess().getValorAssignment()); 
            // InternalGramatica.g:344:3: ( rule__Indeterminante__ValorAssignment )
            // InternalGramatica.g:344:4: rule__Indeterminante__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Indeterminante__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIndeterminanteAccess().getValorAssignment()); 

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
    // InternalGramatica.g:353:1: entryRuleObligacion : ruleObligacion EOF ;
    public final void entryRuleObligacion() throws RecognitionException {
        try {
            // InternalGramatica.g:354:1: ( ruleObligacion EOF )
            // InternalGramatica.g:355:1: ruleObligacion EOF
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
    // InternalGramatica.g:362:1: ruleObligacion : ( ( rule__Obligacion__Group__0 ) ) ;
    public final void ruleObligacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:366:2: ( ( ( rule__Obligacion__Group__0 ) ) )
            // InternalGramatica.g:367:2: ( ( rule__Obligacion__Group__0 ) )
            {
            // InternalGramatica.g:367:2: ( ( rule__Obligacion__Group__0 ) )
            // InternalGramatica.g:368:3: ( rule__Obligacion__Group__0 )
            {
             before(grammarAccess.getObligacionAccess().getGroup()); 
            // InternalGramatica.g:369:3: ( rule__Obligacion__Group__0 )
            // InternalGramatica.g:369:4: rule__Obligacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obligacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObligacionAccess().getGroup()); 

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
    // InternalGramatica.g:378:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalGramatica.g:379:1: ( ruleOperacion EOF )
            // InternalGramatica.g:380:1: ruleOperacion EOF
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
    // InternalGramatica.g:387:1: ruleOperacion : ( ( rule__Operacion__DescripcionAssignment ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:391:2: ( ( ( rule__Operacion__DescripcionAssignment ) ) )
            // InternalGramatica.g:392:2: ( ( rule__Operacion__DescripcionAssignment ) )
            {
            // InternalGramatica.g:392:2: ( ( rule__Operacion__DescripcionAssignment ) )
            // InternalGramatica.g:393:3: ( rule__Operacion__DescripcionAssignment )
            {
             before(grammarAccess.getOperacionAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:394:3: ( rule__Operacion__DescripcionAssignment )
            // InternalGramatica.g:394:4: rule__Operacion__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getDescripcionAssignment()); 

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


    // $ANTLR start "entryRuleContexto"
    // InternalGramatica.g:403:1: entryRuleContexto : ruleContexto EOF ;
    public final void entryRuleContexto() throws RecognitionException {
        try {
            // InternalGramatica.g:404:1: ( ruleContexto EOF )
            // InternalGramatica.g:405:1: ruleContexto EOF
            {
             before(grammarAccess.getContextoRule()); 
            pushFollow(FOLLOW_1);
            ruleContexto();

            state._fsp--;

             after(grammarAccess.getContextoRule()); 
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
    // $ANTLR end "entryRuleContexto"


    // $ANTLR start "ruleContexto"
    // InternalGramatica.g:412:1: ruleContexto : ( ( rule__Contexto__NombreAssignment ) ) ;
    public final void ruleContexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:416:2: ( ( ( rule__Contexto__NombreAssignment ) ) )
            // InternalGramatica.g:417:2: ( ( rule__Contexto__NombreAssignment ) )
            {
            // InternalGramatica.g:417:2: ( ( rule__Contexto__NombreAssignment ) )
            // InternalGramatica.g:418:3: ( rule__Contexto__NombreAssignment )
            {
             before(grammarAccess.getContextoAccess().getNombreAssignment()); 
            // InternalGramatica.g:419:3: ( rule__Contexto__NombreAssignment )
            // InternalGramatica.g:419:4: rule__Contexto__NombreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Contexto__NombreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContextoAccess().getNombreAssignment()); 

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
    // $ANTLR end "ruleContexto"


    // $ANTLR start "entryRuleLiteral"
    // InternalGramatica.g:428:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalGramatica.g:429:1: ( ruleLiteral EOF )
            // InternalGramatica.g:430:1: ruleLiteral EOF
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
    // InternalGramatica.g:437:1: ruleLiteral : ( ( rule__Literal__ValorAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:441:2: ( ( ( rule__Literal__ValorAssignment ) ) )
            // InternalGramatica.g:442:2: ( ( rule__Literal__ValorAssignment ) )
            {
            // InternalGramatica.g:442:2: ( ( rule__Literal__ValorAssignment ) )
            // InternalGramatica.g:443:3: ( rule__Literal__ValorAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValorAssignment()); 
            // InternalGramatica.g:444:3: ( rule__Literal__ValorAssignment )
            // InternalGramatica.g:444:4: rule__Literal__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValorAssignment()); 

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


    // $ANTLR start "rule__Oracion__ContenidoAlternatives_0_0"
    // InternalGramatica.g:452:1: rule__Oracion__ContenidoAlternatives_0_0 : ( ( ruleCompuesta ) | ( ruleSimple ) );
    public final void rule__Oracion__ContenidoAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:456:1: ( ( ruleCompuesta ) | ( ruleSimple ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGramatica.g:457:2: ( ruleCompuesta )
                    {
                    // InternalGramatica.g:457:2: ( ruleCompuesta )
                    // InternalGramatica.g:458:3: ruleCompuesta
                    {
                     before(grammarAccess.getOracionAccess().getContenidoCompuestaParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCompuesta();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getContenidoCompuestaParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:463:2: ( ruleSimple )
                    {
                    // InternalGramatica.g:463:2: ( ruleSimple )
                    // InternalGramatica.g:464:3: ruleSimple
                    {
                     before(grammarAccess.getOracionAccess().getContenidoSimpleParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getContenidoSimpleParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Oracion__ContenidoAlternatives_0_0"


    // $ANTLR start "rule__Nexo__ValorAlternatives_0"
    // InternalGramatica.g:473:1: rule__Nexo__ValorAlternatives_0 : ( ( 'y' ) | ( 'o' ) );
    public final void rule__Nexo__ValorAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:477:1: ( ( 'y' ) | ( 'o' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:478:2: ( 'y' )
                    {
                    // InternalGramatica.g:478:2: ( 'y' )
                    // InternalGramatica.g:479:3: 'y'
                    {
                     before(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:484:2: ( 'o' )
                    {
                    // InternalGramatica.g:484:2: ( 'o' )
                    // InternalGramatica.g:485:3: 'o'
                    {
                     before(grammarAccess.getNexoAccess().getValorOKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getValorOKeyword_0_1()); 

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
    // $ANTLR end "rule__Nexo__ValorAlternatives_0"


    // $ANTLR start "rule__Operacion__DescripcionAlternatives_0"
    // InternalGramatica.g:494:1: rule__Operacion__DescripcionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Operacion__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:498:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:499:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:499:2: ( 'mayor que' )
                    // InternalGramatica.g:500:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:505:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:505:2: ( 'menor que' )
                    // InternalGramatica.g:506:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:511:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:511:2: ( 'igual a' )
                    // InternalGramatica.g:512:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:517:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:517:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:518:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:523:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:523:2: ( 'menor o igual a' )
                    // InternalGramatica.g:524:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:529:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:529:2: ( 'distinto de' )
                    // InternalGramatica.g:530:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:535:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:535:2: ( 'al menos' )
                    // InternalGramatica.g:536:3: 'al menos'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_6()); 

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
    // $ANTLR end "rule__Operacion__DescripcionAlternatives_0"


    // $ANTLR start "rule__Documento__Group__0"
    // InternalGramatica.g:545:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:549:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalGramatica.g:550:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Documento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documento__Group__1();

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
    // $ANTLR end "rule__Documento__Group__0"


    // $ANTLR start "rule__Documento__Group__0__Impl"
    // InternalGramatica.g:557:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__PathModeloAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:561:1: ( ( ( rule__Documento__PathModeloAssignment_0 ) ) )
            // InternalGramatica.g:562:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            {
            // InternalGramatica.g:562:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            // InternalGramatica.g:563:2: ( rule__Documento__PathModeloAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); 
            // InternalGramatica.g:564:2: ( rule__Documento__PathModeloAssignment_0 )
            // InternalGramatica.g:564:3: rule__Documento__PathModeloAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Documento__PathModeloAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); 

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
    // $ANTLR end "rule__Documento__Group__0__Impl"


    // $ANTLR start "rule__Documento__Group__1"
    // InternalGramatica.g:572:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:576:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalGramatica.g:577:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Documento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documento__Group__2();

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
    // $ANTLR end "rule__Documento__Group__1"


    // $ANTLR start "rule__Documento__Group__1__Impl"
    // InternalGramatica.g:584:1: rule__Documento__Group__1__Impl : ( ( rule__Documento__PathOclAssignment_1 ) ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:588:1: ( ( ( rule__Documento__PathOclAssignment_1 ) ) )
            // InternalGramatica.g:589:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            {
            // InternalGramatica.g:589:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            // InternalGramatica.g:590:2: ( rule__Documento__PathOclAssignment_1 )
            {
             before(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); 
            // InternalGramatica.g:591:2: ( rule__Documento__PathOclAssignment_1 )
            // InternalGramatica.g:591:3: rule__Documento__PathOclAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Documento__PathOclAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); 

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
    // $ANTLR end "rule__Documento__Group__1__Impl"


    // $ANTLR start "rule__Documento__Group__2"
    // InternalGramatica.g:599:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:603:1: ( rule__Documento__Group__2__Impl )
            // InternalGramatica.g:604:2: rule__Documento__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documento__Group__2__Impl();

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
    // $ANTLR end "rule__Documento__Group__2"


    // $ANTLR start "rule__Documento__Group__2__Impl"
    // InternalGramatica.g:610:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__OracionesAssignment_2 )* ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:614:1: ( ( ( rule__Documento__OracionesAssignment_2 )* ) )
            // InternalGramatica.g:615:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            {
            // InternalGramatica.g:615:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            // InternalGramatica.g:616:2: ( rule__Documento__OracionesAssignment_2 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 
            // InternalGramatica.g:617:2: ( rule__Documento__OracionesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGramatica.g:617:3: rule__Documento__OracionesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Documento__OracionesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 

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
    // $ANTLR end "rule__Documento__Group__2__Impl"


    // $ANTLR start "rule__Oracion__Group__0"
    // InternalGramatica.g:626:1: rule__Oracion__Group__0 : rule__Oracion__Group__0__Impl rule__Oracion__Group__1 ;
    public final void rule__Oracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:630:1: ( rule__Oracion__Group__0__Impl rule__Oracion__Group__1 )
            // InternalGramatica.g:631:2: rule__Oracion__Group__0__Impl rule__Oracion__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGramatica.g:638:1: rule__Oracion__Group__0__Impl : ( ( rule__Oracion__ContenidoAssignment_0 ) ) ;
    public final void rule__Oracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:642:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) )
            // InternalGramatica.g:643:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            {
            // InternalGramatica.g:643:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            // InternalGramatica.g:644:2: ( rule__Oracion__ContenidoAssignment_0 )
            {
             before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
            // InternalGramatica.g:645:2: ( rule__Oracion__ContenidoAssignment_0 )
            // InternalGramatica.g:645:3: rule__Oracion__ContenidoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__ContenidoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 

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
    // InternalGramatica.g:653:1: rule__Oracion__Group__1 : rule__Oracion__Group__1__Impl ;
    public final void rule__Oracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:657:1: ( rule__Oracion__Group__1__Impl )
            // InternalGramatica.g:658:2: rule__Oracion__Group__1__Impl
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
    // InternalGramatica.g:664:1: rule__Oracion__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Oracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:668:1: ( ( ruleFinOracion ) )
            // InternalGramatica.g:669:1: ( ruleFinOracion )
            {
            // InternalGramatica.g:669:1: ( ruleFinOracion )
            // InternalGramatica.g:670:2: ruleFinOracion
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


    // $ANTLR start "rule__Simple__Group__0"
    // InternalGramatica.g:680:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:684:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:685:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGramatica.g:692:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__DeterminanteAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:696:1: ( ( ( rule__Simple__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:697:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:697:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:698:2: ( rule__Simple__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:699:2: ( rule__Simple__DeterminanteAssignment_0 )
            // InternalGramatica.g:699:3: rule__Simple__DeterminanteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__DeterminanteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getDeterminanteAssignment_0()); 

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
    // InternalGramatica.g:707:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:711:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:712:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGramatica.g:719:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AtributoAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:723:1: ( ( ( rule__Simple__AtributoAssignment_1 ) ) )
            // InternalGramatica.g:724:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            {
            // InternalGramatica.g:724:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            // InternalGramatica.g:725:2: ( rule__Simple__AtributoAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); 
            // InternalGramatica.g:726:2: ( rule__Simple__AtributoAssignment_1 )
            // InternalGramatica.g:726:3: rule__Simple__AtributoAssignment_1
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
    // InternalGramatica.g:734:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:738:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalGramatica.g:739:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalGramatica.g:746:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__SintagmaAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:750:1: ( ( ( rule__Simple__SintagmaAssignment_2 ) ) )
            // InternalGramatica.g:751:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            {
            // InternalGramatica.g:751:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            // InternalGramatica.g:752:2: ( rule__Simple__SintagmaAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getSintagmaAssignment_2()); 
            // InternalGramatica.g:753:2: ( rule__Simple__SintagmaAssignment_2 )
            // InternalGramatica.g:753:3: rule__Simple__SintagmaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Simple__SintagmaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getSintagmaAssignment_2()); 

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
    // InternalGramatica.g:761:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:765:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalGramatica.g:766:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalGramatica.g:773:1: rule__Simple__Group__3__Impl : ( ( rule__Simple__ObligacionAssignment_3 ) ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:777:1: ( ( ( rule__Simple__ObligacionAssignment_3 ) ) )
            // InternalGramatica.g:778:1: ( ( rule__Simple__ObligacionAssignment_3 ) )
            {
            // InternalGramatica.g:778:1: ( ( rule__Simple__ObligacionAssignment_3 ) )
            // InternalGramatica.g:779:2: ( rule__Simple__ObligacionAssignment_3 )
            {
             before(grammarAccess.getSimpleAccess().getObligacionAssignment_3()); 
            // InternalGramatica.g:780:2: ( rule__Simple__ObligacionAssignment_3 )
            // InternalGramatica.g:780:3: rule__Simple__ObligacionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ObligacionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getObligacionAssignment_3()); 

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
    // InternalGramatica.g:788:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:792:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalGramatica.g:793:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalGramatica.g:800:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__OperacionAssignment_4 ) ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:804:1: ( ( ( rule__Simple__OperacionAssignment_4 ) ) )
            // InternalGramatica.g:805:1: ( ( rule__Simple__OperacionAssignment_4 ) )
            {
            // InternalGramatica.g:805:1: ( ( rule__Simple__OperacionAssignment_4 ) )
            // InternalGramatica.g:806:2: ( rule__Simple__OperacionAssignment_4 )
            {
             before(grammarAccess.getSimpleAccess().getOperacionAssignment_4()); 
            // InternalGramatica.g:807:2: ( rule__Simple__OperacionAssignment_4 )
            // InternalGramatica.g:807:3: rule__Simple__OperacionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Simple__OperacionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getOperacionAssignment_4()); 

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
    // InternalGramatica.g:815:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:819:1: ( rule__Simple__Group__5__Impl )
            // InternalGramatica.g:820:2: rule__Simple__Group__5__Impl
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
    // InternalGramatica.g:826:1: rule__Simple__Group__5__Impl : ( ( rule__Simple__LiteralAssignment_5 ) ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:830:1: ( ( ( rule__Simple__LiteralAssignment_5 ) ) )
            // InternalGramatica.g:831:1: ( ( rule__Simple__LiteralAssignment_5 ) )
            {
            // InternalGramatica.g:831:1: ( ( rule__Simple__LiteralAssignment_5 ) )
            // InternalGramatica.g:832:2: ( rule__Simple__LiteralAssignment_5 )
            {
             before(grammarAccess.getSimpleAccess().getLiteralAssignment_5()); 
            // InternalGramatica.g:833:2: ( rule__Simple__LiteralAssignment_5 )
            // InternalGramatica.g:833:3: rule__Simple__LiteralAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Simple__LiteralAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getLiteralAssignment_5()); 

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


    // $ANTLR start "rule__Compuesta__Group__0"
    // InternalGramatica.g:842:1: rule__Compuesta__Group__0 : rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 ;
    public final void rule__Compuesta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:846:1: ( rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 )
            // InternalGramatica.g:847:2: rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGramatica.g:854:1: rule__Compuesta__Group__0__Impl : ( ( rule__Compuesta__SimpleAssignment_0 ) ) ;
    public final void rule__Compuesta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:858:1: ( ( ( rule__Compuesta__SimpleAssignment_0 ) ) )
            // InternalGramatica.g:859:1: ( ( rule__Compuesta__SimpleAssignment_0 ) )
            {
            // InternalGramatica.g:859:1: ( ( rule__Compuesta__SimpleAssignment_0 ) )
            // InternalGramatica.g:860:2: ( rule__Compuesta__SimpleAssignment_0 )
            {
             before(grammarAccess.getCompuestaAccess().getSimpleAssignment_0()); 
            // InternalGramatica.g:861:2: ( rule__Compuesta__SimpleAssignment_0 )
            // InternalGramatica.g:861:3: rule__Compuesta__SimpleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__SimpleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getSimpleAssignment_0()); 

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
    // InternalGramatica.g:869:1: rule__Compuesta__Group__1 : rule__Compuesta__Group__1__Impl rule__Compuesta__Group__2 ;
    public final void rule__Compuesta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:873:1: ( rule__Compuesta__Group__1__Impl rule__Compuesta__Group__2 )
            // InternalGramatica.g:874:2: rule__Compuesta__Group__1__Impl rule__Compuesta__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Compuesta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesta__Group__2();

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
    // InternalGramatica.g:881:1: rule__Compuesta__Group__1__Impl : ( ( rule__Compuesta__NexoAssignment_1 ) ) ;
    public final void rule__Compuesta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:885:1: ( ( ( rule__Compuesta__NexoAssignment_1 ) ) )
            // InternalGramatica.g:886:1: ( ( rule__Compuesta__NexoAssignment_1 ) )
            {
            // InternalGramatica.g:886:1: ( ( rule__Compuesta__NexoAssignment_1 ) )
            // InternalGramatica.g:887:2: ( rule__Compuesta__NexoAssignment_1 )
            {
             before(grammarAccess.getCompuestaAccess().getNexoAssignment_1()); 
            // InternalGramatica.g:888:2: ( rule__Compuesta__NexoAssignment_1 )
            // InternalGramatica.g:888:3: rule__Compuesta__NexoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__NexoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getNexoAssignment_1()); 

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


    // $ANTLR start "rule__Compuesta__Group__2"
    // InternalGramatica.g:896:1: rule__Compuesta__Group__2 : rule__Compuesta__Group__2__Impl ;
    public final void rule__Compuesta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:900:1: ( rule__Compuesta__Group__2__Impl )
            // InternalGramatica.g:901:2: rule__Compuesta__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__Group__2__Impl();

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
    // $ANTLR end "rule__Compuesta__Group__2"


    // $ANTLR start "rule__Compuesta__Group__2__Impl"
    // InternalGramatica.g:907:1: rule__Compuesta__Group__2__Impl : ( ( rule__Compuesta__OracionAssignment_2 ) ) ;
    public final void rule__Compuesta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:911:1: ( ( ( rule__Compuesta__OracionAssignment_2 ) ) )
            // InternalGramatica.g:912:1: ( ( rule__Compuesta__OracionAssignment_2 ) )
            {
            // InternalGramatica.g:912:1: ( ( rule__Compuesta__OracionAssignment_2 ) )
            // InternalGramatica.g:913:2: ( rule__Compuesta__OracionAssignment_2 )
            {
             before(grammarAccess.getCompuestaAccess().getOracionAssignment_2()); 
            // InternalGramatica.g:914:2: ( rule__Compuesta__OracionAssignment_2 )
            // InternalGramatica.g:914:3: rule__Compuesta__OracionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__OracionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getOracionAssignment_2()); 

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
    // $ANTLR end "rule__Compuesta__Group__2__Impl"


    // $ANTLR start "rule__SintagmaPreposicional__Group__0"
    // InternalGramatica.g:923:1: rule__SintagmaPreposicional__Group__0 : rule__SintagmaPreposicional__Group__0__Impl rule__SintagmaPreposicional__Group__1 ;
    public final void rule__SintagmaPreposicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:927:1: ( rule__SintagmaPreposicional__Group__0__Impl rule__SintagmaPreposicional__Group__1 )
            // InternalGramatica.g:928:2: rule__SintagmaPreposicional__Group__0__Impl rule__SintagmaPreposicional__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGramatica.g:935:1: rule__SintagmaPreposicional__Group__0__Impl : ( ( rule__SintagmaPreposicional__EnlaceAssignment_0 ) ) ;
    public final void rule__SintagmaPreposicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:939:1: ( ( ( rule__SintagmaPreposicional__EnlaceAssignment_0 ) ) )
            // InternalGramatica.g:940:1: ( ( rule__SintagmaPreposicional__EnlaceAssignment_0 ) )
            {
            // InternalGramatica.g:940:1: ( ( rule__SintagmaPreposicional__EnlaceAssignment_0 ) )
            // InternalGramatica.g:941:2: ( rule__SintagmaPreposicional__EnlaceAssignment_0 )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceAssignment_0()); 
            // InternalGramatica.g:942:2: ( rule__SintagmaPreposicional__EnlaceAssignment_0 )
            // InternalGramatica.g:942:3: rule__SintagmaPreposicional__EnlaceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SintagmaPreposicional__EnlaceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceAssignment_0()); 

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
    // InternalGramatica.g:950:1: rule__SintagmaPreposicional__Group__1 : rule__SintagmaPreposicional__Group__1__Impl ;
    public final void rule__SintagmaPreposicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:954:1: ( rule__SintagmaPreposicional__Group__1__Impl )
            // InternalGramatica.g:955:2: rule__SintagmaPreposicional__Group__1__Impl
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
    // InternalGramatica.g:961:1: rule__SintagmaPreposicional__Group__1__Impl : ( ( rule__SintagmaPreposicional__TerminoAssignment_1 ) ) ;
    public final void rule__SintagmaPreposicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:965:1: ( ( ( rule__SintagmaPreposicional__TerminoAssignment_1 ) ) )
            // InternalGramatica.g:966:1: ( ( rule__SintagmaPreposicional__TerminoAssignment_1 ) )
            {
            // InternalGramatica.g:966:1: ( ( rule__SintagmaPreposicional__TerminoAssignment_1 ) )
            // InternalGramatica.g:967:2: ( rule__SintagmaPreposicional__TerminoAssignment_1 )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getTerminoAssignment_1()); 
            // InternalGramatica.g:968:2: ( rule__SintagmaPreposicional__TerminoAssignment_1 )
            // InternalGramatica.g:968:3: rule__SintagmaPreposicional__TerminoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SintagmaPreposicional__TerminoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSintagmaPreposicionalAccess().getTerminoAssignment_1()); 

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
    // InternalGramatica.g:977:1: rule__Termino__Group__0 : rule__Termino__Group__0__Impl rule__Termino__Group__1 ;
    public final void rule__Termino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:981:1: ( rule__Termino__Group__0__Impl rule__Termino__Group__1 )
            // InternalGramatica.g:982:2: rule__Termino__Group__0__Impl rule__Termino__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGramatica.g:989:1: rule__Termino__Group__0__Impl : ( ( rule__Termino__IndeterminanteAssignment_0 ) ) ;
    public final void rule__Termino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:993:1: ( ( ( rule__Termino__IndeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:994:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:994:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            // InternalGramatica.g:995:2: ( rule__Termino__IndeterminanteAssignment_0 )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); 
            // InternalGramatica.g:996:2: ( rule__Termino__IndeterminanteAssignment_0 )
            // InternalGramatica.g:996:3: rule__Termino__IndeterminanteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Termino__IndeterminanteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); 

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
    // InternalGramatica.g:1004:1: rule__Termino__Group__1 : rule__Termino__Group__1__Impl ;
    public final void rule__Termino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1008:1: ( rule__Termino__Group__1__Impl )
            // InternalGramatica.g:1009:2: rule__Termino__Group__1__Impl
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
    // InternalGramatica.g:1015:1: rule__Termino__Group__1__Impl : ( ( rule__Termino__ContextoAssignment_1 ) ) ;
    public final void rule__Termino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1019:1: ( ( ( rule__Termino__ContextoAssignment_1 ) ) )
            // InternalGramatica.g:1020:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            {
            // InternalGramatica.g:1020:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            // InternalGramatica.g:1021:2: ( rule__Termino__ContextoAssignment_1 )
            {
             before(grammarAccess.getTerminoAccess().getContextoAssignment_1()); 
            // InternalGramatica.g:1022:2: ( rule__Termino__ContextoAssignment_1 )
            // InternalGramatica.g:1022:3: rule__Termino__ContextoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Termino__ContextoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminoAccess().getContextoAssignment_1()); 

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


    // $ANTLR start "rule__Obligacion__Group__0"
    // InternalGramatica.g:1031:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1035:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalGramatica.g:1036:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Obligacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obligacion__Group__1();

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
    // $ANTLR end "rule__Obligacion__Group__0"


    // $ANTLR start "rule__Obligacion__Group__0__Impl"
    // InternalGramatica.g:1043:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1047:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalGramatica.g:1048:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalGramatica.g:1048:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalGramatica.g:1049:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalGramatica.g:1050:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:1050:3: rule__Obligacion__NegacionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Obligacion__NegacionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 

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
    // $ANTLR end "rule__Obligacion__Group__0__Impl"


    // $ANTLR start "rule__Obligacion__Group__1"
    // InternalGramatica.g:1058:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1062:1: ( rule__Obligacion__Group__1__Impl )
            // InternalGramatica.g:1063:2: rule__Obligacion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obligacion__Group__1__Impl();

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
    // $ANTLR end "rule__Obligacion__Group__1"


    // $ANTLR start "rule__Obligacion__Group__1__Impl"
    // InternalGramatica.g:1069:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1073:1: ( ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) )
            // InternalGramatica.g:1074:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            {
            // InternalGramatica.g:1074:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            // InternalGramatica.g:1075:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberAssignment_1()); 
            // InternalGramatica.g:1076:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            // InternalGramatica.g:1076:3: rule__Obligacion__ObligacionDeberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Obligacion__ObligacionDeberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObligacionAccess().getObligacionDeberAssignment_1()); 

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
    // $ANTLR end "rule__Obligacion__Group__1__Impl"


    // $ANTLR start "rule__Documento__PathModeloAssignment_0"
    // InternalGramatica.g:1085:1: rule__Documento__PathModeloAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Documento__PathModeloAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1089:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1090:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1090:2: ( RULE_STRING )
            // InternalGramatica.g:1091:3: RULE_STRING
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getPathModeloSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Documento__PathModeloAssignment_0"


    // $ANTLR start "rule__Documento__PathOclAssignment_1"
    // InternalGramatica.g:1100:1: rule__Documento__PathOclAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Documento__PathOclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1104:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1105:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1105:2: ( RULE_STRING )
            // InternalGramatica.g:1106:3: RULE_STRING
            {
             before(grammarAccess.getDocumentoAccess().getPathOclSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getPathOclSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Documento__PathOclAssignment_1"


    // $ANTLR start "rule__Documento__OracionesAssignment_2"
    // InternalGramatica.g:1115:1: rule__Documento__OracionesAssignment_2 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1119:1: ( ( ruleOracion ) )
            // InternalGramatica.g:1120:2: ( ruleOracion )
            {
            // InternalGramatica.g:1120:2: ( ruleOracion )
            // InternalGramatica.g:1121:3: ruleOracion
            {
             before(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOracion();

            state._fsp--;

             after(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Documento__OracionesAssignment_2"


    // $ANTLR start "rule__Oracion__ContenidoAssignment_0"
    // InternalGramatica.g:1130:1: rule__Oracion__ContenidoAssignment_0 : ( ( rule__Oracion__ContenidoAlternatives_0_0 ) ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1134:1: ( ( ( rule__Oracion__ContenidoAlternatives_0_0 ) ) )
            // InternalGramatica.g:1135:2: ( ( rule__Oracion__ContenidoAlternatives_0_0 ) )
            {
            // InternalGramatica.g:1135:2: ( ( rule__Oracion__ContenidoAlternatives_0_0 ) )
            // InternalGramatica.g:1136:3: ( rule__Oracion__ContenidoAlternatives_0_0 )
            {
             before(grammarAccess.getOracionAccess().getContenidoAlternatives_0_0()); 
            // InternalGramatica.g:1137:3: ( rule__Oracion__ContenidoAlternatives_0_0 )
            // InternalGramatica.g:1137:4: rule__Oracion__ContenidoAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Oracion__ContenidoAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOracionAccess().getContenidoAlternatives_0_0()); 

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
    // $ANTLR end "rule__Oracion__ContenidoAssignment_0"


    // $ANTLR start "rule__Simple__DeterminanteAssignment_0"
    // InternalGramatica.g:1145:1: rule__Simple__DeterminanteAssignment_0 : ( ruleDeterminante ) ;
    public final void rule__Simple__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1149:1: ( ( ruleDeterminante ) )
            // InternalGramatica.g:1150:2: ( ruleDeterminante )
            {
            // InternalGramatica.g:1150:2: ( ruleDeterminante )
            // InternalGramatica.g:1151:3: ruleDeterminante
            {
             before(grammarAccess.getSimpleAccess().getDeterminanteDeterminanteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeterminante();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getDeterminanteDeterminanteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Simple__DeterminanteAssignment_0"


    // $ANTLR start "rule__Simple__AtributoAssignment_1"
    // InternalGramatica.g:1160:1: rule__Simple__AtributoAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1164:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1165:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1165:2: ( ruleAtributo )
            // InternalGramatica.g:1166:3: ruleAtributo
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


    // $ANTLR start "rule__Simple__SintagmaAssignment_2"
    // InternalGramatica.g:1175:1: rule__Simple__SintagmaAssignment_2 : ( ruleSintagmaPreposicional ) ;
    public final void rule__Simple__SintagmaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1179:1: ( ( ruleSintagmaPreposicional ) )
            // InternalGramatica.g:1180:2: ( ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:1180:2: ( ruleSintagmaPreposicional )
            // InternalGramatica.g:1181:3: ruleSintagmaPreposicional
            {
             before(grammarAccess.getSimpleAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSintagmaPreposicional();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Simple__SintagmaAssignment_2"


    // $ANTLR start "rule__Simple__ObligacionAssignment_3"
    // InternalGramatica.g:1190:1: rule__Simple__ObligacionAssignment_3 : ( ruleObligacion ) ;
    public final void rule__Simple__ObligacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1194:1: ( ( ruleObligacion ) )
            // InternalGramatica.g:1195:2: ( ruleObligacion )
            {
            // InternalGramatica.g:1195:2: ( ruleObligacion )
            // InternalGramatica.g:1196:3: ruleObligacion
            {
             before(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObligacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Simple__ObligacionAssignment_3"


    // $ANTLR start "rule__Simple__OperacionAssignment_4"
    // InternalGramatica.g:1205:1: rule__Simple__OperacionAssignment_4 : ( ruleOperacion ) ;
    public final void rule__Simple__OperacionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1209:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:1210:2: ( ruleOperacion )
            {
            // InternalGramatica.g:1210:2: ( ruleOperacion )
            // InternalGramatica.g:1211:3: ruleOperacion
            {
             before(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Simple__OperacionAssignment_4"


    // $ANTLR start "rule__Simple__LiteralAssignment_5"
    // InternalGramatica.g:1220:1: rule__Simple__LiteralAssignment_5 : ( ruleLiteral ) ;
    public final void rule__Simple__LiteralAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1224:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:1225:2: ( ruleLiteral )
            {
            // InternalGramatica.g:1225:2: ( ruleLiteral )
            // InternalGramatica.g:1226:3: ruleLiteral
            {
             before(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Simple__LiteralAssignment_5"


    // $ANTLR start "rule__Compuesta__SimpleAssignment_0"
    // InternalGramatica.g:1235:1: rule__Compuesta__SimpleAssignment_0 : ( ruleSimple ) ;
    public final void rule__Compuesta__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1239:1: ( ( ruleSimple ) )
            // InternalGramatica.g:1240:2: ( ruleSimple )
            {
            // InternalGramatica.g:1240:2: ( ruleSimple )
            // InternalGramatica.g:1241:3: ruleSimple
            {
             before(grammarAccess.getCompuestaAccess().getSimpleSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getSimpleSimpleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Compuesta__SimpleAssignment_0"


    // $ANTLR start "rule__Compuesta__NexoAssignment_1"
    // InternalGramatica.g:1250:1: rule__Compuesta__NexoAssignment_1 : ( ruleNexo ) ;
    public final void rule__Compuesta__NexoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1254:1: ( ( ruleNexo ) )
            // InternalGramatica.g:1255:2: ( ruleNexo )
            {
            // InternalGramatica.g:1255:2: ( ruleNexo )
            // InternalGramatica.g:1256:3: ruleNexo
            {
             before(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNexo();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Compuesta__NexoAssignment_1"


    // $ANTLR start "rule__Compuesta__OracionAssignment_2"
    // InternalGramatica.g:1265:1: rule__Compuesta__OracionAssignment_2 : ( ruleOracion ) ;
    public final void rule__Compuesta__OracionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1269:1: ( ( ruleOracion ) )
            // InternalGramatica.g:1270:2: ( ruleOracion )
            {
            // InternalGramatica.g:1270:2: ( ruleOracion )
            // InternalGramatica.g:1271:3: ruleOracion
            {
             before(grammarAccess.getCompuestaAccess().getOracionOracionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOracion();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getOracionOracionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Compuesta__OracionAssignment_2"


    // $ANTLR start "rule__Nexo__ValorAssignment"
    // InternalGramatica.g:1280:1: rule__Nexo__ValorAssignment : ( ( rule__Nexo__ValorAlternatives_0 ) ) ;
    public final void rule__Nexo__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1284:1: ( ( ( rule__Nexo__ValorAlternatives_0 ) ) )
            // InternalGramatica.g:1285:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            {
            // InternalGramatica.g:1285:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            // InternalGramatica.g:1286:3: ( rule__Nexo__ValorAlternatives_0 )
            {
             before(grammarAccess.getNexoAccess().getValorAlternatives_0()); 
            // InternalGramatica.g:1287:3: ( rule__Nexo__ValorAlternatives_0 )
            // InternalGramatica.g:1287:4: rule__Nexo__ValorAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__ValorAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getValorAlternatives_0()); 

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
    // $ANTLR end "rule__Nexo__ValorAssignment"


    // $ANTLR start "rule__Determinante__ValorAssignment"
    // InternalGramatica.g:1295:1: rule__Determinante__ValorAssignment : ( ( 'El/La' ) ) ;
    public final void rule__Determinante__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1299:1: ( ( ( 'El/La' ) ) )
            // InternalGramatica.g:1300:2: ( ( 'El/La' ) )
            {
            // InternalGramatica.g:1300:2: ( ( 'El/La' ) )
            // InternalGramatica.g:1301:3: ( 'El/La' )
            {
             before(grammarAccess.getDeterminanteAccess().getValorElLaKeyword_0()); 
            // InternalGramatica.g:1302:3: ( 'El/La' )
            // InternalGramatica.g:1303:4: 'El/La'
            {
             before(grammarAccess.getDeterminanteAccess().getValorElLaKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeterminanteAccess().getValorElLaKeyword_0()); 

            }

             after(grammarAccess.getDeterminanteAccess().getValorElLaKeyword_0()); 

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
    // $ANTLR end "rule__Determinante__ValorAssignment"


    // $ANTLR start "rule__Atributo__NombreAssignment"
    // InternalGramatica.g:1314:1: rule__Atributo__NombreAssignment : ( RULE_ID ) ;
    public final void rule__Atributo__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1318:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1319:2: ( RULE_ID )
            {
            // InternalGramatica.g:1319:2: ( RULE_ID )
            // InternalGramatica.g:1320:3: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Atributo__NombreAssignment"


    // $ANTLR start "rule__SintagmaPreposicional__EnlaceAssignment_0"
    // InternalGramatica.g:1329:1: rule__SintagmaPreposicional__EnlaceAssignment_0 : ( ruleEnlace ) ;
    public final void rule__SintagmaPreposicional__EnlaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1333:1: ( ( ruleEnlace ) )
            // InternalGramatica.g:1334:2: ( ruleEnlace )
            {
            // InternalGramatica.g:1334:2: ( ruleEnlace )
            // InternalGramatica.g:1335:3: ruleEnlace
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceEnlaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnlace();

            state._fsp--;

             after(grammarAccess.getSintagmaPreposicionalAccess().getEnlaceEnlaceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SintagmaPreposicional__EnlaceAssignment_0"


    // $ANTLR start "rule__SintagmaPreposicional__TerminoAssignment_1"
    // InternalGramatica.g:1344:1: rule__SintagmaPreposicional__TerminoAssignment_1 : ( ruleTermino ) ;
    public final void rule__SintagmaPreposicional__TerminoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1348:1: ( ( ruleTermino ) )
            // InternalGramatica.g:1349:2: ( ruleTermino )
            {
            // InternalGramatica.g:1349:2: ( ruleTermino )
            // InternalGramatica.g:1350:3: ruleTermino
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getTerminoTerminoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTermino();

            state._fsp--;

             after(grammarAccess.getSintagmaPreposicionalAccess().getTerminoTerminoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SintagmaPreposicional__TerminoAssignment_1"


    // $ANTLR start "rule__Enlace__ValorAssignment"
    // InternalGramatica.g:1359:1: rule__Enlace__ValorAssignment : ( ( 'de' ) ) ;
    public final void rule__Enlace__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1363:1: ( ( ( 'de' ) ) )
            // InternalGramatica.g:1364:2: ( ( 'de' ) )
            {
            // InternalGramatica.g:1364:2: ( ( 'de' ) )
            // InternalGramatica.g:1365:3: ( 'de' )
            {
             before(grammarAccess.getEnlaceAccess().getValorDeKeyword_0()); 
            // InternalGramatica.g:1366:3: ( 'de' )
            // InternalGramatica.g:1367:4: 'de'
            {
             before(grammarAccess.getEnlaceAccess().getValorDeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnlaceAccess().getValorDeKeyword_0()); 

            }

             after(grammarAccess.getEnlaceAccess().getValorDeKeyword_0()); 

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
    // $ANTLR end "rule__Enlace__ValorAssignment"


    // $ANTLR start "rule__Termino__IndeterminanteAssignment_0"
    // InternalGramatica.g:1378:1: rule__Termino__IndeterminanteAssignment_0 : ( ruleIndeterminante ) ;
    public final void rule__Termino__IndeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1382:1: ( ( ruleIndeterminante ) )
            // InternalGramatica.g:1383:2: ( ruleIndeterminante )
            {
            // InternalGramatica.g:1383:2: ( ruleIndeterminante )
            // InternalGramatica.g:1384:3: ruleIndeterminante
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteIndeterminanteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIndeterminante();

            state._fsp--;

             after(grammarAccess.getTerminoAccess().getIndeterminanteIndeterminanteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Termino__IndeterminanteAssignment_0"


    // $ANTLR start "rule__Termino__ContextoAssignment_1"
    // InternalGramatica.g:1393:1: rule__Termino__ContextoAssignment_1 : ( ruleContexto ) ;
    public final void rule__Termino__ContextoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1397:1: ( ( ruleContexto ) )
            // InternalGramatica.g:1398:2: ( ruleContexto )
            {
            // InternalGramatica.g:1398:2: ( ruleContexto )
            // InternalGramatica.g:1399:3: ruleContexto
            {
             before(grammarAccess.getTerminoAccess().getContextoContextoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContexto();

            state._fsp--;

             after(grammarAccess.getTerminoAccess().getContextoContextoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Termino__ContextoAssignment_1"


    // $ANTLR start "rule__Indeterminante__ValorAssignment"
    // InternalGramatica.g:1408:1: rule__Indeterminante__ValorAssignment : ( ( 'un/una' ) ) ;
    public final void rule__Indeterminante__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1412:1: ( ( ( 'un/una' ) ) )
            // InternalGramatica.g:1413:2: ( ( 'un/una' ) )
            {
            // InternalGramatica.g:1413:2: ( ( 'un/una' ) )
            // InternalGramatica.g:1414:3: ( 'un/una' )
            {
             before(grammarAccess.getIndeterminanteAccess().getValorUnUnaKeyword_0()); 
            // InternalGramatica.g:1415:3: ( 'un/una' )
            // InternalGramatica.g:1416:4: 'un/una'
            {
             before(grammarAccess.getIndeterminanteAccess().getValorUnUnaKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIndeterminanteAccess().getValorUnUnaKeyword_0()); 

            }

             after(grammarAccess.getIndeterminanteAccess().getValorUnUnaKeyword_0()); 

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
    // $ANTLR end "rule__Indeterminante__ValorAssignment"


    // $ANTLR start "rule__Obligacion__NegacionAssignment_0"
    // InternalGramatica.g:1427:1: rule__Obligacion__NegacionAssignment_0 : ( ( 'no' ) ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1431:1: ( ( ( 'no' ) ) )
            // InternalGramatica.g:1432:2: ( ( 'no' ) )
            {
            // InternalGramatica.g:1432:2: ( ( 'no' ) )
            // InternalGramatica.g:1433:3: ( 'no' )
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            // InternalGramatica.g:1434:3: ( 'no' )
            // InternalGramatica.g:1435:4: 'no'
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 

            }

             after(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 

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
    // $ANTLR end "rule__Obligacion__NegacionAssignment_0"


    // $ANTLR start "rule__Obligacion__ObligacionDeberAssignment_1"
    // InternalGramatica.g:1446:1: rule__Obligacion__ObligacionDeberAssignment_1 : ( ( 'debe ser' ) ) ;
    public final void rule__Obligacion__ObligacionDeberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1450:1: ( ( ( 'debe ser' ) ) )
            // InternalGramatica.g:1451:2: ( ( 'debe ser' ) )
            {
            // InternalGramatica.g:1451:2: ( ( 'debe ser' ) )
            // InternalGramatica.g:1452:3: ( 'debe ser' )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberDebeSerKeyword_1_0()); 
            // InternalGramatica.g:1453:3: ( 'debe ser' )
            // InternalGramatica.g:1454:4: 'debe ser'
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberDebeSerKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObligacionAccess().getObligacionDeberDebeSerKeyword_1_0()); 

            }

             after(grammarAccess.getObligacionAccess().getObligacionDeberDebeSerKeyword_1_0()); 

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
    // $ANTLR end "rule__Obligacion__ObligacionDeberAssignment_1"


    // $ANTLR start "rule__Operacion__DescripcionAssignment"
    // InternalGramatica.g:1465:1: rule__Operacion__DescripcionAssignment : ( ( rule__Operacion__DescripcionAlternatives_0 ) ) ;
    public final void rule__Operacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1469:1: ( ( ( rule__Operacion__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1470:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1470:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1471:3: ( rule__Operacion__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1472:3: ( rule__Operacion__DescripcionAlternatives_0 )
            // InternalGramatica.g:1472:4: rule__Operacion__DescripcionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__DescripcionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getDescripcionAlternatives_0()); 

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
    // $ANTLR end "rule__Operacion__DescripcionAssignment"


    // $ANTLR start "rule__Contexto__NombreAssignment"
    // InternalGramatica.g:1480:1: rule__Contexto__NombreAssignment : ( RULE_ID ) ;
    public final void rule__Contexto__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1484:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1485:2: ( RULE_ID )
            {
            // InternalGramatica.g:1485:2: ( RULE_ID )
            // InternalGramatica.g:1486:3: RULE_ID
            {
             before(grammarAccess.getContextoAccess().getNombreIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextoAccess().getNombreIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Contexto__NombreAssignment"


    // $ANTLR start "rule__Literal__ValorAssignment"
    // InternalGramatica.g:1495:1: rule__Literal__ValorAssignment : ( RULE_STRING ) ;
    public final void rule__Literal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1499:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1500:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1500:2: ( RULE_STRING )
            // InternalGramatica.g:1501:3: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getValorSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getValorSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Literal__ValorAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\25\1\5\1\26\1\27\1\5\1\30\1\31\1\16\7\4\1\13\2\uffff";
    static final String dfa_3s = "\1\25\1\5\1\26\1\27\1\5\2\31\1\24\7\4\1\15\2\uffff";
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
            "\1\21\2\20",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "452:1: rule__Oracion__ContenidoAlternatives_0_0 : ( ( ruleCompuesta ) | ( ruleSimple ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});

}