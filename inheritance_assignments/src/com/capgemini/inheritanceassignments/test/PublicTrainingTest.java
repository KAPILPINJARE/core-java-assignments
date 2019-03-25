package com.capgemini.inheritanceassignments.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignments.main.PublicTraining;

class PublicTrainingTest
{
	PublicTraining pt;
	
	@BeforeEach
	public void setUp()
	{
		pt = new PublicTraining(101,"java",5000,50);
	}
	
	
	@Test
	void testPublicTrainingCheckingForFees()
	{
		assertEquals(250000, pt.getOrderValue());
	}

}
