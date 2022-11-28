// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.kadena.pact.intellij.language.psi.impl.*;

public interface PactTypes {

  IElementType ALPHANUMERIC = new PactElementType("ALPHANUMERIC");
  IElementType ARG = new PactElementType("ARG");
  IElementType ARG_REST = new PactElementType("ARG_REST");
  IElementType ATOM = new PactElementType("ATOM");
  IElementType ATOM_2 = new PactElementType("ATOM_2");
  IElementType BLESS = new PactElementType("BLESS");
  IElementType BOOL = new PactElementType("BOOL");
  IElementType COMMA_DELIMITED_LIST = new PactElementType("COMMA_DELIMITED_LIST");
  IElementType COMMA_DELIMITED_REST = new PactElementType("COMMA_DELIMITED_REST");
  IElementType DECIMAL = new PactElementType("DECIMAL");
  IElementType DECL = new PactElementType("DECL");
  IElementType DECLS = new PactElementType("DECLS");
  IElementType DECL_LIST = new PactElementType("DECL_LIST");
  IElementType DEFCAP = new PactElementType("DEFCAP");
  IElementType DEFCONST = new PactElementType("DEFCONST");
  IElementType DEFPACT = new PactElementType("DEFPACT");
  IElementType DEFSCHEMA = new PactElementType("DEFSCHEMA");
  IElementType DEFTABLE = new PactElementType("DEFTABLE");
  IElementType DEFUN = new PactElementType("DEFUN");
  IElementType DEFUN_SIG = new PactElementType("DEFUN_SIG");
  IElementType DOC = new PactElementType("DOC");
  IElementType DOC_OR_META = new PactElementType("DOC_OR_META");
  IElementType EXPR = new PactElementType("EXPR");
  IElementType FIELD = new PactElementType("FIELD");
  IElementType FIELDS = new PactElementType("FIELDS");
  IElementType FUN_ARGS = new PactElementType("FUN_ARGS");
  IElementType HASH = new PactElementType("HASH");
  IElementType HASHES = new PactElementType("HASHES");
  IElementType IDENT = new PactElementType("IDENT");
  IElementType IMPLEMENTS = new PactElementType("IMPLEMENTS");
  IElementType IMPORTS = new PactElementType("IMPORTS");
  IElementType INTEGER = new PactElementType("INTEGER");
  IElementType INTERFACE = new PactElementType("INTERFACE");
  IElementType INVARIANT = new PactElementType("INVARIANT");
  IElementType KSET = new PactElementType("KSET");
  IElementType KV = new PactElementType("KV");
  IElementType LC_LETTER = new PactElementType("LC_LETTER");
  IElementType LETTER = new PactElementType("LETTER");
  IElementType LET_BIND = new PactElementType("LET_BIND");
  IElementType LET_STAR_BIND = new PactElementType("LET_STAR_BIND");
  IElementType LIST_LIT = new PactElementType("LIST_LIT");
  IElementType LIT = new PactElementType("LIT");
  IElementType MODELS = new PactElementType("MODELS");
  IElementType MODULE = new PactElementType("MODULE");
  IElementType MODULE_GUARD = new PactElementType("MODULE_GUARD");
  IElementType MTA = new PactElementType("MTA");
  IElementType MULTI_BIND = new PactElementType("MULTI_BIND");
  IElementType NE_EXPR_LIST = new PactElementType("NE_EXPR_LIST");
  IElementType NUMBER = new PactElementType("NUMBER");
  IElementType NUMBERS = new PactElementType("NUMBERS");
  IElementType OBJECT_LIT = new PactElementType("OBJECT_LIT");
  IElementType OP = new PactElementType("OP");
  IElementType PRED = new PactElementType("PRED");
  IElementType PROPERTY = new PactElementType("PROPERTY");
  IElementType SIG_LIST = new PactElementType("SIG_LIST");
  IElementType SINGLE_BIND = new PactElementType("SINGLE_BIND");
  IElementType STEP = new PactElementType("STEP");
  IElementType STRING = new PactElementType("STRING");
  IElementType STRING_LIT = new PactElementType("STRING_LIT");
  IElementType SYMBOL = new PactElementType("SYMBOL");
  IElementType TOP_LEVEL_LIST = new PactElementType("TOP_LEVEL_LIST");
  IElementType TYPE_ANN = new PactElementType("TYPE_ANN");
  IElementType UC_LETTER = new PactElementType("UC_LETTER");
  IElementType USE = new PactElementType("USE");

