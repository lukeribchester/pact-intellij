// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactOperator extends PsiElement {

  @Nullable
  PactArithmeticOperator getArithmeticOperator();

  @Nullable
  PactAssignmentOperator getAssignmentOperator();

  @Nullable
  PactBitwiseOperator getBitwiseOperator();

  @Nullable
  PactLogicalOperator getLogicalOperator();

  @Nullable
  PactRelationalOperator getRelationalOperator();

}
