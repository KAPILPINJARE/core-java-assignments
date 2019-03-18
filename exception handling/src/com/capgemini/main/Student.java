package com.capgemini.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exceptions.AgeNotWithinRangeException;
import com.capgemini.exceptions.NameNotValidException;

public class Student
{
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	public Student()
	{
		super();
	}

	//invalidating age and name by throwing custom exceptions
	public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException
	{
		super();
		this.rollNo = rollNo;
		this.course = course;
		
		if(age<=21 && age>=15)
			this.age = age;
		else
			throw new AgeNotWithinRangeException("age should be between 15 and 21");
		
		if (!validateName(name))
			this.name = name;
		else
			throw new NameNotValidException("name should not contains any numbers or symbols");
	}
	
	//using regular expression to validate name
	public static boolean validateName(String name)
	{
		String regx = "[^a-zA-Z]+\\.?";
		Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(name);
		return matcher.find();
	}
	
}
