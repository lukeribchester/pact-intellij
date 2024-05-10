package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.RunConfigurationOptions
import com.intellij.openapi.components.StoredProperty


class PactRunConfigurationOptions : RunConfigurationOptions() {
    private val myScriptName: StoredProperty<String?> = string("").provideDelegate(
        this, "scriptName"
    )

    var scriptName: String
        get() = myScriptName.getValue(this).toString()
        set(scriptName) {
            myScriptName.setValue(this, scriptName)
        }
}
