package com.capgemini.bankapp.model;

public class BankAccount
{
	//all private members are the fields
	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	
	//no arg constructor
	public BankAccount() {
		super();
	}

	//arg constructor
	public BankAccount(long accountId, String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	//all getter setter classes for fields
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	//withdraw method for showing status after withdraw any amount passed
	//also checking if fund is sufficient
	public double withdraw(double amount)
	{
		if (accountBalance >= amount)
			accountBalance = accountBalance - amount;
		else
			System.out.println("you don't have sufficient fund");
		return accountBalance;
	}

	//deposit method for showing amount added 
	public double deposit(double amount) 
	{
		accountBalance = accountBalance + amount;
		return getAccountBalance();
	}
	 
	
}
