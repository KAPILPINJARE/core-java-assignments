package com.capgemini.exceptions;

//created custom exception to validate name
public class NameNotValidException extends Exception
{

	public NameNotValidException()
	{
		super();
	}

	public NameNotValidException(String message)
	{
		super(message);
	}
	
}
