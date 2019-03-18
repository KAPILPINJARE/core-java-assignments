package com.capgemini.main;

import java.util.Objects;

public class Employee
{
	private int employeeId;
	private String employeeName;
	private String employeeDept;
	private int employeeSalary;
	
	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String employeeDept, int employeeSalary)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString()
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + ", employeeSalary=" + employeeSalary + "]";
	}

	 


	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeDept == null)
		{
			if (other.employeeDept != null)
				return false;
		} else if (!employeeDept.equals(other.employeeDept))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null)
		{
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

	
	
	
	
	
	
}
