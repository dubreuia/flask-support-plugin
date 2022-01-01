package com.github.dubreuia.flasksupportplugin.services

import com.intellij.openapi.project.Project
import com.github.dubreuia.flasksupportplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
