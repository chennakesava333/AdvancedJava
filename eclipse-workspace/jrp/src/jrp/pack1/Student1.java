package jrp.pack1;

import java.util.Scanner;

public class Student1 {

	private String std_name;
	private int std_age;
	private String std_grade;
	
	public Student1(String std_name, int std_age, String std_grade) 
	{
		super();
		this.std_name = std_name;
		this.std_age = std_age;
		this.std_grade = std_grade;
	}

	@Override
	public String toString() {
		return "student name=" + std_name + ", student age=" + std_age + ", student grade=" + std_grade ;
	}

	public static Student1 getcreateStudent() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		System.out.println("Enter Student age:");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student grade:");
		String grade=sc.nextLine();
		return new Student1(name,age,grade);
	}
	
}
