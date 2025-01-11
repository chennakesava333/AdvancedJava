package com.pack1.day28;

import java.util.Scanner;

public class ArrayStoreExample 
{
	static Scanner sc=new Scanner(System.in);
    public static void storeObjects()
    {
     
    	  Object arry[]=new String[5];
    	  System.out.println("enter data 1 to 3:");
	      int s1=Integer.parseInt(sc.nextLine());
    	  for(int i=0;i<arry.length;i++) 
    	  {
    		  
			  if(s1==1) 
			  {
				  System.out.println("enter data : ");
				  arry[i]=Integer.parseInt(sc.nextLine());
			  }
			  else if(s1==2)
	    	  {
	    	      arry[i]=Boolean.parseBoolean(sc.nextLine());
	    	  }
			  else if(s1==3)
			  {
				  System.out.println("enter data : ");
				  arry[i]=sc.nextLine();
			  }
    	
    	  }
    	  for(Object text:arry) 
	    	{
	    		 Object s2=text;
	    		System.out.println("storing successful :"+s2);
	    	}
   	
    }
    public static void main(String[] args) 
    {
		try {
			storeObjects();
		}
		catch(ArrayStoreException e) {
			System.out.println(e);
		}
	}
}
