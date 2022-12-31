// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactImports extends PsiElement {

  @NotNull
  List<PactLparen> getLparenList();

  @NotNull
  List<PactRparen> getRparenList();

  @NotNull
  List<PactUseDecl> getUseDeclList();

}
