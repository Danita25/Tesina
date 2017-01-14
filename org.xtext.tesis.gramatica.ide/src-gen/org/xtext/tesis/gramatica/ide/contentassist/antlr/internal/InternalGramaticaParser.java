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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.\\r\\n'", "'y'", "'o'", "'cantidad de'", "'seleccion de'", "'mayor que'", "'menor que'", "'igual a'", "'mayor o igual a'", "'menor o igual a'", "'distinto de'", "'tal que'", "'el/la'", "'de'", "'un/una'", "'no'", "'debe ser'"
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
    public static final int RULE_ID=4;
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
    // InternalGramatica.g:62:1: ruleDocumento : ( ( rule__Documento__OracionesAssignment )* ) ;
    public final void ruleDocumento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:66:2: ( ( ( rule__Documento__OracionesAssignment )* ) )
            // InternalGramatica.g:67:2: ( ( rule__Documento__OracionesAssignment )* )
            {
            // InternalGramatica.g:67:2: ( ( rule__Documento__OracionesAssignment )* )
            // InternalGramatica.g:68:3: ( rule__Documento__OracionesAssignment )*
            {
             before(grammarAccess.getDocumentoAccess().getOracionesAssignment()); 
            // InternalGramatica.g:69:3: ( rule__Documento__OracionesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramatica.g:69:4: rule__Documento__OracionesAssignment
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


    // $ANTLR start "entryRuleIteracion"
    // InternalGramatica.g:103:1: entryRuleIteracion : ruleIteracion EOF ;
    public final void entryRuleIteracion() throws RecognitionException {
        try {
            // InternalGramatica.g:104:1: ( ruleIteracion EOF )
            // InternalGramatica.g:105:1: ruleIteracion EOF
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
    // InternalGramatica.g:112:1: ruleIteracion : ( ( rule__Iteracion__Group__0 ) ) ;
    public final void ruleIteracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:116:2: ( ( ( rule__Iteracion__Group__0 ) ) )
            // InternalGramatica.g:117:2: ( ( rule__Iteracion__Group__0 ) )
            {
            // InternalGramatica.g:117:2: ( ( rule__Iteracion__Group__0 ) )
            // InternalGramatica.g:118:3: ( rule__Iteracion__Group__0 )
            {
             before(grammarAccess.getIteracionAccess().getGroup()); 
            // InternalGramatica.g:119:3: ( rule__Iteracion__Group__0 )
            // InternalGramatica.g:119:4: rule__Iteracion__Group__0
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


    // $ANTLR start "entryRuleContenido"
    // InternalGramatica.g:128:1: entryRuleContenido : ruleContenido EOF ;
    public final void entryRuleContenido() throws RecognitionException {
        try {
            // InternalGramatica.g:129:1: ( ruleContenido EOF )
            // InternalGramatica.g:130:1: ruleContenido EOF
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
    // InternalGramatica.g:137:1: ruleContenido : ( ( rule__Contenido__Group__0 ) ) ;
    public final void ruleContenido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:141:2: ( ( ( rule__Contenido__Group__0 ) ) )
            // InternalGramatica.g:142:2: ( ( rule__Contenido__Group__0 ) )
            {
            // InternalGramatica.g:142:2: ( ( rule__Contenido__Group__0 ) )
            // InternalGramatica.g:143:3: ( rule__Contenido__Group__0 )
            {
             before(grammarAccess.getContenidoAccess().getGroup()); 
            // InternalGramatica.g:144:3: ( rule__Contenido__Group__0 )
            // InternalGramatica.g:144:4: rule__Contenido__Group__0
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
    // InternalGramatica.g:153:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalGramatica.g:154:1: ( ruleSimple EOF )
            // InternalGramatica.g:155:1: ruleSimple EOF
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
    // InternalGramatica.g:162:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:166:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalGramatica.g:167:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalGramatica.g:167:2: ( ( rule__Simple__Group__0 ) )
            // InternalGramatica.g:168:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalGramatica.g:169:3: ( rule__Simple__Group__0 )
            // InternalGramatica.g:169:4: rule__Simple__Group__0
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
    // InternalGramatica.g:178:1: entryRuleComposicion : ruleComposicion EOF ;
    public final void entryRuleComposicion() throws RecognitionException {
        try {
            // InternalGramatica.g:179:1: ( ruleComposicion EOF )
            // InternalGramatica.g:180:1: ruleComposicion EOF
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
    // InternalGramatica.g:187:1: ruleComposicion : ( ( rule__Composicion__Group__0 ) ) ;
    public final void ruleComposicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:191:2: ( ( ( rule__Composicion__Group__0 ) ) )
            // InternalGramatica.g:192:2: ( ( rule__Composicion__Group__0 ) )
            {
            // InternalGramatica.g:192:2: ( ( rule__Composicion__Group__0 ) )
            // InternalGramatica.g:193:3: ( rule__Composicion__Group__0 )
            {
             before(grammarAccess.getComposicionAccess().getGroup()); 
            // InternalGramatica.g:194:3: ( rule__Composicion__Group__0 )
            // InternalGramatica.g:194:4: rule__Composicion__Group__0
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
    // InternalGramatica.g:203:1: entryRuleNexo : ruleNexo EOF ;
    public final void entryRuleNexo() throws RecognitionException {
        try {
            // InternalGramatica.g:204:1: ( ruleNexo EOF )
            // InternalGramatica.g:205:1: ruleNexo EOF
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
    // InternalGramatica.g:212:1: ruleNexo : ( ( rule__Nexo__ValorAssignment ) ) ;
    public final void ruleNexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:216:2: ( ( ( rule__Nexo__ValorAssignment ) ) )
            // InternalGramatica.g:217:2: ( ( rule__Nexo__ValorAssignment ) )
            {
            // InternalGramatica.g:217:2: ( ( rule__Nexo__ValorAssignment ) )
            // InternalGramatica.g:218:3: ( rule__Nexo__ValorAssignment )
            {
             before(grammarAccess.getNexoAccess().getValorAssignment()); 
            // InternalGramatica.g:219:3: ( rule__Nexo__ValorAssignment )
            // InternalGramatica.g:219:4: rule__Nexo__ValorAssignment
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
    // InternalGramatica.g:228:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalGramatica.g:229:1: ( ruleExpresion EOF )
            // InternalGramatica.g:230:1: ruleExpresion EOF
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
    // InternalGramatica.g:237:1: ruleExpresion : ( ( rule__Expresion__ExpresionAssignment ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:241:2: ( ( ( rule__Expresion__ExpresionAssignment ) ) )
            // InternalGramatica.g:242:2: ( ( rule__Expresion__ExpresionAssignment ) )
            {
            // InternalGramatica.g:242:2: ( ( rule__Expresion__ExpresionAssignment ) )
            // InternalGramatica.g:243:3: ( rule__Expresion__ExpresionAssignment )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAssignment()); 
            // InternalGramatica.g:244:3: ( rule__Expresion__ExpresionAssignment )
            // InternalGramatica.g:244:4: rule__Expresion__ExpresionAssignment
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
    // InternalGramatica.g:253:1: entryRuleComparacion : ruleComparacion EOF ;
    public final void entryRuleComparacion() throws RecognitionException {
        try {
            // InternalGramatica.g:254:1: ( ruleComparacion EOF )
            // InternalGramatica.g:255:1: ruleComparacion EOF
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
    // InternalGramatica.g:262:1: ruleComparacion : ( ( rule__Comparacion__Group__0 ) ) ;
    public final void ruleComparacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:266:2: ( ( ( rule__Comparacion__Group__0 ) ) )
            // InternalGramatica.g:267:2: ( ( rule__Comparacion__Group__0 ) )
            {
            // InternalGramatica.g:267:2: ( ( rule__Comparacion__Group__0 ) )
            // InternalGramatica.g:268:3: ( rule__Comparacion__Group__0 )
            {
             before(grammarAccess.getComparacionAccess().getGroup()); 
            // InternalGramatica.g:269:3: ( rule__Comparacion__Group__0 )
            // InternalGramatica.g:269:4: rule__Comparacion__Group__0
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
    // InternalGramatica.g:278:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // InternalGramatica.g:279:1: ( rulePropiedad EOF )
            // InternalGramatica.g:280:1: rulePropiedad EOF
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
    // InternalGramatica.g:287:1: rulePropiedad : ( ( rule__Propiedad__Group__0 ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:291:2: ( ( ( rule__Propiedad__Group__0 ) ) )
            // InternalGramatica.g:292:2: ( ( rule__Propiedad__Group__0 ) )
            {
            // InternalGramatica.g:292:2: ( ( rule__Propiedad__Group__0 ) )
            // InternalGramatica.g:293:3: ( rule__Propiedad__Group__0 )
            {
             before(grammarAccess.getPropiedadAccess().getGroup()); 
            // InternalGramatica.g:294:3: ( rule__Propiedad__Group__0 )
            // InternalGramatica.g:294:4: rule__Propiedad__Group__0
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
    // InternalGramatica.g:303:1: entryRuleFinOracion : ruleFinOracion EOF ;
    public final void entryRuleFinOracion() throws RecognitionException {
        try {
            // InternalGramatica.g:304:1: ( ruleFinOracion EOF )
            // InternalGramatica.g:305:1: ruleFinOracion EOF
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
    // InternalGramatica.g:312:1: ruleFinOracion : ( '.\\r\\n' ) ;
    public final void ruleFinOracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:316:2: ( ( '.\\r\\n' ) )
            // InternalGramatica.g:317:2: ( '.\\r\\n' )
            {
            // InternalGramatica.g:317:2: ( '.\\r\\n' )
            // InternalGramatica.g:318:3: '.\\r\\n'
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
    // InternalGramatica.g:328:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalGramatica.g:329:1: ( ruleAtributo EOF )
            // InternalGramatica.g:330:1: ruleAtributo EOF
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
    // InternalGramatica.g:337:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:341:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalGramatica.g:342:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalGramatica.g:342:2: ( ( rule__Atributo__Group__0 ) )
            // InternalGramatica.g:343:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalGramatica.g:344:3: ( rule__Atributo__Group__0 )
            // InternalGramatica.g:344:4: rule__Atributo__Group__0
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
    // InternalGramatica.g:353:1: entryRuleTermino : ruleTermino EOF ;
    public final void entryRuleTermino() throws RecognitionException {
        try {
            // InternalGramatica.g:354:1: ( ruleTermino EOF )
            // InternalGramatica.g:355:1: ruleTermino EOF
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
    // InternalGramatica.g:362:1: ruleTermino : ( ( rule__Termino__Group__0 ) ) ;
    public final void ruleTermino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:366:2: ( ( ( rule__Termino__Group__0 ) ) )
            // InternalGramatica.g:367:2: ( ( rule__Termino__Group__0 ) )
            {
            // InternalGramatica.g:367:2: ( ( rule__Termino__Group__0 ) )
            // InternalGramatica.g:368:3: ( rule__Termino__Group__0 )
            {
             before(grammarAccess.getTerminoAccess().getGroup()); 
            // InternalGramatica.g:369:3: ( rule__Termino__Group__0 )
            // InternalGramatica.g:369:4: rule__Termino__Group__0
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
    // InternalGramatica.g:378:1: entryRuleObligacion : ruleObligacion EOF ;
    public final void entryRuleObligacion() throws RecognitionException {
        try {
            // InternalGramatica.g:379:1: ( ruleObligacion EOF )
            // InternalGramatica.g:380:1: ruleObligacion EOF
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
    // InternalGramatica.g:387:1: ruleObligacion : ( ( rule__Obligacion__Group__0 ) ) ;
    public final void ruleObligacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:391:2: ( ( ( rule__Obligacion__Group__0 ) ) )
            // InternalGramatica.g:392:2: ( ( rule__Obligacion__Group__0 ) )
            {
            // InternalGramatica.g:392:2: ( ( rule__Obligacion__Group__0 ) )
            // InternalGramatica.g:393:3: ( rule__Obligacion__Group__0 )
            {
             before(grammarAccess.getObligacionAccess().getGroup()); 
            // InternalGramatica.g:394:3: ( rule__Obligacion__Group__0 )
            // InternalGramatica.g:394:4: rule__Obligacion__Group__0
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
    // InternalGramatica.g:403:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalGramatica.g:404:1: ( ruleOperacion EOF )
            // InternalGramatica.g:405:1: ruleOperacion EOF
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
    // InternalGramatica.g:412:1: ruleOperacion : ( ( rule__Operacion__OperacionAssignment ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:416:2: ( ( ( rule__Operacion__OperacionAssignment ) ) )
            // InternalGramatica.g:417:2: ( ( rule__Operacion__OperacionAssignment ) )
            {
            // InternalGramatica.g:417:2: ( ( rule__Operacion__OperacionAssignment ) )
            // InternalGramatica.g:418:3: ( rule__Operacion__OperacionAssignment )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAssignment()); 
            // InternalGramatica.g:419:3: ( rule__Operacion__OperacionAssignment )
            // InternalGramatica.g:419:4: rule__Operacion__OperacionAssignment
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


    // $ANTLR start "rule__Contenido__SimpleAlternatives_0_0"
    // InternalGramatica.g:452:1: rule__Contenido__SimpleAlternatives_0_0 : ( ( ruleSimple ) | ( ruleIteracion ) );
    public final void rule__Contenido__SimpleAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:456:1: ( ( ruleSimple ) | ( ruleIteracion ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGramatica.g:457:2: ( ruleSimple )
                    {
                    // InternalGramatica.g:457:2: ( ruleSimple )
                    // InternalGramatica.g:458:3: ruleSimple
                    {
                     before(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getContenidoAccess().getSimpleSimpleParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:463:2: ( ruleIteracion )
                    {
                    // InternalGramatica.g:463:2: ( ruleIteracion )
                    // InternalGramatica.g:464:3: ruleIteracion
                    {
                     before(grammarAccess.getContenidoAccess().getSimpleIteracionParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIteracion();

                    state._fsp--;

                     after(grammarAccess.getContenidoAccess().getSimpleIteracionParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Contenido__SimpleAlternatives_0_0"


    // $ANTLR start "rule__Nexo__ValorAlternatives_0"
    // InternalGramatica.g:473:1: rule__Nexo__ValorAlternatives_0 : ( ( 'y' ) | ( 'o' ) );
    public final void rule__Nexo__ValorAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:477:1: ( ( 'y' ) | ( 'o' ) )
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


    // $ANTLR start "rule__Expresion__ExpresionAlternatives_0"
    // InternalGramatica.g:494:1: rule__Expresion__ExpresionAlternatives_0 : ( ( ruleLiteral ) | ( rulePropiedad ) );
    public final void rule__Expresion__ExpresionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:498:1: ( ( ruleLiteral ) | ( rulePropiedad ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramatica.g:499:2: ( ruleLiteral )
                    {
                    // InternalGramatica.g:499:2: ( ruleLiteral )
                    // InternalGramatica.g:500:3: ruleLiteral
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
                    // InternalGramatica.g:505:2: ( rulePropiedad )
                    {
                    // InternalGramatica.g:505:2: ( rulePropiedad )
                    // InternalGramatica.g:506:3: rulePropiedad
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


    // $ANTLR start "rule__Atributo__PrefijoAlternatives_1_0"
    // InternalGramatica.g:515:1: rule__Atributo__PrefijoAlternatives_1_0 : ( ( 'cantidad de' ) | ( 'seleccion de' ) );
    public final void rule__Atributo__PrefijoAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:519:1: ( ( 'cantidad de' ) | ( 'seleccion de' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGramatica.g:520:2: ( 'cantidad de' )
                    {
                    // InternalGramatica.g:520:2: ( 'cantidad de' )
                    // InternalGramatica.g:521:3: 'cantidad de'
                    {
                     before(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getPrefijoCantidadDeKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:526:2: ( 'seleccion de' )
                    {
                    // InternalGramatica.g:526:2: ( 'seleccion de' )
                    // InternalGramatica.g:527:3: 'seleccion de'
                    {
                     before(grammarAccess.getAtributoAccess().getPrefijoSeleccionDeKeyword_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAtributoAccess().getPrefijoSeleccionDeKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Atributo__PrefijoAlternatives_1_0"


    // $ANTLR start "rule__Operacion__OperacionAlternatives_0"
    // InternalGramatica.g:536:1: rule__Operacion__OperacionAlternatives_0 : ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) );
    public final void rule__Operacion__OperacionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:540:1: ( ( 'mayor que' ) | ( 'menor que' ) | ( 'igual a' ) | ( 'mayor o igual a' ) | ( 'menor o igual a' ) | ( 'distinto de' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGramatica.g:541:2: ( 'mayor que' )
                    {
                    // InternalGramatica.g:541:2: ( 'mayor que' )
                    // InternalGramatica.g:542:3: 'mayor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorQueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramatica.g:547:2: ( 'menor que' )
                    {
                    // InternalGramatica.g:547:2: ( 'menor que' )
                    // InternalGramatica.g:548:3: 'menor que'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorQueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramatica.g:553:2: ( 'igual a' )
                    {
                    // InternalGramatica.g:553:2: ( 'igual a' )
                    // InternalGramatica.g:554:3: 'igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionIgualAKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramatica.g:559:2: ( 'mayor o igual a' )
                    {
                    // InternalGramatica.g:559:2: ( 'mayor o igual a' )
                    // InternalGramatica.g:560:3: 'mayor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMayorOIgualAKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramatica.g:565:2: ( 'menor o igual a' )
                    {
                    // InternalGramatica.g:565:2: ( 'menor o igual a' )
                    // InternalGramatica.g:566:3: 'menor o igual a'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperacionAccess().getOperacionMenorOIgualAKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramatica.g:571:2: ( 'distinto de' )
                    {
                    // InternalGramatica.g:571:2: ( 'distinto de' )
                    // InternalGramatica.g:572:3: 'distinto de'
                    {
                     before(grammarAccess.getOperacionAccess().getOperacionDistintoDeKeyword_0_5()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Oracion__Group__0"
    // InternalGramatica.g:581:1: rule__Oracion__Group__0 : rule__Oracion__Group__0__Impl rule__Oracion__Group__1 ;
    public final void rule__Oracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:585:1: ( rule__Oracion__Group__0__Impl rule__Oracion__Group__1 )
            // InternalGramatica.g:586:2: rule__Oracion__Group__0__Impl rule__Oracion__Group__1
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
    // InternalGramatica.g:593:1: rule__Oracion__Group__0__Impl : ( ( rule__Oracion__ContenidoAssignment_0 ) ) ;
    public final void rule__Oracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:597:1: ( ( ( rule__Oracion__ContenidoAssignment_0 ) ) )
            // InternalGramatica.g:598:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            {
            // InternalGramatica.g:598:1: ( ( rule__Oracion__ContenidoAssignment_0 ) )
            // InternalGramatica.g:599:2: ( rule__Oracion__ContenidoAssignment_0 )
            {
             before(grammarAccess.getOracionAccess().getContenidoAssignment_0()); 
            // InternalGramatica.g:600:2: ( rule__Oracion__ContenidoAssignment_0 )
            // InternalGramatica.g:600:3: rule__Oracion__ContenidoAssignment_0
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
    // InternalGramatica.g:608:1: rule__Oracion__Group__1 : rule__Oracion__Group__1__Impl ;
    public final void rule__Oracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:612:1: ( rule__Oracion__Group__1__Impl )
            // InternalGramatica.g:613:2: rule__Oracion__Group__1__Impl
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
    // InternalGramatica.g:619:1: rule__Oracion__Group__1__Impl : ( ruleFinOracion ) ;
    public final void rule__Oracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:623:1: ( ( ruleFinOracion ) )
            // InternalGramatica.g:624:1: ( ruleFinOracion )
            {
            // InternalGramatica.g:624:1: ( ruleFinOracion )
            // InternalGramatica.g:625:2: ruleFinOracion
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


    // $ANTLR start "rule__Iteracion__Group__0"
    // InternalGramatica.g:635:1: rule__Iteracion__Group__0 : rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1 ;
    public final void rule__Iteracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:639:1: ( rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1 )
            // InternalGramatica.g:640:2: rule__Iteracion__Group__0__Impl rule__Iteracion__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGramatica.g:647:1: rule__Iteracion__Group__0__Impl : ( ( rule__Iteracion__PropiedadAssignment_0 ) ) ;
    public final void rule__Iteracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:651:1: ( ( ( rule__Iteracion__PropiedadAssignment_0 ) ) )
            // InternalGramatica.g:652:1: ( ( rule__Iteracion__PropiedadAssignment_0 ) )
            {
            // InternalGramatica.g:652:1: ( ( rule__Iteracion__PropiedadAssignment_0 ) )
            // InternalGramatica.g:653:2: ( rule__Iteracion__PropiedadAssignment_0 )
            {
             before(grammarAccess.getIteracionAccess().getPropiedadAssignment_0()); 
            // InternalGramatica.g:654:2: ( rule__Iteracion__PropiedadAssignment_0 )
            // InternalGramatica.g:654:3: rule__Iteracion__PropiedadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__PropiedadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getPropiedadAssignment_0()); 

            }


            }

        }
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
    // InternalGramatica.g:662:1: rule__Iteracion__Group__1 : rule__Iteracion__Group__1__Impl rule__Iteracion__Group__2 ;
    public final void rule__Iteracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:666:1: ( rule__Iteracion__Group__1__Impl rule__Iteracion__Group__2 )
            // InternalGramatica.g:667:2: rule__Iteracion__Group__1__Impl rule__Iteracion__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Iteracion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__2();

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
    // InternalGramatica.g:674:1: rule__Iteracion__Group__1__Impl : ( ( rule__Iteracion__ConectorAssignment_1 ) ) ;
    public final void rule__Iteracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:678:1: ( ( ( rule__Iteracion__ConectorAssignment_1 ) ) )
            // InternalGramatica.g:679:1: ( ( rule__Iteracion__ConectorAssignment_1 ) )
            {
            // InternalGramatica.g:679:1: ( ( rule__Iteracion__ConectorAssignment_1 ) )
            // InternalGramatica.g:680:2: ( rule__Iteracion__ConectorAssignment_1 )
            {
             before(grammarAccess.getIteracionAccess().getConectorAssignment_1()); 
            // InternalGramatica.g:681:2: ( rule__Iteracion__ConectorAssignment_1 )
            // InternalGramatica.g:681:3: rule__Iteracion__ConectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__ConectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getConectorAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Iteracion__Group__2"
    // InternalGramatica.g:689:1: rule__Iteracion__Group__2 : rule__Iteracion__Group__2__Impl rule__Iteracion__Group__3 ;
    public final void rule__Iteracion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:693:1: ( rule__Iteracion__Group__2__Impl rule__Iteracion__Group__3 )
            // InternalGramatica.g:694:2: rule__Iteracion__Group__2__Impl rule__Iteracion__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Iteracion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__3();

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
    // $ANTLR end "rule__Iteracion__Group__2"


    // $ANTLR start "rule__Iteracion__Group__2__Impl"
    // InternalGramatica.g:701:1: rule__Iteracion__Group__2__Impl : ( ( rule__Iteracion__ContenidoAssignment_2 ) ) ;
    public final void rule__Iteracion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:705:1: ( ( ( rule__Iteracion__ContenidoAssignment_2 ) ) )
            // InternalGramatica.g:706:1: ( ( rule__Iteracion__ContenidoAssignment_2 ) )
            {
            // InternalGramatica.g:706:1: ( ( rule__Iteracion__ContenidoAssignment_2 ) )
            // InternalGramatica.g:707:2: ( rule__Iteracion__ContenidoAssignment_2 )
            {
             before(grammarAccess.getIteracionAccess().getContenidoAssignment_2()); 
            // InternalGramatica.g:708:2: ( rule__Iteracion__ContenidoAssignment_2 )
            // InternalGramatica.g:708:3: rule__Iteracion__ContenidoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__ContenidoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIteracionAccess().getContenidoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__Group__2__Impl"


    // $ANTLR start "rule__Iteracion__Group__3"
    // InternalGramatica.g:716:1: rule__Iteracion__Group__3 : rule__Iteracion__Group__3__Impl rule__Iteracion__Group__4 ;
    public final void rule__Iteracion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:720:1: ( rule__Iteracion__Group__3__Impl rule__Iteracion__Group__4 )
            // InternalGramatica.g:721:2: rule__Iteracion__Group__3__Impl rule__Iteracion__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Iteracion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__4();

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
    // $ANTLR end "rule__Iteracion__Group__3"


    // $ANTLR start "rule__Iteracion__Group__3__Impl"
    // InternalGramatica.g:728:1: rule__Iteracion__Group__3__Impl : ( ( rule__Iteracion__ComparacionAssignment_3 )? ) ;
    public final void rule__Iteracion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:732:1: ( ( ( rule__Iteracion__ComparacionAssignment_3 )? ) )
            // InternalGramatica.g:733:1: ( ( rule__Iteracion__ComparacionAssignment_3 )? )
            {
            // InternalGramatica.g:733:1: ( ( rule__Iteracion__ComparacionAssignment_3 )? )
            // InternalGramatica.g:734:2: ( rule__Iteracion__ComparacionAssignment_3 )?
            {
             before(grammarAccess.getIteracionAccess().getComparacionAssignment_3()); 
            // InternalGramatica.g:735:2: ( rule__Iteracion__ComparacionAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramatica.g:735:3: rule__Iteracion__ComparacionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Iteracion__ComparacionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIteracionAccess().getComparacionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__Group__3__Impl"


    // $ANTLR start "rule__Iteracion__Group__4"
    // InternalGramatica.g:743:1: rule__Iteracion__Group__4 : rule__Iteracion__Group__4__Impl ;
    public final void rule__Iteracion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:747:1: ( rule__Iteracion__Group__4__Impl )
            // InternalGramatica.g:748:2: rule__Iteracion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iteracion__Group__4__Impl();

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
    // $ANTLR end "rule__Iteracion__Group__4"


    // $ANTLR start "rule__Iteracion__Group__4__Impl"
    // InternalGramatica.g:754:1: rule__Iteracion__Group__4__Impl : ( ( rule__Iteracion__ExpresionAssignment_4 )? ) ;
    public final void rule__Iteracion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:758:1: ( ( ( rule__Iteracion__ExpresionAssignment_4 )? ) )
            // InternalGramatica.g:759:1: ( ( rule__Iteracion__ExpresionAssignment_4 )? )
            {
            // InternalGramatica.g:759:1: ( ( rule__Iteracion__ExpresionAssignment_4 )? )
            // InternalGramatica.g:760:2: ( rule__Iteracion__ExpresionAssignment_4 )?
            {
             before(grammarAccess.getIteracionAccess().getExpresionAssignment_4()); 
            // InternalGramatica.g:761:2: ( rule__Iteracion__ExpresionAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGramatica.g:761:3: rule__Iteracion__ExpresionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Iteracion__ExpresionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIteracionAccess().getExpresionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__Group__4__Impl"


    // $ANTLR start "rule__Contenido__Group__0"
    // InternalGramatica.g:770:1: rule__Contenido__Group__0 : rule__Contenido__Group__0__Impl rule__Contenido__Group__1 ;
    public final void rule__Contenido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:774:1: ( rule__Contenido__Group__0__Impl rule__Contenido__Group__1 )
            // InternalGramatica.g:775:2: rule__Contenido__Group__0__Impl rule__Contenido__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGramatica.g:782:1: rule__Contenido__Group__0__Impl : ( ( rule__Contenido__SimpleAssignment_0 ) ) ;
    public final void rule__Contenido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:786:1: ( ( ( rule__Contenido__SimpleAssignment_0 ) ) )
            // InternalGramatica.g:787:1: ( ( rule__Contenido__SimpleAssignment_0 ) )
            {
            // InternalGramatica.g:787:1: ( ( rule__Contenido__SimpleAssignment_0 ) )
            // InternalGramatica.g:788:2: ( rule__Contenido__SimpleAssignment_0 )
            {
             before(grammarAccess.getContenidoAccess().getSimpleAssignment_0()); 
            // InternalGramatica.g:789:2: ( rule__Contenido__SimpleAssignment_0 )
            // InternalGramatica.g:789:3: rule__Contenido__SimpleAssignment_0
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
    // InternalGramatica.g:797:1: rule__Contenido__Group__1 : rule__Contenido__Group__1__Impl ;
    public final void rule__Contenido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:801:1: ( rule__Contenido__Group__1__Impl )
            // InternalGramatica.g:802:2: rule__Contenido__Group__1__Impl
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
    // InternalGramatica.g:808:1: rule__Contenido__Group__1__Impl : ( ( rule__Contenido__ComposicionAssignment_1 )? ) ;
    public final void rule__Contenido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:812:1: ( ( ( rule__Contenido__ComposicionAssignment_1 )? ) )
            // InternalGramatica.g:813:1: ( ( rule__Contenido__ComposicionAssignment_1 )? )
            {
            // InternalGramatica.g:813:1: ( ( rule__Contenido__ComposicionAssignment_1 )? )
            // InternalGramatica.g:814:2: ( rule__Contenido__ComposicionAssignment_1 )?
            {
             before(grammarAccess.getContenidoAccess().getComposicionAssignment_1()); 
            // InternalGramatica.g:815:2: ( rule__Contenido__ComposicionAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGramatica.g:815:3: rule__Contenido__ComposicionAssignment_1
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
    // InternalGramatica.g:824:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:828:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalGramatica.g:829:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGramatica.g:836:1: rule__Simple__Group__0__Impl : ( ( rule__Simple__Expresion_izqAssignment_0 ) ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:840:1: ( ( ( rule__Simple__Expresion_izqAssignment_0 ) ) )
            // InternalGramatica.g:841:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            {
            // InternalGramatica.g:841:1: ( ( rule__Simple__Expresion_izqAssignment_0 ) )
            // InternalGramatica.g:842:2: ( rule__Simple__Expresion_izqAssignment_0 )
            {
             before(grammarAccess.getSimpleAccess().getExpresion_izqAssignment_0()); 
            // InternalGramatica.g:843:2: ( rule__Simple__Expresion_izqAssignment_0 )
            // InternalGramatica.g:843:3: rule__Simple__Expresion_izqAssignment_0
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
    // InternalGramatica.g:851:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:855:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalGramatica.g:856:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalGramatica.g:863:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__ComparacionAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:867:1: ( ( ( rule__Simple__ComparacionAssignment_1 ) ) )
            // InternalGramatica.g:868:1: ( ( rule__Simple__ComparacionAssignment_1 ) )
            {
            // InternalGramatica.g:868:1: ( ( rule__Simple__ComparacionAssignment_1 ) )
            // InternalGramatica.g:869:2: ( rule__Simple__ComparacionAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getComparacionAssignment_1()); 
            // InternalGramatica.g:870:2: ( rule__Simple__ComparacionAssignment_1 )
            // InternalGramatica.g:870:3: rule__Simple__ComparacionAssignment_1
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
    // InternalGramatica.g:878:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:882:1: ( rule__Simple__Group__2__Impl )
            // InternalGramatica.g:883:2: rule__Simple__Group__2__Impl
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
    // InternalGramatica.g:889:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__Expresion_derAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:893:1: ( ( ( rule__Simple__Expresion_derAssignment_2 ) ) )
            // InternalGramatica.g:894:1: ( ( rule__Simple__Expresion_derAssignment_2 ) )
            {
            // InternalGramatica.g:894:1: ( ( rule__Simple__Expresion_derAssignment_2 ) )
            // InternalGramatica.g:895:2: ( rule__Simple__Expresion_derAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getExpresion_derAssignment_2()); 
            // InternalGramatica.g:896:2: ( rule__Simple__Expresion_derAssignment_2 )
            // InternalGramatica.g:896:3: rule__Simple__Expresion_derAssignment_2
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
    // InternalGramatica.g:905:1: rule__Composicion__Group__0 : rule__Composicion__Group__0__Impl rule__Composicion__Group__1 ;
    public final void rule__Composicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:909:1: ( rule__Composicion__Group__0__Impl rule__Composicion__Group__1 )
            // InternalGramatica.g:910:2: rule__Composicion__Group__0__Impl rule__Composicion__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGramatica.g:917:1: rule__Composicion__Group__0__Impl : ( ( rule__Composicion__NexoAssignment_0 ) ) ;
    public final void rule__Composicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:921:1: ( ( ( rule__Composicion__NexoAssignment_0 ) ) )
            // InternalGramatica.g:922:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            {
            // InternalGramatica.g:922:1: ( ( rule__Composicion__NexoAssignment_0 ) )
            // InternalGramatica.g:923:2: ( rule__Composicion__NexoAssignment_0 )
            {
             before(grammarAccess.getComposicionAccess().getNexoAssignment_0()); 
            // InternalGramatica.g:924:2: ( rule__Composicion__NexoAssignment_0 )
            // InternalGramatica.g:924:3: rule__Composicion__NexoAssignment_0
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
    // InternalGramatica.g:932:1: rule__Composicion__Group__1 : rule__Composicion__Group__1__Impl ;
    public final void rule__Composicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:936:1: ( rule__Composicion__Group__1__Impl )
            // InternalGramatica.g:937:2: rule__Composicion__Group__1__Impl
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
    // InternalGramatica.g:943:1: rule__Composicion__Group__1__Impl : ( ( rule__Composicion__ContenidoAssignment_1 ) ) ;
    public final void rule__Composicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:947:1: ( ( ( rule__Composicion__ContenidoAssignment_1 ) ) )
            // InternalGramatica.g:948:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            {
            // InternalGramatica.g:948:1: ( ( rule__Composicion__ContenidoAssignment_1 ) )
            // InternalGramatica.g:949:2: ( rule__Composicion__ContenidoAssignment_1 )
            {
             before(grammarAccess.getComposicionAccess().getContenidoAssignment_1()); 
            // InternalGramatica.g:950:2: ( rule__Composicion__ContenidoAssignment_1 )
            // InternalGramatica.g:950:3: rule__Composicion__ContenidoAssignment_1
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
    // InternalGramatica.g:959:1: rule__Comparacion__Group__0 : rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 ;
    public final void rule__Comparacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:963:1: ( rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1 )
            // InternalGramatica.g:964:2: rule__Comparacion__Group__0__Impl rule__Comparacion__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGramatica.g:971:1: rule__Comparacion__Group__0__Impl : ( ( rule__Comparacion__ObligacionAssignment_0 ) ) ;
    public final void rule__Comparacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:975:1: ( ( ( rule__Comparacion__ObligacionAssignment_0 ) ) )
            // InternalGramatica.g:976:1: ( ( rule__Comparacion__ObligacionAssignment_0 ) )
            {
            // InternalGramatica.g:976:1: ( ( rule__Comparacion__ObligacionAssignment_0 ) )
            // InternalGramatica.g:977:2: ( rule__Comparacion__ObligacionAssignment_0 )
            {
             before(grammarAccess.getComparacionAccess().getObligacionAssignment_0()); 
            // InternalGramatica.g:978:2: ( rule__Comparacion__ObligacionAssignment_0 )
            // InternalGramatica.g:978:3: rule__Comparacion__ObligacionAssignment_0
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
    // InternalGramatica.g:986:1: rule__Comparacion__Group__1 : rule__Comparacion__Group__1__Impl ;
    public final void rule__Comparacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:990:1: ( rule__Comparacion__Group__1__Impl )
            // InternalGramatica.g:991:2: rule__Comparacion__Group__1__Impl
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
    // InternalGramatica.g:997:1: rule__Comparacion__Group__1__Impl : ( ( rule__Comparacion__OperacionAssignment_1 ) ) ;
    public final void rule__Comparacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1001:1: ( ( ( rule__Comparacion__OperacionAssignment_1 ) ) )
            // InternalGramatica.g:1002:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            {
            // InternalGramatica.g:1002:1: ( ( rule__Comparacion__OperacionAssignment_1 ) )
            // InternalGramatica.g:1003:2: ( rule__Comparacion__OperacionAssignment_1 )
            {
             before(grammarAccess.getComparacionAccess().getOperacionAssignment_1()); 
            // InternalGramatica.g:1004:2: ( rule__Comparacion__OperacionAssignment_1 )
            // InternalGramatica.g:1004:3: rule__Comparacion__OperacionAssignment_1
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
    // InternalGramatica.g:1013:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1017:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // InternalGramatica.g:1018:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGramatica.g:1025:1: rule__Propiedad__Group__0__Impl : ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1029:1: ( ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) ) )
            // InternalGramatica.g:1030:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            {
            // InternalGramatica.g:1030:1: ( ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* ) )
            // InternalGramatica.g:1031:2: ( ( rule__Propiedad__AtributoAssignment_0 ) ) ( ( rule__Propiedad__AtributoAssignment_0 )* )
            {
            // InternalGramatica.g:1031:2: ( ( rule__Propiedad__AtributoAssignment_0 ) )
            // InternalGramatica.g:1032:3: ( rule__Propiedad__AtributoAssignment_0 )
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalGramatica.g:1033:3: ( rule__Propiedad__AtributoAssignment_0 )
            // InternalGramatica.g:1033:4: rule__Propiedad__AtributoAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__Propiedad__AtributoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 

            }

            // InternalGramatica.g:1036:2: ( ( rule__Propiedad__AtributoAssignment_0 )* )
            // InternalGramatica.g:1037:3: ( rule__Propiedad__AtributoAssignment_0 )*
            {
             before(grammarAccess.getPropiedadAccess().getAtributoAssignment_0()); 
            // InternalGramatica.g:1038:3: ( rule__Propiedad__AtributoAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==RULE_ID) ) {
                            int LA10_5 = input.LA(4);

                            if ( (LA10_5==24) ) {
                                alt10=1;
                            }


                        }


                        }
                        break;
                    case 15:
                        {
                        int LA10_4 = input.LA(3);

                        if ( (LA10_4==RULE_ID) ) {
                            int LA10_5 = input.LA(4);

                            if ( (LA10_5==24) ) {
                                alt10=1;
                            }


                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        int LA10_5 = input.LA(3);

                        if ( (LA10_5==24) ) {
                            alt10=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt10) {
            	case 1 :
            	    // InternalGramatica.g:1038:4: rule__Propiedad__AtributoAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalGramatica.g:1047:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1051:1: ( rule__Propiedad__Group__1__Impl )
            // InternalGramatica.g:1052:2: rule__Propiedad__Group__1__Impl
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
    // InternalGramatica.g:1058:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__TerminoAssignment_1 )? ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1062:1: ( ( ( rule__Propiedad__TerminoAssignment_1 )? ) )
            // InternalGramatica.g:1063:1: ( ( rule__Propiedad__TerminoAssignment_1 )? )
            {
            // InternalGramatica.g:1063:1: ( ( rule__Propiedad__TerminoAssignment_1 )? )
            // InternalGramatica.g:1064:2: ( rule__Propiedad__TerminoAssignment_1 )?
            {
             before(grammarAccess.getPropiedadAccess().getTerminoAssignment_1()); 
            // InternalGramatica.g:1065:2: ( rule__Propiedad__TerminoAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramatica.g:1065:3: rule__Propiedad__TerminoAssignment_1
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


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalGramatica.g:1074:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1078:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalGramatica.g:1079:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGramatica.g:1086:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__DeterminanteAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1090:1: ( ( ( rule__Atributo__DeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:1091:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:1091:1: ( ( rule__Atributo__DeterminanteAssignment_0 ) )
            // InternalGramatica.g:1092:2: ( rule__Atributo__DeterminanteAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteAssignment_0()); 
            // InternalGramatica.g:1093:2: ( rule__Atributo__DeterminanteAssignment_0 )
            // InternalGramatica.g:1093:3: rule__Atributo__DeterminanteAssignment_0
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
    // InternalGramatica.g:1101:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1105:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalGramatica.g:1106:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGramatica.g:1113:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__PrefijoAssignment_1 )? ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1117:1: ( ( ( rule__Atributo__PrefijoAssignment_1 )? ) )
            // InternalGramatica.g:1118:1: ( ( rule__Atributo__PrefijoAssignment_1 )? )
            {
            // InternalGramatica.g:1118:1: ( ( rule__Atributo__PrefijoAssignment_1 )? )
            // InternalGramatica.g:1119:2: ( rule__Atributo__PrefijoAssignment_1 )?
            {
             before(grammarAccess.getAtributoAccess().getPrefijoAssignment_1()); 
            // InternalGramatica.g:1120:2: ( rule__Atributo__PrefijoAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=15)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGramatica.g:1120:3: rule__Atributo__PrefijoAssignment_1
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
    // InternalGramatica.g:1128:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1132:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // InternalGramatica.g:1133:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGramatica.g:1140:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NombreAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1144:1: ( ( ( rule__Atributo__NombreAssignment_2 ) ) )
            // InternalGramatica.g:1145:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            {
            // InternalGramatica.g:1145:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            // InternalGramatica.g:1146:2: ( rule__Atributo__NombreAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 
            // InternalGramatica.g:1147:2: ( rule__Atributo__NombreAssignment_2 )
            // InternalGramatica.g:1147:3: rule__Atributo__NombreAssignment_2
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
    // InternalGramatica.g:1155:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1159:1: ( rule__Atributo__Group__3__Impl )
            // InternalGramatica.g:1160:2: rule__Atributo__Group__3__Impl
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
    // InternalGramatica.g:1166:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__EnlaceAssignment_3 ) ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1170:1: ( ( ( rule__Atributo__EnlaceAssignment_3 ) ) )
            // InternalGramatica.g:1171:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            {
            // InternalGramatica.g:1171:1: ( ( rule__Atributo__EnlaceAssignment_3 ) )
            // InternalGramatica.g:1172:2: ( rule__Atributo__EnlaceAssignment_3 )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceAssignment_3()); 
            // InternalGramatica.g:1173:2: ( rule__Atributo__EnlaceAssignment_3 )
            // InternalGramatica.g:1173:3: rule__Atributo__EnlaceAssignment_3
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
    // InternalGramatica.g:1182:1: rule__Termino__Group__0 : rule__Termino__Group__0__Impl rule__Termino__Group__1 ;
    public final void rule__Termino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1186:1: ( rule__Termino__Group__0__Impl rule__Termino__Group__1 )
            // InternalGramatica.g:1187:2: rule__Termino__Group__0__Impl rule__Termino__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGramatica.g:1194:1: rule__Termino__Group__0__Impl : ( ( rule__Termino__IndeterminanteAssignment_0 ) ) ;
    public final void rule__Termino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1198:1: ( ( ( rule__Termino__IndeterminanteAssignment_0 ) ) )
            // InternalGramatica.g:1199:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            {
            // InternalGramatica.g:1199:1: ( ( rule__Termino__IndeterminanteAssignment_0 ) )
            // InternalGramatica.g:1200:2: ( rule__Termino__IndeterminanteAssignment_0 )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteAssignment_0()); 
            // InternalGramatica.g:1201:2: ( rule__Termino__IndeterminanteAssignment_0 )
            // InternalGramatica.g:1201:3: rule__Termino__IndeterminanteAssignment_0
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
    // InternalGramatica.g:1209:1: rule__Termino__Group__1 : rule__Termino__Group__1__Impl ;
    public final void rule__Termino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1213:1: ( rule__Termino__Group__1__Impl )
            // InternalGramatica.g:1214:2: rule__Termino__Group__1__Impl
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
    // InternalGramatica.g:1220:1: rule__Termino__Group__1__Impl : ( ( rule__Termino__ContextoAssignment_1 ) ) ;
    public final void rule__Termino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1224:1: ( ( ( rule__Termino__ContextoAssignment_1 ) ) )
            // InternalGramatica.g:1225:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            {
            // InternalGramatica.g:1225:1: ( ( rule__Termino__ContextoAssignment_1 ) )
            // InternalGramatica.g:1226:2: ( rule__Termino__ContextoAssignment_1 )
            {
             before(grammarAccess.getTerminoAccess().getContextoAssignment_1()); 
            // InternalGramatica.g:1227:2: ( rule__Termino__ContextoAssignment_1 )
            // InternalGramatica.g:1227:3: rule__Termino__ContextoAssignment_1
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
    // InternalGramatica.g:1236:1: rule__Obligacion__Group__0 : rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 ;
    public final void rule__Obligacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1240:1: ( rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1 )
            // InternalGramatica.g:1241:2: rule__Obligacion__Group__0__Impl rule__Obligacion__Group__1
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
    // InternalGramatica.g:1248:1: rule__Obligacion__Group__0__Impl : ( ( rule__Obligacion__NegacionAssignment_0 )? ) ;
    public final void rule__Obligacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1252:1: ( ( ( rule__Obligacion__NegacionAssignment_0 )? ) )
            // InternalGramatica.g:1253:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            {
            // InternalGramatica.g:1253:1: ( ( rule__Obligacion__NegacionAssignment_0 )? )
            // InternalGramatica.g:1254:2: ( rule__Obligacion__NegacionAssignment_0 )?
            {
             before(grammarAccess.getObligacionAccess().getNegacionAssignment_0()); 
            // InternalGramatica.g:1255:2: ( rule__Obligacion__NegacionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGramatica.g:1255:3: rule__Obligacion__NegacionAssignment_0
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
    // InternalGramatica.g:1263:1: rule__Obligacion__Group__1 : rule__Obligacion__Group__1__Impl ;
    public final void rule__Obligacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1267:1: ( rule__Obligacion__Group__1__Impl )
            // InternalGramatica.g:1268:2: rule__Obligacion__Group__1__Impl
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
    // InternalGramatica.g:1274:1: rule__Obligacion__Group__1__Impl : ( ( rule__Obligacion__ObligacionAssignment_1 ) ) ;
    public final void rule__Obligacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1278:1: ( ( ( rule__Obligacion__ObligacionAssignment_1 ) ) )
            // InternalGramatica.g:1279:1: ( ( rule__Obligacion__ObligacionAssignment_1 ) )
            {
            // InternalGramatica.g:1279:1: ( ( rule__Obligacion__ObligacionAssignment_1 ) )
            // InternalGramatica.g:1280:2: ( rule__Obligacion__ObligacionAssignment_1 )
            {
             before(grammarAccess.getObligacionAccess().getObligacionAssignment_1()); 
            // InternalGramatica.g:1281:2: ( rule__Obligacion__ObligacionAssignment_1 )
            // InternalGramatica.g:1281:3: rule__Obligacion__ObligacionAssignment_1
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


    // $ANTLR start "rule__Documento__OracionesAssignment"
    // InternalGramatica.g:1290:1: rule__Documento__OracionesAssignment : ( ruleOracion ) ;
    public final void rule__Documento__OracionesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1294:1: ( ( ruleOracion ) )
            // InternalGramatica.g:1295:2: ( ruleOracion )
            {
            // InternalGramatica.g:1295:2: ( ruleOracion )
            // InternalGramatica.g:1296:3: ruleOracion
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


    // $ANTLR start "rule__Oracion__ContenidoAssignment_0"
    // InternalGramatica.g:1305:1: rule__Oracion__ContenidoAssignment_0 : ( ruleContenido ) ;
    public final void rule__Oracion__ContenidoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1309:1: ( ( ruleContenido ) )
            // InternalGramatica.g:1310:2: ( ruleContenido )
            {
            // InternalGramatica.g:1310:2: ( ruleContenido )
            // InternalGramatica.g:1311:3: ruleContenido
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


    // $ANTLR start "rule__Iteracion__PropiedadAssignment_0"
    // InternalGramatica.g:1320:1: rule__Iteracion__PropiedadAssignment_0 : ( rulePropiedad ) ;
    public final void rule__Iteracion__PropiedadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1324:1: ( ( rulePropiedad ) )
            // InternalGramatica.g:1325:2: ( rulePropiedad )
            {
            // InternalGramatica.g:1325:2: ( rulePropiedad )
            // InternalGramatica.g:1326:3: rulePropiedad
            {
             before(grammarAccess.getIteracionAccess().getPropiedadPropiedadParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getIteracionAccess().getPropiedadPropiedadParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__PropiedadAssignment_0"


    // $ANTLR start "rule__Iteracion__ConectorAssignment_1"
    // InternalGramatica.g:1335:1: rule__Iteracion__ConectorAssignment_1 : ( ( 'tal que' ) ) ;
    public final void rule__Iteracion__ConectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1339:1: ( ( ( 'tal que' ) ) )
            // InternalGramatica.g:1340:2: ( ( 'tal que' ) )
            {
            // InternalGramatica.g:1340:2: ( ( 'tal que' ) )
            // InternalGramatica.g:1341:3: ( 'tal que' )
            {
             before(grammarAccess.getIteracionAccess().getConectorTalQueKeyword_1_0()); 
            // InternalGramatica.g:1342:3: ( 'tal que' )
            // InternalGramatica.g:1343:4: 'tal que'
            {
             before(grammarAccess.getIteracionAccess().getConectorTalQueKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIteracionAccess().getConectorTalQueKeyword_1_0()); 

            }

             after(grammarAccess.getIteracionAccess().getConectorTalQueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__ConectorAssignment_1"


    // $ANTLR start "rule__Iteracion__ContenidoAssignment_2"
    // InternalGramatica.g:1354:1: rule__Iteracion__ContenidoAssignment_2 : ( ruleContenido ) ;
    public final void rule__Iteracion__ContenidoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1358:1: ( ( ruleContenido ) )
            // InternalGramatica.g:1359:2: ( ruleContenido )
            {
            // InternalGramatica.g:1359:2: ( ruleContenido )
            // InternalGramatica.g:1360:3: ruleContenido
            {
             before(grammarAccess.getIteracionAccess().getContenidoContenidoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getIteracionAccess().getContenidoContenidoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__ContenidoAssignment_2"


    // $ANTLR start "rule__Iteracion__ComparacionAssignment_3"
    // InternalGramatica.g:1369:1: rule__Iteracion__ComparacionAssignment_3 : ( ruleComparacion ) ;
    public final void rule__Iteracion__ComparacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1373:1: ( ( ruleComparacion ) )
            // InternalGramatica.g:1374:2: ( ruleComparacion )
            {
            // InternalGramatica.g:1374:2: ( ruleComparacion )
            // InternalGramatica.g:1375:3: ruleComparacion
            {
             before(grammarAccess.getIteracionAccess().getComparacionComparacionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComparacion();

            state._fsp--;

             after(grammarAccess.getIteracionAccess().getComparacionComparacionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__ComparacionAssignment_3"


    // $ANTLR start "rule__Iteracion__ExpresionAssignment_4"
    // InternalGramatica.g:1384:1: rule__Iteracion__ExpresionAssignment_4 : ( ruleExpresion ) ;
    public final void rule__Iteracion__ExpresionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1388:1: ( ( ruleExpresion ) )
            // InternalGramatica.g:1389:2: ( ruleExpresion )
            {
            // InternalGramatica.g:1389:2: ( ruleExpresion )
            // InternalGramatica.g:1390:3: ruleExpresion
            {
             before(grammarAccess.getIteracionAccess().getExpresionExpresionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getIteracionAccess().getExpresionExpresionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteracion__ExpresionAssignment_4"


    // $ANTLR start "rule__Contenido__SimpleAssignment_0"
    // InternalGramatica.g:1399:1: rule__Contenido__SimpleAssignment_0 : ( ( rule__Contenido__SimpleAlternatives_0_0 ) ) ;
    public final void rule__Contenido__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1403:1: ( ( ( rule__Contenido__SimpleAlternatives_0_0 ) ) )
            // InternalGramatica.g:1404:2: ( ( rule__Contenido__SimpleAlternatives_0_0 ) )
            {
            // InternalGramatica.g:1404:2: ( ( rule__Contenido__SimpleAlternatives_0_0 ) )
            // InternalGramatica.g:1405:3: ( rule__Contenido__SimpleAlternatives_0_0 )
            {
             before(grammarAccess.getContenidoAccess().getSimpleAlternatives_0_0()); 
            // InternalGramatica.g:1406:3: ( rule__Contenido__SimpleAlternatives_0_0 )
            // InternalGramatica.g:1406:4: rule__Contenido__SimpleAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__SimpleAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getSimpleAlternatives_0_0()); 

            }


            }

        }
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
    // InternalGramatica.g:1414:1: rule__Contenido__ComposicionAssignment_1 : ( ruleComposicion ) ;
    public final void rule__Contenido__ComposicionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1418:1: ( ( ruleComposicion ) )
            // InternalGramatica.g:1419:2: ( ruleComposicion )
            {
            // InternalGramatica.g:1419:2: ( ruleComposicion )
            // InternalGramatica.g:1420:3: ruleComposicion
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
    // InternalGramatica.g:1429:1: rule__Simple__Expresion_izqAssignment_0 : ( ruleExpresion ) ;
    public final void rule__Simple__Expresion_izqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1433:1: ( ( ruleExpresion ) )
            // InternalGramatica.g:1434:2: ( ruleExpresion )
            {
            // InternalGramatica.g:1434:2: ( ruleExpresion )
            // InternalGramatica.g:1435:3: ruleExpresion
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
    // InternalGramatica.g:1444:1: rule__Simple__ComparacionAssignment_1 : ( ruleComparacion ) ;
    public final void rule__Simple__ComparacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1448:1: ( ( ruleComparacion ) )
            // InternalGramatica.g:1449:2: ( ruleComparacion )
            {
            // InternalGramatica.g:1449:2: ( ruleComparacion )
            // InternalGramatica.g:1450:3: ruleComparacion
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
    // InternalGramatica.g:1459:1: rule__Simple__Expresion_derAssignment_2 : ( ruleExpresion ) ;
    public final void rule__Simple__Expresion_derAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1463:1: ( ( ruleExpresion ) )
            // InternalGramatica.g:1464:2: ( ruleExpresion )
            {
            // InternalGramatica.g:1464:2: ( ruleExpresion )
            // InternalGramatica.g:1465:3: ruleExpresion
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
    // InternalGramatica.g:1474:1: rule__Composicion__NexoAssignment_0 : ( ruleNexo ) ;
    public final void rule__Composicion__NexoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1478:1: ( ( ruleNexo ) )
            // InternalGramatica.g:1479:2: ( ruleNexo )
            {
            // InternalGramatica.g:1479:2: ( ruleNexo )
            // InternalGramatica.g:1480:3: ruleNexo
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
    // InternalGramatica.g:1489:1: rule__Composicion__ContenidoAssignment_1 : ( ruleContenido ) ;
    public final void rule__Composicion__ContenidoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1493:1: ( ( ruleContenido ) )
            // InternalGramatica.g:1494:2: ( ruleContenido )
            {
            // InternalGramatica.g:1494:2: ( ruleContenido )
            // InternalGramatica.g:1495:3: ruleContenido
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
    // InternalGramatica.g:1504:1: rule__Nexo__ValorAssignment : ( ( rule__Nexo__ValorAlternatives_0 ) ) ;
    public final void rule__Nexo__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1508:1: ( ( ( rule__Nexo__ValorAlternatives_0 ) ) )
            // InternalGramatica.g:1509:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            {
            // InternalGramatica.g:1509:2: ( ( rule__Nexo__ValorAlternatives_0 ) )
            // InternalGramatica.g:1510:3: ( rule__Nexo__ValorAlternatives_0 )
            {
             before(grammarAccess.getNexoAccess().getValorAlternatives_0()); 
            // InternalGramatica.g:1511:3: ( rule__Nexo__ValorAlternatives_0 )
            // InternalGramatica.g:1511:4: rule__Nexo__ValorAlternatives_0
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
    // InternalGramatica.g:1519:1: rule__Expresion__ExpresionAssignment : ( ( rule__Expresion__ExpresionAlternatives_0 ) ) ;
    public final void rule__Expresion__ExpresionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1523:1: ( ( ( rule__Expresion__ExpresionAlternatives_0 ) ) )
            // InternalGramatica.g:1524:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            {
            // InternalGramatica.g:1524:2: ( ( rule__Expresion__ExpresionAlternatives_0 ) )
            // InternalGramatica.g:1525:3: ( rule__Expresion__ExpresionAlternatives_0 )
            {
             before(grammarAccess.getExpresionAccess().getExpresionAlternatives_0()); 
            // InternalGramatica.g:1526:3: ( rule__Expresion__ExpresionAlternatives_0 )
            // InternalGramatica.g:1526:4: rule__Expresion__ExpresionAlternatives_0
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
    // InternalGramatica.g:1534:1: rule__Comparacion__ObligacionAssignment_0 : ( ruleObligacion ) ;
    public final void rule__Comparacion__ObligacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1538:1: ( ( ruleObligacion ) )
            // InternalGramatica.g:1539:2: ( ruleObligacion )
            {
            // InternalGramatica.g:1539:2: ( ruleObligacion )
            // InternalGramatica.g:1540:3: ruleObligacion
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
    // InternalGramatica.g:1549:1: rule__Comparacion__OperacionAssignment_1 : ( ruleOperacion ) ;
    public final void rule__Comparacion__OperacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1553:1: ( ( ruleOperacion ) )
            // InternalGramatica.g:1554:2: ( ruleOperacion )
            {
            // InternalGramatica.g:1554:2: ( ruleOperacion )
            // InternalGramatica.g:1555:3: ruleOperacion
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
    // InternalGramatica.g:1564:1: rule__Propiedad__AtributoAssignment_0 : ( ruleAtributo ) ;
    public final void rule__Propiedad__AtributoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1568:1: ( ( ruleAtributo ) )
            // InternalGramatica.g:1569:2: ( ruleAtributo )
            {
            // InternalGramatica.g:1569:2: ( ruleAtributo )
            // InternalGramatica.g:1570:3: ruleAtributo
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
    // InternalGramatica.g:1579:1: rule__Propiedad__TerminoAssignment_1 : ( ruleTermino ) ;
    public final void rule__Propiedad__TerminoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1583:1: ( ( ruleTermino ) )
            // InternalGramatica.g:1584:2: ( ruleTermino )
            {
            // InternalGramatica.g:1584:2: ( ruleTermino )
            // InternalGramatica.g:1585:3: ruleTermino
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
    // InternalGramatica.g:1594:1: rule__Atributo__DeterminanteAssignment_0 : ( ( 'el/la' ) ) ;
    public final void rule__Atributo__DeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1598:1: ( ( ( 'el/la' ) ) )
            // InternalGramatica.g:1599:2: ( ( 'el/la' ) )
            {
            // InternalGramatica.g:1599:2: ( ( 'el/la' ) )
            // InternalGramatica.g:1600:3: ( 'el/la' )
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); 
            // InternalGramatica.g:1601:3: ( 'el/la' )
            // InternalGramatica.g:1602:4: 'el/la'
            {
             before(grammarAccess.getAtributoAccess().getDeterminanteElLaKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGramatica.g:1613:1: rule__Atributo__PrefijoAssignment_1 : ( ( rule__Atributo__PrefijoAlternatives_1_0 ) ) ;
    public final void rule__Atributo__PrefijoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1617:1: ( ( ( rule__Atributo__PrefijoAlternatives_1_0 ) ) )
            // InternalGramatica.g:1618:2: ( ( rule__Atributo__PrefijoAlternatives_1_0 ) )
            {
            // InternalGramatica.g:1618:2: ( ( rule__Atributo__PrefijoAlternatives_1_0 ) )
            // InternalGramatica.g:1619:3: ( rule__Atributo__PrefijoAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoAccess().getPrefijoAlternatives_1_0()); 
            // InternalGramatica.g:1620:3: ( rule__Atributo__PrefijoAlternatives_1_0 )
            // InternalGramatica.g:1620:4: rule__Atributo__PrefijoAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__PrefijoAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getPrefijoAlternatives_1_0()); 

            }


            }

        }
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
    // InternalGramatica.g:1628:1: rule__Atributo__NombreAssignment_2 : ( RULE_ID ) ;
    public final void rule__Atributo__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1632:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1633:2: ( RULE_ID )
            {
            // InternalGramatica.g:1633:2: ( RULE_ID )
            // InternalGramatica.g:1634:3: RULE_ID
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
    // InternalGramatica.g:1643:1: rule__Atributo__EnlaceAssignment_3 : ( ( 'de' ) ) ;
    public final void rule__Atributo__EnlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1647:1: ( ( ( 'de' ) ) )
            // InternalGramatica.g:1648:2: ( ( 'de' ) )
            {
            // InternalGramatica.g:1648:2: ( ( 'de' ) )
            // InternalGramatica.g:1649:3: ( 'de' )
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            // InternalGramatica.g:1650:3: ( 'de' )
            // InternalGramatica.g:1651:4: 'de'
            {
             before(grammarAccess.getAtributoAccess().getEnlaceDeKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGramatica.g:1662:1: rule__Termino__IndeterminanteAssignment_0 : ( ( 'un/una' ) ) ;
    public final void rule__Termino__IndeterminanteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1666:1: ( ( ( 'un/una' ) ) )
            // InternalGramatica.g:1667:2: ( ( 'un/una' ) )
            {
            // InternalGramatica.g:1667:2: ( ( 'un/una' ) )
            // InternalGramatica.g:1668:3: ( 'un/una' )
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            // InternalGramatica.g:1669:3: ( 'un/una' )
            // InternalGramatica.g:1670:4: 'un/una'
            {
             before(grammarAccess.getTerminoAccess().getIndeterminanteUnUnaKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGramatica.g:1681:1: rule__Termino__ContextoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Termino__ContextoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1685:1: ( ( RULE_ID ) )
            // InternalGramatica.g:1686:2: ( RULE_ID )
            {
            // InternalGramatica.g:1686:2: ( RULE_ID )
            // InternalGramatica.g:1687:3: RULE_ID
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
    // InternalGramatica.g:1696:1: rule__Obligacion__NegacionAssignment_0 : ( ( 'no' ) ) ;
    public final void rule__Obligacion__NegacionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1700:1: ( ( ( 'no' ) ) )
            // InternalGramatica.g:1701:2: ( ( 'no' ) )
            {
            // InternalGramatica.g:1701:2: ( ( 'no' ) )
            // InternalGramatica.g:1702:3: ( 'no' )
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            // InternalGramatica.g:1703:3: ( 'no' )
            // InternalGramatica.g:1704:4: 'no'
            {
             before(grammarAccess.getObligacionAccess().getNegacionNoKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGramatica.g:1715:1: rule__Obligacion__ObligacionAssignment_1 : ( ( 'debe ser' ) ) ;
    public final void rule__Obligacion__ObligacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1719:1: ( ( ( 'debe ser' ) ) )
            // InternalGramatica.g:1720:2: ( ( 'debe ser' ) )
            {
            // InternalGramatica.g:1720:2: ( ( 'debe ser' ) )
            // InternalGramatica.g:1721:3: ( 'debe ser' )
            {
             before(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); 
            // InternalGramatica.g:1722:3: ( 'debe ser' )
            // InternalGramatica.g:1723:4: 'debe ser'
            {
             before(grammarAccess.getObligacionAccess().getObligacionDebeSerKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGramatica.g:1734:1: rule__Operacion__OperacionAssignment : ( ( rule__Operacion__OperacionAlternatives_0 ) ) ;
    public final void rule__Operacion__OperacionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1738:1: ( ( ( rule__Operacion__OperacionAlternatives_0 ) ) )
            // InternalGramatica.g:1739:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            {
            // InternalGramatica.g:1739:2: ( ( rule__Operacion__OperacionAlternatives_0 ) )
            // InternalGramatica.g:1740:3: ( rule__Operacion__OperacionAlternatives_0 )
            {
             before(grammarAccess.getOperacionAccess().getOperacionAlternatives_0()); 
            // InternalGramatica.g:1741:3: ( rule__Operacion__OperacionAlternatives_0 )
            // InternalGramatica.g:1741:4: rule__Operacion__OperacionAlternatives_0
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
    // InternalGramatica.g:1749:1: rule__Literal__ValorAssignment : ( RULE_STRING ) ;
    public final void rule__Literal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramatica.g:1753:1: ( ( RULE_STRING ) )
            // InternalGramatica.g:1754:2: ( RULE_STRING )
            {
            // InternalGramatica.g:1754:2: ( RULE_STRING )
            // InternalGramatica.g:1755:3: RULE_STRING
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\5\1\uffff\3\4\1\30\1\26\2\4\1\uffff\2\4\1\30\2\26";
    static final String dfa_3s = "\1\27\1\uffff\1\17\2\4\1\30\1\33\1\17\1\4\1\uffff\2\4\1\30\2\33";
    static final String dfa_4s = "\1\uffff\1\1\7\uffff\1\2\5\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\21\uffff\1\2",
            "",
            "\1\5\11\uffff\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\11\1\7\1\uffff\1\10\2\1",
            "\1\14\11\uffff\1\12\1\13",
            "\1\15",
            "",
            "\1\14",
            "\1\14",
            "\1\16",
            "\1\11\3\uffff\2\1",
            "\1\11\1\7\1\uffff\1\10\2\1"
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
            return "452:1: rule__Contenido__SimpleAlternatives_0_0 : ( ( ruleSimple ) | ( ruleIteracion ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000C800020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});

}