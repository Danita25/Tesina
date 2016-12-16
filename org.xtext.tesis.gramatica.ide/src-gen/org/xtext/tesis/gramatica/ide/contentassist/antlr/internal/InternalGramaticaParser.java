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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'El/La'", "'Los/Las'", "'Para todos/as Los/Las'", "'debe ser'", "'debe estar'", "'implica'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'y'", "'o'", "'tal que'", "'donde'", "'seleccionamos'", "'para todos'", "'existe'", "'es no vacio'", "'es vacio'", "'tamanio'", "'Compuesta'", "'de un/una'", "'no'"
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
    // InternalGramatica.g:162:1: ruleAtributo : ( ( rule__Atributo__NameAssignment ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:166:2: ( ( ( rule__Atributo__NameAssignment ) ) )
            // InternalGramatica.g:167:2: ( ( rule__Atributo__NameAssignment ) )
            {
            // InternalGramatica.g:167:2: ( ( rule__Atributo__NameAssignment ) )
            // InternalGramatica.g:168:3: ( rule__Atributo__NameAssignment )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment()); 
            // InternalGramatica.g:169:3: ( rule__Atributo__NameAssignment )
            // InternalGramatica.g:169:4: rule__Atributo__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment()); 

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
    // InternalGramatica.g:412:1: ruleNexo : ( ( rule__Nexo__DescripcionAssignment ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:416:2: ( ( ( rule__Nexo__DescripcionAssignment ) ) )
            // InternalGramatica.g:417:2: ( ( rule__Nexo__DescripcionAssignment ) )
            {
            // InternalGramatica.g:417:2: ( ( rule__Nexo__DescripcionAssignment ) )
            // InternalGramatica.g:418:3: ( rule__Nexo__DescripcionAssignment )
            {
             before(grammarAccess.getNexoAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:419:3: ( rule__Nexo__DescripcionAssignment )
            // InternalGramatica.g:419:4: rule__Nexo__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getDescripcionAssignment()); 

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


    // $ANTLR start "entryRuleCompleja"
    // InternalGramatica.g:428:1: entryRuleCompleja : ruleCompleja EOF ;
    public final void entryRuleCompleja() throws RecognitionException {
        try {
            // InternalGramatica.g:429:1: ( ruleCompleja EOF )
            // InternalGramatica.g:430:1: ruleCompleja EOF
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
    // InternalGramatica.g:437:1: ruleCompleja : ( ( rule__Compleja__Group__0 ) ) ;
    public final void ruleCompleja() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:441:2: ( ( ( rule__Compleja__Group__0 ) ) )
            // InternalGramatica.g:442:2: ( ( rule__Compleja__Group__0 ) )
            {
            // InternalGramatica.g:442:2: ( ( rule__Compleja__Group__0 ) )
            // InternalGramatica.g:443:3: ( rule__Compleja__Group__0 )
            {
             before(grammarAccess.getComplejaAccess().getGroup()); 
            // InternalGramatica.g:444:3: ( rule__Compleja__Group__0 )
            // InternalGramatica.g:444:4: rule__Compleja__Group__0
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


    // $ANTLR start "entryRuleConector"
    // InternalGramatica.g:453:1: entryRuleConector : ruleConector EOF ;
    public final void entryRuleConector() throws RecognitionException {
        try {
            // InternalGramatica.g:454:1: ( ruleConector EOF )
            // InternalGramatica.g:455:1: ruleConector EOF
            {
             before(grammarAccess.getConectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConector();

            state._fsp--;

             after(grammarAccess.getConectorRule()); 
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
    // $ANTLR end "entryRuleConector"


    // $ANTLR start "ruleConector"
    // InternalGramatica.g:462:1: ruleConector : ( ( rule__Conector__DescripcionAssignment ) ) ;
    public final void ruleConector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:466:2: ( ( ( rule__Conector__DescripcionAssignment ) ) )
            // InternalGramatica.g:467:2: ( ( rule__Conector__DescripcionAssignment ) )
            {
            // InternalGramatica.g:467:2: ( ( rule__Conector__DescripcionAssignment ) )
            // InternalGramatica.g:468:3: ( rule__Conector__DescripcionAssignment )
            {
             before(grammarAccess.getConectorAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:469:3: ( rule__Conector__DescripcionAssignment )
            // InternalGramatica.g:469:4: rule__Conector__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Conector__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConectorAccess().getDescripcionAssignment()); 

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
    // $ANTLR end "ruleConector"


    // $ANTLR start "entryRuleOperacionColeccion"
    // InternalGramatica.g:478:1: entryRuleOperacionColeccion : ruleOperacionColeccion EOF ;
    public final void entryRuleOperacionColeccion() throws RecognitionException {
        try {
            // InternalGramatica.g:479:1: ( ruleOperacionColeccion EOF )
            // InternalGramatica.g:480:1: ruleOperacionColeccion EOF
            {
             before(grammarAccess.getOperacionColeccionRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacionColeccion();

            state._fsp--;

             after(grammarAccess.getOperacionColeccionRule()); 
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
    // $ANTLR end "entryRuleOperacionColeccion"


    // $ANTLR start "ruleOperacionColeccion"
    // InternalGramatica.g:487:1: ruleOperacionColeccion : ( ( rule__OperacionColeccion__DescripcionAssignment ) ) ;
    public final void ruleOperacionColeccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:491:2: ( ( ( rule__OperacionColeccion__DescripcionAssignment ) ) )
            // InternalGramatica.g:492:2: ( ( rule__OperacionColeccion__DescripcionAssignment ) )
            {
            // InternalGramatica.g:492:2: ( ( rule__OperacionColeccion__DescripcionAssignment ) )
            // InternalGramatica.g:493:3: ( rule__OperacionColeccion__DescripcionAssignment )
            {
             before(grammarAccess.getOperacionColeccionAccess().getDescripcionAssignment()); 
            // InternalGramatica.g:494:3: ( rule__OperacionColeccion__DescripcionAssignment )
            // InternalGramatica.g:494:4: rule__OperacionColeccion__DescripcionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OperacionColeccion__DescripcionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperacionColeccionAccess().getDescripcionAssignment()); 

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
    // $ANTLR end "ruleOperacionColeccion"


    // $ANTLR start "rule__Oracion__Alternatives"
    // InternalGramatica.g:502:1: rule__Oracion__Alternatives : ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) | ( ( rule__Oracion__ContenidoAssignment_1 ) ) | ( ( rule__Oracion__ContenidoAssignment_2 ) ) );
    public final void rule__Oracion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:506:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) | ( ( rule__Oracion__ContenidoAssignment_1 ) ) | ( ( rule__Oracion__ContenidoAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGramatica.g:507:2: ( ( rule__Oracion__ContenidoAssignment_0 ) )
                    {
                    // InternalGramatica.g:507:2: ( ( rule__Oracion__ContenidoAssignment_0 ) )
                    // InternalGramatica.g:508:3: ( rule__Oracion__ContenidoAssignment_0 )
                    {
                     before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
                    // InternalGramatica.g:509:3: ( rule__Oracion__ContenidoAssignment_0 )
                    // InternalGramatica.g:509:4: rule__Oracion__ContenidoAssignment_0
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
                    // InternalGramatica.g:513:2: ( ( rule__Oracion__ContenidoAssignment_1 ) )
                    {
                    // InternalGramatica.g:513:2: ( ( rule__Oracion__ContenidoAssignment_1 ) )
                    // InternalGramatica.g:514:3: ( rule__Oracion__ContenidoAssignment_1 )
                    {
                     before(grammarAccess.getOracionAccess().getContenidoAssignment_1()); 
                    // InternalGramatica.g:515:3: ( rule__Oracion__ContenidoAssignment_1 )
                    // InternalGramatica.g:515:4: rule__Oracion__ContenidoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracion__ContenidoAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOracionAccess().getContenidoAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:519:2: ( ( rule__Oracion__ContenidoAssignment_2 ) )
                    {
                    // InternalGramatica.g:519:2: ( ( rule__Oracion__ContenidoAssignment_2 ) )
                    // InternalGramatica.g:520:3: ( rule__Oracion__ContenidoAssignment_2 )
                    {
                     before(grammarAccess.getOracionAccess().getContenidoAssignment_2()); 
                    // InternalGramatica.g:521:3: ( rule__Oracion__ContenidoAssignment_2 )
                    // InternalGramatica.g:521:4: rule__Oracion__ContenidoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracion__ContenidoAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOracionAccess().getContenidoAssignment_2()); 

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
    // InternalGramatica.g:529:1: rule__Simple__Alternatives_6 : ( ( ( rule__Simple__LiteralAssignment_6_0 ) ) | ( ( rule__Simple__AtributoAssignment_6_1 ) ) );
    public final void rule__Simple__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:533:1: ( ( ( rule__Simple__LiteralAssignment_6_0 ) ) | ( ( rule__Simple__AtributoAssignment_6_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:534:2: ( ( rule__Simple__LiteralAssignment_6_0 ) )
                    {
                    // InternalGramatica.g:534:2: ( ( rule__Simple__LiteralAssignment_6_0 ) )
                    // InternalGramatica.g:535:3: ( rule__Simple__LiteralAssignment_6_0 )
                    {
                     before(grammarAccess.getSimpleAccess().getLiteralAssignment_6_0()); 
                    // InternalGramatica.g:536:3: ( rule__Simple__LiteralAssignment_6_0 )
                    // InternalGramatica.g:536:4: rule__Simple__LiteralAssignment_6_0
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
                    // InternalGramatica.g:540:2: ( ( rule__Simple__AtributoAssignment_6_1 ) )
                    {
                    // InternalGramatica.g:540:2: ( ( rule__Simple__AtributoAssignment_6_1 ) )
                    // InternalGramatica.g:541:3: ( rule__Simple__AtributoAssignment_6_1 )
                    {
                     before(grammarAccess.getSimpleAccess().getAtributoAssignment_6_1()); 
                    // InternalGramatica.g:542:3: ( rule__Simple__AtributoAssignment_6_1 )
                    // InternalGramatica.g:542:4: rule__Simple__AtributoAssignment_6_1
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
    // InternalGramatica.g:550:1: rule__Determinante__DescripcionAlternatives_0 : ( ( 'El/La' ) | ( 'Los/Las' ) | ( 'Para todos/as Los/Las' ) );
    public final void rule__Determinante__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:554:1: ( ( 'El/La' ) | ( 'Los/Las' ) | ( 'Para todos/as Los/Las' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
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
                    // InternalGramatica.g:555:2: ( 'El/La' )
                    {
                    // InternalGramatica.g:555:2: ( 'El/La' )
                    // InternalGramatica.g:556:3: 'El/La'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:561:2: ( 'Los/Las' )
                    {
                    // InternalGramatica.g:561:2: ( 'Los/Las' )
                    // InternalGramatica.g:562:3: 'Los/Las'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:567:2: ( 'Para todos/as Los/Las' )
                    {
                    // InternalGramatica.g:567:2: ( 'Para todos/as Los/Las' )
                    // InternalGramatica.g:568:3: 'Para todos/as Los/Las'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionParaTodosAsLosLasKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDeterminanteAccess().getDescripcionParaTodosAsLosLasKeyword_0_2()); 

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
    // InternalGramatica.g:577:1: rule__ObligacionDeber__DescripcionAlternatives_0 : ( ( 'debe ser' ) | ( 'debe estar' ) );
    public final void rule__ObligacionDeber__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:581:1: ( ( 'debe ser' ) | ( 'debe estar' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:582:2: ( 'debe ser' )
                    {
                    // InternalGramatica.g:582:2: ( 'debe ser' )
                    // InternalGramatica.g:583:3: 'debe ser'
                    {
                     before(grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:588:2: ( 'debe estar' )
                    {
                    // InternalGramatica.g:588:2: ( 'debe estar' )
                    // InternalGramatica.g:589:3: 'debe estar'
                    {
                     before(grammarAccess.getObligacionDeberAccess().getDescripcionDebeEstarKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalGramatica.g:598:1: rule__Operacion__DescripcionAlternatives_0 : ( ( 'implica' ) | ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Operacion__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:602:1: ( ( 'implica' ) | ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            case 24:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:603:2: ( 'implica' )
                    {
                    // InternalGramatica.g:603:2: ( 'implica' )
                    // InternalGramatica.g:604:3: 'implica'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionImplicaKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionImplicaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:609:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:609:2: ( 'mayor que' )
                    // InternalGramatica.g:610:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:615:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:615:2: ( 'menor que' )
                    // InternalGramatica.g:616:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:621:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:621:2: ( 'igual a' )
                    // InternalGramatica.g:622:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:627:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:627:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:628:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:633:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:633:2: ( 'menor o igual a' )
                    // InternalGramatica.g:634:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_5()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:639:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:639:2: ( 'distinto de' )
                    // InternalGramatica.g:640:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_6()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGramatica.g:645:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:645:2: ( 'al menos' )
                    // InternalGramatica.g:646:3: 'al menos'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_7()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_7()); 

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
    // InternalGramatica.g:655:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:659:1: ( ( RULE_INT ) | ( RULE_STRING ) )
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
                    // InternalGramatica.g:660:2: ( RULE_INT )
                    {
                    // InternalGramatica.g:660:2: ( RULE_INT )
                    // InternalGramatica.g:661:3: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:666:2: ( RULE_STRING )
                    {
                    // InternalGramatica.g:666:2: ( RULE_STRING )
                    // InternalGramatica.g:667:3: RULE_STRING
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


    // $ANTLR start "rule__Nexo__DescripcionAlternatives_0"
    // InternalGramatica.g:676:1: rule__Nexo__DescripcionAlternatives_0 : ( ( 'y' ) | ( 'o' ) );
    public final void rule__Nexo__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:680:1: ( ( 'y' ) | ( 'o' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:681:2: ( 'y' )
                    {
                    // InternalGramatica.g:681:2: ( 'y' )
                    // InternalGramatica.g:682:3: 'y'
                    {
                     before(grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getDescripcionYKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:687:2: ( 'o' )
                    {
                    // InternalGramatica.g:687:2: ( 'o' )
                    // InternalGramatica.g:688:3: 'o'
                    {
                     before(grammarAccess.getNexoAccess().getDescripcionOKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getDescripcionOKeyword_0_1()); 

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
    // $ANTLR end "rule__Nexo__DescripcionAlternatives_0"


    // $ANTLR start "rule__Compleja__Alternatives_5_4_2"
    // InternalGramatica.g:697:1: rule__Compleja__Alternatives_5_4_2 : ( ( ( rule__Compleja__Lit1Assignment_5_4_2_0 ) ) | ( ( rule__Compleja__Atr2Assignment_5_4_2_1 ) ) );
    public final void rule__Compleja__Alternatives_5_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:701:1: ( ( ( rule__Compleja__Lit1Assignment_5_4_2_0 ) ) | ( ( rule__Compleja__Atr2Assignment_5_4_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:702:2: ( ( rule__Compleja__Lit1Assignment_5_4_2_0 ) )
                    {
                    // InternalGramatica.g:702:2: ( ( rule__Compleja__Lit1Assignment_5_4_2_0 ) )
                    // InternalGramatica.g:703:3: ( rule__Compleja__Lit1Assignment_5_4_2_0 )
                    {
                     before(grammarAccess.getComplejaAccess().getLit1Assignment_5_4_2_0()); 
                    // InternalGramatica.g:704:3: ( rule__Compleja__Lit1Assignment_5_4_2_0 )
                    // InternalGramatica.g:704:4: rule__Compleja__Lit1Assignment_5_4_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Lit1Assignment_5_4_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getLit1Assignment_5_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:708:2: ( ( rule__Compleja__Atr2Assignment_5_4_2_1 ) )
                    {
                    // InternalGramatica.g:708:2: ( ( rule__Compleja__Atr2Assignment_5_4_2_1 ) )
                    // InternalGramatica.g:709:3: ( rule__Compleja__Atr2Assignment_5_4_2_1 )
                    {
                     before(grammarAccess.getComplejaAccess().getAtr2Assignment_5_4_2_1()); 
                    // InternalGramatica.g:710:3: ( rule__Compleja__Atr2Assignment_5_4_2_1 )
                    // InternalGramatica.g:710:4: rule__Compleja__Atr2Assignment_5_4_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Atr2Assignment_5_4_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getAtr2Assignment_5_4_2_1()); 

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
    // $ANTLR end "rule__Compleja__Alternatives_5_4_2"


    // $ANTLR start "rule__Compleja__Alternatives_5_4_4_2"
    // InternalGramatica.g:718:1: rule__Compleja__Alternatives_5_4_4_2 : ( ( ( rule__Compleja__Lit2Assignment_5_4_4_2_0 ) ) | ( ( rule__Compleja__Atr5Assignment_5_4_4_2_1 ) ) );
    public final void rule__Compleja__Alternatives_5_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:722:1: ( ( ( rule__Compleja__Lit2Assignment_5_4_4_2_0 ) ) | ( ( rule__Compleja__Atr5Assignment_5_4_4_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:723:2: ( ( rule__Compleja__Lit2Assignment_5_4_4_2_0 ) )
                    {
                    // InternalGramatica.g:723:2: ( ( rule__Compleja__Lit2Assignment_5_4_4_2_0 ) )
                    // InternalGramatica.g:724:3: ( rule__Compleja__Lit2Assignment_5_4_4_2_0 )
                    {
                     before(grammarAccess.getComplejaAccess().getLit2Assignment_5_4_4_2_0()); 
                    // InternalGramatica.g:725:3: ( rule__Compleja__Lit2Assignment_5_4_4_2_0 )
                    // InternalGramatica.g:725:4: rule__Compleja__Lit2Assignment_5_4_4_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Lit2Assignment_5_4_4_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getLit2Assignment_5_4_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:729:2: ( ( rule__Compleja__Atr5Assignment_5_4_4_2_1 ) )
                    {
                    // InternalGramatica.g:729:2: ( ( rule__Compleja__Atr5Assignment_5_4_4_2_1 ) )
                    // InternalGramatica.g:730:3: ( rule__Compleja__Atr5Assignment_5_4_4_2_1 )
                    {
                     before(grammarAccess.getComplejaAccess().getAtr5Assignment_5_4_4_2_1()); 
                    // InternalGramatica.g:731:3: ( rule__Compleja__Atr5Assignment_5_4_4_2_1 )
                    // InternalGramatica.g:731:4: rule__Compleja__Atr5Assignment_5_4_4_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Atr5Assignment_5_4_4_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getAtr5Assignment_5_4_4_2_1()); 

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
    // $ANTLR end "rule__Compleja__Alternatives_5_4_4_2"


    // $ANTLR start "rule__Compleja__Alternatives_7_1"
    // InternalGramatica.g:739:1: rule__Compleja__Alternatives_7_1 : ( ( ( rule__Compleja__Lit3Assignment_7_1_0 ) ) | ( ( rule__Compleja__Atr3Assignment_7_1_1 ) ) );
    public final void rule__Compleja__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:743:1: ( ( ( rule__Compleja__Lit3Assignment_7_1_0 ) ) | ( ( rule__Compleja__Atr3Assignment_7_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGramatica.g:744:2: ( ( rule__Compleja__Lit3Assignment_7_1_0 ) )
                    {
                    // InternalGramatica.g:744:2: ( ( rule__Compleja__Lit3Assignment_7_1_0 ) )
                    // InternalGramatica.g:745:3: ( rule__Compleja__Lit3Assignment_7_1_0 )
                    {
                     before(grammarAccess.getComplejaAccess().getLit3Assignment_7_1_0()); 
                    // InternalGramatica.g:746:3: ( rule__Compleja__Lit3Assignment_7_1_0 )
                    // InternalGramatica.g:746:4: rule__Compleja__Lit3Assignment_7_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Lit3Assignment_7_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getLit3Assignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:750:2: ( ( rule__Compleja__Atr3Assignment_7_1_1 ) )
                    {
                    // InternalGramatica.g:750:2: ( ( rule__Compleja__Atr3Assignment_7_1_1 ) )
                    // InternalGramatica.g:751:3: ( rule__Compleja__Atr3Assignment_7_1_1 )
                    {
                     before(grammarAccess.getComplejaAccess().getAtr3Assignment_7_1_1()); 
                    // InternalGramatica.g:752:3: ( rule__Compleja__Atr3Assignment_7_1_1 )
                    // InternalGramatica.g:752:4: rule__Compleja__Atr3Assignment_7_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Atr3Assignment_7_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplejaAccess().getAtr3Assignment_7_1_1()); 

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
    // $ANTLR end "rule__Compleja__Alternatives_7_1"


    // $ANTLR start "rule__Conector__DescripcionAlternatives_0"
    // InternalGramatica.g:760:1: rule__Conector__DescripcionAlternatives_0 : ( ( 'tal que' ) | ( 'donde' ) );
    public final void rule__Conector__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:764:1: ( ( 'tal que' ) | ( 'donde' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:765:2: ( 'tal que' )
                    {
                    // InternalGramatica.g:765:2: ( 'tal que' )
                    // InternalGramatica.g:766:3: 'tal que'
                    {
                     before(grammarAccess.getConectorAccess().getDescripcionTalQueKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getConectorAccess().getDescripcionTalQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:771:2: ( 'donde' )
                    {
                    // InternalGramatica.g:771:2: ( 'donde' )
                    // InternalGramatica.g:772:3: 'donde'
                    {
                     before(grammarAccess.getConectorAccess().getDescripcionDondeKeyword_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getConectorAccess().getDescripcionDondeKeyword_0_1()); 

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
    // $ANTLR end "rule__Conector__DescripcionAlternatives_0"


    // $ANTLR start "rule__OperacionColeccion__DescripcionAlternatives_0"
    // InternalGramatica.g:781:1: rule__OperacionColeccion__DescripcionAlternatives_0 : ( ( 'seleccionamos' ) | ( 'para todos' ) | ( 'existe' ) | ( 'es no vacio' ) | ( 'es vacio' ) | ( 'tamanio' ) );
    public final void rule__OperacionColeccion__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:785:1: ( ( 'seleccionamos' ) | ( 'para todos' ) | ( 'existe' ) | ( 'es no vacio' ) | ( 'es vacio' ) | ( 'tamanio' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:786:2: ( 'seleccionamos' )
                    {
                    // InternalGramatica.g:786:2: ( 'seleccionamos' )
                    // InternalGramatica.g:787:3: 'seleccionamos'
                    {
                     before(grammarAccess.getOperacionColeccionAccess().getDescripcionSeleccionamosKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOperacionColeccionAccess().getDescripcionSeleccionamosKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:792:2: ( 'para todos' )
                    {
                    // InternalGramatica.g:792:2: ( 'para todos' )
                    // InternalGramatica.g:793:3: 'para todos'
                    {
                     before(grammarAccess.getOperacionColeccionAccess().getDescripcionParaTodosKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getOperacionColeccionAccess().getDescripcionParaTodosKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:798:2: ( 'existe' )
                    {
                    // InternalGramatica.g:798:2: ( 'existe' )
                    // InternalGramatica.g:799:3: 'existe'
                    {
                     before(grammarAccess.getOperacionColeccionAccess().getDescripcionExisteKeyword_0_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getOperacionColeccionAccess().getDescripcionExisteKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:804:2: ( 'es no vacio' )
                    {
                    // InternalGramatica.g:804:2: ( 'es no vacio' )
                    // InternalGramatica.g:805:3: 'es no vacio'
                    {
                     before(grammarAccess.getOperacionColeccionAccess().getDescripcionEsNoVacioKeyword_0_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getOperacionColeccionAccess().getDescripcionEsNoVacioKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:810:2: ( 'es vacio' )
                    {
                    // InternalGramatica.g:810:2: ( 'es vacio' )
                    // InternalGramatica.g:811:3: 'es vacio'
                    {
                     before(grammarAccess.getOperacionColeccionAccess().getDescripcionEsVacioKeyword_0_4()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getOperacionColeccionAccess().getDescripcionEsVacioKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:816:2: ( 'tamanio' )
                    {
                    // InternalGramatica.g:816:2: ( 'tamanio' )
                    // InternalGramatica.g:817:3: 'tamanio'
                    {
                     before(grammarAccess.getOperacionColeccionAccess().getDescripcionTamanioKeyword_0_5()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getOperacionColeccionAccess().getDescripcionTamanioKeyword_0_5()); 

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
    // $ANTLR end "rule__OperacionColeccion__DescripcionAlternatives_0"


    // $ANTLR start "rule__Documento__Group__0"
    // InternalGramatica.g:826:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:830:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalGramatica.g:831:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
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
    // InternalGramatica.g:838:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__PathModeloAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:842:1: ( ( ( rule__Documento__PathModeloAssignment_0 ) ) )
            // InternalGramatica.g:843:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            {
            // InternalGramatica.g:843:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            // InternalGramatica.g:844:2: ( rule__Documento__PathModeloAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); 
            // InternalGramatica.g:845:2: ( rule__Documento__PathModeloAssignment_0 )
            // InternalGramatica.g:845:3: rule__Documento__PathModeloAssignment_0
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
    // InternalGramatica.g:853:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:857:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalGramatica.g:858:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
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
    // InternalGramatica.g:865:1: rule__Documento__Group__1__Impl : ( ( rule__Documento__PathOclAssignment_1 ) ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:869:1: ( ( ( rule__Documento__PathOclAssignment_1 ) ) )
            // InternalGramatica.g:870:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            {
            // InternalGramatica.g:870:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            // InternalGramatica.g:871:2: ( rule__Documento__PathOclAssignment_1 )
            {
             before(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); 
            // InternalGramatica.g:872:2: ( rule__Documento__PathOclAssignment_1 )
            // InternalGramatica.g:872:3: rule__Documento__PathOclAssignment_1
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
    // InternalGramatica.g:880:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:884:1: ( rule__Documento__Group__2__Impl )
            // InternalGramatica.g:885:2: rule__Documento__Group__2__Impl
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
    // InternalGramatica.g:891:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__OracionesAssignment_2 )* ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:895:1: ( ( ( rule__Documento__OracionesAssignment_2 )* ) )
            // InternalGramatica.g:896:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            {
            // InternalGramatica.g:896:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            // InternalGramatica.g:897:2: ( rule__Documento__OracionesAssignment_2 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 
            // InternalGramatica.g:898:2: ( rule__Documento__OracionesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=14)||LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGramatica.g:898:3: rule__Documento__OracionesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Documento__OracionesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGramatica.g:907:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:911:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:912:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
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
    // InternalGramatica.g:919:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__DeterminanteAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:923:1: ( ( ( rule__Simple__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:924:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:924:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:925:2: ( rule__Simple__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:926:2: ( rule__Simple__DeterminanteAssignment_0 )
            // InternalGramatica.g:926:3: rule__Simple__DeterminanteAssignment_0
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
    // InternalGramatica.g:934:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:938:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:939:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
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
    // InternalGramatica.g:946:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AtributoAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:950:1: ( ( ( rule__Simple__AtributoAssignment_1 ) ) )
            // InternalGramatica.g:951:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            {
            // InternalGramatica.g:951:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            // InternalGramatica.g:952:2: ( rule__Simple__AtributoAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); 
            // InternalGramatica.g:953:2: ( rule__Simple__AtributoAssignment_1 )
            // InternalGramatica.g:953:3: rule__Simple__AtributoAssignment_1
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
    // InternalGramatica.g:961:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:965:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalGramatica.g:966:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
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
    // InternalGramatica.g:973:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__SintagmaAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:977:1: ( ( ( rule__Simple__SintagmaAssignment_2 ) ) )
            // InternalGramatica.g:978:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            {
            // InternalGramatica.g:978:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            // InternalGramatica.g:979:2: ( rule__Simple__SintagmaAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getSintagmaAssignment_2()); 
            // InternalGramatica.g:980:2: ( rule__Simple__SintagmaAssignment_2 )
            // InternalGramatica.g:980:3: rule__Simple__SintagmaAssignment_2
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
    // InternalGramatica.g:988:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:992:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalGramatica.g:993:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalGramatica.g:1000:1: rule__Simple__Group__3__Impl : ( ( rule__Simple__ContextoAssignment_3 ) ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1004:1: ( ( ( rule__Simple__ContextoAssignment_3 ) ) )
            // InternalGramatica.g:1005:1: ( ( rule__Simple__ContextoAssignment_3 ) )
            {
            // InternalGramatica.g:1005:1: ( ( rule__Simple__ContextoAssignment_3 ) )
            // InternalGramatica.g:1006:2: ( rule__Simple__ContextoAssignment_3 )
            {
             before(grammarAccess.getSimpleAccess().getContextoAssignment_3()); 
            // InternalGramatica.g:1007:2: ( rule__Simple__ContextoAssignment_3 )
            // InternalGramatica.g:1007:3: rule__Simple__ContextoAssignment_3
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
    // InternalGramatica.g:1015:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1019:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalGramatica.g:1020:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalGramatica.g:1027:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__ObligacionAssignment_4 ) ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1031:1: ( ( ( rule__Simple__ObligacionAssignment_4 ) ) )
            // InternalGramatica.g:1032:1: ( ( rule__Simple__ObligacionAssignment_4 ) )
            {
            // InternalGramatica.g:1032:1: ( ( rule__Simple__ObligacionAssignment_4 ) )
            // InternalGramatica.g:1033:2: ( rule__Simple__ObligacionAssignment_4 )
            {
             before(grammarAccess.getSimpleAccess().getObligacionAssignment_4()); 
            // InternalGramatica.g:1034:2: ( rule__Simple__ObligacionAssignment_4 )
            // InternalGramatica.g:1034:3: rule__Simple__ObligacionAssignment_4
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
    // InternalGramatica.g:1042:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl rule__Simple__Group__6 ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1046:1: ( rule__Simple__Group__5__Impl rule__Simple__Group__6 )
            // InternalGramatica.g:1047:2: rule__Simple__Group__5__Impl rule__Simple__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalGramatica.g:1054:1: rule__Simple__Group__5__Impl : ( ( rule__Simple__OperacionAssignment_5 )? ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1058:1: ( ( ( rule__Simple__OperacionAssignment_5 )? ) )
            // InternalGramatica.g:1059:1: ( ( rule__Simple__OperacionAssignment_5 )? )
            {
            // InternalGramatica.g:1059:1: ( ( rule__Simple__OperacionAssignment_5 )? )
            // InternalGramatica.g:1060:2: ( rule__Simple__OperacionAssignment_5 )?
            {
             before(grammarAccess.getSimpleAccess().getOperacionAssignment_5()); 
            // InternalGramatica.g:1061:2: ( rule__Simple__OperacionAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=17 && LA14_0<=24)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGramatica.g:1061:3: rule__Simple__OperacionAssignment_5
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
    // InternalGramatica.g:1069:1: rule__Simple__Group__6 : rule__Simple__Group__6__Impl rule__Simple__Group__7 ;
    public final void rule__Simple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1073:1: ( rule__Simple__Group__6__Impl rule__Simple__Group__7 )
            // InternalGramatica.g:1074:2: rule__Simple__Group__6__Impl rule__Simple__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalGramatica.g:1081:1: rule__Simple__Group__6__Impl : ( ( rule__Simple__Alternatives_6 ) ) ;
    public final void rule__Simple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1085:1: ( ( ( rule__Simple__Alternatives_6 ) ) )
            // InternalGramatica.g:1086:1: ( ( rule__Simple__Alternatives_6 ) )
            {
            // InternalGramatica.g:1086:1: ( ( rule__Simple__Alternatives_6 ) )
            // InternalGramatica.g:1087:2: ( rule__Simple__Alternatives_6 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_6()); 
            // InternalGramatica.g:1088:2: ( rule__Simple__Alternatives_6 )
            // InternalGramatica.g:1088:3: rule__Simple__Alternatives_6
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
    // InternalGramatica.g:1096:1: rule__Simple__Group__7 : rule__Simple__Group__7__Impl ;
    public final void rule__Simple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1100:1: ( rule__Simple__Group__7__Impl )
            // InternalGramatica.g:1101:2: rule__Simple__Group__7__Impl
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
    // InternalGramatica.g:1107:1: rule__Simple__Group__7__Impl : ( ( rule__Simple__FinOracionAssignment_7 )? ) ;
    public final void rule__Simple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1111:1: ( ( ( rule__Simple__FinOracionAssignment_7 )? ) )
            // InternalGramatica.g:1112:1: ( ( rule__Simple__FinOracionAssignment_7 )? )
            {
            // InternalGramatica.g:1112:1: ( ( rule__Simple__FinOracionAssignment_7 )? )
            // InternalGramatica.g:1113:2: ( rule__Simple__FinOracionAssignment_7 )?
            {
             before(grammarAccess.getSimpleAccess().getFinOracionAssignment_7()); 
            // InternalGramatica.g:1114:2: ( rule__Simple__FinOracionAssignment_7 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGramatica.g:1114:3: rule__Simple__FinOracionAssignment_7
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


    // $ANTLR start "rule__Obligacion__Group__0"
    // InternalGramatica.g:1123:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1127:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalGramatica.g:1128:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGramatica.g:1135:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1139:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalGramatica.g:1140:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalGramatica.g:1140:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalGramatica.g:1141:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalGramatica.g:1142:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGramatica.g:1142:3: rule__Obligacion__NegacionAssignment_0
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
    // InternalGramatica.g:1150:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1154:1: ( rule__Obligacion__Group__1__Impl )
            // InternalGramatica.g:1155:2: rule__Obligacion__Group__1__Impl
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
    // InternalGramatica.g:1161:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1165:1: ( ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) )
            // InternalGramatica.g:1166:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            {
            // InternalGramatica.g:1166:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            // InternalGramatica.g:1167:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberAssignment_1()); 
            // InternalGramatica.g:1168:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            // InternalGramatica.g:1168:3: rule__Obligacion__ObligacionDeberAssignment_1
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
    // InternalGramatica.g:1177:1: rule__Compuesta__Group__0 : rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 ;
    public final void rule__Compuesta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1181:1: ( rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1 )
            // InternalGramatica.g:1182:2: rule__Compuesta__Group__0__Impl rule__Compuesta__Group__1
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
    // InternalGramatica.g:1189:1: rule__Compuesta__Group__0__Impl : ( 'Compuesta' ) ;
    public final void rule__Compuesta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1193:1: ( ( 'Compuesta' ) )
            // InternalGramatica.g:1194:1: ( 'Compuesta' )
            {
            // InternalGramatica.g:1194:1: ( 'Compuesta' )
            // InternalGramatica.g:1195:2: 'Compuesta'
            {
             before(grammarAccess.getCompuestaAccess().getCompuestaKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompuestaAccess().getCompuestaKeyword_0()); 

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
    // InternalGramatica.g:1204:1: rule__Compuesta__Group__1 : rule__Compuesta__Group__1__Impl rule__Compuesta__Group__2 ;
    public final void rule__Compuesta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1208:1: ( rule__Compuesta__Group__1__Impl rule__Compuesta__Group__2 )
            // InternalGramatica.g:1209:2: rule__Compuesta__Group__1__Impl rule__Compuesta__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGramatica.g:1216:1: rule__Compuesta__Group__1__Impl : ( ( rule__Compuesta__SimpleInicialAssignment_1 ) ) ;
    public final void rule__Compuesta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1220:1: ( ( ( rule__Compuesta__SimpleInicialAssignment_1 ) ) )
            // InternalGramatica.g:1221:1: ( ( rule__Compuesta__SimpleInicialAssignment_1 ) )
            {
            // InternalGramatica.g:1221:1: ( ( rule__Compuesta__SimpleInicialAssignment_1 ) )
            // InternalGramatica.g:1222:2: ( rule__Compuesta__SimpleInicialAssignment_1 )
            {
             before(grammarAccess.getCompuestaAccess().getSimpleInicialAssignment_1()); 
            // InternalGramatica.g:1223:2: ( rule__Compuesta__SimpleInicialAssignment_1 )
            // InternalGramatica.g:1223:3: rule__Compuesta__SimpleInicialAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__SimpleInicialAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getSimpleInicialAssignment_1()); 

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
    // InternalGramatica.g:1231:1: rule__Compuesta__Group__2 : rule__Compuesta__Group__2__Impl ;
    public final void rule__Compuesta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1235:1: ( rule__Compuesta__Group__2__Impl )
            // InternalGramatica.g:1236:2: rule__Compuesta__Group__2__Impl
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
    // InternalGramatica.g:1242:1: rule__Compuesta__Group__2__Impl : ( ( rule__Compuesta__Group_2__0 )* ) ;
    public final void rule__Compuesta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1246:1: ( ( ( rule__Compuesta__Group_2__0 )* ) )
            // InternalGramatica.g:1247:1: ( ( rule__Compuesta__Group_2__0 )* )
            {
            // InternalGramatica.g:1247:1: ( ( rule__Compuesta__Group_2__0 )* )
            // InternalGramatica.g:1248:2: ( rule__Compuesta__Group_2__0 )*
            {
             before(grammarAccess.getCompuestaAccess().getGroup_2()); 
            // InternalGramatica.g:1249:2: ( rule__Compuesta__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=25 && LA17_0<=26)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGramatica.g:1249:3: rule__Compuesta__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Compuesta__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCompuestaAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Compuesta__Group_2__0"
    // InternalGramatica.g:1258:1: rule__Compuesta__Group_2__0 : rule__Compuesta__Group_2__0__Impl rule__Compuesta__Group_2__1 ;
    public final void rule__Compuesta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1262:1: ( rule__Compuesta__Group_2__0__Impl rule__Compuesta__Group_2__1 )
            // InternalGramatica.g:1263:2: rule__Compuesta__Group_2__0__Impl rule__Compuesta__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Compuesta__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesta__Group_2__1();

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
    // $ANTLR end "rule__Compuesta__Group_2__0"


    // $ANTLR start "rule__Compuesta__Group_2__0__Impl"
    // InternalGramatica.g:1270:1: rule__Compuesta__Group_2__0__Impl : ( ( rule__Compuesta__NexoAssignment_2_0 ) ) ;
    public final void rule__Compuesta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1274:1: ( ( ( rule__Compuesta__NexoAssignment_2_0 ) ) )
            // InternalGramatica.g:1275:1: ( ( rule__Compuesta__NexoAssignment_2_0 ) )
            {
            // InternalGramatica.g:1275:1: ( ( rule__Compuesta__NexoAssignment_2_0 ) )
            // InternalGramatica.g:1276:2: ( rule__Compuesta__NexoAssignment_2_0 )
            {
             before(grammarAccess.getCompuestaAccess().getNexoAssignment_2_0()); 
            // InternalGramatica.g:1277:2: ( rule__Compuesta__NexoAssignment_2_0 )
            // InternalGramatica.g:1277:3: rule__Compuesta__NexoAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__NexoAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getNexoAssignment_2_0()); 

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
    // $ANTLR end "rule__Compuesta__Group_2__0__Impl"


    // $ANTLR start "rule__Compuesta__Group_2__1"
    // InternalGramatica.g:1285:1: rule__Compuesta__Group_2__1 : rule__Compuesta__Group_2__1__Impl ;
    public final void rule__Compuesta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1289:1: ( rule__Compuesta__Group_2__1__Impl )
            // InternalGramatica.g:1290:2: rule__Compuesta__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__Group_2__1__Impl();

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
    // $ANTLR end "rule__Compuesta__Group_2__1"


    // $ANTLR start "rule__Compuesta__Group_2__1__Impl"
    // InternalGramatica.g:1296:1: rule__Compuesta__Group_2__1__Impl : ( ( rule__Compuesta__SimpleFinalAssignment_2_1 ) ) ;
    public final void rule__Compuesta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1300:1: ( ( ( rule__Compuesta__SimpleFinalAssignment_2_1 ) ) )
            // InternalGramatica.g:1301:1: ( ( rule__Compuesta__SimpleFinalAssignment_2_1 ) )
            {
            // InternalGramatica.g:1301:1: ( ( rule__Compuesta__SimpleFinalAssignment_2_1 ) )
            // InternalGramatica.g:1302:2: ( rule__Compuesta__SimpleFinalAssignment_2_1 )
            {
             before(grammarAccess.getCompuestaAccess().getSimpleFinalAssignment_2_1()); 
            // InternalGramatica.g:1303:2: ( rule__Compuesta__SimpleFinalAssignment_2_1 )
            // InternalGramatica.g:1303:3: rule__Compuesta__SimpleFinalAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Compuesta__SimpleFinalAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompuestaAccess().getSimpleFinalAssignment_2_1()); 

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
    // $ANTLR end "rule__Compuesta__Group_2__1__Impl"


    // $ANTLR start "rule__Compleja__Group__0"
    // InternalGramatica.g:1312:1: rule__Compleja__Group__0 : rule__Compleja__Group__0__Impl rule__Compleja__Group__1 ;
    public final void rule__Compleja__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1316:1: ( rule__Compleja__Group__0__Impl rule__Compleja__Group__1 )
            // InternalGramatica.g:1317:2: rule__Compleja__Group__0__Impl rule__Compleja__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGramatica.g:1324:1: rule__Compleja__Group__0__Impl : ( ( rule__Compleja__DeterminanteAssignment_0 ) ) ;
    public final void rule__Compleja__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1328:1: ( ( ( rule__Compleja__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:1329:1: ( ( rule__Compleja__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:1329:1: ( ( rule__Compleja__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:1330:2: ( rule__Compleja__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getComplejaAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:1331:2: ( rule__Compleja__DeterminanteAssignment_0 )
            // InternalGramatica.g:1331:3: rule__Compleja__DeterminanteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__DeterminanteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getDeterminanteAssignment_0()); 

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
    // InternalGramatica.g:1339:1: rule__Compleja__Group__1 : rule__Compleja__Group__1__Impl rule__Compleja__Group__2 ;
    public final void rule__Compleja__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1343:1: ( rule__Compleja__Group__1__Impl rule__Compleja__Group__2 )
            // InternalGramatica.g:1344:2: rule__Compleja__Group__1__Impl rule__Compleja__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGramatica.g:1351:1: rule__Compleja__Group__1__Impl : ( ( rule__Compleja__AtrAssignment_1 ) ) ;
    public final void rule__Compleja__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1355:1: ( ( ( rule__Compleja__AtrAssignment_1 ) ) )
            // InternalGramatica.g:1356:1: ( ( rule__Compleja__AtrAssignment_1 ) )
            {
            // InternalGramatica.g:1356:1: ( ( rule__Compleja__AtrAssignment_1 ) )
            // InternalGramatica.g:1357:2: ( rule__Compleja__AtrAssignment_1 )
            {
             before(grammarAccess.getComplejaAccess().getAtrAssignment_1()); 
            // InternalGramatica.g:1358:2: ( rule__Compleja__AtrAssignment_1 )
            // InternalGramatica.g:1358:3: rule__Compleja__AtrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__AtrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAtrAssignment_1()); 

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
    // InternalGramatica.g:1366:1: rule__Compleja__Group__2 : rule__Compleja__Group__2__Impl rule__Compleja__Group__3 ;
    public final void rule__Compleja__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1370:1: ( rule__Compleja__Group__2__Impl rule__Compleja__Group__3 )
            // InternalGramatica.g:1371:2: rule__Compleja__Group__2__Impl rule__Compleja__Group__3
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
    // InternalGramatica.g:1378:1: rule__Compleja__Group__2__Impl : ( ( rule__Compleja__SintagmaAssignment_2 ) ) ;
    public final void rule__Compleja__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1382:1: ( ( ( rule__Compleja__SintagmaAssignment_2 ) ) )
            // InternalGramatica.g:1383:1: ( ( rule__Compleja__SintagmaAssignment_2 ) )
            {
            // InternalGramatica.g:1383:1: ( ( rule__Compleja__SintagmaAssignment_2 ) )
            // InternalGramatica.g:1384:2: ( rule__Compleja__SintagmaAssignment_2 )
            {
             before(grammarAccess.getComplejaAccess().getSintagmaAssignment_2()); 
            // InternalGramatica.g:1385:2: ( rule__Compleja__SintagmaAssignment_2 )
            // InternalGramatica.g:1385:3: rule__Compleja__SintagmaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__SintagmaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getSintagmaAssignment_2()); 

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
    // InternalGramatica.g:1393:1: rule__Compleja__Group__3 : rule__Compleja__Group__3__Impl rule__Compleja__Group__4 ;
    public final void rule__Compleja__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1397:1: ( rule__Compleja__Group__3__Impl rule__Compleja__Group__4 )
            // InternalGramatica.g:1398:2: rule__Compleja__Group__3__Impl rule__Compleja__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGramatica.g:1405:1: rule__Compleja__Group__3__Impl : ( ( rule__Compleja__ContextoAssignment_3 ) ) ;
    public final void rule__Compleja__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1409:1: ( ( ( rule__Compleja__ContextoAssignment_3 ) ) )
            // InternalGramatica.g:1410:1: ( ( rule__Compleja__ContextoAssignment_3 ) )
            {
            // InternalGramatica.g:1410:1: ( ( rule__Compleja__ContextoAssignment_3 ) )
            // InternalGramatica.g:1411:2: ( rule__Compleja__ContextoAssignment_3 )
            {
             before(grammarAccess.getComplejaAccess().getContextoAssignment_3()); 
            // InternalGramatica.g:1412:2: ( rule__Compleja__ContextoAssignment_3 )
            // InternalGramatica.g:1412:3: rule__Compleja__ContextoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__ContextoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getContextoAssignment_3()); 

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
    // InternalGramatica.g:1420:1: rule__Compleja__Group__4 : rule__Compleja__Group__4__Impl rule__Compleja__Group__5 ;
    public final void rule__Compleja__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1424:1: ( rule__Compleja__Group__4__Impl rule__Compleja__Group__5 )
            // InternalGramatica.g:1425:2: rule__Compleja__Group__4__Impl rule__Compleja__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGramatica.g:1432:1: rule__Compleja__Group__4__Impl : ( ( rule__Compleja__ConectAssignment_4 ) ) ;
    public final void rule__Compleja__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1436:1: ( ( ( rule__Compleja__ConectAssignment_4 ) ) )
            // InternalGramatica.g:1437:1: ( ( rule__Compleja__ConectAssignment_4 ) )
            {
            // InternalGramatica.g:1437:1: ( ( rule__Compleja__ConectAssignment_4 ) )
            // InternalGramatica.g:1438:2: ( rule__Compleja__ConectAssignment_4 )
            {
             before(grammarAccess.getComplejaAccess().getConectAssignment_4()); 
            // InternalGramatica.g:1439:2: ( rule__Compleja__ConectAssignment_4 )
            // InternalGramatica.g:1439:3: rule__Compleja__ConectAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__ConectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getConectAssignment_4()); 

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
    // InternalGramatica.g:1447:1: rule__Compleja__Group__5 : rule__Compleja__Group__5__Impl rule__Compleja__Group__6 ;
    public final void rule__Compleja__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1451:1: ( rule__Compleja__Group__5__Impl rule__Compleja__Group__6 )
            // InternalGramatica.g:1452:2: rule__Compleja__Group__5__Impl rule__Compleja__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalGramatica.g:1459:1: rule__Compleja__Group__5__Impl : ( ( rule__Compleja__Group_5__0 )? ) ;
    public final void rule__Compleja__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1463:1: ( ( ( rule__Compleja__Group_5__0 )? ) )
            // InternalGramatica.g:1464:1: ( ( rule__Compleja__Group_5__0 )? )
            {
            // InternalGramatica.g:1464:1: ( ( rule__Compleja__Group_5__0 )? )
            // InternalGramatica.g:1465:2: ( rule__Compleja__Group_5__0 )?
            {
             before(grammarAccess.getComplejaAccess().getGroup_5()); 
            // InternalGramatica.g:1466:2: ( rule__Compleja__Group_5__0 )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA18_1 = input.LA(2);

                    if ( ((LA18_1>=12 && LA18_1<=14)) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 30:
                    {
                    int LA18_2 = input.LA(2);

                    if ( ((LA18_2>=12 && LA18_2<=14)) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA18_3 = input.LA(2);

                    if ( ((LA18_3>=12 && LA18_3<=14)) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA18_4 = input.LA(2);

                    if ( ((LA18_4>=12 && LA18_4<=14)) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA18_5 = input.LA(2);

                    if ( ((LA18_5>=12 && LA18_5<=14)) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA18_6 = input.LA(2);

                    if ( ((LA18_6>=12 && LA18_6<=14)) ) {
                        alt18=1;
                    }
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // InternalGramatica.g:1466:3: rule__Compleja__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getGroup_5()); 

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
    // InternalGramatica.g:1474:1: rule__Compleja__Group__6 : rule__Compleja__Group__6__Impl rule__Compleja__Group__7 ;
    public final void rule__Compleja__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1478:1: ( rule__Compleja__Group__6__Impl rule__Compleja__Group__7 )
            // InternalGramatica.g:1479:2: rule__Compleja__Group__6__Impl rule__Compleja__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalGramatica.g:1486:1: rule__Compleja__Group__6__Impl : ( ( rule__Compleja__OpeColAssignment_6 )? ) ;
    public final void rule__Compleja__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1490:1: ( ( ( rule__Compleja__OpeColAssignment_6 )? ) )
            // InternalGramatica.g:1491:1: ( ( rule__Compleja__OpeColAssignment_6 )? )
            {
            // InternalGramatica.g:1491:1: ( ( rule__Compleja__OpeColAssignment_6 )? )
            // InternalGramatica.g:1492:2: ( rule__Compleja__OpeColAssignment_6 )?
            {
             before(grammarAccess.getComplejaAccess().getOpeColAssignment_6()); 
            // InternalGramatica.g:1493:2: ( rule__Compleja__OpeColAssignment_6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=29 && LA19_0<=34)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGramatica.g:1493:3: rule__Compleja__OpeColAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__OpeColAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getOpeColAssignment_6()); 

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
    // InternalGramatica.g:1501:1: rule__Compleja__Group__7 : rule__Compleja__Group__7__Impl rule__Compleja__Group__8 ;
    public final void rule__Compleja__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1505:1: ( rule__Compleja__Group__7__Impl rule__Compleja__Group__8 )
            // InternalGramatica.g:1506:2: rule__Compleja__Group__7__Impl rule__Compleja__Group__8
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
    // InternalGramatica.g:1513:1: rule__Compleja__Group__7__Impl : ( ( rule__Compleja__Group_7__0 )? ) ;
    public final void rule__Compleja__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1517:1: ( ( ( rule__Compleja__Group_7__0 )? ) )
            // InternalGramatica.g:1518:1: ( ( rule__Compleja__Group_7__0 )? )
            {
            // InternalGramatica.g:1518:1: ( ( rule__Compleja__Group_7__0 )? )
            // InternalGramatica.g:1519:2: ( rule__Compleja__Group_7__0 )?
            {
             before(grammarAccess.getComplejaAccess().getGroup_7()); 
            // InternalGramatica.g:1520:2: ( rule__Compleja__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=17 && LA20_0<=24)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGramatica.g:1520:3: rule__Compleja__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getGroup_7()); 

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
    // InternalGramatica.g:1528:1: rule__Compleja__Group__8 : rule__Compleja__Group__8__Impl ;
    public final void rule__Compleja__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1532:1: ( rule__Compleja__Group__8__Impl )
            // InternalGramatica.g:1533:2: rule__Compleja__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group__8__Impl();

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
    // InternalGramatica.g:1539:1: rule__Compleja__Group__8__Impl : ( ( rule__Compleja__FinOracionAssignment_8 ) ) ;
    public final void rule__Compleja__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1543:1: ( ( ( rule__Compleja__FinOracionAssignment_8 ) ) )
            // InternalGramatica.g:1544:1: ( ( rule__Compleja__FinOracionAssignment_8 ) )
            {
            // InternalGramatica.g:1544:1: ( ( rule__Compleja__FinOracionAssignment_8 ) )
            // InternalGramatica.g:1545:2: ( rule__Compleja__FinOracionAssignment_8 )
            {
             before(grammarAccess.getComplejaAccess().getFinOracionAssignment_8()); 
            // InternalGramatica.g:1546:2: ( rule__Compleja__FinOracionAssignment_8 )
            // InternalGramatica.g:1546:3: rule__Compleja__FinOracionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__FinOracionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getFinOracionAssignment_8()); 

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


    // $ANTLR start "rule__Compleja__Group_5__0"
    // InternalGramatica.g:1555:1: rule__Compleja__Group_5__0 : rule__Compleja__Group_5__0__Impl rule__Compleja__Group_5__1 ;
    public final void rule__Compleja__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1559:1: ( rule__Compleja__Group_5__0__Impl rule__Compleja__Group_5__1 )
            // InternalGramatica.g:1560:2: rule__Compleja__Group_5__0__Impl rule__Compleja__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Compleja__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5__1();

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
    // $ANTLR end "rule__Compleja__Group_5__0"


    // $ANTLR start "rule__Compleja__Group_5__0__Impl"
    // InternalGramatica.g:1567:1: rule__Compleja__Group_5__0__Impl : ( ( rule__Compleja__OperacionColeccionAssignment_5_0 ) ) ;
    public final void rule__Compleja__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1571:1: ( ( ( rule__Compleja__OperacionColeccionAssignment_5_0 ) ) )
            // InternalGramatica.g:1572:1: ( ( rule__Compleja__OperacionColeccionAssignment_5_0 ) )
            {
            // InternalGramatica.g:1572:1: ( ( rule__Compleja__OperacionColeccionAssignment_5_0 ) )
            // InternalGramatica.g:1573:2: ( rule__Compleja__OperacionColeccionAssignment_5_0 )
            {
             before(grammarAccess.getComplejaAccess().getOperacionColeccionAssignment_5_0()); 
            // InternalGramatica.g:1574:2: ( rule__Compleja__OperacionColeccionAssignment_5_0 )
            // InternalGramatica.g:1574:3: rule__Compleja__OperacionColeccionAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__OperacionColeccionAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getOperacionColeccionAssignment_5_0()); 

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
    // $ANTLR end "rule__Compleja__Group_5__0__Impl"


    // $ANTLR start "rule__Compleja__Group_5__1"
    // InternalGramatica.g:1582:1: rule__Compleja__Group_5__1 : rule__Compleja__Group_5__1__Impl rule__Compleja__Group_5__2 ;
    public final void rule__Compleja__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1586:1: ( rule__Compleja__Group_5__1__Impl rule__Compleja__Group_5__2 )
            // InternalGramatica.g:1587:2: rule__Compleja__Group_5__1__Impl rule__Compleja__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__Compleja__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5__2();

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
    // $ANTLR end "rule__Compleja__Group_5__1"


    // $ANTLR start "rule__Compleja__Group_5__1__Impl"
    // InternalGramatica.g:1594:1: rule__Compleja__Group_5__1__Impl : ( ( rule__Compleja__Determinante1Assignment_5_1 ) ) ;
    public final void rule__Compleja__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1598:1: ( ( ( rule__Compleja__Determinante1Assignment_5_1 ) ) )
            // InternalGramatica.g:1599:1: ( ( rule__Compleja__Determinante1Assignment_5_1 ) )
            {
            // InternalGramatica.g:1599:1: ( ( rule__Compleja__Determinante1Assignment_5_1 ) )
            // InternalGramatica.g:1600:2: ( rule__Compleja__Determinante1Assignment_5_1 )
            {
             before(grammarAccess.getComplejaAccess().getDeterminante1Assignment_5_1()); 
            // InternalGramatica.g:1601:2: ( rule__Compleja__Determinante1Assignment_5_1 )
            // InternalGramatica.g:1601:3: rule__Compleja__Determinante1Assignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Determinante1Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getDeterminante1Assignment_5_1()); 

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
    // $ANTLR end "rule__Compleja__Group_5__1__Impl"


    // $ANTLR start "rule__Compleja__Group_5__2"
    // InternalGramatica.g:1609:1: rule__Compleja__Group_5__2 : rule__Compleja__Group_5__2__Impl rule__Compleja__Group_5__3 ;
    public final void rule__Compleja__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1613:1: ( rule__Compleja__Group_5__2__Impl rule__Compleja__Group_5__3 )
            // InternalGramatica.g:1614:2: rule__Compleja__Group_5__2__Impl rule__Compleja__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Compleja__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5__3();

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
    // $ANTLR end "rule__Compleja__Group_5__2"


    // $ANTLR start "rule__Compleja__Group_5__2__Impl"
    // InternalGramatica.g:1621:1: rule__Compleja__Group_5__2__Impl : ( ( rule__Compleja__ClaseAssignment_5_2 ) ) ;
    public final void rule__Compleja__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1625:1: ( ( ( rule__Compleja__ClaseAssignment_5_2 ) ) )
            // InternalGramatica.g:1626:1: ( ( rule__Compleja__ClaseAssignment_5_2 ) )
            {
            // InternalGramatica.g:1626:1: ( ( rule__Compleja__ClaseAssignment_5_2 ) )
            // InternalGramatica.g:1627:2: ( rule__Compleja__ClaseAssignment_5_2 )
            {
             before(grammarAccess.getComplejaAccess().getClaseAssignment_5_2()); 
            // InternalGramatica.g:1628:2: ( rule__Compleja__ClaseAssignment_5_2 )
            // InternalGramatica.g:1628:3: rule__Compleja__ClaseAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__ClaseAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getClaseAssignment_5_2()); 

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
    // $ANTLR end "rule__Compleja__Group_5__2__Impl"


    // $ANTLR start "rule__Compleja__Group_5__3"
    // InternalGramatica.g:1636:1: rule__Compleja__Group_5__3 : rule__Compleja__Group_5__3__Impl rule__Compleja__Group_5__4 ;
    public final void rule__Compleja__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1640:1: ( rule__Compleja__Group_5__3__Impl rule__Compleja__Group_5__4 )
            // InternalGramatica.g:1641:2: rule__Compleja__Group_5__3__Impl rule__Compleja__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__Compleja__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5__4();

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
    // $ANTLR end "rule__Compleja__Group_5__3"


    // $ANTLR start "rule__Compleja__Group_5__3__Impl"
    // InternalGramatica.g:1648:1: rule__Compleja__Group_5__3__Impl : ( ( rule__Compleja__Conect1Assignment_5_3 ) ) ;
    public final void rule__Compleja__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1652:1: ( ( ( rule__Compleja__Conect1Assignment_5_3 ) ) )
            // InternalGramatica.g:1653:1: ( ( rule__Compleja__Conect1Assignment_5_3 ) )
            {
            // InternalGramatica.g:1653:1: ( ( rule__Compleja__Conect1Assignment_5_3 ) )
            // InternalGramatica.g:1654:2: ( rule__Compleja__Conect1Assignment_5_3 )
            {
             before(grammarAccess.getComplejaAccess().getConect1Assignment_5_3()); 
            // InternalGramatica.g:1655:2: ( rule__Compleja__Conect1Assignment_5_3 )
            // InternalGramatica.g:1655:3: rule__Compleja__Conect1Assignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Conect1Assignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getConect1Assignment_5_3()); 

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
    // $ANTLR end "rule__Compleja__Group_5__3__Impl"


    // $ANTLR start "rule__Compleja__Group_5__4"
    // InternalGramatica.g:1663:1: rule__Compleja__Group_5__4 : rule__Compleja__Group_5__4__Impl rule__Compleja__Group_5__5 ;
    public final void rule__Compleja__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1667:1: ( rule__Compleja__Group_5__4__Impl rule__Compleja__Group_5__5 )
            // InternalGramatica.g:1668:2: rule__Compleja__Group_5__4__Impl rule__Compleja__Group_5__5
            {
            pushFollow(FOLLOW_16);
            rule__Compleja__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5__5();

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
    // $ANTLR end "rule__Compleja__Group_5__4"


    // $ANTLR start "rule__Compleja__Group_5__4__Impl"
    // InternalGramatica.g:1675:1: rule__Compleja__Group_5__4__Impl : ( ( rule__Compleja__Group_5_4__0 )? ) ;
    public final void rule__Compleja__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1679:1: ( ( ( rule__Compleja__Group_5_4__0 )? ) )
            // InternalGramatica.g:1680:1: ( ( rule__Compleja__Group_5_4__0 )? )
            {
            // InternalGramatica.g:1680:1: ( ( rule__Compleja__Group_5_4__0 )? )
            // InternalGramatica.g:1681:2: ( rule__Compleja__Group_5_4__0 )?
            {
             before(grammarAccess.getComplejaAccess().getGroup_5_4()); 
            // InternalGramatica.g:1682:2: ( rule__Compleja__Group_5_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGramatica.g:1682:3: rule__Compleja__Group_5_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Group_5_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getGroup_5_4()); 

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
    // $ANTLR end "rule__Compleja__Group_5__4__Impl"


    // $ANTLR start "rule__Compleja__Group_5__5"
    // InternalGramatica.g:1690:1: rule__Compleja__Group_5__5 : rule__Compleja__Group_5__5__Impl ;
    public final void rule__Compleja__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1694:1: ( rule__Compleja__Group_5__5__Impl )
            // InternalGramatica.g:1695:2: rule__Compleja__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5__5__Impl();

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
    // $ANTLR end "rule__Compleja__Group_5__5"


    // $ANTLR start "rule__Compleja__Group_5__5__Impl"
    // InternalGramatica.g:1701:1: rule__Compleja__Group_5__5__Impl : ( ( rule__Compleja__Conec1Assignment_5_5 )? ) ;
    public final void rule__Compleja__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1705:1: ( ( ( rule__Compleja__Conec1Assignment_5_5 )? ) )
            // InternalGramatica.g:1706:1: ( ( rule__Compleja__Conec1Assignment_5_5 )? )
            {
            // InternalGramatica.g:1706:1: ( ( rule__Compleja__Conec1Assignment_5_5 )? )
            // InternalGramatica.g:1707:2: ( rule__Compleja__Conec1Assignment_5_5 )?
            {
             before(grammarAccess.getComplejaAccess().getConec1Assignment_5_5()); 
            // InternalGramatica.g:1708:2: ( rule__Compleja__Conec1Assignment_5_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=27 && LA22_0<=28)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGramatica.g:1708:3: rule__Compleja__Conec1Assignment_5_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Conec1Assignment_5_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getConec1Assignment_5_5()); 

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
    // $ANTLR end "rule__Compleja__Group_5__5__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4__0"
    // InternalGramatica.g:1717:1: rule__Compleja__Group_5_4__0 : rule__Compleja__Group_5_4__0__Impl rule__Compleja__Group_5_4__1 ;
    public final void rule__Compleja__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1721:1: ( rule__Compleja__Group_5_4__0__Impl rule__Compleja__Group_5_4__1 )
            // InternalGramatica.g:1722:2: rule__Compleja__Group_5_4__0__Impl rule__Compleja__Group_5_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Compleja__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4__1();

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
    // $ANTLR end "rule__Compleja__Group_5_4__0"


    // $ANTLR start "rule__Compleja__Group_5_4__0__Impl"
    // InternalGramatica.g:1729:1: rule__Compleja__Group_5_4__0__Impl : ( ( rule__Compleja__Atr1Assignment_5_4_0 ) ) ;
    public final void rule__Compleja__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1733:1: ( ( ( rule__Compleja__Atr1Assignment_5_4_0 ) ) )
            // InternalGramatica.g:1734:1: ( ( rule__Compleja__Atr1Assignment_5_4_0 ) )
            {
            // InternalGramatica.g:1734:1: ( ( rule__Compleja__Atr1Assignment_5_4_0 ) )
            // InternalGramatica.g:1735:2: ( rule__Compleja__Atr1Assignment_5_4_0 )
            {
             before(grammarAccess.getComplejaAccess().getAtr1Assignment_5_4_0()); 
            // InternalGramatica.g:1736:2: ( rule__Compleja__Atr1Assignment_5_4_0 )
            // InternalGramatica.g:1736:3: rule__Compleja__Atr1Assignment_5_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Atr1Assignment_5_4_0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAtr1Assignment_5_4_0()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4__0__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4__1"
    // InternalGramatica.g:1744:1: rule__Compleja__Group_5_4__1 : rule__Compleja__Group_5_4__1__Impl rule__Compleja__Group_5_4__2 ;
    public final void rule__Compleja__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1748:1: ( rule__Compleja__Group_5_4__1__Impl rule__Compleja__Group_5_4__2 )
            // InternalGramatica.g:1749:2: rule__Compleja__Group_5_4__1__Impl rule__Compleja__Group_5_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Compleja__Group_5_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4__2();

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
    // $ANTLR end "rule__Compleja__Group_5_4__1"


    // $ANTLR start "rule__Compleja__Group_5_4__1__Impl"
    // InternalGramatica.g:1756:1: rule__Compleja__Group_5_4__1__Impl : ( ( rule__Compleja__Ope3Assignment_5_4_1 ) ) ;
    public final void rule__Compleja__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1760:1: ( ( ( rule__Compleja__Ope3Assignment_5_4_1 ) ) )
            // InternalGramatica.g:1761:1: ( ( rule__Compleja__Ope3Assignment_5_4_1 ) )
            {
            // InternalGramatica.g:1761:1: ( ( rule__Compleja__Ope3Assignment_5_4_1 ) )
            // InternalGramatica.g:1762:2: ( rule__Compleja__Ope3Assignment_5_4_1 )
            {
             before(grammarAccess.getComplejaAccess().getOpe3Assignment_5_4_1()); 
            // InternalGramatica.g:1763:2: ( rule__Compleja__Ope3Assignment_5_4_1 )
            // InternalGramatica.g:1763:3: rule__Compleja__Ope3Assignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Ope3Assignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getOpe3Assignment_5_4_1()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4__1__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4__2"
    // InternalGramatica.g:1771:1: rule__Compleja__Group_5_4__2 : rule__Compleja__Group_5_4__2__Impl rule__Compleja__Group_5_4__3 ;
    public final void rule__Compleja__Group_5_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1775:1: ( rule__Compleja__Group_5_4__2__Impl rule__Compleja__Group_5_4__3 )
            // InternalGramatica.g:1776:2: rule__Compleja__Group_5_4__2__Impl rule__Compleja__Group_5_4__3
            {
            pushFollow(FOLLOW_19);
            rule__Compleja__Group_5_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4__3();

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
    // $ANTLR end "rule__Compleja__Group_5_4__2"


    // $ANTLR start "rule__Compleja__Group_5_4__2__Impl"
    // InternalGramatica.g:1783:1: rule__Compleja__Group_5_4__2__Impl : ( ( rule__Compleja__Alternatives_5_4_2 ) ) ;
    public final void rule__Compleja__Group_5_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1787:1: ( ( ( rule__Compleja__Alternatives_5_4_2 ) ) )
            // InternalGramatica.g:1788:1: ( ( rule__Compleja__Alternatives_5_4_2 ) )
            {
            // InternalGramatica.g:1788:1: ( ( rule__Compleja__Alternatives_5_4_2 ) )
            // InternalGramatica.g:1789:2: ( rule__Compleja__Alternatives_5_4_2 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_5_4_2()); 
            // InternalGramatica.g:1790:2: ( rule__Compleja__Alternatives_5_4_2 )
            // InternalGramatica.g:1790:3: rule__Compleja__Alternatives_5_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_5_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_5_4_2()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4__2__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4__3"
    // InternalGramatica.g:1798:1: rule__Compleja__Group_5_4__3 : rule__Compleja__Group_5_4__3__Impl rule__Compleja__Group_5_4__4 ;
    public final void rule__Compleja__Group_5_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1802:1: ( rule__Compleja__Group_5_4__3__Impl rule__Compleja__Group_5_4__4 )
            // InternalGramatica.g:1803:2: rule__Compleja__Group_5_4__3__Impl rule__Compleja__Group_5_4__4
            {
            pushFollow(FOLLOW_19);
            rule__Compleja__Group_5_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4__4();

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
    // $ANTLR end "rule__Compleja__Group_5_4__3"


    // $ANTLR start "rule__Compleja__Group_5_4__3__Impl"
    // InternalGramatica.g:1810:1: rule__Compleja__Group_5_4__3__Impl : ( ( rule__Compleja__Ope4Assignment_5_4_3 )? ) ;
    public final void rule__Compleja__Group_5_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1814:1: ( ( ( rule__Compleja__Ope4Assignment_5_4_3 )? ) )
            // InternalGramatica.g:1815:1: ( ( rule__Compleja__Ope4Assignment_5_4_3 )? )
            {
            // InternalGramatica.g:1815:1: ( ( rule__Compleja__Ope4Assignment_5_4_3 )? )
            // InternalGramatica.g:1816:2: ( rule__Compleja__Ope4Assignment_5_4_3 )?
            {
             before(grammarAccess.getComplejaAccess().getOpe4Assignment_5_4_3()); 
            // InternalGramatica.g:1817:2: ( rule__Compleja__Ope4Assignment_5_4_3 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalGramatica.g:1817:3: rule__Compleja__Ope4Assignment_5_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Ope4Assignment_5_4_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getOpe4Assignment_5_4_3()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4__3__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4__4"
    // InternalGramatica.g:1825:1: rule__Compleja__Group_5_4__4 : rule__Compleja__Group_5_4__4__Impl ;
    public final void rule__Compleja__Group_5_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1829:1: ( rule__Compleja__Group_5_4__4__Impl )
            // InternalGramatica.g:1830:2: rule__Compleja__Group_5_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4__4__Impl();

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
    // $ANTLR end "rule__Compleja__Group_5_4__4"


    // $ANTLR start "rule__Compleja__Group_5_4__4__Impl"
    // InternalGramatica.g:1836:1: rule__Compleja__Group_5_4__4__Impl : ( ( rule__Compleja__Group_5_4_4__0 )? ) ;
    public final void rule__Compleja__Group_5_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1840:1: ( ( ( rule__Compleja__Group_5_4_4__0 )? ) )
            // InternalGramatica.g:1841:1: ( ( rule__Compleja__Group_5_4_4__0 )? )
            {
            // InternalGramatica.g:1841:1: ( ( rule__Compleja__Group_5_4_4__0 )? )
            // InternalGramatica.g:1842:2: ( rule__Compleja__Group_5_4_4__0 )?
            {
             before(grammarAccess.getComplejaAccess().getGroup_5_4_4()); 
            // InternalGramatica.g:1843:2: ( rule__Compleja__Group_5_4_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGramatica.g:1843:3: rule__Compleja__Group_5_4_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compleja__Group_5_4_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplejaAccess().getGroup_5_4_4()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4__4__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4_4__0"
    // InternalGramatica.g:1852:1: rule__Compleja__Group_5_4_4__0 : rule__Compleja__Group_5_4_4__0__Impl rule__Compleja__Group_5_4_4__1 ;
    public final void rule__Compleja__Group_5_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1856:1: ( rule__Compleja__Group_5_4_4__0__Impl rule__Compleja__Group_5_4_4__1 )
            // InternalGramatica.g:1857:2: rule__Compleja__Group_5_4_4__0__Impl rule__Compleja__Group_5_4_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Compleja__Group_5_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4_4__1();

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
    // $ANTLR end "rule__Compleja__Group_5_4_4__0"


    // $ANTLR start "rule__Compleja__Group_5_4_4__0__Impl"
    // InternalGramatica.g:1864:1: rule__Compleja__Group_5_4_4__0__Impl : ( ( rule__Compleja__Atr4Assignment_5_4_4_0 ) ) ;
    public final void rule__Compleja__Group_5_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1868:1: ( ( ( rule__Compleja__Atr4Assignment_5_4_4_0 ) ) )
            // InternalGramatica.g:1869:1: ( ( rule__Compleja__Atr4Assignment_5_4_4_0 ) )
            {
            // InternalGramatica.g:1869:1: ( ( rule__Compleja__Atr4Assignment_5_4_4_0 ) )
            // InternalGramatica.g:1870:2: ( rule__Compleja__Atr4Assignment_5_4_4_0 )
            {
             before(grammarAccess.getComplejaAccess().getAtr4Assignment_5_4_4_0()); 
            // InternalGramatica.g:1871:2: ( rule__Compleja__Atr4Assignment_5_4_4_0 )
            // InternalGramatica.g:1871:3: rule__Compleja__Atr4Assignment_5_4_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Atr4Assignment_5_4_4_0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAtr4Assignment_5_4_4_0()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4_4__0__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4_4__1"
    // InternalGramatica.g:1879:1: rule__Compleja__Group_5_4_4__1 : rule__Compleja__Group_5_4_4__1__Impl rule__Compleja__Group_5_4_4__2 ;
    public final void rule__Compleja__Group_5_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1883:1: ( rule__Compleja__Group_5_4_4__1__Impl rule__Compleja__Group_5_4_4__2 )
            // InternalGramatica.g:1884:2: rule__Compleja__Group_5_4_4__1__Impl rule__Compleja__Group_5_4_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Compleja__Group_5_4_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4_4__2();

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
    // $ANTLR end "rule__Compleja__Group_5_4_4__1"


    // $ANTLR start "rule__Compleja__Group_5_4_4__1__Impl"
    // InternalGramatica.g:1891:1: rule__Compleja__Group_5_4_4__1__Impl : ( ( rule__Compleja__Ope5Assignment_5_4_4_1 ) ) ;
    public final void rule__Compleja__Group_5_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1895:1: ( ( ( rule__Compleja__Ope5Assignment_5_4_4_1 ) ) )
            // InternalGramatica.g:1896:1: ( ( rule__Compleja__Ope5Assignment_5_4_4_1 ) )
            {
            // InternalGramatica.g:1896:1: ( ( rule__Compleja__Ope5Assignment_5_4_4_1 ) )
            // InternalGramatica.g:1897:2: ( rule__Compleja__Ope5Assignment_5_4_4_1 )
            {
             before(grammarAccess.getComplejaAccess().getOpe5Assignment_5_4_4_1()); 
            // InternalGramatica.g:1898:2: ( rule__Compleja__Ope5Assignment_5_4_4_1 )
            // InternalGramatica.g:1898:3: rule__Compleja__Ope5Assignment_5_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Ope5Assignment_5_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getOpe5Assignment_5_4_4_1()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4_4__1__Impl"


    // $ANTLR start "rule__Compleja__Group_5_4_4__2"
    // InternalGramatica.g:1906:1: rule__Compleja__Group_5_4_4__2 : rule__Compleja__Group_5_4_4__2__Impl ;
    public final void rule__Compleja__Group_5_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1910:1: ( rule__Compleja__Group_5_4_4__2__Impl )
            // InternalGramatica.g:1911:2: rule__Compleja__Group_5_4_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group_5_4_4__2__Impl();

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
    // $ANTLR end "rule__Compleja__Group_5_4_4__2"


    // $ANTLR start "rule__Compleja__Group_5_4_4__2__Impl"
    // InternalGramatica.g:1917:1: rule__Compleja__Group_5_4_4__2__Impl : ( ( rule__Compleja__Alternatives_5_4_4_2 ) ) ;
    public final void rule__Compleja__Group_5_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1921:1: ( ( ( rule__Compleja__Alternatives_5_4_4_2 ) ) )
            // InternalGramatica.g:1922:1: ( ( rule__Compleja__Alternatives_5_4_4_2 ) )
            {
            // InternalGramatica.g:1922:1: ( ( rule__Compleja__Alternatives_5_4_4_2 ) )
            // InternalGramatica.g:1923:2: ( rule__Compleja__Alternatives_5_4_4_2 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_5_4_4_2()); 
            // InternalGramatica.g:1924:2: ( rule__Compleja__Alternatives_5_4_4_2 )
            // InternalGramatica.g:1924:3: rule__Compleja__Alternatives_5_4_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_5_4_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_5_4_4_2()); 

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
    // $ANTLR end "rule__Compleja__Group_5_4_4__2__Impl"


    // $ANTLR start "rule__Compleja__Group_7__0"
    // InternalGramatica.g:1933:1: rule__Compleja__Group_7__0 : rule__Compleja__Group_7__0__Impl rule__Compleja__Group_7__1 ;
    public final void rule__Compleja__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1937:1: ( rule__Compleja__Group_7__0__Impl rule__Compleja__Group_7__1 )
            // InternalGramatica.g:1938:2: rule__Compleja__Group_7__0__Impl rule__Compleja__Group_7__1
            {
            pushFollow(FOLLOW_18);
            rule__Compleja__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compleja__Group_7__1();

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
    // $ANTLR end "rule__Compleja__Group_7__0"


    // $ANTLR start "rule__Compleja__Group_7__0__Impl"
    // InternalGramatica.g:1945:1: rule__Compleja__Group_7__0__Impl : ( ( rule__Compleja__Ope6Assignment_7_0 ) ) ;
    public final void rule__Compleja__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1949:1: ( ( ( rule__Compleja__Ope6Assignment_7_0 ) ) )
            // InternalGramatica.g:1950:1: ( ( rule__Compleja__Ope6Assignment_7_0 ) )
            {
            // InternalGramatica.g:1950:1: ( ( rule__Compleja__Ope6Assignment_7_0 ) )
            // InternalGramatica.g:1951:2: ( rule__Compleja__Ope6Assignment_7_0 )
            {
             before(grammarAccess.getComplejaAccess().getOpe6Assignment_7_0()); 
            // InternalGramatica.g:1952:2: ( rule__Compleja__Ope6Assignment_7_0 )
            // InternalGramatica.g:1952:3: rule__Compleja__Ope6Assignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Ope6Assignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getOpe6Assignment_7_0()); 

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
    // $ANTLR end "rule__Compleja__Group_7__0__Impl"


    // $ANTLR start "rule__Compleja__Group_7__1"
    // InternalGramatica.g:1960:1: rule__Compleja__Group_7__1 : rule__Compleja__Group_7__1__Impl ;
    public final void rule__Compleja__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1964:1: ( rule__Compleja__Group_7__1__Impl )
            // InternalGramatica.g:1965:2: rule__Compleja__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Group_7__1__Impl();

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
    // $ANTLR end "rule__Compleja__Group_7__1"


    // $ANTLR start "rule__Compleja__Group_7__1__Impl"
    // InternalGramatica.g:1971:1: rule__Compleja__Group_7__1__Impl : ( ( rule__Compleja__Alternatives_7_1 ) ) ;
    public final void rule__Compleja__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1975:1: ( ( ( rule__Compleja__Alternatives_7_1 ) ) )
            // InternalGramatica.g:1976:1: ( ( rule__Compleja__Alternatives_7_1 ) )
            {
            // InternalGramatica.g:1976:1: ( ( rule__Compleja__Alternatives_7_1 ) )
            // InternalGramatica.g:1977:2: ( rule__Compleja__Alternatives_7_1 )
            {
             before(grammarAccess.getComplejaAccess().getAlternatives_7_1()); 
            // InternalGramatica.g:1978:2: ( rule__Compleja__Alternatives_7_1 )
            // InternalGramatica.g:1978:3: rule__Compleja__Alternatives_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Compleja__Alternatives_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComplejaAccess().getAlternatives_7_1()); 

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
    // $ANTLR end "rule__Compleja__Group_7__1__Impl"


    // $ANTLR start "rule__Documento__PathModeloAssignment_0"
    // InternalGramatica.g:1987:1: rule__Documento__PathModeloAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Documento__PathModeloAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1991:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1992:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1992:2: ( RULE_STRING )
            // InternalGramatica.g:1993:3: RULE_STRING
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
    // InternalGramatica.g:2002:1: rule__Documento__PathOclAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Documento__PathOclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2006:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:2007:2: ( RULE_STRING )
            {
            // InternalGramatica.g:2007:2: ( RULE_STRING )
            // InternalGramatica.g:2008:3: RULE_STRING
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
    // InternalGramatica.g:2017:1: rule__Documento__OracionesAssignment_2 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2021:1: ( ( ruleOracion ) )
            // InternalGramatica.g:2022:2: ( ruleOracion )
            {
            // InternalGramatica.g:2022:2: ( ruleOracion )
            // InternalGramatica.g:2023:3: ruleOracion
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
    // InternalGramatica.g:2032:1: rule__Oracion__ContenidoAssignment_0 : ( ruleSimple ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2036:1: ( ( ruleSimple ) )
            // InternalGramatica.g:2037:2: ( ruleSimple )
            {
            // InternalGramatica.g:2037:2: ( ruleSimple )
            // InternalGramatica.g:2038:3: ruleSimple
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


    // $ANTLR start "rule__Oracion__ContenidoAssignment_1"
    // InternalGramatica.g:2047:1: rule__Oracion__ContenidoAssignment_1 : ( ruleCompuesta ) ;
    public final void rule__Oracion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2051:1: ( ( ruleCompuesta ) )
            // InternalGramatica.g:2052:2: ( ruleCompuesta )
            {
            // InternalGramatica.g:2052:2: ( ruleCompuesta )
            // InternalGramatica.g:2053:3: ruleCompuesta
            {
             before(grammarAccess.getOracionAccess().getContenidoCompuestaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompuesta();

            state._fsp--;

             after(grammarAccess.getOracionAccess().getContenidoCompuestaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Oracion__ContenidoAssignment_1"


    // $ANTLR start "rule__Oracion__ContenidoAssignment_2"
    // InternalGramatica.g:2062:1: rule__Oracion__ContenidoAssignment_2 : ( ruleCompleja ) ;
    public final void rule__Oracion__ContenidoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2066:1: ( ( ruleCompleja ) )
            // InternalGramatica.g:2067:2: ( ruleCompleja )
            {
            // InternalGramatica.g:2067:2: ( ruleCompleja )
            // InternalGramatica.g:2068:3: ruleCompleja
            {
             before(grammarAccess.getOracionAccess().getContenidoComplejaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompleja();

            state._fsp--;

             after(grammarAccess.getOracionAccess().getContenidoComplejaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Oracion__ContenidoAssignment_2"


    // $ANTLR start "rule__Simple__DeterminanteAssignment_0"
    // InternalGramatica.g:2077:1: rule__Simple__DeterminanteAssignment_0 : ( ruleDeterminante ) ;
    public final void rule__Simple__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2081:1: ( ( ruleDeterminante ) )
            // InternalGramatica.g:2082:2: ( ruleDeterminante )
            {
            // InternalGramatica.g:2082:2: ( ruleDeterminante )
            // InternalGramatica.g:2083:3: ruleDeterminante
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
    // InternalGramatica.g:2092:1: rule__Simple__AtributoAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2096:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2097:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2097:2: ( ruleAtributo )
            // InternalGramatica.g:2098:3: ruleAtributo
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
    // InternalGramatica.g:2107:1: rule__Simple__SintagmaAssignment_2 : ( ruleSintagmaPreposicional ) ;
    public final void rule__Simple__SintagmaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2111:1: ( ( ruleSintagmaPreposicional ) )
            // InternalGramatica.g:2112:2: ( ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:2112:2: ( ruleSintagmaPreposicional )
            // InternalGramatica.g:2113:3: ruleSintagmaPreposicional
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
    // InternalGramatica.g:2122:1: rule__Simple__ContextoAssignment_3 : ( ruleClase ) ;
    public final void rule__Simple__ContextoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2126:1: ( ( ruleClase ) )
            // InternalGramatica.g:2127:2: ( ruleClase )
            {
            // InternalGramatica.g:2127:2: ( ruleClase )
            // InternalGramatica.g:2128:3: ruleClase
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
    // InternalGramatica.g:2137:1: rule__Simple__ObligacionAssignment_4 : ( ruleObligacion ) ;
    public final void rule__Simple__ObligacionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2141:1: ( ( ruleObligacion ) )
            // InternalGramatica.g:2142:2: ( ruleObligacion )
            {
            // InternalGramatica.g:2142:2: ( ruleObligacion )
            // InternalGramatica.g:2143:3: ruleObligacion
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
    // InternalGramatica.g:2152:1: rule__Simple__OperacionAssignment_5 : ( ruleOperacion ) ;
    public final void rule__Simple__OperacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2156:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:2157:2: ( ruleOperacion )
            {
            // InternalGramatica.g:2157:2: ( ruleOperacion )
            // InternalGramatica.g:2158:3: ruleOperacion
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
    // InternalGramatica.g:2167:1: rule__Simple__LiteralAssignment_6_0 : ( ruleLiteral ) ;
    public final void rule__Simple__LiteralAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2171:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:2172:2: ( ruleLiteral )
            {
            // InternalGramatica.g:2172:2: ( ruleLiteral )
            // InternalGramatica.g:2173:3: ruleLiteral
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
    // InternalGramatica.g:2182:1: rule__Simple__AtributoAssignment_6_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2186:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2187:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2187:2: ( ruleAtributo )
            // InternalGramatica.g:2188:3: ruleAtributo
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
    // InternalGramatica.g:2197:1: rule__Simple__FinOracionAssignment_7 : ( ruleFinOracion ) ;
    public final void rule__Simple__FinOracionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2201:1: ( ( ruleFinOracion ) )
            // InternalGramatica.g:2202:2: ( ruleFinOracion )
            {
            // InternalGramatica.g:2202:2: ( ruleFinOracion )
            // InternalGramatica.g:2203:3: ruleFinOracion
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
    // InternalGramatica.g:2212:1: rule__Determinante__DescripcionAssignment : ( ( rule__Determinante__DescripcionAlternatives_0 ) ) ;
    public final void rule__Determinante__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2216:1: ( ( ( rule__Determinante__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:2217:2: ( ( rule__Determinante__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:2217:2: ( ( rule__Determinante__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:2218:3: ( rule__Determinante__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getDeterminanteAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:2219:3: ( rule__Determinante__DescripcionAlternatives_0 )
            // InternalGramatica.g:2219:4: rule__Determinante__DescripcionAlternatives_0
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


    // $ANTLR start "rule__Atributo__NameAssignment"
    // InternalGramatica.g:2227:1: rule__Atributo__NameAssignment : ( RULE_ID ) ;
    public final void rule__Atributo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2231:1: ( ( RULE_ID ) )
            // InternalGramatica.g:2232:2: ( RULE_ID )
            {
            // InternalGramatica.g:2232:2: ( RULE_ID )
            // InternalGramatica.g:2233:3: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Atributo__NameAssignment"


    // $ANTLR start "rule__SintagmaPreposicional__DescripcionAssignment"
    // InternalGramatica.g:2242:1: rule__SintagmaPreposicional__DescripcionAssignment : ( ( 'de un/una' ) ) ;
    public final void rule__SintagmaPreposicional__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2246:1: ( ( ( 'de un/una' ) ) )
            // InternalGramatica.g:2247:2: ( ( 'de un/una' ) )
            {
            // InternalGramatica.g:2247:2: ( ( 'de un/una' ) )
            // InternalGramatica.g:2248:3: ( 'de un/una' )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 
            // InternalGramatica.g:2249:3: ( 'de un/una' )
            // InternalGramatica.g:2250:4: 'de un/una'
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGramatica.g:2261:1: rule__Obligacion__NegacionAssignment_0 : ( ruleNegacion ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2265:1: ( ( ruleNegacion ) )
            // InternalGramatica.g:2266:2: ( ruleNegacion )
            {
            // InternalGramatica.g:2266:2: ( ruleNegacion )
            // InternalGramatica.g:2267:3: ruleNegacion
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
    // InternalGramatica.g:2276:1: rule__Obligacion__ObligacionDeberAssignment_1 : ( ruleObligacionDeber ) ;
    public final void rule__Obligacion__ObligacionDeberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2280:1: ( ( ruleObligacionDeber ) )
            // InternalGramatica.g:2281:2: ( ruleObligacionDeber )
            {
            // InternalGramatica.g:2281:2: ( ruleObligacionDeber )
            // InternalGramatica.g:2282:3: ruleObligacionDeber
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
    // InternalGramatica.g:2291:1: rule__ObligacionDeber__DescripcionAssignment : ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) ) ;
    public final void rule__ObligacionDeber__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2295:1: ( ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:2296:2: ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:2296:2: ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:2297:3: ( rule__ObligacionDeber__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getObligacionDeberAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:2298:3: ( rule__ObligacionDeber__DescripcionAlternatives_0 )
            // InternalGramatica.g:2298:4: rule__ObligacionDeber__DescripcionAlternatives_0
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
    // InternalGramatica.g:2306:1: rule__Negacion__DescripcionAssignment : ( ( 'no' ) ) ;
    public final void rule__Negacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2310:1: ( ( ( 'no' ) ) )
            // InternalGramatica.g:2311:2: ( ( 'no' ) )
            {
            // InternalGramatica.g:2311:2: ( ( 'no' ) )
            // InternalGramatica.g:2312:3: ( 'no' )
            {
             before(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 
            // InternalGramatica.g:2313:3: ( 'no' )
            // InternalGramatica.g:2314:4: 'no'
            {
             before(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGramatica.g:2325:1: rule__Operacion__DescripcionAssignment : ( ( rule__Operacion__DescripcionAlternatives_0 ) ) ;
    public final void rule__Operacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2329:1: ( ( ( rule__Operacion__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:2330:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:2330:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:2331:3: ( rule__Operacion__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:2332:3: ( rule__Operacion__DescripcionAlternatives_0 )
            // InternalGramatica.g:2332:4: rule__Operacion__DescripcionAlternatives_0
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
    // InternalGramatica.g:2340:1: rule__Clase__NameAssignment : ( RULE_ID ) ;
    public final void rule__Clase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2344:1: ( ( RULE_ID ) )
            // InternalGramatica.g:2345:2: ( RULE_ID )
            {
            // InternalGramatica.g:2345:2: ( RULE_ID )
            // InternalGramatica.g:2346:3: RULE_ID
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


    // $ANTLR start "rule__Compuesta__SimpleInicialAssignment_1"
    // InternalGramatica.g:2355:1: rule__Compuesta__SimpleInicialAssignment_1 : ( ruleSimple ) ;
    public final void rule__Compuesta__SimpleInicialAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2359:1: ( ( ruleSimple ) )
            // InternalGramatica.g:2360:2: ( ruleSimple )
            {
            // InternalGramatica.g:2360:2: ( ruleSimple )
            // InternalGramatica.g:2361:3: ruleSimple
            {
             before(grammarAccess.getCompuestaAccess().getSimpleInicialSimpleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getSimpleInicialSimpleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Compuesta__SimpleInicialAssignment_1"


    // $ANTLR start "rule__Compuesta__NexoAssignment_2_0"
    // InternalGramatica.g:2370:1: rule__Compuesta__NexoAssignment_2_0 : ( ruleNexo ) ;
    public final void rule__Compuesta__NexoAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2374:1: ( ( ruleNexo ) )
            // InternalGramatica.g:2375:2: ( ruleNexo )
            {
            // InternalGramatica.g:2375:2: ( ruleNexo )
            // InternalGramatica.g:2376:3: ruleNexo
            {
             before(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNexo();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getNexoNexoParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Compuesta__NexoAssignment_2_0"


    // $ANTLR start "rule__Compuesta__SimpleFinalAssignment_2_1"
    // InternalGramatica.g:2385:1: rule__Compuesta__SimpleFinalAssignment_2_1 : ( ruleSimple ) ;
    public final void rule__Compuesta__SimpleFinalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2389:1: ( ( ruleSimple ) )
            // InternalGramatica.g:2390:2: ( ruleSimple )
            {
            // InternalGramatica.g:2390:2: ( ruleSimple )
            // InternalGramatica.g:2391:3: ruleSimple
            {
             before(grammarAccess.getCompuestaAccess().getSimpleFinalSimpleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestaAccess().getSimpleFinalSimpleParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Compuesta__SimpleFinalAssignment_2_1"


    // $ANTLR start "rule__Nexo__DescripcionAssignment"
    // InternalGramatica.g:2400:1: rule__Nexo__DescripcionAssignment : ( ( rule__Nexo__DescripcionAlternatives_0 ) ) ;
    public final void rule__Nexo__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2404:1: ( ( ( rule__Nexo__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:2405:2: ( ( rule__Nexo__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:2405:2: ( ( rule__Nexo__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:2406:3: ( rule__Nexo__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getNexoAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:2407:3: ( rule__Nexo__DescripcionAlternatives_0 )
            // InternalGramatica.g:2407:4: rule__Nexo__DescripcionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__DescripcionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getDescripcionAlternatives_0()); 

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
    // $ANTLR end "rule__Nexo__DescripcionAssignment"


    // $ANTLR start "rule__Compleja__DeterminanteAssignment_0"
    // InternalGramatica.g:2415:1: rule__Compleja__DeterminanteAssignment_0 : ( ruleDeterminante ) ;
    public final void rule__Compleja__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2419:1: ( ( ruleDeterminante ) )
            // InternalGramatica.g:2420:2: ( ruleDeterminante )
            {
            // InternalGramatica.g:2420:2: ( ruleDeterminante )
            // InternalGramatica.g:2421:3: ruleDeterminante
            {
             before(grammarAccess.getComplejaAccess().getDeterminanteDeterminanteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeterminante();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getDeterminanteDeterminanteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Compleja__DeterminanteAssignment_0"


    // $ANTLR start "rule__Compleja__AtrAssignment_1"
    // InternalGramatica.g:2430:1: rule__Compleja__AtrAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Compleja__AtrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2434:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2435:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2435:2: ( ruleAtributo )
            // InternalGramatica.g:2436:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtrAtributoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtrAtributoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Compleja__AtrAssignment_1"


    // $ANTLR start "rule__Compleja__SintagmaAssignment_2"
    // InternalGramatica.g:2445:1: rule__Compleja__SintagmaAssignment_2 : ( ruleSintagmaPreposicional ) ;
    public final void rule__Compleja__SintagmaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2449:1: ( ( ruleSintagmaPreposicional ) )
            // InternalGramatica.g:2450:2: ( ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:2450:2: ( ruleSintagmaPreposicional )
            // InternalGramatica.g:2451:3: ruleSintagmaPreposicional
            {
             before(grammarAccess.getComplejaAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSintagmaPreposicional();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getSintagmaSintagmaPreposicionalParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Compleja__SintagmaAssignment_2"


    // $ANTLR start "rule__Compleja__ContextoAssignment_3"
    // InternalGramatica.g:2460:1: rule__Compleja__ContextoAssignment_3 : ( ruleClase ) ;
    public final void rule__Compleja__ContextoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2464:1: ( ( ruleClase ) )
            // InternalGramatica.g:2465:2: ( ruleClase )
            {
            // InternalGramatica.g:2465:2: ( ruleClase )
            // InternalGramatica.g:2466:3: ruleClase
            {
             before(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getContextoClaseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Compleja__ContextoAssignment_3"


    // $ANTLR start "rule__Compleja__ConectAssignment_4"
    // InternalGramatica.g:2475:1: rule__Compleja__ConectAssignment_4 : ( ruleConector ) ;
    public final void rule__Compleja__ConectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2479:1: ( ( ruleConector ) )
            // InternalGramatica.g:2480:2: ( ruleConector )
            {
            // InternalGramatica.g:2480:2: ( ruleConector )
            // InternalGramatica.g:2481:3: ruleConector
            {
             before(grammarAccess.getComplejaAccess().getConectConectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConector();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getConectConectorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Compleja__ConectAssignment_4"


    // $ANTLR start "rule__Compleja__OperacionColeccionAssignment_5_0"
    // InternalGramatica.g:2490:1: rule__Compleja__OperacionColeccionAssignment_5_0 : ( ruleOperacionColeccion ) ;
    public final void rule__Compleja__OperacionColeccionAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2494:1: ( ( ruleOperacionColeccion ) )
            // InternalGramatica.g:2495:2: ( ruleOperacionColeccion )
            {
            // InternalGramatica.g:2495:2: ( ruleOperacionColeccion )
            // InternalGramatica.g:2496:3: ruleOperacionColeccion
            {
             before(grammarAccess.getComplejaAccess().getOperacionColeccionOperacionColeccionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacionColeccion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getOperacionColeccionOperacionColeccionParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Compleja__OperacionColeccionAssignment_5_0"


    // $ANTLR start "rule__Compleja__Determinante1Assignment_5_1"
    // InternalGramatica.g:2505:1: rule__Compleja__Determinante1Assignment_5_1 : ( ruleDeterminante ) ;
    public final void rule__Compleja__Determinante1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2509:1: ( ( ruleDeterminante ) )
            // InternalGramatica.g:2510:2: ( ruleDeterminante )
            {
            // InternalGramatica.g:2510:2: ( ruleDeterminante )
            // InternalGramatica.g:2511:3: ruleDeterminante
            {
             before(grammarAccess.getComplejaAccess().getDeterminante1DeterminanteParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeterminante();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getDeterminante1DeterminanteParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Compleja__Determinante1Assignment_5_1"


    // $ANTLR start "rule__Compleja__ClaseAssignment_5_2"
    // InternalGramatica.g:2520:1: rule__Compleja__ClaseAssignment_5_2 : ( ruleClase ) ;
    public final void rule__Compleja__ClaseAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2524:1: ( ( ruleClase ) )
            // InternalGramatica.g:2525:2: ( ruleClase )
            {
            // InternalGramatica.g:2525:2: ( ruleClase )
            // InternalGramatica.g:2526:3: ruleClase
            {
             before(grammarAccess.getComplejaAccess().getClaseClaseParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getClaseClaseParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Compleja__ClaseAssignment_5_2"


    // $ANTLR start "rule__Compleja__Conect1Assignment_5_3"
    // InternalGramatica.g:2535:1: rule__Compleja__Conect1Assignment_5_3 : ( ruleConector ) ;
    public final void rule__Compleja__Conect1Assignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2539:1: ( ( ruleConector ) )
            // InternalGramatica.g:2540:2: ( ruleConector )
            {
            // InternalGramatica.g:2540:2: ( ruleConector )
            // InternalGramatica.g:2541:3: ruleConector
            {
             before(grammarAccess.getComplejaAccess().getConect1ConectorParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConector();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getConect1ConectorParserRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__Compleja__Conect1Assignment_5_3"


    // $ANTLR start "rule__Compleja__Atr1Assignment_5_4_0"
    // InternalGramatica.g:2550:1: rule__Compleja__Atr1Assignment_5_4_0 : ( ruleAtributo ) ;
    public final void rule__Compleja__Atr1Assignment_5_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2554:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2555:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2555:2: ( ruleAtributo )
            // InternalGramatica.g:2556:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtr1AtributoParserRuleCall_5_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtr1AtributoParserRuleCall_5_4_0_0()); 

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
    // $ANTLR end "rule__Compleja__Atr1Assignment_5_4_0"


    // $ANTLR start "rule__Compleja__Ope3Assignment_5_4_1"
    // InternalGramatica.g:2565:1: rule__Compleja__Ope3Assignment_5_4_1 : ( ruleOperacion ) ;
    public final void rule__Compleja__Ope3Assignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2569:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:2570:2: ( ruleOperacion )
            {
            // InternalGramatica.g:2570:2: ( ruleOperacion )
            // InternalGramatica.g:2571:3: ruleOperacion
            {
             before(grammarAccess.getComplejaAccess().getOpe3OperacionParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getOpe3OperacionParserRuleCall_5_4_1_0()); 

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
    // $ANTLR end "rule__Compleja__Ope3Assignment_5_4_1"


    // $ANTLR start "rule__Compleja__Lit1Assignment_5_4_2_0"
    // InternalGramatica.g:2580:1: rule__Compleja__Lit1Assignment_5_4_2_0 : ( ruleLiteral ) ;
    public final void rule__Compleja__Lit1Assignment_5_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2584:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:2585:2: ( ruleLiteral )
            {
            // InternalGramatica.g:2585:2: ( ruleLiteral )
            // InternalGramatica.g:2586:3: ruleLiteral
            {
             before(grammarAccess.getComplejaAccess().getLit1LiteralParserRuleCall_5_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getLit1LiteralParserRuleCall_5_4_2_0_0()); 

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
    // $ANTLR end "rule__Compleja__Lit1Assignment_5_4_2_0"


    // $ANTLR start "rule__Compleja__Atr2Assignment_5_4_2_1"
    // InternalGramatica.g:2595:1: rule__Compleja__Atr2Assignment_5_4_2_1 : ( ruleAtributo ) ;
    public final void rule__Compleja__Atr2Assignment_5_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2599:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2600:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2600:2: ( ruleAtributo )
            // InternalGramatica.g:2601:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtr2AtributoParserRuleCall_5_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtr2AtributoParserRuleCall_5_4_2_1_0()); 

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
    // $ANTLR end "rule__Compleja__Atr2Assignment_5_4_2_1"


    // $ANTLR start "rule__Compleja__Ope4Assignment_5_4_3"
    // InternalGramatica.g:2610:1: rule__Compleja__Ope4Assignment_5_4_3 : ( ruleOperacion ) ;
    public final void rule__Compleja__Ope4Assignment_5_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2614:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:2615:2: ( ruleOperacion )
            {
            // InternalGramatica.g:2615:2: ( ruleOperacion )
            // InternalGramatica.g:2616:3: ruleOperacion
            {
             before(grammarAccess.getComplejaAccess().getOpe4OperacionParserRuleCall_5_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getOpe4OperacionParserRuleCall_5_4_3_0()); 

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
    // $ANTLR end "rule__Compleja__Ope4Assignment_5_4_3"


    // $ANTLR start "rule__Compleja__Atr4Assignment_5_4_4_0"
    // InternalGramatica.g:2625:1: rule__Compleja__Atr4Assignment_5_4_4_0 : ( ruleAtributo ) ;
    public final void rule__Compleja__Atr4Assignment_5_4_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2629:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2630:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2630:2: ( ruleAtributo )
            // InternalGramatica.g:2631:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtr4AtributoParserRuleCall_5_4_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtr4AtributoParserRuleCall_5_4_4_0_0()); 

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
    // $ANTLR end "rule__Compleja__Atr4Assignment_5_4_4_0"


    // $ANTLR start "rule__Compleja__Ope5Assignment_5_4_4_1"
    // InternalGramatica.g:2640:1: rule__Compleja__Ope5Assignment_5_4_4_1 : ( ruleOperacion ) ;
    public final void rule__Compleja__Ope5Assignment_5_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2644:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:2645:2: ( ruleOperacion )
            {
            // InternalGramatica.g:2645:2: ( ruleOperacion )
            // InternalGramatica.g:2646:3: ruleOperacion
            {
             before(grammarAccess.getComplejaAccess().getOpe5OperacionParserRuleCall_5_4_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getOpe5OperacionParserRuleCall_5_4_4_1_0()); 

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
    // $ANTLR end "rule__Compleja__Ope5Assignment_5_4_4_1"


    // $ANTLR start "rule__Compleja__Lit2Assignment_5_4_4_2_0"
    // InternalGramatica.g:2655:1: rule__Compleja__Lit2Assignment_5_4_4_2_0 : ( ruleLiteral ) ;
    public final void rule__Compleja__Lit2Assignment_5_4_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2659:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:2660:2: ( ruleLiteral )
            {
            // InternalGramatica.g:2660:2: ( ruleLiteral )
            // InternalGramatica.g:2661:3: ruleLiteral
            {
             before(grammarAccess.getComplejaAccess().getLit2LiteralParserRuleCall_5_4_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getLit2LiteralParserRuleCall_5_4_4_2_0_0()); 

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
    // $ANTLR end "rule__Compleja__Lit2Assignment_5_4_4_2_0"


    // $ANTLR start "rule__Compleja__Atr5Assignment_5_4_4_2_1"
    // InternalGramatica.g:2670:1: rule__Compleja__Atr5Assignment_5_4_4_2_1 : ( ruleAtributo ) ;
    public final void rule__Compleja__Atr5Assignment_5_4_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2674:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2675:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2675:2: ( ruleAtributo )
            // InternalGramatica.g:2676:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtr5AtributoParserRuleCall_5_4_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtr5AtributoParserRuleCall_5_4_4_2_1_0()); 

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
    // $ANTLR end "rule__Compleja__Atr5Assignment_5_4_4_2_1"


    // $ANTLR start "rule__Compleja__Conec1Assignment_5_5"
    // InternalGramatica.g:2685:1: rule__Compleja__Conec1Assignment_5_5 : ( ruleConector ) ;
    public final void rule__Compleja__Conec1Assignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2689:1: ( ( ruleConector ) )
            // InternalGramatica.g:2690:2: ( ruleConector )
            {
            // InternalGramatica.g:2690:2: ( ruleConector )
            // InternalGramatica.g:2691:3: ruleConector
            {
             before(grammarAccess.getComplejaAccess().getConec1ConectorParserRuleCall_5_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConector();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getConec1ConectorParserRuleCall_5_5_0()); 

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
    // $ANTLR end "rule__Compleja__Conec1Assignment_5_5"


    // $ANTLR start "rule__Compleja__OpeColAssignment_6"
    // InternalGramatica.g:2700:1: rule__Compleja__OpeColAssignment_6 : ( ruleOperacionColeccion ) ;
    public final void rule__Compleja__OpeColAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2704:1: ( ( ruleOperacionColeccion ) )
            // InternalGramatica.g:2705:2: ( ruleOperacionColeccion )
            {
            // InternalGramatica.g:2705:2: ( ruleOperacionColeccion )
            // InternalGramatica.g:2706:3: ruleOperacionColeccion
            {
             before(grammarAccess.getComplejaAccess().getOpeColOperacionColeccionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacionColeccion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getOpeColOperacionColeccionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Compleja__OpeColAssignment_6"


    // $ANTLR start "rule__Compleja__Ope6Assignment_7_0"
    // InternalGramatica.g:2715:1: rule__Compleja__Ope6Assignment_7_0 : ( ruleOperacion ) ;
    public final void rule__Compleja__Ope6Assignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2719:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:2720:2: ( ruleOperacion )
            {
            // InternalGramatica.g:2720:2: ( ruleOperacion )
            // InternalGramatica.g:2721:3: ruleOperacion
            {
             before(grammarAccess.getComplejaAccess().getOpe6OperacionParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getOpe6OperacionParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Compleja__Ope6Assignment_7_0"


    // $ANTLR start "rule__Compleja__Lit3Assignment_7_1_0"
    // InternalGramatica.g:2730:1: rule__Compleja__Lit3Assignment_7_1_0 : ( ruleLiteral ) ;
    public final void rule__Compleja__Lit3Assignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2734:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:2735:2: ( ruleLiteral )
            {
            // InternalGramatica.g:2735:2: ( ruleLiteral )
            // InternalGramatica.g:2736:3: ruleLiteral
            {
             before(grammarAccess.getComplejaAccess().getLit3LiteralParserRuleCall_7_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getLit3LiteralParserRuleCall_7_1_0_0()); 

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
    // $ANTLR end "rule__Compleja__Lit3Assignment_7_1_0"


    // $ANTLR start "rule__Compleja__Atr3Assignment_7_1_1"
    // InternalGramatica.g:2745:1: rule__Compleja__Atr3Assignment_7_1_1 : ( ruleAtributo ) ;
    public final void rule__Compleja__Atr3Assignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2749:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:2750:2: ( ruleAtributo )
            {
            // InternalGramatica.g:2750:2: ( ruleAtributo )
            // InternalGramatica.g:2751:3: ruleAtributo
            {
             before(grammarAccess.getComplejaAccess().getAtr3AtributoParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getAtr3AtributoParserRuleCall_7_1_1_0()); 

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
    // $ANTLR end "rule__Compleja__Atr3Assignment_7_1_1"


    // $ANTLR start "rule__Compleja__FinOracionAssignment_8"
    // InternalGramatica.g:2760:1: rule__Compleja__FinOracionAssignment_8 : ( ruleFinOracion ) ;
    public final void rule__Compleja__FinOracionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2764:1: ( ( ruleFinOracion ) )
            // InternalGramatica.g:2765:2: ( ruleFinOracion )
            {
            // InternalGramatica.g:2765:2: ( ruleFinOracion )
            // InternalGramatica.g:2766:3: ruleFinOracion
            {
             before(grammarAccess.getComplejaAccess().getFinOracionFinOracionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFinOracion();

            state._fsp--;

             after(grammarAccess.getComplejaAccess().getFinOracionFinOracionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Compleja__FinOracionAssignment_8"


    // $ANTLR start "rule__Conector__DescripcionAssignment"
    // InternalGramatica.g:2775:1: rule__Conector__DescripcionAssignment : ( ( rule__Conector__DescripcionAlternatives_0 ) ) ;
    public final void rule__Conector__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2779:1: ( ( ( rule__Conector__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:2780:2: ( ( rule__Conector__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:2780:2: ( ( rule__Conector__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:2781:3: ( rule__Conector__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getConectorAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:2782:3: ( rule__Conector__DescripcionAlternatives_0 )
            // InternalGramatica.g:2782:4: rule__Conector__DescripcionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Conector__DescripcionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConectorAccess().getDescripcionAlternatives_0()); 

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
    // $ANTLR end "rule__Conector__DescripcionAssignment"


    // $ANTLR start "rule__OperacionColeccion__DescripcionAssignment"
    // InternalGramatica.g:2790:1: rule__OperacionColeccion__DescripcionAssignment : ( ( rule__OperacionColeccion__DescripcionAlternatives_0 ) ) ;
    public final void rule__OperacionColeccion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:2794:1: ( ( ( rule__OperacionColeccion__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:2795:2: ( ( rule__OperacionColeccion__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:2795:2: ( ( rule__OperacionColeccion__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:2796:3: ( rule__OperacionColeccion__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getOperacionColeccionAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:2797:3: ( rule__OperacionColeccion__DescripcionAlternatives_0 )
            // InternalGramatica.g:2797:4: rule__OperacionColeccion__DescripcionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OperacionColeccion__DescripcionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionColeccionAccess().getDescripcionAlternatives_0()); 

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
    // $ANTLR end "rule__OperacionColeccion__DescripcionAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\3\6\1\uffff\1\44\1\6\1\17\2\uffff";
    static final String dfa_3s = "\1\43\3\6\1\uffff\1\44\1\6\1\45\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\3\uffff\1\1\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\24\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\2\10\12\uffff\2\11\10\uffff\1\10",
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
            return "502:1: rule__Oracion__Alternatives : ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) | ( ( rule__Oracion__ContenidoAssignment_1 ) ) | ( ( rule__Oracion__ContenidoAssignment_2 ) ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\6\10\4\1\uffff\1\13\1\uffff";
    static final String dfa_9s = "\11\42\1\uffff\1\30\1\uffff";
    static final String dfa_10s = "\11\uffff\1\2\1\uffff\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\4\uffff\1\11\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\10\11",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "\2\11\1\12\4\uffff\1\13\5\uffff\10\13\2\uffff\10\13",
            "",
            "\1\11\5\uffff\10\13",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1817:2: ( rule__Compleja__Ope4Assignment_5_4_3 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800007002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FE0070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007E1FE0800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001FE0040L});

}