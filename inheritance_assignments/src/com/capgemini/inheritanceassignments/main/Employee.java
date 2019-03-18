package com.capgemini.inheritanceassignments.main;

public class Employee
{
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	
	//constructors
	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, double basicSalary, double medical)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	//all getter setter methods
	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public double getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary)
	{
		this.basicSalary = basicSalary;
	}

	public double getMedical()
	{
		return medical;
	}

	public void setMedical(double medical)
	{
		this.medical = medical;
	}
	
	//method to calculate gross salary
	public double grossSalary()
	{
		double hra = basicSalary * 0.50;
		return basicSalary + hra + medical;
	}
	
	//method to calculate net salary
	public double netSalary()
	{
		double pf = basicSalary * 12/100;
		double pt = 200;
		return  grossSalary() - (pf+pt);
	}
}
