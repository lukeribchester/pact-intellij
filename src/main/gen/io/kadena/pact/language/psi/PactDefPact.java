// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactDefPact extends PsiElement {

  @NotNull
  PactMArgs getMArgs();

  @Nullable
  PactMDocOrModel getMDocOrModel();

  @Nullable
  PactMTypeAnn getMTypeAnn();

  @NotNull
  PactSteps getSteps();

  @NotNull
  PsiElement getIdent();

}
