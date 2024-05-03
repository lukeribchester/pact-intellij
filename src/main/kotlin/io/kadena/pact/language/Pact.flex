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

/* Whitespace */
CRLF=\R
WHITE_SPACE=[ \n\t\f]

/* Comments */
COMMENT=(;.*\n*)

/* Keywords */
KEYWORD_BLESS="bless"
KEYWORD_ENFORCE="enforce"
KEYWORD_ENFORCE_ONE="enforce-one"
KEYWORD_ERROR="error"
KEYWORD_IF="if"
KEYWORD_IMPLEMENTS="implements"
KEYWORD_INTERFACE="interface"
KEYWORD_INVARIANT="invariant"
KEYWORD_LAMBDA="lambda"
KEYWORD_LET=(let\*?)
KEYWORD_MODULE="module"
KEYWORD_BLOCK_INTRO="progn"
KEYWORD_PROPERTY="property"
KEYWORD_STEP="step"
KEYWORD_STEP_WITH_ROLLBACK="step-with-rollback"
KEYWORD_SUSPEND="suspend"
KEYWORD_TRY="try"
KEYWORD_IMPORT="use"

/* Keywords (Capabilities) */
KEYWORD_CREATE_USER_GUARD="create-user-guard"
KEYWORD_WITH_CAPABILITY="with-capability"

/* Keywords (Definitions) */
KEYWORD_DEF_CAP="defcap"
KEYWORD_DEF_CONST="defconst"
KEYWORD_DEF_PACT="defpact"
KEYWORD_DEF_PROPERTY="defproperty"
KEYWORD_DEF_SCHEMA="defschema"
KEYWORD_DEF_TABLE="deftable"
KEYWORD_DEFUN="defun"

/* Keywords (REPL) */
KEYWORD_LOAD="load"

/* Annotations */
KEYWORD_DOC_ANNOTATION="@doc"
KEYWORD_EVENT_ANNOTATION="@event"
KEYWORD_MANAGED_ANNOTATION="@managed"
KEYWORD_MODEL_ANNOTATION="@model"

/* Literals */
STR=(\"([^\"\\]|\\\"|\\)*\")
INTEGER=([+-]?[0-9]+)
FLOATING_POINT=([+-]?([0-9]+\.[0-9]*|\.[0-9]+)([eE][+-]?[0-9]+)?)
TRUE="true"
FALSE="false"

/* Identifiers */
TICK='[a-zA-Z][a-zA-Z0-9\-_]*
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9\-_]*

/* Operators (Arithmetic) */
PLUS="+"
MINUS="-"
MULTIPLY="*"
DIVIDE="/"
POW="^"
ABS="abs"
CEILING="ceiling"
FLOOR="floor"
LOG="log"
LN="ln"
DECIMAL="dec"
EXP="exp"
MOD="mod"
ROUND="round"
SQRT="sqrt"

/* Operators (Assignment) */
BIND_ASSIGN=":="

/* Operators (Bitwise) */
BITWISE_AND="&"
BITWISE_OR="|"
BITWISE_REVERSE="~"
BITWISE_SHIFT="shift"
BITWISE_XOR="xor"

/* Operators (Logical) */
AND="and"
AND_SHORT_CIRCUIT="and?"
NOT="not"
NOT_SHORT_CIRCUIT="not?"
OR="or"
OR_SHORT_CIRCUIT="or?"

/* Operators (Relational) */
EQUAL="="
NOT_EQUAL="!="
LESS_THAN="<"
LESS_THAN_OR_EQUAL="<="
GREATER_THAN=">"
GREATER_THAN_OR_EQUAL=">="

/* Delimiters */
PAREN_OPEN="("
PAREN_CLOSE=")"
BRACE_OPEN="{"
BRACE_CLOSE="}"
BRACKET_OPEN="["
BRACKET_CLOSE="]"
COLON=":"
COMMA=","
DOT="."
DYN_ACC="::"

