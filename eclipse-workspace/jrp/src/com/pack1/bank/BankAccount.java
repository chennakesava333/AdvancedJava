package com.pack1.bank;

public class BankAccount 
{
   protected String accountHolderName;
   protected String accountNumber;
   protected double balance;
   public static final String IFSC_CODE ="SBIHYD09876";
   
   
   public BankAccount(String accountHolderName, String accountNumber, double balance)  
   {
		super();
		if(accountHolderName == null || accountHolderName.isEmpty()) 
		{
			System.err.println("Account Holder Name cannot be Empyt.");
			return;
		}
		
		if(accountNumber == null || accountNumber.isEmpty()) 
		{
			System.err.println("Account Number cannot be Empyt.");
			return;
		}
		
		if(balance<0) 
		{
			System.err.println("Balance cannot be negitive.");
			return;
		}
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
   
     
   public void calculateInterest() 
   {
	 System.out.println("generic interest calcuiation for all bank accounts.");  
   }
   
   //method 2
   
   public void displayAccountDetails() 
   {
	   System.out.println("Account Holder: " + accountHolderName);
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Balance RS: " + balance);
       System.out.println("IFSC CODE: " + IFSC_CODE);
   }
   
      
}
