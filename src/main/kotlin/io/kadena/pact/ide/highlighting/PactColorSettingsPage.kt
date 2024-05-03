package io.kadena.pact.ide.highlighting

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import io.kadena.pact.PactIcons
import io.kadena.pact.language.PactLanguage
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon


internal class PactColorSettingsPage : ColorSettingsPage {
    @Nullable
    override fun getIcon(): Icon = PactIcons.FILE

    @NotNull
    override fun getHighlighter(): SyntaxHighlighter =
        SyntaxHighlighterFactory.getSyntaxHighlighter(PactLanguage, null, null)

    @NotNull
    override fun getDemoText(): String = PACT_EXAMPLE

    @Nullable
    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null

    override fun getAttributeDescriptors(): Array<out AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<out ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    @NotNull
    override fun getDisplayName(): String = PactLanguage.displayName

}

private val DESCRIPTORS = arrayOf(
    /* Comments */
    AttributesDescriptor("Comment", PactColors.COMMENT),

    /* Keywords */
    AttributesDescriptor("Keyword", PactColors.KEYWORD),

    /* Annotations */
    AttributesDescriptor("Annotation", PactColors.ANNOTATION),

    /* Literals */
    AttributesDescriptor("Literals//String", PactColors.STRING),
    AttributesDescriptor("Literals//Integer", PactColors.INTEGER),
    AttributesDescriptor("Literals//Floating point", PactColors.FLOATING_POINT),
    AttributesDescriptor("Literals//Boolean", PactColors.BOOLEAN),

    /* Identifiers */
    AttributesDescriptor("Identifier", PactColors.IDENTIFIER),

    /* Operators */
    AttributesDescriptor("Operator", PactColors.OPERATOR),

    /* Delimiters */
    AttributesDescriptor("Delimiters//Parentheses", PactColors.PARENTHESES),
    AttributesDescriptor("Delimiters//Braces", PactColors.BRACES),
    AttributesDescriptor("Delimiters//Brackets", PactColors.BRACKETS),
    AttributesDescriptor("Delimiters//Comma", PactColors.COMMA),
    AttributesDescriptor("Delimiters//Dot", PactColors.DOT),

    AttributesDescriptor("Bad character", PactColors.BAD_CHARACTER),
)
