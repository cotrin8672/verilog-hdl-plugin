package io.github.cotrin8672.veriloghdlplugin.language.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet


interface VerilogTokenSets {
    companion object {
        private fun IElementType.createTokenSet() = TokenSet.create(this@createTokenSet)

        val COMMENT = TokenSet.create(VerilogTypes.LINE_COMMENT, VerilogTypes.BLOCK_COMMENT)
        val STRING_LITERAL = VerilogTypes.STRING_LITERAL.createTokenSet()
        val IDENTIFIER = VerilogTypes.IDENTIFIER.createTokenSet()
        val COMMA = VerilogTypes.COMMA.createTokenSet()
        val SEMI = VerilogTypes.SEMI.createTokenSet()
        val EQUALS = VerilogTypes.EQUALS.createTokenSet()
        val LPAREN = VerilogTypes.LPAREN.createTokenSet()
        val RPAREN = VerilogTypes.RPAREN.createTokenSet()
        val ASSIGN = VerilogTypes.ASSIGN.createTokenSet()
        val AMPERSAND = VerilogTypes.AMPERSAND.createTokenSet()
        val CARET = VerilogTypes.CARET.createTokenSet()
        val MODULE = VerilogTypes.MODULE.createTokenSet()
        val ENDMODULE = VerilogTypes.ENDMODULE.createTokenSet()
        val INPUT = VerilogTypes.INPUT.createTokenSet()
        val OUTPUT = VerilogTypes.OUTPUT.createTokenSet()
    }
}
