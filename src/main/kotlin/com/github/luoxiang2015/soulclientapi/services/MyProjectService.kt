package com.github.luoxiang2015.soulclientapi.services

import com.intellij.openapi.project.Project
import com.github.luoxiang2015.soulclientapi.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
