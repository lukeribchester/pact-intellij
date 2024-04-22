package io.kadena.pact.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.kadena.pact.language.psi.PactTypes;
import com.intellij.psi.TokenType;

%%

%class PactLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]

// Lexer.x
STR=(\"([^\"\\]|\\\"|\\)*\")
NUM=([0-9])
COMMENT=(;.*\n*)

LET_KEYWORD=(let\*|let)
IF_KEYWORD="if"
DEFUN_KEYWORD="defun"
DEF_CAP_KEYWORD="defcap"
DEF_CONST_KEYWORD="defconst"
DEF_SCHEMA_KEYWORD="defschema"
DEF_TABLE_KEYWORD="deftable"
DEF_PACT_KEYWORD="defpact"
INTERFACE_KEYWORD="interface"
MODULE_KEYWORD="module"
BLESS_KEYWORD="bless"
IMPLEMENTS_KEYWORD="implements"
IMPORT_KEYWORD="use"
TRUE_KEYWORD="true"
FALSE_KEYWORD="false"
LAMBDA_KEYWORD="lambda"

AND_KEYWORD="and"
OR_KEYWORD="or"
LOAD_KEYWORD="load"
DOC_ANN_KEYWORD="@doc"
MODEL_ANN_KEYWORD="@model"
EVENT_ANN_KEYWORD="@event"
MANAGED_ANN_KEYWORD="@managed"
STEP_WITH_ROLLBACK_KEYWORD="step-with-rollback"
ENFORCE_KEYWORD="enforce"
ENFORCE_ONE_KEYWORD="enforce-one"
STEP_KEYWORD="step"
WITH_CAPABILITY_KEYWORD="with-capability"
CREATE_USER_GUARD_KEYWORD="create-user-guard"
TRY_KEYWORD="try"
BLOCK_INTRO_KEYWORD="progn"
SUSPEND_KEYWORD="suspend"

TICK='[a-zA-Z][a-zA-Z0-9\-_]*
OPEN_PARENS="("
CLOSE_PARENS=")"
OPEN_BRACE="{"
CLOSE_BRACE="}"
OPEN_BRACKET="["
CLOSE_BRACKET="]"
COMMA=","
DOT="."
BIND_ASSIGN=":="
DYN_ACC="::"
COLON=":"

IDENT=[a-zA-Z%#+\-_&$@<>=\^?*!|/~][a-zA-Z0-9%#+\-_&$@<>=\^?*!|/~]*

%state WAITING_VALUE

%%
// Lexer.x
<YYINITIAL> {STR}                           { yybegin(YYINITIAL); return PactTypes.STR; }
<YYINITIAL> {COMMENT}                           { yybegin(YYINITIAL); return PactTypes.COMMENT; }

<YYINITIAL> {LET_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.LET_KEYWORD; }
<YYINITIAL> {IF_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.IF_KEYWORD; }
<YYINITIAL> {DEFUN_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DEFUN_KEYWORD; }
<YYINITIAL> {DEF_CAP_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DEF_CAP_KEYWORD; }
<YYINITIAL> {DEF_CONST_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DEF_CONST_KEYWORD; }
<YYINITIAL> {DEF_SCHEMA_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DEF_SCHEMA_KEYWORD; }
<YYINITIAL> {DEF_TABLE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DEF_TABLE_KEYWORD; }
<YYINITIAL> {DEF_PACT_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DEF_PACT_KEYWORD; }
<YYINITIAL> {INTERFACE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.INTERFACE_KEYWORD; }
<YYINITIAL> {MODULE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.MODULE_KEYWORD; }
<YYINITIAL> {BLESS_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.BLESS_KEYWORD; }
<YYINITIAL> {IMPLEMENTS_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.IMPLEMENTS_KEYWORD; }
<YYINITIAL> {IMPORT_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.IMPORT_KEYWORD; }
<YYINITIAL> {TRUE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.TRUE_KEYWORD; }
<YYINITIAL> {FALSE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.FALSE_KEYWORD; }
<YYINITIAL> {LAMBDA_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.LAMBDA_KEYWORD; }

<YYINITIAL> {AND_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.AND_KEYWORD; }
<YYINITIAL> {OR_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.OR_KEYWORD; }
<YYINITIAL> {LOAD_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.LOAD_KEYWORD; }
<YYINITIAL> {DOC_ANN_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.DOC_ANN_KEYWORD; }
<YYINITIAL> {MODEL_ANN_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.MODEL_ANN_KEYWORD; }
<YYINITIAL> {EVENT_ANN_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.EVENT_ANN_KEYWORD; }
<YYINITIAL> {MANAGED_ANN_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.MANAGED_ANN_KEYWORD; }
<YYINITIAL> {STEP_WITH_ROLLBACK_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.STEP_WITH_ROLLBACK_KEYWORD; }
<YYINITIAL> {ENFORCE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.ENFORCE_KEYWORD; }
<YYINITIAL> {ENFORCE_ONE_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.ENFORCE_ONE_KEYWORD; }
<YYINITIAL> {STEP_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.STEP_KEYWORD; }
<YYINITIAL> {WITH_CAPABILITY_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.WITH_CAPABILITY_KEYWORD; }
<YYINITIAL> {CREATE_USER_GUARD_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.CREATE_USER_GUARD_KEYWORD; }
<YYINITIAL> {TRY_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.TRY_KEYWORD; }
<YYINITIAL> {BLOCK_INTRO_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.BLOCK_INTRO_KEYWORD; }
<YYINITIAL> {SUSPEND_KEYWORD}                           { yybegin(YYINITIAL); return PactTypes.SUSPEND_KEYWORD; }

<YYINITIAL> {NUM}                           { yybegin(YYINITIAL); return PactTypes.NUM; }

<YYINITIAL> {TICK}                           { yybegin(YYINITIAL); return PactTypes.TICK; }
<YYINITIAL> {OPEN_PARENS}                           { yybegin(YYINITIAL); return PactTypes.OPEN_PARENS; }
<YYINITIAL> {CLOSE_PARENS}                           { yybegin(YYINITIAL); return PactTypes.CLOSE_PARENS; }
<YYINITIAL> {OPEN_BRACE}                           { yybegin(YYINITIAL); return PactTypes.OPEN_BRACE; }
<YYINITIAL> {CLOSE_BRACE}                           { yybegin(YYINITIAL); return PactTypes.CLOSE_BRACE; }
<YYINITIAL> {OPEN_BRACKET}                           { yybegin(YYINITIAL); return PactTypes.OPEN_BRACKET; }
<YYINITIAL> {CLOSE_BRACKET}                           { yybegin(YYINITIAL); return PactTypes.CLOSE_BRACKET; }
<YYINITIAL> {COMMA}                           { yybegin(YYINITIAL); return PactTypes.COMMA; }
<YYINITIAL> {DOT}                           { yybegin(YYINITIAL); return PactTypes.DOT; }
<YYINITIAL> {BIND_ASSIGN}                           { yybegin(YYINITIAL); return PactTypes.BIND_ASSIGN; }
<YYINITIAL> {DYN_ACC}                           { yybegin(YYINITIAL); return PactTypes.DYN_ACC; }
<YYINITIAL> {COLON}                           { yybegin(YYINITIAL); return PactTypes.COLON; }

<YYINITIAL> {IDENT}                           { yybegin(YYINITIAL); return PactTypes.IDENT; }

// Reference
<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
[^]                                                         { return TokenType.BAD_CHARACTER; }