%state WAITING_VALUE

%%

/* Comments */
<YYINITIAL> {COMMENT} { yybegin(YYINITIAL); return PactTypes.COMMENT; }

/* Keywords */
<YYINITIAL> {KEYWORD_BLESS}              { yybegin(YYINITIAL); return PactTypes.KEYWORD_BLESS; }
<YYINITIAL> {KEYWORD_ENFORCE}            { yybegin(YYINITIAL); return PactTypes.KEYWORD_ENFORCE; }
<YYINITIAL> {KEYWORD_ENFORCE_ONE}        { yybegin(YYINITIAL); return PactTypes.KEYWORD_ENFORCE_ONE; }
<YYINITIAL> {KEYWORD_ERROR}              { yybegin(YYINITIAL); return PactTypes.KEYWORD_ERROR; }
<YYINITIAL> {KEYWORD_IF}                 { yybegin(YYINITIAL); return PactTypes.KEYWORD_IF; }
<YYINITIAL> {KEYWORD_IMPLEMENTS}         { yybegin(YYINITIAL); return PactTypes.KEYWORD_IMPLEMENTS; }
<YYINITIAL> {KEYWORD_INTERFACE}          { yybegin(YYINITIAL); return PactTypes.KEYWORD_INTERFACE; }
<YYINITIAL> {KEYWORD_INVARIANT}          { yybegin(YYINITIAL); return PactTypes.KEYWORD_INVARIANT; }
<YYINITIAL> {KEYWORD_LAMBDA}             { yybegin(YYINITIAL); return PactTypes.KEYWORD_LAMBDA; }
<YYINITIAL> {KEYWORD_LET}                { yybegin(YYINITIAL); return PactTypes.KEYWORD_LET; }
<YYINITIAL> {KEYWORD_MODULE}             { yybegin(YYINITIAL); return PactTypes.KEYWORD_MODULE; }
<YYINITIAL> {KEYWORD_BLOCK_INTRO}        { yybegin(YYINITIAL); return PactTypes.KEYWORD_BLOCK_INTRO; }
<YYINITIAL> {KEYWORD_PROPERTY}           { yybegin(YYINITIAL); return PactTypes.KEYWORD_PROPERTY; }
<YYINITIAL> {KEYWORD_STEP}               { yybegin(YYINITIAL); return PactTypes.KEYWORD_STEP; }
<YYINITIAL> {KEYWORD_STEP_WITH_ROLLBACK} { yybegin(YYINITIAL); return PactTypes.KEYWORD_STEP_WITH_ROLLBACK; }
<YYINITIAL> {KEYWORD_SUSPEND}            { yybegin(YYINITIAL); return PactTypes.KEYWORD_SUSPEND; }
<YYINITIAL> {KEYWORD_TRY}                { yybegin(YYINITIAL); return PactTypes.KEYWORD_TRY; }
<YYINITIAL> {KEYWORD_IMPORT}             { yybegin(YYINITIAL); return PactTypes.KEYWORD_IMPORT; }

/* Keywords (Capabilities) */
<YYINITIAL> {KEYWORD_CREATE_USER_GUARD} { yybegin(YYINITIAL); return PactTypes.KEYWORD_CREATE_USER_GUARD; }
<YYINITIAL> {KEYWORD_WITH_CAPABILITY}   { yybegin(YYINITIAL); return PactTypes.KEYWORD_WITH_CAPABILITY; }

/* Keywords (Definitions) */
<YYINITIAL> {KEYWORD_DEF_CAP}      { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEF_CAP; }
<YYINITIAL> {KEYWORD_DEF_CONST}    { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEF_CONST; }
<YYINITIAL> {KEYWORD_DEF_PACT}     { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEF_PACT; }
<YYINITIAL> {KEYWORD_DEF_PROPERTY} { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEF_PROPERTY; }
<YYINITIAL> {KEYWORD_DEF_SCHEMA}   { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEF_SCHEMA; }
<YYINITIAL> {KEYWORD_DEF_TABLE}    { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEF_TABLE; }
<YYINITIAL> {KEYWORD_DEFUN}        { yybegin(YYINITIAL); return PactTypes.KEYWORD_DEFUN; }

