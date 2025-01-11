package com.chenna.creditcard;

public class Customer 
{
   private String customerName;
   private int creditPoints;
   
   public Customer(String customerName, int creditPoints) 
   {
		super();
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}
   
   public int getCreditPoints() 
   {
	   return creditPoints;
   }
   
   @Override
   public String toString() {
   	return customerName;
   }
}
