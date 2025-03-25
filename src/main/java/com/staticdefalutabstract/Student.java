package com.staticdefalutabstract;


interface  Person {
 
	 
	
	public abstract void eat();
	
	public static void sleep()
	{
		System.out.println("Person is sleeping");
	}
	
	default void read()
	{
		System.out.println("Reading");
	}
	
}

public class Student implements Person
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	public void read()
	{
		System.out.println("Reading- Stu");
	}
	public static void sleep()
	{
		System.out.println("Student is sleeping");
	}
	
	public static void main(String[] args) {
		Person p = new Student();
		Person.sleep();
		p.read();
		
		
		
	}
	
	
	
	
}


