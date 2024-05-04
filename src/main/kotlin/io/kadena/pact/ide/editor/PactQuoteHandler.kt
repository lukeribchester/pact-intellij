package io.kadena.pact.ide.editor

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import io.kadena.pact.language.psi.PactTokenSets


class PactQuoteHandler : SimpleTokenSetQuoteHandler(PactTokenSets.STRINGS) {
}
