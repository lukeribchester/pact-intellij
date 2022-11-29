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

public class PactHashesImpl extends ASTWrapperPsiElement implements PactHashes {

  public PactHashesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitHashes(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PactHash getHash() {
    return findNotNullChildByClass(PactHash.class);
  }

  @Override
  @NotNull
  public PactLsquare getLsquare() {
    return findNotNullChildByClass(PactLsquare.class);
  }

  @Override
  @NotNull
  public PactRsquare getRsquare() {
    return findNotNullChildByClass(PactRsquare.class);
  }

}
