package io.kadena.pact.intellij.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import io.kadena.pact.intellij.PactLanguage
import io.kadena.pact.intellij.language.parser.PactParser
import io.kadena.pact.intellij.language.psi.PactFile
import io.kadena.pact.intellij.language.psi.PactTypes
import org.jetbrains.annotations.NotNull

class PactParserDefinition : ParserDefinition {
    companion object {
        @JvmStatic
        val FILE = IFileElementType(PactLanguage.INSTANCE)
    }

    @NotNull
    override fun createLexer(project: Project): Lexer {
        return PactLexerAdapter()
    }

    @NotNull
    override fun getCommentTokens(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun createParser(project: Project): PsiParser {
        return PactParser()
    }

    @NotNull
    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    @NotNull
    override fun createFile(@NotNull viewProvider: FileViewProvider): PsiFile {
        return PactFile(viewProvider)
    }

    @NotNull
    override fun createElement(node: ASTNode): PsiElement {
        return PactTypes.Factory.createElement(node)
    }
}
