package io.github.cotrin8672.veriloghdlplugin.language.syntax

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import io.github.cotrin8672.veriloghdlplugin.language.VerilogLexerAdapter
import io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogTypes


class VerilogSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val LINE_COMMENT = createTextAttributesKey(
            "VERILOG_LINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val BLOCK_COMMENT = createTextAttributesKey(
            "VERILOG_BLOCK_COMMENT",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
        )
        val KEYWORD = createTextAttributesKey(
            "VERILOG_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )

        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
        private val LINE_COMMENT_KEYS = arrayOf(LINE_COMMENT)
        private val BLOCK_COMMENT_KEYS = arrayOf(BLOCK_COMMENT)
        private val KEYWORD_KEYS = arrayOf(KEYWORD)
    }

    override fun getHighlightingLexer(): Lexer {
        return VerilogLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
        return when (tokenType) {
            VerilogTypes.LINE_COMMENT -> LINE_COMMENT_KEYS
            VerilogTypes.BLOCK_COMMENT -> BLOCK_COMMENT_KEYS

            VerilogTypes.MODULE,
            VerilogTypes.ENDMODULE,
            VerilogTypes.ASSIGN,
            VerilogTypes.INPUT,
            VerilogTypes.OUTPUT,
            -> KEYWORD_KEYS

            else -> EMPTY_KEYS
        }
    }

}
