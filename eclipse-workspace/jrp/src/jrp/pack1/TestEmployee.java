package jrp.pack1;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how many no of  Employee objects they want to create:");
        int noOfObj=sc.nextInt();
		
		for(int i=1;i<=noOfObj;i++) 
		{
			
			Employee employee=Employee.getCreateEmployee();
			System.out.println(employee);
		}
		sc.close();

	}

}
