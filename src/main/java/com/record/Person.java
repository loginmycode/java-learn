package com.record;

public record Person(String name, int age) {
	
	public static void main(String[] args) {
		Person person = new Person("Rama", 20);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person);
		
	}
	
}
