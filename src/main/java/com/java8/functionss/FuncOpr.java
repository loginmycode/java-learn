package com.java8.functionss;

import java.util.function.Function;

public class FuncOpr {

	public static void main(String [] args)
	{
		Function<Integer, Integer> functions = n->n*n;
		int val =functions.apply(5);
		System.out.println(val);
		
		boolean b =functions.equals(1);
		System.out.println(b);
		
		Function<String, Integer> length = word ->word.length();
		int res =length.apply("Hello");
		System.out.println(res);
		
		String[] words = {"Java", "Spring", "Microservices", "Kafka", "Redis", "Docker", "Kubernetes"};
		Function<String, Integer> findlength;
			
			for(String word:words)
			{
				
			}
		
	}

	
}
