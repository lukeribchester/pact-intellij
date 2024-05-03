package io.kadena.pact.ide.highlighting

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object PactColors {
    /* Comments */
    val COMMENT = createTextAttributesKey("PACT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)

    /* Keywords */
    val KEYWORD = createTextAttributesKey("PACT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)

    /* Annotations */
    val ANNOTATION = createTextAttributesKey("PACT_ANNOTATION", DefaultLanguageHighlighterColors.DOC_COMMENT_TAG)

    /* Literals */
    val STRING = createTextAttributesKey("PACT_STRING", DefaultLanguageHighlighterColors.STRING)
    val INTEGER = createTextAttributesKey("PACT_INTEGER", DefaultLanguageHighlighterColors.NUMBER)
    val FLOATING_POINT = createTextAttributesKey("PACT_FLOATING_POINT", DefaultLanguageHighlighterColors.NUMBER)
    val BOOLEAN = createTextAttributesKey("PACT_BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD)

    /* Identifiers */
    val IDENTIFIER = createTextAttributesKey("PACT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)

    /* Operators */
    val OPERATOR = createTextAttributesKey("PACT_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)

    /* Delimiters */
    val PARENTHESES = createTextAttributesKey("PACT_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
    val BRACES = createTextAttributesKey("PACT_BRACES", DefaultLanguageHighlighterColors.BRACES)
    val BRACKETS = createTextAttributesKey("PACT_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
    val COMMA = createTextAttributesKey("PACT_COMMA", DefaultLanguageHighlighterColors.COMMA)
    val DOT = createTextAttributesKey("PACT_DOT", DefaultLanguageHighlighterColors.DOT)

    val BAD_CHARACTER = createTextAttributesKey("PACT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
}
