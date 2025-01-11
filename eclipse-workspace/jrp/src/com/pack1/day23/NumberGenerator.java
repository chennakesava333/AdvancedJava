package com.pack1.day23;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the min number :");
		int no=sc.nextInt();
		System.out.println("enter the max number :");
		int no1=sc.nextInt();
		
		//Random r1=new Random();
		
		System.out.println("min value : "+no);
		System.out.println("max value : "+no1);
         System.out.println("random number generated : "+generateRandomNumber(no, no1));
         sc.close();
        
	}
	public static int generateRandomNumber(int min,int max) 
	{
		Supplier<Integer> s1=()->min+(int)(Math.random()*(max-min));
		
		return s1.get();
	}

}
