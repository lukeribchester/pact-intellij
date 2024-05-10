package io.kadena.pact.ide.runner

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.util.ui.FormBuilder
import org.jetbrains.annotations.NotNull
import javax.swing.JComponent
import javax.swing.JPanel


class PactSettingsEditor : SettingsEditor<PactRunConfiguration>() {
    private val panel: JPanel
    private val scriptPathField = TextFieldWithBrowseButton()

    init {
        scriptPathField.addBrowseFolderListener(
            "Select Script File", null, null,
            FileChooserDescriptorFactory.createSingleFileDescriptor()
        )

        panel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Script file", scriptPathField)
            .panel
    }

    override fun resetEditorFrom(pactRunConfiguration: PactRunConfiguration) {
        scriptPathField.text = pactRunConfiguration.scriptName
    }

    override fun applyEditorTo(@NotNull pactRunConfiguration: PactRunConfiguration) {
        pactRunConfiguration.scriptName = scriptPathField.text
    }

    @NotNull
    override fun createEditor(): JComponent {
        return panel
    }
}
