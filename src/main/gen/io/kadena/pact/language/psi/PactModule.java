// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PactModule extends PsiElement {

  @NotNull
  List<PactDefConst> getDefConstList();

  @NotNull
  List<PactDefPact> getDefPactList();

  @NotNull
  List<PactDefcap> getDefcapList();

  @NotNull
  List<PactDefschema> getDefschemaList();

  @NotNull
  List<PactDeftable> getDeftableList();

  @NotNull
  List<PactDefun> getDefunList();

  @Nullable
  PactDocAnn getDocAnn();

  @Nullable
  PactDocStr getDocStr();

  @NotNull
  List<PactExt> getExtList();

  @Nullable
  PactModelAnn getModelAnn();

  @Nullable
  PactStringRaw getStringRaw();

}
