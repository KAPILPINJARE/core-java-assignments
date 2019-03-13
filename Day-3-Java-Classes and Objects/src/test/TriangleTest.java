package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle;

public class TriangleTest
{
	@Test
	public void testIsRightWithTrueValue()
	{
		Triangle t1 = new Triangle();
		assertTrue(t1.isRight(5,4,3));	
	}	
	
	@Test
	public void testIsRightWithWrongValue()
	{
		Triangle t1 = new Triangle();
		assertFalse(t1.isRight(6,4,3));	
	}
	
	@Test
	public void testIsScaleneWithTrueValue()
	{
		Triangle t1 = new Triangle();
		assertFalse(t1.isScalene(4,4,3));	
	}	
	
	@Test
	public void testIsScaleneWithWrongValue()
	{
		Triangle t1 = new Triangle();
		assertTrue(t1.isScalene(6,4,3));	
	}

	@Test
	public void testIsIsoscelesWithTrueValue()
	{
		Triangle t1 = new Triangle();
		assertTrue(t1.isIsosceles(4,4,3));	
	}	
	
	@Test
	public void testIsIsoscelesWithWrongValue()
	{
		Triangle t1 = new Triangle();
		assertFalse(t1.isIsosceles(6,4,3));	
	}

	@Test
	public void testIsEquilateralWithTrueValue()
	{
		Triangle t1 = new Triangle();
		assertTrue(t1.isEquilateral(4,4,4));	
	}	
	
	@Test
	public void testIsEquilateralWithWrongValue()
	{
		Triangle t1 = new Triangle();
		assertFalse(t1.isEquilateral(6,4,3));	
	}
}