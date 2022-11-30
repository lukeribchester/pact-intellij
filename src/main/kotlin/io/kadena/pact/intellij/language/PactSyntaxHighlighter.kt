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
        val MODULE: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_MODULE", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val INTERFACE: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_INTERFACE", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val DEFUN: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFUN", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val DEFCONST: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFCONST", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val DEFCAP: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFCAP", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val BLESS: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_BLESS", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val DEFPACT: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFPACT", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val DEFSCHEMA: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFSCHEMA", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val DEFTABLE: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_DEFTABLE", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val USE: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_USE", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val IMPLEMENTS: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_IMPLEMENTS", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val STEP: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_STEP", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val PROPERTY: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_PROPERTY", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val INVARIANT: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_INVARIANT", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val LET_BIND: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_LET_BIND", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val LET_STAR_BIND: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_LET_STAR_BIND", DefaultLanguageHighlighterColors.KEYWORD
        )

        @JvmStatic
        val BAD_CHARACTER: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "PACT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER
        )

        @JvmStatic
        private val MODULE_KEYS: Array<TextAttributesKey> = arrayOf(MODULE)

        @JvmStatic
        private val INTERFACE_KEYS: Array<TextAttributesKey> = arrayOf(INTERFACE)

        @JvmStatic
        private val DEFUN_KEYS: Array<TextAttributesKey> = arrayOf(DEFUN)

        @JvmStatic
        private val DEFCONST_KEYS: Array<TextAttributesKey> = arrayOf(DEFCONST)

        @JvmStatic
        private val DEFCAP_KEYS: Array<TextAttributesKey> = arrayOf(DEFCAP)

        @JvmStatic
        private val BLESS_KEYS: Array<TextAttributesKey> = arrayOf(BLESS)

        @JvmStatic
        private val DEFPACT_KEYS: Array<TextAttributesKey> = arrayOf(DEFPACT)

        @JvmStatic
        private val DEFSCHEMA_KEYS: Array<TextAttributesKey> = arrayOf(DEFSCHEMA)

        @JvmStatic
        private val DEFTABLE_KEYS: Array<TextAttributesKey> = arrayOf(DEFTABLE)

        @JvmStatic
        private val USE_KEYS: Array<TextAttributesKey> = arrayOf(USE)

        @JvmStatic
        private val IMPLEMENTS_KEYS: Array<TextAttributesKey> = arrayOf(IMPLEMENTS)

        @JvmStatic
        private val STEP_KEYS: Array<TextAttributesKey> = arrayOf(STEP)

        @JvmStatic
        private val PROPERTY_KEYS: Array<TextAttributesKey> = arrayOf(PROPERTY)

        @JvmStatic
        private val INVARIANT_KEYS: Array<TextAttributesKey> = arrayOf(INVARIANT)

        @JvmStatic
        private val LET_BIND_KEYS: Array<TextAttributesKey> = arrayOf(LET_BIND)

        @JvmStatic
        private val LET_STAR_BIND_KEYS: Array<TextAttributesKey> = arrayOf(LET_STAR_BIND)

        @JvmStatic
        private val BAD_CHARACTER_KEYS: Array<TextAttributesKey> = arrayOf(BAD_CHARACTER)

        @JvmStatic
        private val EMPTY_KEYS: Array<TextAttributesKey> = arrayOf()
    }

    @NotNull
    override fun getHighlightingLexer(): Lexer {
        return PactLexerAdapter()
    }

    @NotNull
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType == PactTypes.MODULE) return MODULE_KEYS
        if (tokenType == PactTypes.INTERFACE) return INTERFACE_KEYS
        if (tokenType == PactTypes.DEFUN) return DEFUN_KEYS
        if (tokenType == PactTypes.DEFCONST) return DEFCONST_KEYS
        if (tokenType == PactTypes.DEFCAP) return DEFCAP_KEYS
        if (tokenType == PactTypes.BLESS) return BLESS_KEYS
        if (tokenType == PactTypes.DEFPACT) return DEFPACT_KEYS
        if (tokenType == PactTypes.DEFSCHEMA) return DEFSCHEMA_KEYS
        if (tokenType == PactTypes.DEFTABLE) return DEFTABLE_KEYS
        if (tokenType == PactTypes.USE) return USE_KEYS
        if (tokenType == PactTypes.IMPLEMENTS) return IMPLEMENTS_KEYS
        if (tokenType == PactTypes.STEP) return STEP_KEYS
        if (tokenType == PactTypes.PROPERTY) return PROPERTY_KEYS
        if (tokenType == PactTypes.INVARIANT) return INVARIANT_KEYS
        if (tokenType == PactTypes.LET_BIND) return LET_BIND_KEYS
        if (tokenType == PactTypes.LET_STAR_BIND) return LET_STAR_BIND_KEYS
        if (tokenType == TokenType.BAD_CHARACTER) return BAD_CHARACTER_KEYS
        return EMPTY_KEYS
    }
}
