package com.pack1.test2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Prime_Or_Not 
{

	public static void main(String[] args)
	{
		
		Predicate<Integer> pd1= (var)->
		{
			
			for(int i=2;i<var;i++) 
			{
				if(var%i==0) 
				{
				   return false;
					 
				}
				
			}
			return true;
			
		};
		Predicate<Integer> pd2=var->var%2==0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int no=sc.nextInt();
		System.out.println(no+"is prime : "+pd1.test(no));
		System.out.println(no+"is even : "+pd2.test(no));
       sc.close();
	}

}
