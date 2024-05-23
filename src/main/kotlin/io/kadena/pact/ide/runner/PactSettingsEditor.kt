package io.kadena.pact.ide.runner

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.ComboBox
import com.intellij.ui.dsl.builder.Align
import com.intellij.ui.dsl.builder.RowLayout
import io.kadena.pact.ide.settings.createComboBox
import org.jetbrains.annotations.NotNull
import javax.swing.JComponent
import javax.swing.JPanel
import com.intellij.ui.dsl.builder.panel as dslPanel


class PactSettingsEditor : SettingsEditor<PactRunConfiguration>() {
    private val panel: JPanel

    private val compilerPathField: ComboBox<String> = createComboBox(
        "Select a Pact Compiler", "Choose an executable file"
    )

    private val modulePathField: ComboBox<String> = createComboBox(
        "Select a Pact Module", "Choose an executable file"
    )

    init {
        panel = dslPanel {
            // Compiler path
            row("Pact compiler:") {
                cell(compilerPathField)
                    .align(Align.FILL)
                    .resizableColumn()
            }.layout(RowLayout.LABEL_ALIGNED)

            // Module path
            row("Pact module:") {
                cell(modulePathField)
                    .align(Align.FILL)
                    .resizableColumn()
            }.layout(RowLayout.LABEL_ALIGNED)
        }
    }

    override fun resetEditorFrom(pactRunConfiguration: PactRunConfiguration) {
        compilerPathField.selectedItem = pactRunConfiguration.compilerPath
        modulePathField.selectedItem = pactRunConfiguration.modulePath
    }

    override fun applyEditorTo(@NotNull pactRunConfiguration: PactRunConfiguration) {
        pactRunConfiguration.compilerPath = compilerPathField.selectedItem?.toString() ?: ""
        pactRunConfiguration.modulePath = modulePathField.selectedItem?.toString() ?: ""
    }

    @NotNull
    override fun createEditor(): JComponent {
        return panel
    }
}
