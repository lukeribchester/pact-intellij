package io.kadena.pact.language

import com.intellij.lexer.FlexAdapter


class PactLexerAdapter : FlexAdapter(PactLexer(null))
