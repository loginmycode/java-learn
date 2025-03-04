package com.important.forinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String word ="helloworld";
		System.out.println(word.hashCode()); 
		
	
		List list = new ArrayList();
		System.out.println(list.size());
		Map<Character, Integer> map = new HashMap<>();
		
		
		for(char c:word.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c,1);
			}
		}
		System.out.println(map.size());
		System.out.println(map);
		
	}
}
