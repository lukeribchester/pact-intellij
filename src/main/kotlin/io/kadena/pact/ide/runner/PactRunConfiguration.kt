package io.kadena.pact.ide.runner

import com.intellij.execution.ExecutionException
import com.intellij.execution.Executor
import com.intellij.execution.configurations.*
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessHandlerFactory
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable


class PactRunConfiguration constructor(
    project: Project,
    factory: ConfigurationFactory?,
    name: String?
) :
    RunConfigurationBase<PactRunConfigurationOptions?>(project, factory, name) {

    @NotNull
    override fun getOptions(): PactRunConfigurationOptions {
        return super.getOptions() as PactRunConfigurationOptions
    }

    var scriptName: String
        get() = options.scriptName
        set(scriptName) {
            options.scriptName = scriptName
        }

    @NotNull
    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration?> {
        return PactSettingsEditor()
    }

    @Nullable
    override fun getState(
        @NotNull executor: Executor,
        @NotNull environment: ExecutionEnvironment
    ): RunProfileState {
        return object : CommandLineState(environment) {
            @NotNull
            @Throws(ExecutionException::class)
            override fun startProcess(): ProcessHandler {
                val commandLine: GeneralCommandLine = GeneralCommandLine(options.scriptName)
                val processHandler = ProcessHandlerFactory.getInstance().createColoredProcessHandler(commandLine)

                ProcessTerminatedListener.attach(processHandler)

                return processHandler
            }
        }
    }
}
