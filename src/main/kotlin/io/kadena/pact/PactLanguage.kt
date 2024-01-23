package io.kadena.pact

import com.intellij.lang.Language

class PactLanguage : Language("Pact") {

    companion object {
        @JvmStatic
        val INSTANCE = PactLanguage()
    }
}
