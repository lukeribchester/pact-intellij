// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactDefPact extends PsiElement {

  @Nullable
  PactDocAnn getDocAnn();

  @Nullable
  PactDocStr getDocStr();

  @NotNull
  PactMArgs getMArgs();

  @Nullable
  PactMTypeAnn getMTypeAnn();

  @Nullable
  PactModelAnn getModelAnn();

  @NotNull
  PactSteps getSteps();

  @NotNull
  PsiElement getIdent();

}
