package com.pack1.methodoverriding;
class Animal
{
	public void roam() 
	{
		System.out.println("generic animal is roaming");
	}
}
class Lion extends Animal
{
	@Override
	public void roam() 
	{
		System.out.println("Lion is roaming");
	}
	public void roar() 
	{
		System.out.println("Lion is roar");
	}
}
class Dog extends Animal
{
	@Override
	public void roam() 
	{
		System.out.println("Dog is roaming");
	}
	public void bark() 
	{
	   System.out.println("Dog is barking");	
	}
}
public class MethodOverridingDemo 
{

	public static void main(String[] args) 
	{
		Animal a=null;
		a=new Lion();
		accept(a);
		
		a=new Dog();
		accept(a);
	}
	public static void accept(Animal animal) 
	{
		//for(Animal animal:animals) it is used for using var args,collections.
		if(animal instanceof Lion) 
		{
			
			Lion lion =(Lion) animal;
			lion.roam();
			lion.roar();
		}
		else if(animal instanceof Dog) 
		{
			Dog d=(Dog)animal;
			d.roam();
			d.bark();
		}
	}

}
