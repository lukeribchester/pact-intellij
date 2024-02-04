// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactProgramList extends PsiElement {

  @NotNull
  List<PactExpr> getExprList();

  @NotNull
  List<PactInterface> getInterfaceList();

  @NotNull
  List<PactModule> getModuleList();

  @NotNull
  List<PactUse> getUseList();

}
