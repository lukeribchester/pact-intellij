// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactDefun extends PsiElement {

  @NotNull
  PactBlock getBlock();

  @Nullable
  PactDocumentationAnnotation getDocumentationAnnotation();

  @Nullable
  PactDocumentationString getDocumentationString();

  @Nullable
  PactMArgs getMArgs();

  @Nullable
  PactMTypeAnn getMTypeAnn();

  @Nullable
  PactModelAnnotation getModelAnnotation();

  @NotNull
  PsiElement getIdentifier();

}
