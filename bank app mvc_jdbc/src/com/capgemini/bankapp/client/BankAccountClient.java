package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;

import com.capgemini.bankapp.exceptions.AccountNotFoundException;
import com.capgemini.bankapp.exceptions.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

public class BankAccountClient
{
	static final Logger logger = Logger.getLogger(BankAccountClient.class);//we can give fully qualified class name as string or class name
	
	public static void main(String[] args) throws LowBalanceException, AccountNotFoundException , Exception
	{
		//this is programmatic configuration of logger we have to do this each time for each class 
		//so that we use declarative configuration 
//		logger.setLevel(Level.DEBUG);
//		logger.addAppender(new RollingFileAppender());
	
		int choice;
		long accountId;
		String accountHolderName;
		String accountType;
		double accountBalance;
		double amount;
		long fromAccountId;
		long toAccountId;
		
		BankAccountService accountService = new BankAccountServiceImpl();
		
		System.out.println("\tMy Bank App");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
		{
			while (true)
			{
				System.out.println("\n1. Create New Account\n2. Check Balance\n3. Withdraw\n4. Deposit");
				System.out.println("5. Fund Transfer\n6. Display All Accounts\n7. Search For an Account");
				System.out.println("8. Delete an Account\n9. Update an Account\n10. Exit");
				
				System.out.println("please enter your choice... ");
				choice = Integer.parseInt(reader.readLine());
				
				switch (choice)
				{
					case 1: System.out.println("enter account holder name");
							accountHolderName = reader.readLine();
							System.out.println("enter account type");
							accountType = reader.readLine();
							System.out.println("enter account balance");
							accountBalance = Double.parseDouble(reader.readLine());
							BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);
							if(accountService.addNewBankAccount(account))
								System.out.println("account created successfully...");
							else
								System.out.println("failed to create account..");
							break;
						
					case 2:	System.out.println("enter account id");
							accountId = Long.parseLong(reader.readLine());
							System.out.println(accountService.checkBalance(accountId));
							break;
					
					case 3: System.out.println("enter account id");
					 		accountId = Long.parseLong(reader.readLine());
					 		System.out.println("enter amount");
					 		amount = Double.parseDouble(reader.readLine());
					 		try
							{
					 			System.out.println("Balance after withdraw " + accountService.withdraw(accountId, amount));
							} catch (LowBalanceException e)
							{
								//System.out.println("-----Insufficient Fund------");
								logger.error("withdraw failed: ", e);
							}
					 		break;
					
					case 4: System.out.println("enter account id");
							accountId = Integer.parseInt(reader.readLine());
							System.out.println("enter amount");
							amount = Integer.parseInt(reader.readLine());
							try
							{
								System.out.println("Amount after deposit " + accountService.deposit(accountId, amount));
							} catch (AccountNotFoundException e)
							{
								System.out.println("----account not found-----");
							}
							break;
							
					case 5: System.out.println("senders account id");
							fromAccountId = Long.parseLong(reader.readLine());
							System.out.println("receivers account id");
							toAccountId = Long.parseLong(reader.readLine());
							System.out.println("enter amount");
							amount = Double.parseDouble(reader.readLine());
							try
							{
								System.out.println(accountService.fundTransfer(fromAccountId, toAccountId, amount));
							} catch (AccountNotFoundException | LowBalanceException e)
							{
								System.out.println("account not exists..");
							}
							break;
							
					case 6: for(BankAccount accounts : accountService.findAllBankAccount())
							{
								System.out.println(accounts);
							}
							break;
					
					case 7: System.out.println("enter account id to be searched");
					 		accountId = Long.parseLong(reader.readLine());
					 		if(accountService.searchForAccount(accountId) == null)
					 			System.out.println("no accounts present for this account id");
					 		else
					 			System.out.println(accountService.searchForAccount(accountId));
					 		break;
					
					case 8: System.out.println("enter account id to be deleted");
							accountId = Long.parseLong(reader.readLine());
							if(accountService.deleteBankAccount(accountId))
								System.out.println("Account deleted successfully..");
							else
								System.out.println("failed to delete the account");
							break;
					
					case 9:	System.out.println("enter account id");
					 		accountId = Long.parseLong(reader.readLine());
					 		BankAccount account2 = null;
					 		try
					 		{
					 			account2 = accountService.searchForAccount(accountId);
					 			System.out.println("enter new Account Holder Name");
						 		account2.setAcccoutHolderName(reader.readLine());
						 		System.out.println("enter new Account Type");
						 		account2.setAccountType(reader.readLine());
						 		if(accountService.updateAccount(account2))
						 			System.out.println("Account update successfully");
						 		else
						 			System.out.println("Failed to update account");
					 		}
					 		catch(AccountNotFoundException e)
					 		{
					 			System.out.println("account doesot exists");
					 		}
					 		
					 		break;
					 		
					case 10: System.out.println("thanks for banking with us...");
							System.exit(0);
							break;
					
					default: System.out.println("-----please select valid input-----");
							 break;
					
				}
			}
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			logger.error("Exception  :", e);
		}
	}
}
