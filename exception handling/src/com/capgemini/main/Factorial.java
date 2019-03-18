package com.capgemini.main;

import com.capgemini.exceptions.FactorialException;
import com.capgemini.exceptions.InvalidInputException;

public class Factorial
{
	
	public Factorial()
	{
		super();
	}

	//getFactorial method is to get factorial of any number
	//here validating if number should be greater than 1
	//and number should not exceeds the range of integer
	public int getFactorial(int num) throws InvalidInputException, FactorialException
	{
		if (num>=2)
		{
			int factorialResult = 1;
			int tempNum = num;
			while(num!=0)
			{
				factorialResult = factorialResult * num;
				if(factorialResult > 2147483647 || factorialResult < tempNum)
				{
					throw new FactorialException("factorial should not exceeds integer range"); 
				}
				num--;
			}
			return factorialResult;		
		}
		else
			throw new InvalidInputException("number should be greater than 1");
	}
	
	
}
