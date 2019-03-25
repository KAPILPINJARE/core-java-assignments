package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.WordCountApplication;

public class WordCountApplicationTest
{

	WordCountApplication wordCountApplication;

	@Before
	public void setUp() throws Exception
	{
		wordCountApplication = new WordCountApplication();
	}

	@Test
	public void testWordCountApplicationCheckWithValidInput() throws IOException
	{
		assertEquals(7, wordCountApplication.doWordCount("wordCountCheck.txt"));
	}

	@Test
	public void testWordCountApplicationCheckWithInValidInput() throws IOException
	{
		assertNotEquals(6, wordCountApplication.doWordCount("wordCountCheck.txt"));
	}

}
