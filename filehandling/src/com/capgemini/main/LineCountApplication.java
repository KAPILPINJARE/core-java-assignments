package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication
{
	public int countLinesInFile(String fileDestination) throws IOException
	{
		File file = new File(fileDestination);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String countLine;
		int count = 0;
		while((countLine = reader.readLine()) != null)
		{
			for (String content : countLine.trim().split("\\n"));
			{
				count++;
			}
		}
		reader.close();
		return count;
	}
}
