package com.important.quetions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First_Last_Chars {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Java", "Spring", "Microservices", "Backend");
		List<Character> list =words.stream().map(word ->word.charAt(0)).collect(Collectors.toList());
		System.out.println(list);
		
		list =words.stream().map(word-> word.charAt(word.length()-1)).collect(Collectors.toList());
		System.out.println(list);
		
		
	}
}
