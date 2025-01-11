package jrp.pack1;

public class Student_Grade 
{
    private String s_name;
    private int s_id;
    private String s_corse;
    private double s_fee;
    private char s_grade;
    private double s_average;
    
    
	public Student_Grade(String s_name, int s_id, String s_corse, double s_fee) {
		super();
		this.s_name = s_name;
		this.s_id = s_id;
		this.s_corse = s_corse;
		this.s_fee = s_fee;
	}

    public Student_Grade(Student_Grade o) 
    {
    	this.s_name = o.s_name;
		this.s_id = o.s_id;
		this.s_corse = o.s_corse;
		this.s_fee = o.s_fee;
		this.s_average = o.s_average;
		this.s_grade = o.s_grade;
    }
	
	public char cal_grade() 
	{
		if(s_average>=90) 
		{
			s_grade='A';
			
		}
		else if(s_average>=80 && s_average<90) 
		{
			s_grade='B';
			
		}
		else if(s_average>=70 && s_average<80) 
		{
			s_grade='C';
			
		}
		else if(s_average>=60 && s_average<70) 
		{
			s_grade='D';
			
		}
		else if(s_average>0 && s_average<60)
		{
			s_grade='F';
			
		}
		else 
		{
			System.out.println("invalid case");
		}
		return s_grade;
	}

	public void setS_average(double s_average) {
		this.s_average = s_average;
	}
    
	public char getS_garde() 
	{
		return s_grade;
	}

	@Override
	public String toString() {
		return "Student_details [s_name=" + s_name + "\n s_id=" + s_id + "\n s_corse=" + s_corse + "\n s_fee=" + s_fee
				+ "\n s_grade=" + s_grade + "\n s_average=" + s_average ;
	}
    
	
}
