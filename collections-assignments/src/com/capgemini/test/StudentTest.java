package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Student;

public class StudentTest
{
	Student kapil;
	Student tanmay;
	Student divya;

	@Before
	public void setUp()
	{
		kapil = new Student("kapil");
		tanmay = new Student("tanmay");
		divya = new Student("pratiksha");
	}

	// Checking for insertion order
	@Test
	public void testStudentByUsingIteratorInsertionOrderIsPreserved()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(kapil);
		students.add(tanmay);
		students.add(divya);

		Iterator<Student> stud = students.listIterator();

		assertEquals(kapil, stud.next());
		assertEquals(tanmay, stud.next());
		assertEquals(divya, stud.next());

	}

	@Test
	public void testStudentMappingByGetFruitsByTheirNames()
	{
		HashMap<String, String> students = new HashMap<String, String>();

		students.put("kapil", "mango");
		students.put("tanmay", "grapes");
		students.put("divya", "papaya");

		assertEquals("mango", students.get("kapil"));
		assertEquals("grapes", students.get("tanmay"));
		assertEquals("papaya", students.get("divya"));

	}

	@Test
	public void testStudentCheckingkeySetMethodReturningKey()
	{
		HashMap<String, String> students = new HashMap<String, String>();

		students.put("kapil", "mango");
		students.put("tanmay", "grapes");
		students.put("divya", "papaya");

		assertTrue(students.keySet().contains("kapil"));
		assertTrue(students.keySet().contains("tanmay"));
		assertTrue(students.keySet().contains("divya"));

		assertFalse(students.keySet().contains("mango"));
	}

	@Test
	public void testStudentCheckingkeySetMethodReturningValues()
	{
		HashMap<String, String> students = new HashMap<String, String>();

		students.put("kapil", "mango");
		students.put("tanmay", "grapes");
		students.put("divya", "papaya");

		assertTrue(students.values().contains("mango"));
		assertTrue(students.values().contains("papaya"));
		assertTrue(students.values().contains("grapes"));

		assertFalse(students.values().contains("kapil"));

	}
}
