package com.pack1.shoppingmall;

public class VIPCustomer extends Customer
{
  protected double discountRate = 15.0;
  
  public VIPCustomer(String name) 
  {
		super(name);
		
  }
  
  @Override
  public void calculateBill(double ...prices) 
  {
	  double totcost = 0;
	  for(double price:prices) 
	  {
		  if(price<0) 
		  {
			  System.out.println("item price cannot be negitive..");
			  return;
		  }
		  totcost+=price;
	  }
	  double discount = (totcost*discountRate)/100;
	  double finalammount = totcost-discount;
	  
	  System.out.println("welcome to hyderabad mall:");
  	  System.out.println("customer :"+name);
  	  System.out.println("total cost rs:"+totcost);
  	  System.out.println("discount rs:"+discount);
  	  System.out.println("Final ammount rs:"+finalammount);
  }
}
