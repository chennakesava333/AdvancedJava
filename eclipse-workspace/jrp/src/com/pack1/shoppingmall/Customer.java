package com.pack1.shoppingmall;

public class Customer 
{
  protected String name;

  public Customer(String name) 
  {
		super();
		if(name == null || name.isEmpty()) 
		{
			System.out.println("please enter customer name");
			return;
		}
		this.name = name;
  }
  
  public void calculateBill(double ...prices) 
  {
	  double totcost = 0;
	  for(double price : prices) 
	  {
		  if(price < 0) 
		  {
			  System.out.println("item price cannot be negitive");
			return;
		  }
		  totcost+=price;
	  }
	  System.out.println("welcome to hyderabad mall:");
	  System.out.println("customer :"+name);
	  System.out.println("total cost rs:"+totcost);
	  System.out.println("Discount:no discount for regular customers");
  }
}
