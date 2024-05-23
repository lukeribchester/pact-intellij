package io.kadena.pact.ide.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable


/**
 * Supports storing the application settings in a persistent way.
 * The [State] and [Storage] annotations define the name of the data and the file name where
 * these persistent application settings are stored.
 */
@State(
    name = "io.kadena.pact.ide.settings.PactSettingsState",
    storages = [Storage("PactPlugin.xml")]
)
class PactSettingsState : PersistentStateComponent<PactSettingsState> {
    var compilerPath: String = ""
    var languageServerPath: String = ""

    private val listeners = mutableSetOf<AppSettingsStateListener>()

    @Nullable
    override fun getState(): PactSettingsState {
        return this
    }

    override fun loadState(@NotNull state: PactSettingsState) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {
        val instance: PactSettingsState
            get() = ApplicationManager.getApplication().getService(PactSettingsState::class.java)
    }

    fun addAppSettingsStateListener(listener: AppSettingsStateListener) {
        listeners.add(listener)
    }

    fun notifyAppSettingsStateChanged(state: PactSettingsState) {
        for (listener in listeners) {
            listener.onAppSettingsStateChanged(state)
        }
    }

    interface AppSettingsStateListener {
        fun onAppSettingsStateChanged(state: PactSettingsState)
    }
}
