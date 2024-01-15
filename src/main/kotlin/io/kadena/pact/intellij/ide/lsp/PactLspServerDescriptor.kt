package io.kadena.pact.intellij.ide.lsp

import com.google.gson.JsonObject
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class PactLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Pact") {

    override fun isSupportedFile(file: VirtualFile) = file.extension == "pact"

    override fun createCommandLine() = GeneralCommandLine("/Users/lgr/development/pact-lsp", "--stdio")

    override fun createInitializationOptions(): String {
        val pactExe = JsonObject()
        pactExe.addProperty("pactExe", "/opt/homebrew/Cellar/pact/4.10.0")

        val pactOptions = JsonObject()
        pactOptions.add("pact", pactExe)

        return pactOptions.toString()
    }
}
