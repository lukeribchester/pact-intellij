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

public class PactExtOrDefsImpl extends ASTWrapperPsiElement implements PactExtOrDefs {

  public PactExtOrDefsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitExtOrDefs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PactDef> getDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDef.class);
  }

  @Override
  @NotNull
  public List<PactExt> getExtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactExt.class);
  }

}
