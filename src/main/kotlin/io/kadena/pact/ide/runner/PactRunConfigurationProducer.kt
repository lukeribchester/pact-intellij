package io.kadena.pact.ide.runner

import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.LazyRunConfigurationProducer
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiElement


class PactRunConfigurationProducer : LazyRunConfigurationProducer<PactRunConfiguration>() {
    override fun getConfigurationFactory(): ConfigurationFactory {
        return PactConfigurationFactory(PactRunConfigurationType())
    }

    override fun setupConfigurationFromContext(
        configuration: PactRunConfiguration,
        context: ConfigurationContext,
        sourceElement: Ref<PsiElement>
    ): Boolean {
        val file = context.psiLocation?.containingFile

        if (file?.virtualFile?.extension == "pact") {
            configuration.name = file.virtualFile.nameWithoutExtension
            configuration.modulePath = file.virtualFile.path

            return true
        }

        return false
    }

    override fun isConfigurationFromContext(
        configuration: PactRunConfiguration,
        context: ConfigurationContext
    ): Boolean {
        val file = context.psiLocation?.containingFile

        return file?.virtualFile?.extension == "pact" &&
                configuration.modulePath == file.virtualFile.path
    }
}
