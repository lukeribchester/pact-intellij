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
            /* Separators */
            AttributesDescriptor("Separators//Parentheses", PactSyntaxHighlighter.PARENTHESIS),
            AttributesDescriptor("Separators//Brackets", PactSyntaxHighlighter.BRACKET),
            AttributesDescriptor("Separators//Braces", PactSyntaxHighlighter.BRACE),
            AttributesDescriptor("Separators//Dot", PactSyntaxHighlighter.DOT),
            AttributesDescriptor("Separators//Comma", PactSyntaxHighlighter.COMMA),
            AttributesDescriptor("Separators//Colon", PactSyntaxHighlighter.COLON),

            /* Operators */

            /* Keywords */
            AttributesDescriptor("Keywords//module", PactSyntaxHighlighter.MODULE),
            AttributesDescriptor("Keywords//interface", PactSyntaxHighlighter.INTERFACE),
            AttributesDescriptor("Keywords//defun", PactSyntaxHighlighter.DEFUN),
            AttributesDescriptor("Keywords//defconst", PactSyntaxHighlighter.DEFCONST),
            AttributesDescriptor("Keywords//defcap", PactSyntaxHighlighter.DEFCAP),
            AttributesDescriptor("Keywords//defpact", PactSyntaxHighlighter.DEFPACT),
            AttributesDescriptor("Keywords//defschema", PactSyntaxHighlighter.DEFSCHEMA),
            AttributesDescriptor("Keywords//deftable", PactSyntaxHighlighter.DEFTABLE),
            AttributesDescriptor("Keywords//bless", PactSyntaxHighlighter.BLESS),
            AttributesDescriptor("Keywords//use", PactSyntaxHighlighter.USE),
            AttributesDescriptor("Keywords//implements", PactSyntaxHighlighter.IMPLEMENTS),
            AttributesDescriptor("Keywords//step/step-with-rollback", PactSyntaxHighlighter.STEP),
            AttributesDescriptor("Keywords//property", PactSyntaxHighlighter.PROPERTY),
            AttributesDescriptor("Keywords//invariant", PactSyntaxHighlighter.INVARIANT),
            AttributesDescriptor("Keywords//let", PactSyntaxHighlighter.LET_BIND),
            AttributesDescriptor("Keywords//let*", PactSyntaxHighlighter.LET_STAR_BIND),
            AttributesDescriptor("Bad character", PactSyntaxHighlighter.BAD_CHARACTER),
        )
    }

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
        return ";;\n" +
                ";; \"Hello, world!\" smart contract/module\n" +
                ";;\n\n" +
                "(namespace \"free\")\n\n" +
                ";; Define the module.\n" +
                "(module hello-world MODULE_ADMIN\n" +
                "  \"A smart contract to greet the world.\"\n" +
                "  (defcap MODULE_ADMIN () true)\n\n" +
                "  (defschema message-schema\n" +
                "    @doc \"Message schema\"\n" +
                "    @model [(invariant (!= msg \"\"))]\n\n" +
                "    msg:string)\n\n" +
                "  (deftable\n" +
                "    message:{message-schema})\n\n" +
                "  (defun set-message\n" +
                "    (\n" +
                "      m:string\n" +
                "    )\n" +
                "    \"Set the message that will be used next\"\n" +
                "    (enforce (!= m \"\") \"set-message: must not be empty\")\n" +
                "    (write message \"0\" {\"msg\": m})\n" +
                "  )\n\n" +
                "  (defun greet ()\n" +
                "    \"Do the hello-world dance\"\n" +
                "    (with-default-read message \"0\" { \"msg\": \"\" } { \"msg\":= msg }\n" +
                "      (format \"Hello {}!\" [msg])))\n" +
                ")\n\n" +
                "(create-table message)\n\n" +
                "(set-message \"world\")\n" +
                "(greet)\n"
    }

    @Nullable
    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    @NotNull
    override fun getDisplayName(): String {
        return "Pact"
    }
}
