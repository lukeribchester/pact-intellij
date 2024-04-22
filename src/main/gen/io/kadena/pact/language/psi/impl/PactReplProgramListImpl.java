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

public class PactReplProgramListImpl extends ASTWrapperPsiElement implements PactReplProgramList {

  public PactReplProgramListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitReplProgramList(this);
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
  public List<PactDefun> getDefunList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefun.class);
  }

  @Override
  @NotNull
  public List<PactExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactExpr.class);
  }

  @Override
  @NotNull
  public List<PactInterface> getInterfaceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactInterface.class);
  }

  @Override
  @NotNull
  public List<PactModule> getModuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactModule.class);
  }

  @Override
  @NotNull
  public List<PactReplSpecial> getReplSpecialList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactReplSpecial.class);
  }

  @Override
  @NotNull
  public List<PactUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactUse.class);
  }

}