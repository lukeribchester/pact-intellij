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

public class PactPropAtomImpl extends ASTWrapperPsiElement implements PactPropAtom {

  public PactPropAtomImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PactVisitor visitor) {
    visitor.visitPropAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PactVisitor) accept((PactVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PactBoolean getBoolean() {
    return findChildByClass(PactBoolean.class);
  }

  @Override
  @Nullable
  public PactFVDelim getFVDelim() {
    return findChildByClass(PactFVDelim.class);
  }

  @Override
  @Nullable
  public PactFVKeyword getFVKeyword() {
    return findChildByClass(PactFVKeyword.class);
  }

  @Override
  @Nullable
  public PactNumber getNumber() {
    return findChildByClass(PactNumber.class);
  }

  @Override
  @Nullable
  public PactOperator getOperator() {
    return findChildByClass(PactOperator.class);
  }

  @Override
  @Nullable
  public PactString getString() {
    return findChildByClass(PactString.class);
  }

  @Override
  @Nullable
  public PactVariable getVariable() {
    return findChildByClass(PactVariable.class);
  }

}
