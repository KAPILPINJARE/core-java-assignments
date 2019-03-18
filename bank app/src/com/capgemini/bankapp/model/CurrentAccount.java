package com.capgemini.bankapp.model;

public class CurrentAccount extends BankAccount
{
	private int borrowedAmount;
	private static final int MIN_BORROW_AMOUNT = 20000;
	
	
	public CurrentAccount()
	{
		super();
	}
	
	public CurrentAccount(long accountId, String accountHolderName, String accountType, double accountBalance)
	{
		super(accountId, accountHolderName, accountType, accountBalance);
	}
	
	
	
	public int getBorrowedAmount()
	{
		return borrowedAmount;
	}

	public void setBorrowedAmount(int borrowedAmount)
	{
		this.borrowedAmount = borrowedAmount;
	}

	//Override deposit method from BankAccount class
	//added new features
	@Override
	public double deposit(double amount)
	{
		if(borrowedAmount >= amount)
		{
			borrowedAmount -= amount;
			return getAccountBalance();
		}
		else if(borrowedAmount < amount && borrowedAmount > 0)
		{
			setAccountBalance(amount - borrowedAmount);
			return getAccountBalance();
		}
		else
			return super.deposit(amount);
	}
	
	
	@Override
	public double withdraw(double amount)
	{
		return super.withdraw(amount);
	}
	
}

