package com.capgemini.bankapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.SavingAccount;

class SavingAccountTest
{
	//back account references
	BankAccount account1;
	BankAccount account2;
	@BeforeEach
	void setUp() throws Exception
	{
		//using references of parent class bank account objects of saving account i.e. child class created
		
		//this object shows salary Account is true
		account1 = new SavingAccount(101,"kapil","SAVING",5000,true);
		
		//this object shows salary Account is false
		account2 = new SavingAccount(101,"kapil","SAVING",5000,false);
	}

	@Test
	void testSavingAccountDeposite()
	{
		assertEquals(5500, account1.deposit(500));
	}

	@Test
	void testSavingAccountIfSalaryAccountAndFundIsSufficient()
	{
		assertEquals(500, account1.withdraw(4500));
	}
	
	@Test
	void testSavingAccountIfSalaryAccountAndFundIsNotSufficient()
	{
		assertEquals(5000, account1.withdraw(5500),0.01);
	}
	
	//using account2 object bcoz passing false for salary account
	@Test
	void testSavingAccountIfNotSalaryAccountAndFundIsSufficient()
	{
		assertEquals(4500, account2.withdraw(500));
	}
	
	@Test
	void testSavingAccountIfNotSalaryAccountAndFundIsNotSufficient()
	{
		assertEquals(5000, account2.withdraw(5500));
	}
}
