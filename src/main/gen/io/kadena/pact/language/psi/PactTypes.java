// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.kadena.pact.language.psi.impl.*;

public interface PactTypes {

  IElementType APP_BIND_LIST = new PactElementType("APP_BIND_LIST");
  IElementType APP_LIST = new PactElementType("APP_LIST");
  IElementType ATOM = new PactElementType("ATOM");
  IElementType BINDERS = new PactElementType("BINDERS");
  IElementType BINDING_FORM = new PactElementType("BINDING_FORM");
  IElementType BIND_PAIR = new PactElementType("BIND_PAIR");
  IElementType BIND_PAIRS = new PactElementType("BIND_PAIRS");
  IElementType BLOCK = new PactElementType("BLOCK");
  IElementType BLOCK_BODY = new PactElementType("BLOCK_BODY");
  IElementType BOOL = new PactElementType("BOOL");
  IElementType CAP_EXPR = new PactElementType("CAP_EXPR");
  IElementType CAP_FORM = new PactElementType("CAP_FORM");
  IElementType DEFCAP = new PactElementType("DEFCAP");
  IElementType DEFSCHEMA = new PactElementType("DEFSCHEMA");
  IElementType DEFTABLE = new PactElementType("DEFTABLE");
  IElementType DEFUN = new PactElementType("DEFUN");
  IElementType DEF_CONST = new PactElementType("DEF_CONST");
  IElementType DEF_PACT = new PactElementType("DEF_PACT");
  IElementType DOC_ANN = new PactElementType("DOC_ANN");
  IElementType DOC_STR = new PactElementType("DOC_STR");
  IElementType EVENT = new PactElementType("EVENT");
  IElementType EXPR = new PactElementType("EXPR");
  IElementType EXPR_COMMA_SEP = new PactElementType("EXPR_COMMA_SEP");
  IElementType EXT = new PactElementType("EXT");
  IElementType FIELD_PAIR = new PactElementType("FIELD_PAIR");
  IElementType FIELD_PAIRS = new PactElementType("FIELD_PAIRS");
  IElementType FV_BOOL = new PactElementType("FV_BOOL");
  IElementType FV_DELIM = new PactElementType("FV_DELIM");
  IElementType FV_KEYWORD = new PactElementType("FV_KEYWORD");
  IElementType FV_NUMBER = new PactElementType("FV_NUMBER");
  IElementType FV_STRING = new PactElementType("FV_STRING");
  IElementType FV_VAR = new PactElementType("FV_VAR");
  IElementType GEN_APP_EXPR = new PactElementType("GEN_APP_EXPR");
  IElementType IF_DEFUN = new PactElementType("IF_DEFUN");
  IElementType IF_DEF_CAP = new PactElementType("IF_DEF_CAP");
  IElementType IF_DEF_PACT = new PactElementType("IF_DEF_PACT");
  IElementType IF_EXPR = new PactElementType("IF_EXPR");
  IElementType IMPORT_LIST = new PactElementType("IMPORT_LIST");
  IElementType IMPORT_NAMES = new PactElementType("IMPORT_NAMES");
  IElementType IMPORT_OR_IF_DEF = new PactElementType("IMPORT_OR_IF_DEF");
  IElementType INTERFACE = new PactElementType("INTERFACE");
  IElementType LAM_ARG = new PactElementType("LAM_ARG");
  IElementType LAM_ARGS = new PactElementType("LAM_ARGS");
  IElementType LAM_EXPR = new PactElementType("LAM_EXPR");
  IElementType LET_EXPR = new PactElementType("LET_EXPR");
  IElementType LIST = new PactElementType("LIST");
  IElementType LIST_EXPRS = new PactElementType("LIST_EXPRS");
  IElementType MANAGED = new PactElementType("MANAGED");
  IElementType MD_CAP_META = new PactElementType("MD_CAP_META");
  IElementType MODEL_ANN = new PactElementType("MODEL_ANN");
  IElementType MODULE = new PactElementType("MODULE");
  IElementType MODULE_NAMES = new PactElementType("MODULE_NAMES");
  IElementType MOD_QUAL = new PactElementType("MOD_QUAL");
  IElementType M_ARG = new PactElementType("M_ARG");
  IElementType M_ARGS = new PactElementType("M_ARGS");
  IElementType M_COMMA_EXPR = new PactElementType("M_COMMA_EXPR");
  IElementType M_DOC = new PactElementType("M_DOC");
  IElementType M_MODEL = new PactElementType("M_MODEL");
  IElementType M_TYPE_ANN = new PactElementType("M_TYPE_ANN");
  IElementType NUMBER = new PactElementType("NUMBER");
  IElementType OBJECT = new PactElementType("OBJECT");
  IElementType OBJECT_BODY = new PactElementType("OBJECT_BODY");
  IElementType OPERATOR = new PactElementType("OPERATOR");
  IElementType PACT_FV_MODELS = new PactElementType("PACT_FV_MODELS");
  IElementType PARSED_NAME = new PactElementType("PARSED_NAME");
  IElementType PARSED_TY_NAME = new PactElementType("PARSED_TY_NAME");
  IElementType PROGRAM_LIST = new PactElementType("PROGRAM_LIST");
  IElementType PROG_N_EXPR = new PactElementType("PROG_N_EXPR");
  IElementType PROP_ATOM = new PactElementType("PROP_ATOM");
  IElementType PROP_EXPR = new PactElementType("PROP_EXPR");
  IElementType PROP_EXPR_LIST = new PactElementType("PROP_EXPR_LIST");
  IElementType REPL_PROGRAM_LIST = new PactElementType("REPL_PROGRAM_LIST");
  IElementType REPL_SPECIAL = new PactElementType("REPL_SPECIAL");
  IElementType SCHEMA_ARG = new PactElementType("SCHEMA_ARG");
  IElementType SCHEMA_ARG_LIST = new PactElementType("SCHEMA_ARG_LIST");
  IElementType STEP = new PactElementType("STEP");
  IElementType STEPS = new PactElementType("STEPS");
  IElementType STRING = new PactElementType("STRING");
  IElementType STRING_RAW = new PactElementType("STRING_RAW");
  IElementType SUSPEND_EXPR = new PactElementType("SUSPEND_EXPR");
  IElementType TRY_EXPR = new PactElementType("TRY_EXPR");
  IElementType TYPE = new PactElementType("TYPE");
  IElementType USE = new PactElementType("USE");
  IElementType VAR = new PactElementType("VAR");

