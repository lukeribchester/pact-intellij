// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactLit extends PsiElement {

  @NotNull
  List<PactBool> getBoolList();

  @Nullable
  PactDecimal getDecimal();

  @Nullable
  PactInteger getInteger();

  @Nullable
  PactKset getKset();

  @Nullable
  PactListLit getListLit();

  @Nullable
  PactObjectLit getObjectLit();

  @Nullable
  PactStringLit getStringLit();

  @Nullable
  PactSymbol getSymbol();

}
