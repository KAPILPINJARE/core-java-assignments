package com.capgemini.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.capgemini.exceptions.InvalidDayException;
import com.capgemini.exceptions.InvalidMonthException;
import com.capgemini.main.Date;

public class DateTest
{
	
	//checking if year is leap year
	@Test
	public void testDateIfYearIsLeap() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(12,5,1996);
		assertTrue(d.isLeap(1996));
	}
	
	//checking if year is not leap year
	@Test
	public void testDateIfYearIsNotLeap() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(12,5,1900);
		assertFalse(d.isLeap(1900));
	}
	
	//checking if month is invalid
	@Test(expected = InvalidMonthException.class)
	public void testDateIfMonthIsLessThanOne() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(12,0,1996);
	}

	//checking if month is invalid
	@Test(expected = InvalidMonthException.class)
	public void testDateIfMonthIsMoreThanTwelve() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(12,13,1996);
	}
	
	//checking if month is valid
	@Test
	public void testDateIfMonthIsValid() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(11,8,1996);
	}
	
	//checking if date is invalid 
	//if month(4,6,9,11) having 30 days try them with 31
	@Test(expected = InvalidDayException.class)
	public void testDateIfDayIsInValidIfMonthHavingThirtyDaysFirstTry() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(31,4,1996);
	}
	
	//checking if date is invalid 
	//if month(4,6,9,11) having 30 days try them with 31
	@Test(expected = InvalidDayException.class)
	public void testDateIfDayIsInValidIfMonthHavingThirtyDaysSecondTry() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(31,11,1996);
	}
	
	//check if date is valid 
	//checking with 30 days month
	@Test
	public void testDateIfDayIsValidIfMonthHavingThirtyDays() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(30,6,1996);
	}
	
	//check if date is valid 
	//checking with 31 days month
	@Test
	public void testDateIfDayIsValidIfMonthHavingThirtyOneDays() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(31,1,1996);
	}
	
	//check if date is valid 
	//checking if leap year and 29 days
	@Test
	public void testDateIfDayIsValidIfLeapYearAndDayTwentyNine() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(29,2,2000);
	}

	//check if date is invalid 
	//checking if not leap year and 29 days
	@Test(expected = InvalidDayException.class)
	public void testDateIfDayIsValidIfNotLeapYearAndDayTwentyNine() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(29,2,2001);
	}
	
	//check if date is invalid 
	//checking if leap year and 30 days
	@Test(expected = InvalidDayException.class)
	public void testDateIfDayIsInValidIfLeapYearAndDayThirty() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(30,2,2000);
	}

	//check if date is valid 
	//checking if not leap year and 28 days
	@Test
	public void testDateIfDayIsValidIfNotLeapYearAndDayTwentyEight() throws InvalidMonthException, InvalidDayException
	{
		Date d = new Date(28,2,2001);
	}
	
}
