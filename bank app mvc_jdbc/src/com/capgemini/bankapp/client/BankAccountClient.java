package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.bankapp.exceptions.AccountNotFoundException;
import com.capgemini.bankapp.exceptions.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

public class BankAccountClient
{
	public static void main(String[] args) throws IOException, LowBalanceException, AccountNotFoundException
	{
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
				System.out.println("8. Delete an Account\n9. Exit");
				
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
								System.out.println("-----Insufficient Fund------");
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
							System.out.println(accountService.fundTransfer(fromAccountId, toAccountId, amount));
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
					
					case 9: System.out.println("thanks for banking with us...");
							System.exit(0);
							break;
					
					default: System.out.println("-----please select valid input-----");
							 break;
					
				}
			}
		}
		
	}
}
