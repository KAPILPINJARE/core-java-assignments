package com.capgemini.bankapp.service.impl;

import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.exceptions.AccountNotFoundException;
import com.capgemini.bankapp.exceptions.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService
{
	private BankAccountDao bankAccountDao;

	public BankAccountServiceImpl()
	{
		bankAccountDao = new BankAccountDaoImpl();
	}

	@Override
	public double checkBalance(long accountId)
	{
		return bankAccountDao.getBalance(accountId);
	}

	@Override
	public double withdraw(long accountId, double amount) throws LowBalanceException, AccountNotFoundException
	{
		double balance = bankAccountDao.getBalance(accountId);
		if (balance - amount >= 0)
		{
			balance = balance - amount;
			if (bankAccountDao.updateBalance(accountId, balance) == 0)
				throw new AccountNotFoundException("account not found");
			else
				return balance;
		} else
			throw new LowBalanceException("account balance not sufficient..");
	}

	@Override
	public double deposit(long accountId, double amount) throws AccountNotFoundException
	{
		double balance = bankAccountDao.getBalance(accountId);
		balance = balance + amount;
		if (bankAccountDao.updateBalance(accountId, balance) == 0)
			throw new AccountNotFoundException("account not found");
		else
			return balance;
	}

	@Override
	public boolean deleteBankAccount(long accountId)
	{
		return bankAccountDao.deleteBankAccount(accountId);
	}

	@Override
	public double fundTransfer(long fromAccount, long toAccount, double amount)
			throws LowBalanceException, AccountNotFoundException
	{
		double balance = withdraw(fromAccount, amount);
		deposit(toAccount, amount);
		return balance;
	}

	@Override
	public boolean addNewBankAccount(BankAccount account)
	{
		return bankAccountDao.addNewBankAccount(account);
	}

	@Override
	public List<BankAccount> findAllBankAccount()
	{
		return bankAccountDao.findAllBankAccounts();
	}

	@Override
	public BankAccount searchForAccount(long accountId)
	{
		return (BankAccount) bankAccountDao.searchForAccount(accountId);
	}

	@Override
	public boolean updateAccount(long accountId, String newName, String newAccountType)
	{
		return bankAccountDao.updateAccount(accountId, newName, newAccountType);
	}

}
