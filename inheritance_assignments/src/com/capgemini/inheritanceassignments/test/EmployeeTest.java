package com.capgemini.inheritanceassignments.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignments.main.Employee;

class EmployeeTest {

	Employee e1;
	@BeforeEach
	public void setUp() throws Exception 
	{
		e1 = new Employee(101,"kapil",40000,2000);
	}

	@Test
	public void testEmployeeNoArgConstructor()
	{
		Employee e1 = new Employee();
	}
	
	@Test
	public void testEmployeeWithArgConstructor()
	{
		Employee e1 = new Employee(101,"kapil",40000,2000);
	}
	
	@Test
	public void testEmployeeGrossSalary()
	{
		assertEquals(62000,e1.grossSalary());
	}
	
	@Test
	public void testEmployeeNetSalary()
	{
		assertEquals(57000,e1.netSalary());
	}
}
