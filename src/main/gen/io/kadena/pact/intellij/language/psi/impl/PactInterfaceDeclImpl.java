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

public class PactInterfaceDeclImpl extends ASTWrapperPsiElement implements PactInterfaceDecl {

  public PactInterfaceDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitInterfaceDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PactDocOrMeta getDocOrMeta() {
    return findNotNullChildByClass(PactDocOrMeta.class);
  }

  @Override
  @NotNull
  public PactIdent getIdent() {
    return findNotNullChildByClass(PactIdent.class);
  }

  @Override
  @NotNull
  public PactInterface getInterface() {
    return findNotNullChildByClass(PactInterface.class);
  }

  @Override
  @NotNull
  public PactLparen getLparen() {
    return findNotNullChildByClass(PactLparen.class);
  }

  @Override
  @NotNull
  public PactRparen getRparen() {
    return findNotNullChildByClass(PactRparen.class);
  }

  @Override
  @NotNull
  public PactSigList getSigList() {
    return findNotNullChildByClass(PactSigList.class);
  }

}
