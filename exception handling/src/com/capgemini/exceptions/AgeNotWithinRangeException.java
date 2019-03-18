package com.capgemini.exceptions;

//created custom exception to validate age
public class AgeNotWithinRangeException extends Exception
{

	public AgeNotWithinRangeException()
	{
		super();
	}

	public AgeNotWithinRangeException(String message)
	{
		super(message);
	}

}
