package com.pack1.shoppingmall;

public class GeneralCustomer extends Customer
{

	public GeneralCustomer(String name)
	{
		super(name);
	}
     
	@Override
	public void calculateBill(double ...prices) 
	{
		super.calculateBill(prices);
	}
}
