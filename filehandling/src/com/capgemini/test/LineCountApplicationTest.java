package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.LineCountApplication;

public class LineCountApplicationTest
{
	
	LineCountApplication lineCountApplication;
	@Before
	public void setUp() throws Exception
	{
		lineCountApplication = new LineCountApplication();
	}

	@Test
	public void testLineCountApplicationCountingLines() throws IOException
	{
		assertEquals(21, lineCountApplication.countLinesInFile("C:\\kapil\\assignment2\\Rectangle.java"));
		
	}
	
	@Test
	public void testLineCountApplicationCheckBygivingWrongNumber() throws IOException
	{
		assertNotEquals(10, lineCountApplication.countLinesInFile("C:\\kapil\\assignment2\\Rectangle.java"));
		
	}

	@Test
	public void testLineCountApplicationCountingLinesOfanotherFile() throws IOException
	{
		assertEquals(94, lineCountApplication.countLinesInFile("C:\\kapil\\assignment2\\Employee.java"));
		
	}
}
