package com.learn.features.java8.optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		 
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(optional.orElse("Default value"));
		
		
		
		
	}
}
