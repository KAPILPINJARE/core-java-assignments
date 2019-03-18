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
	void testCurrentAccountIfNoBorrowedAmount()
	{
		ca.setBorrowedAmount(0);
		assertEquals(70000, ca.deposit(50000));
	}

	//check for deposit if borrowed amount is equal to current balance
	@Test
	void testCurrentAccountIfBorrowedAmountIsEqualToAmount()
	{
		ca.setBorrowedAmount(5000);
		assertEquals(20000, ca.deposit(5000));
		assertEquals(0, ca.getBorrowedAmount());
	}
	
	//check for deposit if borrowed amount is greater or equal to current balance
	@Test
	void testCurrentAccountIfBorrowedAmountIsMoreThanAmount()
	{
		ca.setBorrowedAmount(7000);
		assertEquals(20000, ca.deposit(5000));
		assertEquals(2000, ca.getBorrowedAmount());
	}
	
	
}
