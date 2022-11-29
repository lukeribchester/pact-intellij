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

public class PactIdentImpl extends ASTWrapperPsiElement implements PactIdent {

  public PactIdentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitIdent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PactLetter> getLetterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactLetter.class);
  }

  @Override
  @Nullable
  public PactNumber getNumber() {
    return findChildByClass(PactNumber.class);
  }

  @Override
  @Nullable
  public PactSub getSub() {
    return findChildByClass(PactSub.class);
  }

}
