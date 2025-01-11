package jrp.pack1;

class Animal
{
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
}
class Lion extends Animal
{
	public Lion() 
	{
		super(getname());
		System.out.println(name);
	}
	public static String getname() 
	{
		return "Lion";
	}
	
}
public class Super_Class_Constructor {

	public static void main(String[] args) {
		
        new Lion();
        
	}

}
