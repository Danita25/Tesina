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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'El/La'", "'Los/Las'", "'debe ser'", "'debe estar'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'al menos'", "'.'", "'Coleccion de'", "'pathModelo:'", "'pathOcl:'", "'de un/una'", "'no'"
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
    // InternalGramatica.g:87:1: ruleOracion : ( ruleSimple ) ;
    public final void ruleOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:91:2: ( ( ruleSimple ) )
            // InternalGramatica.g:92:2: ( ruleSimple )
            {
            // InternalGramatica.g:92:2: ( ruleSimple )
            // InternalGramatica.g:93:3: ruleSimple
            {
             before(grammarAccess.getOracionAccess().getSimpleParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getOracionAccess().getSimpleParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "rule__Simple__Alternatives_6"
    // InternalGramatica.g:352:1: rule__Simple__Alternatives_6 : ( ( ( rule__Simple__LiteralAssignment_6_0 ) ) | ( ( rule__Simple__AtributoAssignment_6_1 ) ) );
    public final void rule__Simple__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:356:1: ( ( ( rule__Simple__LiteralAssignment_6_0 ) ) | ( ( rule__Simple__AtributoAssignment_6_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGramatica.g:357:2: ( ( rule__Simple__LiteralAssignment_6_0 ) )
                    {
                    // InternalGramatica.g:357:2: ( ( rule__Simple__LiteralAssignment_6_0 ) )
                    // InternalGramatica.g:358:3: ( rule__Simple__LiteralAssignment_6_0 )
                    {
                     before(grammarAccess.getSimpleAccess().getLiteralAssignment_6_0()); 
                    // InternalGramatica.g:359:3: ( rule__Simple__LiteralAssignment_6_0 )
                    // InternalGramatica.g:359:4: rule__Simple__LiteralAssignment_6_0
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
                    // InternalGramatica.g:363:2: ( ( rule__Simple__AtributoAssignment_6_1 ) )
                    {
                    // InternalGramatica.g:363:2: ( ( rule__Simple__AtributoAssignment_6_1 ) )
                    // InternalGramatica.g:364:3: ( rule__Simple__AtributoAssignment_6_1 )
                    {
                     before(grammarAccess.getSimpleAccess().getAtributoAssignment_6_1()); 
                    // InternalGramatica.g:365:3: ( rule__Simple__AtributoAssignment_6_1 )
                    // InternalGramatica.g:365:4: rule__Simple__AtributoAssignment_6_1
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
    // InternalGramatica.g:373:1: rule__Determinante__DescripcionAlternatives_0 : ( ( 'El/La' ) | ( 'Los/Las' ) );
    public final void rule__Determinante__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:377:1: ( ( 'El/La' ) | ( 'Los/Las' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:378:2: ( 'El/La' )
                    {
                    // InternalGramatica.g:378:2: ( 'El/La' )
                    // InternalGramatica.g:379:3: 'El/La'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDeterminanteAccess().getDescripcionElLaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:384:2: ( 'Los/Las' )
                    {
                    // InternalGramatica.g:384:2: ( 'Los/Las' )
                    // InternalGramatica.g:385:3: 'Los/Las'
                    {
                     before(grammarAccess.getDeterminanteAccess().getDescripcionLosLasKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalGramatica.g:394:1: rule__ObligacionDeber__DescripcionAlternatives_0 : ( ( 'debe ser' ) | ( 'debe estar' ) );
    public final void rule__ObligacionDeber__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:398:1: ( ( 'debe ser' ) | ( 'debe estar' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:399:2: ( 'debe ser' )
                    {
                    // InternalGramatica.g:399:2: ( 'debe ser' )
                    // InternalGramatica.g:400:3: 'debe ser'
                    {
                     before(grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getObligacionDeberAccess().getDescripcionDebeSerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:405:2: ( 'debe estar' )
                    {
                    // InternalGramatica.g:405:2: ( 'debe estar' )
                    // InternalGramatica.g:406:3: 'debe estar'
                    {
                     before(grammarAccess.getObligacionDeberAccess().getDescripcionDebeEstarKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalGramatica.g:415:1: rule__Operacion__DescripcionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) );
    public final void rule__Operacion__DescripcionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:419:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) | ( 'al menos' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:420:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:420:2: ( 'mayor que' )
                    // InternalGramatica.g:421:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:426:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:426:2: ( 'menor que' )
                    // InternalGramatica.g:427:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:432:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:432:2: ( 'igual a' )
                    // InternalGramatica.g:433:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:438:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:438:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:439:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:444:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:444:2: ( 'menor o igual a' )
                    // InternalGramatica.g:445:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:450:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:450:2: ( 'distinto de' )
                    // InternalGramatica.g:451:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getDescripcionDistintoDeKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramatica.g:456:2: ( 'al menos' )
                    {
                    // InternalGramatica.g:456:2: ( 'al menos' )
                    // InternalGramatica.g:457:3: 'al menos'
                    {
                     before(grammarAccess.getOperacionAccess().getDescripcionAlMenosKeyword_0_6()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalGramatica.g:466:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:470:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:471:2: ( RULE_INT )
                    {
                    // InternalGramatica.g:471:2: ( RULE_INT )
                    // InternalGramatica.g:472:3: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:477:2: ( RULE_STRING )
                    {
                    // InternalGramatica.g:477:2: ( RULE_STRING )
                    // InternalGramatica.g:478:3: RULE_STRING
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


    // $ANTLR start "rule__Documento__Group__0"
    // InternalGramatica.g:487:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:491:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalGramatica.g:492:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
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
    // InternalGramatica.g:499:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__PathModeloAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:503:1: ( ( ( rule__Documento__PathModeloAssignment_0 ) ) )
            // InternalGramatica.g:504:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            {
            // InternalGramatica.g:504:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            // InternalGramatica.g:505:2: ( rule__Documento__PathModeloAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); 
            // InternalGramatica.g:506:2: ( rule__Documento__PathModeloAssignment_0 )
            // InternalGramatica.g:506:3: rule__Documento__PathModeloAssignment_0
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
    // InternalGramatica.g:514:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:518:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalGramatica.g:519:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
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
    // InternalGramatica.g:526:1: rule__Documento__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:530:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:531:1: ( RULE_STRING )
            {
            // InternalGramatica.g:531:1: ( RULE_STRING )
            // InternalGramatica.g:532:2: RULE_STRING
            {
             before(grammarAccess.getDocumentoAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalGramatica.g:541:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl rule__Documento__Group__3 ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:545:1: ( rule__Documento__Group__2__Impl rule__Documento__Group__3 )
            // InternalGramatica.g:546:2: rule__Documento__Group__2__Impl rule__Documento__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Documento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documento__Group__3();

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
    // InternalGramatica.g:553:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__PathOclAssignment_2 ) ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:557:1: ( ( ( rule__Documento__PathOclAssignment_2 ) ) )
            // InternalGramatica.g:558:1: ( ( rule__Documento__PathOclAssignment_2 ) )
            {
            // InternalGramatica.g:558:1: ( ( rule__Documento__PathOclAssignment_2 ) )
            // InternalGramatica.g:559:2: ( rule__Documento__PathOclAssignment_2 )
            {
             before(grammarAccess.getDocumentoAccess().getPathOclAssignment_2()); 
            // InternalGramatica.g:560:2: ( rule__Documento__PathOclAssignment_2 )
            // InternalGramatica.g:560:3: rule__Documento__PathOclAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Documento__PathOclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentoAccess().getPathOclAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Documento__Group__3"
    // InternalGramatica.g:568:1: rule__Documento__Group__3 : rule__Documento__Group__3__Impl rule__Documento__Group__4 ;
    public final void rule__Documento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:572:1: ( rule__Documento__Group__3__Impl rule__Documento__Group__4 )
            // InternalGramatica.g:573:2: rule__Documento__Group__3__Impl rule__Documento__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Documento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documento__Group__4();

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
    // $ANTLR end "rule__Documento__Group__3"


    // $ANTLR start "rule__Documento__Group__3__Impl"
    // InternalGramatica.g:580:1: rule__Documento__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Documento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:584:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:585:1: ( RULE_STRING )
            {
            // InternalGramatica.g:585:1: ( RULE_STRING )
            // InternalGramatica.g:586:2: RULE_STRING
            {
             before(grammarAccess.getDocumentoAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documento__Group__3__Impl"


    // $ANTLR start "rule__Documento__Group__4"
    // InternalGramatica.g:595:1: rule__Documento__Group__4 : rule__Documento__Group__4__Impl ;
    public final void rule__Documento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:599:1: ( rule__Documento__Group__4__Impl )
            // InternalGramatica.g:600:2: rule__Documento__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documento__Group__4__Impl();

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
    // $ANTLR end "rule__Documento__Group__4"


    // $ANTLR start "rule__Documento__Group__4__Impl"
    // InternalGramatica.g:606:1: rule__Documento__Group__4__Impl : ( ( rule__Documento__OracionesAssignment_4 )* ) ;
    public final void rule__Documento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:610:1: ( ( ( rule__Documento__OracionesAssignment_4 )* ) )
            // InternalGramatica.g:611:1: ( ( rule__Documento__OracionesAssignment_4 )* )
            {
            // InternalGramatica.g:611:1: ( ( rule__Documento__OracionesAssignment_4 )* )
            // InternalGramatica.g:612:2: ( rule__Documento__OracionesAssignment_4 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_4()); 
            // InternalGramatica.g:613:2: ( rule__Documento__OracionesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGramatica.g:613:3: rule__Documento__OracionesAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Documento__OracionesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDocumentoAccess().getOracionesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documento__Group__4__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalGramatica.g:622:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:626:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:627:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
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
    // InternalGramatica.g:634:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__DeterminanteAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:638:1: ( ( ( rule__Simple__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:639:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:639:1: ( ( rule__Simple__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:640:2: ( rule__Simple__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:641:2: ( rule__Simple__DeterminanteAssignment_0 )
            // InternalGramatica.g:641:3: rule__Simple__DeterminanteAssignment_0
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
    // InternalGramatica.g:649:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:653:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:654:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
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
    // InternalGramatica.g:661:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AtributoAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:665:1: ( ( ( rule__Simple__AtributoAssignment_1 ) ) )
            // InternalGramatica.g:666:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            {
            // InternalGramatica.g:666:1: ( ( rule__Simple__AtributoAssignment_1 ) )
            // InternalGramatica.g:667:2: ( rule__Simple__AtributoAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAtributoAssignment_1()); 
            // InternalGramatica.g:668:2: ( rule__Simple__AtributoAssignment_1 )
            // InternalGramatica.g:668:3: rule__Simple__AtributoAssignment_1
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
    // InternalGramatica.g:676:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:680:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalGramatica.g:681:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
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
    // InternalGramatica.g:688:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__SintagmaAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:692:1: ( ( ( rule__Simple__SintagmaAssignment_2 ) ) )
            // InternalGramatica.g:693:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            {
            // InternalGramatica.g:693:1: ( ( rule__Simple__SintagmaAssignment_2 ) )
            // InternalGramatica.g:694:2: ( rule__Simple__SintagmaAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getSintagmaAssignment_2()); 
            // InternalGramatica.g:695:2: ( rule__Simple__SintagmaAssignment_2 )
            // InternalGramatica.g:695:3: rule__Simple__SintagmaAssignment_2
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
    // InternalGramatica.g:703:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:707:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalGramatica.g:708:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
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
    // InternalGramatica.g:715:1: rule__Simple__Group__3__Impl : ( ( rule__Simple__ContextoAssignment_3 ) ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:719:1: ( ( ( rule__Simple__ContextoAssignment_3 ) ) )
            // InternalGramatica.g:720:1: ( ( rule__Simple__ContextoAssignment_3 ) )
            {
            // InternalGramatica.g:720:1: ( ( rule__Simple__ContextoAssignment_3 ) )
            // InternalGramatica.g:721:2: ( rule__Simple__ContextoAssignment_3 )
            {
             before(grammarAccess.getSimpleAccess().getContextoAssignment_3()); 
            // InternalGramatica.g:722:2: ( rule__Simple__ContextoAssignment_3 )
            // InternalGramatica.g:722:3: rule__Simple__ContextoAssignment_3
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
    // InternalGramatica.g:730:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:734:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalGramatica.g:735:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalGramatica.g:742:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__ObligacionAssignment_4 ) ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:746:1: ( ( ( rule__Simple__ObligacionAssignment_4 ) ) )
            // InternalGramatica.g:747:1: ( ( rule__Simple__ObligacionAssignment_4 ) )
            {
            // InternalGramatica.g:747:1: ( ( rule__Simple__ObligacionAssignment_4 ) )
            // InternalGramatica.g:748:2: ( rule__Simple__ObligacionAssignment_4 )
            {
             before(grammarAccess.getSimpleAccess().getObligacionAssignment_4()); 
            // InternalGramatica.g:749:2: ( rule__Simple__ObligacionAssignment_4 )
            // InternalGramatica.g:749:3: rule__Simple__ObligacionAssignment_4
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
    // InternalGramatica.g:757:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl rule__Simple__Group__6 ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:761:1: ( rule__Simple__Group__5__Impl rule__Simple__Group__6 )
            // InternalGramatica.g:762:2: rule__Simple__Group__5__Impl rule__Simple__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalGramatica.g:769:1: rule__Simple__Group__5__Impl : ( ( rule__Simple__OperacionAssignment_5 )? ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:773:1: ( ( ( rule__Simple__OperacionAssignment_5 )? ) )
            // InternalGramatica.g:774:1: ( ( rule__Simple__OperacionAssignment_5 )? )
            {
            // InternalGramatica.g:774:1: ( ( rule__Simple__OperacionAssignment_5 )? )
            // InternalGramatica.g:775:2: ( rule__Simple__OperacionAssignment_5 )?
            {
             before(grammarAccess.getSimpleAccess().getOperacionAssignment_5()); 
            // InternalGramatica.g:776:2: ( rule__Simple__OperacionAssignment_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=15 && LA7_0<=21)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:776:3: rule__Simple__OperacionAssignment_5
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
    // InternalGramatica.g:784:1: rule__Simple__Group__6 : rule__Simple__Group__6__Impl rule__Simple__Group__7 ;
    public final void rule__Simple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:788:1: ( rule__Simple__Group__6__Impl rule__Simple__Group__7 )
            // InternalGramatica.g:789:2: rule__Simple__Group__6__Impl rule__Simple__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalGramatica.g:796:1: rule__Simple__Group__6__Impl : ( ( rule__Simple__Alternatives_6 ) ) ;
    public final void rule__Simple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:800:1: ( ( ( rule__Simple__Alternatives_6 ) ) )
            // InternalGramatica.g:801:1: ( ( rule__Simple__Alternatives_6 ) )
            {
            // InternalGramatica.g:801:1: ( ( rule__Simple__Alternatives_6 ) )
            // InternalGramatica.g:802:2: ( rule__Simple__Alternatives_6 )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives_6()); 
            // InternalGramatica.g:803:2: ( rule__Simple__Alternatives_6 )
            // InternalGramatica.g:803:3: rule__Simple__Alternatives_6
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
    // InternalGramatica.g:811:1: rule__Simple__Group__7 : rule__Simple__Group__7__Impl ;
    public final void rule__Simple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:815:1: ( rule__Simple__Group__7__Impl )
            // InternalGramatica.g:816:2: rule__Simple__Group__7__Impl
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
    // InternalGramatica.g:822:1: rule__Simple__Group__7__Impl : ( '.' ) ;
    public final void rule__Simple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:826:1: ( ( '.' ) )
            // InternalGramatica.g:827:1: ( '.' )
            {
            // InternalGramatica.g:827:1: ( '.' )
            // InternalGramatica.g:828:2: '.'
            {
             before(grammarAccess.getSimpleAccess().getFullStopKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getFullStopKeyword_7()); 

            }


            }

        }
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
    // InternalGramatica.g:838:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:842:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalGramatica.g:843:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGramatica.g:850:1: rule__Atributo__Group__0__Impl : ( ( 'Coleccion de' )? ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:854:1: ( ( ( 'Coleccion de' )? ) )
            // InternalGramatica.g:855:1: ( ( 'Coleccion de' )? )
            {
            // InternalGramatica.g:855:1: ( ( 'Coleccion de' )? )
            // InternalGramatica.g:856:2: ( 'Coleccion de' )?
            {
             before(grammarAccess.getAtributoAccess().getColeccionDeKeyword_0()); 
            // InternalGramatica.g:857:2: ( 'Coleccion de' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:857:3: 'Coleccion de'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalGramatica.g:865:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:869:1: ( rule__Atributo__Group__1__Impl )
            // InternalGramatica.g:870:2: rule__Atributo__Group__1__Impl
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
    // InternalGramatica.g:876:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:880:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalGramatica.g:881:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalGramatica.g:881:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalGramatica.g:882:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalGramatica.g:883:2: ( rule__Atributo__NameAssignment_1 )
            // InternalGramatica.g:883:3: rule__Atributo__NameAssignment_1
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
    // InternalGramatica.g:892:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:896:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalGramatica.g:897:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGramatica.g:904:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:908:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalGramatica.g:909:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalGramatica.g:909:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalGramatica.g:910:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalGramatica.g:911:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:911:3: rule__Obligacion__NegacionAssignment_0
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
    // InternalGramatica.g:919:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:923:1: ( rule__Obligacion__Group__1__Impl )
            // InternalGramatica.g:924:2: rule__Obligacion__Group__1__Impl
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
    // InternalGramatica.g:930:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:934:1: ( ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) ) )
            // InternalGramatica.g:935:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            {
            // InternalGramatica.g:935:1: ( ( rule__Obligacion__ObligacionDeberAssignment_1 ) )
            // InternalGramatica.g:936:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDeberAssignment_1()); 
            // InternalGramatica.g:937:2: ( rule__Obligacion__ObligacionDeberAssignment_1 )
            // InternalGramatica.g:937:3: rule__Obligacion__ObligacionDeberAssignment_1
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
    // InternalGramatica.g:946:1: rule__Documento__PathModeloAssignment_0 : ( ( 'pathModelo:' ) ) ;
    public final void rule__Documento__PathModeloAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:950:1: ( ( ( 'pathModelo:' ) ) )
            // InternalGramatica.g:951:2: ( ( 'pathModelo:' ) )
            {
            // InternalGramatica.g:951:2: ( ( 'pathModelo:' ) )
            // InternalGramatica.g:952:3: ( 'pathModelo:' )
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloPathModeloKeyword_0_0()); 
            // InternalGramatica.g:953:3: ( 'pathModelo:' )
            // InternalGramatica.g:954:4: 'pathModelo:'
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloPathModeloKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getPathModeloPathModeloKeyword_0_0()); 

            }

             after(grammarAccess.getDocumentoAccess().getPathModeloPathModeloKeyword_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Documento__PathOclAssignment_2"
    // InternalGramatica.g:965:1: rule__Documento__PathOclAssignment_2 : ( ( 'pathOcl:' ) ) ;
    public final void rule__Documento__PathOclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:969:1: ( ( ( 'pathOcl:' ) ) )
            // InternalGramatica.g:970:2: ( ( 'pathOcl:' ) )
            {
            // InternalGramatica.g:970:2: ( ( 'pathOcl:' ) )
            // InternalGramatica.g:971:3: ( 'pathOcl:' )
            {
             before(grammarAccess.getDocumentoAccess().getPathOclPathOclKeyword_2_0()); 
            // InternalGramatica.g:972:3: ( 'pathOcl:' )
            // InternalGramatica.g:973:4: 'pathOcl:'
            {
             before(grammarAccess.getDocumentoAccess().getPathOclPathOclKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getPathOclPathOclKeyword_2_0()); 

            }

             after(grammarAccess.getDocumentoAccess().getPathOclPathOclKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documento__PathOclAssignment_2"


    // $ANTLR start "rule__Documento__OracionesAssignment_4"
    // InternalGramatica.g:984:1: rule__Documento__OracionesAssignment_4 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:988:1: ( ( ruleOracion ) )
            // InternalGramatica.g:989:2: ( ruleOracion )
            {
            // InternalGramatica.g:989:2: ( ruleOracion )
            // InternalGramatica.g:990:3: ruleOracion
            {
             before(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOracion();

            state._fsp--;

             after(grammarAccess.getDocumentoAccess().getOracionesOracionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documento__OracionesAssignment_4"


    // $ANTLR start "rule__Simple__DeterminanteAssignment_0"
    // InternalGramatica.g:999:1: rule__Simple__DeterminanteAssignment_0 : ( ruleDeterminante ) ;
    public final void rule__Simple__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1003:1: ( ( ruleDeterminante ) )
            // InternalGramatica.g:1004:2: ( ruleDeterminante )
            {
            // InternalGramatica.g:1004:2: ( ruleDeterminante )
            // InternalGramatica.g:1005:3: ruleDeterminante
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
    // InternalGramatica.g:1014:1: rule__Simple__AtributoAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1018:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1019:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1019:2: ( ruleAtributo )
            // InternalGramatica.g:1020:3: ruleAtributo
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
    // InternalGramatica.g:1029:1: rule__Simple__SintagmaAssignment_2 : ( ruleSintagmaPreposicional ) ;
    public final void rule__Simple__SintagmaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1033:1: ( ( ruleSintagmaPreposicional ) )
            // InternalGramatica.g:1034:2: ( ruleSintagmaPreposicional )
            {
            // InternalGramatica.g:1034:2: ( ruleSintagmaPreposicional )
            // InternalGramatica.g:1035:3: ruleSintagmaPreposicional
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
    // InternalGramatica.g:1044:1: rule__Simple__ContextoAssignment_3 : ( ruleClase ) ;
    public final void rule__Simple__ContextoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1048:1: ( ( ruleClase ) )
            // InternalGramatica.g:1049:2: ( ruleClase )
            {
            // InternalGramatica.g:1049:2: ( ruleClase )
            // InternalGramatica.g:1050:3: ruleClase
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
    // InternalGramatica.g:1059:1: rule__Simple__ObligacionAssignment_4 : ( ruleObligacion ) ;
    public final void rule__Simple__ObligacionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1063:1: ( ( ruleObligacion ) )
            // InternalGramatica.g:1064:2: ( ruleObligacion )
            {
            // InternalGramatica.g:1064:2: ( ruleObligacion )
            // InternalGramatica.g:1065:3: ruleObligacion
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
    // InternalGramatica.g:1074:1: rule__Simple__OperacionAssignment_5 : ( ruleOperacion ) ;
    public final void rule__Simple__OperacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1078:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:1079:2: ( ruleOperacion )
            {
            // InternalGramatica.g:1079:2: ( ruleOperacion )
            // InternalGramatica.g:1080:3: ruleOperacion
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
    // InternalGramatica.g:1089:1: rule__Simple__LiteralAssignment_6_0 : ( ruleLiteral ) ;
    public final void rule__Simple__LiteralAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1093:1: ( ( ruleLiteral ) )
            // InternalGramatica.g:1094:2: ( ruleLiteral )
            {
            // InternalGramatica.g:1094:2: ( ruleLiteral )
            // InternalGramatica.g:1095:3: ruleLiteral
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
    // InternalGramatica.g:1104:1: rule__Simple__AtributoAssignment_6_1 : ( ruleAtributo ) ;
    public final void rule__Simple__AtributoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1108:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1109:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1109:2: ( ruleAtributo )
            // InternalGramatica.g:1110:3: ruleAtributo
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


    // $ANTLR start "rule__Determinante__DescripcionAssignment"
    // InternalGramatica.g:1119:1: rule__Determinante__DescripcionAssignment : ( ( rule__Determinante__DescripcionAlternatives_0 ) ) ;
    public final void rule__Determinante__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1123:1: ( ( ( rule__Determinante__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1124:2: ( ( rule__Determinante__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1124:2: ( ( rule__Determinante__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1125:3: ( rule__Determinante__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getDeterminanteAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1126:3: ( rule__Determinante__DescripcionAlternatives_0 )
            // InternalGramatica.g:1126:4: rule__Determinante__DescripcionAlternatives_0
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
    // InternalGramatica.g:1134:1: rule__Atributo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1138:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1139:2: ( RULE_ID )
            {
            // InternalGramatica.g:1139:2: ( RULE_ID )
            // InternalGramatica.g:1140:3: RULE_ID
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
    // InternalGramatica.g:1149:1: rule__SintagmaPreposicional__DescripcionAssignment : ( ( 'de un/una' ) ) ;
    public final void rule__SintagmaPreposicional__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1153:1: ( ( ( 'de un/una' ) ) )
            // InternalGramatica.g:1154:2: ( ( 'de un/una' ) )
            {
            // InternalGramatica.g:1154:2: ( ( 'de un/una' ) )
            // InternalGramatica.g:1155:3: ( 'de un/una' )
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 
            // InternalGramatica.g:1156:3: ( 'de un/una' )
            // InternalGramatica.g:1157:4: 'de un/una'
            {
             before(grammarAccess.getSintagmaPreposicionalAccess().getDescripcionDeUnUnaKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGramatica.g:1168:1: rule__Obligacion__NegacionAssignment_0 : ( ruleNegacion ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1172:1: ( ( ruleNegacion ) )
            // InternalGramatica.g:1173:2: ( ruleNegacion )
            {
            // InternalGramatica.g:1173:2: ( ruleNegacion )
            // InternalGramatica.g:1174:3: ruleNegacion
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
    // InternalGramatica.g:1183:1: rule__Obligacion__ObligacionDeberAssignment_1 : ( ruleObligacionDeber ) ;
    public final void rule__Obligacion__ObligacionDeberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1187:1: ( ( ruleObligacionDeber ) )
            // InternalGramatica.g:1188:2: ( ruleObligacionDeber )
            {
            // InternalGramatica.g:1188:2: ( ruleObligacionDeber )
            // InternalGramatica.g:1189:3: ruleObligacionDeber
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
    // InternalGramatica.g:1198:1: rule__ObligacionDeber__DescripcionAssignment : ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) ) ;
    public final void rule__ObligacionDeber__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1202:1: ( ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1203:2: ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1203:2: ( ( rule__ObligacionDeber__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1204:3: ( rule__ObligacionDeber__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getObligacionDeberAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1205:3: ( rule__ObligacionDeber__DescripcionAlternatives_0 )
            // InternalGramatica.g:1205:4: rule__ObligacionDeber__DescripcionAlternatives_0
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
    // InternalGramatica.g:1213:1: rule__Negacion__DescripcionAssignment : ( ( 'no' ) ) ;
    public final void rule__Negacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1217:1: ( ( ( 'no' ) ) )
            // InternalGramatica.g:1218:2: ( ( 'no' ) )
            {
            // InternalGramatica.g:1218:2: ( ( 'no' ) )
            // InternalGramatica.g:1219:3: ( 'no' )
            {
             before(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 
            // InternalGramatica.g:1220:3: ( 'no' )
            // InternalGramatica.g:1221:4: 'no'
            {
             before(grammarAccess.getNegacionAccess().getDescripcionNoKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGramatica.g:1232:1: rule__Operacion__DescripcionAssignment : ( ( rule__Operacion__DescripcionAlternatives_0 ) ) ;
    public final void rule__Operacion__DescripcionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1236:1: ( ( ( rule__Operacion__DescripcionAlternatives_0 ) ) )
            // InternalGramatica.g:1237:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            {
            // InternalGramatica.g:1237:2: ( ( rule__Operacion__DescripcionAlternatives_0 ) )
            // InternalGramatica.g:1238:3: ( rule__Operacion__DescripcionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getDescripcionAlternatives_0()); 
            // InternalGramatica.g:1239:3: ( rule__Operacion__DescripcionAlternatives_0 )
            // InternalGramatica.g:1239:4: rule__Operacion__DescripcionAlternatives_0
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
    // InternalGramatica.g:1247:1: rule__Clase__NameAssignment : ( RULE_ID ) ;
    public final void rule__Clase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1251:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1252:2: ( RULE_ID )
            {
            // InternalGramatica.g:1252:2: ( RULE_ID )
            // InternalGramatica.g:1253:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000BF8070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});

}