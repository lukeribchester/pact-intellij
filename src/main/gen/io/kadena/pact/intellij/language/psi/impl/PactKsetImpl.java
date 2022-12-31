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

public class PactKsetImpl extends ASTWrapperPsiElement implements PactKset {

  public PactKsetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitKset(this);
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
  @Nullable
  public PactComma getComma() {
    return findChildByClass(PactComma.class);
  }

  @Override
  @NotNull
  public PactHashes getHashes() {
    return findNotNullChildByClass(PactHashes.class);
  }

  @Override
  @Nullable
  public PactLcurl getLcurl() {
    return findChildByClass(PactLcurl.class);
  }

  @Override
  @Nullable
  public PactPred getPred() {
    return findChildByClass(PactPred.class);
  }

  @Override
  @Nullable
  public PactRcurl getRcurl() {
    return findChildByClass(PactRcurl.class);
  }

}
