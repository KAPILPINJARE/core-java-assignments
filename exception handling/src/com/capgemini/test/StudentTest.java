package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exceptions.AgeNotWithinRangeException;
import com.capgemini.exceptions.NameNotValidException;
import com.capgemini.main.Student;

public class StudentTest
{
	
	//checking exception occurs in age
	//when age is greater than 21
	@Test(expected = AgeNotWithinRangeException.class)
	public void testStudentAgeExceptionOccursWhenAgeIsMoreThenExpected() throws AgeNotWithinRangeException, NameNotValidException
	{
		
		Student student = new Student(101,"kapil",26,"be");
	}

	//checking exception occurs in age
	//when age is less than 15
	@Test(expected = AgeNotWithinRangeException.class)
	public void testStudentAgeExceptionOccursWhenAgeIsLessThenExpected() throws AgeNotWithinRangeException, NameNotValidException
	{	
		Student student = new Student(101,"kapil",11,"be");
	}
	
	//checking  exception occurs in name
	//when name contains numbers
	@Test(expected = NameNotValidException.class)
	public void testStudentNameExceptionOccursWhenNameContainsNumbers() throws AgeNotWithinRangeException, NameNotValidException
	{	
		Student student = new Student(101,"12kapil",19,"be");
	}
	
	//checking exception occurs in name
	//when name contains symbols
	@Test(expected = NameNotValidException.class)
	public void testStudentNameExceptionOccursWhenNameContainsSymbols() throws AgeNotWithinRangeException, NameNotValidException
		{	
			Student student = new Student(101,"@!kapil",19,"be");
		}
	
	//checking exception occurs in name
	//when name contains symbols and numbers
	@Test(expected = NameNotValidException.class)
	public void testStudentNameExceptionOccursWhenNameContainsSymbolsAndNumbersBoth() throws AgeNotWithinRangeException, NameNotValidException
	{	
		Student student = new Student(101,"@!123kapil",19,"be");
	}

	//checking  exception not occurs in age
	//when age is in range
	@Test
	public void testStudentWithAllexpectedInputsNoErrorSituation() throws AgeNotWithinRangeException, NameNotValidException
	{		
		Student student = new Student(101,"kapil",18,"be");
	}
		
}
