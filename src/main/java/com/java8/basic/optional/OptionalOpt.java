package com.java8.basic.optional;

import java.util.Optional;

public class OptionalOpt {

	public static void main(String[] args) {
		
		Optional<String> opt = Optional.empty();
		System.out.println(opt.isEmpty());
		System.out.println(opt.equals("a"));
		System.out.println(opt.isPresent());
		
		String word = "Optional Operation using java 8";
		
		
		Optional<String> opt2 = Optional.ofNullable(word);
		Optional<String> opt3 = Optional.ofNullable(word); //true
		System.out.println(opt2.equals(opt3));
		String word1 = "Optional Operation using java";
		opt3 = Optional.ofNullable(word1);
		System.out.println(opt2.equals(opt3)); //false content is diffrent
		
		
		
		
		System.out.println(opt2.get());//It woll value of word
		System.out.println(opt2.isPresent());
		
		String word4 = null;
		Optional<String> opt4 = Optional.ofNullable(word4);
		//System.out.println(opt4.get());//java.util.NoSuchElementException:
		System.out.println(opt4.isEmpty());//true
		System.out.println(opt4.isPresent());
		System.out.println(opt4.orElse("There is no values")); //There is no values
		
		
		String word5 = "Person is eatiing";
		Optional<String> opt5 = Optional.ofNullable(word5);
		System.out.println(opt5.orElse("There is no values"));// Person is eatiing
		
		//System.out.println(opt4.orElseThrow());
		
		
	}
}
