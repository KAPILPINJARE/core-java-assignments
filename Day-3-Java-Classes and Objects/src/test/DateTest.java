package test;

import main.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DateTest
{
	Date d1;
	Date d2;

	@Before
	public void setup()
	{
		d1 = new Date(20,10,1995);
		d2 = new Date(03,11,1996);
	}
	
	@Test
	public void testPrintingToString()
	{
		assertEquals("20/10/1995",d1.toString());
	}

	@Test
	public void testDateIsSmallerCheckWithSmallSubtractBig()
	{
		assertFalse(d1.isSmaller(d2));
	}

	@Test
	public void testDateIsSmallerCheckWithBigSubtractSmall()
	{
		assertTrue(d2.isSmaller(d1));
	}

	@Test
	public void testDateDiff()
	{
		assertEquals(66,new Date(29,07,2017).dayDiff(new Date(24,05,2017)));
	}

        @Test
	public void testCheckDateDiffCheckForDay()
	{
		int array[] = {30,1,0};
		int arr[] = new Date(12,12,2019).diff(new Date(12,11,2019));
		assertEquals(array[0],arr[0]);
	}


	@Test
	public void testCheckDateDiffCheckForMonth()
	{
		int array[] = {30,1,0};
		int arr[] = new Date(12,11,2019).diff(new Date(12,12,2019));
		assertEquals(array[1],arr[1]);
	}

	@Test
	public void testCheckDateDiffCheckForYear()
	{
		int array[] = {30,1,0};
		int arr[] = new Date(12,11,2019).diff(new Date(12,12,2019));
		assertEquals(array[2],arr[2]);
	}

	
}
