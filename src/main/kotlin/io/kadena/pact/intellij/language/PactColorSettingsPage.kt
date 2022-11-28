package io.kadena.pact.intellij.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import io.kadena.pact.intellij.PactIcons
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon

class PactColorSettingsPage : ColorSettingsPage {

    companion object {
        private val DESCRIPTORS: Array<AttributesDescriptor> = arrayOf(
            AttributesDescriptor("Keywords//Module name", PactSyntaxHighlighter.MODULE),
            AttributesDescriptor("Keywords//Function name", PactSyntaxHighlighter.DEFUN),
            AttributesDescriptor("Bad character", PactSyntaxHighlighter.BAD_CHARACTER),
        );
    }

    @Nullable
    override fun getIcon(): Icon {
        return PactIcons.FILE;
    }

    @NotNull
    override fun getHighlighter(): SyntaxHighlighter {
        return PactSyntaxHighlighter();
    }

    @NotNull
    override fun getDemoText(): String {
        return "(module helloWorld 'admin-keyset\n" +
               "  (defun hello (name)\n" +
               "    (format \"Hello {}!\" [name]))\n" +
               ")\n" +
               "(hello \"world\")";
    }

    @Nullable
    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? {
        return null;
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS;
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    override fun getDisplayName(): String {
        return "Pact";
    }
}
