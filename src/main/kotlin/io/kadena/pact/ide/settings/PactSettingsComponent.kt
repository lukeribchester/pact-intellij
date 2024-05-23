package io.kadena.pact.ide.settings

import com.intellij.openapi.ui.ComboBox
import com.intellij.ui.dsl.builder.Align
import com.intellij.ui.dsl.builder.RowLayout
import com.intellij.ui.dsl.builder.TopGap
import org.jetbrains.annotations.NotNull
import java.awt.Image
import javax.swing.ImageIcon
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel
import com.intellij.ui.dsl.builder.panel as dslPanel


/**
 * Supports creating and managing a [JPanel] for the Settings Dialog.
 */
class PactSettingsComponent {
    val panel: JPanel

    private val compilerPathField: ComboBox<String> = createComboBox(
        "Select a Pact Compiler", "Choose an executable file"
    )

    private val languageServerPathField: ComboBox<String> = createComboBox(
        "Select a Pact Language Server", "Choose an executable file"
    )

    init {
        val logo = ImageIcon(javaClass.getResource("/icons/logo.png"))
            .image.getScaledInstance(64, 64, Image.SCALE_SMOOTH)

        panel = dslPanel {
            // Compiler path
            row("Pact compiler:") {
                cell(compilerPathField)
                    .comment("Pact compiler versions 4.x.x and 5.x.x are supported".trimIndent())
                    .align(Align.FILL)
                    .resizableColumn()
            }.layout(RowLayout.LABEL_ALIGNED)

            // Language server path
            row("Pact language server:") {
                cell(languageServerPathField)
                    .comment("Specify a Pact 5 compiler path or a standalone Pact 4 language server path".trimIndent())
                    .align(Align.FILL)
                    .resizableColumn()
            }.layout(RowLayout.LABEL_ALIGNED)

            separator().topGap(TopGap.SMALL)

            // Check for updates
            row {
                cell(JLabel(ImageIcon(logo)))
                text(
                    """
                     <h3 style="margin: 6px 0 4px 0">Check for updates</h3>
                     Visit the 
                     <a href="https://github.com/kadena-io/pact/releases">Pact 4<icon src="AllIcons.Ide.External_link_arrow"></a>
                     and
                     <a href="https://github.com/kadena-io/pact-5/releases">Pact 5<icon src="AllIcons.Ide.External_link_arrow"></a> 
                     repositories 
                     <br>
                     to stay up to date with the latest versions
                     """.trimIndent()
                )
            }
        }
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
}
