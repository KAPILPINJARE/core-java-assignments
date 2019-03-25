package com.capgemini.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.FileExists;

public class FileExistsTest
{
	
	FileExists fileExists;
	@Before
	public void setUp() throws Exception
	{
		fileExists = new FileExists();
	}

	@Test
	public void testIfFileExistsCheckWithValidFile()
	{
		assertTrue(fileExists.isFileExists("C:\\kapil\\assignment2\\Rectangle.java"));
	}
	
	@Test
	public void testIfFileExistsCheckWhenFileNotExists()
	{
		assertFalse(fileExists.isFileExists("Rectangle.java"));
	}

}
