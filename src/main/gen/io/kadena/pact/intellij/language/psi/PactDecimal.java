// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactDecimal extends PsiElement {

  @NotNull
  PactDot getDot();

  @NotNull
  List<PactNumbers> getNumbersList();

  @Nullable
  PactSub getSub();

}
