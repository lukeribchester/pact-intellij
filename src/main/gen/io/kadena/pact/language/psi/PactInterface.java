// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactInterface extends PsiElement {

  @NotNull
  List<PactDefConst> getDefConstList();

  @NotNull
  List<PactDefSchema> getDefSchemaList();

  @Nullable
  PactDocumentationAnnotation getDocumentationAnnotation();

  @Nullable
  PactDocumentationString getDocumentationString();

  @NotNull
  List<PactIfDefCap> getIfDefCapList();

  @NotNull
  List<PactIfDefPact> getIfDefPactList();

  @NotNull
  List<PactIfDefun> getIfDefunList();

  @Nullable
  PactModelAnnotation getModelAnnotation();

  @NotNull
  List<PactUse> getUseList();

  @NotNull
  PsiElement getIdentifier();

}
