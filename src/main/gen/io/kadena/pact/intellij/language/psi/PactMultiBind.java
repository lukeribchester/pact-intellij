// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactMultiBind extends PsiElement {

  @NotNull
  PactLparen getLparen();

  @NotNull
  PactRparen getRparen();

  @NotNull
  List<PactSingleBind> getSingleBindList();

}
