package com.capgemini.main;

import com.capgemini.exceptions.InvalidDayException;
import com.capgemini.exceptions.InvalidMonthException;

public class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//in this parameterized constructor checking for date and month validation
	public Date(int day, int month, int year) throws InvalidMonthException, InvalidDayException
	{
		super();
		this.year = year;
		
		if(month >= 1 && month <= 12)
		{
			this.month = month;
		}
		else
			throw new InvalidMonthException("month should be between 1 and 12");
		
		if(isDayValid(day, month, year))
			this.day= day;
		else
			throw new InvalidDayException();
		
	}
	
	//method for checking for any leap year or not
	public static boolean isLeap(int year)
	{
		if((year%4==0 && year%100 != 0) || year%400==0)
		{
			return true;
		}
		else
			return false;
	}
	
	//method for validating day
	public static boolean isDayValid(int day,int month,int year)
	{
		//in this "if" checking for days having 30 days 
		if(month == 4 || month == 6 || month == 9 || month == 11)
			if(day <= 30 && day >= 1)
				return true;
			else
				return false;
		else 
			//in this "if" checking for days having 31 days
 			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
				if(day<=31 && day >=1)
					return true;
				else
					return false;
		else
			//in this "if" checking if year is leap and month is February and having 29 days
			if(isLeap(year))
				if(day <= 29 && day >=1)
					return true;
				else 
					return false;
			else
				//in this "if" checking if year is not leap and and month is February having 28 days
				if(day == 28 && day >=1)
					return true;
				else
					return false;
	}
}
