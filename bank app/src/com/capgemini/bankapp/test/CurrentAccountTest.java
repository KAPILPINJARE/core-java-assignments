package com.capgemini.bankapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.bankapp.model.CurrentAccount;

class CurrentAccountTest
{
	CurrentAccount ca;
	@BeforeEach
	void setUp() throws Exception
	{
		ca = new CurrentAccount(101, "kapil", "CURRENT", 20000);
	}
	
	//check for deposit if no borrowed amount 
	@Test
	void testCurrentAccountForDepositIfNoBorrowedAmount()
	{
		ca.setBorrowedAmount(0);
		assertEquals(70000, ca.deposit(50000));
	}

	//check for deposit if borrowed amount is equal to current balance
	@Test
	void testCurrentAccountForDepositIfBorrowedAmountIsEqualToAmount()
	{
		ca.setBorrowedAmount(5000);
		assertEquals(20000, ca.deposit(5000));
		assertEquals(0, ca.getBorrowedAmount());
	}
	
	//check for deposit if borrowed amount is greater or equal to current balance
	@Test
	void testCurrentAccountForDepositIfBorrowedAmountIsMoreThanAmount()
	{
		ca.setBorrowedAmount(7000);
		assertEquals(20000, ca.deposit(5000));
		assertEquals(2000, ca.getBorrowedAmount());
	}
	
	//check for withdraw if sufficient funds and borrowed amount is zero
	@Test
	void testCurrentAccountForWithdrawIfFundSufficient()
	{
		ca.setBorrowedAmount(0);
		assertEquals(10000, ca.withdraw(10000));
		assertEquals(0, ca.getBorrowedAmount());
	}
	
	//check for withdraw if sufficient funds and borrowed amount is zero
	@Test
	void testCurrentAccountForWithdrawIfFundNotSufficient()
	{
		ca.setBorrowedAmount(0);
		assertEquals(0, ca.withdraw(30000));
		assertEquals(10000, ca.getBorrowedAmount());
	}
	
	//check for withdraw if not sufficient funds and having sufficient borrowed amount 
	@Test
	void testCurrentAccountForWithdrawIfFundNotSufficientAndHavingSufficientBorowedAmount()
	{
		ca = new CurrentAccount(101, "kapil", "CURRENT", 0);
		ca.setBorrowedAmount(10000);
		assertEquals(0, ca.withdraw(10000));
		assertEquals(20000, ca.getBorrowedAmount());
	}

	//check for withdraw if not sufficient funds and also not having sufficient borrowed amount
	@Test
	void testCurrentAccountForWithdrawIfFundNotSufficientAndNotEnoughBorrowedAmount()
	{
		ca = new CurrentAccount(101, "kapil", "CURRENT", 10000);
		ca.setBorrowedAmount(0);
		assertEquals(10000, ca.withdraw(40000));
		assertEquals(0, ca.getBorrowedAmount());
	}
}
