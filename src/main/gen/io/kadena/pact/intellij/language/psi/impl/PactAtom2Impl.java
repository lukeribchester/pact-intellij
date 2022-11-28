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

public class PactAtom2Impl extends ASTWrapperPsiElement implements PactAtom2 {

  public PactAtom2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitAtom2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactIdent getIdent() {
    return findChildByClass(PactIdent.class);
  }

  @Override
  @Nullable
  public PactLit getLit() {
    return findChildByClass(PactLit.class);
  }

  @Override
  @Nullable
  public PactOp getOp() {
    return findChildByClass(PactOp.class);
  }

}
