/*
 * generated by Xtext 2.10.0
 */
package org.xtext.tesis.gramatica.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.tesis.gramatica.parser.antlr.internal.InternalGramaticaParser;
import org.xtext.tesis.gramatica.services.GramaticaGrammarAccess;

public class GramaticaParser extends AbstractAntlrParser {

	@Inject
	private GramaticaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGramaticaParser createParser(XtextTokenStream stream) {
		return new InternalGramaticaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Documento";
	}

	public GramaticaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GramaticaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
