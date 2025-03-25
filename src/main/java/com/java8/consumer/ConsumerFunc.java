package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerFunc {

	public static void main(String[] args) {
		
		Consumer<String> consumer = str ->System.out.println("Hello "+str);
		consumer.accept("Good Morning");
		
		Consumer<Integer> consumer1 = num -> System.out.println((num*2)+num);
		consumer1.accept(5);
		
		Consumer<String> toUpperCase = str ->System.out.println(str.toUpperCase());
		toUpperCase.accept("Java");
		
		toUpperCase =str ->System.out.println(str.toLowerCase());
		toUpperCase.accept("JAva");
		toUpperCase =str -> System.out.println(str.toString());
		
		
	}
}
