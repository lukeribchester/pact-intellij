// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactLetBind extends PsiElement {

  @NotNull
  PactExpr getExpr();

  @NotNull
  PactLparen getLparen();

  @Nullable
  PactMultiBind getMultiBind();

  @NotNull
  PactRparen getRparen();

  @Nullable
  PactSingleBind getSingleBind();

}
