package com.capgemini.inheritanceassignments.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignments.main.MarketingExecutive;

class MarketingExecutiveTest
{
	MarketingExecutive me1;
	@BeforeEach
	void setUp() throws Exception
	{
		me1 = new MarketingExecutive(101,"kapil",40000,2000,100);
	}

	@Test
	void testMarketingExecutiveGrossSalary()
	{
		assertEquals(64000, me1.grossSalary());
	}

	@Test
	void testMarketingExecutiveNetSalary()
	{
		assertEquals(59000, me1.netSalary());
	}
}
