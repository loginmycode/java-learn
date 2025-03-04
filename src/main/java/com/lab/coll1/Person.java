package com.lab.coll1;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	public String toString()
	{
		return "Person [ name "+name+ " age "+age+ " ]";
	}


	@Override
	public boolean equals(Object o) {
	
		if(o instanceof Person)
		{
			Person p = (Person)o;
			
			if(this.name.equals(p.name)&& this.age==p.age)
			{
				return true;
			}
			else
				return false;
		}
		throw new IllegalArgumentException("pass only person object");
	}
	
	
	
	
	
	
}
