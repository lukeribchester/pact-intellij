// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactModule extends PsiElement {

  @NotNull
  List<PactDefCap> getDefCapList();

  @NotNull
  List<PactDefConst> getDefConstList();

  @NotNull
  List<PactDefPact> getDefPactList();

  @NotNull
  List<PactDefSchema> getDefSchemaList();

  @NotNull
  List<PactDefTable> getDefTableList();

  @NotNull
  List<PactDefun> getDefunList();

  @Nullable
  PactDocumentationAnnotation getDocumentationAnnotation();

  @Nullable
  PactDocumentationString getDocumentationString();

  @NotNull
  List<PactExtension> getExtensionList();

  @Nullable
  PactModelAnnotation getModelAnnotation();

  @Nullable
  PactString getString();

}
