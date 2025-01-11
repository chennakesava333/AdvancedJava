package jrp.pack1;

public class Test_Grade {

	public static void main(String[] args) 
	{
		Student_Grade s= new Student_Grade("chenna",101,"cse",2000.00);
         
		s.setS_average(90);
		char grade=s.cal_grade();
		System.out.println(grade);
		System.out.println("--------------------------");
		System.out.println(s);
	}

}
