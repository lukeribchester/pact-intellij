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

public class PactExtensionImpl extends ASTWrapperPsiElement implements PactExtension {

  public PactExtensionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitExtension(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactModuleQualifier getModuleQualifier() {
    return findChildByClass(PactModuleQualifier.class);
  }

  @Override
  @Nullable
  public PactString getString() {
    return findChildByClass(PactString.class);
  }

  @Override
  @Nullable
  public PactUse getUse() {
    return findChildByClass(PactUse.class);
  }

}
