package jrp.pack1;

class RBI
{
	protected String ifscCode = "RBIHYD0987";
}
class SBI extends RBI
{
	protected String ifscCode = "SBIHYD12345";  //variable hiding
	public void show() 
	{
		System.out.println("ifscCode :"+ifscCode);
		System.out.println("ifscCode :"+super.ifscCode);
	}
}
public class VariableHiding 
{

	public static void main(String[] args) 
	{
		
       SBI sbi = new SBI();
       sbi.show();
	}

}
