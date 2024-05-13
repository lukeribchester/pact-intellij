package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.openapi.util.NotNullLazyValue
import io.kadena.pact.PactIcons


internal class PactRunConfigurationType : ConfigurationTypeBase(
    ID, "Pact", "Pact run configuration type",
    NotNullLazyValue.createValue { PactIcons.FILE }
) {
    init {
        addFactory(PactConfigurationFactory(this))
    }

    companion object {
        const val ID: String = "PactRunConfiguration"
    }
}
