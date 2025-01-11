package com.pack1.shoppingmall;

import java.util.Scanner;

public class ShoppingMall {

	
	public static void generateBill(Customer cust,double ...prices)
	{
		cust.calculateBill(prices); //call the appropriate overridden metod
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please select customer type  to get additional discount :\n1.general customer \n2.prime customer \n3.vip customer");
         int customertype = Integer.parseInt(sc.nextLine());
         Customer customer=null;
         System.out.println("enter your name");
         String name=sc.nextLine();
         
         System.out.println("enter no of items:");
         int numitems=Integer.parseInt(sc.nextLine());
         
         double prices[] = new double[numitems];
         
         for(int i=0;i<numitems;i++)
         {
        	 System.out.println((i+1)+"item name: ");
        	 String itemname =sc.nextLine();
        	 System.out.println("item price :");
        	 prices[i]=Double.parseDouble(sc.nextLine());
         }
         switch(customertype) 
         {
         case 1:
        	 customer = new GeneralCustomer(name);
        	 break;
         case 2:
        	 customer = new PrimeCustomer(name);
        	 break;
         case 3:
        	 customer = new VIPCustomer(name);
        	 break;
        	 default:
        		 System.out.println("invalid customer id");
        		 return;
         }
         generateBill(customer, prices);
	}

}
