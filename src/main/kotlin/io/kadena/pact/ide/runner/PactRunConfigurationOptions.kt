package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.RunConfigurationOptions
import com.intellij.openapi.components.StoredProperty
import io.kadena.pact.ide.settings.PactSettingsState


class PactRunConfigurationOptions : RunConfigurationOptions() {
    private val settings: PactSettingsState = PactSettingsState.instance

    private val _compilerPath: StoredProperty<String?> =
        string(settings.compilerPath.takeIf { it.isNotBlank() } ?: "")
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
