package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.RunConfigurationOptions
import com.intellij.openapi.components.StoredProperty
import io.kadena.pact.ide.settings.AppSettingsState


class PactRunConfigurationOptions : RunConfigurationOptions() {
    private val settings: AppSettingsState = AppSettingsState.instance

    private val _compilerPath: StoredProperty<String?> =
        string(settings.pactPath.takeIf { it.isNotBlank() } ?: "")
            .provideDelegate(this, "compilerPath")

    private val _modulePath: StoredProperty<String?> =
        string("")
            .provideDelegate(this, "modulePath")

    var compilerPath: String
        get() = _compilerPath.getValue(this).toString()
        set(newCompilerPath) {
            _compilerPath.setValue(this, newCompilerPath)
        }

    var modulePath: String
        get() = _modulePath.getValue(this).toString()
        set(newModulePath) {
            _modulePath.setValue(this, newModulePath)
        }
}
