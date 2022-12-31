// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactExpr extends PsiElement {

  @Nullable
  PactAtom getAtom();

  @Nullable
  PactLparen getLparen();

  @Nullable
  PactNeExprList getNeExprList();

  @Nullable
  PactRparen getRparen();

}
