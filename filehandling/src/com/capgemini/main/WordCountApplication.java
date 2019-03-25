package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication
{
	public int doWordCount(String fileDestination) throws IOException
	{
		File file = new File(fileDestination);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String content;
		int count = 0;
		while ((content = reader.readLine()) != null)
		{
			for (String words : content.trim().split(" "))
			{
				count++;
			}
		}
		reader.close();
		return count;
	}
}
