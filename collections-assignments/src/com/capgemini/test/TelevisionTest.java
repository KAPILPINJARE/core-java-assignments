package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Television;

public class TelevisionTest
{
	
	Television samsung;
	Television videocon;
	Television bpl;
	
	@Before
	public void setUp() 
	{
		samsung = new Television("SAMSUNG", "Plasma", true, 70000);
		videocon = new Television("Videocon", "LCD", false, 80000);
		bpl = new Television("BPL", "LCD", true, 40000);
	}
	
	//checking insertion order is preserved in arraylist
	@Test
	public void testTelevisionInsertionOrderPreservedByUsingArrayList()
	{
		ArrayList<Television> televisions = new ArrayList<Television>();
		
		televisions.add(samsung);
		televisions.add(videocon);
		televisions.add(bpl);
		
		Iterator<Television> iterator = televisions.iterator();
		
		assertEquals(samsung, iterator.next());
		assertEquals(videocon, iterator.next());
		assertEquals(bpl, iterator.next());
	}
	
	//checking set removes duplicates
	@Test
	public void testTelevisionWhenHashSetUsedRemovingDuplicateObjects()
	{
		HashSet<Television> televisions = new HashSet<Television>();
		
		televisions.add(samsung);
		televisions.add(videocon);
		televisions.add(bpl);
		televisions.add(samsung);
		televisions.add(videocon);
		televisions.add(bpl);
		televisions.add(samsung);
		televisions.add(videocon);
		televisions.add(bpl);
		
		assertEquals(3, televisions.size());
	}

}
