// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.kadena.pact.language.psi.PactTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.kadena.pact.language.psi.*;

public class PactOperatorImpl extends ASTWrapperPsiElement implements PactOperator {

  public PactOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactArithmeticOperator getArithmeticOperator() {
    return findChildByClass(PactArithmeticOperator.class);
  }

  @Override
  @Nullable
  public PactAssignmentOperator getAssignmentOperator() {
    return findChildByClass(PactAssignmentOperator.class);
  }

  @Override
  @Nullable
  public PactBitwiseOperator getBitwiseOperator() {
    return findChildByClass(PactBitwiseOperator.class);
  }

  @Override
  @Nullable
  public PactLogicalOperator getLogicalOperator() {
    return findChildByClass(PactLogicalOperator.class);
  }

  @Override
  @Nullable
  public PactRelationalOperator getRelationalOperator() {
    return findChildByClass(PactRelationalOperator.class);
  }

}
