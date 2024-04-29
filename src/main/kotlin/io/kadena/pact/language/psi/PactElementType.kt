package io.kadena.pact.language.psi

import com.intellij.psi.tree.IElementType
import io.kadena.pact.language.PactLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull


class PactElementType(@NotNull @NonNls debugName: String?) :
    IElementType(debugName.toString(), PactLanguage.INSTANCE)
