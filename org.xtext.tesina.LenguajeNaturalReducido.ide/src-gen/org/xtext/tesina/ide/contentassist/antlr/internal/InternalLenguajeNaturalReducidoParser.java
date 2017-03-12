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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'y'", "'o'", "'entonces'", "'tal que'", "'satisfacen que'", "'existe uno/una tal que'", "'el/la'", "'todos los/las'", "'entre los/las'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'si'", "'cantidad de'", "'de'", "'un/una'", "'no'", "'es'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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
    // InternalLenguajeNaturalReducido.g:237:1: ruleNexo : ( ( rule__Nexo__NexoAssignment ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:241:2: ( ( ( rule__Nexo__NexoAssignment ) ) )
            // InternalLenguajeNaturalReducido.g:242:2: ( ( rule__Nexo__NexoAssignment ) )
            {
            // InternalLenguajeNaturalReducido.g:242:2: ( ( rule__Nexo__NexoAssignment ) )
            // InternalLenguajeNaturalReducido.g:243:3: ( rule__Nexo__NexoAssignment )
            {
             before(grammarAccess.getNexoAccess().getNexoAssignment()); 
            // InternalLenguajeNaturalReducido.g:244:3: ( rule__Nexo__NexoAssignment )
            // InternalLenguajeNaturalReducido.g:244:4: rule__Nexo__NexoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__NexoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getNexoAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAfirmacion"
    // InternalLenguajeNaturalReducido.g:403:1: entryRuleAfirmacion : ruleAfirmacion EOF ;
    public final void entryRuleAfirmacion() throws RecognitionException {
        try {
            // InternalLenguajeNaturalReducido.g:404:1: ( ruleAfirmacion EOF )
            // InternalLenguajeNaturalReducido.g:405:1: ruleAfirmacion EOF
            {
             before(grammarAccess.getAfirmacionRule()); 
            pushFollow(FOLLOW_1);
            ruleAfirmacion();

            state._fsp--;

             after(grammarAccess.getAfirmacionRule()); 
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
    // $ANTLR end "entryRuleAfirmacion"


    // $ANTLR start "ruleAfirmacion"
    // InternalLenguajeNaturalReducido.g:412:1: ruleAfirmacion : ( ( rule__Afirmacion__Group__0 ) ) ;
    public final void ruleAfirmacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:416:2: ( ( ( rule__Afirmacion__Group__0 ) ) )
            // InternalLenguajeNaturalReducido.g:417:2: ( ( rule__Afirmacion__Group__0 ) )
            {
            // InternalLenguajeNaturalReducido.g:417:2: ( ( rule__Afirmacion__Group__0 ) )
            // InternalLenguajeNaturalReducido.g:418:3: ( rule__Afirmacion__Group__0 )
            {
             before(grammarAccess.getAfirmacionAccess().getGroup()); 
            // InternalLenguajeNaturalReducido.g:419:3: ( rule__Afirmacion__Group__0 )
            // InternalLenguajeNaturalReducido.g:419:4: rule__Afirmacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Afirmacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfirmacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAfirmacion"


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
    // InternalLenguajeNaturalReducido.g:462:1: ruleLiteral : ( ( rule__Literal__LiteralAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:466:2: ( ( ( rule__Literal__LiteralAssignment ) ) )
            // InternalLenguajeNaturalReducido.g:467:2: ( ( rule__Literal__LiteralAssignment ) )
            {
            // InternalLenguajeNaturalReducido.g:467:2: ( ( rule__Literal__LiteralAssignment ) )
            // InternalLenguajeNaturalReducido.g:468:3: ( rule__Literal__LiteralAssignment )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment()); 
            // InternalLenguajeNaturalReducido.g:469:3: ( rule__Literal__LiteralAssignment )
            // InternalLenguajeNaturalReducido.g:469:4: rule__Literal__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Literal__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment()); 

            }


            }

        }
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


    // $ANTLR start "rule__Nexo__NexoAlternatives_0"
    // InternalLenguajeNaturalReducido.g:477:1: rule__Nexo__NexoAlternatives_0 : ( ( 'y' ) | ( 'o' ) | ( 'entonces' ) );
    public final void rule__Nexo__NexoAlternatives_0() throws RecognitionException {

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
                     before(grammarAccess.getNexoAccess().getNexoYKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getNexoYKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:488:2: ( 'o' )
                    {
                    // InternalLenguajeNaturalReducido.g:488:2: ( 'o' )
                    // InternalLenguajeNaturalReducido.g:489:3: 'o'
                    {
                     before(grammarAccess.getNexoAccess().getNexoOKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getNexoOKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:494:2: ( 'entonces' )
                    {
                    // InternalLenguajeNaturalReducido.g:494:2: ( 'entonces' )
                    // InternalLenguajeNaturalReducido.g:495:3: 'entonces'
                    {
                     before(grammarAccess.getNexoAccess().getNexoEntoncesKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNexoAccess().getNexoEntoncesKeyword_0_2()); 

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
    // $ANTLR end "rule__Nexo__NexoAlternatives_0"


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
            else if ( ((LA2_0>=18 && LA2_0<=20)) ) {
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


    // $ANTLR start "rule__Iteracion__CondicionAlternatives_0_0"
    // InternalLenguajeNaturalReducido.g:525:1: rule__Iteracion__CondicionAlternatives_0_0 : ( ( 'tal que' ) | ( 'satisfacen que' ) | ( 'existe uno/una tal que' ) );
    public final void rule__Iteracion__CondicionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:529:1: ( ( 'tal que' ) | ( 'satisfacen que' ) | ( 'existe uno/una tal que' ) )
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
                     before(grammarAccess.getIteracionAccess().getCondicionTalQueKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIteracionAccess().getCondicionTalQueKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:536:2: ( 'satisfacen que' )
                    {
                    // InternalLenguajeNaturalReducido.g:536:2: ( 'satisfacen que' )
                    // InternalLenguajeNaturalReducido.g:537:3: 'satisfacen que'
                    {
                     before(grammarAccess.getIteracionAccess().getCondicionSatisfacenQueKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIteracionAccess().getCondicionSatisfacenQueKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:542:2: ( 'existe uno/una tal que' )
                    {
                    // InternalLenguajeNaturalReducido.g:542:2: ( 'existe uno/una tal que' )
                    // InternalLenguajeNaturalReducido.g:543:3: 'existe uno/una tal que'
                    {
                     before(grammarAccess.getIteracionAccess().getCondicionExisteUnoUnaTalQueKeyword_0_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getIteracionAccess().getCondicionExisteUnoUnaTalQueKeyword_0_0_2()); 

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
    // $ANTLR end "rule__Iteracion__CondicionAlternatives_0_0"


    // $ANTLR start "rule__Atributo__DeterminanteAlternatives_0_0"
    // InternalLenguajeNaturalReducido.g:552:1: rule__Atributo__DeterminanteAlternatives_0_0 : ( ( 'el/la' ) | ( 'todos los/las' ) | ( 'entre los/las' ) );
    public final void rule__Atributo__DeterminanteAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:556:1: ( ( 'el/la' ) | ( 'todos los/las' ) | ( 'entre los/las' ) )
            int alt4=3;
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
                    // InternalLenguajeNaturalReducido.g:569:2: ( 'entre los/las' )
                    {
                    // InternalLenguajeNaturalReducido.g:569:2: ( 'entre los/las' )
                    // InternalLenguajeNaturalReducido.g:570:3: 'entre los/las'
                    {
                     before(grammarAccess.getAtributoAccess().getDeterminanteEntreLosLasKeyword_0_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getDeterminanteEntreLosLasKeyword_0_0_2()); 

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
    // InternalLenguajeNaturalReducido.g:579:1: rule__Operacion__OperacionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) );
    public final void rule__Operacion__OperacionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:583:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            case 26:
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
                    // InternalLenguajeNaturalReducido.g:584:2: ( 'mayor que' )
                    {
                    // InternalLenguajeNaturalReducido.g:584:2: ( 'mayor que' )
                    // InternalLenguajeNaturalReducido.g:585:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajeNaturalReducido.g:590:2: ( 'menor que' )
                    {
                    // InternalLenguajeNaturalReducido.g:590:2: ( 'menor que' )
                    // InternalLenguajeNaturalReducido.g:591:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajeNaturalReducido.g:596:2: ( 'igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:596:2: ( 'igual a' )
                    // InternalLenguajeNaturalReducido.g:597:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajeNaturalReducido.g:602:2: ( 'mayor o igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:602:2: ( 'mayor o igual a' )
                    // InternalLenguajeNaturalReducido.g:603:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajeNaturalReducido.g:608:2: ( 'menor o igual a' )
                    {
                    // InternalLenguajeNaturalReducido.g:608:2: ( 'menor o igual a' )
                    // InternalLenguajeNaturalReducido.g:609:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLenguajeNaturalReducido.g:614:2: ( 'distinto de' )
                    {
                    // InternalLenguajeNaturalReducido.g:614:2: ( 'distinto de' )
                    // InternalLenguajeNaturalReducido.g:615:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:624:1: rule__Documento__Group__0 : rule__Documento__Group__0__Impl rule__Documento__Group__1 ;
    public final void rule__Documento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:628:1: ( rule__Documento__Group__0__Impl rule__Documento__Group__1 )
            // InternalLenguajeNaturalReducido.g:629:2: rule__Documento__Group__0__Impl rule__Documento__Group__1
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
    // InternalLenguajeNaturalReducido.g:636:1: rule__Documento__Group__0__Impl : ( ( rule__Documento__EncabezadoAssignment_0 ) ) ;
    public final void rule__Documento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:640:1: ( ( ( rule__Documento__EncabezadoAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:641:1: ( ( rule__Documento__EncabezadoAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:641:1: ( ( rule__Documento__EncabezadoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:642:2: ( rule__Documento__EncabezadoAssignment_0 )
            {
             before(grammarAccess.getDocumentoAccess().getEncabezadoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:643:2: ( rule__Documento__EncabezadoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:643:3: rule__Documento__EncabezadoAssignment_0
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
    // InternalLenguajeNaturalReducido.g:651:1: rule__Documento__Group__1 : rule__Documento__Group__1__Impl rule__Documento__Group__2 ;
    public final void rule__Documento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:655:1: ( rule__Documento__Group__1__Impl rule__Documento__Group__2 )
            // InternalLenguajeNaturalReducido.g:656:2: rule__Documento__Group__1__Impl rule__Documento__Group__2
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
    // InternalLenguajeNaturalReducido.g:663:1: rule__Documento__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Documento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:667:1: ( ( ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:668:1: ( ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:668:1: ( ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:669:2: ruleFinOracion
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
    // InternalLenguajeNaturalReducido.g:678:1: rule__Documento__Group__2 : rule__Documento__Group__2__Impl ;
    public final void rule__Documento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:682:1: ( rule__Documento__Group__2__Impl )
            // InternalLenguajeNaturalReducido.g:683:2: rule__Documento__Group__2__Impl
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
    // InternalLenguajeNaturalReducido.g:689:1: rule__Documento__Group__2__Impl : ( ( rule__Documento__OracionesAssignment_2 )* ) ;
    public final void rule__Documento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:693:1: ( ( ( rule__Documento__OracionesAssignment_2 )* ) )
            // InternalLenguajeNaturalReducido.g:694:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            {
            // InternalLenguajeNaturalReducido.g:694:1: ( ( rule__Documento__OracionesAssignment_2 )* )
            // InternalLenguajeNaturalReducido.g:695:2: ( rule__Documento__OracionesAssignment_2 )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:696:2: ( rule__Documento__OracionesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||(LA6_0>=18 && LA6_0<=20)||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:696:3: rule__Documento__OracionesAssignment_2
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
    // InternalLenguajeNaturalReducido.g:705:1: rule__Oracion__Group__0 : rule__Oracion__Group__0__Impl rule__Oracion__Group__1 ;
    public final void rule__Oracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:709:1: ( rule__Oracion__Group__0__Impl rule__Oracion__Group__1 )
            // InternalLenguajeNaturalReducido.g:710:2: rule__Oracion__Group__0__Impl rule__Oracion__Group__1
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
    // InternalLenguajeNaturalReducido.g:717:1: rule__Oracion__Group__0__Impl : ( ( rule__Oracion__ContenidoAssignment_0 ) ) ;
    public final void rule__Oracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:721:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:722:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:722:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:723:2: ( rule__Oracion__ContenidoAssignment_0 )
            {
             before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:724:2: ( rule__Oracion__ContenidoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:724:3: rule__Oracion__ContenidoAssignment_0
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
    // InternalLenguajeNaturalReducido.g:732:1: rule__Oracion__Group__1 : rule__Oracion__Group__1__Impl ;
    public final void rule__Oracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:736:1: ( rule__Oracion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:737:2: rule__Oracion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:743:1: rule__Oracion__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Oracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:747:1: ( ( ruleFinOracion ) )
            // InternalLenguajeNaturalReducido.g:748:1: ( ruleFinOracion )
            {
            // InternalLenguajeNaturalReducido.g:748:1: ( ruleFinOracion )
            // InternalLenguajeNaturalReducido.g:749:2: ruleFinOracion
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
    // InternalLenguajeNaturalReducido.g:759:1: rule__Contenido__Group__0 : rule__Contenido__Group__0__Impl rule__Contenido__Group__1 ;
    public final void rule__Contenido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:763:1: ( rule__Contenido__Group__0__Impl rule__Contenido__Group__1 )
            // InternalLenguajeNaturalReducido.g:764:2: rule__Contenido__Group__0__Impl rule__Contenido__Group__1
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
    // InternalLenguajeNaturalReducido.g:771:1: rule__Contenido__Group__0__Impl : ( ( rule__Contenido__CondicionalAssignment_0 )? ) ;
    public final void rule__Contenido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:775:1: ( ( ( rule__Contenido__CondicionalAssignment_0 )? ) )
            // InternalLenguajeNaturalReducido.g:776:1: ( ( rule__Contenido__CondicionalAssignment_0 )? )
            {
            // InternalLenguajeNaturalReducido.g:776:1: ( ( rule__Contenido__CondicionalAssignment_0 )? )
            // InternalLenguajeNaturalReducido.g:777:2: ( rule__Contenido__CondicionalAssignment_0 )?
            {
             before(grammarAccess.getContenidoAccess().getCondicionalAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:778:2: ( rule__Contenido__CondicionalAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:778:3: rule__Contenido__CondicionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contenido__CondicionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContenidoAccess().getCondicionalAssignment_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:786:1: rule__Contenido__Group__1 : rule__Contenido__Group__1__Impl rule__Contenido__Group__2 ;
    public final void rule__Contenido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:790:1: ( rule__Contenido__Group__1__Impl rule__Contenido__Group__2 )
            // InternalLenguajeNaturalReducido.g:791:2: rule__Contenido__Group__1__Impl rule__Contenido__Group__2
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
    // InternalLenguajeNaturalReducido.g:798:1: rule__Contenido__Group__1__Impl : ( ( rule__Contenido__SimpleAssignment_1 ) ) ;
    public final void rule__Contenido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:802:1: ( ( ( rule__Contenido__SimpleAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:803:1: ( ( rule__Contenido__SimpleAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:803:1: ( ( rule__Contenido__SimpleAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:804:2: ( rule__Contenido__SimpleAssignment_1 )
            {
             before(grammarAccess.getContenidoAccess().getSimpleAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:805:2: ( rule__Contenido__SimpleAssignment_1 )
            // InternalLenguajeNaturalReducido.g:805:3: rule__Contenido__SimpleAssignment_1
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
    // InternalLenguajeNaturalReducido.g:813:1: rule__Contenido__Group__2 : rule__Contenido__Group__2__Impl ;
    public final void rule__Contenido__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:817:1: ( rule__Contenido__Group__2__Impl )
            // InternalLenguajeNaturalReducido.g:818:2: rule__Contenido__Group__2__Impl
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
    // InternalLenguajeNaturalReducido.g:824:1: rule__Contenido__Group__2__Impl : ( ( rule__Contenido__ComposicionAssignment_2 )? ) ;
    public final void rule__Contenido__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:828:1: ( ( ( rule__Contenido__ComposicionAssignment_2 )? ) )
            // InternalLenguajeNaturalReducido.g:829:1: ( ( rule__Contenido__ComposicionAssignment_2 )? )
            {
            // InternalLenguajeNaturalReducido.g:829:1: ( ( rule__Contenido__ComposicionAssignment_2 )? )
            // InternalLenguajeNaturalReducido.g:830:2: ( rule__Contenido__ComposicionAssignment_2 )?
            {
             before(grammarAccess.getContenidoAccess().getComposicionAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:831:2: ( rule__Contenido__ComposicionAssignment_2 )?
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
                    // InternalLenguajeNaturalReducido.g:831:3: rule__Contenido__ComposicionAssignment_2
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
    // InternalLenguajeNaturalReducido.g:840:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:844:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalLenguajeNaturalReducido.g:845:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
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
    // InternalLenguajeNaturalReducido.g:852:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__Expresion_izqAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:856:1: ( ( ( rule__Simple__Expresion_izqAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:857:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:857:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:858:2: ( rule__Simple__Expresion_izqAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:859:2: ( rule__Simple__Expresion_izqAssignment_0 )
            // InternalLenguajeNaturalReducido.g:859:3: rule__Simple__Expresion_izqAssignment_0
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
    // InternalLenguajeNaturalReducido.g:867:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:871:1: ( rule__Simple__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:872:2: rule__Simple__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:878:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__Expresion_derAssignment_1 )? ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:882:1: ( ( ( rule__Simple__Expresion_derAssignment_1 )? ) )
            // InternalLenguajeNaturalReducido.g:883:1: ( ( rule__Simple__Expresion_derAssignment_1 )? )
            {
            // InternalLenguajeNaturalReducido.g:883:1: ( ( rule__Simple__Expresion_derAssignment_1 )? )
            // InternalLenguajeNaturalReducido.g:884:2: ( rule__Simple__Expresion_derAssignment_1 )?
            {
             before(grammarAccess.getSimpleAccess().getExpresion_derAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:885:2: ( rule__Simple__Expresion_derAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:885:3: rule__Simple__Expresion_derAssignment_1
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
    // InternalLenguajeNaturalReducido.g:894:1: rule__ExpresionDerecha__Group__0 : rule__ExpresionDerecha__Group__0__Impl rule__ExpresionDerecha__Group__1 ;
    public final void rule__ExpresionDerecha__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:898:1: ( rule__ExpresionDerecha__Group__0__Impl rule__ExpresionDerecha__Group__1 )
            // InternalLenguajeNaturalReducido.g:899:2: rule__ExpresionDerecha__Group__0__Impl rule__ExpresionDerecha__Group__1
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
    // InternalLenguajeNaturalReducido.g:906:1: rule__ExpresionDerecha__Group__0__Impl : ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) ) ;
    public final void rule__ExpresionDerecha__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:910:1: ( ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:911:1: ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:911:1: ( ( rule__ExpresionDerecha__ComparacionAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:912:2: ( rule__ExpresionDerecha__ComparacionAssignment_0 )
            {
             before(grammarAccess.getExpresionDerechaAccess().getComparacionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:913:2: ( rule__ExpresionDerecha__ComparacionAssignment_0 )
            // InternalLenguajeNaturalReducido.g:913:3: rule__ExpresionDerecha__ComparacionAssignment_0
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
    // InternalLenguajeNaturalReducido.g:921:1: rule__ExpresionDerecha__Group__1 : rule__ExpresionDerecha__Group__1__Impl ;
    public final void rule__ExpresionDerecha__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:925:1: ( rule__ExpresionDerecha__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:926:2: rule__ExpresionDerecha__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:932:1: rule__ExpresionDerecha__Group__1__Impl : ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) ) ;
    public final void rule__ExpresionDerecha__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:936:1: ( ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:937:1: ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:937:1: ( ( rule__ExpresionDerecha__ExpresionAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:938:2: ( rule__ExpresionDerecha__ExpresionAssignment_1 )
            {
             before(grammarAccess.getExpresionDerechaAccess().getExpresionAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:939:2: ( rule__ExpresionDerecha__ExpresionAssignment_1 )
            // InternalLenguajeNaturalReducido.g:939:3: rule__ExpresionDerecha__ExpresionAssignment_1
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
    // InternalLenguajeNaturalReducido.g:948:1: rule__Composicion__Group__0 : rule__Composicion__Group__0__Impl rule__Composicion__Group__1 ;
    public final void rule__Composicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:952:1: ( rule__Composicion__Group__0__Impl rule__Composicion__Group__1 )
            // InternalLenguajeNaturalReducido.g:953:2: rule__Composicion__Group__0__Impl rule__Composicion__Group__1
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
    // InternalLenguajeNaturalReducido.g:960:1: rule__Composicion__Group__0__Impl : ( ( rule__Composicion__NexoAssignment_0 ) ) ;
    public final void rule__Composicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:964:1: ( ( ( rule__Composicion__NexoAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:965:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:965:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:966:2: ( rule__Composicion__NexoAssignment_0 )
            {
             before(grammarAccess.getComposicionAccess().getNexoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:967:2: ( rule__Composicion__NexoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:967:3: rule__Composicion__NexoAssignment_0
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
    // InternalLenguajeNaturalReducido.g:975:1: rule__Composicion__Group__1 : rule__Composicion__Group__1__Impl ;
    public final void rule__Composicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:979:1: ( rule__Composicion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:980:2: rule__Composicion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:986:1: rule__Composicion__Group__1__Impl : ( ( rule__Composicion__ContenidoAssignment_1 ) ) ;
    public final void rule__Composicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:990:1: ( ( ( rule__Composicion__ContenidoAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:991:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:991:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:992:2: ( rule__Composicion__ContenidoAssignment_1 )
            {
             before(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:993:2: ( rule__Composicion__ContenidoAssignment_1 )
            // InternalLenguajeNaturalReducido.g:993:3: rule__Composicion__ContenidoAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1002:1: rule__Comparacion__Group__0 : rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 ;
    public final void rule__Comparacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1006:1: ( rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 )
            // InternalLenguajeNaturalReducido.g:1007:2: rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1
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
    // InternalLenguajeNaturalReducido.g:1014:1: rule__Comparacion__Group__0__Impl : ( ( rule__Comparacion__AfirmacionAssignment_0 ) ) ;
    public final void rule__Comparacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1018:1: ( ( ( rule__Comparacion__AfirmacionAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1019:1: ( ( rule__Comparacion__AfirmacionAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1019:1: ( ( rule__Comparacion__AfirmacionAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1020:2: ( rule__Comparacion__AfirmacionAssignment_0 )
            {
             before(grammarAccess.getComparacionAccess().getAfirmacionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1021:2: ( rule__Comparacion__AfirmacionAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1021:3: rule__Comparacion__AfirmacionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparacion__AfirmacionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparacionAccess().getAfirmacionAssignment_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:1029:1: rule__Comparacion__Group__1 : rule__Comparacion__Group__1__Impl ;
    public final void rule__Comparacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1033:1: ( rule__Comparacion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1034:2: rule__Comparacion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:1040:1: rule__Comparacion__Group__1__Impl : ( ( rule__Comparacion__OperacionAssignment_1 ) ) ;
    public final void rule__Comparacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1044:1: ( ( ( rule__Comparacion__OperacionAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1045:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1045:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1046:2: ( rule__Comparacion__OperacionAssignment_1 )
            {
             before(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1047:2: ( rule__Comparacion__OperacionAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1047:3: rule__Comparacion__OperacionAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1056:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1060:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // InternalLenguajeNaturalReducido.g:1061:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
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
    // InternalLenguajeNaturalReducido.g:1068:1: rule__Propiedad__Group__0__Impl : ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1072:1: ( ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) )
            // InternalLenguajeNaturalReducido.g:1073:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            {
            // InternalLenguajeNaturalReducido.g:1073:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            // InternalLenguajeNaturalReducido.g:1074:2: ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* )
            {
            // InternalLenguajeNaturalReducido.g:1074:2: ( ( rule__Propiedad__AtributoAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1075:3: ( rule__Propiedad__AtributoAssignment_0 )
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1076:3: ( rule__Propiedad__AtributoAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1076:4: rule__Propiedad__AtributoAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Propiedad__AtributoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 

            }

            // InternalLenguajeNaturalReducido.g:1079:2: ( ( rule__Propiedad__AtributoAssignment_0 )* )
            // InternalLenguajeNaturalReducido.g:1080:3: ( rule__Propiedad__AtributoAssignment_0 )*
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1081:3: ( rule__Propiedad__AtributoAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLenguajeNaturalReducido.g:1081:4: rule__Propiedad__AtributoAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1090:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1094:1: ( rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 )
            // InternalLenguajeNaturalReducido.g:1095:2: rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2
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
    // InternalLenguajeNaturalReducido.g:1102:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__TerminoAssignment_1 )? ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1106:1: ( ( ( rule__Propiedad__TerminoAssignment_1 )? ) )
            // InternalLenguajeNaturalReducido.g:1107:1: ( ( rule__Propiedad__TerminoAssignment_1 )? )
            {
            // InternalLenguajeNaturalReducido.g:1107:1: ( ( rule__Propiedad__TerminoAssignment_1 )? )
            // InternalLenguajeNaturalReducido.g:1108:2: ( rule__Propiedad__TerminoAssignment_1 )?
            {
             before(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1109:2: ( rule__Propiedad__TerminoAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:1109:3: rule__Propiedad__TerminoAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1117:1: rule__Propiedad__Group__2 : rule__Propiedad__Group__2__Impl ;
    public final void rule__Propiedad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1121:1: ( rule__Propiedad__Group__2__Impl )
            // InternalLenguajeNaturalReducido.g:1122:2: rule__Propiedad__Group__2__Impl
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
    // InternalLenguajeNaturalReducido.g:1128:1: rule__Propiedad__Group__2__Impl : ( ( rule__Propiedad__IteracionAssignment_2 )* ) ;
    public final void rule__Propiedad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1132:1: ( ( ( rule__Propiedad__IteracionAssignment_2 )* ) )
            // InternalLenguajeNaturalReducido.g:1133:1: ( ( rule__Propiedad__IteracionAssignment_2 )* )
            {
            // InternalLenguajeNaturalReducido.g:1133:1: ( ( rule__Propiedad__IteracionAssignment_2 )* )
            // InternalLenguajeNaturalReducido.g:1134:2: ( rule__Propiedad__IteracionAssignment_2 )*
            {
             before(grammarAccess.getPropiedadAccess().getIteracionAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:1135:2: ( rule__Propiedad__IteracionAssignment_2 )*
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
            	    // InternalLenguajeNaturalReducido.g:1135:3: rule__Propiedad__IteracionAssignment_2
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
    // InternalLenguajeNaturalReducido.g:1144:1: rule__Iteracion__Group__0 : rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1 ;
    public final void rule__Iteracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1148:1: ( rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1 )
            // InternalLenguajeNaturalReducido.g:1149:2: rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1
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
    // InternalLenguajeNaturalReducido.g:1156:1: rule__Iteracion__Group__0__Impl : ( ( rule__Iteracion__CondicionAssignment_0 ) ) ;
    public final void rule__Iteracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1160:1: ( ( ( rule__Iteracion__CondicionAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1161:1: ( ( rule__Iteracion__CondicionAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1161:1: ( ( rule__Iteracion__CondicionAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1162:2: ( rule__Iteracion__CondicionAssignment_0 )
            {
             before(grammarAccess.getIteracionAccess().getCondicionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1163:2: ( rule__Iteracion__CondicionAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1163:3: rule__Iteracion__CondicionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__CondicionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getCondicionAssignment_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:1171:1: rule__Iteracion__Group__1 : rule__Iteracion__Group__1__Impl ;
    public final void rule__Iteracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1175:1: ( rule__Iteracion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1176:2: rule__Iteracion__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:1182:1: rule__Iteracion__Group__1__Impl : ( ( rule__Iteracion__ContenidoAssignment_1 ) ) ;
    public final void rule__Iteracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1186:1: ( ( ( rule__Iteracion__ContenidoAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1187:1: ( ( rule__Iteracion__ContenidoAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1187:1: ( ( rule__Iteracion__ContenidoAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1188:2: ( rule__Iteracion__ContenidoAssignment_1 )
            {
             before(grammarAccess.getIteracionAccess().getContenidoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1189:2: ( rule__Iteracion__ContenidoAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1189:3: rule__Iteracion__ContenidoAssignment_1
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
    // InternalLenguajeNaturalReducido.g:1198:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1202:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalLenguajeNaturalReducido.g:1203:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
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
    // InternalLenguajeNaturalReducido.g:1210:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__DeterminanteAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1214:1: ( ( ( rule__Atributo__DeterminanteAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1215:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1215:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1216:2: ( rule__Atributo__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1217:2: ( rule__Atributo__DeterminanteAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1217:3: rule__Atributo__DeterminanteAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1225:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1229:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalLenguajeNaturalReducido.g:1230:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
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
    // InternalLenguajeNaturalReducido.g:1237:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__CuantitativoAssignment_1 )? ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1241:1: ( ( ( rule__Atributo__CuantitativoAssignment_1 )? ) )
            // InternalLenguajeNaturalReducido.g:1242:1: ( ( rule__Atributo__CuantitativoAssignment_1 )? )
            {
            // InternalLenguajeNaturalReducido.g:1242:1: ( ( rule__Atributo__CuantitativoAssignment_1 )? )
            // InternalLenguajeNaturalReducido.g:1243:2: ( rule__Atributo__CuantitativoAssignment_1 )?
            {
             before(grammarAccess.getAtributoAccess().getCuantitativoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1244:2: ( rule__Atributo__CuantitativoAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:1244:3: rule__Atributo__CuantitativoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atributo__CuantitativoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getCuantitativoAssignment_1()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:1252:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1256:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // InternalLenguajeNaturalReducido.g:1257:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
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
    // InternalLenguajeNaturalReducido.g:1264:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NombreAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1268:1: ( ( ( rule__Atributo__NombreAssignment_2 ) ) )
            // InternalLenguajeNaturalReducido.g:1269:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            {
            // InternalLenguajeNaturalReducido.g:1269:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            // InternalLenguajeNaturalReducido.g:1270:2: ( rule__Atributo__NombreAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 
            // InternalLenguajeNaturalReducido.g:1271:2: ( rule__Atributo__NombreAssignment_2 )
            // InternalLenguajeNaturalReducido.g:1271:3: rule__Atributo__NombreAssignment_2
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
    // InternalLenguajeNaturalReducido.g:1279:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1283:1: ( rule__Atributo__Group__3__Impl )
            // InternalLenguajeNaturalReducido.g:1284:2: rule__Atributo__Group__3__Impl
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
    // InternalLenguajeNaturalReducido.g:1290:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__EnlaceAssignment_3 ) ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1294:1: ( ( ( rule__Atributo__EnlaceAssignment_3 ) ) )
            // InternalLenguajeNaturalReducido.g:1295:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            {
            // InternalLenguajeNaturalReducido.g:1295:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            // InternalLenguajeNaturalReducido.g:1296:2: ( rule__Atributo__EnlaceAssignment_3 )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); 
            // InternalLenguajeNaturalReducido.g:1297:2: ( rule__Atributo__EnlaceAssignment_3 )
            // InternalLenguajeNaturalReducido.g:1297:3: rule__Atributo__EnlaceAssignment_3
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
    // InternalLenguajeNaturalReducido.g:1306:1: rule__Termino__Group__0 : rule__Termino__Group__0__Impl rule__Termino__Group__1 ;
    public final void rule__Termino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1310:1: ( rule__Termino__Group__0__Impl rule__Termino__Group__1 )
            // InternalLenguajeNaturalReducido.g:1311:2: rule__Termino__Group__0__Impl rule__Termino__Group__1
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
    // InternalLenguajeNaturalReducido.g:1318:1: rule__Termino__Group__0__Impl : ( ( rule__Termino__IndeterminanteAssignment_0 ) ) ;
    public final void rule__Termino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1322:1: ( ( ( rule__Termino__IndeterminanteAssignment_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1323:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1323:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            // InternalLenguajeNaturalReducido.g:1324:2: ( rule__Termino__IndeterminanteAssignment_0 )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1325:2: ( rule__Termino__IndeterminanteAssignment_0 )
            // InternalLenguajeNaturalReducido.g:1325:3: rule__Termino__IndeterminanteAssignment_0
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
    // InternalLenguajeNaturalReducido.g:1333:1: rule__Termino__Group__1 : rule__Termino__Group__1__Impl ;
    public final void rule__Termino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1337:1: ( rule__Termino__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1338:2: rule__Termino__Group__1__Impl
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
    // InternalLenguajeNaturalReducido.g:1344:1: rule__Termino__Group__1__Impl : ( ( rule__Termino__ContextoAssignment_1 ) ) ;
    public final void rule__Termino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1348:1: ( ( ( rule__Termino__ContextoAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1349:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1349:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1350:2: ( rule__Termino__ContextoAssignment_1 )
            {
             before(grammarAccess.getTerminoAccess().getContextoAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1351:2: ( rule__Termino__ContextoAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1351:3: rule__Termino__ContextoAssignment_1
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


    // $ANTLR start "rule__Afirmacion__Group__0"
    // InternalLenguajeNaturalReducido.g:1360:1: rule__Afirmacion__Group__0 : rule__Afirmacion__Group__0__Impl rule__Afirmacion__Group__1 ;
    public final void rule__Afirmacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1364:1: ( rule__Afirmacion__Group__0__Impl rule__Afirmacion__Group__1 )
            // InternalLenguajeNaturalReducido.g:1365:2: rule__Afirmacion__Group__0__Impl rule__Afirmacion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Afirmacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Afirmacion__Group__1();

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
    // $ANTLR end "rule__Afirmacion__Group__0"


    // $ANTLR start "rule__Afirmacion__Group__0__Impl"
    // InternalLenguajeNaturalReducido.g:1372:1: rule__Afirmacion__Group__0__Impl : ( ( rule__Afirmacion__NegacionAssignment_0 )? ) ;
    public final void rule__Afirmacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1376:1: ( ( ( rule__Afirmacion__NegacionAssignment_0 )? ) )
            // InternalLenguajeNaturalReducido.g:1377:1: ( ( rule__Afirmacion__NegacionAssignment_0 )? )
            {
            // InternalLenguajeNaturalReducido.g:1377:1: ( ( rule__Afirmacion__NegacionAssignment_0 )? )
            // InternalLenguajeNaturalReducido.g:1378:2: ( rule__Afirmacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getAfirmacionAccess().getNegacionAssignment_0()); 
            // InternalLenguajeNaturalReducido.g:1379:2: ( rule__Afirmacion__NegacionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLenguajeNaturalReducido.g:1379:3: rule__Afirmacion__NegacionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Afirmacion__NegacionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAfirmacionAccess().getNegacionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Afirmacion__Group__0__Impl"


    // $ANTLR start "rule__Afirmacion__Group__1"
    // InternalLenguajeNaturalReducido.g:1387:1: rule__Afirmacion__Group__1 : rule__Afirmacion__Group__1__Impl ;
    public final void rule__Afirmacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1391:1: ( rule__Afirmacion__Group__1__Impl )
            // InternalLenguajeNaturalReducido.g:1392:2: rule__Afirmacion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Afirmacion__Group__1__Impl();

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
    // $ANTLR end "rule__Afirmacion__Group__1"


    // $ANTLR start "rule__Afirmacion__Group__1__Impl"
    // InternalLenguajeNaturalReducido.g:1398:1: rule__Afirmacion__Group__1__Impl : ( ( rule__Afirmacion__AfirmacionAssignment_1 ) ) ;
    public final void rule__Afirmacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1402:1: ( ( ( rule__Afirmacion__AfirmacionAssignment_1 ) ) )
            // InternalLenguajeNaturalReducido.g:1403:1: ( ( rule__Afirmacion__AfirmacionAssignment_1 ) )
            {
            // InternalLenguajeNaturalReducido.g:1403:1: ( ( rule__Afirmacion__AfirmacionAssignment_1 ) )
            // InternalLenguajeNaturalReducido.g:1404:2: ( rule__Afirmacion__AfirmacionAssignment_1 )
            {
             before(grammarAccess.getAfirmacionAccess().getAfirmacionAssignment_1()); 
            // InternalLenguajeNaturalReducido.g:1405:2: ( rule__Afirmacion__AfirmacionAssignment_1 )
            // InternalLenguajeNaturalReducido.g:1405:3: rule__Afirmacion__AfirmacionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Afirmacion__AfirmacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAfirmacionAccess().getAfirmacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Afirmacion__Group__1__Impl"


    // $ANTLR start "rule__Documento__EncabezadoAssignment_0"
    // InternalLenguajeNaturalReducido.g:1414:1: rule__Documento__EncabezadoAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Documento__EncabezadoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1418:1: ( ( ruleLiteral ) )
            // InternalLenguajeNaturalReducido.g:1419:2: ( ruleLiteral )
            {
            // InternalLenguajeNaturalReducido.g:1419:2: ( ruleLiteral )
            // InternalLenguajeNaturalReducido.g:1420:3: ruleLiteral
            {
             before(grammarAccess.getDocumentoAccess().getEncabezadoLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getDocumentoAccess().getEncabezadoLiteralParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalLenguajeNaturalReducido.g:1429:1: rule__Documento__OracionesAssignment_2 : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1433:1: ( ( ruleOracion ) )
            // InternalLenguajeNaturalReducido.g:1434:2: ( ruleOracion )
            {
            // InternalLenguajeNaturalReducido.g:1434:2: ( ruleOracion )
            // InternalLenguajeNaturalReducido.g:1435:3: ruleOracion
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
    // InternalLenguajeNaturalReducido.g:1444:1: rule__Oracion__ContenidoAssignment_0 : ( ruleContenido ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1448:1: ( ( ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:1449:2: ( ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:1449:2: ( ruleContenido )
            // InternalLenguajeNaturalReducido.g:1450:3: ruleContenido
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


    // $ANTLR start "rule__Contenido__CondicionalAssignment_0"
    // InternalLenguajeNaturalReducido.g:1459:1: rule__Contenido__CondicionalAssignment_0 : ( ( 'si' ) ) ;
    public final void rule__Contenido__CondicionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1463:1: ( ( ( 'si' ) ) )
            // InternalLenguajeNaturalReducido.g:1464:2: ( ( 'si' ) )
            {
            // InternalLenguajeNaturalReducido.g:1464:2: ( ( 'si' ) )
            // InternalLenguajeNaturalReducido.g:1465:3: ( 'si' )
            {
             before(grammarAccess.getContenidoAccess().getCondicionalSiKeyword_0_0()); 
            // InternalLenguajeNaturalReducido.g:1466:3: ( 'si' )
            // InternalLenguajeNaturalReducido.g:1467:4: 'si'
            {
             before(grammarAccess.getContenidoAccess().getCondicionalSiKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getCondicionalSiKeyword_0_0()); 

            }

             after(grammarAccess.getContenidoAccess().getCondicionalSiKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__CondicionalAssignment_0"


    // $ANTLR start "rule__Contenido__SimpleAssignment_1"
    // InternalLenguajeNaturalReducido.g:1478:1: rule__Contenido__SimpleAssignment_1 : ( ruleSimple ) ;
    public final void rule__Contenido__SimpleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1482:1: ( ( ruleSimple ) )
            // InternalLenguajeNaturalReducido.g:1483:2: ( ruleSimple )
            {
            // InternalLenguajeNaturalReducido.g:1483:2: ( ruleSimple )
            // InternalLenguajeNaturalReducido.g:1484:3: ruleSimple
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
    // InternalLenguajeNaturalReducido.g:1493:1: rule__Contenido__ComposicionAssignment_2 : ( ruleComposicion ) ;
    public final void rule__Contenido__ComposicionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1497:1: ( ( ruleComposicion ) )
            // InternalLenguajeNaturalReducido.g:1498:2: ( ruleComposicion )
            {
            // InternalLenguajeNaturalReducido.g:1498:2: ( ruleComposicion )
            // InternalLenguajeNaturalReducido.g:1499:3: ruleComposicion
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
    // InternalLenguajeNaturalReducido.g:1508:1: rule__Simple__Expresion_izqAssignment_0 : ( ruleExpresion ) ;
    public final void rule__Simple__Expresion_izqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1512:1: ( ( ruleExpresion ) )
            // InternalLenguajeNaturalReducido.g:1513:2: ( ruleExpresion )
            {
            // InternalLenguajeNaturalReducido.g:1513:2: ( ruleExpresion )
            // InternalLenguajeNaturalReducido.g:1514:3: ruleExpresion
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
    // InternalLenguajeNaturalReducido.g:1523:1: rule__Simple__Expresion_derAssignment_1 : ( ruleExpresionDerecha ) ;
    public final void rule__Simple__Expresion_derAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1527:1: ( ( ruleExpresionDerecha ) )
            // InternalLenguajeNaturalReducido.g:1528:2: ( ruleExpresionDerecha )
            {
            // InternalLenguajeNaturalReducido.g:1528:2: ( ruleExpresionDerecha )
            // InternalLenguajeNaturalReducido.g:1529:3: ruleExpresionDerecha
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
    // InternalLenguajeNaturalReducido.g:1538:1: rule__ExpresionDerecha__ComparacionAssignment_0 : ( ruleComparacion ) ;
    public final void rule__ExpresionDerecha__ComparacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1542:1: ( ( ruleComparacion ) )
            // InternalLenguajeNaturalReducido.g:1543:2: ( ruleComparacion )
            {
            // InternalLenguajeNaturalReducido.g:1543:2: ( ruleComparacion )
            // InternalLenguajeNaturalReducido.g:1544:3: ruleComparacion
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
    // InternalLenguajeNaturalReducido.g:1553:1: rule__ExpresionDerecha__ExpresionAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionDerecha__ExpresionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1557:1: ( ( ruleExpresion ) )
            // InternalLenguajeNaturalReducido.g:1558:2: ( ruleExpresion )
            {
            // InternalLenguajeNaturalReducido.g:1558:2: ( ruleExpresion )
            // InternalLenguajeNaturalReducido.g:1559:3: ruleExpresion
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
    // InternalLenguajeNaturalReducido.g:1568:1: rule__Composicion__NexoAssignment_0 : ( ruleNexo ) ;
    public final void rule__Composicion__NexoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1572:1: ( ( ruleNexo ) )
            // InternalLenguajeNaturalReducido.g:1573:2: ( ruleNexo )
            {
            // InternalLenguajeNaturalReducido.g:1573:2: ( ruleNexo )
            // InternalLenguajeNaturalReducido.g:1574:3: ruleNexo
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
    // InternalLenguajeNaturalReducido.g:1583:1: rule__Composicion__ContenidoAssignment_1 : ( ruleContenido ) ;
    public final void rule__Composicion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1587:1: ( ( ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:1588:2: ( ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:1588:2: ( ruleContenido )
            // InternalLenguajeNaturalReducido.g:1589:3: ruleContenido
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


    // $ANTLR start "rule__Nexo__NexoAssignment"
    // InternalLenguajeNaturalReducido.g:1598:1: rule__Nexo__NexoAssignment : ( ( rule__Nexo__NexoAlternatives_0 ) ) ;
    public final void rule__Nexo__NexoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1602:1: ( ( ( rule__Nexo__NexoAlternatives_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1603:2: ( ( rule__Nexo__NexoAlternatives_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1603:2: ( ( rule__Nexo__NexoAlternatives_0 ) )
            // InternalLenguajeNaturalReducido.g:1604:3: ( rule__Nexo__NexoAlternatives_0 )
            {
             before(grammarAccess.getNexoAccess().getNexoAlternatives_0()); 
            // InternalLenguajeNaturalReducido.g:1605:3: ( rule__Nexo__NexoAlternatives_0 )
            // InternalLenguajeNaturalReducido.g:1605:4: rule__Nexo__NexoAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Nexo__NexoAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNexoAccess().getNexoAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nexo__NexoAssignment"


    // $ANTLR start "rule__Expresion__ExpresionAssignment"
    // InternalLenguajeNaturalReducido.g:1613:1: rule__Expresion__ExpresionAssignment : ( ( rule__Expresion__ExpresionAlternatives_0 ) ) ;
    public final void rule__Expresion__ExpresionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1617:1: ( ( ( rule__Expresion__ExpresionAlternatives_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1618:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1618:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            // InternalLenguajeNaturalReducido.g:1619:3: ( rule__Expresion__ExpresionAlternatives_0 )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); 
            // InternalLenguajeNaturalReducido.g:1620:3: ( rule__Expresion__ExpresionAlternatives_0 )
            // InternalLenguajeNaturalReducido.g:1620:4: rule__Expresion__ExpresionAlternatives_0
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


    // $ANTLR start "rule__Comparacion__AfirmacionAssignment_0"
    // InternalLenguajeNaturalReducido.g:1628:1: rule__Comparacion__AfirmacionAssignment_0 : ( ruleAfirmacion ) ;
    public final void rule__Comparacion__AfirmacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1632:1: ( ( ruleAfirmacion ) )
            // InternalLenguajeNaturalReducido.g:1633:2: ( ruleAfirmacion )
            {
            // InternalLenguajeNaturalReducido.g:1633:2: ( ruleAfirmacion )
            // InternalLenguajeNaturalReducido.g:1634:3: ruleAfirmacion
            {
             before(grammarAccess.getComparacionAccess().getAfirmacionAfirmacionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAfirmacion();

            state._fsp--;

             after(grammarAccess.getComparacionAccess().getAfirmacionAfirmacionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacion__AfirmacionAssignment_0"


    // $ANTLR start "rule__Comparacion__OperacionAssignment_1"
    // InternalLenguajeNaturalReducido.g:1643:1: rule__Comparacion__OperacionAssignment_1 : ( ruleOperacion ) ;
    public final void rule__Comparacion__OperacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1647:1: ( ( ruleOperacion ) )
            // InternalLenguajeNaturalReducido.g:1648:2: ( ruleOperacion )
            {
            // InternalLenguajeNaturalReducido.g:1648:2: ( ruleOperacion )
            // InternalLenguajeNaturalReducido.g:1649:3: ruleOperacion
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
    // InternalLenguajeNaturalReducido.g:1658:1: rule__Propiedad__AtributoAssignment_0 : ( ruleAtributo ) ;
    public final void rule__Propiedad__AtributoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1662:1: ( ( ruleAtributo ) )
            // InternalLenguajeNaturalReducido.g:1663:2: ( ruleAtributo )
            {
            // InternalLenguajeNaturalReducido.g:1663:2: ( ruleAtributo )
            // InternalLenguajeNaturalReducido.g:1664:3: ruleAtributo
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
    // InternalLenguajeNaturalReducido.g:1673:1: rule__Propiedad__TerminoAssignment_1 : ( ruleTermino ) ;
    public final void rule__Propiedad__TerminoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1677:1: ( ( ruleTermino ) )
            // InternalLenguajeNaturalReducido.g:1678:2: ( ruleTermino )
            {
            // InternalLenguajeNaturalReducido.g:1678:2: ( ruleTermino )
            // InternalLenguajeNaturalReducido.g:1679:3: ruleTermino
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
    // InternalLenguajeNaturalReducido.g:1688:1: rule__Propiedad__IteracionAssignment_2 : ( ruleIteracion ) ;
    public final void rule__Propiedad__IteracionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1692:1: ( ( ruleIteracion ) )
            // InternalLenguajeNaturalReducido.g:1693:2: ( ruleIteracion )
            {
            // InternalLenguajeNaturalReducido.g:1693:2: ( ruleIteracion )
            // InternalLenguajeNaturalReducido.g:1694:3: ruleIteracion
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


    // $ANTLR start "rule__Iteracion__CondicionAssignment_0"
    // InternalLenguajeNaturalReducido.g:1703:1: rule__Iteracion__CondicionAssignment_0 : ( ( rule__Iteracion__CondicionAlternatives_0_0 ) ) ;
    public final void rule__Iteracion__CondicionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1707:1: ( ( ( rule__Iteracion__CondicionAlternatives_0_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1708:2: ( ( rule__Iteracion__CondicionAlternatives_0_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1708:2: ( ( rule__Iteracion__CondicionAlternatives_0_0 ) )
            // InternalLenguajeNaturalReducido.g:1709:3: ( rule__Iteracion__CondicionAlternatives_0_0 )
            {
             before(grammarAccess.getIteracionAccess().getCondicionAlternatives_0_0()); 
            // InternalLenguajeNaturalReducido.g:1710:3: ( rule__Iteracion__CondicionAlternatives_0_0 )
            // InternalLenguajeNaturalReducido.g:1710:4: rule__Iteracion__CondicionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__CondicionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getCondicionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__CondicionAssignment_0"


    // $ANTLR start "rule__Iteracion__ContenidoAssignment_1"
    // InternalLenguajeNaturalReducido.g:1718:1: rule__Iteracion__ContenidoAssignment_1 : ( ruleContenido ) ;
    public final void rule__Iteracion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1722:1: ( ( ruleContenido ) )
            // InternalLenguajeNaturalReducido.g:1723:2: ( ruleContenido )
            {
            // InternalLenguajeNaturalReducido.g:1723:2: ( ruleContenido )
            // InternalLenguajeNaturalReducido.g:1724:3: ruleContenido
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
    // InternalLenguajeNaturalReducido.g:1733:1: rule__Atributo__DeterminanteAssignment_0 : ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) ) ;
    public final void rule__Atributo__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1737:1: ( ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1738:2: ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1738:2: ( ( rule__Atributo__DeterminanteAlternatives_0_0 ) )
            // InternalLenguajeNaturalReducido.g:1739:3: ( rule__Atributo__DeterminanteAlternatives_0_0 )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteAlternatives_0_0()); 
            // InternalLenguajeNaturalReducido.g:1740:3: ( rule__Atributo__DeterminanteAlternatives_0_0 )
            // InternalLenguajeNaturalReducido.g:1740:4: rule__Atributo__DeterminanteAlternatives_0_0
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


    // $ANTLR start "rule__Atributo__CuantitativoAssignment_1"
    // InternalLenguajeNaturalReducido.g:1748:1: rule__Atributo__CuantitativoAssignment_1 : ( ( 'cantidad de' ) ) ;
    public final void rule__Atributo__CuantitativoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1752:1: ( ( ( 'cantidad de' ) ) )
            // InternalLenguajeNaturalReducido.g:1753:2: ( ( 'cantidad de' ) )
            {
            // InternalLenguajeNaturalReducido.g:1753:2: ( ( 'cantidad de' ) )
            // InternalLenguajeNaturalReducido.g:1754:3: ( 'cantidad de' )
            {
             before(grammarAccess.getAtributoAccess().getCuantitativoCantidadDeKeyword_1_0()); 
            // InternalLenguajeNaturalReducido.g:1755:3: ( 'cantidad de' )
            // InternalLenguajeNaturalReducido.g:1756:4: 'cantidad de'
            {
             before(grammarAccess.getAtributoAccess().getCuantitativoCantidadDeKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getCuantitativoCantidadDeKeyword_1_0()); 

            }

             after(grammarAccess.getAtributoAccess().getCuantitativoCantidadDeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__CuantitativoAssignment_1"


    // $ANTLR start "rule__Atributo__NombreAssignment_2"
    // InternalLenguajeNaturalReducido.g:1767:1: rule__Atributo__NombreAssignment_2 : ( RULE_ID ) ;
    public final void rule__Atributo__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1771:1: ( ( RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:1772:2: ( RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:1772:2: ( RULE_ID )
            // InternalLenguajeNaturalReducido.g:1773:3: RULE_ID
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
    // InternalLenguajeNaturalReducido.g:1782:1: rule__Atributo__EnlaceAssignment_3 : ( ( 'de' ) ) ;
    public final void rule__Atributo__EnlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1786:1: ( ( ( 'de' ) ) )
            // InternalLenguajeNaturalReducido.g:1787:2: ( ( 'de' ) )
            {
            // InternalLenguajeNaturalReducido.g:1787:2: ( ( 'de' ) )
            // InternalLenguajeNaturalReducido.g:1788:3: ( 'de' )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            // InternalLenguajeNaturalReducido.g:1789:3: ( 'de' )
            // InternalLenguajeNaturalReducido.g:1790:4: 'de'
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:1801:1: rule__Termino__IndeterminanteAssignment_0 : ( ( 'un/una' ) ) ;
    public final void rule__Termino__IndeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1805:1: ( ( ( 'un/una' ) ) )
            // InternalLenguajeNaturalReducido.g:1806:2: ( ( 'un/una' ) )
            {
            // InternalLenguajeNaturalReducido.g:1806:2: ( ( 'un/una' ) )
            // InternalLenguajeNaturalReducido.g:1807:3: ( 'un/una' )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            // InternalLenguajeNaturalReducido.g:1808:3: ( 'un/una' )
            // InternalLenguajeNaturalReducido.g:1809:4: 'un/una'
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalLenguajeNaturalReducido.g:1820:1: rule__Termino__ContextoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Termino__ContextoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1824:1: ( ( RULE_ID ) )
            // InternalLenguajeNaturalReducido.g:1825:2: ( RULE_ID )
            {
            // InternalLenguajeNaturalReducido.g:1825:2: ( RULE_ID )
            // InternalLenguajeNaturalReducido.g:1826:3: RULE_ID
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


    // $ANTLR start "rule__Afirmacion__NegacionAssignment_0"
    // InternalLenguajeNaturalReducido.g:1835:1: rule__Afirmacion__NegacionAssignment_0 : ( ( 'no' ) ) ;
    public final void rule__Afirmacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1839:1: ( ( ( 'no' ) ) )
            // InternalLenguajeNaturalReducido.g:1840:2: ( ( 'no' ) )
            {
            // InternalLenguajeNaturalReducido.g:1840:2: ( ( 'no' ) )
            // InternalLenguajeNaturalReducido.g:1841:3: ( 'no' )
            {
             before(grammarAccess.getAfirmacionAccess().getNegacionNoKeyword_0_0()); 
            // InternalLenguajeNaturalReducido.g:1842:3: ( 'no' )
            // InternalLenguajeNaturalReducido.g:1843:4: 'no'
            {
             before(grammarAccess.getAfirmacionAccess().getNegacionNoKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAfirmacionAccess().getNegacionNoKeyword_0_0()); 

            }

             after(grammarAccess.getAfirmacionAccess().getNegacionNoKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Afirmacion__NegacionAssignment_0"


    // $ANTLR start "rule__Afirmacion__AfirmacionAssignment_1"
    // InternalLenguajeNaturalReducido.g:1854:1: rule__Afirmacion__AfirmacionAssignment_1 : ( ( 'es' ) ) ;
    public final void rule__Afirmacion__AfirmacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1858:1: ( ( ( 'es' ) ) )
            // InternalLenguajeNaturalReducido.g:1859:2: ( ( 'es' ) )
            {
            // InternalLenguajeNaturalReducido.g:1859:2: ( ( 'es' ) )
            // InternalLenguajeNaturalReducido.g:1860:3: ( 'es' )
            {
             before(grammarAccess.getAfirmacionAccess().getAfirmacionEsKeyword_1_0()); 
            // InternalLenguajeNaturalReducido.g:1861:3: ( 'es' )
            // InternalLenguajeNaturalReducido.g:1862:4: 'es'
            {
             before(grammarAccess.getAfirmacionAccess().getAfirmacionEsKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAfirmacionAccess().getAfirmacionEsKeyword_1_0()); 

            }

             after(grammarAccess.getAfirmacionAccess().getAfirmacionEsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Afirmacion__AfirmacionAssignment_1"


    // $ANTLR start "rule__Operacion__OperacionAssignment"
    // InternalLenguajeNaturalReducido.g:1873:1: rule__Operacion__OperacionAssignment : ( ( rule__Operacion__OperacionAlternatives_0 ) ) ;
    public final void rule__Operacion__OperacionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1877:1: ( ( ( rule__Operacion__OperacionAlternatives_0 ) ) )
            // InternalLenguajeNaturalReducido.g:1878:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            {
            // InternalLenguajeNaturalReducido.g:1878:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            // InternalLenguajeNaturalReducido.g:1879:3: ( rule__Operacion__OperacionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); 
            // InternalLenguajeNaturalReducido.g:1880:3: ( rule__Operacion__OperacionAlternatives_0 )
            // InternalLenguajeNaturalReducido.g:1880:4: rule__Operacion__OperacionAlternatives_0
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


    // $ANTLR start "rule__Literal__LiteralAssignment"
    // InternalLenguajeNaturalReducido.g:1888:1: rule__Literal__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__Literal__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajeNaturalReducido.g:1892:1: ( ( RULE_STRING ) )
            // InternalLenguajeNaturalReducido.g:1893:2: ( RULE_STRING )
            {
            // InternalLenguajeNaturalReducido.g:1893:2: ( RULE_STRING )
            // InternalLenguajeNaturalReducido.g:1894:3: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000081C0020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000081C0022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040038000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});

}