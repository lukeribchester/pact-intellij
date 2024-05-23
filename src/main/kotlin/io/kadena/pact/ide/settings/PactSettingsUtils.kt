package io.kadena.pact.ide.settings

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.components.fields.ExtendableTextComponent
import com.intellij.ui.components.fields.ExtendableTextField
import java.awt.Dimension
import javax.swing.JTextField
import javax.swing.plaf.basic.BasicComboBoxEditor


fun createComboBox(title: String, description: String): ComboBox<String> {
    val comboBox: ComboBox<String> = ComboBox<String>()

    val browseExtension = ExtendableTextComponent.Extension.create(
        AllIcons.General.OpenDisk, AllIcons.General.OpenDiskHover, "Browse files"
    ) {
        // Configure the file browser window
        val fileChooserDescriptor = FileChooserDescriptor(
            true,
            false,
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
            // Add the path to the ComboBox and select it
            val path = it.path
            comboBox.addItem(path)
            comboBox.selectedItem = path
        }
    }

    comboBox.apply {
        isEnabled = true
        isEditable = true
        preferredSize = Dimension(300, preferredSize.height)
        editor = object : BasicComboBoxEditor() {

            override fun createEditorComponent(): JTextField {
                val editor = ExtendableTextField().apply {
                    addExtension(browseExtension)
                    border = null
                }

                return editor
            }
        }
    }

    return comboBox
}
