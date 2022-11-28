package io.kadena.pact.intellij.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import io.kadena.pact.intellij.PactFileType
import io.kadena.pact.intellij.PactLanguage
import org.jetbrains.annotations.NotNull

class PactFile constructor(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, PactLanguage.INSTANCE) {
    @NotNull
    override fun getFileType(): FileType {
        return PactFileType.INSTANCE;
    }

    override fun toString(): String {
        return "Pact File";
    }
}
