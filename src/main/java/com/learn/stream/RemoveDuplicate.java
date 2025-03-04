package com.learn.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	
	public static void main(String[] args) {
		
	
		List<String> words = Arrays.asList("Hello", "Hi","How Are","Hello","you","Hi");
		
		List<String> arr1=words.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		System.out.println(arr1);
		
		
		
				
		
	}
	
}

