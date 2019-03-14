package com.capgemini.bankapp.model;

public class CurrentAccount extends BankAccount
{
	private int borrowedAmount;
	private int minimumBorrowAmount;
	
	public CurrentAccount()
	{
		super();
	}
	
	public CurrentAccount(long accountId, String accountHolderName, String accountType, double accountBalance)
	{
		super(accountId, accountHolderName, accountType, accountBalance);
	}
	
	
}
