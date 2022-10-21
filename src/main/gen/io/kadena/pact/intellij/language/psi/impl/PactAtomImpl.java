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

public class PactAtomImpl extends ASTWrapperPsiElement implements PactAtom {

  public PactAtomImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactAtom2 getAtom2() {
    return findChildByClass(PactAtom2.class);
  }

  @Override
  @Nullable
  public PactLetBind getLetBind() {
    return findChildByClass(PactLetBind.class);
  }

  @Override
  @Nullable
  public PactLetStarBind getLetStarBind() {
    return findChildByClass(PactLetStarBind.class);
  }

  @Override
  @Nullable
  public PactTypeAnn getTypeAnn() {
    return findChildByClass(PactTypeAnn.class);
  }

}
