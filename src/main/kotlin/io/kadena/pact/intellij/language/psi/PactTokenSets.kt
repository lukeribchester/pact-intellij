package io.kadena.pact.intellij.language.psi

import com.intellij.psi.tree.TokenSet

interface PactTokenSets {
    val MODULES: TokenSet
        get() = TokenSet.create(PactTypes.MODULE)

    val DEFUNS: TokenSet
        get() = TokenSet.create(PactTypes.DEFUN)
}
