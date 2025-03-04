package com.important.forinterview;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String  [] arr = {"Hello", "Hii","Good","Hello","Good"};
		Map<String, Integer> map = new HashMap<>();
		
		for(String word:arr)
		{
			if(!map.containsKey(word))
			{
				map.put(word, map.getOrDefault(word, 0)+1);
				
			}
		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		
		
		
	}

}
