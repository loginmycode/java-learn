package com.learn.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String res =removeDupicate("Helloworld");
		System.out.println(res);
		
	}
	
	public static String removeDupicate(String word)
	{
		Map<Character, Boolean> map = new HashMap<Character, Boolean>();
		 StringBuilder sb = new StringBuilder();
		 StringBuilder sb1 = new StringBuilder();
		for(char c: word.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c, true);
				sb.append(c+" ");
			}
		
			
		}
		System.out.println(sb1+" ");
		return sb.toString();
	}
	
}
