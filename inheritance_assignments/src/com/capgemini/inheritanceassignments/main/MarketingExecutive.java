package com.capgemini.inheritanceassignments.main;

public class MarketingExecutive extends Employee
{
	private int kilometerTravelled;
	private int tourAllowance;
	private int telephoneAllowance;
	public MarketingExecutive()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,int kilometerTravelled)
	{
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometerTravelled = kilometerTravelled;
	}
	
	@Override
	public double grossSalary()
	{
		tourAllowance = kilometerTravelled * 5;
		telephoneAllowance = 1500;
		return super.grossSalary() + tourAllowance + telephoneAllowance;
	}
	
	@Override
	public double netSalary()
	{
		// TODO Auto-generated method stub
		return super.netSalary();
	}
}
