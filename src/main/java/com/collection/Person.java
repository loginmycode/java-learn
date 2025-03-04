package com.collection;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	private String email;
	
	public Person()
	{
		super();
	}

	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		return 0 ;
	}
	
	

}
