package com.capgemini.inheritanceassignments.main;

public class Manager extends Employee
{
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	
	public Manager()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Override constructor from employee class
	public Manager(int employeeId, String employeeName, double basicSalary, double medical)
	{
		super(employeeId, employeeName, basicSalary, medical);
		// TODO Auto-generated constructor stub
	}

	//Override method from employee class
	//added new properties
	@Override
	public double grossSalary()
	{
		petrolAllowance = getBasicSalary() * 0.08;
		foodAllowance = getBasicSalary() * 0.13;
		otherAllowance = getBasicSalary() * 0.03;
		
		return (super.grossSalary() + petrolAllowance + foodAllowance + otherAllowance);
	}
	
	//Override method from employee class
	@Override
	public double netSalary()
	{
		// TODO Auto-generated method stub
		return super.netSalary();
	}
}
