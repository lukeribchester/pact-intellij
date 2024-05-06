package io.kadena.pact.ide.editor

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import io.kadena.pact.language.psi.PactTokenSets
import io.kadena.pact.language.psi.PactTypes
import org.jetbrains.annotations.NotNull


private val BRACE_PAIRS = arrayOf(
    BracePair(PactTypes.PAREN_OPEN, PactTypes.PAREN_CLOSE, true),
    BracePair(PactTypes.BRACE_OPEN, PactTypes.BRACE_CLOSE, false),
    BracePair(PactTypes.BRACKET_OPEN, PactTypes.BRACKET_CLOSE, false)
)

class PactBraceMatcher : PairedBraceMatcher {
    @NotNull
    override fun getPairs(): Array<BracePair> {
        return BRACE_PAIRS
    }

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        return contextType == null || !PactTokenSets.STRINGS.contains(contextType)
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }
}
