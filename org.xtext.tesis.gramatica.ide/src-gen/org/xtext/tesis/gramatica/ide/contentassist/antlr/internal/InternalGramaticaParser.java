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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'y'", "'o'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'el/la'", "'cantidad de'", "'de'", "'un/una'", "'no'", "'debe ser'"
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


    // $ANTLR start "entryRuleContenido"
    // InternalGramatica.g:103:1: entryRuleContenido : ruleContenido EOF ;
    public final void entryRuleContenido() throws RecognitionException {
        try {
            // InternalGramatica.g:104:1: ( ruleContenido EOF )
            // InternalGramatica.g:105:1: ruleContenido EOF
            {
             before(grammarAccess.getContenidoRule()); 
            pushFollow(FOLLOW_1);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getContenidoRule()); 
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
    // $ANTLR end "entryRuleContenido"


    // $ANTLR start "ruleContenido"
    // InternalGramatica.g:112:1: ruleContenido : ( ( rule__Contenido__Group__0 ) ) ;
    public final void ruleContenido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:116:2: ( ( ( rule__Contenido__Group__0 ) ) )
            // InternalGramatica.g:117:2: ( ( rule__Contenido__Group__0 ) )
            {
            // InternalGramatica.g:117:2: ( ( rule__Contenido__Group__0 ) )
            // InternalGramatica.g:118:3: ( rule__Contenido__Group__0 )
            {
             before(grammarAccess.getContenidoAccess().getGroup()); 
            // InternalGramatica.g:119:3: ( rule__Contenido__Group__0 )
            // InternalGramatica.g:119:4: rule__Contenido__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContenido"


    // $ANTLR start "entryRuleSimple"
    // InternalGramatica.g:128:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalGramatica.g:129:1: ( ruleSimple EOF )
            // InternalGramatica.g:130:1: ruleSimple EOF
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
    // InternalGramatica.g:137:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:141:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalGramatica.g:142:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalGramatica.g:142:2: ( ( rule__Simple__Group__0 ) )
            // InternalGramatica.g:143:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalGramatica.g:144:3: ( rule__Simple__Group__0 )
            // InternalGramatica.g:144:4: rule__Simple__Group__0
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


    // $ANTLR start "entryRuleComposicion"
    // InternalGramatica.g:153:1: entryRuleComposicion : ruleComposicion EOF ;
    public final void entryRuleComposicion() throws RecognitionException {
        try {
            // InternalGramatica.g:154:1: ( ruleComposicion EOF )
            // InternalGramatica.g:155:1: ruleComposicion EOF
            {
             before(grammarAccess.getComposicionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposicion();

            state._fsp--;

             after(grammarAccess.getComposicionRule()); 
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
    // $ANTLR end "entryRuleComposicion"


    // $ANTLR start "ruleComposicion"
    // InternalGramatica.g:162:1: ruleComposicion : ( ( rule__Composicion__Group__0 ) ) ;
    public final void ruleComposicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:166:2: ( ( ( rule__Composicion__Group__0 ) ) )
            // InternalGramatica.g:167:2: ( ( rule__Composicion__Group__0 ) )
            {
            // InternalGramatica.g:167:2: ( ( rule__Composicion__Group__0 ) )
            // InternalGramatica.g:168:3: ( rule__Composicion__Group__0 )
            {
             before(grammarAccess.getComposicionAccess().getGroup()); 
            // InternalGramatica.g:169:3: ( rule__Composicion__Group__0 )
            // InternalGramatica.g:169:4: rule__Composicion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composicion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComposicionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposicion"


    // $ANTLR start "entryRuleNexo"
    // InternalGramatica.g:178:1: entryRuleNexo : ruleNexo EOF ;
    public final void entryRuleNexo() throws RecognitionException {
        try {
            // InternalGramatica.g:179:1: ( ruleNexo EOF )
            // InternalGramatica.g:180:1: ruleNexo EOF
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
    // InternalGramatica.g:187:1: ruleNexo : ( ( rule__Nexo__ValorAssignment ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:191:2: ( ( ( rule__Nexo__ValorAssignment ) ) )
            // InternalGramatica.g:192:2: ( ( rule__Nexo__ValorAssignment ) )
            {
            // InternalGramatica.g:192:2: ( ( rule__Nexo__ValorAssignment ) )
            // InternalGramatica.g:193:3: ( rule__Nexo__ValorAssignment )
            {
             before(grammarAccess.getNexoAccess().getValorAssignment()); 
            // InternalGramatica.g:194:3: ( rule__Nexo__ValorAssignment )
            // InternalGramatica.g:194:4: rule__Nexo__ValorAssignment
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


    // $ANTLR start "entryRuleExpresion"
    // InternalGramatica.g:203:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalGramatica.g:204:1: ( ruleExpresion EOF )
            // InternalGramatica.g:205:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalGramatica.g:212:1: ruleExpresion : ( ( rule__Expresion__ExpresionAssignment ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:216:2: ( ( ( rule__Expresion__ExpresionAssignment ) ) )
            // InternalGramatica.g:217:2: ( ( rule__Expresion__ExpresionAssignment ) )
            {
            // InternalGramatica.g:217:2: ( ( rule__Expresion__ExpresionAssignment ) )
            // InternalGramatica.g:218:3: ( rule__Expresion__ExpresionAssignment )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAssignment()); 
            // InternalGramatica.g:219:3: ( rule__Expresion__ExpresionAssignment )
            // InternalGramatica.g:219:4: rule__Expresion__ExpresionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__ExpresionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getExpresionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleComparacion"
    // InternalGramatica.g:228:1: entryRuleComparacion : ruleComparacion EOF ;
    public final void entryRuleComparacion() throws RecognitionException {
        try {
            // InternalGramatica.g:229:1: ( ruleComparacion EOF )
            // InternalGramatica.g:230:1: ruleComparacion EOF
            {
             before(grammarAccess.getComparacionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparacion();

            state._fsp--;

             after(grammarAccess.getComparacionRule()); 
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
    // $ANTLR end "entryRuleComparacion"


    // $ANTLR start "ruleComparacion"
    // InternalGramatica.g:237:1: ruleComparacion : ( ( rule__Comparacion__Group__0 ) ) ;
    public final void ruleComparacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:241:2: ( ( ( rule__Comparacion__Group__0 ) ) )
            // InternalGramatica.g:242:2: ( ( rule__Comparacion__Group__0 ) )
            {
            // InternalGramatica.g:242:2: ( ( rule__Comparacion__Group__0 ) )
            // InternalGramatica.g:243:3: ( rule__Comparacion__Group__0 )
            {
             before(grammarAccess.getComparacionAccess().getGroup()); 
            // InternalGramatica.g:244:3: ( rule__Comparacion__Group__0 )
            // InternalGramatica.g:244:4: rule__Comparacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRulePropiedad"
    // InternalGramatica.g:253:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // InternalGramatica.g:254:1: ( rulePropiedad EOF )
            // InternalGramatica.g:255:1: rulePropiedad EOF
            {
             before(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_1);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getPropiedadRule()); 
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
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // InternalGramatica.g:262:1: rulePropiedad : ( ( rule__Propiedad__Group__0 ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:266:2: ( ( ( rule__Propiedad__Group__0 ) ) )
            // InternalGramatica.g:267:2: ( ( rule__Propiedad__Group__0 ) )
            {
            // InternalGramatica.g:267:2: ( ( rule__Propiedad__Group__0 ) )
            // InternalGramatica.g:268:3: ( rule__Propiedad__Group__0 )
            {
             before(grammarAccess.getPropiedadAccess().getGroup()); 
            // InternalGramatica.g:269:3: ( rule__Propiedad__Group__0 )
            // InternalGramatica.g:269:4: rule__Propiedad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleFinOracion"
    // InternalGramatica.g:278:1: entryRuleFinOracion : ruleFinOracion EOF ;
    public final void entryRuleFinOracion() throws RecognitionException {
        try {
            // InternalGramatica.g:279:1: ( ruleFinOracion EOF )
            // InternalGramatica.g:280:1: ruleFinOracion EOF
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
    // InternalGramatica.g:287:1: ruleFinOracion : ( '.\\r\\n' ) ;
    public final void ruleFinOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:291:2: ( ( '.\\r\\n' ) )
            // InternalGramatica.g:292:2: ( '.\\r\\n' )
            {
            // InternalGramatica.g:292:2: ( '.\\r\\n' )
            // InternalGramatica.g:293:3: '.\\r\\n'
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


    // $ANTLR start "entryRuleAtributo"
    // InternalGramatica.g:303:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalGramatica.g:304:1: ( ruleAtributo EOF )
            // InternalGramatica.g:305:1: ruleAtributo EOF
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
    // InternalGramatica.g:312:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:316:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalGramatica.g:317:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalGramatica.g:317:2: ( ( rule__Atributo__Group__0 ) )
            // InternalGramatica.g:318:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalGramatica.g:319:3: ( rule__Atributo__Group__0 )
            // InternalGramatica.g:319:4: rule__Atributo__Group__0
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


    // $ANTLR start "entryRuleTermino"
    // InternalGramatica.g:328:1: entryRuleTermino : ruleTermino EOF ;
    public final void entryRuleTermino() throws RecognitionException {
        try {
            // InternalGramatica.g:329:1: ( ruleTermino EOF )
            // InternalGramatica.g:330:1: ruleTermino EOF
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
    // InternalGramatica.g:337:1: ruleTermino : ( ( rule__Termino__Group__0 ) ) ;
    public final void ruleTermino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:341:2: ( ( ( rule__Termino__Group__0 ) ) )
            // InternalGramatica.g:342:2: ( ( rule__Termino__Group__0 ) )
            {
            // InternalGramatica.g:342:2: ( ( rule__Termino__Group__0 ) )
            // InternalGramatica.g:343:3: ( rule__Termino__Group__0 )
            {
             before(grammarAccess.getTerminoAccess().getGroup()); 
            // InternalGramatica.g:344:3: ( rule__Termino__Group__0 )
            // InternalGramatica.g:344:4: rule__Termino__Group__0
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
    // InternalGramatica.g:387:1: ruleOperacion : ( ( rule__Operacion__OperacionAssignment ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:391:2: ( ( ( rule__Operacion__OperacionAssignment ) ) )
            // InternalGramatica.g:392:2: ( ( rule__Operacion__OperacionAssignment ) )
            {
            // InternalGramatica.g:392:2: ( ( rule__Operacion__OperacionAssignment ) )
            // InternalGramatica.g:393:3: ( rule__Operacion__OperacionAssignment )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAssignment()); 
            // InternalGramatica.g:394:3: ( rule__Operacion__OperacionAssignment )
            // InternalGramatica.g:394:4: rule__Operacion__OperacionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__OperacionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getOperacionAssignment()); 

            }


            }

        }
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
    // InternalGramatica.g:403:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalGramatica.g:404:1: ( ruleLiteral EOF )
            // InternalGramatica.g:405:1: ruleLiteral EOF
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
    // InternalGramatica.g:412:1: ruleLiteral : ( ( rule__Literal__ValorAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:416:2: ( ( ( rule__Literal__ValorAssignment ) ) )
            // InternalGramatica.g:417:2: ( ( rule__Literal__ValorAssignment ) )
            {
            // InternalGramatica.g:417:2: ( ( rule__Literal__ValorAssignment ) )
            // InternalGramatica.g:418:3: ( rule__Literal__ValorAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValorAssignment()); 
            // InternalGramatica.g:419:3: ( rule__Literal__ValorAssignment )
            // InternalGramatica.g:419:4: rule__Literal__ValorAssignment
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


    // $ANTLR start "rule__Nexo__ValorAlternatives_0"
    // InternalGramatica.g:427:1: rule__Nexo__ValorAlternatives_0 : ( ( 'y' ) | ( 'o' ) );
    public final void rule__Nexo__ValorAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:431:1: ( ( 'y' ) | ( 'o' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGramatica.g:432:2: ( 'y' )
                    {
                    // InternalGramatica.g:432:2: ( 'y' )
                    // InternalGramatica.g:433:3: 'y'
                    {
                     before(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:438:2: ( 'o' )
                    {
                    // InternalGramatica.g:438:2: ( 'o' )
                    // InternalGramatica.g:439:3: 'o'
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


    // $ANTLR start "rule__Expresion__ExpresionAlternatives_0"
    // InternalGramatica.g:448:1: rule__Expresion__ExpresionAlternatives_0 : ( ( ruleLiteral ) | ( rulePropiedad ) );
    public final void rule__Expresion__ExpresionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:452:1: ( ( ruleLiteral ) | ( rulePropiedad ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:453:2: ( ruleLiteral )
                    {
                    // InternalGramatica.g:453:2: ( ruleLiteral )
                    // InternalGramatica.g:454:3: ruleLiteral
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionLiteralParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionLiteralParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:459:2: ( rulePropiedad )
                    {
                    // InternalGramatica.g:459:2: ( rulePropiedad )
                    // InternalGramatica.g:460:3: rulePropiedad
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionPropiedadParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropiedad();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionPropiedadParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Expresion__ExpresionAlternatives_0"


    // $ANTLR start "rule__Operacion__OperacionAlternatives_0"
    // InternalGramatica.g:469:1: rule__Operacion__OperacionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) );
    public final void rule__Operacion__OperacionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:473:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) )
            int alt3=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGramatica.g:474:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:474:2: ( 'mayor que' )
                    // InternalGramatica.g:475:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:480:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:480:2: ( 'menor que' )
                    // InternalGramatica.g:481:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:486:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:486:2: ( 'igual a' )
                    // InternalGramatica.g:487:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:492:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:492:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:493:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:498:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:498:2: ( 'menor o igual a' )
                    // InternalGramatica.g:499:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:504:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:504:2: ( 'distinto de' )
                    // InternalGramatica.g:505:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); 

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
    // $ANTLR end "rule__Operacion__OperacionAlternatives_0"


    // $ANTLR start "rule__Documento__Group__0"
    // InternalGramatica.g:514:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:518:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalGramatica.g:519:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
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
    // InternalGramatica.g:526:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__PathModeloAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:530:1: ( ( ( rule__Documento__PathModeloAssignment_0 ) ) )
            // InternalGramatica.g:531:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            {
            // InternalGramatica.g:531:1: ( ( rule__Documento__PathModeloAssignment_0 ) )
            // InternalGramatica.g:532:2: ( rule__Documento__PathModeloAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getPathModeloAssignment_0()); 
            // InternalGramatica.g:533:2: ( rule__Documento__PathModeloAssignment_0 )
            // InternalGramatica.g:533:3: rule__Documento__PathModeloAssignment_0
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
    // InternalGramatica.g:541:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:545:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalGramatica.g:546:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
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
    // InternalGramatica.g:553:1: rule__Documento__Group__1__Impl : ( ( rule__Documento__PathOclAssignment_1 ) ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:557:1: ( ( ( rule__Documento__PathOclAssignment_1 ) ) )
            // InternalGramatica.g:558:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            {
            // InternalGramatica.g:558:1: ( ( rule__Documento__PathOclAssignment_1 ) )
            // InternalGramatica.g:559:2: ( rule__Documento__PathOclAssignment_1 )
            {
             before(grammarAccess.getDocumentoAccess().getPathOclAssignment_1()); 
            // InternalGramatica.g:560:2: ( rule__Documento__PathOclAssignment_1 )
            // InternalGramatica.g:560:3: rule__Documento__PathOclAssignment_1
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
    // InternalGramatica.g:568:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:572:1: ( rule__Documento__Group__2__Impl )
            // InternalGramatica.g:573:2: rule__Documento__Group__2__Impl
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
    // InternalGramatica.g:579:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__OracionesAssignment_2 )* ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:583:1: ( ( ( rule__Documento__OracionesAssignment_2 )* ) )
            // InternalGramatica.g:584:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            {
            // InternalGramatica.g:584:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            // InternalGramatica.g:585:2: ( rule__Documento__OracionesAssignment_2 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 
            // InternalGramatica.g:586:2: ( rule__Documento__OracionesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGramatica.g:586:3: rule__Documento__OracionesAssignment_2
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
    // InternalGramatica.g:595:1: rule__Oracion__Group__0 : rule__Oracion__Group__0__Impl rule__Oracion__Group__1 ;
    public final void rule__Oracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:599:1: ( rule__Oracion__Group__0__Impl rule__Oracion__Group__1 )
            // InternalGramatica.g:600:2: rule__Oracion__Group__0__Impl rule__Oracion__Group__1
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
    // InternalGramatica.g:607:1: rule__Oracion__Group__0__Impl : ( ( rule__Oracion__ContenidoAssignment_0 ) ) ;
    public final void rule__Oracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:611:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) )
            // InternalGramatica.g:612:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            {
            // InternalGramatica.g:612:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            // InternalGramatica.g:613:2: ( rule__Oracion__ContenidoAssignment_0 )
            {
             before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
            // InternalGramatica.g:614:2: ( rule__Oracion__ContenidoAssignment_0 )
            // InternalGramatica.g:614:3: rule__Oracion__ContenidoAssignment_0
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
    // InternalGramatica.g:622:1: rule__Oracion__Group__1 : rule__Oracion__Group__1__Impl ;
    public final void rule__Oracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:626:1: ( rule__Oracion__Group__1__Impl )
            // InternalGramatica.g:627:2: rule__Oracion__Group__1__Impl
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
    // InternalGramatica.g:633:1: rule__Oracion__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Oracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:637:1: ( ( ruleFinOracion ) )
            // InternalGramatica.g:638:1: ( ruleFinOracion )
            {
            // InternalGramatica.g:638:1: ( ruleFinOracion )
            // InternalGramatica.g:639:2: ruleFinOracion
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


    // $ANTLR start "rule__Contenido__Group__0"
    // InternalGramatica.g:649:1: rule__Contenido__Group__0 : rule__Contenido__Group__0__Impl rule__Contenido__Group__1 ;
    public final void rule__Contenido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:653:1: ( rule__Contenido__Group__0__Impl rule__Contenido__Group__1 )
            // InternalGramatica.g:654:2: rule__Contenido__Group__0__Impl rule__Contenido__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Contenido__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__1();

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
    // $ANTLR end "rule__Contenido__Group__0"


    // $ANTLR start "rule__Contenido__Group__0__Impl"
    // InternalGramatica.g:661:1: rule__Contenido__Group__0__Impl : ( ( rule__Contenido__SimpleAssignment_0 ) ) ;
    public final void rule__Contenido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:665:1: ( ( ( rule__Contenido__SimpleAssignment_0 ) ) )
            // InternalGramatica.g:666:1: ( ( rule__Contenido__SimpleAssignment_0 ) )
            {
            // InternalGramatica.g:666:1: ( ( rule__Contenido__SimpleAssignment_0 ) )
            // InternalGramatica.g:667:2: ( rule__Contenido__SimpleAssignment_0 )
            {
             before(grammarAccess.getContenidoAccess().getSimpleAssignment_0()); 
            // InternalGramatica.g:668:2: ( rule__Contenido__SimpleAssignment_0 )
            // InternalGramatica.g:668:3: rule__Contenido__SimpleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__SimpleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getSimpleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__Group__0__Impl"


    // $ANTLR start "rule__Contenido__Group__1"
    // InternalGramatica.g:676:1: rule__Contenido__Group__1 : rule__Contenido__Group__1__Impl ;
    public final void rule__Contenido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:680:1: ( rule__Contenido__Group__1__Impl )
            // InternalGramatica.g:681:2: rule__Contenido__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group__1__Impl();

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
    // $ANTLR end "rule__Contenido__Group__1"


    // $ANTLR start "rule__Contenido__Group__1__Impl"
    // InternalGramatica.g:687:1: rule__Contenido__Group__1__Impl : ( ( rule__Contenido__ComposicionAssignment_1 )? ) ;
    public final void rule__Contenido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:691:1: ( ( ( rule__Contenido__ComposicionAssignment_1 )? ) )
            // InternalGramatica.g:692:1: ( ( rule__Contenido__ComposicionAssignment_1 )? )
            {
            // InternalGramatica.g:692:1: ( ( rule__Contenido__ComposicionAssignment_1 )? )
            // InternalGramatica.g:693:2: ( rule__Contenido__ComposicionAssignment_1 )?
            {
             before(grammarAccess.getContenidoAccess().getComposicionAssignment_1()); 
            // InternalGramatica.g:694:2: ( rule__Contenido__ComposicionAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:694:3: rule__Contenido__ComposicionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contenido__ComposicionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContenidoAccess().getComposicionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__Group__1__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalGramatica.g:703:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:707:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:708:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
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
    // InternalGramatica.g:715:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__Expresion_izqAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:719:1: ( ( ( rule__Simple__Expresion_izqAssignment_0 ) ) )
            // InternalGramatica.g:720:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            {
            // InternalGramatica.g:720:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            // InternalGramatica.g:721:2: ( rule__Simple__Expresion_izqAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); 
            // InternalGramatica.g:722:2: ( rule__Simple__Expresion_izqAssignment_0 )
            // InternalGramatica.g:722:3: rule__Simple__Expresion_izqAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Expresion_izqAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); 

            }


            }

        }
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
    // InternalGramatica.g:730:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:734:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:735:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGramatica.g:742:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__ComparacionAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:746:1: ( ( ( rule__Simple__ComparacionAssignment_1 ) ) )
            // InternalGramatica.g:747:1: ( ( rule__Simple__ComparacionAssignment_1 ) )
            {
            // InternalGramatica.g:747:1: ( ( rule__Simple__ComparacionAssignment_1 ) )
            // InternalGramatica.g:748:2: ( rule__Simple__ComparacionAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getComparacionAssignment_1()); 
            // InternalGramatica.g:749:2: ( rule__Simple__ComparacionAssignment_1 )
            // InternalGramatica.g:749:3: rule__Simple__ComparacionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ComparacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getComparacionAssignment_1()); 

            }


            }

        }
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
    // InternalGramatica.g:757:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:761:1: ( rule__Simple__Group__2__Impl )
            // InternalGramatica.g:762:2: rule__Simple__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__2__Impl();

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
    // InternalGramatica.g:768:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__Expresion_derAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:772:1: ( ( ( rule__Simple__Expresion_derAssignment_2 ) ) )
            // InternalGramatica.g:773:1: ( ( rule__Simple__Expresion_derAssignment_2 ) )
            {
            // InternalGramatica.g:773:1: ( ( rule__Simple__Expresion_derAssignment_2 ) )
            // InternalGramatica.g:774:2: ( rule__Simple__Expresion_derAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getExpresion_derAssignment_2()); 
            // InternalGramatica.g:775:2: ( rule__Simple__Expresion_derAssignment_2 )
            // InternalGramatica.g:775:3: rule__Simple__Expresion_derAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Expresion_derAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getExpresion_derAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Composicion__Group__0"
    // InternalGramatica.g:784:1: rule__Composicion__Group__0 : rule__Composicion__Group__0__Impl rule__Composicion__Group__1 ;
    public final void rule__Composicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:788:1: ( rule__Composicion__Group__0__Impl rule__Composicion__Group__1 )
            // InternalGramatica.g:789:2: rule__Composicion__Group__0__Impl rule__Composicion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Composicion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composicion__Group__1();

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
    // $ANTLR end "rule__Composicion__Group__0"


    // $ANTLR start "rule__Composicion__Group__0__Impl"
    // InternalGramatica.g:796:1: rule__Composicion__Group__0__Impl : ( ( rule__Composicion__NexoAssignment_0 ) ) ;
    public final void rule__Composicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:800:1: ( ( ( rule__Composicion__NexoAssignment_0 ) ) )
            // InternalGramatica.g:801:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            {
            // InternalGramatica.g:801:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            // InternalGramatica.g:802:2: ( rule__Composicion__NexoAssignment_0 )
            {
             before(grammarAccess.getComposicionAccess().getNexoAssignment_0()); 
            // InternalGramatica.g:803:2: ( rule__Composicion__NexoAssignment_0 )
            // InternalGramatica.g:803:3: rule__Composicion__NexoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Composicion__NexoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComposicionAccess().getNexoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composicion__Group__0__Impl"


    // $ANTLR start "rule__Composicion__Group__1"
    // InternalGramatica.g:811:1: rule__Composicion__Group__1 : rule__Composicion__Group__1__Impl ;
    public final void rule__Composicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:815:1: ( rule__Composicion__Group__1__Impl )
            // InternalGramatica.g:816:2: rule__Composicion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composicion__Group__1__Impl();

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
    // $ANTLR end "rule__Composicion__Group__1"


    // $ANTLR start "rule__Composicion__Group__1__Impl"
    // InternalGramatica.g:822:1: rule__Composicion__Group__1__Impl : ( ( rule__Composicion__ContenidoAssignment_1 ) ) ;
    public final void rule__Composicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:826:1: ( ( ( rule__Composicion__ContenidoAssignment_1 ) ) )
            // InternalGramatica.g:827:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            {
            // InternalGramatica.g:827:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            // InternalGramatica.g:828:2: ( rule__Composicion__ContenidoAssignment_1 )
            {
             before(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); 
            // InternalGramatica.g:829:2: ( rule__Composicion__ContenidoAssignment_1 )
            // InternalGramatica.g:829:3: rule__Composicion__ContenidoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Composicion__ContenidoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composicion__Group__1__Impl"


    // $ANTLR start "rule__Comparacion__Group__0"
    // InternalGramatica.g:838:1: rule__Comparacion__Group__0 : rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 ;
    public final void rule__Comparacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:842:1: ( rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 )
            // InternalGramatica.g:843:2: rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Comparacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparacion__Group__1();

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
    // $ANTLR end "rule__Comparacion__Group__0"


    // $ANTLR start "rule__Comparacion__Group__0__Impl"
    // InternalGramatica.g:850:1: rule__Comparacion__Group__0__Impl : ( ( rule__Comparacion__ObligacionAssignment_0 ) ) ;
    public final void rule__Comparacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:854:1: ( ( ( rule__Comparacion__ObligacionAssignment_0 ) ) )
            // InternalGramatica.g:855:1: ( ( rule__Comparacion__ObligacionAssignment_0 ) )
            {
            // InternalGramatica.g:855:1: ( ( rule__Comparacion__ObligacionAssignment_0 ) )
            // InternalGramatica.g:856:2: ( rule__Comparacion__ObligacionAssignment_0 )
            {
             before(grammarAccess.getComparacionAccess().getObligacionAssignment_0()); 
            // InternalGramatica.g:857:2: ( rule__Comparacion__ObligacionAssignment_0 )
            // InternalGramatica.g:857:3: rule__Comparacion__ObligacionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparacion__ObligacionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparacionAccess().getObligacionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacion__Group__0__Impl"


    // $ANTLR start "rule__Comparacion__Group__1"
    // InternalGramatica.g:865:1: rule__Comparacion__Group__1 : rule__Comparacion__Group__1__Impl ;
    public final void rule__Comparacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:869:1: ( rule__Comparacion__Group__1__Impl )
            // InternalGramatica.g:870:2: rule__Comparacion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparacion__Group__1__Impl();

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
    // $ANTLR end "rule__Comparacion__Group__1"


    // $ANTLR start "rule__Comparacion__Group__1__Impl"
    // InternalGramatica.g:876:1: rule__Comparacion__Group__1__Impl : ( ( rule__Comparacion__OperacionAssignment_1 ) ) ;
    public final void rule__Comparacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:880:1: ( ( ( rule__Comparacion__OperacionAssignment_1 ) ) )
            // InternalGramatica.g:881:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            {
            // InternalGramatica.g:881:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            // InternalGramatica.g:882:2: ( rule__Comparacion__OperacionAssignment_1 )
            {
             before(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); 
            // InternalGramatica.g:883:2: ( rule__Comparacion__OperacionAssignment_1 )
            // InternalGramatica.g:883:3: rule__Comparacion__OperacionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparacion__OperacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacion__Group__1__Impl"


    // $ANTLR start "rule__Propiedad__Group__0"
    // InternalGramatica.g:892:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:896:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // InternalGramatica.g:897:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Propiedad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__1();

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
    // $ANTLR end "rule__Propiedad__Group__0"


    // $ANTLR start "rule__Propiedad__Group__0__Impl"
    // InternalGramatica.g:904:1: rule__Propiedad__Group__0__Impl : ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:908:1: ( ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) )
            // InternalGramatica.g:909:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            {
            // InternalGramatica.g:909:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            // InternalGramatica.g:910:2: ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* )
            {
            // InternalGramatica.g:910:2: ( ( rule__Propiedad__AtributoAssignment_0 ) )
            // InternalGramatica.g:911:3: ( rule__Propiedad__AtributoAssignment_0 )
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalGramatica.g:912:3: ( rule__Propiedad__AtributoAssignment_0 )
            // InternalGramatica.g:912:4: rule__Propiedad__AtributoAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Propiedad__AtributoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 

            }

            // InternalGramatica.g:915:2: ( ( rule__Propiedad__AtributoAssignment_0 )* )
            // InternalGramatica.g:916:3: ( rule__Propiedad__AtributoAssignment_0 )*
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalGramatica.g:917:3: ( rule__Propiedad__AtributoAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGramatica.g:917:4: rule__Propiedad__AtributoAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Propiedad__AtributoAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 

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
    // $ANTLR end "rule__Propiedad__Group__0__Impl"


    // $ANTLR start "rule__Propiedad__Group__1"
    // InternalGramatica.g:926:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:930:1: ( rule__Propiedad__Group__1__Impl )
            // InternalGramatica.g:931:2: rule__Propiedad__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__1__Impl();

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
    // $ANTLR end "rule__Propiedad__Group__1"


    // $ANTLR start "rule__Propiedad__Group__1__Impl"
    // InternalGramatica.g:937:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__TerminoAssignment_1 ) ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:941:1: ( ( ( rule__Propiedad__TerminoAssignment_1 ) ) )
            // InternalGramatica.g:942:1: ( ( rule__Propiedad__TerminoAssignment_1 ) )
            {
            // InternalGramatica.g:942:1: ( ( rule__Propiedad__TerminoAssignment_1 ) )
            // InternalGramatica.g:943:2: ( rule__Propiedad__TerminoAssignment_1 )
            {
             before(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); 
            // InternalGramatica.g:944:2: ( rule__Propiedad__TerminoAssignment_1 )
            // InternalGramatica.g:944:3: rule__Propiedad__TerminoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__TerminoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalGramatica.g:953:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:957:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalGramatica.g:958:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGramatica.g:965:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__DeterminanteAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:969:1: ( ( ( rule__Atributo__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:970:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:970:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:971:2: ( rule__Atributo__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:972:2: ( rule__Atributo__DeterminanteAssignment_0 )
            // InternalGramatica.g:972:3: rule__Atributo__DeterminanteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__DeterminanteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); 

            }


            }

        }
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
    // InternalGramatica.g:980:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:984:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalGramatica.g:985:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2();

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
    // InternalGramatica.g:992:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__PrefijoAssignment_1 )? ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:996:1: ( ( ( rule__Atributo__PrefijoAssignment_1 )? ) )
            // InternalGramatica.g:997:1: ( ( rule__Atributo__PrefijoAssignment_1 )? )
            {
            // InternalGramatica.g:997:1: ( ( rule__Atributo__PrefijoAssignment_1 )? )
            // InternalGramatica.g:998:2: ( rule__Atributo__PrefijoAssignment_1 )?
            {
             before(grammarAccess.getAtributoAccess().getPrefijoAssignment_1()); 
            // InternalGramatica.g:999:2: ( rule__Atributo__PrefijoAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:999:3: rule__Atributo__PrefijoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atributo__PrefijoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getPrefijoAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atributo__Group__2"
    // InternalGramatica.g:1007:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1011:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // InternalGramatica.g:1012:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Atributo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__3();

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
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // InternalGramatica.g:1019:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NombreAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1023:1: ( ( ( rule__Atributo__NombreAssignment_2 ) ) )
            // InternalGramatica.g:1024:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            {
            // InternalGramatica.g:1024:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            // InternalGramatica.g:1025:2: ( rule__Atributo__NombreAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 
            // InternalGramatica.g:1026:2: ( rule__Atributo__NombreAssignment_2 )
            // InternalGramatica.g:1026:3: rule__Atributo__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__3"
    // InternalGramatica.g:1034:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1038:1: ( rule__Atributo__Group__3__Impl )
            // InternalGramatica.g:1039:2: rule__Atributo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__3__Impl();

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
    // $ANTLR end "rule__Atributo__Group__3"


    // $ANTLR start "rule__Atributo__Group__3__Impl"
    // InternalGramatica.g:1045:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__EnlaceAssignment_3 ) ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1049:1: ( ( ( rule__Atributo__EnlaceAssignment_3 ) ) )
            // InternalGramatica.g:1050:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            {
            // InternalGramatica.g:1050:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            // InternalGramatica.g:1051:2: ( rule__Atributo__EnlaceAssignment_3 )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); 
            // InternalGramatica.g:1052:2: ( rule__Atributo__EnlaceAssignment_3 )
            // InternalGramatica.g:1052:3: rule__Atributo__EnlaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__EnlaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3__Impl"


    // $ANTLR start "rule__Termino__Group__0"
    // InternalGramatica.g:1061:1: rule__Termino__Group__0 : rule__Termino__Group__0__Impl rule__Termino__Group__1 ;
    public final void rule__Termino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1065:1: ( rule__Termino__Group__0__Impl rule__Termino__Group__1 )
            // InternalGramatica.g:1066:2: rule__Termino__Group__0__Impl rule__Termino__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGramatica.g:1073:1: rule__Termino__Group__0__Impl : ( ( rule__Termino__IndeterminanteAssignment_0 ) ) ;
    public final void rule__Termino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1077:1: ( ( ( rule__Termino__IndeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:1078:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:1078:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            // InternalGramatica.g:1079:2: ( rule__Termino__IndeterminanteAssignment_0 )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); 
            // InternalGramatica.g:1080:2: ( rule__Termino__IndeterminanteAssignment_0 )
            // InternalGramatica.g:1080:3: rule__Termino__IndeterminanteAssignment_0
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
    // InternalGramatica.g:1088:1: rule__Termino__Group__1 : rule__Termino__Group__1__Impl ;
    public final void rule__Termino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1092:1: ( rule__Termino__Group__1__Impl )
            // InternalGramatica.g:1093:2: rule__Termino__Group__1__Impl
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
    // InternalGramatica.g:1099:1: rule__Termino__Group__1__Impl : ( ( rule__Termino__ContextoAssignment_1 ) ) ;
    public final void rule__Termino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1103:1: ( ( ( rule__Termino__ContextoAssignment_1 ) ) )
            // InternalGramatica.g:1104:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            {
            // InternalGramatica.g:1104:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            // InternalGramatica.g:1105:2: ( rule__Termino__ContextoAssignment_1 )
            {
             before(grammarAccess.getTerminoAccess().getContextoAssignment_1()); 
            // InternalGramatica.g:1106:2: ( rule__Termino__ContextoAssignment_1 )
            // InternalGramatica.g:1106:3: rule__Termino__ContextoAssignment_1
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
    // InternalGramatica.g:1115:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1119:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalGramatica.g:1120:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
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
    // InternalGramatica.g:1127:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1131:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalGramatica.g:1132:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalGramatica.g:1132:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalGramatica.g:1133:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalGramatica.g:1134:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:1134:3: rule__Obligacion__NegacionAssignment_0
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
    // InternalGramatica.g:1142:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1146:1: ( rule__Obligacion__Group__1__Impl )
            // InternalGramatica.g:1147:2: rule__Obligacion__Group__1__Impl
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
    // InternalGramatica.g:1153:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1157:1: ( ( ( rule__Obligacion__ObligacionAssignment_1 ) ) )
            // InternalGramatica.g:1158:1: ( ( rule__Obligacion__ObligacionAssignment_1 ) )
            {
            // InternalGramatica.g:1158:1: ( ( rule__Obligacion__ObligacionAssignment_1 ) )
            // InternalGramatica.g:1159:2: ( rule__Obligacion__ObligacionAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionAssignment_1()); 
            // InternalGramatica.g:1160:2: ( rule__Obligacion__ObligacionAssignment_1 )
            // InternalGramatica.g:1160:3: rule__Obligacion__ObligacionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Obligacion__ObligacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObligacionAccess().getObligacionAssignment_1()); 

            }


            }

        }
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
    // InternalGramatica.g:1169:1: rule__Documento__PathModeloAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Documento__PathModeloAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1173:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1174:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1174:2: ( RULE_STRING )
            // InternalGramatica.g:1175:3: RULE_STRING
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
    // InternalGramatica.g:1184:1: rule__Documento__PathOclAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Documento__PathOclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1188:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1189:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1189:2: ( RULE_STRING )
            // InternalGramatica.g:1190:3: RULE_STRING
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
    // InternalGramatica.g:1199:1: rule__Documento__OracionesAssignment_2 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1203:1: ( ( ruleOracion ) )
            // InternalGramatica.g:1204:2: ( ruleOracion )
            {
            // InternalGramatica.g:1204:2: ( ruleOracion )
            // InternalGramatica.g:1205:3: ruleOracion
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
    // InternalGramatica.g:1214:1: rule__Oracion__ContenidoAssignment_0 : ( ruleContenido ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1218:1: ( ( ruleContenido ) )
            // InternalGramatica.g:1219:2: ( ruleContenido )
            {
            // InternalGramatica.g:1219:2: ( ruleContenido )
            // InternalGramatica.g:1220:3: ruleContenido
            {
             before(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getOracionAccess().getContenidoContenidoParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Contenido__SimpleAssignment_0"
    // InternalGramatica.g:1229:1: rule__Contenido__SimpleAssignment_0 : ( ruleSimple ) ;
    public final void rule__Contenido__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1233:1: ( ( ruleSimple ) )
            // InternalGramatica.g:1234:2: ( ruleSimple )
            {
            // InternalGramatica.g:1234:2: ( ruleSimple )
            // InternalGramatica.g:1235:3: ruleSimple
            {
             before(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__SimpleAssignment_0"


    // $ANTLR start "rule__Contenido__ComposicionAssignment_1"
    // InternalGramatica.g:1244:1: rule__Contenido__ComposicionAssignment_1 : ( ruleComposicion ) ;
    public final void rule__Contenido__ComposicionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1248:1: ( ( ruleComposicion ) )
            // InternalGramatica.g:1249:2: ( ruleComposicion )
            {
            // InternalGramatica.g:1249:2: ( ruleComposicion )
            // InternalGramatica.g:1250:3: ruleComposicion
            {
             before(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComposicion();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__ComposicionAssignment_1"


    // $ANTLR start "rule__Simple__Expresion_izqAssignment_0"
    // InternalGramatica.g:1259:1: rule__Simple__Expresion_izqAssignment_0 : ( ruleExpresion ) ;
    public final void rule__Simple__Expresion_izqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1263:1: ( ( ruleExpresion ) )
            // InternalGramatica.g:1264:2: ( ruleExpresion )
            {
            // InternalGramatica.g:1264:2: ( ruleExpresion )
            // InternalGramatica.g:1265:3: ruleExpresion
            {
             before(grammarAccess.getSimpleAccess().getExpresion_izqExpresionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getExpresion_izqExpresionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Expresion_izqAssignment_0"


    // $ANTLR start "rule__Simple__ComparacionAssignment_1"
    // InternalGramatica.g:1274:1: rule__Simple__ComparacionAssignment_1 : ( ruleComparacion ) ;
    public final void rule__Simple__ComparacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1278:1: ( ( ruleComparacion ) )
            // InternalGramatica.g:1279:2: ( ruleComparacion )
            {
            // InternalGramatica.g:1279:2: ( ruleComparacion )
            // InternalGramatica.g:1280:3: ruleComparacion
            {
             before(grammarAccess.getSimpleAccess().getComparacionComparacionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparacion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getComparacionComparacionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__ComparacionAssignment_1"


    // $ANTLR start "rule__Simple__Expresion_derAssignment_2"
    // InternalGramatica.g:1289:1: rule__Simple__Expresion_derAssignment_2 : ( ruleExpresion ) ;
    public final void rule__Simple__Expresion_derAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1293:1: ( ( ruleExpresion ) )
            // InternalGramatica.g:1294:2: ( ruleExpresion )
            {
            // InternalGramatica.g:1294:2: ( ruleExpresion )
            // InternalGramatica.g:1295:3: ruleExpresion
            {
             before(grammarAccess.getSimpleAccess().getExpresion_derExpresionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getExpresion_derExpresionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Expresion_derAssignment_2"


    // $ANTLR start "rule__Composicion__NexoAssignment_0"
    // InternalGramatica.g:1304:1: rule__Composicion__NexoAssignment_0 : ( ruleNexo ) ;
    public final void rule__Composicion__NexoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1308:1: ( ( ruleNexo ) )
            // InternalGramatica.g:1309:2: ( ruleNexo )
            {
            // InternalGramatica.g:1309:2: ( ruleNexo )
            // InternalGramatica.g:1310:3: ruleNexo
            {
             before(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNexo();

            state._fsp--;

             after(grammarAccess.getComposicionAccess().getNexoNexoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composicion__NexoAssignment_0"


    // $ANTLR start "rule__Composicion__ContenidoAssignment_1"
    // InternalGramatica.g:1319:1: rule__Composicion__ContenidoAssignment_1 : ( ruleContenido ) ;
    public final void rule__Composicion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1323:1: ( ( ruleContenido ) )
            // InternalGramatica.g:1324:2: ( ruleContenido )
            {
            // InternalGramatica.g:1324:2: ( ruleContenido )
            // InternalGramatica.g:1325:3: ruleContenido
            {
             before(grammarAccess.getComposicionAccess().getContenidoContenidoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getComposicionAccess().getContenidoContenidoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composicion__ContenidoAssignment_1"


    // $ANTLR start "rule__Nexo__ValorAssignment"
    // InternalGramatica.g:1334:1: rule__Nexo__ValorAssignment : ( ( rule__Nexo__ValorAlternatives_0 ) ) ;
    public final void rule__Nexo__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1338:1: ( ( ( rule__Nexo__ValorAlternatives_0 ) ) )
            // InternalGramatica.g:1339:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            {
            // InternalGramatica.g:1339:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            // InternalGramatica.g:1340:3: ( rule__Nexo__ValorAlternatives_0 )
            {
             before(grammarAccess.getNexoAccess().getValorAlternatives_0()); 
            // InternalGramatica.g:1341:3: ( rule__Nexo__ValorAlternatives_0 )
            // InternalGramatica.g:1341:4: rule__Nexo__ValorAlternatives_0
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


    // $ANTLR start "rule__Expresion__ExpresionAssignment"
    // InternalGramatica.g:1349:1: rule__Expresion__ExpresionAssignment : ( ( rule__Expresion__ExpresionAlternatives_0 ) ) ;
    public final void rule__Expresion__ExpresionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1353:1: ( ( ( rule__Expresion__ExpresionAlternatives_0 ) ) )
            // InternalGramatica.g:1354:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            {
            // InternalGramatica.g:1354:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            // InternalGramatica.g:1355:3: ( rule__Expresion__ExpresionAlternatives_0 )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); 
            // InternalGramatica.g:1356:3: ( rule__Expresion__ExpresionAlternatives_0 )
            // InternalGramatica.g:1356:4: rule__Expresion__ExpresionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__ExpresionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__ExpresionAssignment"


    // $ANTLR start "rule__Comparacion__ObligacionAssignment_0"
    // InternalGramatica.g:1364:1: rule__Comparacion__ObligacionAssignment_0 : ( ruleObligacion ) ;
    public final void rule__Comparacion__ObligacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1368:1: ( ( ruleObligacion ) )
            // InternalGramatica.g:1369:2: ( ruleObligacion )
            {
            // InternalGramatica.g:1369:2: ( ruleObligacion )
            // InternalGramatica.g:1370:3: ruleObligacion
            {
             before(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleObligacion();

            state._fsp--;

             after(grammarAccess.getComparacionAccess().getObligacionObligacionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacion__ObligacionAssignment_0"


    // $ANTLR start "rule__Comparacion__OperacionAssignment_1"
    // InternalGramatica.g:1379:1: rule__Comparacion__OperacionAssignment_1 : ( ruleOperacion ) ;
    public final void rule__Comparacion__OperacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1383:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:1384:2: ( ruleOperacion )
            {
            // InternalGramatica.g:1384:2: ( ruleOperacion )
            // InternalGramatica.g:1385:3: ruleOperacion
            {
             before(grammarAccess.getComparacionAccess().getOperacionOperacionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getComparacionAccess().getOperacionOperacionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacion__OperacionAssignment_1"


    // $ANTLR start "rule__Propiedad__AtributoAssignment_0"
    // InternalGramatica.g:1394:1: rule__Propiedad__AtributoAssignment_0 : ( ruleAtributo ) ;
    public final void rule__Propiedad__AtributoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1398:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1399:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1399:2: ( ruleAtributo )
            // InternalGramatica.g:1400:3: ruleAtributo
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getAtributoAtributoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__AtributoAssignment_0"


    // $ANTLR start "rule__Propiedad__TerminoAssignment_1"
    // InternalGramatica.g:1409:1: rule__Propiedad__TerminoAssignment_1 : ( ruleTermino ) ;
    public final void rule__Propiedad__TerminoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1413:1: ( ( ruleTermino ) )
            // InternalGramatica.g:1414:2: ( ruleTermino )
            {
            // InternalGramatica.g:1414:2: ( ruleTermino )
            // InternalGramatica.g:1415:3: ruleTermino
            {
             before(grammarAccess.getPropiedadAccess().getTerminoTerminoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTermino();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getTerminoTerminoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__TerminoAssignment_1"


    // $ANTLR start "rule__Atributo__DeterminanteAssignment_0"
    // InternalGramatica.g:1424:1: rule__Atributo__DeterminanteAssignment_0 : ( ( 'el/la' ) ) ;
    public final void rule__Atributo__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1428:1: ( ( ( 'el/la' ) ) )
            // InternalGramatica.g:1429:2: ( ( 'el/la' ) )
            {
            // InternalGramatica.g:1429:2: ( ( 'el/la' ) )
            // InternalGramatica.g:1430:3: ( 'el/la' )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); 
            // InternalGramatica.g:1431:3: ( 'el/la' )
            // InternalGramatica.g:1432:4: 'el/la'
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); 

            }

             after(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__DeterminanteAssignment_0"


    // $ANTLR start "rule__Atributo__PrefijoAssignment_1"
    // InternalGramatica.g:1443:1: rule__Atributo__PrefijoAssignment_1 : ( ( 'cantidad de' ) ) ;
    public final void rule__Atributo__PrefijoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1447:1: ( ( ( 'cantidad de' ) ) )
            // InternalGramatica.g:1448:2: ( ( 'cantidad de' ) )
            {
            // InternalGramatica.g:1448:2: ( ( 'cantidad de' ) )
            // InternalGramatica.g:1449:3: ( 'cantidad de' )
            {
             before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); 
            // InternalGramatica.g:1450:3: ( 'cantidad de' )
            // InternalGramatica.g:1451:4: 'cantidad de'
            {
             before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); 

            }

             after(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__PrefijoAssignment_1"


    // $ANTLR start "rule__Atributo__NombreAssignment_2"
    // InternalGramatica.g:1462:1: rule__Atributo__NombreAssignment_2 : ( RULE_ID ) ;
    public final void rule__Atributo__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1466:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1467:2: ( RULE_ID )
            {
            // InternalGramatica.g:1467:2: ( RULE_ID )
            // InternalGramatica.g:1468:3: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getNombreIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NombreAssignment_2"


    // $ANTLR start "rule__Atributo__EnlaceAssignment_3"
    // InternalGramatica.g:1477:1: rule__Atributo__EnlaceAssignment_3 : ( ( 'de' ) ) ;
    public final void rule__Atributo__EnlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1481:1: ( ( ( 'de' ) ) )
            // InternalGramatica.g:1482:2: ( ( 'de' ) )
            {
            // InternalGramatica.g:1482:2: ( ( 'de' ) )
            // InternalGramatica.g:1483:3: ( 'de' )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            // InternalGramatica.g:1484:3: ( 'de' )
            // InternalGramatica.g:1485:4: 'de'
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 

            }

             after(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__EnlaceAssignment_3"


    // $ANTLR start "rule__Termino__IndeterminanteAssignment_0"
    // InternalGramatica.g:1496:1: rule__Termino__IndeterminanteAssignment_0 : ( ( 'un/una' ) ) ;
    public final void rule__Termino__IndeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1500:1: ( ( ( 'un/una' ) ) )
            // InternalGramatica.g:1501:2: ( ( 'un/una' ) )
            {
            // InternalGramatica.g:1501:2: ( ( 'un/una' ) )
            // InternalGramatica.g:1502:3: ( 'un/una' )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            // InternalGramatica.g:1503:3: ( 'un/una' )
            // InternalGramatica.g:1504:4: 'un/una'
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 

            }

             after(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 

            }


            }

        }
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
    // InternalGramatica.g:1515:1: rule__Termino__ContextoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Termino__ContextoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1519:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1520:2: ( RULE_ID )
            {
            // InternalGramatica.g:1520:2: ( RULE_ID )
            // InternalGramatica.g:1521:3: RULE_ID
            {
             before(grammarAccess.getTerminoAccess().getContextoIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminoAccess().getContextoIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Obligacion__NegacionAssignment_0"
    // InternalGramatica.g:1530:1: rule__Obligacion__NegacionAssignment_0 : ( ( 'no' ) ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1534:1: ( ( ( 'no' ) ) )
            // InternalGramatica.g:1535:2: ( ( 'no' ) )
            {
            // InternalGramatica.g:1535:2: ( ( 'no' ) )
            // InternalGramatica.g:1536:3: ( 'no' )
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            // InternalGramatica.g:1537:3: ( 'no' )
            // InternalGramatica.g:1538:4: 'no'
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


    // $ANTLR start "rule__Obligacion__ObligacionAssignment_1"
    // InternalGramatica.g:1549:1: rule__Obligacion__ObligacionAssignment_1 : ( ( 'debe ser' ) ) ;
    public final void rule__Obligacion__ObligacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1553:1: ( ( ( 'debe ser' ) ) )
            // InternalGramatica.g:1554:2: ( ( 'debe ser' ) )
            {
            // InternalGramatica.g:1554:2: ( ( 'debe ser' ) )
            // InternalGramatica.g:1555:3: ( 'debe ser' )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); 
            // InternalGramatica.g:1556:3: ( 'debe ser' )
            // InternalGramatica.g:1557:4: 'debe ser'
            {
             before(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); 

            }

             after(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obligacion__ObligacionAssignment_1"


    // $ANTLR start "rule__Operacion__OperacionAssignment"
    // InternalGramatica.g:1568:1: rule__Operacion__OperacionAssignment : ( ( rule__Operacion__OperacionAlternatives_0 ) ) ;
    public final void rule__Operacion__OperacionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1572:1: ( ( ( rule__Operacion__OperacionAlternatives_0 ) ) )
            // InternalGramatica.g:1573:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            {
            // InternalGramatica.g:1573:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            // InternalGramatica.g:1574:3: ( rule__Operacion__OperacionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); 
            // InternalGramatica.g:1575:3: ( rule__Operacion__OperacionAlternatives_0 )
            // InternalGramatica.g:1575:4: rule__Operacion__OperacionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__OperacionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__OperacionAssignment"


    // $ANTLR start "rule__Literal__ValorAssignment"
    // InternalGramatica.g:1583:1: rule__Literal__ValorAssignment : ( RULE_STRING ) ;
    public final void rule__Literal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1587:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1588:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1588:2: ( RULE_STRING )
            // InternalGramatica.g:1589:3: RULE_STRING
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}