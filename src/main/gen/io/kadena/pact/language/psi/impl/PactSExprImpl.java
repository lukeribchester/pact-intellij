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

public class PactSExprImpl extends ASTWrapperPsiElement implements PactSExpr {

  public PactSExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitSExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactCapExpr getCapExpr() {
    return findChildByClass(PactCapExpr.class);
  }

  @Override
  @Nullable
  public PactGenAppExpr getGenAppExpr() {
    return findChildByClass(PactGenAppExpr.class);
  }

  @Override
  @Nullable
  public PactIfExpr getIfExpr() {
    return findChildByClass(PactIfExpr.class);
  }

  @Override
  @Nullable
  public PactLamExpr getLamExpr() {
    return findChildByClass(PactLamExpr.class);
  }

  @Override
  @Nullable
  public PactLetExpr getLetExpr() {
    return findChildByClass(PactLetExpr.class);
  }

  @Override
  @Nullable
  public PactProgNExpr getProgNExpr() {
    return findChildByClass(PactProgNExpr.class);
  }

  @Override
  @Nullable
  public PactSuspendExpr getSuspendExpr() {
    return findChildByClass(PactSuspendExpr.class);
  }

  @Override
  @Nullable
  public PactTryExpr getTryExpr() {
    return findChildByClass(PactTryExpr.class);
  }

}
