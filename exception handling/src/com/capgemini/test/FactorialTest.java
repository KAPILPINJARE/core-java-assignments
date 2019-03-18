package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptions.FactorialException;
import com.capgemini.exceptions.InvalidInputException;
import com.capgemini.main.Factorial;

public class FactorialTest
{
	Factorial f;
	@Before
	public void setUp()
	{
		f = new Factorial();
	}
	
	//test factorial method for normal input
	@Test
	public void testFactorialWhenNumberIsValid() throws InvalidInputException, FactorialException
	{
		f.getFactorial(5);
	}
	
	//checking for getting exception when number is less than 2 
	@Test(expected = InvalidInputException.class)
	public void testFactorialWhenNumberIsLessThanTwo() throws InvalidInputException, FactorialException
	{
		f.getFactorial(1);
	}
	
	//checking for getting exception when number is more than range of integer small value
	@Test(expected = FactorialException.class)
	public void testFactorialWhenNumberIsGreaterThanRangeOfIntegerSmallNo() throws InvalidInputException, FactorialException
	{
		f.getFactorial(13);//factorial of 13 exceeds integer range
	}
	
	//checking for getting exception when number is more than range of integer big value
	@Test(expected = FactorialException.class)
	public void testFactorialWhenNumberIsGreaterThanRangeOfIntegerLargeNo() throws InvalidInputException, FactorialException
	{
		f.getFactorial(78678785);
	}
}
