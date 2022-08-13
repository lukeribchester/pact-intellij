package io.kadena.pact.intellij.services

import com.intellij.openapi.project.Project
import io.kadena.pact.intellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
