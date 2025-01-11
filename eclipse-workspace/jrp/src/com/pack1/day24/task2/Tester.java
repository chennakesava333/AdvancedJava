package com.pack1.day24.task2;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Tester 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no chairs");
		int chairs=sc.nextInt();
		ClassRoom cr=new ClassRoom(chairs);
		UnaryOperator<ClassRoom> un=cr.adjustChairs();
       un.apply(cr);
       System.out.println(cr);
	}

}
