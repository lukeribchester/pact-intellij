package io.kadena.pact.language

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
import io.kadena.pact.language.parser.PactParser
import io.kadena.pact.language.psi.PactFile
import io.kadena.pact.language.psi.PactTokenSets
import io.kadena.pact.language.psi.PactTypes
import org.jetbrains.annotations.NotNull


internal class PactParserDefinition : ParserDefinition {
    @NotNull
    override fun createLexer(project: Project?): Lexer {
        return PactLexerAdapter()
    }

    @NotNull
    override fun getCommentTokens(): TokenSet {
        return PactTokenSets.COMMENTS
    }

    @NotNull
    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun createParser(project: Project?): PsiParser {
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
    override fun createElement(node: ASTNode?): PsiElement {
        return PactTypes.Factory.createElement(node)
    }

    companion object {
        val FILE: IFileElementType = IFileElementType(PactLanguage.INSTANCE)
    }
}
