package com.pack1.bank;

public class CurrentAccount extends BankAccount
{
    protected double overDraftLimit = 5000.0;
    

	public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overDraftLimit) 
	{
		super(accountHolderName, accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}
  
    //method 4
	@Override
	public void calculateInterest() 
	{
		System.out.println("Current accounts do not earn interest");
	}
	
	//method 5 
	public void checkOverDraftLimit() 
	{
		System.out.println("overDraftLimit :"+overDraftLimit);
	}
}
