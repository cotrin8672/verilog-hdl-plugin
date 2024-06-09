// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.cotrin8672.veriloghdlplugin.language.psi.VerilogTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.cotrin8672.veriloghdlplugin.language.psi.impl.*;

public class VerilogOperatorImpl extends ASTWrapperPsiElement implements VerilogOperator {

  public VerilogOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

}
