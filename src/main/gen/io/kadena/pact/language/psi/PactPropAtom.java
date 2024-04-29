// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactPropAtom extends PsiElement {

  @Nullable
  PactBoolean getBoolean();

  @Nullable
  PactFVDelim getFVDelim();

  @Nullable
  PactFVKeyword getFVKeyword();

  @Nullable
  PactNumber getNumber();

  @Nullable
  PactOperator getOperator();

  @Nullable
  PactString getString();

  @Nullable
  PactVariable getVariable();

}
