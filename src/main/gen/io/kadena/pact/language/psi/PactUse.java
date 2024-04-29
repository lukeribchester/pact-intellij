// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactUse extends PsiElement {

  @Nullable
  PactImportList getImportList();

  @NotNull
  PactModuleQualifier getModuleQualifier();

  @Nullable
  PsiElement getStr();

}
