package com.pack1.test2;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class RandomValueGenerator 
{

	public static void main(String[] args) 
	{
		
	   Random r=new Random();
		int r1=r.nextInt(10000);
		String s="NIT";
		String s1=s+String.format("%04d", r1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min number :");
		int no1=sc.nextInt();
		System.out.println("enter max number :");
		int no2=sc.nextInt();
		int r2=r.nextInt(no1,no2);
		
		Consumer<String> c1= (String supplier)->System.out.println("output : "+s1);
		Consumer<Integer> c2=(Integer supplier)->System.out.println("output : "+r2);
		
		
		c1.accept(s1);
		c2.accept(r2);
		sc.close();
	}

	
}
