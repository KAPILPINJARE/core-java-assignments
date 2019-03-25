package com.capgemini.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Employee;
import com.capgemini.main.EmployeeDeserialization;
import com.capgemini.main.EmployeeSerialization;

public class EmployeeTest
{
	

	@Test
	public void testForSerialization() throws IOException
	{
		Employee employee = new Employee(101, "kapil", 20000);
		
		EmployeeSerialization employeeSerialization = new EmployeeSerialization();
		employeeSerialization.doSerialization(employee, "employee.ser");
		File file = new File("employee.ser");
		assertTrue(file.exists());
	}

	@Test
	public void testForDeSerialization() throws IOException, ClassNotFoundException
	{
		EmployeeDeserialization deserialization = new EmployeeDeserialization();		
		Employee employee1 = new Employee(101, "kapil", 20000);
		assertTrue(employee1.equals(deserialization.doDeserialization("employee.ser")));
	}
}
