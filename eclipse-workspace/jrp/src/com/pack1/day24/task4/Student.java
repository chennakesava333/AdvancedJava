package com.pack1.day24.task4;

public class Student 
{
   private String name;
   private String id;
   private char grade;
   
   public Student(String name, String id,char i) 
   {
		super();
		this.name = name;
		this.id = id;
		this.grade = i;
	}

   

protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected char getGrade() {
		return grade;
	}

	protected void setGrade(char grade) {
		this.grade = grade;
	}
   
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade + "]";
	}

}
