package com.capgemini.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyClassSerializationDeserialization implements Serializable
{
	public void doSerialization(Object obj,String filePath) throws IOException
	{
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(obj);
		objectOutputStream.close();
	}
	
	public Object doDeserialization(String filePath) throws IOException, ClassNotFoundException
	{
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		Object obj = inputStream.readObject();
		return obj;
	}
}
