package com.pack1.day23;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num : ");
		int no=sc.nextInt();
		System.out.println("original value : "+no);
		Consumer<Integer>co1=val->System.out.println("After Doubling the value :"+(val+val));
		Consumer<Integer>co2=val->System.out.println("After incrementing the value :"+ (val+3));
		Consumer<Integer>co3=val->
		{
			if(val>=1)
			System.out.println("After sqaring the value :"+(val*val));
		};
		
		
          modifyValue(no, co1);
          modifyValue(no, co2);
          modifyValue(no, co3);
          sc.close();
	}
	
	public static void modifyValue(int value,Consumer<Integer>co) 
	{
		co.accept(value);
		
	}

}
