// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactReplProgramList extends PsiElement {

  @NotNull
  List<PactDefConst> getDefConstList();

  @NotNull
  List<PactDefun> getDefunList();

  @NotNull
  List<PactExpression> getExpressionList();

  @NotNull
  List<PactInterface> getInterfaceList();

  @NotNull
  List<PactModule> getModuleList();

  @NotNull
  List<PactReplSpecial> getReplSpecialList();

  @NotNull
  List<PactUse> getUseList();

}
