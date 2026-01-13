package com.kenter7317.mustachenewfile

import com.intellij.ide.fileTemplates.FileTemplateDescriptor
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory
import com.intellij.openapi.util.IconLoader

class MustacheFileTemplateProvider : FileTemplateGroupDescriptorFactory {

    override fun getFileTemplatesDescriptor(): FileTemplateGroupDescriptor {
        val group = FileTemplateGroupDescriptor(
            "Mustache",
            IconLoader.getIcon("/icons/mustache.svg", MustacheFileTemplateProvider::class.java)
        )

        group.addTemplate(FileTemplateDescriptor("Mustache File.mustache"))

        return group
    }
}

