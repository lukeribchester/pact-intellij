// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactLetExpression extends PsiElement {

  @NotNull
  PactBinders getBinders();

  @NotNull
  List<PactExpression> getExpressionList();

  @NotNull
  PsiElement getKeywordLet();

}
