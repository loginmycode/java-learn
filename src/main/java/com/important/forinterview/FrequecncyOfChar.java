package com.important.forinterview;

import java.util.HashMap;
import java.util.Map;

public class FrequecncyOfChar {

	public static void main(String[] args) {
		
		
		String word ="HelloWorld";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: word.toCharArray())
		{
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
	
		System.out.println(map);
	}
}

