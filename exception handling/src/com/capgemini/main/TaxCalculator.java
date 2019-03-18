package com.capgemini.main;

import com.capgemini.exceptions.CountryNotValidException;
import com.capgemini.exceptions.EmployeeNameInvalidException;
import com.capgemini.exceptions.TaxNotEligibleException;

public class TaxCalculator
{
	private String empName;
	private boolean isIndian;
	private int empSal;
	
	public TaxCalculator()
	{
		super();
	}

	//constructor checking for valid name and valid country
	public TaxCalculator(String empName, boolean isIndian, int empSal) 
			throws CountryNotValidException, EmployeeNameInvalidException
	{
		super();
	
		if(empName != "" && empName != null)
			this.empName = empName;
		else
			throw new EmployeeNameInvalidException("name should not be null or empty");
		
		if (isIndian)
			this.isIndian = isIndian;
		else
			throw new  CountryNotValidException("employee should be indian");
		
		this.empSal = empSal;
	}

	//method for tax calculation
	public double calculateTax() throws TaxNotEligibleException
	{
		if(empSal >= 100000 && isIndian)
			return empSal * 0.08;
		else if(empSal < 100000 &&  empSal > 50000 && isIndian)
			return empSal * 0.06;
		else if(empSal < 50000 &&  empSal > 30000 && isIndian)
			return empSal * 0.05;
		else if(empSal < 30000 &&  empSal > 10000 && isIndian)
			return empSal * 0.04;
		else
			throw new TaxNotEligibleException("not eligible for tax");
	}
}
