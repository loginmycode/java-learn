package com.important.forinterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDupChar {

	public static void main(String[] args) {
		
		String word = "Hellowordh";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c:word.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.err.println(map);
	}
}
