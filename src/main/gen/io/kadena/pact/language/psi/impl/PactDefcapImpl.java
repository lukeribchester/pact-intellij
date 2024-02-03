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

public class PactDefcapImpl extends ASTWrapperPsiElement implements PactDefcap {

  public PactDefcapImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDefcap(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PactBlock getBlock() {
    return findNotNullChildByClass(PactBlock.class);
  }

  @Override
  @Nullable
  public PactMArgs getMArgs() {
    return findChildByClass(PactMArgs.class);
  }

  @Override
  @Nullable
  public PactMDCapMeta getMDCapMeta() {
    return findChildByClass(PactMDCapMeta.class);
  }

  @Override
  @Nullable
  public PactMDocOrModel getMDocOrModel() {
    return findChildByClass(PactMDocOrModel.class);
  }

  @Override
  @Nullable
  public PactMTypeAnn getMTypeAnn() {
    return findChildByClass(PactMTypeAnn.class);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}
