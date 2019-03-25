package com.capgemini.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.MyClass;
import com.capgemini.main.MyClassSerializationDeserialization;

public class MyClassTest
{
	
	MyClass physics;
	MyClass chemistry;
	MyClass maths;
	MyClass hindi;
	MyClass english;
	ArrayList<MyClass> arrayList = new ArrayList<MyClass>();
	MyClassSerializationDeserialization  myClassSerDeser;
	
	@Before
	public void setUp() throws Exception
	{
		physics = new MyClass("physics");
		chemistry = new MyClass("chemistry");
		maths = new MyClass("maths");
		hindi = new MyClass("hindi");
		english = new MyClass("english");
		myClassSerDeser = new MyClassSerializationDeserialization();
	}

	@Test
	public void testMyClassDoSerialization() throws IOException
	{
		arrayList.add(physics);
		arrayList.add(chemistry);
		arrayList.add(maths);
		arrayList.add(hindi);
		arrayList.add(english);
		
		myClassSerDeser.doSerialization(arrayList, "myClass.ser");
		File file = new File("myClass.ser");
		assertTrue(file.exists());
	}
	
	@Test
	public void testMyClassDoDeSerialization() throws IOException, ClassNotFoundException
	{
		ArrayList<MyClass> list = new ArrayList<MyClass>();
		list.add(physics);
		list.add(chemistry);
		list.add(maths);
		list.add(hindi);
		list.add(english);
		
		assertTrue(list.equals(myClassSerDeser.doDeserialization("myClass.ser")));	
	}
}
