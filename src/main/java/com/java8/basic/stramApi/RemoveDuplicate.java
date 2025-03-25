package com.java8.basic.stramApi;

import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	
	public static void main(String[] args) 
	{
		
		
		String str= "helloword";
		
		String res =str.chars()
				.mapToObj(c-> (char) c).distinct().map(String::valueOf)
				.collect(Collectors.joining());
		
		
		System.out.println(res);
				
		
		String word = "Helloworld";
		
		res= word.chars().mapToObj(c-> (char)c).distinct().map(String::valueOf)
			 .collect(Collectors.joining());
				
				
	}

}
