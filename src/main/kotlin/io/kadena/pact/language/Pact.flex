package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.PactTypes;
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
STRING="regexp:(\"([^\"\\]|\\\"|\\)*\")"
COMMENT="regexp:(;.*\n)"

LET="let*" | "let"
IF="if"
DEFUN="defun"
DEF_CAP="defcap"
DEF_CONST="defconst"
DEF_SCHEMA="defschema"
DEF_TABLE="deftable"
DEF_PACT="defpact"
INTERFACE="interface"
MODULE="module"
BLESS="bless"
IMPLEMENTS="implements"
IMPORT="use"
TRUE="true"
FALSE="false"
LAMBDA="lambda"

AND="and"
OR="or"
LOAD="load"
DOC_ANN="@doc"
MODEL_ANN="@model"
EVENT_ANN="@event"
MANAGED_ANN="@managed"
STEP_WITH_ROLLBACK="step-with-rollback"
ENFORCE="enforce"
ENFORCE_ONE="enforce-one"
STEP="step"
WITH_CAPABILITY="with-capability"
CREATE_USER_GUARD="create-user-guard"
TRY="try"
BLOCK_INTRO="progn"
SUSPEND="suspend"

NUMBER="regexp:([0-9])"

SINGLE_TICK="'" // Investigate
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

%state WAITING_VALUE

%%
// Lexer.x
<YYINITIAL> {STRING}                           { yybegin(YYINITIAL); return PactTypes.STRING; }
<YYINITIAL> {COMMENT}                           { yybegin(YYINITIAL); return PactTypes.COMMENT; }

<YYINITIAL> {LET}                           { yybegin(YYINITIAL); return PactTypes.LET; }
<YYINITIAL> {IF}                           { yybegin(YYINITIAL); return PactTypes.IF; }
<YYINITIAL> {DEFUN}                           { yybegin(YYINITIAL); return PactTypes.DEFUN; }
<YYINITIAL> {DEF_CAP}                           { yybegin(YYINITIAL); return PactTypes.DEF_CAP; }
<YYINITIAL> {DEF_CONST}                           { yybegin(YYINITIAL); return PactTypes.DEF_CONST; }
<YYINITIAL> {DEF_SCHEMA}                           { yybegin(YYINITIAL); return PactTypes.DEF_SCHEMA; }
<YYINITIAL> {DEF_TABLE}                           { yybegin(YYINITIAL); return PactTypes.DEF_TABLE; }
<YYINITIAL> {DEF_PACT}                           { yybegin(YYINITIAL); return PactTypes.DEF_PACT; }
<YYINITIAL> {INTERFACE}                           { yybegin(YYINITIAL); return PactTypes.INTERFACE; }
<YYINITIAL> {MODULE}                           { yybegin(YYINITIAL); return PactTypes.MODULE; }
<YYINITIAL> {BLESS}                           { yybegin(YYINITIAL); return PactTypes.BLESS; }
<YYINITIAL> {IMPLEMENTS}                           { yybegin(YYINITIAL); return PactTypes.IMPLEMENTS; }
<YYINITIAL> {IMPORT}                           { yybegin(YYINITIAL); return PactTypes.IMPORT; }
<YYINITIAL> {TRUE}                           { yybegin(YYINITIAL); return PactTypes.TRUE; }
<YYINITIAL> {FALSE}                           { yybegin(YYINITIAL); return PactTypes.FALSE; }
<YYINITIAL> {LAMBDA}                           { yybegin(YYINITIAL); return PactTypes.LAMBDA; }

<YYINITIAL> {AND}                           { yybegin(YYINITIAL); return PactTypes.AND; }
<YYINITIAL> {OR}                           { yybegin(YYINITIAL); return PactTypes.OR; }
<YYINITIAL> {LOAD}                           { yybegin(YYINITIAL); return PactTypes.LOAD; }
<YYINITIAL> {DOC_ANN}                           { yybegin(YYINITIAL); return PactTypes.DOC_ANN; }
<YYINITIAL> {MODEL_ANN}                           { yybegin(YYINITIAL); return PactTypes.MODEL_ANN; }
<YYINITIAL> {EVENT_ANN}                           { yybegin(YYINITIAL); return PactTypes.EVENT_ANN; }
<YYINITIAL> {MANAGED_ANN}                           { yybegin(YYINITIAL); return PactTypes.MANAGED_ANN; }
<YYINITIAL> {STEP_WITH_ROLLBACK}                           { yybegin(YYINITIAL); return PactTypes.STEP_WITH_ROLLBACK; }
<YYINITIAL> {ENFORCE}                           { yybegin(YYINITIAL); return PactTypes.ENFORCE; }
<YYINITIAL> {ENFORCE_ONE}                           { yybegin(YYINITIAL); return PactTypes.ENFORCE_ONE; }
<YYINITIAL> {STEP}                           { yybegin(YYINITIAL); return PactTypes.STEP; }
<YYINITIAL> {WITH_CAPABILITY}                           { yybegin(YYINITIAL); return PactTypes.WITH_CAPABILITY; }
<YYINITIAL> {CREATE_USER_GUARD}                           { yybegin(YYINITIAL); return PactTypes.CREATE_USER_GUARD; }
<YYINITIAL> {TRY}                           { yybegin(YYINITIAL); return PactTypes.TRY; }
<YYINITIAL> {BLOCK_INTRO}                           { yybegin(YYINITIAL); return PactTypes.BLOCK_INTRO; }
<YYINITIAL> {SUSPEND}                           { yybegin(YYINITIAL); return PactTypes.SUSPEND; }

<YYINITIAL> {NUMBER}                           { yybegin(YYINITIAL); return PactTypes.NUMBER; }

<YYINITIAL> {SINGLE_TICK}                           { yybegin(YYINITIAL); return PactTypes.SINGLE_TICK; }
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

// Reference
<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
[^]                                                         { return TokenType.BAD_CHARACTER; }
