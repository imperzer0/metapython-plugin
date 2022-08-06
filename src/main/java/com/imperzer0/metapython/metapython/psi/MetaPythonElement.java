package com.imperzer0.metapython.metapython.psi;

import com.imperzer0.metapython.metapython.MetaPythonLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MetaPythonElement extends IElementType
{
	public MetaPythonElement(@NonNls @NotNull String debugName) { super(debugName, MetaPythonLanguage.INSTANCE); }
}
