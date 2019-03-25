package com.capgemini.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class EmployeeDeserialization
{
	public Object doDeserialization(String filePath) throws IOException, ClassNotFoundException
	{
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		Object object =  inputStream.readObject(); 
		inputStream.close();
		return object;
	}
}
