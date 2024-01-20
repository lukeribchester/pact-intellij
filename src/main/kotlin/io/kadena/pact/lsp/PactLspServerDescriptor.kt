package io.kadena.pact.lsp

import com.google.gson.JsonObject
import com.intellij.execution.ExecutionException
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.extensions.PluginId
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import java.io.File
import java.nio.file.Paths

class PactLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Pact") {

    companion object {
        private val LOG: Logger = Logger.getInstance(
            PactLspServerDescriptor::class.java
        )
    }

    fun getBundledExecutablePath(pluginId: String, executableRelativePath: String): String? {
        // Get the PluginId object from the plugin ID string
        val id = PluginId.getId(pluginId)

        // Retrieve the IdeaPluginDescriptor
        val plugin = PluginManagerCore.getPlugin(id)

        // Get the installation directory of the plugin
        val pluginPath = plugin?.pluginPath?.toFile()?.absolutePath

        // Construct the full path to the bundled executable
        return pluginPath?.let { Paths.get(it, executableRelativePath).toString() }
    }

    fun doesExecutableExist(executablePath: String): Boolean {
        val file = File(executablePath)
        return file.exists() && file.isFile
    }

    override fun isSupportedFile(file: VirtualFile) = file.extension == "pact"

    override fun createCommandLine(): GeneralCommandLine {
        val pactLspPath = getBundledExecutablePath("io.kadena.pact", "language-server/pact-lsp-v0.0.1")

        if (pactLspPath == null || !doesExecutableExist(pactLspPath)) {
            throw ExecutionException("Pact language server executable not found")
        }

        return GeneralCommandLine(pactLspPath).apply {
            withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
            withCharset(Charsets.UTF_8)
            addParameter("--stdio")
        }
    }

    override fun createInitializationOptions(): String {
        val pactExecutable = JsonObject()
        pactExecutable.addProperty("pactExe", "/opt/homebrew/Cellar/pact/4.10.0/bin/pact")

        val options = JsonObject()
        options.add("pact", pactExecutable)

        return options.toString()
    }

    override val lspGoToDefinitionSupport = true

    override val lspHoverSupport = true
}
