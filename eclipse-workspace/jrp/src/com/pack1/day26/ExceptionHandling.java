package com.pack1.day26;

import java.util.Scanner;

public class ExceptionHandling 
{
	public static void handlingExceptions(String text) 
	{
          try{
			System.out.println("length of the String :"+text.length());
			int num=Integer.parseInt(text);
			System.out.println("converted number :"+num);
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=null;
		sc=new Scanner(System.in);
		System.out.print("enter the String to an integer :");
		String text=sc.nextLine();
		ExceptionHandling.handlingExceptions(text.isEmpty() ? null:text);
		sc.close();
		
		
	}

}
