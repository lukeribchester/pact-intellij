package io.kadena.pact.language.psi

import com.intellij.psi.tree.TokenSet


interface PactTokenSets {
    companion object {
        /* Comments */
        val COMMENTS: TokenSet = TokenSet.create(PactTypes.COMMENT)

        /* Literals */
        val STRINGS: TokenSet = TokenSet.create(PactTypes.STR)
    }
}
