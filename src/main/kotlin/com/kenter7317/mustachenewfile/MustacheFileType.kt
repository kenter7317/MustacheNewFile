package com.kenter7317.mustachenewfile

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class MustacheFileType : LanguageFileType(MustacheLanguage.INSTANCE) {

    override fun getName(): String = "Mustache"

    override fun getDescription(): String = "Mustache template file"

    override fun getDefaultExtension(): String = "mustache"

    override fun getIcon(): Icon = IconLoader.getIcon("/icons/mustache.svg", MustacheFileType::class.java)

    companion object {
        val INSTANCE = MustacheFileType()
    }
}
