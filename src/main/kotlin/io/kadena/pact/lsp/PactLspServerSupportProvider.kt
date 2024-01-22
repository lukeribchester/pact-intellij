package io.kadena.pact.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerManager
import com.intellij.platform.lsp.api.LspServerSupportProvider
import io.kadena.pact.ide.settings.AppSettingsState

class PactLspServerSupportProvider : LspServerSupportProvider, AppSettingsState.AppSettingsStateListener {

    private var _project: Project? = null

    init {
        val settings = AppSettingsState.instance
        settings.addAppSettingsStateListener(this)
    }

    override fun fileOpened(
        project: Project,
        file: VirtualFile,
        serverStarter: LspServerSupportProvider.LspServerStarter
    ) {
        if (file.extension == "pact") {
            _project = project
            serverStarter.ensureServerStarted(PactLspServerDescriptor(project))
        }
    }

    override fun onAppSettingsStateChanged(state: AppSettingsState) {
        restart()
    }

    private fun restart() {
        _project?.let { project ->
            val server = LspServerManager.getInstance(project)
            server.stopAndRestartIfNeeded(PactLspServerSupportProvider::class.java)
        }
    }
}
