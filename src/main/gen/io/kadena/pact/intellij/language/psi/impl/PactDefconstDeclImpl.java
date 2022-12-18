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

public class PactDefconstDeclImpl extends ASTWrapperPsiElement implements PactDefconstDecl {

  public PactDefconstDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDefconstDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PactDefconst getDefconst() {
    return findNotNullChildByClass(PactDefconst.class);
  }

  @Override
  @NotNull
  public PactExpr getExpr() {
    return findNotNullChildByClass(PactExpr.class);
  }

  @Override
  @NotNull
  public PactIdent getIdent() {
    return findNotNullChildByClass(PactIdent.class);
  }

}