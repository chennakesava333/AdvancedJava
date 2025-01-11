package com.pack1.test2;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{

	public static void main(String[] args) 
	{
		Consumer<String> c1=var->System.out.println(var.toUpperCase());
		Consumer<Integer> c2=var1->System.out.println("square of :"+(var1*var1));

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int no=Integer.parseInt(sc.nextLine());
		System.out.println("enter the text :");
		String text=sc.nextLine();
		c1.accept(text);
		c2.accept(no);
		sc.close();
	}

}
