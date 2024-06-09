// This is a generated file. Not intended for manual editing.
package io.github.cotrin8672.veriloghdlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface VerilogTypes {

  IElementType MODULE_CONTENT = new VerilogElementType("MODULE_CONTENT");
  IElementType OPERATOR = new VerilogElementType("OPERATOR");

  IElementType AMPERSAND = new VerilogTokenType("&");
  IElementType ASSIGN = new VerilogTokenType("assign");
  IElementType BLOCK_COMMENT = new VerilogTokenType("BLOCK_COMMENT");
  IElementType CARET = new VerilogTokenType("^");
  IElementType COMMA = new VerilogTokenType(",");
  IElementType ENDMODULE = new VerilogTokenType("endmodule");
  IElementType EQUALS = new VerilogTokenType("=");
  IElementType IDENTIFIER = new VerilogTokenType("IDENTIFIER");
  IElementType INPUT = new VerilogTokenType("input");
  IElementType LINE_COMMENT = new VerilogTokenType("LINE_COMMENT");
  IElementType LPAREN = new VerilogTokenType("(");
  IElementType MODULE = new VerilogTokenType("module");
  IElementType OUTPUT = new VerilogTokenType("output");
  IElementType RPAREN = new VerilogTokenType(")");
  IElementType SEMI = new VerilogTokenType(";");
  IElementType STRING_LITERAL = new VerilogTokenType("STRING_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MODULE_CONTENT) {
        return new VerilogModuleContentImpl(node);
      }
      else if (type == OPERATOR) {
        return new VerilogOperatorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
