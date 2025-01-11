package com.pack1.day27;

import java.util.Scanner;

public class ClassNotFoundDemo
{
	private Class<?>c1;

	public ClassNotFoundDemo(String className) 
	{
		try {
		c1 =Class.forName(className);
		System.out.println("class "+className+" found "+c1.getName());
		}
		catch(ClassNotFoundException e) {
			System.out.println("class "+className+" notfound ");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Class name :");
		String text=sc.nextLine();
		new ClassNotFoundDemo(text);
		sc.close();
	}

	
    
}
