package com.capgemini.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("kapil");
		list.add("Alex");
		list.add("Adam");
		list.add("Bob");
		
//		for (Object object : list)
//		{
//			System.out.println(object);
//		}
	
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String obj = it.next();
			System.out.println(obj);
					
		}
	}
}
