package com.pack1.day26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleExceptionDemo {

	public static void main(String[] args) 
	{
	  Scanner sc=null;
	  try {
			  sc=new Scanner(System.in);
	  System.out.println("enter the A value : ");
	  int a=sc.nextInt();
	  System.out.println("enter the B value : ");
	  int b= sc.nextInt();
	  System.out.println("you entered a = "+a+" and b = "+b);
	  }
	  catch (InputMismatchException e) 
	  {
		System.out.println("an InputMismatchException occurred. \n\n====");
		System.out.println("message : "+e.getMessage()+"\n\n=====");
		e.printStackTrace();
		
	  }
	  catch(Exception e) 
	  {
		  System.out.println("other Exceptions : "+e);
	  }
	  finally 
	  {
		sc.close();
	  }

	}

}
