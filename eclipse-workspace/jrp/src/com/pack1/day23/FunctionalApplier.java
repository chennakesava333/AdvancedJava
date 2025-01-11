package com.pack1.day23;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionalApplier 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num :");
		int num=sc.nextInt();
		
		Function<Integer,Integer>f1=val->val+5;
		Function<Integer,Integer>f2=val->val*2;
		Function<Integer,Integer>f3=val->val-3;
		
		System.out.println("original value : "+num);
		System.out.println("After Adding 5 : "+applyFunction(num, f1));
		System.out.println("After multiplying by 2 :"+applyFunction(num, f2));
		System.out.println("After subtracting 3 : "+applyFunction(num, f3));
         sc.close();
	}
	public static int applyFunction(int value,Function<Integer,Integer>fn)
	{
		return fn.apply(value);
	}

}
