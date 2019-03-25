package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Laptop;

public class LaptopTest
{

	Laptop dell;
	Laptop lenevo;
	Laptop hp;
	
	@Before
	public void setUp() throws Exception
	{
		dell = new Laptop("DELL", "dell-1", "windows 7", "i5");
		lenevo = new Laptop("LENEVO", "b40-80", "windows 10", "i7");
		hp = new Laptop("HP", "hp-12", "ubantu", "i3");
	}

	//checking insertion order is preserved
	@Test
	public void testLaptopCheckingInsertionOrderIsPreserveInArrayList()
	{
		ArrayList<Laptop> laptops= new ArrayList<>();
		
		laptops.add(dell);
		laptops.add(lenevo);
		laptops.add(hp);
		
		Iterator<Laptop> iterator = laptops.iterator();
		
		assertEquals(dell, iterator.next());
		assertEquals(lenevo, iterator.next());
		assertEquals(hp, iterator.next());
	}
	

	//by using hash set it is showing that two values having 
	//same company and model will  be removed
	@Test
	public void testLaptopWhereCheckingForSetAgain()
	{
		HashSet<Laptop> laptops = new HashSet<Laptop>();
		laptops.add(dell);
		laptops.add(lenevo);
		laptops.add(hp);
		laptops.add(hp);
		laptops.add(dell);
		laptops.add(lenevo);
		
		assertEquals(3, laptops.size());
	}

}
