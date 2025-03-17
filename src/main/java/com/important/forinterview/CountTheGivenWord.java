package com.important.forinterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheGivenWord {

	public static void main(String[] args) {
		
		String [] arr = {"java", "java", "javascript", "learn", "great", "prefix"};
		String word="java";
		countTheGivenWord(arr, word, 1);
		
		int min= Math.min(11, 7);
		System.out.println(min);
		
		
	}
	
	public static void countTheGivenWord(String [] words, String findword, int num)
	{
		Map<String, Integer> map = new HashMap<>();
		
		Map<String, Long> count =Arrays.stream(words).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println("-----" +count);
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> entry :map.entrySet())
		{
			//System.out.println("---"+entry.getValue());
			
			if(entry.getKey().equals(findword))
			{
				
				System.out.println(findword +" occurs "+entry.getValue()+" times");
			}
			if(entry.getValue().equals(num))
			{
				System.out.println(entry.getKey()+" "+ num + " Times ");
			}
		}
		
	}
}

