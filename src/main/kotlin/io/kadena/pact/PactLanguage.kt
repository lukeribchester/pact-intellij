package io.kadena.pact

import com.intellij.lang.Language

public class PactLanguage : Language("Pact") {

    companion object {
        @JvmStatic
        public val INSTANCE = PactLanguage()
    }
}
