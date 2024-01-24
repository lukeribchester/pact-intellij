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

public class PactIfDefImpl extends ASTWrapperPsiElement implements PactIfDef {

  public PactIfDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitIfDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactDefConst getDefConst() {
    return findChildByClass(PactDefConst.class);
  }

  @Override
  @Nullable
  public PactDefschema getDefschema() {
    return findChildByClass(PactDefschema.class);
  }

  @Override
  @Nullable
  public PactIfDefCap getIfDefCap() {
    return findChildByClass(PactIfDefCap.class);
  }

  @Override
  @Nullable
  public PactIfDefPact getIfDefPact() {
    return findChildByClass(PactIfDefPact.class);
  }

  @Override
  @Nullable
  public PactIfDefun getIfDefun() {
    return findChildByClass(PactIfDefun.class);
  }

}