package io.kadena.pact.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import io.kadena.pact.language.PactFileType
import io.kadena.pact.language.PactLanguage
import org.jetbrains.annotations.NotNull


class PactFile(@NotNull viewProvider: FileViewProvider?) :
    PsiFileBase(viewProvider!!, PactLanguage.INSTANCE) {
    @NotNull
    override fun getFileType(): FileType {
        return PactFileType.INSTANCE
    }

    override fun toString(): String {
        return "Pact File"
    }
}
