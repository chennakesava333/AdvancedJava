package com.pack1.day27;

import java.util.Scanner;

public class DivisionExample 
{
   public static int performDivision(int dividend,int divisor) 
   {
	   
	  return dividend/divisor;
   }
   public static void main(String[] args)
   {
	Scanner sc=null;
	sc=new Scanner(System.in);
	System.out.println("enter dividend :");
	int num1=sc.nextInt();
	System.out.println("enter divisor :");
	int num2=sc.nextInt();
	
	try {
		
		System.out.println("result of divison : "+performDivision(num1, num2));
		
	}
	catch(ArithmeticException e) 
	{
		System.out.println(e);
		System.out.println("message : "+e.getMessage()+"\n\n");
		e.printStackTrace();
	}
	finally {
		sc.close();
	}
	
   }
}
