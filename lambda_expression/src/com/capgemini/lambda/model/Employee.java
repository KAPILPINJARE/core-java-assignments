package com.capgemini.lambda.model;

import java.util.Objects;

public class Employee
{
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private Double employeeSalary;
	
	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String employeeDepartment, Double employeeSalary)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}

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

	public String getEmployeeDepartment()
	{
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment)
	{
		this.employeeDepartment = employeeDepartment;
	}

	public Double getEmployeeSalary()
	{
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary)
	{
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(employeeId,employeeName);
		
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		if(this==o)
			return true;
		else if(!(this instanceof Employee))
			return false;
		Employee emp = (Employee) o;
		if(emp.employeeId == this.employeeId && emp.employeeName == this.employeeName)
			return true;
		else
			return false; 
	}

	@Override
	public String toString()
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeSalary=" + employeeSalary + "]";	
	}
	
	
}
