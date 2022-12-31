// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactKset extends PsiElement {

  @Nullable
  PactColon getColon();

  @Nullable
  PactComma getComma();

  @NotNull
  PactHashes getHashes();

  @Nullable
  PactLcurl getLcurl();

  @Nullable
  PactPred getPred();

  @Nullable
  PactRcurl getRcurl();

}
