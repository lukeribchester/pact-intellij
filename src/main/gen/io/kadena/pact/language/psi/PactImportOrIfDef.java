// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactImportOrIfDef extends PsiElement {

  @NotNull
  List<PactDefConst> getDefConstList();

  @NotNull
  List<PactDefschema> getDefschemaList();

  @NotNull
  List<PactIfDefCap> getIfDefCapList();

  @NotNull
  List<PactIfDefPact> getIfDefPactList();

  @NotNull
  List<PactIfDefun> getIfDefunList();

  @NotNull
  List<PactUse> getUseList();

}