  IElementType ABS = new PactTokenType("abs");
  IElementType AND = new PactTokenType("and");
  IElementType AND_SHORT_CIRCUIT = new PactTokenType("and?");
  IElementType BIND_ASSIGN = new PactTokenType(":=");
  IElementType BITWISE_AND = new PactTokenType("&");
  IElementType BITWISE_OR = new PactTokenType("|");
  IElementType BITWISE_REVERSE = new PactTokenType("~");
  IElementType BITWISE_SHIFT = new PactTokenType("shift");
  IElementType BITWISE_XOR = new PactTokenType("xor");
  IElementType BRACE_CLOSE = new PactTokenType("}");
  IElementType BRACE_OPEN = new PactTokenType("{");
  IElementType BRACKET_CLOSE = new PactTokenType("]");
  IElementType BRACKET_OPEN = new PactTokenType("[");
  IElementType CEILING = new PactTokenType("ceiling");
  IElementType COLON = new PactTokenType(":");
  IElementType COMMA = new PactTokenType(",");
  IElementType COMMENT = new PactTokenType("COMMENT");
  IElementType DECIMAL = new PactTokenType("dec");
  IElementType DIVIDE = new PactTokenType("/");
  IElementType DOT = new PactTokenType(".");
  IElementType DYN_ACC = new PactTokenType("::");
  IElementType EQUAL = new PactTokenType("=");
  IElementType EXP = new PactTokenType("exp");
  IElementType FALSE = new PactTokenType("false");
  IElementType FLOOR = new PactTokenType("floor");
  IElementType GREATER_THAN = new PactTokenType(">");
  IElementType GREATER_THAN_OR_EQUAL = new PactTokenType(">=");
  IElementType IDENTIFIER = new PactTokenType("IDENTIFIER");
  IElementType KEYWORD_BLESS = new PactTokenType("bless");
  IElementType KEYWORD_BLOCK_INTRO = new PactTokenType("progn");
  IElementType KEYWORD_CREATE_USER_GUARD = new PactTokenType("create-user-guard");
  IElementType KEYWORD_DEFUN = new PactTokenType("defun");
  IElementType KEYWORD_DEF_CAP = new PactTokenType("defcap");
  IElementType KEYWORD_DEF_CONST = new PactTokenType("defconst");
  IElementType KEYWORD_DEF_PACT = new PactTokenType("defpact");
  IElementType KEYWORD_DEF_SCHEMA = new PactTokenType("defschema");
  IElementType KEYWORD_DEF_TABLE = new PactTokenType("deftable");
  IElementType KEYWORD_DOC_ANNOTATION = new PactTokenType("@doc");
  IElementType KEYWORD_ENFORCE = new PactTokenType("enforce");
  IElementType KEYWORD_ENFORCE_ONE = new PactTokenType("enforce-one");
  IElementType KEYWORD_EVENT_ANNOTATION = new PactTokenType("@event");
  IElementType KEYWORD_IF = new PactTokenType("if");
  IElementType KEYWORD_IMPLEMENTS = new PactTokenType("implements");
  IElementType KEYWORD_IMPORT = new PactTokenType("use");
  IElementType KEYWORD_INTERFACE = new PactTokenType("interface");
  IElementType KEYWORD_LAMBDA = new PactTokenType("lambda");
  IElementType KEYWORD_LET = new PactTokenType("KEYWORD_LET");
  IElementType KEYWORD_LOAD = new PactTokenType("load");
  IElementType KEYWORD_MANAGED_ANNOTATION = new PactTokenType("@managed");
  IElementType KEYWORD_MODEL_ANNOTATION = new PactTokenType("@model");
  IElementType KEYWORD_MODULE = new PactTokenType("module");
  IElementType KEYWORD_STEP = new PactTokenType("step");
  IElementType KEYWORD_STEP_WITH_ROLLBACK = new PactTokenType("step-with-rollback");
  IElementType KEYWORD_SUSPEND = new PactTokenType("suspend");
  IElementType KEYWORD_TRY = new PactTokenType("try");
  IElementType KEYWORD_WITH_CAPABILITY = new PactTokenType("with-capability");
  IElementType LESS_THAN = new PactTokenType("<");
  IElementType LESS_THAN_OR_EQUAL = new PactTokenType("<=");
  IElementType LN = new PactTokenType("ln");
  IElementType LOG = new PactTokenType("log");
  IElementType MINUS = new PactTokenType("-");
  IElementType MOD = new PactTokenType("mod");
  IElementType MULTIPLY = new PactTokenType("*");
  IElementType NOT = new PactTokenType("not");
  IElementType NOT_EQUAL = new PactTokenType("!=");
  IElementType NOT_SHORT_CIRCUIT = new PactTokenType("not?");
  IElementType NUMBER = new PactTokenType("NUMBER");
  IElementType OR = new PactTokenType("or");
  IElementType OR_SHORT_CIRCUIT = new PactTokenType("or?");
  IElementType PAREN_CLOSE = new PactTokenType(")");
  IElementType PAREN_OPEN = new PactTokenType("(");
  IElementType PLUS = new PactTokenType("+");
  IElementType POW = new PactTokenType("^");
  IElementType ROUND = new PactTokenType("round");
  IElementType SQRT = new PactTokenType("sqrt");
  IElementType STRING = new PactTokenType("STRING");
  IElementType TICK = new PactTokenType("TICK");
  IElementType TRUE = new PactTokenType("true");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == APP_BIND_LIST) {
        return new PactAppBindListImpl(node);
      }
      else if (type == APP_LIST) {
        return new PactAppListImpl(node);
      }
      else if (type == ATOM) {
        return new PactAtomImpl(node);
      }
      else if (type == BINDERS) {
        return new PactBindersImpl(node);
      }
      else if (type == BINDING_FORM) {
        return new PactBindingFormImpl(node);
      }
      else if (type == BIND_PAIR) {
        return new PactBindPairImpl(node);
      }
      else if (type == BIND_PAIRS) {
        return new PactBindPairsImpl(node);
      }
      else if (type == BLOCK) {
        return new PactBlockImpl(node);
      }
      else if (type == BLOCK_BODY) {
        return new PactBlockBodyImpl(node);
      }
      else if (type == BOOL) {
        return new PactBoolImpl(node);
      }
      else if (type == CAP_EXPR) {
        return new PactCapExprImpl(node);
      }
      else if (type == CAP_FORM) {
        return new PactCapFormImpl(node);
      }
      else if (type == DEFCAP) {
        return new PactDefcapImpl(node);
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
      else if (type == DEF_CONST) {
        return new PactDefConstImpl(node);
      }
      else if (type == DEF_PACT) {
        return new PactDefPactImpl(node);
      }
      else if (type == DOC_ANN) {
        return new PactDocAnnImpl(node);
      }
      else if (type == DOC_STR) {
        return new PactDocStrImpl(node);
      }
      else if (type == EVENT) {
        return new PactEventImpl(node);
      }
      else if (type == EXPR) {
        return new PactExprImpl(node);
      }
      else if (type == EXPR_COMMA_SEP) {
        return new PactExprCommaSepImpl(node);
      }
      else if (type == EXT) {
        return new PactExtImpl(node);
      }
      else if (type == FIELD_PAIR) {
        return new PactFieldPairImpl(node);
      }
      else if (type == FIELD_PAIRS) {
        return new PactFieldPairsImpl(node);
      }
      else if (type == FV_BOOL) {
        return new PactFVBoolImpl(node);
      }
      else if (type == FV_DELIM) {
        return new PactFVDelimImpl(node);
      }
      else if (type == FV_KEYWORD) {
        return new PactFVKeywordImpl(node);
      }
      else if (type == FV_NUMBER) {
        return new PactFVNumberImpl(node);
      }
      else if (type == FV_STRING) {
        return new PactFVStringImpl(node);
      }
      else if (type == FV_VAR) {
        return new PactFVVarImpl(node);
      }
      else if (type == GEN_APP_EXPR) {
        return new PactGenAppExprImpl(node);
      }
      else if (type == IF_DEFUN) {
        return new PactIfDefunImpl(node);
      }
      else if (type == IF_DEF_CAP) {
        return new PactIfDefCapImpl(node);
      }
      else if (type == IF_DEF_PACT) {
        return new PactIfDefPactImpl(node);
      }
      else if (type == IF_EXPR) {
        return new PactIfExprImpl(node);
      }
      else if (type == IMPORT_LIST) {
        return new PactImportListImpl(node);
      }
      else if (type == IMPORT_NAMES) {
        return new PactImportNamesImpl(node);
      }
      else if (type == IMPORT_OR_IF_DEF) {
        return new PactImportOrIfDefImpl(node);
      }
      else if (type == INTERFACE) {
        return new PactInterfaceImpl(node);
      }
      else if (type == LAM_ARG) {
        return new PactLamArgImpl(node);
      }
      else if (type == LAM_ARGS) {
        return new PactLamArgsImpl(node);
      }
      else if (type == LAM_EXPR) {
        return new PactLamExprImpl(node);
      }
      else if (type == LET_EXPR) {
        return new PactLetExprImpl(node);
      }
      else if (type == LIST) {
        return new PactListImpl(node);
      }
      else if (type == LIST_EXPRS) {
        return new PactListExprsImpl(node);
      }
      else if (type == MANAGED) {
        return new PactManagedImpl(node);
      }
      else if (type == MD_CAP_META) {
        return new PactMDCapMetaImpl(node);
      }
      else if (type == MODEL_ANN) {
        return new PactModelAnnImpl(node);
      }
      else if (type == MODULE) {
        return new PactModuleImpl(node);
      }
      else if (type == MODULE_NAMES) {
        return new PactModuleNamesImpl(node);
      }
      else if (type == MOD_QUAL) {
        return new PactModQualImpl(node);
      }
      else if (type == M_ARG) {
        return new PactMArgImpl(node);
      }
      else if (type == M_ARGS) {
        return new PactMArgsImpl(node);
      }
      else if (type == M_COMMA_EXPR) {
        return new PactMCommaExprImpl(node);
      }
      else if (type == M_DOC) {
        return new PactMDocImpl(node);
      }
      else if (type == M_MODEL) {
        return new PactMModelImpl(node);
      }
      else if (type == M_TYPE_ANN) {
        return new PactMTypeAnnImpl(node);
      }
      else if (type == NUMBER) {
        return new PactNumberImpl(node);
      }
      else if (type == OBJECT) {
        return new PactObjectImpl(node);
      }
      else if (type == OBJECT_BODY) {
        return new PactObjectBodyImpl(node);
      }
      else if (type == OPERATOR) {
        return new PactOperatorImpl(node);
      }
      else if (type == PACT_FV_MODELS) {
        return new PactPactFVModelsImpl(node);
      }
      else if (type == PARSED_NAME) {
        return new PactParsedNameImpl(node);
      }
      else if (type == PARSED_TY_NAME) {
        return new PactParsedTyNameImpl(node);
      }
      else if (type == PROGRAM_LIST) {
        return new PactProgramListImpl(node);
      }
      else if (type == PROG_N_EXPR) {
        return new PactProgNExprImpl(node);
      }
      else if (type == PROP_ATOM) {
        return new PactPropAtomImpl(node);
      }
      else if (type == PROP_EXPR) {
        return new PactPropExprImpl(node);
      }
      else if (type == PROP_EXPR_LIST) {
        return new PactPropExprListImpl(node);
      }
      else if (type == REPL_PROGRAM_LIST) {
        return new PactReplProgramListImpl(node);
      }
      else if (type == REPL_SPECIAL) {
        return new PactReplSpecialImpl(node);
      }
      else if (type == SCHEMA_ARG) {
        return new PactSchemaArgImpl(node);
      }
      else if (type == SCHEMA_ARG_LIST) {
        return new PactSchemaArgListImpl(node);
      }
      else if (type == STEP) {
        return new PactStepImpl(node);
      }
      else if (type == STEPS) {
        return new PactStepsImpl(node);
      }
      else if (type == STRING) {
        return new PactStringImpl(node);
      }
      else if (type == STRING_RAW) {
        return new PactStringRawImpl(node);
      }
      else if (type == SUSPEND_EXPR) {
        return new PactSuspendExprImpl(node);
      }
      else if (type == TRY_EXPR) {
        return new PactTryExprImpl(node);
      }
      else if (type == TYPE) {
        return new PactTypeImpl(node);
      }
      else if (type == USE) {
        return new PactUseImpl(node);
      }
      else if (type == VAR) {
        return new PactVarImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
