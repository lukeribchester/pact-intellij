package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.components.BaseState
import com.intellij.openapi.project.Project
import org.jetbrains.annotations.NotNull


class PactConfigurationFactory constructor(type: ConfigurationType) : ConfigurationFactory(type) {
    @NotNull
    override fun getId(): String {
        return PactRunConfigurationType.ID
    }

    @NotNull
    override fun getOptionsClass(): Class<out BaseState> {
        return PactRunConfigurationOptions::class.java
    }

    @NotNull
    override fun createTemplateConfiguration(
        @NotNull project: Project
    ): RunConfiguration {
        return PactRunConfiguration(project, this, "Pact")
    }
}
