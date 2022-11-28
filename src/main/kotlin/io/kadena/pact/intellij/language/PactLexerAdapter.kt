package io.kadena.pact.intellij.language

import com.intellij.lexer.FlexAdapter

class PactLexerAdapter : FlexAdapter(PactLexer(null)) {
}
