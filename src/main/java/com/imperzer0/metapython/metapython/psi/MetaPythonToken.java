package com.imperzer0.metapython.metapython.psi;

import com.imperzer0.metapython.metapython.MetaPythonLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MetaPythonToken extends IElementType
{
	public MetaPythonToken(@NonNls @NotNull String debugName) { super(debugName, MetaPythonLanguage.INSTANCE); }
	
	@Override
	public String toString() { return "MetaPythonToken" + super.toString(); }
}
