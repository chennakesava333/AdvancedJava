package com.pack1.day24.task3;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Bp 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1 :");
		int x=sc.nextInt();
		System.out.println("enter the number2 :");
		int y=sc.nextInt();
		System.out.println("enter the String1:");
		String s1=sc.nextLine();
		s1=sc.nextLine();
		System.out.println("enter the string2 :");
		String s2=sc.nextLine();
		BinaryOperator <Integer> add=(a,b)->a+b;
		BinaryOperator <Integer> mul=(a,b)->a*b;
		
		BinaryOperator <String> s3=(a,b)->a+b;
		BinaryOperator <Integer> maxval=(a,b)-> a>b?a:b;
		BinaryOperator <Integer> minval=(a,b)->a<b?a:b;
		System.out.println("Add two numbers : "+add.apply(x,y));
		System.out.println("multiplication two numbers : "+mul.apply(x,y));
		System.out.println("concatination of two strings : "+s3.apply(s1, s2));
		System.out.println("max value : "+maxval.apply(x, y));
		System.out.println("min value : "+minval.apply(x, y));
		sc.close();
	}

}
