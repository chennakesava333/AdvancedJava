package com.pack1.day24.task2;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ClassRoom 
{
   private int chairs;
   static Scanner sc=new Scanner(System.in);



public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	@Override
	public String toString() {
		return "ClassRoom [chairs=" + chairs + "]";
	}
     
	public static UnaryOperator<ClassRoom> adjustChairs()
	{
		
		return ClassRoom->
		{
			
			System.out.println("enter the no of students :");
			int student=sc.nextInt();
			if(student>ClassRoom.getChairs())
			{
				ClassRoom.setChairs(student);
			}
			else if(student<ClassRoom.getChairs()) 
			{
				ClassRoom.setChairs(student);
			}
			return ClassRoom;
		};
	}
	public ClassRoom(int chairs2) {
		
	}
 
}
