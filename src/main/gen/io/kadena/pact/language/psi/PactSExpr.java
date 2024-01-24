// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactSExpr extends PsiElement {

  @Nullable
  PactCapExpr getCapExpr();

  @Nullable
  PactGenAppExpr getGenAppExpr();

  @Nullable
  PactIfExpr getIfExpr();

  @Nullable
  PactLamExpr getLamExpr();

  @Nullable
  PactLetExpr getLetExpr();

  @Nullable
  PactProgNExpr getProgNExpr();

  @Nullable
  PactSuspendExpr getSuspendExpr();

  @Nullable
  PactTryExpr getTryExpr();

}
