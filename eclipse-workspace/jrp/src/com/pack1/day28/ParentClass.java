package com.pack1.day28;

import java.util.Scanner;

class SuperClass 
{
	  Class<?>c1;
   public void  loadingClass(String className) 
   {
	   try {
	   c1=Class.forName(className);
	   System.out.println("class "+className+" found "+c1.getName());
	   }
	   catch(ClassNotFoundException e) {
		   System.out.println(e);
	   }
   }
}
class ChildClass extends SuperClass
{
	@Override
	public void  loadingClass(String className) {
		if(className.isEmpty()) {
			  throw new IllegalArgumentException();
		  }
		else {
			new SuperClass ().loadingClass(className);
		}
	}
}
public class ParentClass
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Class name :");
		String text=sc.nextLine();
		new ChildClass().loadingClass(text);
		sc.close();
	}
}
