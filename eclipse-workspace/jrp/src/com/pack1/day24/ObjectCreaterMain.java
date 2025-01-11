package com.pack1.day24;

import java.util.Scanner;

public class ObjectCreaterMain 
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the new name:");
	String n=sc.nextLine();
	System.out.println("updated name :");
	String n1=sc.nextLine();
	System.out.println("enter id :");
	int no=sc.nextInt();
	
		
          ObjectCreater creater=(id,name)->new Student(id, name);
         Student s1=(Student)creater.objectcreate(no, n);
         s1.updatename((newName)->s1.setName(n1));
         System.out.println("name :"+s1.getName());
        	  System.out.println(s1);

	}

}
