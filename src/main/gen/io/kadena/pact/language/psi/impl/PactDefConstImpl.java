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

public class PactDefConstImpl extends ASTWrapperPsiElement implements PactDefConst {

  public PactDefConstImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDefConst(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactExpr getExpr() {
    return findChildByClass(PactExpr.class);
  }

  @Override
  @Nullable
  public PactMDoc getMDoc() {
    return findChildByClass(PactMDoc.class);
  }

  @Override
  @Nullable
  public PactMTypeAnn getMTypeAnn() {
    return findChildByClass(PactMTypeAnn.class);
  }

  @Override
  @Nullable
  public PsiElement getIdent() {
    return findChildByType(IDENT);
  }

}
