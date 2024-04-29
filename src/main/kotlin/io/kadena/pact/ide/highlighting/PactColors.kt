package io.kadena.pact.ide.highlighting

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object PactColors {
    val COMMENT = createTextAttributesKey("PACT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val STRING = createTextAttributesKey("PACT_STRING", DefaultLanguageHighlighterColors.STRING)
    val INTEGER = createTextAttributesKey("PACT_INTEGER", DefaultLanguageHighlighterColors.NUMBER)
    val FLOATING_POINT = createTextAttributesKey("PACT_FLOATING_POINT", DefaultLanguageHighlighterColors.NUMBER)
    val IDEN = createTextAttributesKey("PACT_IDEN", DefaultLanguageHighlighterColors.IDENTIFIER)
    val BAD_CHARACTER = createTextAttributesKey("PACT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
}
