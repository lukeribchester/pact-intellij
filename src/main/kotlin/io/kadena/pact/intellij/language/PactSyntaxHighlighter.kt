package io.kadena.pact.intellij.language

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import io.kadena.pact.intellij.language.psi.PactTypes
import org.jetbrains.annotations.NotNull

class PactSyntaxHighlighter : SyntaxHighlighterBase() {

    companion object {
        @JvmStatic
        public val MODULE: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_MODULE", DefaultLanguageHighlighterColors.KEYWORD
        );

        @JvmStatic
        public val DEFUN: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFUN", DefaultLanguageHighlighterColors.KEYWORD
        );

        @JvmStatic
        public val BAD_CHARACTER: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER
        );

        @JvmStatic
        private val MODULE_KEYS: Array<TextAttributesKey> = arrayOf(MODULE);

        @JvmStatic
        private val DEFUN_KEYS: Array<TextAttributesKey> = arrayOf(DEFUN);

        @JvmStatic
        private val BAD_CHARACTER_KEYS: Array<TextAttributesKey> = arrayOf(BAD_CHARACTER);

        @JvmStatic
        private val EMPTY_KEYS: Array<TextAttributesKey> = arrayOf();
    }

    @NotNull
    override fun getHighlightingLexer(): Lexer {
        return PactLexerAdapter();
    }

    @NotNull
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType == PactTypes.MODULE) return MODULE_KEYS;
        if (tokenType == PactTypes.DEFUN) return DEFUN_KEYS;
        if (tokenType == TokenType.BAD_CHARACTER) return BAD_CHARACTER_KEYS;
        return EMPTY_KEYS;
    }
}
