package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Car;

public class CarTest 
{
	
	Car lamborgini;
	Car ferrari;
	Car bmw;
	
	@Before
	public void setUp()
	{
		lamborgini = new Car("India","Lamborgini",2017,800000);
		ferrari = new Car("NY","Ferrari",2012,770000);
		bmw = new Car("Germany","BMW",2017,990000);
	}
	
	//this is to taste hash set properties of not adding duplicate objects
	@Test
	public void testCarHavingDuplicateObjects()
	{
		HashSet<Car> cars = new HashSet<Car>();
		cars.add(lamborgini);
		cars.add(ferrari);
		cars.add(lamborgini);
		cars.add(bmw);
		cars.add(ferrari);
		
		assertEquals(3, cars.size());
	}

	
	//checking first and last object of car class 
	//in ascending order
	@Test
	public void testCarBySortingMakeByUsingCompare()
	{
		TreeSet<Car> cars = new TreeSet<Car>();
		
		cars.add(lamborgini);
		cars.add(ferrari);
		cars.add(bmw);

		Iterator<Car> iterator = cars.iterator();
		
		assertEquals(bmw, iterator.next());
		assertEquals(lamborgini, iterator.next());
		assertEquals(ferrari, iterator.next());
		
	}
}
