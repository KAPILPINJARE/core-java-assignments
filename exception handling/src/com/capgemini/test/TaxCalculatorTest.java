package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptions.CountryNotValidException;
import com.capgemini.exceptions.EmployeeNameInvalidException;
import com.capgemini.exceptions.TaxNotEligibleException;
import com.capgemini.main.TaxCalculator;

public class TaxCalculatorTest
{
	
	//check if name is invalid 
	//if name is empty
	@Test(expected = EmployeeNameInvalidException.class)
	public void testTaxCalculatorWhenNameIsEmpty() throws CountryNotValidException, EmployeeNameInvalidException
	{	
		TaxCalculator tc = new TaxCalculator( "",true,20000);
	}

	//check if name is invalid 
	//if name is  null or empty
	@Test(expected = EmployeeNameInvalidException.class)
	public void testTaxCalculatorWhenNameIsNull() throws CountryNotValidException, EmployeeNameInvalidException
	{	
		TaxCalculator tc = new TaxCalculator( null,true,20000);
	}
	
	//check if name is valid 
	//if name is  not null or empty
	@Test
	public void testTaxCalculatorWhenNameIsValid() throws CountryNotValidException, EmployeeNameInvalidException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",true,20000);
	}	
	
	//check if country is not India 
	@Test(expected = CountryNotValidException.class)
	public void testTaxCalculatorWhenIsNotIndian() throws CountryNotValidException, EmployeeNameInvalidException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",false,20000);
	}
		
	//check if Country is India is valid 
	@Test
	public void testTaxCalculatorWhenCountryIsIndia() throws CountryNotValidException, EmployeeNameInvalidException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",true,20000);
	}	
	
	//check for tax if emp salary is more than 100000 
	@Test
	public void testTaxCalculatorWhenSalaryIsMoreThanOneLakh() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",true,200000);
		assertEquals(16000, tc.calculateTax(),0.01);
	}
	
	//check for tax if emp salary is between 50000 and 100000 
	@Test
		public void testTaxCalculatorWhenSalaryIsBetweenOneLakhAndFiftyThousand() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
		{	
			TaxCalculator tc = new TaxCalculator( "kapil",true,70000);
			assertEquals(4200, tc.calculateTax(),0.01);
		}
	
	//check for tax if emp salary is between 50000 and 30000 
	@Test
	public void testTaxCalculatorWhenSalaryIsBetweenFiftyThousandAndThirtyThousand() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",true,40000);
		assertEquals(2000, tc.calculateTax(),0.01);
	}
	
	//check for tax if emp salary is between 30000 and 10000 
	@Test
	public void testTaxCalculatorWhenSalaryIsBetweenThirtyThousandAndTenThousand() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",true,20000);
		assertEquals(800, tc.calculateTax(),0.01);
	}
	
	//check for errors 
	//when emp salary is less than 10000 
	@Test(expected = TaxNotEligibleException.class)
	public void testTaxCalculatorWhenSalaryIsLessThanTenThousand() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{	
		TaxCalculator tc = new TaxCalculator( "kapil",true,8000);
		tc.calculateTax();
	}
}
