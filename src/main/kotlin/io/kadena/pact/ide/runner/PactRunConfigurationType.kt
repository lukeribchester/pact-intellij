package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.icons.AllIcons
import com.intellij.openapi.util.NotNullLazyValue


internal class PactRunConfigurationType : ConfigurationTypeBase(
    ID, "Pact", "Pact run configuration type",
    NotNullLazyValue.createValue { AllIcons.Nodes.Console }
) {
    init {
        addFactory(PactConfigurationFactory(this))
    }

    companion object {
        const val ID: String = "PactRunConfiguration"
    }
}
