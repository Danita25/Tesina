package org.xtext.tesina.ide.contentassist.antlr.internal;

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
import org.xtext.tesina.services.LenguajeNaturalReducidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLenguajeNaturalReducidoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'y'", "'o'", "'entonces'", "'tal que'", "'satisfacen que'", "'existe uno tal que'", "'el/la'", "'todos los/las'", "'existe un'", "'entre los'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'si'", "'cantidad de'", "'de'", "'un/una'", "'no'", "'es'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    // InternalLenguajeNaturalReducido.g:62:1: ruleDocumento : ( ( rule__Documento__Group__0 ) ) ;
    public final void ruleDocumento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:66:2: ( ( ( rule__Documento__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:67:2: ( ( rule__Documento__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:67:2: ( ( rule__Documento__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:68:3: ( rule__Documento__Group__0 )
            {
             before(grammarAccess.getDocumentoAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:69:3: ( rule__Documento__Group__0 )
            // InternalLenguajeNaturalReducido.g:69:4: rule__Documento__Group__0
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


    // $ANTLR start "entryRuleContenido"
    // InternalLenguajeNaturalReducido.g:128:1: entryRuleContenido : ruleContenido EOF ;
    public final void entryRuleContenido() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:129:1: ( ruleContenido EOF )
            // InternalLenguajeNaturalReducido.g:130:1: ruleContenido EOF
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
    // InternalLenguajeNaturalReducido.g:137:1: ruleContenido : ( ( rule__Contenido__Group__0 ) ) ;
    public final void ruleContenido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:141:2: ( ( ( rule__Contenido__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:142:2: ( ( rule__Contenido__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:142:2: ( ( rule__Contenido__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:143:3: ( rule__Contenido__Group__0 )
            {
             before(grammarAccess.getContenidoAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:144:3: ( rule__Contenido__Group__0 )
            // InternalLenguajeNaturalReducido.g:144:4: rule__Contenido__Group__0
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
    // InternalLenguajeNaturalReducido.g:153:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:154:1: ( ruleSimple EOF )
            // InternalLenguajeNaturalReducido.g:155:1: ruleSimple EOF
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
    // InternalLenguajeNaturalReducido.g:162:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:166:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:167:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:167:2: ( ( rule__Simple__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:168:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:169:3: ( rule__Simple__Group__0 )
            // InternalLenguajeNaturalReducido.g:169:4: rule__Simple__Group__0
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


    // $ANTLR start "entryRuleExpresionDerecha"
    // InternalLenguajeNaturalReducido.g:178:1: entryRuleExpresionDerecha : ruleExpresionDerecha EOF ;
    public final void entryRuleExpresionDerecha() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:179:1: ( ruleExpresionDerecha EOF )
            // InternalLenguajeNaturalReducido.g:180:1: ruleExpresionDerecha EOF
            {
             before(grammarAccess.getExpresionDerechaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionDerecha();

            state._fsp--;

             after(grammarAccess.getExpresionDerechaRule()); 
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
    // $ANTLR end "entryRuleExpresionDerecha"


    // $ANTLR start "ruleExpresionDerecha"
    // InternalLenguajeNaturalReducido.g:187:1: ruleExpresionDerecha : ( ( rule__ExpresionDerecha__Group__0 ) ) ;
    public final void ruleExpresionDerecha() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:191:2: ( ( ( rule__ExpresionDerecha__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:192:2: ( ( rule__ExpresionDerecha__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:192:2: ( ( rule__ExpresionDerecha__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:193:3: ( rule__ExpresionDerecha__Group__0 )
            {
             before(grammarAccess.getExpresionDerechaAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:194:3: ( rule__ExpresionDerecha__Group__0 )
            // InternalLenguajeNaturalReducido.g:194:4: rule__ExpresionDerecha__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionDerecha__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionDerechaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionDerecha"


    // $ANTLR start "entryRuleComposicion"
    // InternalLenguajeNaturalReducido.g:203:1: entryRuleComposicion : ruleComposicion EOF ;
    public final void entryRuleComposicion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:204:1: ( ruleComposicion EOF )
            // InternalLenguajeNaturalReducido.g:205:1: ruleComposicion EOF
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
    // InternalLenguajeNaturalReducido.g:212:1: ruleComposicion : ( ( rule__Composicion__Group__0 ) ) ;
    public final void ruleComposicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:216:2: ( ( ( rule__Composicion__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:217:2: ( ( rule__Composicion__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:217:2: ( ( rule__Composicion__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:218:3: ( rule__Composicion__Group__0 )
            {
             before(grammarAccess.getComposicionAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:219:3: ( rule__Composicion__Group__0 )
            // InternalLenguajeNaturalReducido.g:219:4: rule__Composicion__Group__0
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
    // InternalLenguajeNaturalReducido.g:228:1: entryRuleNexo : ruleNexo EOF ;
    public final void entryRuleNexo() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:229:1: ( ruleNexo EOF )
            // InternalLenguajeNaturalReducido.g:230:1: ruleNexo EOF
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
    // InternalLenguajeNaturalReducido.g:237:1: ruleNexo : ( ( rule__Nexo__ValorAssignment ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:241:2: ( ( ( rule__Nexo__ValorAssignment ) ) )
            // InternalLenguajeNaturalReducido.g:242:2: ( ( rule__Nexo__ValorAssignment ) )
            {
            // InternalLenguajeNaturalReducido.g:242:2: ( ( rule__Nexo__ValorAssignment ) )
            // InternalLenguajeNaturalReducido.g:243:3: ( rule__Nexo__ValorAssignment )
            {
             before(grammarAccess.getNexoAccess().getValorAssignment()); 
            // InternalLenguajeNaturalReducido.g:244:3: ( rule__Nexo__ValorAssignment )
            // InternalLenguajeNaturalReducido.g:244:4: rule__Nexo__ValorAssignment
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
    // InternalLenguajeNaturalReducido.g:253:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:254:1: ( ruleExpresion EOF )
            // InternalLenguajeNaturalReducido.g:255:1: ruleExpresion EOF
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
    // InternalLenguajeNaturalReducido.g:262:1: ruleExpresion : ( ( rule__Expresion__ExpresionAssignment ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:266:2: ( ( ( rule__Expresion__ExpresionAssignment ) ) )
            // InternalLenguajeNaturalReducido.g:267:2: ( ( rule__Expresion__ExpresionAssignment ) )
            {
            // InternalLenguajeNaturalReducido.g:267:2: ( ( rule__Expresion__ExpresionAssignment ) )
            // InternalLenguajeNaturalReducido.g:268:3: ( rule__Expresion__ExpresionAssignment )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAssignment()); 
            // InternalLenguajeNaturalReducido.g:269:3: ( rule__Expresion__ExpresionAssignment )
            // InternalLenguajeNaturalReducido.g:269:4: rule__Expresion__ExpresionAssignment
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
    // InternalLenguajeNaturalReducido.g:278:1: entryRuleComparacion : ruleComparacion EOF ;
    public final void entryRuleComparacion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:279:1: ( ruleComparacion EOF )
            // InternalLenguajeNaturalReducido.g:280:1: ruleComparacion EOF
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
    // InternalLenguajeNaturalReducido.g:287:1: ruleComparacion : ( ( rule__Comparacion__Group__0 ) ) ;
    public final void ruleComparacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:291:2: ( ( ( rule__Comparacion__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:292:2: ( ( rule__Comparacion__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:292:2: ( ( rule__Comparacion__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:293:3: ( rule__Comparacion__Group__0 )
            {
             before(grammarAccess.getComparacionAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:294:3: ( rule__Comparacion__Group__0 )
            // InternalLenguajeNaturalReducido.g:294:4: rule__Comparacion__Group__0
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
    // InternalLenguajeNaturalReducido.g:303:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:304:1: ( rulePropiedad EOF )
            // InternalLenguajeNaturalReducido.g:305:1: rulePropiedad EOF
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
    // InternalLenguajeNaturalReducido.g:312:1: rulePropiedad : ( ( rule__Propiedad__Group__0 ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:316:2: ( ( ( rule__Propiedad__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:317:2: ( ( rule__Propiedad__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:317:2: ( ( rule__Propiedad__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:318:3: ( rule__Propiedad__Group__0 )
            {
             before(grammarAccess.getPropiedadAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:319:3: ( rule__Propiedad__Group__0 )
            // InternalLenguajeNaturalReducido.g:319:4: rule__Propiedad__Group__0
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


    // $ANTLR start "entryRuleIteracion"
    // InternalLenguajeNaturalReducido.g:328:1: entryRuleIteracion : ruleIteracion EOF ;
    public final void entryRuleIteracion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:329:1: ( ruleIteracion EOF )
            // InternalLenguajeNaturalReducido.g:330:1: ruleIteracion EOF
            {
             before(grammarAccess.getIteracionRule()); 
            pushFollow(FOLLOW_1);
            ruleIteracion();

            state._fsp--;

             after(grammarAccess.getIteracionRule()); 
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
    // $ANTLR end "entryRuleIteracion"


    // $ANTLR start "ruleIteracion"
    // InternalLenguajeNaturalReducido.g:337:1: ruleIteracion : ( ( rule__Iteracion__Group__0 ) ) ;
    public final void ruleIteracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:341:2: ( ( ( rule__Iteracion__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:342:2: ( ( rule__Iteracion__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:342:2: ( ( rule__Iteracion__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:343:3: ( rule__Iteracion__Group__0 )
            {
             before(grammarAccess.getIteracionAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:344:3: ( rule__Iteracion__Group__0 )
            // InternalLenguajeNaturalReducido.g:344:4: rule__Iteracion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIteracion"


    // $ANTLR start "entryRuleAtributo"
    // InternalLenguajeNaturalReducido.g:353:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:354:1: ( ruleAtributo EOF )
            // InternalLenguajeNaturalReducido.g:355:1: ruleAtributo EOF
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
    // InternalLenguajeNaturalReducido.g:362:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:366:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:367:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:367:2: ( ( rule__Atributo__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:368:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:369:3: ( rule__Atributo__Group__0 )
            // InternalLenguajeNaturalReducido.g:369:4: rule__Atributo__Group__0
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
    // InternalLenguajeNaturalReducido.g:378:1: entryRuleTermino : ruleTermino EOF ;
    public final void entryRuleTermino() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:379:1: ( ruleTermino EOF )
            // InternalLenguajeNaturalReducido.g:380:1: ruleTermino EOF
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
    // InternalLenguajeNaturalReducido.g:387:1: ruleTermino : ( ( rule__Termino__Group__0 ) ) ;
    public final void ruleTermino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:391:2: ( ( ( rule__Termino__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:392:2: ( ( rule__Termino__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:392:2: ( ( rule__Termino__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:393:3: ( rule__Termino__Group__0 )
            {
             before(grammarAccess.getTerminoAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:394:3: ( rule__Termino__Group__0 )
            // InternalLenguajeNaturalReducido.g:394:4: rule__Termino__Group__0
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
    // InternalLenguajeNaturalReducido.g:403:1: entryRuleObligacion : ruleObligacion EOF ;
    public final void entryRuleObligacion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:404:1: ( ruleObligacion EOF )
            // InternalLenguajeNaturalReducido.g:405:1: ruleObligacion EOF
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
    // InternalLenguajeNaturalReducido.g:412:1: ruleObligacion : ( ( rule__Obligacion__Group__0 ) ) ;
    public final void ruleObligacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:416:2: ( ( ( rule__Obligacion__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:417:2: ( ( rule__Obligacion__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:417:2: ( ( rule__Obligacion__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:418:3: ( rule__Obligacion__Group__0 )
            {
             before(grammarAccess.getObligacionAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:419:3: ( rule__Obligacion__Group__0 )
            // InternalLenguajeNaturalReducido.g:419:4: rule__Obligacion__Group__0
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
    // InternalLenguajeNaturalReducido.g:428:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:429:1: ( ruleOperacion EOF )
            // InternalLenguajeNaturalReducido.g:430:1: ruleOperacion EOF
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
    // InternalLenguajeNaturalReducido.g:437:1: ruleOperacion : ( ( rule__Operacion__OperacionAssignment ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:441:2: ( ( ( rule__Operacion__OperacionAssignment ) ) )
            // InternalLenguajeNaturalReducido.g:442:2: ( ( rule__Operacion__OperacionAssignment ) )
            {
            // InternalLenguajeNaturalReducido.g:442:2: ( ( rule__Operacion__OperacionAssignment ) )
            // InternalLenguajeNaturalReducido.g:443:3: ( rule__Operacion__OperacionAssignment )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAssignment()); 
            // InternalLenguajeNaturalReducido.g:444:3: ( rule__Operacion__OperacionAssignment )
            // InternalLenguajeNaturalReducido.g:444:4: rule__Operacion__OperacionAssignment
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
    // InternalLenguajeNaturalReducido.g:453:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:454:1: ( ruleLiteral EOF )
            // InternalLenguajeNaturalReducido.g:455:1: ruleLiteral EOF
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
    // InternalLenguajeNaturalReducido.g:462:1: ruleLiteral : ( ( rule__Literal__ValorAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:466:2: ( ( ( rule__Literal__ValorAssignment ) ) )
            // InternalLenguajeNaturalReducido.g:467:2: ( ( rule__Literal__ValorAssignment ) )
            {
            // InternalLenguajeNaturalReducido.g:467:2: ( ( rule__Literal__ValorAssignment ) )
            // InternalLenguajeNaturalReducido.g:468:3: ( rule__Literal__ValorAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValorAssignment()); 
            // InternalLenguajeNaturalReducido.g:469:3: ( rule__Literal__ValorAssignment )
            // InternalLenguajeNaturalReducido.g:469:4: rule__Literal__ValorAssignment
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
    // InternalLenguajeNaturalReducido.g:477:1: rule__Nexo__ValorAlternatives_0 : ( ( 'y' ) | ( 'o' ) | ( 'entonces' ) );
    public final void rule__Nexo__ValorAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:481:1: ( ( 'y' ) | ( 'o' ) | ( 'entonces' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:482:2: ( 'y' )
                    {
                    // InternalLenguajeNaturalReducido.g:482:2: ( 'y' )
                    // InternalLenguajeNaturalReducido.g:483:3: 'y'
                    {
                     before(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getValorYKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:488:2: ( 'o' )
                    {
                    // InternalLenguajeNaturalReducido.g:488:2: ( 'o' )
                    // InternalLenguajeNaturalReducido.g:489:3: 'o'
                    {
                     before(grammarAccess.getNexoAccess().getValorOKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getValorOKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:494:2: ( 'entonces' )
                    {
                    // InternalLenguajeNaturalReducido.g:494:2: ( 'entonces' )
                    // InternalLenguajeNaturalReducido.g:495:3: 'entonces'
                    {
                     before(grammarAccess.getNexoAccess().getValorEntoncesKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getValorEntoncesKeyword_0_2()); 

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
    // InternalLenguajeNaturalReducido.g:504:1: rule__Expresion__ExpresionAlternatives_0 : ( ( ruleLiteral ) | ( rulePropiedad ) );
    public final void rule__Expresion__ExpresionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:508:1: ( ( ruleLiteral ) | ( rulePropiedad ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=21)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:509:2: ( ruleLiteral )
                    {
                    // InternalLenguajeNaturalReducido.g:509:2: ( ruleLiteral )
                    // InternalLenguajeNaturalReducido.g:510:3: ruleLiteral
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
                    // InternalLenguajeNaturalReducido.g:515:2: ( rulePropiedad )
                    {
                    // InternalLenguajeNaturalReducido.g:515:2: ( rulePropiedad )
                    // InternalLenguajeNaturalReducido.g:516:3: rulePropiedad
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


    // $ANTLR start "rule__Iteracion__ConectorAlternatives_0_0"
    // InternalLenguajeNaturalReducido.g:525:1: rule__Iteracion__ConectorAlternatives_0_0 : ( ( 'tal que' ) | ( 'satisfacen que' ) | ( 'existe uno tal que' ) );
    public final void rule__Iteracion__ConectorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:529:1: ( ( 'tal que' ) | ( 'satisfacen que' ) | ( 'existe uno tal que' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
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
                    // InternalLenguajeNaturalReducido.g:530:2: ( 'tal que' )
                    {
                    // InternalLenguajeNaturalReducido.g:530:2: ( 'tal que' )
                    // InternalLenguajeNaturalReducido.g:531:3: 'tal que'
                    {
                     before(grammarAccess.getIteracionAccess().getConectorTalQueKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIteracionAccess().getConectorTalQueKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:536:2: ( 'satisfacen que' )
                    {
                    // InternalLenguajeNaturalReducido.g:536:2: ( 'satisfacen que' )
                    // InternalLenguajeNaturalReducido.g:537:3: 'satisfacen que'
                    {
                     before(grammarAccess.getIteracionAccess().getConectorSatisfacenQueKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIteracionAccess().getConectorSatisfacenQueKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:542:2: ( 'existe uno tal que' )
                    {
                    // InternalLenguajeNaturalReducido.g:542:2: ( 'existe uno tal que' )
                    // InternalLenguajeNaturalReducido.g:543:3: 'existe uno tal que'
                    {
                     before(grammarAccess.getIteracionAccess().getConectorExisteUnoTalQueKeyword_0_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getIteracionAccess().getConectorExisteUnoTalQueKeyword_0_0_2()); 

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
    // $ANTLR end "rule__Iteracion__ConectorAlternatives_0_0"


    // $ANTLR start "rule__Atributo__DeterminanteAlternatives_0_0"
    // InternalLenguajeNaturalReducido.g:552:1: rule__Atributo__DeterminanteAlternatives_0_0 : ( ( 'el/la' ) | ( 'todos los/las' ) | ( 'existe un' ) | ( 'entre los' ) );
    public final void rule__Atributo__DeterminanteAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:556:1: ( ( 'el/la' ) | ( 'todos los/las' ) | ( 'existe un' ) | ( 'entre los' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:557:2: ( 'el/la' )
                    {
                    // InternalLenguajeNaturalReducido.g:557:2: ( 'el/la' )
                    // InternalLenguajeNaturalReducido.g:558:3: 'el/la'
                    {
                     before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:563:2: ( 'todos los/las' )
                    {
                    // InternalLenguajeNaturalReducido.g:563:2: ( 'todos los/las' )
                    // InternalLenguajeNaturalReducido.g:564:3: 'todos los/las'
                    {
                     before(grammarAccess.getAtributoAccess().getDeterminanteTodosLosLasKeyword_0_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getDeterminanteTodosLosLasKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:569:2: ( 'existe un' )
                    {
                    // InternalLenguajeNaturalReducido.g:569:2: ( 'existe un' )
                    // InternalLenguajeNaturalReducido.g:570:3: 'existe un'
                    {
                     before(grammarAccess.getAtributoAccess().getDeterminanteExisteUnKeyword_0_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getDeterminanteExisteUnKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:575:2: ( 'entre los' )
                    {
                    // InternalLenguajeNaturalReducido.g:575:2: ( 'entre los' )
                    // InternalLenguajeNaturalReducido.g:576:3: 'entre los'
                    {
                     before(grammarAccess.getAtributoAccess().getDeterminanteEntreLosKeyword_0_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getDeterminanteEntreLosKeyword_0_0_3()); 

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
    // $ANTLR end "rule__Atributo__DeterminanteAlternatives_0_0"


    // $ANTLR start "rule__Operacion__OperacionAlternatives_0"
    // InternalLenguajeNaturalReducido.g:585:1: rule__Operacion__OperacionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) );
    public final void rule__Operacion__OperacionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:589:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
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
                    // InternalLenguajeNaturalReducido.g:590:2: ( 'mayor que' )
                    {
                    // InternalLenguajeNaturalReducido.g:590:2: ( 'mayor que' )
                    // InternalLenguajeNaturalReducido.g:591:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:596:2: ( 'menor que' )
                    {
                    // InternalLenguajeNaturalReducido.g:596:2: ( 'menor que' )
                    // InternalLenguajeNaturalReducido.g:597:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:602:2: ( 'igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:602:2: ( 'igual a' )
                    // InternalLenguajeNaturalReducido.g:603:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:608:2: ( 'mayor o igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:608:2: ( 'mayor o igual a' )
                    // InternalLenguajeNaturalReducido.g:609:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajeNaturalReducido.g:614:2: ( 'menor o igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:614:2: ( 'menor o igual a' )
                    // InternalLenguajeNaturalReducido.g:615:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLenguajeNaturalReducido.g:620:2: ( 'distinto de' )
                    {
                    // InternalLenguajeNaturalReducido.g:620:2: ( 'distinto de' )
                    // InternalLenguajeNaturalReducido.g:621:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:630:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:634:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalLenguajeNaturalReducido.g:635:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
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
    // InternalLenguajeNaturalReducido.g:642:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__EncabezadoAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:646:1: ( ( ( rule__Documento__EncabezadoAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:647:1: ( ( rule__Documento__EncabezadoAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:647:1: ( ( rule__Documento__EncabezadoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:648:2: ( rule__Documento__EncabezadoAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getEncabezadoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:649:2: ( rule__Documento__EncabezadoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:649:3: rule__Documento__EncabezadoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Documento__EncabezadoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentoAccess().getEncabezadoAssignment_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:657:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:661:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalLenguajeNaturalReducido.g:662:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
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
    // InternalLenguajeNaturalReducido.g:669:1: rule__Documento__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:673:1: ( ( ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:674:1: ( ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:674:1: ( ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:675:2: ruleFinOracion
            {
             before(grammarAccess.getDocumentoAccess().getFinOracionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleFinOracion();

            state._fsp--;

             after(grammarAccess.getDocumentoAccess().getFinOracionParserRuleCall_1()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:684:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:688:1: ( rule__Documento__Group__2__Impl )
            // InternalLenguajeNaturalReducido.g:689:2: rule__Documento__Group__2__Impl
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
    // InternalLenguajeNaturalReducido.g:695:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__OracionesAssignment_2 )* ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:699:1: ( ( ( rule__Documento__OracionesAssignment_2 )* ) )
            // InternalLenguajeNaturalReducido.g:700:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            {
            // InternalLenguajeNaturalReducido.g:700:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            // InternalLenguajeNaturalReducido.g:701:2: ( rule__Documento__OracionesAssignment_2 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:702:2: ( rule__Documento__OracionesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||(LA6_0>=18 && LA6_0<=21)||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:702:3: rule__Documento__OracionesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Documento__OracionesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalLenguajeNaturalReducido.g:711:1: rule__Oracion__Group__0 : rule__Oracion__Group__0__Impl rule__Oracion__Group__1 ;
    public final void rule__Oracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:715:1: ( rule__Oracion__Group__0__Impl rule__Oracion__Group__1 )
            // InternalLenguajeNaturalReducido.g:716:2: rule__Oracion__Group__0__Impl rule__Oracion__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalLenguajeNaturalReducido.g:723:1: rule__Oracion__Group__0__Impl : ( ( rule__Oracion__ContenidoAssignment_0 ) ) ;
    public final void rule__Oracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:727:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:728:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:728:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:729:2: ( rule__Oracion__ContenidoAssignment_0 )
            {
             before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:730:2: ( rule__Oracion__ContenidoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:730:3: rule__Oracion__ContenidoAssignment_0
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
    // InternalLenguajeNaturalReducido.g:738:1: rule__Oracion__Group__1 : rule__Oracion__Group__1__Impl ;
    public final void rule__Oracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:742:1: ( rule__Oracion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:743:2: rule__Oracion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:749:1: rule__Oracion__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Oracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:753:1: ( ( ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:754:1: ( ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:754:1: ( ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:755:2: ruleFinOracion
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
    // InternalLenguajeNaturalReducido.g:765:1: rule__Contenido__Group__0 : rule__Contenido__Group__0__Impl rule__Contenido__Group__1 ;
    public final void rule__Contenido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:769:1: ( rule__Contenido__Group__0__Impl rule__Contenido__Group__1 )
            // InternalLenguajeNaturalReducido.g:770:2: rule__Contenido__Group__0__Impl rule__Contenido__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLenguajeNaturalReducido.g:777:1: rule__Contenido__Group__0__Impl : ( ( rule__Contenido__PrefijoAssignment_0 )? ) ;
    public final void rule__Contenido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:781:1: ( ( ( rule__Contenido__PrefijoAssignment_0 )? ) )
            // InternalLenguajeNaturalReducido.g:782:1: ( ( rule__Contenido__PrefijoAssignment_0 )? )
            {
            // InternalLenguajeNaturalReducido.g:782:1: ( ( rule__Contenido__PrefijoAssignment_0 )? )
            // InternalLenguajeNaturalReducido.g:783:2: ( rule__Contenido__PrefijoAssignment_0 )?
            {
             before(grammarAccess.getContenidoAccess().getPrefijoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:784:2: ( rule__Contenido__PrefijoAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:784:3: rule__Contenido__PrefijoAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contenido__PrefijoAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContenidoAccess().getPrefijoAssignment_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:792:1: rule__Contenido__Group__1 : rule__Contenido__Group__1__Impl rule__Contenido__Group__2 ;
    public final void rule__Contenido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:796:1: ( rule__Contenido__Group__1__Impl rule__Contenido__Group__2 )
            // InternalLenguajeNaturalReducido.g:797:2: rule__Contenido__Group__1__Impl rule__Contenido__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Contenido__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__2();

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
    // InternalLenguajeNaturalReducido.g:804:1: rule__Contenido__Group__1__Impl : ( ( rule__Contenido__SimpleAssignment_1 ) ) ;
    public final void rule__Contenido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:808:1: ( ( ( rule__Contenido__SimpleAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:809:1: ( ( rule__Contenido__SimpleAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:809:1: ( ( rule__Contenido__SimpleAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:810:2: ( rule__Contenido__SimpleAssignment_1 )
            {
             before(grammarAccess.getContenidoAccess().getSimpleAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:811:2: ( rule__Contenido__SimpleAssignment_1 )
            // InternalLenguajeNaturalReducido.g:811:3: rule__Contenido__SimpleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__SimpleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getSimpleAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Contenido__Group__2"
    // InternalLenguajeNaturalReducido.g:819:1: rule__Contenido__Group__2 : rule__Contenido__Group__2__Impl ;
    public final void rule__Contenido__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:823:1: ( rule__Contenido__Group__2__Impl )
            // InternalLenguajeNaturalReducido.g:824:2: rule__Contenido__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group__2__Impl();

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
    // $ANTLR end "rule__Contenido__Group__2"


    // $ANTLR start "rule__Contenido__Group__2__Impl"
    // InternalLenguajeNaturalReducido.g:830:1: rule__Contenido__Group__2__Impl : ( ( rule__Contenido__ComposicionAssignment_2 )? ) ;
    public final void rule__Contenido__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:834:1: ( ( ( rule__Contenido__ComposicionAssignment_2 )? ) )
            // InternalLenguajeNaturalReducido.g:835:1: ( ( rule__Contenido__ComposicionAssignment_2 )? )
            {
            // InternalLenguajeNaturalReducido.g:835:1: ( ( rule__Contenido__ComposicionAssignment_2 )? )
            // InternalLenguajeNaturalReducido.g:836:2: ( rule__Contenido__ComposicionAssignment_2 )?
            {
             before(grammarAccess.getContenidoAccess().getComposicionAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:837:2: ( rule__Contenido__ComposicionAssignment_2 )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case 12:
                    {
                    alt8=1;
                    }
                    break;
                case 13:
                    {
                    alt8=1;
                    }
                    break;
                case 14:
                    {
                    alt8=1;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:837:3: rule__Contenido__ComposicionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contenido__ComposicionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContenidoAccess().getComposicionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__Group__2__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalLenguajeNaturalReducido.g:846:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:850:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalLenguajeNaturalReducido.g:851:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
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
    // InternalLenguajeNaturalReducido.g:858:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__Expresion_izqAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:862:1: ( ( ( rule__Simple__Expresion_izqAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:863:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:863:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:864:2: ( rule__Simple__Expresion_izqAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:865:2: ( rule__Simple__Expresion_izqAssignment_0 )
            // InternalLenguajeNaturalReducido.g:865:3: rule__Simple__Expresion_izqAssignment_0
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
    // InternalLenguajeNaturalReducido.g:873:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:877:1: ( rule__Simple__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:878:2: rule__Simple__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__1__Impl();

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
    // InternalLenguajeNaturalReducido.g:884:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__Expresion_derAssignment_1 )? ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:888:1: ( ( ( rule__Simple__Expresion_derAssignment_1 )? ) )
            // InternalLenguajeNaturalReducido.g:889:1: ( ( rule__Simple__Expresion_derAssignment_1 )? )
            {
            // InternalLenguajeNaturalReducido.g:889:1: ( ( rule__Simple__Expresion_derAssignment_1 )? )
            // InternalLenguajeNaturalReducido.g:890:2: ( rule__Simple__Expresion_derAssignment_1 )?
            {
             before(grammarAccess.getSimpleAccess().getExpresion_derAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:891:2: ( rule__Simple__Expresion_derAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:891:3: rule__Simple__Expresion_derAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__Expresion_derAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getExpresion_derAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExpresionDerecha__Group__0"
    // InternalLenguajeNaturalReducido.g:900:1: rule__ExpresionDerecha__Group__0 : rule__ExpresionDerecha__Group__0__Impl rule__ExpresionDerecha__Group__1 ;
    public final void rule__ExpresionDerecha__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:904:1: ( rule__ExpresionDerecha__Group__0__Impl rule__ExpresionDerecha__Group__1 )
            // InternalLenguajeNaturalReducido.g:905:2: rule__ExpresionDerecha__Group__0__Impl rule__ExpresionDerecha__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExpresionDerecha__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionDerecha__Group__1();

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
    // $ANTLR end "rule__ExpresionDerecha__Group__0"


    // $ANTLR start "rule__ExpresionDerecha__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:912:1: rule__ExpresionDerecha__Group__0__Impl : ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) ) ;
    public final void rule__ExpresionDerecha__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:916:1: ( ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:917:1: ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:917:1: ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:918:2: ( rule__ExpresionDerecha__ComparacionAssignment_0 )
            {
             before(grammarAccess.getExpresionDerechaAccess().getComparacionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:919:2: ( rule__ExpresionDerecha__ComparacionAssignment_0 )
            // InternalLenguajeNaturalReducido.g:919:3: rule__ExpresionDerecha__ComparacionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionDerecha__ComparacionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionDerechaAccess().getComparacionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionDerecha__Group__0__Impl"


    // $ANTLR start "rule__ExpresionDerecha__Group__1"
    // InternalLenguajeNaturalReducido.g:927:1: rule__ExpresionDerecha__Group__1 : rule__ExpresionDerecha__Group__1__Impl ;
    public final void rule__ExpresionDerecha__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:931:1: ( rule__ExpresionDerecha__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:932:2: rule__ExpresionDerecha__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionDerecha__Group__1__Impl();

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
    // $ANTLR end "rule__ExpresionDerecha__Group__1"


    // $ANTLR start "rule__ExpresionDerecha__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:938:1: rule__ExpresionDerecha__Group__1__Impl : ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) ) ;
    public final void rule__ExpresionDerecha__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:942:1: ( ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:943:1: ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:943:1: ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:944:2: ( rule__ExpresionDerecha__ExpresionAssignment_1 )
            {
             before(grammarAccess.getExpresionDerechaAccess().getExpresionAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:945:2: ( rule__ExpresionDerecha__ExpresionAssignment_1 )
            // InternalLenguajeNaturalReducido.g:945:3: rule__ExpresionDerecha__ExpresionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionDerecha__ExpresionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionDerechaAccess().getExpresionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionDerecha__Group__1__Impl"


    // $ANTLR start "rule__Composicion__Group__0"
    // InternalLenguajeNaturalReducido.g:954:1: rule__Composicion__Group__0 : rule__Composicion__Group__0__Impl rule__Composicion__Group__1 ;
    public final void rule__Composicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:958:1: ( rule__Composicion__Group__0__Impl rule__Composicion__Group__1 )
            // InternalLenguajeNaturalReducido.g:959:2: rule__Composicion__Group__0__Impl rule__Composicion__Group__1
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
    // InternalLenguajeNaturalReducido.g:966:1: rule__Composicion__Group__0__Impl : ( ( rule__Composicion__NexoAssignment_0 ) ) ;
    public final void rule__Composicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:970:1: ( ( ( rule__Composicion__NexoAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:971:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:971:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:972:2: ( rule__Composicion__NexoAssignment_0 )
            {
             before(grammarAccess.getComposicionAccess().getNexoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:973:2: ( rule__Composicion__NexoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:973:3: rule__Composicion__NexoAssignment_0
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
    // InternalLenguajeNaturalReducido.g:981:1: rule__Composicion__Group__1 : rule__Composicion__Group__1__Impl ;
    public final void rule__Composicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:985:1: ( rule__Composicion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:986:2: rule__Composicion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:992:1: rule__Composicion__Group__1__Impl : ( ( rule__Composicion__ContenidoAssignment_1 ) ) ;
    public final void rule__Composicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:996:1: ( ( ( rule__Composicion__ContenidoAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:997:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:997:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:998:2: ( rule__Composicion__ContenidoAssignment_1 )
            {
             before(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:999:2: ( rule__Composicion__ContenidoAssignment_1 )
            // InternalLenguajeNaturalReducido.g:999:3: rule__Composicion__ContenidoAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1008:1: rule__Comparacion__Group__0 : rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 ;
    public final void rule__Comparacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1012:1: ( rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 )
            // InternalLenguajeNaturalReducido.g:1013:2: rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLenguajeNaturalReducido.g:1020:1: rule__Comparacion__Group__0__Impl : ( ( rule__Comparacion__ObligacionAssignment_0 ) ) ;
    public final void rule__Comparacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1024:1: ( ( ( rule__Comparacion__ObligacionAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1025:1: ( ( rule__Comparacion__ObligacionAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1025:1: ( ( rule__Comparacion__ObligacionAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1026:2: ( rule__Comparacion__ObligacionAssignment_0 )
            {
             before(grammarAccess.getComparacionAccess().getObligacionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1027:2: ( rule__Comparacion__ObligacionAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1027:3: rule__Comparacion__ObligacionAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1035:1: rule__Comparacion__Group__1 : rule__Comparacion__Group__1__Impl ;
    public final void rule__Comparacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1039:1: ( rule__Comparacion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1040:2: rule__Comparacion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:1046:1: rule__Comparacion__Group__1__Impl : ( ( rule__Comparacion__OperacionAssignment_1 ) ) ;
    public final void rule__Comparacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1050:1: ( ( ( rule__Comparacion__OperacionAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1051:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1051:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1052:2: ( rule__Comparacion__OperacionAssignment_1 )
            {
             before(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1053:2: ( rule__Comparacion__OperacionAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1053:3: rule__Comparacion__OperacionAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1062:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1066:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // InternalLenguajeNaturalReducido.g:1067:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLenguajeNaturalReducido.g:1074:1: rule__Propiedad__Group__0__Impl : ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1078:1: ( ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) )
            // InternalLenguajeNaturalReducido.g:1079:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            {
            // InternalLenguajeNaturalReducido.g:1079:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            // InternalLenguajeNaturalReducido.g:1080:2: ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* )
            {
            // InternalLenguajeNaturalReducido.g:1080:2: ( ( rule__Propiedad__AtributoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1081:3: ( rule__Propiedad__AtributoAssignment_0 )
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1082:3: ( rule__Propiedad__AtributoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1082:4: rule__Propiedad__AtributoAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Propiedad__AtributoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 

            }

            // InternalLenguajeNaturalReducido.g:1085:2: ( ( rule__Propiedad__AtributoAssignment_0 )* )
            // InternalLenguajeNaturalReducido.g:1086:3: ( rule__Propiedad__AtributoAssignment_0 )*
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1087:3: ( rule__Propiedad__AtributoAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:1087:4: rule__Propiedad__AtributoAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Propiedad__AtributoAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalLenguajeNaturalReducido.g:1096:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1100:1: ( rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 )
            // InternalLenguajeNaturalReducido.g:1101:2: rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Propiedad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__2();

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
    // InternalLenguajeNaturalReducido.g:1108:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__TerminoAssignment_1 )? ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1112:1: ( ( ( rule__Propiedad__TerminoAssignment_1 )? ) )
            // InternalLenguajeNaturalReducido.g:1113:1: ( ( rule__Propiedad__TerminoAssignment_1 )? )
            {
            // InternalLenguajeNaturalReducido.g:1113:1: ( ( rule__Propiedad__TerminoAssignment_1 )? )
            // InternalLenguajeNaturalReducido.g:1114:2: ( rule__Propiedad__TerminoAssignment_1 )?
            {
             before(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1115:2: ( rule__Propiedad__TerminoAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:1115:3: rule__Propiedad__TerminoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Propiedad__TerminoAssignment_1();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "rule__Propiedad__Group__2"
    // InternalLenguajeNaturalReducido.g:1123:1: rule__Propiedad__Group__2 : rule__Propiedad__Group__2__Impl ;
    public final void rule__Propiedad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1127:1: ( rule__Propiedad__Group__2__Impl )
            // InternalLenguajeNaturalReducido.g:1128:2: rule__Propiedad__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__2__Impl();

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
    // $ANTLR end "rule__Propiedad__Group__2"


    // $ANTLR start "rule__Propiedad__Group__2__Impl"
    // InternalLenguajeNaturalReducido.g:1134:1: rule__Propiedad__Group__2__Impl : ( ( rule__Propiedad__IteracionAssignment_2 )* ) ;
    public final void rule__Propiedad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1138:1: ( ( ( rule__Propiedad__IteracionAssignment_2 )* ) )
            // InternalLenguajeNaturalReducido.g:1139:1: ( ( rule__Propiedad__IteracionAssignment_2 )* )
            {
            // InternalLenguajeNaturalReducido.g:1139:1: ( ( rule__Propiedad__IteracionAssignment_2 )* )
            // InternalLenguajeNaturalReducido.g:1140:2: ( rule__Propiedad__IteracionAssignment_2 )*
            {
             before(grammarAccess.getPropiedadAccess().getIteracionAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:1141:2: ( rule__Propiedad__IteracionAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt12=1;
                    }
                    break;
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                case 17:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:1141:3: rule__Propiedad__IteracionAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Propiedad__IteracionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPropiedadAccess().getIteracionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__2__Impl"


    // $ANTLR start "rule__Iteracion__Group__0"
    // InternalLenguajeNaturalReducido.g:1150:1: rule__Iteracion__Group__0 : rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1 ;
    public final void rule__Iteracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1154:1: ( rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1 )
            // InternalLenguajeNaturalReducido.g:1155:2: rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Iteracion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__1();

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
    // $ANTLR end "rule__Iteracion__Group__0"


    // $ANTLR start "rule__Iteracion__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:1162:1: rule__Iteracion__Group__0__Impl : ( ( rule__Iteracion__ConectorAssignment_0 ) ) ;
    public final void rule__Iteracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1166:1: ( ( ( rule__Iteracion__ConectorAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1167:1: ( ( rule__Iteracion__ConectorAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1167:1: ( ( rule__Iteracion__ConectorAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1168:2: ( rule__Iteracion__ConectorAssignment_0 )
            {
             before(grammarAccess.getIteracionAccess().getConectorAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1169:2: ( rule__Iteracion__ConectorAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1169:3: rule__Iteracion__ConectorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__ConectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getConectorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__Group__0__Impl"


    // $ANTLR start "rule__Iteracion__Group__1"
    // InternalLenguajeNaturalReducido.g:1177:1: rule__Iteracion__Group__1 : rule__Iteracion__Group__1__Impl ;
    public final void rule__Iteracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1181:1: ( rule__Iteracion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1182:2: rule__Iteracion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__1__Impl();

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
    // $ANTLR end "rule__Iteracion__Group__1"


    // $ANTLR start "rule__Iteracion__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:1188:1: rule__Iteracion__Group__1__Impl : ( ( rule__Iteracion__ContenidoAssignment_1 ) ) ;
    public final void rule__Iteracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1192:1: ( ( ( rule__Iteracion__ContenidoAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1193:1: ( ( rule__Iteracion__ContenidoAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1193:1: ( ( rule__Iteracion__ContenidoAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1194:2: ( rule__Iteracion__ContenidoAssignment_1 )
            {
             before(grammarAccess.getIteracionAccess().getContenidoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1195:2: ( rule__Iteracion__ContenidoAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1195:3: rule__Iteracion__ContenidoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__ContenidoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getContenidoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalLenguajeNaturalReducido.g:1204:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1208:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalLenguajeNaturalReducido.g:1209:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
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
    // InternalLenguajeNaturalReducido.g:1216:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__DeterminanteAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1220:1: ( ( ( rule__Atributo__DeterminanteAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1221:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1221:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1222:2: ( rule__Atributo__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1223:2: ( rule__Atributo__DeterminanteAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1223:3: rule__Atributo__DeterminanteAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1231:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1235:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalLenguajeNaturalReducido.g:1236:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
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
    // InternalLenguajeNaturalReducido.g:1243:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__PrefijoAssignment_1 )? ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1247:1: ( ( ( rule__Atributo__PrefijoAssignment_1 )? ) )
            // InternalLenguajeNaturalReducido.g:1248:1: ( ( rule__Atributo__PrefijoAssignment_1 )? )
            {
            // InternalLenguajeNaturalReducido.g:1248:1: ( ( rule__Atributo__PrefijoAssignment_1 )? )
            // InternalLenguajeNaturalReducido.g:1249:2: ( rule__Atributo__PrefijoAssignment_1 )?
            {
             before(grammarAccess.getAtributoAccess().getPrefijoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1250:2: ( rule__Atributo__PrefijoAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:1250:3: rule__Atributo__PrefijoAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1258:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1262:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // InternalLenguajeNaturalReducido.g:1263:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
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
    // InternalLenguajeNaturalReducido.g:1270:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NombreAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1274:1: ( ( ( rule__Atributo__NombreAssignment_2 ) ) )
            // InternalLenguajeNaturalReducido.g:1275:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            {
            // InternalLenguajeNaturalReducido.g:1275:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            // InternalLenguajeNaturalReducido.g:1276:2: ( rule__Atributo__NombreAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:1277:2: ( rule__Atributo__NombreAssignment_2 )
            // InternalLenguajeNaturalReducido.g:1277:3: rule__Atributo__NombreAssignment_2
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
    // InternalLenguajeNaturalReducido.g:1285:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1289:1: ( rule__Atributo__Group__3__Impl )
            // InternalLenguajeNaturalReducido.g:1290:2: rule__Atributo__Group__3__Impl
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
    // InternalLenguajeNaturalReducido.g:1296:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__EnlaceAssignment_3 ) ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1300:1: ( ( ( rule__Atributo__EnlaceAssignment_3 ) ) )
            // InternalLenguajeNaturalReducido.g:1301:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            {
            // InternalLenguajeNaturalReducido.g:1301:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            // InternalLenguajeNaturalReducido.g:1302:2: ( rule__Atributo__EnlaceAssignment_3 )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); 
            // InternalLenguajeNaturalReducido.g:1303:2: ( rule__Atributo__EnlaceAssignment_3 )
            // InternalLenguajeNaturalReducido.g:1303:3: rule__Atributo__EnlaceAssignment_3
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
    // InternalLenguajeNaturalReducido.g:1312:1: rule__Termino__Group__0 : rule__Termino__Group__0__Impl rule__Termino__Group__1 ;
    public final void rule__Termino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1316:1: ( rule__Termino__Group__0__Impl rule__Termino__Group__1 )
            // InternalLenguajeNaturalReducido.g:1317:2: rule__Termino__Group__0__Impl rule__Termino__Group__1
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
    // InternalLenguajeNaturalReducido.g:1324:1: rule__Termino__Group__0__Impl : ( ( rule__Termino__IndeterminanteAssignment_0 ) ) ;
    public final void rule__Termino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1328:1: ( ( ( rule__Termino__IndeterminanteAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1329:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1329:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1330:2: ( rule__Termino__IndeterminanteAssignment_0 )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1331:2: ( rule__Termino__IndeterminanteAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1331:3: rule__Termino__IndeterminanteAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1339:1: rule__Termino__Group__1 : rule__Termino__Group__1__Impl ;
    public final void rule__Termino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1343:1: ( rule__Termino__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1344:2: rule__Termino__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:1350:1: rule__Termino__Group__1__Impl : ( ( rule__Termino__ContextoAssignment_1 ) ) ;
    public final void rule__Termino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1354:1: ( ( ( rule__Termino__ContextoAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1355:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1355:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1356:2: ( rule__Termino__ContextoAssignment_1 )
            {
             before(grammarAccess.getTerminoAccess().getContextoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1357:2: ( rule__Termino__ContextoAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1357:3: rule__Termino__ContextoAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1366:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1370:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalLenguajeNaturalReducido.g:1371:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalLenguajeNaturalReducido.g:1378:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1382:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalLenguajeNaturalReducido.g:1383:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalLenguajeNaturalReducido.g:1383:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalLenguajeNaturalReducido.g:1384:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1385:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:1385:3: rule__Obligacion__NegacionAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1393:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1397:1: ( rule__Obligacion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1398:2: rule__Obligacion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:1404:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1408:1: ( ( ( rule__Obligacion__ObligacionAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1409:1: ( ( rule__Obligacion__ObligacionAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1409:1: ( ( rule__Obligacion__ObligacionAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1410:2: ( rule__Obligacion__ObligacionAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1411:2: ( rule__Obligacion__ObligacionAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1411:3: rule__Obligacion__ObligacionAssignment_1
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


    // $ANTLR start "rule__Documento__EncabezadoAssignment_0"
    // InternalLenguajeNaturalReducido.g:1420:1: rule__Documento__EncabezadoAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Documento__EncabezadoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1424:1: ( ( RULE_STRING ) )
            // InternalLenguajeNaturalReducido.g:1425:2: ( RULE_STRING )
            {
            // InternalLenguajeNaturalReducido.g:1425:2: ( RULE_STRING )
            // InternalLenguajeNaturalReducido.g:1426:3: RULE_STRING
            {
             before(grammarAccess.getDocumentoAccess().getEncabezadoSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentoAccess().getEncabezadoSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documento__EncabezadoAssignment_0"


    // $ANTLR start "rule__Documento__OracionesAssignment_2"
    // InternalLenguajeNaturalReducido.g:1435:1: rule__Documento__OracionesAssignment_2 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1439:1: ( ( ruleOracion ) )
            // InternalLenguajeNaturalReducido.g:1440:2: ( ruleOracion )
            {
            // InternalLenguajeNaturalReducido.g:1440:2: ( ruleOracion )
            // InternalLenguajeNaturalReducido.g:1441:3: ruleOracion
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
    // InternalLenguajeNaturalReducido.g:1450:1: rule__Oracion__ContenidoAssignment_0 : ( ruleContenido ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1454:1: ( ( ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:1455:2: ( ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:1455:2: ( ruleContenido )
            // InternalLenguajeNaturalReducido.g:1456:3: ruleContenido
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


    // $ANTLR start "rule__Contenido__PrefijoAssignment_0"
    // InternalLenguajeNaturalReducido.g:1465:1: rule__Contenido__PrefijoAssignment_0 : ( ( 'si' ) ) ;
    public final void rule__Contenido__PrefijoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1469:1: ( ( ( 'si' ) ) )
            // InternalLenguajeNaturalReducido.g:1470:2: ( ( 'si' ) )
            {
            // InternalLenguajeNaturalReducido.g:1470:2: ( ( 'si' ) )
            // InternalLenguajeNaturalReducido.g:1471:3: ( 'si' )
            {
             before(grammarAccess.getContenidoAccess().getPrefijoSiKeyword_0_0()); 
            // InternalLenguajeNaturalReducido.g:1472:3: ( 'si' )
            // InternalLenguajeNaturalReducido.g:1473:4: 'si'
            {
             before(grammarAccess.getContenidoAccess().getPrefijoSiKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getPrefijoSiKeyword_0_0()); 

            }

             after(grammarAccess.getContenidoAccess().getPrefijoSiKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__PrefijoAssignment_0"


    // $ANTLR start "rule__Contenido__SimpleAssignment_1"
    // InternalLenguajeNaturalReducido.g:1484:1: rule__Contenido__SimpleAssignment_1 : ( ruleSimple ) ;
    public final void rule__Contenido__SimpleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1488:1: ( ( ruleSimple ) )
            // InternalLenguajeNaturalReducido.g:1489:2: ( ruleSimple )
            {
            // InternalLenguajeNaturalReducido.g:1489:2: ( ruleSimple )
            // InternalLenguajeNaturalReducido.g:1490:3: ruleSimple
            {
             before(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__SimpleAssignment_1"


    // $ANTLR start "rule__Contenido__ComposicionAssignment_2"
    // InternalLenguajeNaturalReducido.g:1499:1: rule__Contenido__ComposicionAssignment_2 : ( ruleComposicion ) ;
    public final void rule__Contenido__ComposicionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1503:1: ( ( ruleComposicion ) )
            // InternalLenguajeNaturalReducido.g:1504:2: ( ruleComposicion )
            {
            // InternalLenguajeNaturalReducido.g:1504:2: ( ruleComposicion )
            // InternalLenguajeNaturalReducido.g:1505:3: ruleComposicion
            {
             before(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComposicion();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getComposicionComposicionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__ComposicionAssignment_2"


    // $ANTLR start "rule__Simple__Expresion_izqAssignment_0"
    // InternalLenguajeNaturalReducido.g:1514:1: rule__Simple__Expresion_izqAssignment_0 : ( ruleExpresion ) ;
    public final void rule__Simple__Expresion_izqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1518:1: ( ( ruleExpresion ) )
            // InternalLenguajeNaturalReducido.g:1519:2: ( ruleExpresion )
            {
            // InternalLenguajeNaturalReducido.g:1519:2: ( ruleExpresion )
            // InternalLenguajeNaturalReducido.g:1520:3: ruleExpresion
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


    // $ANTLR start "rule__Simple__Expresion_derAssignment_1"
    // InternalLenguajeNaturalReducido.g:1529:1: rule__Simple__Expresion_derAssignment_1 : ( ruleExpresionDerecha ) ;
    public final void rule__Simple__Expresion_derAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1533:1: ( ( ruleExpresionDerecha ) )
            // InternalLenguajeNaturalReducido.g:1534:2: ( ruleExpresionDerecha )
            {
            // InternalLenguajeNaturalReducido.g:1534:2: ( ruleExpresionDerecha )
            // InternalLenguajeNaturalReducido.g:1535:3: ruleExpresionDerecha
            {
             before(grammarAccess.getSimpleAccess().getExpresion_derExpresionDerechaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionDerecha();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getExpresion_derExpresionDerechaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Expresion_derAssignment_1"


    // $ANTLR start "rule__ExpresionDerecha__ComparacionAssignment_0"
    // InternalLenguajeNaturalReducido.g:1544:1: rule__ExpresionDerecha__ComparacionAssignment_0 : ( ruleComparacion ) ;
    public final void rule__ExpresionDerecha__ComparacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1548:1: ( ( ruleComparacion ) )
            // InternalLenguajeNaturalReducido.g:1549:2: ( ruleComparacion )
            {
            // InternalLenguajeNaturalReducido.g:1549:2: ( ruleComparacion )
            // InternalLenguajeNaturalReducido.g:1550:3: ruleComparacion
            {
             before(grammarAccess.getExpresionDerechaAccess().getComparacionComparacionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComparacion();

            state._fsp--;

             after(grammarAccess.getExpresionDerechaAccess().getComparacionComparacionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionDerecha__ComparacionAssignment_0"


    // $ANTLR start "rule__ExpresionDerecha__ExpresionAssignment_1"
    // InternalLenguajeNaturalReducido.g:1559:1: rule__ExpresionDerecha__ExpresionAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionDerecha__ExpresionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1563:1: ( ( ruleExpresion ) )
            // InternalLenguajeNaturalReducido.g:1564:2: ( ruleExpresion )
            {
            // InternalLenguajeNaturalReducido.g:1564:2: ( ruleExpresion )
            // InternalLenguajeNaturalReducido.g:1565:3: ruleExpresion
            {
             before(grammarAccess.getExpresionDerechaAccess().getExpresionExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionDerechaAccess().getExpresionExpresionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionDerecha__ExpresionAssignment_1"


    // $ANTLR start "rule__Composicion__NexoAssignment_0"
    // InternalLenguajeNaturalReducido.g:1574:1: rule__Composicion__NexoAssignment_0 : ( ruleNexo ) ;
    public final void rule__Composicion__NexoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1578:1: ( ( ruleNexo ) )
            // InternalLenguajeNaturalReducido.g:1579:2: ( ruleNexo )
            {
            // InternalLenguajeNaturalReducido.g:1579:2: ( ruleNexo )
            // InternalLenguajeNaturalReducido.g:1580:3: ruleNexo
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
    // InternalLenguajeNaturalReducido.g:1589:1: rule__Composicion__ContenidoAssignment_1 : ( ruleContenido ) ;
    public final void rule__Composicion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1593:1: ( ( ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:1594:2: ( ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:1594:2: ( ruleContenido )
            // InternalLenguajeNaturalReducido.g:1595:3: ruleContenido
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
    // InternalLenguajeNaturalReducido.g:1604:1: rule__Nexo__ValorAssignment : ( ( rule__Nexo__ValorAlternatives_0 ) ) ;
    public final void rule__Nexo__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1608:1: ( ( ( rule__Nexo__ValorAlternatives_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1609:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1609:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            // InternalLenguajeNaturalReducido.g:1610:3: ( rule__Nexo__ValorAlternatives_0 )
            {
             before(grammarAccess.getNexoAccess().getValorAlternatives_0()); 
            // InternalLenguajeNaturalReducido.g:1611:3: ( rule__Nexo__ValorAlternatives_0 )
            // InternalLenguajeNaturalReducido.g:1611:4: rule__Nexo__ValorAlternatives_0
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
    // InternalLenguajeNaturalReducido.g:1619:1: rule__Expresion__ExpresionAssignment : ( ( rule__Expresion__ExpresionAlternatives_0 ) ) ;
    public final void rule__Expresion__ExpresionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1623:1: ( ( ( rule__Expresion__ExpresionAlternatives_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1624:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1624:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            // InternalLenguajeNaturalReducido.g:1625:3: ( rule__Expresion__ExpresionAlternatives_0 )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); 
            // InternalLenguajeNaturalReducido.g:1626:3: ( rule__Expresion__ExpresionAlternatives_0 )
            // InternalLenguajeNaturalReducido.g:1626:4: rule__Expresion__ExpresionAlternatives_0
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
    // InternalLenguajeNaturalReducido.g:1634:1: rule__Comparacion__ObligacionAssignment_0 : ( ruleObligacion ) ;
    public final void rule__Comparacion__ObligacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1638:1: ( ( ruleObligacion ) )
            // InternalLenguajeNaturalReducido.g:1639:2: ( ruleObligacion )
            {
            // InternalLenguajeNaturalReducido.g:1639:2: ( ruleObligacion )
            // InternalLenguajeNaturalReducido.g:1640:3: ruleObligacion
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
    // InternalLenguajeNaturalReducido.g:1649:1: rule__Comparacion__OperacionAssignment_1 : ( ruleOperacion ) ;
    public final void rule__Comparacion__OperacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1653:1: ( ( ruleOperacion ) )
            // InternalLenguajeNaturalReducido.g:1654:2: ( ruleOperacion )
            {
            // InternalLenguajeNaturalReducido.g:1654:2: ( ruleOperacion )
            // InternalLenguajeNaturalReducido.g:1655:3: ruleOperacion
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
    // InternalLenguajeNaturalReducido.g:1664:1: rule__Propiedad__AtributoAssignment_0 : ( ruleAtributo ) ;
    public final void rule__Propiedad__AtributoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1668:1: ( ( ruleAtributo ) )
            // InternalLenguajeNaturalReducido.g:1669:2: ( ruleAtributo )
            {
            // InternalLenguajeNaturalReducido.g:1669:2: ( ruleAtributo )
            // InternalLenguajeNaturalReducido.g:1670:3: ruleAtributo
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
    // InternalLenguajeNaturalReducido.g:1679:1: rule__Propiedad__TerminoAssignment_1 : ( ruleTermino ) ;
    public final void rule__Propiedad__TerminoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1683:1: ( ( ruleTermino ) )
            // InternalLenguajeNaturalReducido.g:1684:2: ( ruleTermino )
            {
            // InternalLenguajeNaturalReducido.g:1684:2: ( ruleTermino )
            // InternalLenguajeNaturalReducido.g:1685:3: ruleTermino
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


    // $ANTLR start "rule__Propiedad__IteracionAssignment_2"
    // InternalLenguajeNaturalReducido.g:1694:1: rule__Propiedad__IteracionAssignment_2 : ( ruleIteracion ) ;
    public final void rule__Propiedad__IteracionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1698:1: ( ( ruleIteracion ) )
            // InternalLenguajeNaturalReducido.g:1699:2: ( ruleIteracion )
            {
            // InternalLenguajeNaturalReducido.g:1699:2: ( ruleIteracion )
            // InternalLenguajeNaturalReducido.g:1700:3: ruleIteracion
            {
             before(grammarAccess.getPropiedadAccess().getIteracionIteracionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIteracion();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getIteracionIteracionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__IteracionAssignment_2"


    // $ANTLR start "rule__Iteracion__ConectorAssignment_0"
    // InternalLenguajeNaturalReducido.g:1709:1: rule__Iteracion__ConectorAssignment_0 : ( ( rule__Iteracion__ConectorAlternatives_0_0 ) ) ;
    public final void rule__Iteracion__ConectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1713:1: ( ( ( rule__Iteracion__ConectorAlternatives_0_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1714:2: ( ( rule__Iteracion__ConectorAlternatives_0_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1714:2: ( ( rule__Iteracion__ConectorAlternatives_0_0 ) )
            // InternalLenguajeNaturalReducido.g:1715:3: ( rule__Iteracion__ConectorAlternatives_0_0 )
            {
             before(grammarAccess.getIteracionAccess().getConectorAlternatives_0_0()); 
            // InternalLenguajeNaturalReducido.g:1716:3: ( rule__Iteracion__ConectorAlternatives_0_0 )
            // InternalLenguajeNaturalReducido.g:1716:4: rule__Iteracion__ConectorAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__ConectorAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getConectorAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__ConectorAssignment_0"


    // $ANTLR start "rule__Iteracion__ContenidoAssignment_1"
    // InternalLenguajeNaturalReducido.g:1724:1: rule__Iteracion__ContenidoAssignment_1 : ( ruleContenido ) ;
    public final void rule__Iteracion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1728:1: ( ( ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:1729:2: ( ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:1729:2: ( ruleContenido )
            // InternalLenguajeNaturalReducido.g:1730:3: ruleContenido
            {
             before(grammarAccess.getIteracionAccess().getContenidoContenidoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getIteracionAccess().getContenidoContenidoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__ContenidoAssignment_1"


    // $ANTLR start "rule__Atributo__DeterminanteAssignment_0"
    // InternalLenguajeNaturalReducido.g:1739:1: rule__Atributo__DeterminanteAssignment_0 : ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) ) ;
    public final void rule__Atributo__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1743:1: ( ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1744:2: ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1744:2: ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) )
            // InternalLenguajeNaturalReducido.g:1745:3: ( rule__Atributo__DeterminanteAlternatives_0_0 )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteAlternatives_0_0()); 
            // InternalLenguajeNaturalReducido.g:1746:3: ( rule__Atributo__DeterminanteAlternatives_0_0 )
            // InternalLenguajeNaturalReducido.g:1746:4: rule__Atributo__DeterminanteAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__DeterminanteAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getDeterminanteAlternatives_0_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:1754:1: rule__Atributo__PrefijoAssignment_1 : ( ( 'cantidad de' ) ) ;
    public final void rule__Atributo__PrefijoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1758:1: ( ( ( 'cantidad de' ) ) )
            // InternalLenguajeNaturalReducido.g:1759:2: ( ( 'cantidad de' ) )
            {
            // InternalLenguajeNaturalReducido.g:1759:2: ( ( 'cantidad de' ) )
            // InternalLenguajeNaturalReducido.g:1760:3: ( 'cantidad de' )
            {
             before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); 
            // InternalLenguajeNaturalReducido.g:1761:3: ( 'cantidad de' )
            // InternalLenguajeNaturalReducido.g:1762:4: 'cantidad de'
            {
             before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:1773:1: rule__Atributo__NombreAssignment_2 : ( RULE_ID ) ;
    public final void rule__Atributo__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1777:1: ( ( RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:1778:2: ( RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:1778:2: ( RULE_ID )
            // InternalLenguajeNaturalReducido.g:1779:3: RULE_ID
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
    // InternalLenguajeNaturalReducido.g:1788:1: rule__Atributo__EnlaceAssignment_3 : ( ( 'de' ) ) ;
    public final void rule__Atributo__EnlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1792:1: ( ( ( 'de' ) ) )
            // InternalLenguajeNaturalReducido.g:1793:2: ( ( 'de' ) )
            {
            // InternalLenguajeNaturalReducido.g:1793:2: ( ( 'de' ) )
            // InternalLenguajeNaturalReducido.g:1794:3: ( 'de' )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            // InternalLenguajeNaturalReducido.g:1795:3: ( 'de' )
            // InternalLenguajeNaturalReducido.g:1796:4: 'de'
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:1807:1: rule__Termino__IndeterminanteAssignment_0 : ( ( 'un/una' ) ) ;
    public final void rule__Termino__IndeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1811:1: ( ( ( 'un/una' ) ) )
            // InternalLenguajeNaturalReducido.g:1812:2: ( ( 'un/una' ) )
            {
            // InternalLenguajeNaturalReducido.g:1812:2: ( ( 'un/una' ) )
            // InternalLenguajeNaturalReducido.g:1813:3: ( 'un/una' )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            // InternalLenguajeNaturalReducido.g:1814:3: ( 'un/una' )
            // InternalLenguajeNaturalReducido.g:1815:4: 'un/una'
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:1826:1: rule__Termino__ContextoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Termino__ContextoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1830:1: ( ( RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:1831:2: ( RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:1831:2: ( RULE_ID )
            // InternalLenguajeNaturalReducido.g:1832:3: RULE_ID
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
    // InternalLenguajeNaturalReducido.g:1841:1: rule__Obligacion__NegacionAssignment_0 : ( ( 'no' ) ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1845:1: ( ( ( 'no' ) ) )
            // InternalLenguajeNaturalReducido.g:1846:2: ( ( 'no' ) )
            {
            // InternalLenguajeNaturalReducido.g:1846:2: ( ( 'no' ) )
            // InternalLenguajeNaturalReducido.g:1847:3: ( 'no' )
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            // InternalLenguajeNaturalReducido.g:1848:3: ( 'no' )
            // InternalLenguajeNaturalReducido.g:1849:4: 'no'
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:1860:1: rule__Obligacion__ObligacionAssignment_1 : ( ( 'es' ) ) ;
    public final void rule__Obligacion__ObligacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1864:1: ( ( ( 'es' ) ) )
            // InternalLenguajeNaturalReducido.g:1865:2: ( ( 'es' ) )
            {
            // InternalLenguajeNaturalReducido.g:1865:2: ( ( 'es' ) )
            // InternalLenguajeNaturalReducido.g:1866:3: ( 'es' )
            {
             before(grammarAccess.getObligacionAccess().getObligacionEsKeyword_1_0()); 
            // InternalLenguajeNaturalReducido.g:1867:3: ( 'es' )
            // InternalLenguajeNaturalReducido.g:1868:4: 'es'
            {
             before(grammarAccess.getObligacionAccess().getObligacionEsKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getObligacionAccess().getObligacionEsKeyword_1_0()); 

            }

             after(grammarAccess.getObligacionAccess().getObligacionEsKeyword_1_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:1879:1: rule__Operacion__OperacionAssignment : ( ( rule__Operacion__OperacionAlternatives_0 ) ) ;
    public final void rule__Operacion__OperacionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1883:1: ( ( ( rule__Operacion__OperacionAlternatives_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1884:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1884:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            // InternalLenguajeNaturalReducido.g:1885:3: ( rule__Operacion__OperacionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); 
            // InternalLenguajeNaturalReducido.g:1886:3: ( rule__Operacion__OperacionAlternatives_0 )
            // InternalLenguajeNaturalReducido.g:1886:4: rule__Operacion__OperacionAlternatives_0
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
    // InternalLenguajeNaturalReducido.g:1894:1: rule__Literal__ValorAssignment : ( RULE_STRING ) ;
    public final void rule__Literal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1898:1: ( ( RULE_STRING ) )
            // InternalLenguajeNaturalReducido.g:1899:2: ( RULE_STRING )
            {
            // InternalLenguajeNaturalReducido.g:1899:2: ( RULE_STRING )
            // InternalLenguajeNaturalReducido.g:1900:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000103C0010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000103C0012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080038000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}