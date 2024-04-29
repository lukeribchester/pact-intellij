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

public class PactDefschemaImpl extends ASTWrapperPsiElement implements PactDefschema {

  public PactDefschemaImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDefschema(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactDocAnn getDocAnn() {
    return findChildByClass(PactDocAnn.class);
  }

  @Override
  @Nullable
  public PactDocStr getDocStr() {
    return findChildByClass(PactDocStr.class);
  }

  @Override
  @Nullable
  public PactModelAnn getModelAnn() {
    return findChildByClass(PactModelAnn.class);
  }

  @Override
  @Nullable
  public PactSchemaArgList getSchemaArgList() {
    return findChildByClass(PactSchemaArgList.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
