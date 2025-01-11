package com.pack1.bank;

public class FixedDepositAccount extends BankAccount
{
    protected double interestRate = 4.0;
    private int depositTerm;  //only years

	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, double interestRate, int depositTerm) 
	{
		super(accountHolderName, accountNumber, balance);
        if(depositTerm<0) {
        	 System.out.println("Deposit term must be positive.");
             return;
		} 
		this.interestRate = interestRate;
		this.depositTerm = depositTerm;
	}
  
    //method 6
	@Override
	public void calculateInterest() 
	{
		double interest =(balance * interestRate * depositTerm)/100;  
		 System.out.println("Fixed Deposit Interest for " + depositTerm + " years RS: " + interest);
	}
	
	
}
