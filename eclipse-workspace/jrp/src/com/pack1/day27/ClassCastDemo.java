package com.pack1.day27;

import java.util.Scanner;

public class ClassCastDemo 
{
   public static void handleClassCastException()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Array size :");
	   int s=Integer.parseInt( sc.nextLine());
	    Object objs[]=new Object[s];
	    try 
	    {
	    	
	    	for(int i=0;i<=objs.length-1;i++) 
	    	{
	    		System.out.println("enter data :");
	    		String s1=sc.nextLine();
		    	if(s1.matches("\\d+")) 
		    	{
		    		objs[i]=Integer.parseInt(s1);
		    	}
		    	else if(s1.equalsIgnoreCase("true")||(s1.equalsIgnoreCase("false"))) 
		    	{
		    		objs[i]=Boolean.valueOf(s1);
		    	}
		    	else {
		    		objs[i]=s1;
		    	}
		    }
	    	for(Object text:objs) 
	    	{
	    		String s2=(String)text;
	    		System.out.println("casting successful :"+s2);
	    	}
	    	
	    }
	    catch(ClassCastException e) {
	    	e.printStackTrace();
	    }
	    finally 
	    {
	    	sc.close();
	    }
   }
   public static void main(String[] args)
   {
	   handleClassCastException();
   }
}
