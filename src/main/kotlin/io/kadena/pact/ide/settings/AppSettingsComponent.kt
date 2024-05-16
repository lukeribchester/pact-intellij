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

    private val compilerPathLabel = JBLabel("Pact:")
    private val compilerPathField = ComboBox<String>()
    private val compilerPathBrowseButton = JButton("...")

    private val languageServerPathLabel = JBLabel("Language Server (LSP):")
    private val languageServerPathField = ComboBox<String>()
    private val languageServerPathBrowseButton = JButton("...")

    init {
        panel = FormBuilder.createFormBuilder()
            .addComponent(compilerPathPanel())
            .addComponent(languageServerPathPanel())
            .addComponentFillVertically(JPanel(), 0)
            .panel
    }

    val preferredFocusedComponent: JComponent
        get() = compilerPathField

    @get:NotNull
    var compilerPath: String?
        get() = compilerPathField.selectedItem?.toString()
        set(newPath) {
            compilerPathField.selectedItem = newPath
        }

    @get:NotNull
    var languageServerPath: String?
        get() = languageServerPathField.selectedItem?.toString()
        set(newPath) {
            languageServerPathField.selectedItem = newPath
        }

    private fun compilerPathPanel(): JBPanel<JBPanel<*>> {
        compilerPathField.apply {
            addItem("/path/to/pact")
            isEditable = true
            preferredWidth = 300
        }
        compilerPathBrowseButton.addActionListener {
            onBrowseForPath(
                "Select a Pact Compiler",
                "Choose an executable file",
                compilerPathField
            )
        }
        compilerPathBrowseButton.apply {
            preferredWidth = 30
            minimumWidth = 30
            maximumWidth = 30
        }

        return JBPanel<JBPanel<*>>().apply {
            // Align the components horizontally
            layout = BoxLayout(this, BoxLayout.X_AXIS)

            val gap = Box.createRigidArea(Dimension(10, 0))

            add(compilerPathLabel)
            add(gap)
            add(compilerPathField)
            add(compilerPathBrowseButton)
        }
    }

    private fun languageServerPathPanel(): JBPanel<JBPanel<*>> {
        languageServerPathField.apply {
            addItem("/path/to/pact-lsp")
            isEditable = true
            preferredWidth = 300
        }
        languageServerPathBrowseButton.addActionListener {
            onBrowseForPath(
                "Select a Pact Language Server (LSP)",
                "Choose an executable file",
                languageServerPathField
            )
        }
        languageServerPathBrowseButton.apply {
            preferredWidth = 30
            minimumWidth = 30
            maximumWidth = 30
        }

        return JBPanel<JBPanel<*>>().apply {
            // Align the components horizontally
            layout = BoxLayout(this, BoxLayout.X_AXIS)

            val gap = Box.createRigidArea(Dimension(10, 0))

            add(languageServerPathLabel)
            add(gap)
            add(languageServerPathField)
            add(languageServerPathBrowseButton)
        }
    }

    private fun onBrowseForPath(title: String, description: String, field: ComboBox<String>) {
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
