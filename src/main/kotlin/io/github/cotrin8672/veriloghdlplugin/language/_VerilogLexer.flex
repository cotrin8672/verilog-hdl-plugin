package io.github.cotrin8672.veriloghdlplugin.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogTypes.*;

%%

%{
  public _VerilogLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _VerilogLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[\s\n\r\t\f]+
LINE_COMMENT="//"[^-\n]*
BLOCK_COMMENT="/"\*[\s\S]*?\*"/"|"//".*
STRING_LITERAL=\"([^\"\\]|\\.)*\"
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  ","                    { return COMMA; }
  ";"                    { return SEMI; }
  "="                    { return EQUALS; }
  "("                    { return LPAREN; }
  ")"                    { return RPAREN; }
  "assign"               { return ASSIGN; }
  "&"                    { return AMPERSAND; }
  "^"                    { return CARET; }
  "module"               { return MODULE; }
  "endmodule"            { return ENDMODULE; }
  "input"                { return INPUT; }
  "output"               { return OUTPUT; }

  {SPACE}                { return SPACE; }
  {LINE_COMMENT}         { return LINE_COMMENT; }
  {BLOCK_COMMENT}        { return BLOCK_COMMENT; }
  {STRING_LITERAL}       { return STRING_LITERAL; }
  {IDENTIFIER}           { return IDENTIFIER; }

}

[^] { return BAD_CHARACTER; }
