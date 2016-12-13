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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'El/La'", "'Los/Las'", "'debe ser'", "'debe estar'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'o'", "'Coleccion de'", "'de un/una'", "'no'", "'y'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
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


    // $ANTLR start "entryRuleDeterminante"
    // InternalGramatica.g:128:1: entryRuleDeterminante : ruleDeterminante EOF ;
    public final void entryRuleDeterminante() throws RecognitionException {
        try {
            // InternalGramatica.g:129:1: ( ruleDeterminante EOF )
            // InternalGramatica.g:130:1: ruleDeterminante EOF
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
    // InternalGramatica.g:137:1: ruleDeterminante : ( ( rule__Determinante__DescripcionAssignment ) ) ;
    public final void ruleDeterminante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:141:2: ( ( ( rule__Determinante__DescripcionAssignment ) ) )
            // InternalGramatica.g:142:2: ( ( rule__Determinante__DescripcionAssignment ) )
            {
            // InternalGramatica.g:142:2: ( ( rule__Determinante__DescripcionAssignment ) )
            // InternalGramatica.g:143:3: ( rule__Determinante__DescripcionAssignment )
            {
             before(grammarAccess.getDeterminanteAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:144:3: ( rule__Determinante__DescripcionAssignment )
            // InternalGramatica.g:144:4: rule__Determinante__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Determinante__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeterminanteAccess().getDescripcionAssignment()); 

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


    // $ANTLR start "entryRuleSintagmaPreposicional"
    // InternalGramatica.g:178:1: entryRuleSintagmaPreposicional : ruleSintagmaPreposicional EOF ;
    public final void entryRuleSintagmaPreposicional() throws RecognitionException {
        try {
            // InternalGramatica.g:179:1: ( ruleSintagmaPreposicional EOF )
            // InternalGramatica.g:180:1: ruleSintagmaPreposicional EOF
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
    // InternalGramatica.g:187:1: ruleSintagmaPreposicional : ( ( rule__SintagmaPreposicional__DescripcionAssignment ) ) ;
    public final void ruleSintagmaPreposicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:191:2: ( ( ( rule__SintagmaPreposicional__DescripcionAssignment ) ) )
            // InternalGramatica.g:192:2: ( ( rule__SintagmaPreposicional__DescripcionAssignment ) )
            {
            // InternalGramatica.g:192:2: ( ( rule__SintagmaPreposicional__DescripcionAssignment ) )
            // InternalGramatica.g:193:3: ( rule__SintagmaPreposicional__DescripcionAssignment )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:194:3: ( rule__SintagmaPreposicional__DescripcionAssignment )
            // InternalGramatica.g:194:4: rule__SintagmaPreposicional__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SintagmaPreposicional__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionAssignment()); 

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


    // $ANTLR start "entryRuleObligacion"
    // InternalGramatica.g:203:1: entryRuleObligacion : ruleObligacion EOF ;
    public final void entryRuleObligacion() throws RecognitionException {
        try {
            // InternalGramatica.g:204:1: ( ruleObligacion EOF )
            // InternalGramatica.g:205:1: ruleObligacion EOF
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
    // InternalGramatica.g:212:1: ruleObligacion : ( ( rule__Obligacion__Group__0 ) ) ;
    public final void ruleObligacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:216:2: ( ( ( rule__Obligacion__Group__0 ) ) )
            // InternalGramatica.g:217:2: ( ( rule__Obligacion__Group__0 ) )
            {
            // InternalGramatica.g:217:2: ( ( rule__Obligacion__Group__0 ) )
            // InternalGramatica.g:218:3: ( rule__Obligacion__Group__0 )
            {
             before(grammarAccess.getObligacionAccess().getGroup()); 
            // InternalGramatica.g:219:3: ( rule__Obligacion__Group__0 )
            // InternalGramatica.g:219:4: rule__Obligacion__Group__0
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


    // $ANTLR start "entryRuleObligacionDeber"
    // InternalGramatica.g:228:1: entryRuleObligacionDeber : ruleObligacionDeber EOF ;
    public final void entryRuleObligacionDeber() throws RecognitionException {
        try {
            // InternalGramatica.g:229:1: ( ruleObligacionDeber EOF )
            // InternalGramatica.g:230:1: ruleObligacionDeber EOF
            {
             before(grammarAccess.getObligacionDeberRule()); 
            pushFollow(FOLLOW_1);
            ruleObligacionDeber();

            state._fsp--;

             after(grammarAccess.getObligacionDeberRule()); 
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
    // $ANTLR end "entryRuleObligacionDeber"


    // $ANTLR start "ruleObligacionDeber"
    // InternalGramatica.g:237:1: ruleObligacionDeber : ( ( rule__ObligacionDeber__DescripcionAssignment ) ) ;
    public final void ruleObligacionDeber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:241:2: ( ( ( rule__ObligacionDeber__DescripcionAssignment ) ) )
            // InternalGramatica.g:242:2: ( ( rule__ObligacionDeber__DescripcionAssignment ) )
            {
            // InternalGramatica.g:242:2: ( ( rule__ObligacionDeber__DescripcionAssignment ) )
            // InternalGramatica.g:243:3: ( rule__ObligacionDeber__DescripcionAssignment )
            {
             before(grammarAccess.getObligacionDeberAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:244:3: ( rule__ObligacionDeber__DescripcionAssignment )
            // InternalGramatica.g:244:4: rule__ObligacionDeber__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ObligacionDeber__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getObligacionDeberAccess().getDescripcionAssignment()); 

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
    // $ANTLR end "ruleObligacionDeber"


    // $ANTLR start "entryRuleNegacion"
    // InternalGramatica.g:253:1: entryRuleNegacion : ruleNegacion EOF ;
    public final void entryRuleNegacion() throws RecognitionException {
        try {
            // InternalGramatica.g:254:1: ( ruleNegacion EOF )
            // InternalGramatica.g:255:1: ruleNegacion EOF
            {
             before(grammarAccess.getNegacionRule()); 
            pushFollow(FOLLOW_1);
            ruleNegacion();

            state._fsp--;

             after(grammarAccess.getNegacionRule()); 
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
    // $ANTLR end "entryRuleNegacion"


    // $ANTLR start "ruleNegacion"
    // InternalGramatica.g:262:1: ruleNegacion : ( ( rule__Negacion__DescripcionAssignment ) ) ;
    public final void ruleNegacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:266:2: ( ( ( rule__Negacion__DescripcionAssignment ) ) )
            // InternalGramatica.g:267:2: ( ( rule__Negacion__DescripcionAssignment ) )
            {
            // InternalGramatica.g:267:2: ( ( rule__Negacion__DescripcionAssignment ) )
            // InternalGramatica.g:268:3: ( rule__Negacion__DescripcionAssignment )
            {
             before(grammarAccess.getNegacionAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:269:3: ( rule__Negacion__DescripcionAssignment )
            // InternalGramatica.g:269:4: rule__Negacion__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Negacion__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNegacionAccess().getDescripcionAssignment()); 

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
    // $ANTLR end "ruleNegacion"


    // $ANTLR start "entryRuleOperacion"
    // InternalGramatica.g:278:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalGramatica.g:279:1: ( ruleOperacion EOF )
            // InternalGramatica.g:280:1: ruleOperacion EOF
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
    // InternalGramatica.g:287:1: ruleOperacion : ( ( rule__Operacion__DescripcionAssignment ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:291:2: ( ( ( rule__Operacion__DescripcionAssignment ) ) )
            // InternalGramatica.g:292:2: ( ( rule__Operacion__DescripcionAssignment ) )
            {
            // InternalGramatica.g:292:2: ( ( rule__Operacion__DescripcionAssignment ) )
            // InternalGramatica.g:293:3: ( rule__Operacion__DescripcionAssignment )
            {
             before(grammarAccess.getOperacionAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:294:3: ( rule__Operacion__DescripcionAssignment )
            // InternalGramatica.g:294:4: rule__Operacion__DescripcionAssignment
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


    // $ANTLR start "entryRuleClase"
    // InternalGramatica.g:303:1: entryRuleClase : ruleClase EOF ;
    public final void entryRuleClase() throws RecognitionException {
        try {
            // InternalGramatica.g:304:1: ( ruleClase EOF )
            // InternalGramatica.g:305:1: ruleClase EOF
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
    // InternalGramatica.g:312:1: ruleClase : ( ( rule__Clase__NameAssignment ) ) ;
    public final void ruleClase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:316:2: ( ( ( rule__Clase__NameAssignment ) ) )
            // InternalGramatica.g:317:2: ( ( rule__Clase__NameAssignment ) )
            {
            // InternalGramatica.g:317:2: ( ( rule__Clase__NameAssignment ) )
            // InternalGramatica.g:318:3: ( rule__Clase__NameAssignment )
            {
             before(grammarAccess.getClaseAccess().getNameAssignment()); 
            // InternalGramatica.g:319:3: ( rule__Clase__NameAssignment )
            // InternalGramatica.g:319:4: rule__Clase__NameAssignment
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
    // InternalGramatica.g:328:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalGramatica.g:329:1: ( ruleLiteral EOF )
            // InternalGramatica.g:330:1: ruleLiteral EOF
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
    // InternalGramatica.g:337:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:341:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalGramatica.g:342:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalGramatica.g:342:2: ( ( rule__Literal__Alternatives ) )
            // InternalGramatica.g:343:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalGramatica.g:344:3: ( rule__Literal__Alternatives )
            // InternalGramatica.g:344:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:353:1: entryRuleFinOracion : ruleFinOracion EOF ;
    public final void entryRuleFinOracion() throws RecognitionException {
        try {
            // InternalGramatica.g:354:1: ( ruleFinOracion EOF )
            // InternalGramatica.g:355:1: ruleFinOracion EOF
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
    // InternalGramatica.g:362:1: ruleFinOracion : ( '.' ) ;
    public final void ruleFinOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:366:2: ( ( '.' ) )
            // InternalGramatica.g:367:2: ( '.' )
            {
            // InternalGramatica.g:367:2: ( '.' )
            // InternalGramatica.g:368:3: '.'
            {
             before(grammarAccess.getFinOracionAccess().getFullStopKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFinOracionAccess().getFullStopKeyword()); 

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
    // InternalGramatica.g:378:1: entryRuleCompuesta : ruleCompuesta EOF ;
    public final void entryRuleCompuesta() throws RecognitionException {
        try {
            // InternalGramatica.g:379:1: ( ruleCompuesta EOF )
            // InternalGramatica.g:380:1: ruleCompuesta EOF
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
    // InternalGramatica.g:387:1: ruleCompuesta : ( ( rule__Compuesta__Group__0 ) ) ;
    public final void ruleCompuesta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:391:2: ( ( ( rule__Compuesta__Group__0 ) ) )
            // InternalGramatica.g:392:2: ( ( rule__Compuesta__Group__0 ) )
            {
            // InternalGramatica.g:392:2: ( ( rule__Compuesta__Group__0 ) )
            // InternalGramatica.g:393:3: ( rule__Compuesta__Group__0 )
            {
             before(grammarAccess.getCompuestaAccess().getGroup()); 
            // InternalGramatica.g:394:3: ( rule__Compuesta__Group__0 )
            // InternalGramatica.g:394:4: rule__Compuesta__Group__0
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
    // InternalGramatica.g:403:1: entryRuleNexo : ruleNexo EOF ;
    public final void entryRuleNexo() throws RecognitionException {
        try {
            // InternalGramatica.g:404:1: ( ruleNexo EOF )
            // InternalGramatica.g:405:1: ruleNexo EOF
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
    // InternalGramatica.g:412:1: ruleNexo : ( ( rule__Nexo__Alternatives ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:416:2: ( ( ( rule__Nexo__Alternatives ) ) )
            // InternalGramatica.g:417:2: ( ( rule__Nexo__Alternatives ) )
            {
            // InternalGramatica.g:417:2: ( ( rule__Nexo__Alternatives ) )
            // InternalGramatica.g:418:3: ( rule__Nexo__Alternatives )
            {
             before(grammarAccess.getNexoAccess().getAlternatives()); 
            // InternalGramatica.g:419:3: ( rule__Nexo__Alternatives )
            // InternalGramatica.g:419:4: rule__Nexo__Alternatives
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


    // $ANTLR start "rule__Oracion__Alternatives"
    // InternalGramatica.g:427:1: rule__Oracion__Alternatives : ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) | ( ruleCompuesta ) );
    public final void rule__Oracion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:431:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) | ( ruleCompuesta ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGramatica.g:432:2: ( ( rule__Oracion__ContenidoAssignment_0 ) )
                    {
                    // InternalGramatica.g:432:2: ( ( rule__Oracion__ContenidoAssignment_0 ) )
                    // InternalGramatica.g:433:3: ( rule__Oracion__ContenidoAssignment_0 )
                    {
                     before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
                    // InternalGramatica.g:434:3: ( rule__Oracion__ContenidoAssignment_0 )
                    // InternalGramatica.g:434:4: rule__Oracion__ContenidoAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracion__ContenidoAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:438:2: ( ruleCompuesta )
                    {
                    // InternalGramatica.g:438:2: ( ruleCompuesta )
                    // InternalGramatica.g:439:3: ruleCompuesta
                    {
                     before(grammarAccess.getOracionAccess().getCompuestaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompuesta();

                    state._fsp--;

                     after(grammarAccess.getOracionAccess().getCompuestaParserRuleCall_1()); 

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


    // $ANTLR start "rule__Simple__Alternatives_6"
    // InternalGramatica.g:448:1: rule__Simple__Alternatives_6 : ( ( ( rule__Simple__LiteralAssignment_6_0 ) ) | ( ( rule__Simple__AtributoAssignment_6_1 ) ) );
    public final void rule__Simple__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:452:1: ( ( ( rule__Simple__LiteralAssignment_6_0 ) ) | ( ( rule__Simple__AtributoAssignment_6_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:453:2: ( ( rule__Simple__LiteralAssignment_6_0 ) )
                    {
                    // InternalGramatica.g:453:2: ( ( rule__Simple__LiteralAssignment_6_0 ) )
                    // InternalGramatica.g:454:3: ( rule__Simple__LiteralAssignment_6_0 )
                    {
                     before(grammarAccess.getSimpleAccess().getLiteralAssignment_6_0()); 
                    // InternalGramatica.g:455:3: ( rule__Simple__LiteralAssignment_6_0 )
                    // InternalGramatica.g:455:4: rule__Simple__LiteralAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__LiteralAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAccess().getLiteralAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:459:2: ( ( rule__Simple__AtributoAssignment_6_1 ) )
                    {
                    // InternalGramatica.g:459:2: ( ( rule__Simple__AtributoAssignment_6_1 ) )
                    // InternalGramatica.g:460:3: ( rule__Simple__AtributoAssignment_6_1 )
                    {
                     before(grammarAccess.getSimpleAccess().getAtributoAssignment_6_1()); 
                    // InternalGramatica.g:461:3: ( rule__Simple__AtributoAssignment_6_1 )
                    // InternalGramatica.g:461:4: rule__Simple__AtributoAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__AtributoAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAccess().getAtributoAssignment_6_1()); 

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
    // $ANTLR end "rule__Simple__Alternatives_6"


    // $ANTLR start "rule__Determinante__DescripcionAlternatives_0"
    // InternalGramatica.g:469:1: rule__Determinante__DescripcionAlternatives_0 : ( ( 'El/La' ) | ( 'Los/Las' ) );
    public final void rule__Determinante__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:473:1: ( ( 'El/La' ) | ( 'Los/Las' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:474:2: ( 'El/La' )
                    {
                    // InternalGramatica.g:474:2: ( 'El/La' )
                    // InternalGramatica.g:475:3: 'El/La'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:480:2: ( 'Los/Las' )
                    {
                    // InternalGramatica.g:480:2: ( 'Los/Las' )
                    // InternalGramatica.g:481:3: 'Los/Las'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1()); 

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
    // $ANTLR end "rule__Determinante__DescripcionAlternatives_0"


    // $ANTLR start "rule__ObligacionDeber__DescripcionAlternatives_0"
    // InternalGramatica.g:490:1: rule__ObligacionDeber__DescripcionAlternatives_0 : ( ( 'debe ser' ) | ( 'debe estar' ) );
    public final void rule__ObligacionDeber__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:494:1: ( ( 'debe ser' ) | ( 'debe estar' ) )
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
                    // InternalGramatica.g:495:2: ( 'debe ser' )
                    {
                    // InternalGramatica.g:495:2: ( 'debe ser' )
                    // InternalGramatica.g:496:3: 'debe ser'
                    {
                     before(grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:501:2: ( 'debe estar' )
                    {
                    // InternalGramatica.g:501:2: ( 'debe estar' )
                    // InternalGramatica.g:502:3: 'debe estar'
                    {
                     before(grammarAccess.getObligacionDeberAccess().getDescripcionDebeEstarKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getObligacionDeberAccess().getDescripcionDebeEstarKeyword_0_1()); 

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
    // $ANTLR end "rule__ObligacionDeber__DescripcionAlternatives_0"


    // $ANTLR start "rule__Operacion__DescripcionAlternatives_0"
    // InternalGramatica.g:511:1: rule__Operacion__DescripcionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Operacion__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:515:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            case 22:
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
                    // InternalGramatica.g:516:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:516:2: ( 'mayor que' )
                    // InternalGramatica.g:517:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:522:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:522:2: ( 'menor que' )
                    // InternalGramatica.g:523:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:528:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:528:2: ( 'igual a' )
                    // InternalGramatica.g:529:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:534:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:534:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:535:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:540:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:540:2: ( 'menor o igual a' )
                    // InternalGramatica.g:541:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:546:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:546:2: ( 'distinto de' )
                    // InternalGramatica.g:547:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:552:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:552:2: ( 'al menos' )
                    // InternalGramatica.g:553:3: 'al menos'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_6()); 
                    match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalGramatica.g:562:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:566:1: ( ( RULE_INT ) | ( RULE_STRING ) )
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
                    // InternalGramatica.g:567:2: ( RULE_INT )
                    {
                    // InternalGramatica.g:567:2: ( RULE_INT )
                    // InternalGramatica.g:568:3: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:573:2: ( RULE_STRING )
                    {
                    // InternalGramatica.g:573:2: ( RULE_STRING )
                    // InternalGramatica.g:574:3: RULE_STRING
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


    // $ANTLR start "rule__Nexo__Alternatives"
    // InternalGramatica.g:583:1: rule__Nexo__Alternatives : ( ( ( rule__Nexo__DescripcionAssignment_0 ) ) | ( 'o' ) );
    public final void rule__Nexo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:587:1: ( ( ( rule__Nexo__DescripcionAssignment_0 ) ) | ( 'o' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:588:2: ( ( rule__Nexo__DescripcionAssignment_0 ) )
                    {
                    // InternalGramatica.g:588:2: ( ( rule__Nexo__DescripcionAssignment_0 ) )
                    // InternalGramatica.g:589:3: ( rule__Nexo__DescripcionAssignment_0 )
                    {
                     before(grammarAccess.getNexoAccess().getDescripcionAssignment_0()); 
                    // InternalGramatica.g:590:3: ( rule__Nexo__DescripcionAssignment_0 )
                    // InternalGramatica.g:590:4: rule__Nexo__DescripcionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nexo__DescripcionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNexoAccess().getDescripcionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:594:2: ( 'o' )
                    {
                    // InternalGramatica.g:594:2: ( 'o' )
                    // InternalGramatica.g:595:3: 'o'
                    {
                     before(grammarAccess.getNexoAccess().getOKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getOKeyword_1()); 

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


    // $ANTLR start "rule__Documento__Group__0"
    // InternalGramatica.g:604:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:608:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalGramatica.g:609:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
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
    // InternalGramatica.g:616:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__PathModeloAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:620:1: ( ( ( rule__Documento__PathModeloAssignment_0 ) ) )
            // InternalGramatica.g:621:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            {
            // InternalGramatica.g:621:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            // InternalGramatica.g:622:2: ( rule__Documento__PathModeloAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); 
            // InternalGramatica.g:623:2: ( rule__Documento__PathModeloAssignment_0 )
            // InternalGramatica.g:623:3: rule__Documento__PathModeloAssignment_0
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
    // InternalGramatica.g:631:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:635:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalGramatica.g:636:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
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
    // InternalGramatica.g:643:1: rule__Documento__Group__1__Impl : ( ( rule__Documento__PathOclAssignment_1 ) ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:647:1: ( ( ( rule__Documento__PathOclAssignment_1 ) ) )
            // InternalGramatica.g:648:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            {
            // InternalGramatica.g:648:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            // InternalGramatica.g:649:2: ( rule__Documento__PathOclAssignment_1 )
            {
             before(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); 
            // InternalGramatica.g:650:2: ( rule__Documento__PathOclAssignment_1 )
            // InternalGramatica.g:650:3: rule__Documento__PathOclAssignment_1
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
    // InternalGramatica.g:658:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:662:1: ( rule__Documento__Group__2__Impl )
            // InternalGramatica.g:663:2: rule__Documento__Group__2__Impl
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
    // InternalGramatica.g:669:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__OracionesAssignment_2 )* ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:673:1: ( ( ( rule__Documento__OracionesAssignment_2 )* ) )
            // InternalGramatica.g:674:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            {
            // InternalGramatica.g:674:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            // InternalGramatica.g:675:2: ( rule__Documento__OracionesAssignment_2 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 
            // InternalGramatica.g:676:2: ( rule__Documento__OracionesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=12 && LA8_0<=13)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGramatica.g:676:3: rule__Documento__OracionesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Documento__OracionesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__Simple__Group__0"
    // InternalGramatica.g:685:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:689:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:690:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGramatica.g:697:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__DeterminanteAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:701:1: ( ( ( rule__Simple__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:702:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:702:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:703:2: ( rule__Simple__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:704:2: ( rule__Simple__DeterminanteAssignment_0 )
            // InternalGramatica.g:704:3: rule__Simple__DeterminanteAssignment_0
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
    // InternalGramatica.g:712:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:716:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:717:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGramatica.g:724:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AtributoAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:728:1: ( ( ( rule__Simple__AtributoAssignment_1 ) ) )
            // InternalGramatica.g:729:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            {
            // InternalGramatica.g:729:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            // InternalGramatica.g:730:2: ( rule__Simple__AtributoAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); 
            // InternalGramatica.g:731:2: ( rule__Simple__AtributoAssignment_1 )
            // InternalGramatica.g:731:3: rule__Simple__AtributoAssignment_1
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
    // InternalGramatica.g:739:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:743:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalGramatica.g:744:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGramatica.g:751:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__SintagmaAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:755:1: ( ( ( rule__Simple__SintagmaAssignment_2 ) ) )
            // InternalGramatica.g:756:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            {
            // InternalGramatica.g:756:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            // InternalGramatica.g:757:2: ( rule__Simple__SintagmaAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getSintagmaAssignment_2()); 
            // InternalGramatica.g:758:2: ( rule__Simple__SintagmaAssignment_2 )
            // InternalGramatica.g:758:3: rule__Simple__SintagmaAssignment_2
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
    // InternalGramatica.g:766:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:770:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalGramatica.g:771:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalGramatica.g:778:1: rule__Simple__Group__3__Impl : ( ( rule__Simple__ContextoAssignment_3 ) ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:782:1: ( ( ( rule__Simple__ContextoAssignment_3 ) ) )
            // InternalGramatica.g:783:1: ( ( rule__Simple__ContextoAssignment_3 ) )
            {
            // InternalGramatica.g:783:1: ( ( rule__Simple__ContextoAssignment_3 ) )
            // InternalGramatica.g:784:2: ( rule__Simple__ContextoAssignment_3 )
            {
             before(grammarAccess.getSimpleAccess().getContextoAssignment_3()); 
            // InternalGramatica.g:785:2: ( rule__Simple__ContextoAssignment_3 )
            // InternalGramatica.g:785:3: rule__Simple__ContextoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ContextoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getContextoAssignment_3()); 

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
    // InternalGramatica.g:793:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:797:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalGramatica.g:798:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalGramatica.g:805:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__ObligacionAssignment_4 ) ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:809:1: ( ( ( rule__Simple__ObligacionAssignment_4 ) ) )
            // InternalGramatica.g:810:1: ( ( rule__Simple__ObligacionAssignment_4 ) )
            {
            // InternalGramatica.g:810:1: ( ( rule__Simple__ObligacionAssignment_4 ) )
            // InternalGramatica.g:811:2: ( rule__Simple__ObligacionAssignment_4 )
            {
             before(grammarAccess.getSimpleAccess().getObligacionAssignment_4()); 
            // InternalGramatica.g:812:2: ( rule__Simple__ObligacionAssignment_4 )
            // InternalGramatica.g:812:3: rule__Simple__ObligacionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ObligacionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getObligacionAssignment_4()); 

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
    // InternalGramatica.g:820:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl rule__Simple__Group__6 ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:824:1: ( rule__Simple__Group__5__Impl rule__Simple__Group__6 )
            // InternalGramatica.g:825:2: rule__Simple__Group__5__Impl rule__Simple__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalGramatica.g:832:1: rule__Simple__Group__5__Impl : ( ( rule__Simple__OperacionAssignment_5 )? ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:836:1: ( ( ( rule__Simple__OperacionAssignment_5 )? ) )
            // InternalGramatica.g:837:1: ( ( rule__Simple__OperacionAssignment_5 )? )
            {
            // InternalGramatica.g:837:1: ( ( rule__Simple__OperacionAssignment_5 )? )
            // InternalGramatica.g:838:2: ( rule__Simple__OperacionAssignment_5 )?
            {
             before(grammarAccess.getSimpleAccess().getOperacionAssignment_5()); 
            // InternalGramatica.g:839:2: ( rule__Simple__OperacionAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=16 && LA9_0<=22)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:839:3: rule__Simple__OperacionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__OperacionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getOperacionAssignment_5()); 

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
    // InternalGramatica.g:847:1: rule__Simple__Group__6 : rule__Simple__Group__6__Impl rule__Simple__Group__7 ;
    public final void rule__Simple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:851:1: ( rule__Simple__Group__6__Impl rule__Simple__Group__7 )
            // InternalGramatica.g:852:2: rule__Simple__Group__6__Impl rule__Simple__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalGramatica.g:859:1: rule__Simple__Group__6__Impl : ( ( rule__Simple__Alternatives_6 ) ) ;
    public final void rule__Simple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:863:1: ( ( ( rule__Simple__Alternatives_6 ) ) )
            // InternalGramatica.g:864:1: ( ( rule__Simple__Alternatives_6 ) )
            {
            // InternalGramatica.g:864:1: ( ( rule__Simple__Alternatives_6 ) )
            // InternalGramatica.g:865:2: ( rule__Simple__Alternatives_6 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_6()); 
            // InternalGramatica.g:866:2: ( rule__Simple__Alternatives_6 )
            // InternalGramatica.g:866:3: rule__Simple__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlternatives_6()); 

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
    // InternalGramatica.g:874:1: rule__Simple__Group__7 : rule__Simple__Group__7__Impl ;
    public final void rule__Simple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:878:1: ( rule__Simple__Group__7__Impl )
            // InternalGramatica.g:879:2: rule__Simple__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__7__Impl();

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
    // InternalGramatica.g:885:1: rule__Simple__Group__7__Impl : ( ( rule__Simple__FinOracionAssignment_7 )? ) ;
    public final void rule__Simple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:889:1: ( ( ( rule__Simple__FinOracionAssignment_7 )? ) )
            // InternalGramatica.g:890:1: ( ( rule__Simple__FinOracionAssignment_7 )? )
            {
            // InternalGramatica.g:890:1: ( ( rule__Simple__FinOracionAssignment_7 )? )
            // InternalGramatica.g:891:2: ( rule__Simple__FinOracionAssignment_7 )?
            {
             before(grammarAccess.getSimpleAccess().getFinOracionAssignment_7()); 
            // InternalGramatica.g:892:2: ( rule__Simple__FinOracionAssignment_7 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:892:3: rule__Simple__FinOracionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__FinOracionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getFinOracionAssignment_7()); 

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


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalGramatica.g:901:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:905:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalGramatica.g:906:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGramatica.g:913:1: rule__Atributo__Group__0__Impl : ( ( 'Coleccion de' )? ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:917:1: ( ( ( 'Coleccion de' )? ) )
            // InternalGramatica.g:918:1: ( ( 'Coleccion de' )? )
            {
            // InternalGramatica.g:918:1: ( ( 'Coleccion de' )? )
            // InternalGramatica.g:919:2: ( 'Coleccion de' )?
            {
             before(grammarAccess.getAtributoAccess().getColeccionDeKeyword_0()); 
            // InternalGramatica.g:920:2: ( 'Coleccion de' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:920:3: 'Coleccion de'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalGramatica.g:928:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:932:1: ( rule__Atributo__Group__1__Impl )
            // InternalGramatica.g:933:2: rule__Atributo__Group__1__Impl
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
    // InternalGramatica.g:939:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:943:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalGramatica.g:944:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalGramatica.g:944:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalGramatica.g:945:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalGramatica.g:946:2: ( rule__Atributo__NameAssignment_1 )
            // InternalGramatica.g:946:3: rule__Atributo__NameAssignment_1
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


    // $ANTLR start "rule__Obligacion__Group__0"
    // InternalGramatica.g:955:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:959:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalGramatica.g:960:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
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
    // InternalGramatica.g:967:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:971:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalGramatica.g:972:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalGramatica.g:972:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalGramatica.g:973:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalGramatica.g:974:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:974:3: rule__Obligacion__NegacionAssignment_0
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
    // InternalGramatica.g:982:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:986:1: ( rule__Obligacion__Group__1__Impl )
            // InternalGramatica.g:987:2: rule__Obligacion__Group__1__Impl
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
    // InternalGramatica.g:993:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:997:1: ( ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) )
            // InternalGramatica.g:998:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            {
            // InternalGramatica.g:998:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            // InternalGramatica.g:999:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberAssignment_1()); 
            // InternalGramatica.g:1000:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            // InternalGramatica.g:1000:3: rule__Obligacion__ObligacionDeberAssignment_1
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


    // $ANTLR start "rule__Compuesta__Group__0"
    // InternalGramatica.g:1009:1: rule__Compuesta__Group__0 : rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 ;
    public final void rule__Compuesta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1013:1: ( rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 )
            // InternalGramatica.g:1014:2: rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGramatica.g:1021:1: rule__Compuesta__Group__0__Impl : ( ( rule__Compuesta__SimpleAssignment_0 ) ) ;
    public final void rule__Compuesta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1025:1: ( ( ( rule__Compuesta__SimpleAssignment_0 ) ) )
            // InternalGramatica.g:1026:1: ( ( rule__Compuesta__SimpleAssignment_0 ) )
            {
            // InternalGramatica.g:1026:1: ( ( rule__Compuesta__SimpleAssignment_0 ) )
            // InternalGramatica.g:1027:2: ( rule__Compuesta__SimpleAssignment_0 )
            {
             before(grammarAccess.getCompuestaAccess().getSimpleAssignment_0()); 
            // InternalGramatica.g:1028:2: ( rule__Compuesta__SimpleAssignment_0 )
            // InternalGramatica.g:1028:3: rule__Compuesta__SimpleAssignment_0
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
    // InternalGramatica.g:1036:1: rule__Compuesta__Group__1 : rule__Compuesta__Group__1__Impl ;
    public final void rule__Compuesta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1040:1: ( rule__Compuesta__Group__1__Impl )
            // InternalGramatica.g:1041:2: rule__Compuesta__Group__1__Impl
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
    // InternalGramatica.g:1047:1: rule__Compuesta__Group__1__Impl : ( ( rule__Compuesta__NexoAssignment_1 ) ) ;
    public final void rule__Compuesta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1051:1: ( ( ( rule__Compuesta__NexoAssignment_1 ) ) )
            // InternalGramatica.g:1052:1: ( ( rule__Compuesta__NexoAssignment_1 ) )
            {
            // InternalGramatica.g:1052:1: ( ( rule__Compuesta__NexoAssignment_1 ) )
            // InternalGramatica.g:1053:2: ( rule__Compuesta__NexoAssignment_1 )
            {
             before(grammarAccess.getCompuestaAccess().getNexoAssignment_1()); 
            // InternalGramatica.g:1054:2: ( rule__Compuesta__NexoAssignment_1 )
            // InternalGramatica.g:1054:3: rule__Compuesta__NexoAssignment_1
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


    // $ANTLR start "rule__Documento__PathModeloAssignment_0"
    // InternalGramatica.g:1063:1: rule__Documento__PathModeloAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Documento__PathModeloAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1067:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1068:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1068:2: ( RULE_STRING )
            // InternalGramatica.g:1069:3: RULE_STRING
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
    // InternalGramatica.g:1078:1: rule__Documento__PathOclAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Documento__PathOclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1082:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1083:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1083:2: ( RULE_STRING )
            // InternalGramatica.g:1084:3: RULE_STRING
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
    // InternalGramatica.g:1093:1: rule__Documento__OracionesAssignment_2 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1097:1: ( ( ruleOracion ) )
            // InternalGramatica.g:1098:2: ( ruleOracion )
            {
            // InternalGramatica.g:1098:2: ( ruleOracion )
            // InternalGramatica.g:1099:3: ruleOracion
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
    // InternalGramatica.g:1108:1: rule__Oracion__ContenidoAssignment_0 : ( ruleSimple ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1112:1: ( ( ruleSimple ) )
            // InternalGramatica.g:1113:2: ( ruleSimple )
            {
            // InternalGramatica.g:1113:2: ( ruleSimple )
            // InternalGramatica.g:1114:3: ruleSimple
            {
             before(grammarAccess.getOracionAccess().getContenidoSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getOracionAccess().getContenidoSimpleParserRuleCall_0_0()); 

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
    // InternalGramatica.g:1123:1: rule__Simple__DeterminanteAssignment_0 : ( ruleDeterminante ) ;
    public final void rule__Simple__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1127:1: ( ( ruleDeterminante ) )
            // InternalGramatica.g:1128:2: ( ruleDeterminante )
            {
            // InternalGramatica.g:1128:2: ( ruleDeterminante )
            // InternalGramatica.g:1129:3: ruleDeterminante
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
    // InternalGramatica.g:1138:1: rule__Simple__AtributoAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1142:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1143:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1143:2: ( ruleAtributo )
            // InternalGramatica.g:1144:3: ruleAtributo
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
    // InternalGramatica.g:1153:1: rule__Simple__SintagmaAssignment_2 : ( ruleSintagmaPreposicional ) ;
    public final void rule__Simple__SintagmaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1157:1: ( ( ruleSintagmaPreposicional ) )
            // InternalGramatica.g:1158:2: ( ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:1158:2: ( ruleSintagmaPreposicional )
            // InternalGramatica.g:1159:3: ruleSintagmaPreposicional
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


    // $ANTLR start "rule__Simple__ContextoAssignment_3"
    // InternalGramatica.g:1168:1: rule__Simple__ContextoAssignment_3 : ( ruleClase ) ;
    public final void rule__Simple__ContextoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1172:1: ( ( ruleClase ) )
            // InternalGramatica.g:1173:2: ( ruleClase )
            {
            // InternalGramatica.g:1173:2: ( ruleClase )
            // InternalGramatica.g:1174:3: ruleClase
            {
             before(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getContextoClaseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Simple__ContextoAssignment_3"


    // $ANTLR start "rule__Simple__ObligacionAssignment_4"
    // InternalGramatica.g:1183:1: rule__Simple__ObligacionAssignment_4 : ( ruleObligacion ) ;
    public final void rule__Simple__ObligacionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1187:1: ( ( ruleObligacion ) )
            // InternalGramatica.g:1188:2: ( ruleObligacion )
            {
            // InternalGramatica.g:1188:2: ( ruleObligacion )
            // InternalGramatica.g:1189:3: ruleObligacion
            {
             before(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleObligacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getObligacionObligacionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Simple__ObligacionAssignment_4"


    // $ANTLR start "rule__Simple__OperacionAssignment_5"
    // InternalGramatica.g:1198:1: rule__Simple__OperacionAssignment_5 : ( ruleOperacion ) ;
    public final void rule__Simple__OperacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1202:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:1203:2: ( ruleOperacion )
            {
            // InternalGramatica.g:1203:2: ( ruleOperacion )
            // InternalGramatica.g:1204:3: ruleOperacion
            {
             before(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getOperacionOperacionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Simple__OperacionAssignment_5"


    // $ANTLR start "rule__Simple__LiteralAssignment_6_0"
    // InternalGramatica.g:1213:1: rule__Simple__LiteralAssignment_6_0 : ( ruleLiteral ) ;
    public final void rule__Simple__LiteralAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1217:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:1218:2: ( ruleLiteral )
            {
            // InternalGramatica.g:1218:2: ( ruleLiteral )
            // InternalGramatica.g:1219:3: ruleLiteral
            {
             before(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getLiteralLiteralParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Simple__LiteralAssignment_6_0"


    // $ANTLR start "rule__Simple__AtributoAssignment_6_1"
    // InternalGramatica.g:1228:1: rule__Simple__AtributoAssignment_6_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1232:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1233:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1233:2: ( ruleAtributo )
            // InternalGramatica.g:1234:3: ruleAtributo
            {
             before(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getAtributoAtributoParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Simple__AtributoAssignment_6_1"


    // $ANTLR start "rule__Simple__FinOracionAssignment_7"
    // InternalGramatica.g:1243:1: rule__Simple__FinOracionAssignment_7 : ( ruleFinOracion ) ;
    public final void rule__Simple__FinOracionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1247:1: ( ( ruleFinOracion ) )
            // InternalGramatica.g:1248:2: ( ruleFinOracion )
            {
            // InternalGramatica.g:1248:2: ( ruleFinOracion )
            // InternalGramatica.g:1249:3: ruleFinOracion
            {
             before(grammarAccess.getSimpleAccess().getFinOracionFinOracionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFinOracion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getFinOracionFinOracionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Simple__FinOracionAssignment_7"


    // $ANTLR start "rule__Determinante__DescripcionAssignment"
    // InternalGramatica.g:1258:1: rule__Determinante__DescripcionAssignment : ( ( rule__Determinante__DescripcionAlternatives_0 ) ) ;
    public final void rule__Determinante__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1262:1: ( ( ( rule__Determinante__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1263:2: ( ( rule__Determinante__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1263:2: ( ( rule__Determinante__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1264:3: ( rule__Determinante__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getDeterminanteAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1265:3: ( rule__Determinante__DescripcionAlternatives_0 )
            // InternalGramatica.g:1265:4: rule__Determinante__DescripcionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Determinante__DescripcionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDeterminanteAccess().getDescripcionAlternatives_0()); 

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
    // $ANTLR end "rule__Determinante__DescripcionAssignment"


    // $ANTLR start "rule__Atributo__NameAssignment_1"
    // InternalGramatica.g:1273:1: rule__Atributo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1277:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1278:2: ( RULE_ID )
            {
            // InternalGramatica.g:1278:2: ( RULE_ID )
            // InternalGramatica.g:1279:3: RULE_ID
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


    // $ANTLR start "rule__SintagmaPreposicional__DescripcionAssignment"
    // InternalGramatica.g:1288:1: rule__SintagmaPreposicional__DescripcionAssignment : ( ( 'de un/una' ) ) ;
    public final void rule__SintagmaPreposicional__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1292:1: ( ( ( 'de un/una' ) ) )
            // InternalGramatica.g:1293:2: ( ( 'de un/una' ) )
            {
            // InternalGramatica.g:1293:2: ( ( 'de un/una' ) )
            // InternalGramatica.g:1294:3: ( 'de un/una' )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 
            // InternalGramatica.g:1295:3: ( 'de un/una' )
            // InternalGramatica.g:1296:4: 'de un/una'
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 

            }

             after(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 

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
    // $ANTLR end "rule__SintagmaPreposicional__DescripcionAssignment"


    // $ANTLR start "rule__Obligacion__NegacionAssignment_0"
    // InternalGramatica.g:1307:1: rule__Obligacion__NegacionAssignment_0 : ( ruleNegacion ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1311:1: ( ( ruleNegacion ) )
            // InternalGramatica.g:1312:2: ( ruleNegacion )
            {
            // InternalGramatica.g:1312:2: ( ruleNegacion )
            // InternalGramatica.g:1313:3: ruleNegacion
            {
             before(grammarAccess.getObligacionAccess().getNegacionNegacionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNegacion();

            state._fsp--;

             after(grammarAccess.getObligacionAccess().getNegacionNegacionParserRuleCall_0_0()); 

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
    // InternalGramatica.g:1322:1: rule__Obligacion__ObligacionDeberAssignment_1 : ( ruleObligacionDeber ) ;
    public final void rule__Obligacion__ObligacionDeberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1326:1: ( ( ruleObligacionDeber ) )
            // InternalGramatica.g:1327:2: ( ruleObligacionDeber )
            {
            // InternalGramatica.g:1327:2: ( ruleObligacionDeber )
            // InternalGramatica.g:1328:3: ruleObligacionDeber
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberObligacionDeberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObligacionDeber();

            state._fsp--;

             after(grammarAccess.getObligacionAccess().getObligacionDeberObligacionDeberParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__ObligacionDeber__DescripcionAssignment"
    // InternalGramatica.g:1337:1: rule__ObligacionDeber__DescripcionAssignment : ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) ) ;
    public final void rule__ObligacionDeber__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1341:1: ( ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1342:2: ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1342:2: ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1343:3: ( rule__ObligacionDeber__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getObligacionDeberAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1344:3: ( rule__ObligacionDeber__DescripcionAlternatives_0 )
            // InternalGramatica.g:1344:4: rule__ObligacionDeber__DescripcionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ObligacionDeber__DescripcionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getObligacionDeberAccess().getDescripcionAlternatives_0()); 

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
    // $ANTLR end "rule__ObligacionDeber__DescripcionAssignment"


    // $ANTLR start "rule__Negacion__DescripcionAssignment"
    // InternalGramatica.g:1352:1: rule__Negacion__DescripcionAssignment : ( ( 'no' ) ) ;
    public final void rule__Negacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1356:1: ( ( ( 'no' ) ) )
            // InternalGramatica.g:1357:2: ( ( 'no' ) )
            {
            // InternalGramatica.g:1357:2: ( ( 'no' ) )
            // InternalGramatica.g:1358:3: ( 'no' )
            {
             before(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 
            // InternalGramatica.g:1359:3: ( 'no' )
            // InternalGramatica.g:1360:4: 'no'
            {
             before(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 

            }

             after(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 

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
    // $ANTLR end "rule__Negacion__DescripcionAssignment"


    // $ANTLR start "rule__Operacion__DescripcionAssignment"
    // InternalGramatica.g:1371:1: rule__Operacion__DescripcionAssignment : ( ( rule__Operacion__DescripcionAlternatives_0 ) ) ;
    public final void rule__Operacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1375:1: ( ( ( rule__Operacion__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1376:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1376:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1377:3: ( rule__Operacion__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1378:3: ( rule__Operacion__DescripcionAlternatives_0 )
            // InternalGramatica.g:1378:4: rule__Operacion__DescripcionAlternatives_0
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


    // $ANTLR start "rule__Clase__NameAssignment"
    // InternalGramatica.g:1386:1: rule__Clase__NameAssignment : ( RULE_ID ) ;
    public final void rule__Clase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1390:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1391:2: ( RULE_ID )
            {
            // InternalGramatica.g:1391:2: ( RULE_ID )
            // InternalGramatica.g:1392:3: RULE_ID
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


    // $ANTLR start "rule__Compuesta__SimpleAssignment_0"
    // InternalGramatica.g:1401:1: rule__Compuesta__SimpleAssignment_0 : ( ruleSimple ) ;
    public final void rule__Compuesta__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1405:1: ( ( ruleSimple ) )
            // InternalGramatica.g:1406:2: ( ruleSimple )
            {
            // InternalGramatica.g:1406:2: ( ruleSimple )
            // InternalGramatica.g:1407:3: ruleSimple
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
    // InternalGramatica.g:1416:1: rule__Compuesta__NexoAssignment_1 : ( ruleNexo ) ;
    public final void rule__Compuesta__NexoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1420:1: ( ( ruleNexo ) )
            // InternalGramatica.g:1421:2: ( ruleNexo )
            {
            // InternalGramatica.g:1421:2: ( ruleNexo )
            // InternalGramatica.g:1422:3: ruleNexo
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


    // $ANTLR start "rule__Nexo__DescripcionAssignment_0"
    // InternalGramatica.g:1431:1: rule__Nexo__DescripcionAssignment_0 : ( ( 'y' ) ) ;
    public final void rule__Nexo__DescripcionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1435:1: ( ( ( 'y' ) ) )
            // InternalGramatica.g:1436:2: ( ( 'y' ) )
            {
            // InternalGramatica.g:1436:2: ( ( 'y' ) )
            // InternalGramatica.g:1437:3: ( 'y' )
            {
             before(grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0()); 
            // InternalGramatica.g:1438:3: ( 'y' )
            // InternalGramatica.g:1439:4: 'y'
            {
             before(grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0()); 

            }

             after(grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0()); 

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
    // $ANTLR end "rule__Nexo__DescripcionAssignment_0"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\21\uffff\2\27\1\uffff\2\27\2\uffff";
    static final String dfa_3s = "\1\14\3\6\1\31\1\6\2\16\11\4\2\13\1\6\1\13\1\14\2\uffff";
    static final String dfa_4s = "\1\15\2\30\1\6\1\31\1\6\1\32\1\17\11\30\2\33\1\6\2\33\2\uffff";
    static final String dfa_5s = "\26\uffff\1\2\1\1";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\4\21\uffff\1\3",
            "\1\4\21\uffff\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\11\12\uffff\1\7",
            "\1\10\1\11",
            "\1\21\1\22\1\24\11\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\23",
            "\1\21\1\22\1\24\11\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\21\1\22\1\24\21\uffff\1\23",
            "\1\25\2\27\11\uffff\1\26\3\uffff\1\26",
            "\1\25\2\27\11\uffff\1\26\3\uffff\1\26",
            "\1\24",
            "\1\25\2\27\11\uffff\1\26\3\uffff\1\26",
            "\2\27\11\uffff\1\26\3\uffff\1\26",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "427:1: rule__Oracion__Alternatives : ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) | ( ruleCompuesta ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000400C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000017F0070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008800000L});

}