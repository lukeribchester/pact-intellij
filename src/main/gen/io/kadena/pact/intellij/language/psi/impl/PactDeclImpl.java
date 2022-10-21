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

public class PactDeclImpl extends ASTWrapperPsiElement implements PactDecl {

  public PactDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactBless getBless() {
    return findChildByClass(PactBless.class);
  }

  @Override
  @Nullable
  public PactDefcap getDefcap() {
    return findChildByClass(PactDefcap.class);
  }

  @Override
  @Nullable
  public PactDefconst getDefconst() {
    return findChildByClass(PactDefconst.class);
  }

  @Override
  @Nullable
  public PactDefpact getDefpact() {
    return findChildByClass(PactDefpact.class);
  }

  @Override
  @Nullable
  public PactDefschema getDefschema() {
    return findChildByClass(PactDefschema.class);
  }

  @Override
  @Nullable
  public PactDeftable getDeftable() {
    return findChildByClass(PactDeftable.class);
  }

  @Override
  @Nullable
  public PactDefun getDefun() {
    return findChildByClass(PactDefun.class);
  }

}
