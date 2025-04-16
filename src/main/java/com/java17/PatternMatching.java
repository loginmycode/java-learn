package com.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class PatternMatching {

	public static void main(String[] args) {
		
		System.out.println(test(1));
		RandomGenerator gen = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
		System.out.println(gen.nextInt());
		 System.out.println("Bounded Int: " + gen.nextInt(10000));
	}
	
	public static String test(Object str)
	{
		return switch(str)
		{
		case Integer i-> "integer";
		case String s-> "String";
		default       -> "unknown";
		
		};
	}
}
