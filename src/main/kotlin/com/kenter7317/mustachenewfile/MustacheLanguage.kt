package com.kenter7317.mustachenewfile

import com.intellij.lang.Language

class MustacheLanguage : Language("Mustache") {
    companion object {
        val INSTANCE = MustacheLanguage()
    }
}

