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

public class PactInterfaceImpl extends ASTWrapperPsiElement implements PactInterface {

  public PactInterfaceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitInterface(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PactDefConst> getDefConstList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefConst.class);
  }

  @Override
  @NotNull
  public List<PactDefSchema> getDefSchemaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefSchema.class);
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
  public List<PactIfDefCap> getIfDefCapList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactIfDefCap.class);
  }

  @Override
  @NotNull
  public List<PactIfDefPact> getIfDefPactList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactIfDefPact.class);
  }

  @Override
  @NotNull
  public List<PactIfDefun> getIfDefunList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactIfDefun.class);
  }

  @Override
  @Nullable
  public PactModelAnnotation getModelAnnotation() {
    return findChildByClass(PactModelAnnotation.class);
  }

  @Override
  @NotNull
  public List<PactUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactUse.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
