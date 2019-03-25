package com.capgemini.bankapp.model;

public class BankAccount
{
	private long accountId;
	private String acccoutHolderName;
	private String accountType;
	private double accountBalance;
	
	public BankAccount()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String acccoutHolderName, String accountType, double accountBalance)
	{
		super();
		this.acccoutHolderName = acccoutHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public long getAccountId()
	{
		return accountId;
	}

	public void setAccountId(long accountId)
	{
		this.accountId = accountId;
	}

	public String getAcccoutHolderName()
	{
		return acccoutHolderName;
	}

	public void setAcccoutHolderName(String acccoutHolderName)
	{
		this.acccoutHolderName = acccoutHolderName;
	}

	public String getAccountType()
	{
		return accountType;
	}

	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}

	public double getAccountBalance()
	{
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString()
	{
		return "BankAccount [accountId=" + accountId + ", acccoutHolderName=" + acccoutHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + "]";
	}
	
	
}
