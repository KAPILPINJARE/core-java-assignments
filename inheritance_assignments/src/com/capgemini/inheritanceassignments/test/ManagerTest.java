package com.capgemini.inheritanceassignments.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignments.main.Manager;

class ManagerTest
{

	Manager m1;
	@BeforeEach
	void setUp() throws Exception
	{
		m1 = new Manager(101,"kapil",40000,2000);
	}

	@Test
	void testManagerGrossSalary()
	{
		assertEquals(71600.0, m1.grossSalary(),0.01);
	}

	@Test
	void testManagerNetSalary()
	{
		assertEquals(66600, m1.netSalary());
	}
}
