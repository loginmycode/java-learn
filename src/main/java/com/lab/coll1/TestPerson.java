package com.lab.coll1;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ram", 20);
		Person p2 = new Person("Ram", 20);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}
}
