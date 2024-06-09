package io.github.cotrin8672.veriloghdlplugin.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import io.github.cotrin8672.veriloghdlplugin.language.VerilogLanguage
import io.github.cotrin8672.veriloghdlplugin.language.file.VerilogFileType

class VerilogFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, VerilogLanguage.INSTANCE) {
    override fun getFileType(): FileType = VerilogFileType.INSTANCE
}
