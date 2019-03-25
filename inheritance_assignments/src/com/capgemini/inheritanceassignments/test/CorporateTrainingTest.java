package com.capgemini.inheritanceassignments.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignments.main.CorporateTraining;

class CorporateTrainingTest
{
	
	CorporateTraining ct;
	
	@BeforeEach
	void setUp() throws Exception
	{
		ct = new CorporateTraining(101, "Big Data", 35000 , 4);
	}

	@Test
	void testCorporateTrainingCheckOrderValue()
	{
		assertEquals(140000, ct.getOrderValue());
	}

}
