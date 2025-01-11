package com.pack1.day23;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic 
{

	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int no=sc.nextInt();
		
		Predicate<Integer>pd1=num->num%2==0;
		Predicate<Integer>pd2=num->num>10;
		Predicate<Integer>pd3=num->
		{
			if(num<1)
				return false;
			
			for(int i=2;i<num;i++) 
			{
				if(num%2==0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(no+" is even : "+testPredicate(no, pd1) );
		System.out.println(no+" is greter then 10 : "+testPredicate(no, pd2));
		System.out.println(no+" is prime : "+testPredicate(no, pd3));
		

	}
	public static boolean testPredicate(int num,Predicate<Integer>pd) 
	{
		return pd.test(num);
	}

}
