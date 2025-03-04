package com.learn.features.java8.stringjoiner;

public record Rectangle(int length, int breadth, int height) {

	
//	A constructor: public Person(String name, int age)
//	Getters: name() and age()
//	equals(), hashCode(), and toString() methods
	
	//-------------------------------------------------------
//	Key Features of Java Records
//	Immutable → Fields are final by default.
//	Auto-generated → Getters, toString(), equals(), hashCode().
//	Compact → Removes boilerplate code for POJOs.
//	No Setters → Data cannot be modified after initialization.
//	Supports Constructors & Methods.

	public int findVolume()
	{
		return length*breadth*height;
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(2, 3, 5);
		int val =rectangle.findVolume();
		System.out.println(val);
		
		
	}
}
