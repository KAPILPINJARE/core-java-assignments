package com.capgemini.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.util.DbUtil;
import com.mysql.jdbc.Statement;

public class BankAccountDaoImpl implements BankAccountDao
{

	@Override
	public double getBalance(long accountId)
	{
		String query = "SELECT ACCOUNT_BALANCE FROM BANKACCOUNTS WHERE ACCOUNT_ID = "  + accountId;
		double balance = 0;
		try(Connection connection = DbUtil.getConnetion();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery())
		{
			balance = resultSet.getDouble(1);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return balance;
	}

	@Override
	public void updateBalance(long accountId, double newBalance)
	{
		String query = "UPDATE BANKACCOUNTS SET ACCOUNT_BALANCE = ? WHERE ACCOUNT_ID = ?";
		try(Connection connection = DbUtil.getConnetion();
			PreparedStatement preparedStatement = connection.prepareStatement(query))
		{
			preparedStatement.setDouble(1, newBalance);
			preparedStatement.setLong(2, accountId);
			int result = preparedStatement.executeUpdate();
			System.out.println(result + " row updated");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public boolean deleteBankAccount(long accountId)
	{
		String query = "DELETE FROM BANKACCOUNTS WHERE ACCOUNT_ID = " + accountId;
		int result;
		try(Connection connection = DbUtil.getConnetion();
			PreparedStatement preparedStatement = connection.prepareStatement(query))
		{
			result = preparedStatement.executeUpdate();
			if(result == 1)
				return true;
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
}
