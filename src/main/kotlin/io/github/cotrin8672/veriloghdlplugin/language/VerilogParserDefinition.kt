package io.github.cotrin8672.veriloghdlplugin.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import io.github.cotrin8672.veriloghdlplugin.language.parser.VerilogParser
import io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogFile
import io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogTokenSets
import io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogTypes

class VerilogParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(VerilogLanguage.INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer = VerilogLexerAdapter()

    override fun createParser(project: Project?): PsiParser = VerilogParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = VerilogTokenSets.COMMENT

    override fun getStringLiteralElements(): TokenSet = VerilogTokenSets.STRING_LITERAL

    override fun createElement(node: ASTNode?): PsiElement = VerilogTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = VerilogFile(viewProvider)
}
