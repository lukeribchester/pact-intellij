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

public class PactDefImpl extends ASTWrapperPsiElement implements PactDef {

  public PactDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitDef(this);
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
  public PactDefPact getDefPact() {
    return findChildByClass(PactDefPact.class);
  }

  @Override
  @Nullable
  public PactDefcap getDefcap() {
    return findChildByClass(PactDefcap.class);
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
