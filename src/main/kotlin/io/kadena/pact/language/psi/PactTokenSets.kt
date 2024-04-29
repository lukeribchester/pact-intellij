package io.kadena.pact.language.psi

import com.intellij.psi.tree.TokenSet


interface PactTokenSets {
    companion object {
        val COMMENTS: TokenSet = TokenSet.create(PactTypes.COMMENT)
    }
}
