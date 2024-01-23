package io.kadena.pact

import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon


class PactFileType private constructor() : LanguageFileType(PactLanguage.INSTANCE) {
    @NotNull
    override fun getName(): String {
        return "Pact File"
    }

    @NotNull
    override fun getDescription(): String {
        return "Pact smart contract file"
    }

    @NotNull
    override fun getDefaultExtension(): String {
        return "pact"
    }

    @Nullable
    override fun getIcon(): Icon {
        return PactIcons.FILE
    }

    companion object {
        val INSTANCE: PactFileType = PactFileType()
    }
}
