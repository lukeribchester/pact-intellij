package io.kadena.pact.intellij

import com.intellij.lang.Language

public class PactLanguage : Language("Pact") {

    companion object {
        @JvmStatic
        public val INSTANCE = PactLanguage()
    }
}
