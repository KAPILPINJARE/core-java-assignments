package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.capgemini.exceptions.StringNotFoundInFileException;

public class GrepApplication
{
	

	public Object getGrep(String fileDestination,String searchingElement) throws IOException, StringNotFoundInFileException
	{
		File file = new File(fileDestination);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String content;
		HashMap<Integer,String> result = new HashMap<Integer,String>();
		int inc = 1;
		while((content = reader.readLine()) != null)
		{
			for (String s : content.split("\\n"))
			{
				if(s.contains(searchingElement))
					result.put(inc,s);
			}
			inc++;
		}
		reader.close();
		if(result.isEmpty())
			throw new StringNotFoundInFileException("File not contains String");
		else
			return result;
	}

	
}