/* Keywords (REPL) */
<YYINITIAL> {KEYWORD_LOAD} { yybegin(YYINITIAL); return PactTypes.KEYWORD_LOAD; }

/* Annotations */
<YYINITIAL> {KEYWORD_DOC_ANNOTATION}     { yybegin(YYINITIAL); return PactTypes.KEYWORD_DOC_ANNOTATION; }
<YYINITIAL> {KEYWORD_EVENT_ANNOTATION}   { yybegin(YYINITIAL); return PactTypes.KEYWORD_EVENT_ANNOTATION; }
<YYINITIAL> {KEYWORD_MANAGED_ANNOTATION} { yybegin(YYINITIAL); return PactTypes.KEYWORD_MANAGED_ANNOTATION; }
<YYINITIAL> {KEYWORD_MODEL_ANNOTATION}   { yybegin(YYINITIAL); return PactTypes.KEYWORD_MODEL_ANNOTATION; }

/* Literals */
<YYINITIAL> {STR} { yybegin(YYINITIAL); return PactTypes.STR; }
<YYINITIAL> {INTEGER} { yybegin(YYINITIAL); return PactTypes.INTEGER; }
<YYINITIAL> {FLOATING_POINT} { yybegin(YYINITIAL); return PactTypes.FLOATING_POINT; }
<YYINITIAL> {TRUE}   { yybegin(YYINITIAL); return PactTypes.TRUE; }
<YYINITIAL> {FALSE}  { yybegin(YYINITIAL); return PactTypes.FALSE; }

/* Identifiers */
<YYINITIAL> {TICK}       { yybegin(YYINITIAL); return PactTypes.TICK; }
<YYINITIAL> {IDENTIFIER} { yybegin(YYINITIAL); return PactTypes.IDENTIFIER; }

/* Operators (Arithmetic) */
<YYINITIAL> {PLUS}     { yybegin(YYINITIAL); return PactTypes.PLUS; }
<YYINITIAL> {MINUS}    { yybegin(YYINITIAL); return PactTypes.MINUS; }
<YYINITIAL> {MULTIPLY} { yybegin(YYINITIAL); return PactTypes.MULTIPLY; }
<YYINITIAL> {DIVIDE}   { yybegin(YYINITIAL); return PactTypes.DIVIDE; }
<YYINITIAL> {POW}      { yybegin(YYINITIAL); return PactTypes.POW; }
<YYINITIAL> {ABS}      { yybegin(YYINITIAL); return PactTypes.ABS; }
<YYINITIAL> {CEILING}  { yybegin(YYINITIAL); return PactTypes.CEILING; }
<YYINITIAL> {FLOOR}    { yybegin(YYINITIAL); return PactTypes.FLOOR; }
<YYINITIAL> {LOG}      { yybegin(YYINITIAL); return PactTypes.LOG; }
<YYINITIAL> {LN}       { yybegin(YYINITIAL); return PactTypes.LN; }
<YYINITIAL> {DECIMAL}  { yybegin(YYINITIAL); return PactTypes.DECIMAL; }
<YYINITIAL> {EXP}      { yybegin(YYINITIAL); return PactTypes.EXP; }
<YYINITIAL> {MOD}      { yybegin(YYINITIAL); return PactTypes.MOD; }
<YYINITIAL> {ROUND}    { yybegin(YYINITIAL); return PactTypes.ROUND; }
<YYINITIAL> {SQRT}     { yybegin(YYINITIAL); return PactTypes.SQRT; }

/* Operators (Assignment) */
<YYINITIAL> {BIND_ASSIGN} { yybegin(YYINITIAL); return PactTypes.BIND_ASSIGN; }

