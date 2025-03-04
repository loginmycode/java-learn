package com.important.forinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShowInSameArray {

	public static void main(String[] args) {
		
		Map<String, List<String>> map = new HashMap<>();
		Map<String, List<String>> map1 = new TreeMap<>();
		String[] arr = {
			    "apple", "banana", "cherry", "apple", "date", "banana", 
			    "grape", "mango", "mango", "peach", "cherry", "apple"
			};
		
		for(String word:arr)
		{
			map.computeIfAbsent(word, k-> new ArrayList()).add(word);
		}
		
		System.out.println(map.values());
		
		
	}
	
}
