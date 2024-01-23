package io.kadena.pact

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class PactFileType : LanguageFileType(PactLanguage.INSTANCE) {

    companion object {
        @JvmStatic
        val INSTANCE = PactFileType()
    }

    override fun getName(): String {
        return "Pact File"
    }

    override fun getDescription(): String {
        return "Pact smart contract file"
    }

    override fun getDefaultExtension(): String {
        return "pact"
    }

    override fun getIcon(): Icon {
        return PactIcons.FILE
    }
}
