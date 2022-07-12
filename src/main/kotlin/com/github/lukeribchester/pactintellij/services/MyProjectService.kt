package com.github.lukeribchester.pactintellij.services

import com.intellij.openapi.project.Project
import com.github.lukeribchester.pactintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
