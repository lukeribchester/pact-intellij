// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactModule extends PsiElement {

  @NotNull
  PactDeclList getDeclList();

  @NotNull
  PactDocOrMeta getDocOrMeta();

  @NotNull
  PactIdent getIdent();

  @NotNull
  PactModuleGuard getModuleGuard();

}
