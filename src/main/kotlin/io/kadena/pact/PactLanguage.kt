package io.kadena.pact

import com.intellij.lang.Language


object PactLanguage : Language("Pact") {
    private fun readResolve(): Any = PactLanguage

    val INSTANCE: PactLanguage = PactLanguage
}
