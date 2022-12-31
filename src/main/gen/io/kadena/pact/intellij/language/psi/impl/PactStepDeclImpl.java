// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.kadena.pact.intellij.language.psi.PactTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.kadena.pact.intellij.language.psi.*;

public class PactStepDeclImpl extends ASTWrapperPsiElement implements PactStepDecl {

  public PactStepDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitStepDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PactExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactExpr.class);
  }

  @Override
  @NotNull
  public PactLparen getLparen() {
    return findNotNullChildByClass(PactLparen.class);
  }

  @Override
  @NotNull
  public PactRparen getRparen() {
    return findNotNullChildByClass(PactRparen.class);
  }

  @Override
  @Nullable
  public PactStep getStep() {
    return findChildByClass(PactStep.class);
  }

  @Override
  @Nullable
  public PactStepWithRollback getStepWithRollback() {
    return findChildByClass(PactStepWithRollback.class);
  }

  @Override
  @Nullable
  public PactStringLit getStringLit() {
    return findChildByClass(PactStringLit.class);
  }

}
