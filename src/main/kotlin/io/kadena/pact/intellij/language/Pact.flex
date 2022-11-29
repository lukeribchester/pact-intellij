package io.kadena.pact.intellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import io.kadena.pact.intellij.language.psi.PactTypes;

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

%state WAITING_VALUE

%%

<YYINITIAL> "."                                { yybegin(YYINITIAL); return PactTypes.DOT; }
<YYINITIAL> ","                                { yybegin(YYINITIAL); return PactTypes.COMMA; }
<YYINITIAL> "("                                { yybegin(YYINITIAL); return PactTypes.LPAREN; }
<YYINITIAL> ")"                                { yybegin(YYINITIAL); return PactTypes.RPAREN; }
<YYINITIAL> "["                                { yybegin(YYINITIAL); return PactTypes.LSQUARE; }
<YYINITIAL> "]"                                { yybegin(YYINITIAL); return PactTypes.RSQUARE; }
<YYINITIAL> "{"                                { yybegin(YYINITIAL); return PactTypes.LCURL; }
<YYINITIAL> "}"                                { yybegin(YYINITIAL); return PactTypes.RCURL; }
<YYINITIAL> ":"                                { yybegin(YYINITIAL); return PactTypes.COLON; }
<YYINITIAL> ";"                                { yybegin(YYINITIAL); return PactTypes.SEMICOLON; }
<YYINITIAL> ";;"                               { yybegin(YYINITIAL); return PactTypes.DOUBLE_SEMICOLON; }
<YYINITIAL> "_"                                { yybegin(YYINITIAL); return PactTypes.UNDERSCORE; }
<YYINITIAL> "-"                                { yybegin(YYINITIAL); return PactTypes.SUB; }

<YYINITIAL> "module"                           { yybegin(YYINITIAL); return PactTypes.MODULE; }
<YYINITIAL> "interface"                        { yybegin(YYINITIAL); return PactTypes.INTERFACE; }
<YYINITIAL> "defun"                            { yybegin(YYINITIAL); return PactTypes.DEFUN; }
<YYINITIAL> "defconst"                         { yybegin(YYINITIAL); return PactTypes.DEFCONST; }
<YYINITIAL> "defcap"                           { yybegin(YYINITIAL); return PactTypes.DEFCAP; }
<YYINITIAL> "bless"                            { yybegin(YYINITIAL); return PactTypes.BLESS; }
<YYINITIAL> "defpact"                          { yybegin(YYINITIAL); return PactTypes.DEFPACT; }
<YYINITIAL> "defschema"                        { yybegin(YYINITIAL); return PactTypes.DEFSCHEMA; }
<YYINITIAL> "deftable"                         { yybegin(YYINITIAL); return PactTypes.DEFTABLE; }
<YYINITIAL> "use"                              { yybegin(YYINITIAL); return PactTypes.USE; }
<YYINITIAL> "implements"                       { yybegin(YYINITIAL); return PactTypes.IMPLEMENTS; }
<YYINITIAL> "step"                             { yybegin(YYINITIAL); return PactTypes.STEP; }
<YYINITIAL> "step-with-rollback"               { yybegin(YYINITIAL); return PactTypes.STEP; }
<YYINITIAL> "property"                         { yybegin(YYINITIAL); return PactTypes.PROPERTY; }
<YYINITIAL> "invariant"                        { yybegin(YYINITIAL); return PactTypes.INVARIANT; }
<YYINITIAL> "let"                              { yybegin(YYINITIAL); return PactTypes.LET_BIND; }
<YYINITIAL> "let*"                             { yybegin(YYINITIAL); return PactTypes.LET_STAR_BIND; }

<YYINITIAL> "true"|"false"                     { yybegin(YYINITIAL); return PactTypes.BOOL; }
<YYINITIAL> "keys"                             { yybegin(YYINITIAL); return PactTypes.KSET; }
<YYINITIAL> "pred"                             { yybegin(YYINITIAL); return PactTypes.KSET; }
<YYINITIAL> "keys-all"|"keys-1"|"keys-2"       { yybegin(YYINITIAL); return PactTypes.PRED; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+  { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                 { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                        { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                            { return TokenType.BAD_CHARACTER; }
