package io.github.cotrin8672.veriloghdlplugin.language.psi

import com.intellij.psi.tree.IElementType
import io.github.cotrin8672.veriloghdlplugin.language.VerilogLanguage

class VerilogTokenType(debugName: String) : IElementType(debugName, VerilogLanguage.INSTANCE)
