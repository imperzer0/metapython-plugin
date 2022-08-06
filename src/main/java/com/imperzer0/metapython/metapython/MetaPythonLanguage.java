package com.imperzer0.metapython.metapython;

import com.intellij.lang.Language;

public class MetaPythonLanguage extends Language
{
	public static final MetaPythonLanguage INSTANCE = new MetaPythonLanguage();
	
	protected MetaPythonLanguage() { super("metapython"); }
}