/* Operators (Bitwise) */
<YYINITIAL> {BITWISE_AND}     { yybegin(YYINITIAL); return PactTypes.BITWISE_AND; }
<YYINITIAL> {BITWISE_OR}      { yybegin(YYINITIAL); return PactTypes.BITWISE_OR; }
<YYINITIAL> {BITWISE_REVERSE} { yybegin(YYINITIAL); return PactTypes.BITWISE_REVERSE; }
<YYINITIAL> {BITWISE_SHIFT}   { yybegin(YYINITIAL); return PactTypes.BITWISE_SHIFT; }
<YYINITIAL> {BITWISE_XOR}     { yybegin(YYINITIAL); return PactTypes.BITWISE_XOR; }

/* Operators (Logical) */
<YYINITIAL> {AND}               { yybegin(YYINITIAL); return PactTypes.AND; }
<YYINITIAL> {AND_SHORT_CIRCUIT} { yybegin(YYINITIAL); return PactTypes.AND_SHORT_CIRCUIT; }
<YYINITIAL> {NOT}               { yybegin(YYINITIAL); return PactTypes.NOT; }
<YYINITIAL> {NOT_SHORT_CIRCUIT} { yybegin(YYINITIAL); return PactTypes.NOT_SHORT_CIRCUIT; }
<YYINITIAL> {OR}                { yybegin(YYINITIAL); return PactTypes.OR; }
<YYINITIAL> {OR_SHORT_CIRCUIT}  { yybegin(YYINITIAL); return PactTypes.OR_SHORT_CIRCUIT; }

/* Operators (Relational) */
<YYINITIAL> {EQUAL}                 { yybegin(YYINITIAL); return PactTypes.EQUAL; }
<YYINITIAL> {NOT_EQUAL}             { yybegin(YYINITIAL); return PactTypes.NOT_EQUAL; }
<YYINITIAL> {LESS_THAN}             { yybegin(YYINITIAL); return PactTypes.LESS_THAN; }
<YYINITIAL> {LESS_THAN_OR_EQUAL}    { yybegin(YYINITIAL); return PactTypes.LESS_THAN_OR_EQUAL; }
<YYINITIAL> {GREATER_THAN}          { yybegin(YYINITIAL); return PactTypes.GREATER_THAN; }
<YYINITIAL> {GREATER_THAN_OR_EQUAL} { yybegin(YYINITIAL); return PactTypes.GREATER_THAN_OR_EQUAL; }

/* Delimiters */
<YYINITIAL> {PAREN_OPEN}    { yybegin(YYINITIAL); return PactTypes.PAREN_OPEN; }
<YYINITIAL> {PAREN_CLOSE}   { yybegin(YYINITIAL); return PactTypes.PAREN_CLOSE; }
<YYINITIAL> {BRACE_OPEN}    { yybegin(YYINITIAL); return PactTypes.BRACE_OPEN; }
<YYINITIAL> {BRACE_CLOSE}   { yybegin(YYINITIAL); return PactTypes.BRACE_CLOSE; }
<YYINITIAL> {BRACKET_OPEN}  { yybegin(YYINITIAL); return PactTypes.BRACKET_OPEN; }
<YYINITIAL> {BRACKET_CLOSE} { yybegin(YYINITIAL); return PactTypes.BRACKET_CLOSE; }
<YYINITIAL> {COLON}         { yybegin(YYINITIAL); return PactTypes.COLON; }
<YYINITIAL> {COMMA}         { yybegin(YYINITIAL); return PactTypes.COMMA; }
<YYINITIAL> {DOT}           { yybegin(YYINITIAL); return PactTypes.DOT; }
<YYINITIAL> {DYN_ACC}       { yybegin(YYINITIAL); return PactTypes.DYN_ACC; }

/* Reference */
<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
[^]                                                         { return TokenType.BAD_CHARACTER; }
