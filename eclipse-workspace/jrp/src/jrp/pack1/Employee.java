package jrp.pack1;

import java.util.Scanner;

public class Employee 
{
     int emp_id;
     String emp_name;
     static double emp_sal;
     static String emp_dept;
     

	public Employee(int emp_id, String emp_name, double emp_sal, String emp_dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
		this.emp_dept = emp_dept;
		
	}



	public static Employee getCreateEmployee() 
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the Employee id:");
    	int id=Integer.parseInt(sc.nextLine());
    	System.out.println("Enter the Employee name:");
    	String name=sc.nextLine();
    	System.out.println("Enter the Employee Salary:");
    	double sal=Double.parseDouble(sc.nextLine());
    	System.out.println("Enter the Employee department:");
    	String dept=sc.nextLine();
    	return new Employee(id,name,sal,dept);
    	
    }
	
	public double annulsal() 
	{
	   double a_sal=12*emp_sal;
	   double bonus=0;
	   switch(emp_dept) 
	   {
	   case "sales" :
		   bonus=0.10*a_sal; 
		   break;
	   case "Engineering" :
		   bonus=0.15*a_sal;
		   break;
	   case "Hr" :
		   bonus=0.08*a_sal;
		   break; 
	   default:
		   bonus=0.15*a_sal;
		   break;
	   }
	   return a_sal+bonus;
	}

	@Override
	public String toString() {
		double t_sal=annulsal();
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + ", emp_dept="
				+ emp_dept + ", total_sal=" + t_sal + "]";
	}

}
