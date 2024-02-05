package io.kadena.pact.ide.highlighting

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import io.kadena.pact.language.PactLexerAdapter
import io.kadena.pact.language.psi.PactTypes
import org.jetbrains.annotations.NotNull


class PactSyntaxHighlighter : SyntaxHighlighterBase() {
    @NotNull
    override fun getHighlightingLexer(): Lexer {
        return PactLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey?> {
        if (tokenType == PactTypes.COMMENT) {
            return COMMENT_KEYS
        }
        if (tokenType == PactTypes.STR) {
            return STRING_KEYS
        }
        if (tokenType == PactTypes.NUM) {
            return NUM_KEYS
        }
        if (tokenType == PactTypes.IDENT) {
            return IDEN_KEYS
        }
        if (tokenType == TokenType.BAD_CHARACTER) {
            return BAD_CHAR_KEYS
        }
        return EMPTY_KEYS
    }

    companion object {
        val COMMENT: TextAttributesKey = createTextAttributesKey(
            "PACT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val STRING: TextAttributesKey = createTextAttributesKey(
            "PACT_STRING", DefaultLanguageHighlighterColors.STRING
        )
        val NUM: TextAttributesKey = createTextAttributesKey(
            "PACT_NUM", DefaultLanguageHighlighterColors.NUMBER
        )
        val IDEN: TextAttributesKey = createTextAttributesKey(
            "PACT_IDEN", DefaultLanguageHighlighterColors.IDENTIFIER
        )
        val BAD_CHARACTER: TextAttributesKey = createTextAttributesKey(
            "PACT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER
        )

        private val BAD_CHAR_KEYS = arrayOf<TextAttributesKey?>(BAD_CHARACTER)
        private val COMMENT_KEYS = arrayOf<TextAttributesKey?>(COMMENT)
        private val STRING_KEYS = arrayOf<TextAttributesKey?>(STRING)
        private val NUM_KEYS = arrayOf<TextAttributesKey?>(NUM)
        private val IDEN_KEYS = arrayOf<TextAttributesKey?>(IDEN)
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
    }
}
