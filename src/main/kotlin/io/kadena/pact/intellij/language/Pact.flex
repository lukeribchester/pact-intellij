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

<YYINITIAL> "module"                           { yybegin(YYINITIAL); return PactTypes.MODULE; }
<YYINITIAL> "defun"                            { yybegin(YYINITIAL); return PactTypes.DEFUN; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+  { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                 { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                        { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                            { return TokenType.BAD_CHARACTER; }
