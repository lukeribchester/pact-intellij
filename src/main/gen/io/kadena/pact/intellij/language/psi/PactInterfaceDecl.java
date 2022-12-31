// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactInterfaceDecl extends PsiElement {

  @NotNull
  PactDocOrMeta getDocOrMeta();

  @NotNull
  PactIdent getIdent();

  @NotNull
  PactInterface getInterface();

  @NotNull
  PactLparen getLparen();

  @NotNull
  PactRparen getRparen();

  @NotNull
  PactSigList getSigList();

}
