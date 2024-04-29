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

public class PactModuleImpl extends ASTWrapperPsiElement implements PactModule {

  public PactModuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitModule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PactDefCap> getDefCapList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefCap.class);
  }

  @Override
  @NotNull
  public List<PactDefConst> getDefConstList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefConst.class);
  }

  @Override
  @NotNull
  public List<PactDefPact> getDefPactList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefPact.class);
  }

  @Override
  @NotNull
  public List<PactDefSchema> getDefSchemaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefSchema.class);
  }

  @Override
  @NotNull
  public List<PactDefTable> getDefTableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefTable.class);
  }

  @Override
  @NotNull
  public List<PactDefun> getDefunList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefun.class);
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
  public List<PactExtension> getExtensionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactExtension.class);
  }

  @Override
  @Nullable
  public PactModelAnnotation getModelAnnotation() {
    return findChildByClass(PactModelAnnotation.class);
  }

  @Override
  @Nullable
  public PactString getString() {
    return findChildByClass(PactString.class);
  }

}
