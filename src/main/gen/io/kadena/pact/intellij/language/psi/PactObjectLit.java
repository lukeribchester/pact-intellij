// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactObjectLit extends PsiElement {

  @NotNull
  PactComma getComma();

  @NotNull
  List<PactKv> getKvList();

  @NotNull
  PactLcurl getLcurl();

  @NotNull
  PactRcurl getRcurl();

}
