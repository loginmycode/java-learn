package com.important.forinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheStringChar {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Banana", "Apple","Mango","Orange");
		
		 
		Map<Integer, List<String>> groupedByLength= words.stream().collect(Collectors.groupingBy(String::length));
		
		  System.out.println(groupedByLength);
		
		
	}
}
