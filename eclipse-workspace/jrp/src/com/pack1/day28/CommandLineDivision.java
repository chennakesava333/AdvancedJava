package com.pack1.day28;

import java.util.Scanner;

public class CommandLineDivision 
{
   public static void main(String[] args) 
   {
	   Scanner sc=null;
	   try 
		{
		   sc=new Scanner(System.in);
		   System.out.println("enter dividend & divisor  : ");
		   double dividend=Double.parseDouble(sc.nextLine());
		   double divisor=Double.parseDouble(sc.nextLine());
			System.out.println("Division result :"+(dividend/divisor));
		}
	   catch(IllegalArgumentException e) 
	   {
		  e.printStackTrace();
	   }
	   catch(ArithmeticException e) {
		   e.printStackTrace();
	   }
	   finally {
		   sc.close();
	   }
   }
}
