package com.capgemini.bankapp.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil
{
	private static String dburl;
	private static String username;
	private static String password;

	public static Connection getConnetion()
	{
		Connection connection = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(dburl, username, password);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Driver Connection not fount");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return connection;

	}

	static
	{
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dbConfig.properties")))
		{
			Properties properties = new Properties();
			properties.load(bufferedReader);

			dburl = properties.getProperty("dburl");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
