package io.kadena.pact.ide.highlighting

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import io.kadena.pact.language.PactLexerAdapter
import io.kadena.pact.language.psi.PactTypes
import org.jetbrains.annotations.NotNull


class PactSyntaxHighlighter : SyntaxHighlighterBase() {
    @NotNull
    override fun getHighlightingLexer(): Lexer = PactLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = pack(attributes[tokenType])

    companion object {
        private val attributes = buildMap<IElementType, TextAttributesKey> {
            put(PactTypes.COMMENT, PactColors.COMMENT)
            put(PactTypes.STR, PactColors.STRING)
            put(PactTypes.NUM, PactColors.NUM)
            put(PactTypes.IDENTIFIER, PactColors.IDEN)
            put(TokenType.BAD_CHARACTER, PactColors.BAD_CHARACTER)
        }
    }
}
