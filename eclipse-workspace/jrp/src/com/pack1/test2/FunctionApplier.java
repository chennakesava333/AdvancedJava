package com.pack1.test2;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text :");
		String text=sc.nextLine();
		System.out.println("enter the number :");
		int no1=sc.nextInt();
		Function<String,Integer>f1=str->str.length();
		Function<Integer,Float>f2=num->num/2f;
		System.out.println("testString is :"+text);
		System.out.println("text length is \""+text+"\":"+f1.apply(text)+"\n\n");
		System.out.println("test Integer is: "+no1);
		System.out.println(no1+"divides 2 is: "+f2.apply(no1));
		sc.close();
	}

}
