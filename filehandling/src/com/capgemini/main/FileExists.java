package com.capgemini.main;

import java.io.File;

public class FileExists
{
	public boolean isFileExists(String fileDestination)
	{
		File file = new File(fileDestination);
		return file.exists();
	}
}
