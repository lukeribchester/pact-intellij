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

public class PactDeftableDeclImpl extends ASTWrapperPsiElement implements PactDeftableDecl {

  public PactDeftableDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDeftableDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactColon getColon() {
    return findChildByClass(PactColon.class);
  }

  @Override
  @NotNull
  public PactDeftable getDeftable() {
    return findNotNullChildByClass(PactDeftable.class);
  }

  @Override
  @NotNull
  public PactDocOrMeta getDocOrMeta() {
    return findNotNullChildByClass(PactDocOrMeta.class);
  }

  @Override
  @NotNull
  public List<PactIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactIdent.class);
  }

}
