package io.kadena.pact.lsp

import com.google.gson.JsonObject
import com.intellij.execution.ExecutionException
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import io.kadena.pact.ide.settings.PactSettingsState
import java.io.File

class PactLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Pact") {

    companion object {
        private val LOG: Logger = Logger.getInstance(
            PactLspServerDescriptor::class.java
        )
    }

//    fun getBundledExecutablePath(pluginId: String, executableRelativePath: String): String? {
//        // Get the PluginId object from the plugin ID string
//        val id = PluginId.getId(pluginId)
//
//        // Retrieve the IdeaPluginDescriptor
//        val plugin = PluginManagerCore.getPlugin(id)
//
//        // Get the installation directory of the plugin
//        val pluginPath = plugin?.pluginPath?.toFile()?.absolutePath
//
//        // Construct the full path to the bundled executable
//        return pluginPath?.let { Paths.get(it, executableRelativePath).toString() }
//    }

    private fun doesExecutableExist(executablePath: String): Boolean {
        val file = File(executablePath)
        return file.exists() && file.isFile
    }

    private fun isIntegratedLanguageServer(): Boolean {
        return PactSettingsState.instance.languageServerPath == PactSettingsState.instance.compilerPath
    }

    override fun isSupportedFile(file: VirtualFile) = file.extension == "pact"

    override fun createCommandLine(): GeneralCommandLine {
        // Retrieve the configured Pact Language Server executable path
        val languageServerPath = PactSettingsState.instance.languageServerPath

        if (languageServerPath == "" || !doesExecutableExist(languageServerPath)) {
            throw ExecutionException("Pact Language Server (LSP) executable not found")
        }

        // Start the Pact Language Server
        return GeneralCommandLine(languageServerPath).apply {
            withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
            withCharset(Charsets.UTF_8)
            if (isIntegratedLanguageServer()) addParameter("--lsp")
        }
    }

    override fun createInitializationOptions(): String {
        // Retrieve the configured Pact executable path
        val pactPath = PactSettingsState.instance.compilerPath

        val pactExe = JsonObject()
        pactExe.addProperty("pactExe", pactPath)

        val options = JsonObject()
        options.add("pact", pactExe)

        return options.toString()
    }

    override val lspGoToDefinitionSupport = true

    override val lspHoverSupport = true
}
