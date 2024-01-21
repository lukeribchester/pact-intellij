package io.kadena.pact.ide.settings

import com.intellij.ui.components.JBCheckBox
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import org.jetbrains.annotations.NotNull
import javax.swing.JComponent
import javax.swing.JPanel


/**
 * Supports creating and managing a [JPanel] for the Settings Dialog.
 */
class AppSettingsComponent {
    val panel: JPanel

    private val _pactPath = JBTextField()
    private val _useBundledLanguageServer = JBCheckBox("Use the bundled language server executable?")
    private val _pactLanguageServerPath = JBTextField()

    init {
        panel = FormBuilder.createFormBuilder()
            .addLabeledComponent(JBLabel("Pact path: "), _pactPath, 1, false)
            .addComponent(_useBundledLanguageServer, 1)
            .addLabeledComponent(JBLabel("Pact Language Server (LSP) path: "), _pactLanguageServerPath, 1, false)
            .addComponentFillVertically(JPanel(), 0)
            .getPanel()
    }

    val preferredFocusedComponent: JComponent
        get() = _pactPath

    @get:NotNull
    var pactPath: String?
        get() = _pactPath.text
        set(newText) {
            _pactPath.text = newText
        }

    var useBundledLanguageServer: Boolean
        get() = _useBundledLanguageServer.isSelected
        set(newStatus) {
            _useBundledLanguageServer.isSelected = newStatus
        }

    @get:NotNull
    var pactLanguageServerPath: String?
        get() = _pactLanguageServerPath.text
        set(newText) {
            _pactLanguageServerPath.text = newText
        }
}
