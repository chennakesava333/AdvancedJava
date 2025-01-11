package com.pack1.day25;

import java.util.Scanner;


public class OnlineMarketplace 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the total order amount in rupees :");
	double t_amount=Double.parseDouble(sc.nextLine());
	System.out.println("the user to specify if they are a frequent shopper (Yes/no) :");
	String specify=sc.nextLine();
	System.out.println("enter the product caregory :");
	String product_caregory=sc.nextLine();
	
	PricingStrategy ps=(amount,sp)->
	{
		if("yes".equals(specify))
		{
			double discount=amount*0.05;
			amount=amount-discount;
			return amount;
		}
		return amount;
	};
	ProductCategoryChecker pcc=(amount,pc)->
	{
		if("electronics".equalsIgnoreCase(product_caregory)) 
		{
			double discount=amount*0.10;
			amount=amount-discount;
			return amount;
		}
		else if("clothing".equalsIgnoreCase(product_caregory))
		{
			double discount=amount*0.05;
			amount=amount-discount;
			return amount;
		}
		else 
		{
		return amount;
		}
	};
	
	double c_discount=pcc.applyCategoryDiscount(t_amount, product_caregory);
	
	double finalamount=ps.calculatePrice(c_discount,"yes".equals(specify));
	
	System.out.println("total cost : "+finalamount );
  }
}
