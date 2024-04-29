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

public class PactIfDefCapImpl extends ASTWrapperPsiElement implements PactIfDefCap {

  public PactIfDefCapImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitIfDefCap(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactDocumentationAnnotation getDocumentationAnnotation() {
    return findChildByClass(PactDocumentationAnnotation.class);
  }

  @Override
  @Nullable
  public PactDocumentationString getDocumentationString() {
    return findChildByClass(PactDocumentationString.class);
  }

  @Override
  @NotNull
  public PactMArgs getMArgs() {
    return findNotNullChildByClass(PactMArgs.class);
  }

  @Override
  @Nullable
  public PactMDCapMeta getMDCapMeta() {
    return findChildByClass(PactMDCapMeta.class);
  }

  @Override
  @Nullable
  public PactMTypeAnn getMTypeAnn() {
    return findChildByClass(PactMTypeAnn.class);
  }

  @Override
  @Nullable
  public PactModelAnnotation getModelAnnotation() {
    return findChildByClass(PactModelAnnotation.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
