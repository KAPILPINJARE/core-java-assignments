package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.CellPhone;

public class CellPhoneTest
{
	
	CellPhone motoG;
	CellPhone redmiNote4;
	CellPhone iPhoneX;
	@Before
	public void setUp()
	{
		motoG = new CellPhone("moto", "motoG","abc", "android", 7000);
		redmiNote4 = new CellPhone("redmi", "note-4", "abc", "android", 14000);
		iPhoneX = new CellPhone("apple", "x", "abc", "ios", 70000);
	}
	
	//checking order is preserving in array list
	//using iterator
	@Test
	public void testCellPhonePreservingOrderByUsingArrayListAndIterator()
	{
		ArrayList<CellPhone> cellPhones = new ArrayList<CellPhone>();
		
		cellPhones.add(motoG);
		cellPhones.add(redmiNote4);
		cellPhones.add(iPhoneX);
		
		Iterator<CellPhone> iterator = cellPhones.iterator();
		
		assertEquals(motoG, iterator.next());
		assertEquals(redmiNote4, iterator.next());
		assertEquals(iPhoneX, iterator.next());
	}
	
	
	//checking duplicate values are not accepted by hashset
	@Test
	public void testCellPhoneByUsingHashSet()
	{
		HashSet<CellPhone> cellphones = new HashSet<CellPhone>();
		cellphones.add(motoG);
		cellphones.add(redmiNote4);
		cellphones.add(iPhoneX);
		cellphones.add(motoG);
		cellphones.add(redmiNote4);
		cellphones.add(iPhoneX);
		cellphones.add(motoG);
		cellphones.add(redmiNote4);
		cellphones.add(iPhoneX);
		
		assertEquals(3, cellphones.size());
	}

}
