package com.capgemini.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptions.StringNotFoundInFileException;
import com.capgemini.main.GrepApplication;

public class GrepApplicationTest
{
	
	GrepApplication grepApplication;
	@Before
	public void setUp() throws Exception
	{
		grepApplication = new GrepApplication();
	}

	@Test
	public void testIfMapThatContainsStringFoundResultIsNotNull() throws IOException, StringNotFoundInFileException
	{
		assertNotNull(grepApplication.getGrep("assignments_io.txt","Java"));
	}
	
	
	@Test(expected = StringNotFoundInFileException.class)
	public void testIfMapThatContainsStringFoundResultIsNotNulll() throws IOException, StringNotFoundInFileException
	{
		assertNull(grepApplication.getGrep("assignments_io.txt","jasjiodfja"));
	}
}
