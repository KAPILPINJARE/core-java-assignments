package com.capgemini.main;

import java.util.HashSet;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<Employee> employee = new HashSet<>();
		employee.add(new Employee(101,"Alex","HR",45000));
		employee.add(new Employee(102,"Grant","Admin",35000));
		employee.add(new Employee(103,"Adam","Development",45000));
		employee.add(new Employee(101,"Alex","HR",45000));
		employee.add(new Employee(105,"Bob","Accounts",35000));
		
		System.out.println(employee.size());
		
	}
}
