package jrp.pack1;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the number of student objects they want to create:");
		int noOfObj=sc.nextInt();
		
		for(int i=1;i<=noOfObj;i++) 
		{
			
			Student1 student=Student1.getcreateStudent();
			System.out.println(student);
		}
		sc.close();
	}
}
