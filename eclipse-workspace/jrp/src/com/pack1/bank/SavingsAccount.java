package com.pack1.bank;

public class SavingsAccount extends BankAccount
{
     protected double intrestRate = 4.0;


	public SavingsAccount(String accountHolderName, String accountNumber, double balance, double intrestRate)  
	{
		super(accountHolderName, accountNumber, balance);
		this.intrestRate = intrestRate;
	}

	//method 3
	@Override
	public void calculateInterest() 
	{
		double interest =(balance * intrestRate )/100;  
		System.out.println("interest of savings Account :"+interest);
	}
     

}
