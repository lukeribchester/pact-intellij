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

public class PactDefunDeclImpl extends ASTWrapperPsiElement implements PactDefunDecl {

  public PactDefunDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDefunDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PactDefun getDefun() {
    return findNotNullChildByClass(PactDefun.class);
  }

  @Override
  @NotNull
  public PactDocOrMeta getDocOrMeta() {
    return findNotNullChildByClass(PactDocOrMeta.class);
  }

  @Override
  @NotNull
  public PactExpr getExpr() {
    return findNotNullChildByClass(PactExpr.class);
  }

  @Override
  @NotNull
  public PactFunArgs getFunArgs() {
    return findNotNullChildByClass(PactFunArgs.class);
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

}