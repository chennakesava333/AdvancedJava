package com.pack1.day24;

import java.util.function.Consumer;

public class Student 
{
  private int id;
  private String name;
    
   
  public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
  
   
  
    protected int getId() 
    {
	return id;
    }
    protected void setId(int id)
    {
    	this.id = id;
    }



    protected String getName() 
    {
    	return name;
    }



    protected void setName(String name)
    {
    	this.name = name;
    }






	void updatename(Consumer<String>nameUpdater) 
    {
    	nameUpdater.accept(name);
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
    
    
}
