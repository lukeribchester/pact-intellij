// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.kadena.pact.language.psi.impl.*;

public interface PactTypes {

  IElementType APP_BIND_LIST = new PactElementType("APP_BIND_LIST");
  IElementType APP_LIST = new PactElementType("APP_LIST");
  IElementType ARITHMETIC_OPERATOR = new PactElementType("ARITHMETIC_OPERATOR");
  IElementType ASSIGNMENT_OPERATOR = new PactElementType("ASSIGNMENT_OPERATOR");
  IElementType ATOMIC_DATA_TYPE = new PactElementType("ATOMIC_DATA_TYPE");
  IElementType BINDERS = new PactElementType("BINDERS");
  IElementType BINDING_FORM = new PactElementType("BINDING_FORM");
  IElementType BIND_PAIR = new PactElementType("BIND_PAIR");
  IElementType BIND_PAIRS = new PactElementType("BIND_PAIRS");
  IElementType BITWISE_OPERATOR = new PactElementType("BITWISE_OPERATOR");
  IElementType BLOCK = new PactElementType("BLOCK");
  IElementType BLOCK_BODY = new PactElementType("BLOCK_BODY");
  IElementType BOOLEAN = new PactElementType("BOOLEAN");
  IElementType CAPABILITY_EXPRESSION = new PactElementType("CAPABILITY_EXPRESSION");
  IElementType CAPABILITY_FORM = new PactElementType("CAPABILITY_FORM");
  IElementType COMPOSITE_DATA_TYPE = new PactElementType("COMPOSITE_DATA_TYPE");
  IElementType DATA_TYPE = new PactElementType("DATA_TYPE");
  IElementType DEFUN = new PactElementType("DEFUN");
  IElementType DEF_CAP = new PactElementType("DEF_CAP");
  IElementType DEF_CONST = new PactElementType("DEF_CONST");
  IElementType DEF_PACT = new PactElementType("DEF_PACT");
  IElementType DEF_SCHEMA = new PactElementType("DEF_SCHEMA");
  IElementType DEF_TABLE = new PactElementType("DEF_TABLE");
  IElementType DOCUMENTATION_ANNOTATION = new PactElementType("DOCUMENTATION_ANNOTATION");
  IElementType DOCUMENTATION_STRING = new PactElementType("DOCUMENTATION_STRING");
  IElementType EVENT_ANNOTATION = new PactElementType("EVENT_ANNOTATION");
  IElementType EXPRESSION = new PactElementType("EXPRESSION");
  IElementType EXPRESSION_COMMA_SEP = new PactElementType("EXPRESSION_COMMA_SEP");
  IElementType EXTENSION = new PactElementType("EXTENSION");
  IElementType FIELD_PAIR = new PactElementType("FIELD_PAIR");
  IElementType FV_DELIM = new PactElementType("FV_DELIM");
  IElementType FV_KEYWORD = new PactElementType("FV_KEYWORD");
  IElementType GENERIC_EXPRESSION = new PactElementType("GENERIC_EXPRESSION");
  IElementType IF_DEFUN = new PactElementType("IF_DEFUN");
  IElementType IF_DEF_CAP = new PactElementType("IF_DEF_CAP");
  IElementType IF_DEF_PACT = new PactElementType("IF_DEF_PACT");
  IElementType IF_EXPRESSION = new PactElementType("IF_EXPRESSION");
  IElementType IMPORT_LIST = new PactElementType("IMPORT_LIST");
  IElementType INTERFACE = new PactElementType("INTERFACE");
  IElementType LAMBDA_ARGUMENT = new PactElementType("LAMBDA_ARGUMENT");
  IElementType LAMBDA_ARGUMENTS = new PactElementType("LAMBDA_ARGUMENTS");
  IElementType LAMBDA_EXPRESSION = new PactElementType("LAMBDA_EXPRESSION");
  IElementType LET_EXPRESSION = new PactElementType("LET_EXPRESSION");
  IElementType LIST = new PactElementType("LIST");
  IElementType LIST_EXPRESSION = new PactElementType("LIST_EXPRESSION");
  IElementType LOGICAL_OPERATOR = new PactElementType("LOGICAL_OPERATOR");
  IElementType MANAGED_ANNOTATION = new PactElementType("MANAGED_ANNOTATION");
  IElementType MD_CAP_META = new PactElementType("MD_CAP_META");
  IElementType MODEL_ANNOTATION = new PactElementType("MODEL_ANNOTATION");
  IElementType MODULE = new PactElementType("MODULE");
  IElementType MODULE_NAMES = new PactElementType("MODULE_NAMES");
  IElementType MODULE_QUALIFIER = new PactElementType("MODULE_QUALIFIER");
  IElementType M_ARG = new PactElementType("M_ARG");
  IElementType M_ARGS = new PactElementType("M_ARGS");
  IElementType M_COMMA_EXPRESSION = new PactElementType("M_COMMA_EXPRESSION");
  IElementType M_DOC = new PactElementType("M_DOC");
  IElementType M_MODEL = new PactElementType("M_MODEL");
  IElementType M_TYPE_ANN = new PactElementType("M_TYPE_ANN");
  IElementType NUMBER = new PactElementType("NUMBER");
  IElementType OBJECT = new PactElementType("OBJECT");
  IElementType OBJECT_BODY = new PactElementType("OBJECT_BODY");
  IElementType OPERATOR = new PactElementType("OPERATOR");
  IElementType PACT_FV_MODELS = new PactElementType("PACT_FV_MODELS");
  IElementType PARSED_NAME = new PactElementType("PARSED_NAME");
  IElementType PARSED_TYPE_NAME = new PactElementType("PARSED_TYPE_NAME");
  IElementType PROGRAM_LIST = new PactElementType("PROGRAM_LIST");
  IElementType PROG_N_EXPRESSION = new PactElementType("PROG_N_EXPRESSION");
  IElementType PROP_ATOM = new PactElementType("PROP_ATOM");
  IElementType PROP_EXPRESSION = new PactElementType("PROP_EXPRESSION");
  IElementType PROP_EXPRESSION_LIST = new PactElementType("PROP_EXPRESSION_LIST");
  IElementType RELATIONAL_OPERATOR = new PactElementType("RELATIONAL_OPERATOR");
  IElementType REPL_PROGRAM_LIST = new PactElementType("REPL_PROGRAM_LIST");
  IElementType REPL_SPECIAL = new PactElementType("REPL_SPECIAL");
  IElementType SCHEMA_ARGUMENT = new PactElementType("SCHEMA_ARGUMENT");
  IElementType SCHEMA_ARGUMENT_LIST = new PactElementType("SCHEMA_ARGUMENT_LIST");
  IElementType STEP = new PactElementType("STEP");
  IElementType STEPS = new PactElementType("STEPS");
  IElementType STRING = new PactElementType("STRING");
  IElementType SUSPEND_EXPRESSION = new PactElementType("SUSPEND_EXPRESSION");
  IElementType TRY_EXPRESSION = new PactElementType("TRY_EXPRESSION");
  IElementType TYPE_DECLARATION = new PactElementType("TYPE_DECLARATION");
  IElementType USE = new PactElementType("USE");
  IElementType VARIABLE = new PactElementType("VARIABLE");

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
  IElementType FLOATING_POINT = new PactTokenType("FLOATING_POINT");
  IElementType FLOOR = new PactTokenType("floor");
  IElementType GREATER_THAN = new PactTokenType(">");
  IElementType GREATER_THAN_OR_EQUAL = new PactTokenType(">=");
  IElementType IDENTIFIER = new PactTokenType("IDENTIFIER");
  IElementType INTEGER = new PactTokenType("INTEGER");
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
  IElementType OR = new PactTokenType("or");
  IElementType OR_SHORT_CIRCUIT = new PactTokenType("or?");
  IElementType PAREN_CLOSE = new PactTokenType(")");
  IElementType PAREN_OPEN = new PactTokenType("(");
  IElementType PLUS = new PactTokenType("+");
  IElementType POW = new PactTokenType("^");
  IElementType ROUND = new PactTokenType("round");
  IElementType SQRT = new PactTokenType("sqrt");
  IElementType STR = new PactTokenType("STR");
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
      else if (type == ARITHMETIC_OPERATOR) {
        return new PactArithmeticOperatorImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new PactAssignmentOperatorImpl(node);
      }
      else if (type == ATOMIC_DATA_TYPE) {
        return new PactAtomicDataTypeImpl(node);
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
      else if (type == BITWISE_OPERATOR) {
        return new PactBitwiseOperatorImpl(node);
      }
      else if (type == BLOCK) {
        return new PactBlockImpl(node);
      }
      else if (type == BLOCK_BODY) {
        return new PactBlockBodyImpl(node);
      }
      else if (type == BOOLEAN) {
        return new PactBooleanImpl(node);
      }
      else if (type == CAPABILITY_EXPRESSION) {
        return new PactCapabilityExpressionImpl(node);
      }
      else if (type == CAPABILITY_FORM) {
        return new PactCapabilityFormImpl(node);
      }
      else if (type == COMPOSITE_DATA_TYPE) {
        return new PactCompositeDataTypeImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new PactDataTypeImpl(node);
      }
      else if (type == DEFUN) {
        return new PactDefunImpl(node);
      }
      else if (type == DEF_CAP) {
        return new PactDefCapImpl(node);
      }
      else if (type == DEF_CONST) {
        return new PactDefConstImpl(node);
      }
      else if (type == DEF_PACT) {
        return new PactDefPactImpl(node);
      }
      else if (type == DEF_SCHEMA) {
        return new PactDefSchemaImpl(node);
      }
      else if (type == DEF_TABLE) {
        return new PactDefTableImpl(node);
      }
      else if (type == DOCUMENTATION_ANNOTATION) {
        return new PactDocumentationAnnotationImpl(node);
      }
      else if (type == DOCUMENTATION_STRING) {
        return new PactDocumentationStringImpl(node);
      }
      else if (type == EVENT_ANNOTATION) {
        return new PactEventAnnotationImpl(node);
      }
      else if (type == EXPRESSION) {
        return new PactExpressionImpl(node);
      }
      else if (type == EXPRESSION_COMMA_SEP) {
        return new PactExpressionCommaSepImpl(node);
      }
      else if (type == EXTENSION) {
        return new PactExtensionImpl(node);
      }
      else if (type == FIELD_PAIR) {
        return new PactFieldPairImpl(node);
      }
      else if (type == FV_DELIM) {
        return new PactFVDelimImpl(node);
      }
      else if (type == FV_KEYWORD) {
        return new PactFVKeywordImpl(node);
      }
      else if (type == GENERIC_EXPRESSION) {
        return new PactGenericExpressionImpl(node);
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
      else if (type == IF_EXPRESSION) {
        return new PactIfExpressionImpl(node);
      }
      else if (type == IMPORT_LIST) {
        return new PactImportListImpl(node);
      }
      else if (type == INTERFACE) {
        return new PactInterfaceImpl(node);
      }
      else if (type == LAMBDA_ARGUMENT) {
        return new PactLambdaArgumentImpl(node);
      }
      else if (type == LAMBDA_ARGUMENTS) {
        return new PactLambdaArgumentsImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new PactLambdaExpressionImpl(node);
      }
      else if (type == LET_EXPRESSION) {
        return new PactLetExpressionImpl(node);
      }
      else if (type == LIST) {
        return new PactListImpl(node);
      }
      else if (type == LIST_EXPRESSION) {
        return new PactListExpressionImpl(node);
      }
      else if (type == LOGICAL_OPERATOR) {
        return new PactLogicalOperatorImpl(node);
      }
      else if (type == MANAGED_ANNOTATION) {
        return new PactManagedAnnotationImpl(node);
      }
      else if (type == MD_CAP_META) {
        return new PactMDCapMetaImpl(node);
      }
      else if (type == MODEL_ANNOTATION) {
        return new PactModelAnnotationImpl(node);
      }
      else if (type == MODULE) {
        return new PactModuleImpl(node);
      }
      else if (type == MODULE_NAMES) {
        return new PactModuleNamesImpl(node);
      }
      else if (type == MODULE_QUALIFIER) {
        return new PactModuleQualifierImpl(node);
      }
      else if (type == M_ARG) {
        return new PactMArgImpl(node);
      }
      else if (type == M_ARGS) {
        return new PactMArgsImpl(node);
      }
      else if (type == M_COMMA_EXPRESSION) {
        return new PactMCommaExpressionImpl(node);
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
      else if (type == PARSED_TYPE_NAME) {
        return new PactParsedTypeNameImpl(node);
      }
      else if (type == PROGRAM_LIST) {
        return new PactProgramListImpl(node);
      }
      else if (type == PROG_N_EXPRESSION) {
        return new PactProgNExpressionImpl(node);
      }
      else if (type == PROP_ATOM) {
        return new PactPropAtomImpl(node);
      }
      else if (type == PROP_EXPRESSION) {
        return new PactPropExpressionImpl(node);
      }
      else if (type == PROP_EXPRESSION_LIST) {
        return new PactPropExpressionListImpl(node);
      }
      else if (type == RELATIONAL_OPERATOR) {
        return new PactRelationalOperatorImpl(node);
      }
      else if (type == REPL_PROGRAM_LIST) {
        return new PactReplProgramListImpl(node);
      }
      else if (type == REPL_SPECIAL) {
        return new PactReplSpecialImpl(node);
      }
      else if (type == SCHEMA_ARGUMENT) {
        return new PactSchemaArgumentImpl(node);
      }
      else if (type == SCHEMA_ARGUMENT_LIST) {
        return new PactSchemaArgumentListImpl(node);
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
      else if (type == SUSPEND_EXPRESSION) {
        return new PactSuspendExpressionImpl(node);
      }
      else if (type == TRY_EXPRESSION) {
        return new PactTryExpressionImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new PactTypeDeclarationImpl(node);
      }
      else if (type == USE) {
        return new PactUseImpl(node);
      }
      else if (type == VARIABLE) {
        return new PactVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
