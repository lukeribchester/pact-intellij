// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactAtom extends PsiElement {

  @Nullable
  PactBool getBool();

  @Nullable
  PactList getList();

  @Nullable
  PactNumber getNumber();

  @Nullable
  PactObject getObject();

  @Nullable
  PactOperator getOperator();

  @Nullable
  PactString getString();

  @Nullable
  PactVar getVar();

}
