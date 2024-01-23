package io.kadena.pact.language

import com.intellij.lang.Language


object PactLanguage : Language("Pact") {
    private fun readResolve(): Any = PactLanguage

    val INSTANCE: PactLanguage = PactLanguage
}
