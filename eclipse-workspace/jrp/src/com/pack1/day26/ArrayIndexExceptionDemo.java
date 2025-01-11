package com.pack1.day26;

import java.util.Scanner;

public class ArrayIndexExceptionDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println(" enter array size : ");
			int size=sc.nextInt();
			int a[] = new int[size];
		   for(int i=0;i<=a.length;i++)
		   {
			   System.out.println("enter the value"+(i+1)+" : ");
			   a[i]=sc.nextInt();
		   }
		  
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("an ArrayIndexOutOfBoundsException occurred."+e.getMessage()+" \n\n");
			System.out.println("java.lang.ArrayIndexOutOfBoundsException : index 3 out of bounds for length 2\n\n");
		    e.printStackTrace();
		}
		catch(Exception e) 
		{
			System.out.println("other exceptions :"+e);
			e.printStackTrace();
		}
		   finally 
		   {
			   sc.close();
		   }
       
	}

}
