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

public class PactLambdaArgumentImpl extends ASTWrapperPsiElement implements PactLambdaArgument {

  public PactLambdaArgumentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitLambdaArgument(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactTypeDeclaration getTypeDeclaration() {
    return findChildByClass(PactTypeDeclaration.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
