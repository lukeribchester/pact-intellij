package io.kadena.pact.ide.settings

import com.intellij.openapi.options.Configurable
import org.jetbrains.annotations.Nullable
import javax.swing.JComponent


/**
 * Provides controller functionality for application settings.
 */
internal class AppSettingsConfigurable : Configurable {
    private var appSettingsComponent: AppSettingsComponent? = null

    override fun getDisplayName(): String {
        return "Pact"
    }

    fun preferredFocusedComponent(): JComponent {
        return appSettingsComponent!!.preferredFocusedComponent
    }

    @Nullable
    override fun createComponent(): JComponent {
        appSettingsComponent = AppSettingsComponent()
        return appSettingsComponent!!.panel
    }

    override fun isModified(): Boolean {
        val settings: AppSettingsState = AppSettingsState.instance
        var modified: Boolean = !appSettingsComponent?.pactPath.equals(settings.pactPath)
        modified = modified or (!appSettingsComponent?.pactLanguageServerPath.equals(settings.pactLanguageServerPath))
        return modified
    }

    override fun apply() {
        val settings: AppSettingsState = AppSettingsState.instance
        settings.pactPath = appSettingsComponent?.pactPath.toString()
        settings.pactLanguageServerPath = appSettingsComponent?.pactLanguageServerPath.toString()
        settings.notifyAppSettingsStateChanged(settings)
    }

    override fun reset() {
        val settings: AppSettingsState = AppSettingsState.instance
        appSettingsComponent?.pactPath = settings.pactPath
        appSettingsComponent?.pactLanguageServerPath = settings.pactLanguageServerPath
    }

    override fun disposeUIResources() {
        appSettingsComponent = null
    }
}
