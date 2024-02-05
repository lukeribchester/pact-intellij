package io.kadena.pact.ide.highlighting

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import io.kadena.pact.PactIcons
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon


internal class PactColorSettingsPage : ColorSettingsPage {
    @Nullable
    override fun getIcon(): Icon {
        return PactIcons.FILE
    }

    @NotNull
    override fun getHighlighter(): SyntaxHighlighter {
        return PactSyntaxHighlighter()
    }

    @NotNull
    override fun getDemoText(): String {
        return PACT_EXAMPLE
    }

    @Nullable
    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<out AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<out ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    @NotNull
    override fun getDisplayName(): String {
        return "Pact"
    }

    companion object {
        private val DESCRIPTORS = arrayOf<AttributesDescriptor>(
            AttributesDescriptor("Comment", PactSyntaxHighlighter.COMMENT),
            AttributesDescriptor("String", PactSyntaxHighlighter.STRING),
            AttributesDescriptor("Number", PactSyntaxHighlighter.NUM),
            AttributesDescriptor("Identifier", PactSyntaxHighlighter.IDEN),
            AttributesDescriptor("Bad value", PactSyntaxHighlighter.BAD_CHARACTER),
        )
    }
}
