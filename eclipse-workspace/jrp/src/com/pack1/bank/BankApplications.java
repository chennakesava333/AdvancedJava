package com.pack1.bank;

import java.util.Scanner;

public class BankApplications {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select Account Type :");
		System.out.println("1.Savings Account \n2.Current Account \n3.Fixed Deposit Account");
		System.out.println("Please enter the type of account you want to open : [1/2/3]");
		int accountType=Integer.parseInt(sc.nextLine());
		
		System.out.println("enter accountHolderName :");
		String holderName =sc.nextLine();
		
		System.out.println("enter accountNumber :");
		String accountNumber=sc.nextLine();
		
		 System.out.print("Enter the Amount : ");
	        double balance = sc.nextDouble();

	        BankAccount account = null;
          
	        switch(accountType) 
	        {
	        case 1:
	        	account = new SavingsAccount(holderName, accountNumber, balance, balance);
	        	break;
	        case 2:
	        	account =new CurrentAccount(holderName, accountNumber, balance, balance);
	        	break;
	        case 3:
	        	System.out.print("Enter the deposit term [For How many years you want to deposit] : ");
                int depositTerm = sc.nextInt();
                account = new FixedDepositAccount(holderName, accountNumber, balance, depositTerm, depositTerm);
	        	break;
	        	default:
	        		 System.out.println("Invalid account type!");
	        		 break;
	        }
	        
	        if (account != null) 
	        {
	            account.displayAccountDetails();
	            account.calculateInterest();
	        }
	         
	        // For current account, show overdraft limit
            if (account instanceof CurrentAccount) 
            {
                ((CurrentAccount) account).checkOverDraftLimit();
            }

	}

}
