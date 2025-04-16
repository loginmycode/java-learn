package com.basic.unique;

import java.util.Arrays;

public class UniqueChars {

	public static void main(String[] args) {
		
		String word ="HelloWorld";
		word=word.toLowerCase();
		
		word.chars().mapToObj(c ->(char)c).distinct().forEach(System.out::println);
		Object[] uniqueChars = word.chars().mapToObj(c->(char)c).distinct().toArray();
		System.out.println(Arrays.toString(uniqueChars));
		
		
		
	}
}
