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
  public List<PactDefcap> getDefcapList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefcap.class);
  }

  @Override
  @NotNull
  public List<PactDefschema> getDefschemaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefschema.class);
  }

  @Override
  @NotNull
  public List<PactDeftable> getDeftableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDeftable.class);
  }

  @Override
  @NotNull
  public List<PactDefun> getDefunList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactDefun.class);
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
  @NotNull
  public List<PactExt> getExtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PactExt.class);
  }

  @Override
  @Nullable
  public PactModelAnn getModelAnn() {
    return findChildByClass(PactModelAnn.class);
  }

  @Override
  @Nullable
  public PactStringRaw getStringRaw() {
    return findChildByClass(PactStringRaw.class);
  }

}
