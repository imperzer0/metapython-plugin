package com.imperzer0.metapython.metapython;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MetaPythonFileType extends LanguageFileType
{
	public static final MetaPythonFileType INSTANCE = new MetaPythonFileType();
	
	protected MetaPythonFileType() { super(MetaPythonLanguage.INSTANCE); }
	
	
	@Override
	public @NonNls
	@NotNull String getName()
	{
		return "MetaPython";
	}
	
	@Override
	public @NlsContexts.Label
	@NotNull String getDescription()
	{
		return "MetaPython code file";
	}
	
	@Override
	public @NlsSafe
	@NotNull String getDefaultExtension()
	{
		return "mpy";
	}
	
	@Override
	public @Nullable Icon getIcon()
	{
		return MetaPythonIcons.FILE;
	}
}
