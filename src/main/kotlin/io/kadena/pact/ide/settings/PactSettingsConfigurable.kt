package io.kadena.pact.ide.settings

import com.intellij.openapi.options.Configurable
import org.jetbrains.annotations.Nullable
import javax.swing.JComponent


/**
 * Provides controller functionality for application settings.
 */
internal class PactSettingsConfigurable : Configurable {
    private var pactSettingsComponent: PactSettingsComponent? = null

    override fun getDisplayName(): String {
        return "Pact"
    }

    fun preferredFocusedComponent(): JComponent {
        return pactSettingsComponent!!.preferredFocusedComponent
    }

    @Nullable
    override fun createComponent(): JComponent {
        pactSettingsComponent = PactSettingsComponent()
        return pactSettingsComponent!!.panel
    }

    override fun isModified(): Boolean {
        val settings: PactSettingsState = PactSettingsState.instance
        var modified: Boolean = !pactSettingsComponent?.compilerPath.equals(settings.compilerPath)
        modified = modified or (!pactSettingsComponent?.languageServerPath.equals(settings.languageServerPath))
        return modified
    }

    override fun apply() {
        val settings: PactSettingsState = PactSettingsState.instance
        settings.compilerPath = pactSettingsComponent?.compilerPath.toString()
        settings.languageServerPath = pactSettingsComponent?.languageServerPath.toString()
        settings.notifyAppSettingsStateChanged(settings)
    }

    override fun reset() {
        val settings: PactSettingsState = PactSettingsState.instance
        pactSettingsComponent?.compilerPath = settings.compilerPath
        pactSettingsComponent?.languageServerPath = settings.languageServerPath
    }

    override fun disposeUIResources() {
        pactSettingsComponent = null
    }
}
