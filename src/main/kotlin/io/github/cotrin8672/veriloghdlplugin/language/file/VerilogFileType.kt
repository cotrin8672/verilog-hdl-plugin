package io.github.cotrin8672.veriloghdlplugin.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import io.github.cotrin8672.veriloghdlplugin.language.VerilogLanguage
import javax.swing.Icon

class VerilogFileType : LanguageFileType(VerilogLanguage.INSTANCE) {
    companion object {
        @JvmStatic
        val INSTANCE = VerilogFileType()
    }

    override fun getName(): String = "Verilog File"

    override fun getDescription(): String = "Verilog HDL file"

    override fun getDefaultExtension(): String = "v"

    override fun getIcon(): Icon = FileIcons.VerilogIcon
}
