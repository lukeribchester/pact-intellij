package io.kadena.pact.intellij.language.psi

import com.intellij.psi.tree.IElementType
import io.kadena.pact.intellij.PactLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

public class PactElementType constructor(@NotNull @NonNls debugName: String) :
    IElementType(debugName, PactLanguage.INSTANCE) {
}
