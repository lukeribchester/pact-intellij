package io.kadena.pact.ide.settings

import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBPanel
import com.intellij.ui.util.maximumWidth
import com.intellij.ui.util.minimumWidth
import com.intellij.ui.util.preferredWidth
import com.intellij.util.ui.FormBuilder
import org.jetbrains.annotations.NotNull
import java.awt.Dimension
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JPanel


/**
 * Supports creating and managing a [JPanel] for the Settings Dialog.
 */
class AppSettingsComponent {
    val panel: JPanel

    private val pactPathLabel = JBLabel("Pact:")
    private val pactPathField = ComboBox<String>()
    private val pactPathBrowseButton = JButton("...")

    private val pactLanguageServerPathLabel = JBLabel("Language Server (LSP):")
    private val pactLanguageServerPathField = ComboBox<String>()
    private val pactLanguageServerPathBrowseButton = JButton("...")

    init {
        panel = FormBuilder.createFormBuilder()
            .addComponent(pactPathPanel())
            .addComponent(pactLanguageServerPathPanel())
            .addComponentFillVertically(JPanel(), 0)
            .panel
    }

    val preferredFocusedComponent: JComponent
        get() = pactPathField

    @get:NotNull
    var pactPath: String?
        get() = pactPathField.selectedItem?.toString()
        set(newPath) {
            pactPathField.selectedItem = newPath
        }

    @get:NotNull
    var pactLanguageServerPath: String?
        get() = pactLanguageServerPathField.selectedItem?.toString()
        set(newPath) {
            pactLanguageServerPathField.selectedItem = newPath
        }

    private fun pactPathPanel(): JBPanel<JBPanel<*>> {
        pactPathField.apply {
            addItem("/path/to/pact")
            isEditable = true
            preferredWidth = 300
        }
        pactPathBrowseButton.addActionListener {
            onBrowseForPactPath(
                "Select a Pact Compiler",
                "Choose an executable file",
                pactPathField
            )
        }
        pactPathBrowseButton.apply {
            preferredWidth = 30
            minimumWidth = 30
            maximumWidth = 30
        }

        return JBPanel<JBPanel<*>>().apply {
            // Align the components horizontally
            layout = BoxLayout(this, BoxLayout.X_AXIS)

            val gap = Box.createRigidArea(Dimension(10, 0))

            add(pactPathLabel)
            add(gap)
            add(pactPathField)
            add(pactPathBrowseButton)
        }
    }

    private fun pactLanguageServerPathPanel(): JBPanel<JBPanel<*>> {
        pactLanguageServerPathField.apply {
            addItem("/path/to/pact-lsp")
            isEditable = true
            preferredWidth = 300
        }
        pactLanguageServerPathBrowseButton.addActionListener {
            onBrowseForPactPath(
                "Select a Pact Language Server (LSP)",
                "Choose an executable file",
                pactLanguageServerPathField
            )
        }
        pactLanguageServerPathBrowseButton.apply {
            preferredWidth = 30
            minimumWidth = 30
            maximumWidth = 30
        }

        return JBPanel<JBPanel<*>>().apply {
            // Align the components horizontally
            layout = BoxLayout(this, BoxLayout.X_AXIS)

            val gap = Box.createRigidArea(Dimension(10, 0))

            add(pactLanguageServerPathLabel)
            add(gap)
            add(pactLanguageServerPathField)
            add(pactLanguageServerPathBrowseButton)
        }
    }

    private fun onBrowseForPactPath(title: String, description: String, field: ComboBox<String>) {
        // Configure the file browser window
        val fileChooserDescriptor = FileChooserDescriptor(
            true,
            true,
            false,
            false,
            false,
            false
        )
            .withTitle(title)
            .withDescription(description)

        // Open the file browser window
        val file: VirtualFile? = FileChooser.chooseFile(fileChooserDescriptor, null, null)
        file?.let {
            val path = it.path

            // Add the path to the ComboBox and select it
            field.addItem(path)
            field.selectedItem = path
        }
    }
}
