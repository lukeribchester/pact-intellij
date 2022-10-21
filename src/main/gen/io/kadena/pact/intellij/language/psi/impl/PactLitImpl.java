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

public class PactLitImpl extends ASTWrapperPsiElement implements PactLit {

  public PactLitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitLit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PactBool> getBoolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactBool.class);
  }

  @Override
  @Nullable
  public PactDecimal getDecimal() {
    return findChildByClass(PactDecimal.class);
  }

  @Override
  @Nullable
  public PactInteger getInteger() {
    return findChildByClass(PactInteger.class);
  }

  @Override
  @Nullable
  public PactKset getKset() {
    return findChildByClass(PactKset.class);
  }

  @Override
  @Nullable
  public PactListLit getListLit() {
    return findChildByClass(PactListLit.class);
  }

  @Override
  @Nullable
  public PactObjectLit getObjectLit() {
    return findChildByClass(PactObjectLit.class);
  }

  @Override
  @Nullable
  public PactStringLit getStringLit() {
    return findChildByClass(PactStringLit.class);
  }

  @Override
  @Nullable
  public PactSymbol getSymbol() {
    return findChildByClass(PactSymbol.class);
  }

}
