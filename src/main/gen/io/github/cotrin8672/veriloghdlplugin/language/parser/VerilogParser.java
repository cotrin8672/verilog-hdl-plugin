// This is a generated file. Not intended for manual editing.
package io.github.cotrin8672.veriloghdlplugin.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VerilogParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return verilogFile(b, l + 1);
  }

  /* ********************************************************** */
  // ASSIGN IDENTIFIER EQUALS IDENTIFIER operator IDENTIFIER
  static boolean assignDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignDeclaration")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASSIGN, IDENTIFIER, EQUALS, IDENTIFIER);
    r = r && operator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignDeclaration SEMI
  public static boolean moduleContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleContent")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignDeclaration(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, MODULE_CONTENT, r);
    return r;
  }

  /* ********************************************************** */
  // MODULE IDENTIFIER LPAREN parameterList RPAREN SEMI moduleContent* ENDMODULE
  static boolean moduleDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleDeclaration")) return false;
    if (!nextTokenIs(b, MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MODULE, IDENTIFIER, LPAREN);
    r = r && parameterList(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMI);
    r = r && moduleDeclaration_6(b, l + 1);
    r = r && consumeToken(b, ENDMODULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // moduleContent*
  private static boolean moduleDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleDeclaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!moduleContent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleDeclaration_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AMPERSAND | CARET
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    if (!nextTokenIs(b, "<operator>", AMPERSAND, CARET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, AMPERSAND);
    if (!r) r = consumeToken(b, CARET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INPUT IDENTIFIER | OUTPUT IDENTIFIER
  static boolean parameterDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterDeclaration")) return false;
    if (!nextTokenIs(b, "", INPUT, OUTPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, INPUT, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, OUTPUT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parameterDeclaration (COMMA parameterDeclaration)*
  static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    if (!nextTokenIs(b, "", INPUT, OUTPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameterDeclaration(b, l + 1);
    r = r && parameterList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameterDeclaration)*
  private static boolean parameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_1", c)) break;
    }
    return true;
  }

  // COMMA parameterDeclaration
  private static boolean parameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameterDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // moduleDeclaration*
  static boolean verilogFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "verilogFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!moduleDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "verilogFile", c)) break;
    }
    return true;
  }

}
