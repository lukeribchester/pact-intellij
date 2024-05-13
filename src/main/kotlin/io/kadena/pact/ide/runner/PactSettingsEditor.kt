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

    private val compilerPathField = TextFieldWithBrowseButton()
    private val modulePathField = TextFieldWithBrowseButton()

    init {
        compilerPathField.addBrowseFolderListener(
            "Select a Pact Compiler", null, null,
            FileChooserDescriptorFactory.createSingleFileDescriptor()
        )

        modulePathField.addBrowseFolderListener(
            "Select a Pact Module", null, null,
            FileChooserDescriptorFactory.createSingleFileDescriptor()
        )

        panel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Pact compiler:", compilerPathField)
            .addLabeledComponent("Pact module:", modulePathField)
            .panel
    }

    override fun resetEditorFrom(pactRunConfiguration: PactRunConfiguration) {
        compilerPathField.text = pactRunConfiguration.compilerPath
        modulePathField.text = pactRunConfiguration.modulePath
    }

    override fun applyEditorTo(@NotNull pactRunConfiguration: PactRunConfiguration) {
        pactRunConfiguration.compilerPath = compilerPathField.text
        pactRunConfiguration.modulePath = modulePathField.text
    }

    @NotNull
    override fun createEditor(): JComponent {
        return panel
    }
}
