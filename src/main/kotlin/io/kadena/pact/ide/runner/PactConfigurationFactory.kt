package io.kadena.pact.ide.runner

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable


class PactConfigurationFactory constructor(type: ConfigurationType) : ConfigurationFactory(type) {
    @get:NotNull
    val id: String
        get() = PactRunConfigurationType.ID

    @get:Nullable
    val optionsClass: Class<out Any?>
        get() = PactRunConfigurationOptions::class.java

    @NotNull
    override fun createTemplateConfiguration(
        @NotNull project: Project
    ): RunConfiguration {
        return PactRunConfiguration(project, this, "Pact")
    }
}