  IElementType TABLE = new PactTokenType("table");
  IElementType Ε = new PactTokenType("ε");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALPHANUMERIC) {
        return new PactAlphanumericImpl(node);
      }
      else if (type == ARG) {
        return new PactArgImpl(node);
      }
      else if (type == ARG_REST) {
        return new PactArgRestImpl(node);
      }
      else if (type == ATOM) {
        return new PactAtomImpl(node);
      }
      else if (type == ATOM_2) {
        return new PactAtom2Impl(node);
      }
      else if (type == BLESS) {
        return new PactBlessImpl(node);
      }
      else if (type == BOOL) {
        return new PactBoolImpl(node);
      }
      else if (type == COMMA_DELIMITED_LIST) {
        return new PactCommaDelimitedListImpl(node);
      }
      else if (type == COMMA_DELIMITED_REST) {
        return new PactCommaDelimitedRestImpl(node);
      }
      else if (type == DECIMAL) {
        return new PactDecimalImpl(node);
      }
      else if (type == DECL) {
        return new PactDeclImpl(node);
      }
      else if (type == DECLS) {
        return new PactDeclsImpl(node);
      }
      else if (type == DECL_LIST) {
        return new PactDeclListImpl(node);
      }
      else if (type == DEFCAP) {
        return new PactDefcapImpl(node);
      }
      else if (type == DEFCONST) {
        return new PactDefconstImpl(node);
      }
      else if (type == DEFPACT) {
        return new PactDefpactImpl(node);
      }
      else if (type == DEFSCHEMA) {
        return new PactDefschemaImpl(node);
      }
      else if (type == DEFTABLE) {
        return new PactDeftableImpl(node);
      }
      else if (type == DEFUN) {
        return new PactDefunImpl(node);
      }
      else if (type == DEFUN_SIG) {
        return new PactDefunSigImpl(node);
      }
      else if (type == DOC) {
        return new PactDocImpl(node);
      }
      else if (type == DOC_OR_META) {
        return new PactDocOrMetaImpl(node);
      }
      else if (type == EXPR) {
        return new PactExprImpl(node);
      }
      else if (type == FIELD) {
        return new PactFieldImpl(node);
      }
      else if (type == FIELDS) {
        return new PactFieldsImpl(node);
      }
      else if (type == FUN_ARGS) {
        return new PactFunArgsImpl(node);
      }
      else if (type == HASH) {
        return new PactHashImpl(node);
      }
      else if (type == HASHES) {
        return new PactHashesImpl(node);
      }
      else if (type == IDENT) {
        return new PactIdentImpl(node);
      }
      else if (type == IMPLEMENTS) {
        return new PactImplementsImpl(node);
      }
      else if (type == IMPORTS) {
        return new PactImportsImpl(node);
      }
      else if (type == INTEGER) {
        return new PactIntegerImpl(node);
      }
      else if (type == INTERFACE) {
        return new PactInterfaceImpl(node);
      }
      else if (type == INVARIANT) {
        return new PactInvariantImpl(node);
      }
      else if (type == KSET) {
        return new PactKsetImpl(node);
      }
      else if (type == KV) {
        return new PactKvImpl(node);
      }
      else if (type == LC_LETTER) {
        return new PactLcLetterImpl(node);
      }
      else if (type == LETTER) {
        return new PactLetterImpl(node);
      }
      else if (type == LET_BIND) {
        return new PactLetBindImpl(node);
      }
      else if (type == LET_STAR_BIND) {
        return new PactLetStarBindImpl(node);
      }
      else if (type == LIST_LIT) {
        return new PactListLitImpl(node);
      }
      else if (type == LIT) {
        return new PactLitImpl(node);
      }
      else if (type == MODELS) {
        return new PactModelsImpl(node);
      }
      else if (type == MODULE) {
        return new PactModuleImpl(node);
      }
      else if (type == MODULE_GUARD) {
        return new PactModuleGuardImpl(node);
      }
      else if (type == MTA) {
        return new PactMtaImpl(node);
      }
      else if (type == MULTI_BIND) {
        return new PactMultiBindImpl(node);
      }
      else if (type == NE_EXPR_LIST) {
        return new PactNeExprListImpl(node);
      }
      else if (type == NUMBER) {
        return new PactNumberImpl(node);
      }
      else if (type == NUMBERS) {
        return new PactNumbersImpl(node);
      }
      else if (type == OBJECT_LIT) {
        return new PactObjectLitImpl(node);
      }
      else if (type == OP) {
        return new PactOpImpl(node);
      }
      else if (type == PRED) {
        return new PactPredImpl(node);
      }
      else if (type == PROPERTY) {
        return new PactPropertyImpl(node);
      }
      else if (type == SIG_LIST) {
        return new PactSigListImpl(node);
      }
      else if (type == SINGLE_BIND) {
        return new PactSingleBindImpl(node);
      }
      else if (type == STEP) {
        return new PactStepImpl(node);
      }
      else if (type == STRING) {
        return new PactStringImpl(node);
      }
      else if (type == STRING_LIT) {
        return new PactStringLitImpl(node);
      }
      else if (type == SYMBOL) {
        return new PactSymbolImpl(node);
      }
      else if (type == TOP_LEVEL_LIST) {
        return new PactTopLevelListImpl(node);
      }
      else if (type == TYPE_ANN) {
        return new PactTypeAnnImpl(node);
      }
      else if (type == UC_LETTER) {
        return new PactUcLetterImpl(node);
      }
      else if (type == USE) {
        return new PactUseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
