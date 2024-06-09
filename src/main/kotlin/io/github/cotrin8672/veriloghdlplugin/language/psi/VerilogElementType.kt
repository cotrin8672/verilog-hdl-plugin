package io.github.cotrin8672.veriloghdlplugin.language.psi

import com.intellij.psi.tree.IElementType
import io.github.cotrin8672.veriloghdlplugin.language.VerilogLanguage

class VerilogElementType(debugName: String) : IElementType(debugName, VerilogLanguage.INSTANCE)
