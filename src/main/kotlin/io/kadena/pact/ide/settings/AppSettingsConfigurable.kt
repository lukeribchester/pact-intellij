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
        var modified: Boolean = !appSettingsComponent?.compilerPath.equals(settings.compilerPath)
        modified = modified or (!appSettingsComponent?.languageServerPath.equals(settings.languageServerPath))
        return modified
    }

    override fun apply() {
        val settings: AppSettingsState = AppSettingsState.instance
        settings.compilerPath = appSettingsComponent?.compilerPath.toString()
        settings.languageServerPath = appSettingsComponent?.languageServerPath.toString()
        settings.notifyAppSettingsStateChanged(settings)
    }

    override fun reset() {
        val settings: AppSettingsState = AppSettingsState.instance
        appSettingsComponent?.compilerPath = settings.compilerPath
        appSettingsComponent?.languageServerPath = settings.languageServerPath
    }

    override fun disposeUIResources() {
        appSettingsComponent = null
    }
}
