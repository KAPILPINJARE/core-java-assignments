package com.capgemini.files.client;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo
{

	public static void main(String[] args) throws IOException
	{		
		
		//File file = new File("test.txt"); 
		/*
		 * 
		 * //FileWriter writer = new FileWriter(file);
		 * //BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		 * PrintWriter writer = new PrintWriter(new FileWriter(file, true));
		 * writer.println("hello.."); writer.println("how are you..");
		 * writer.println("bye..");
		 * 
		 * writer.close(); 
		 *System.out.println("Content has been written successfully...");
		 */
		
		
		
		/*
		 * FileReader reader = new FileReader(file); BufferedReader bReader = new
		 * BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("BankAccount.java"); String s ;
		 * while((s= bReader.readLine()) != null) { writer.println(s); }
		 * System.out.println("success"); writer.close(); bReader.close();
		 * reader.close();
		 */
		
		/*
		 * File windowDirectory = new File("C:\\windows");
		 * System.out.println(windowDirectory.isDirectory()); String[] content =
		 * windowDirectory.list(); for (String string : content) {
		 * System.out.println(string); }
		 */
		
		File newDir = new File("myDir");
		if (! newDir.exists())
		{
			newDir.createNewFile();
			System.out.println("folder is successfully created");
		}
		
		File file = new File(newDir, "hello1.txt");
		if (! file.exists())
		{
			file.createNewFile();
			System.out.println("new file created");
		}
		
	}
}
