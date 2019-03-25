package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient
{
	public static void main(String[] args)
	{

		Comparator<Employee> c = (o1,o2) -> o2.getEmployeeId() -  o1.getEmployeeId();		
		
		TreeSet<Employee> employees = new TreeSet<>(c);
		
 
		employees.add(new Employee(101, "Alex", "HR", 14000.0));
		employees.add(new Employee(56, "Grant", "Admin", 12000.0));
		employees.add(new Employee(88, "Bob", "Admin", 56000.0));
		employees.add(new Employee(12, "Taylor", "HR", 12000.0));

		for (Employee employee : employees)
		{
			System.out.println(employee);
		}
	}
}
