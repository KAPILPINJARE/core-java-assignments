package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.School;

public class SchoolTest
{	
	School lfs;
	School rd;
	School des;
	@Before
	public void setUp()
	{
		lfs = new School("lfs", "betul", "betul", 'A');
		rd = new School("rd", "mumbai", "bandra", 'B');
		des = new School("des", "satara", "satara", 'C');
	}
	
	//Checking for insertion order
	@Test
	public void testSchoolByUsingIteratorInsertionOrderIsPreserved()
	{
		ArrayList<School> schools = new ArrayList<School>();
		schools.add(lfs);
		schools.add(rd);
		schools.add(des);
		
		Iterator<School> iterator = schools.listIterator();
		
		assertEquals(lfs,iterator.next());
		assertEquals(rd, iterator.next());
		assertEquals(des, iterator.next());
		
	}
	
	//check for duplicate values
	@Test
	public void testSchoolDuplicateRemoveUsingHashCode()
	{
		HashSet<School> schools = new HashSet<School>();
		schools.add(lfs);
		schools.add(rd);
		schools.add(des);
		schools.add(lfs);
		schools.add(rd);
		schools.add(des);
		schools.add(lfs);
		schools.add(rd);
		schools.add(des);
		
		assertEquals(3, schools.size());
	}
}
