package com.capgemini.bankapp.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DbUtil
{
	private static String driverClassName = "com.mysql.jdbc.Driver";
	private static String dburl = "jdbc:mysql://localhost:3306/bankappdb";
	private static String username = "root";
	private static String password = "root";

	static Connection connection;
	static final Logger logger = Logger.getLogger(DbUtil.class);

	public static Connection getConnetion()
	{
		try
		{
			Class.forName(driverClassName);
			if (connection == null)
			{
				connection = DriverManager.getConnection(dburl, username, password);
				connection.setAutoCommit(false);
			}
		} catch (ClassNotFoundException e)
		{
			System.out.println("Driver Connection not fount");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return connection;

	}

	public static void commit()
	{
		try
		{
			if (connection != null)
				connection.commit();
		} catch (SQLException e)
		{
			logger.error("SQLException", e);
		}
	}

	public static void rollback()
	{
		try
		{
			if (connection != null)
				connection.rollback();
		} catch (SQLException e)
		{
			logger.error("SQLException", e);
		}
	}

//	static
//	{
//		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dbConfig.properties")))
//		{
//			Properties properties = new Properties();
//			properties.load(bufferedReader);
//
//			driverClassName = properties.getProperty("driverClassName");
//			dburl = properties.getProperty("dburl");
//			username = properties.getProperty("username");
//			password = properties.getProperty("password");
//		} catch (FileNotFoundException e)
//		{
//			e.printStackTrace();
//		} catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//	}

}
