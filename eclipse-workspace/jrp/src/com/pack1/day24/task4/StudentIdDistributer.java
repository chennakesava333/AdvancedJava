package com.pack1.day24.task4;

import java.util.Random;
import java.util.function.Supplier;

public class StudentIdDistributer
{
   public static void main(String[] args) 
   {
   String Alphanumeric ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
   int length=5;
   Random r1=new Random(); 
	   Supplier<String> s1=()->
	   {
	  	 StringBuilder sd=new StringBuilder();
	  	 for(int i=0;i<=length;i++) 
	  	 {
	  		 int ran=r1.nextInt(Alphanumeric.length());
	  		 sd.append(Alphanumeric.charAt(ran));
	  	 }
	  	 return sd.toString();
	   };
	   Student st=new Student("chenna",s1.get(),'a');
	   System.out.println(st);
   }
}
