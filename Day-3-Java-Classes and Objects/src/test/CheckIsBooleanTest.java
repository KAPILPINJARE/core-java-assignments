package test;

import static main.CheckIsBoolean.isOdd;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckIsBooleanTest
{
	@Test
	public void testCheckIfOdd()
	{
		assertTrue(isOdd(1)); 	
	}

	@Test
	public void testCheckIfeEven()
	{
		assertFalse(isOdd(2));
	}

	@Test
	public void testCheckIfZero()
	{
		assertFalse(isOdd(0)); 	
	}

	@Test
	public void testCheckIfNegativeOdd()
	{
		assertFalse(isOdd(-1));
	}	

	@Test
	public void testCheckIfNegativeEven()
	{
		assertFalse(isOdd(-2));
	}	
}