package com.java8.basic;

public interface HelloWorld {

	public void sayHello();
	
	public static void main(String[] args) {
		
		HelloWorld helloworld=()->System.out.println("HelloWorld");
		helloworld.sayHello();
		
	}
}
