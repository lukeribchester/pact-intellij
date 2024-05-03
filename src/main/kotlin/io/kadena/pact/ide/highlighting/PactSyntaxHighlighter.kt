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
            /* Comments */
            put(PactTypes.COMMENT, PactColors.COMMENT)

            /* Keywords */
            put(PactTypes.KEYWORD_BLESS, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_ENFORCE, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_ENFORCE_ONE, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_ERROR, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_IF, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_IMPLEMENTS, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_INTERFACE, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_INVARIANT, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_LAMBDA, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_LET, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_MODULE, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_BLOCK_INTRO, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_PROPERTY, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_STEP, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_STEP_WITH_ROLLBACK, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_SUSPEND, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_TRY, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_IMPORT, PactColors.KEYWORD)

            /* Keywords (Capabilities) */
            put(PactTypes.KEYWORD_CREATE_USER_GUARD, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_WITH_CAPABILITY, PactColors.KEYWORD)

            /* Keywords (Definitions) */
            put(PactTypes.KEYWORD_DEF_CAP, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_DEF_CONST, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_DEF_PACT, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_DEF_PROPERTY, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_DEF_SCHEMA, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_DEF_TABLE, PactColors.KEYWORD)
            put(PactTypes.KEYWORD_DEFUN, PactColors.KEYWORD)

            /* Keywords (REPL) */
            put(PactTypes.KEYWORD_LOAD, PactColors.KEYWORD)

            /* Annotations */
            put(PactTypes.KEYWORD_DOC_ANNOTATION, PactColors.ANNOTATION)
            put(PactTypes.KEYWORD_EVENT_ANNOTATION, PactColors.ANNOTATION)
            put(PactTypes.KEYWORD_MANAGED_ANNOTATION, PactColors.ANNOTATION)
            put(PactTypes.KEYWORD_MODEL_ANNOTATION, PactColors.ANNOTATION)

            /* Literals */
            put(PactTypes.STR, PactColors.STRING)
            put(PactTypes.INTEGER, PactColors.INTEGER)
            put(PactTypes.FLOATING_POINT, PactColors.FLOATING_POINT)
            put(PactTypes.BOOLEAN, PactColors.BOOLEAN)

            /* Identifiers */
            put(PactTypes.TICK, PactColors.IDENTIFIER)
            put(PactTypes.IDENTIFIER, PactColors.IDENTIFIER)

            /* Operators (Arithmetic) */
            put(PactTypes.PLUS, PactColors.OPERATOR)
            put(PactTypes.MINUS, PactColors.OPERATOR)
            put(PactTypes.MULTIPLY, PactColors.OPERATOR)
            put(PactTypes.DIVIDE, PactColors.OPERATOR)
            put(PactTypes.POW, PactColors.OPERATOR)
            put(PactTypes.ABS, PactColors.OPERATOR)
            put(PactTypes.CEILING, PactColors.OPERATOR)
            put(PactTypes.FLOOR, PactColors.OPERATOR)
            put(PactTypes.LOG, PactColors.OPERATOR)
            put(PactTypes.LN, PactColors.OPERATOR)
            put(PactTypes.DECIMAL, PactColors.OPERATOR)
            put(PactTypes.EXP, PactColors.OPERATOR)
            put(PactTypes.MOD, PactColors.OPERATOR)
            put(PactTypes.ROUND, PactColors.OPERATOR)
            put(PactTypes.SQRT, PactColors.OPERATOR)

            /* Operators (Assignment) */
            put(PactTypes.BIND_ASSIGN, PactColors.OPERATOR)

            /* Operators (Bitwise) */
            put(PactTypes.BITWISE_AND, PactColors.OPERATOR)
            put(PactTypes.BITWISE_OR, PactColors.OPERATOR)
            put(PactTypes.BITWISE_REVERSE, PactColors.OPERATOR)
            put(PactTypes.BITWISE_SHIFT, PactColors.OPERATOR)
            put(PactTypes.BITWISE_XOR, PactColors.OPERATOR)

            /* Operators (Logical) */
            put(PactTypes.AND, PactColors.OPERATOR)
            put(PactTypes.AND_SHORT_CIRCUIT, PactColors.OPERATOR)
            put(PactTypes.NOT, PactColors.OPERATOR)
            put(PactTypes.NOT_SHORT_CIRCUIT, PactColors.OPERATOR)
            put(PactTypes.OR, PactColors.OPERATOR)
            put(PactTypes.OR_SHORT_CIRCUIT, PactColors.OPERATOR)

            /* Operators (Relational) */
            put(PactTypes.EQUAL, PactColors.OPERATOR)
            put(PactTypes.NOT_EQUAL, PactColors.OPERATOR)
            put(PactTypes.LESS_THAN, PactColors.OPERATOR)
            put(PactTypes.LESS_THAN_OR_EQUAL, PactColors.OPERATOR)
            put(PactTypes.GREATER_THAN, PactColors.OPERATOR)
            put(PactTypes.GREATER_THAN_OR_EQUAL, PactColors.OPERATOR)

            /* Delimiters */
            put(PactTypes.PAREN_OPEN, PactColors.OPERATOR)
            put(PactTypes.PAREN_CLOSE, PactColors.OPERATOR)
            put(PactTypes.BRACE_OPEN, PactColors.OPERATOR)
            put(PactTypes.BRACE_CLOSE, PactColors.OPERATOR)
            put(PactTypes.BRACKET_OPEN, PactColors.OPERATOR)
            put(PactTypes.BRACKET_CLOSE, PactColors.OPERATOR)
            put(PactTypes.COLON, PactColors.OPERATOR)
            put(PactTypes.COMMA, PactColors.OPERATOR)
            put(PactTypes.DOT, PactColors.OPERATOR)
            put(PactTypes.DYN_ACC, PactColors.OPERATOR)

            put(TokenType.BAD_CHARACTER, PactColors.BAD_CHARACTER)
        }
    }
}
