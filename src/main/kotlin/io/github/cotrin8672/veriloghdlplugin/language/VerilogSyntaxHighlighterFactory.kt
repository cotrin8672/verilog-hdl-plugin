package io.github.cotrin8672.veriloghdlplugin.language

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import io.github.cotrin8672.veriloghdlplugin.language.syntax.VerilogSyntaxHighlighter

class VerilogSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {
        return VerilogSyntaxHighlighter()
    }
}
