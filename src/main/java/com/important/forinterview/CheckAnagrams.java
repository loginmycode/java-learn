package com.important.forinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckAnagrams {

	public static void main(String[] args) {
		
		Map<String, List<String>> map = new HashMap<>();
		String[] str = {
			    "listen", "silent", "enlist",  
			    "rat", "tar", "art",  
			    "evil", "vile", "veil", "live",  
			    "stressed", "desserts",  
			    "angel", "glean", "angle"
			};
		
		for(String word:str)
		{
			char [] arr = word.toCharArray();
			
			Arrays.sort(arr);
			String sortedString = new String(arr);
			map.computeIfAbsent(sortedString, k-> new ArrayList<>()).add(word);
			
		}
		System.out.println(map.values());
	}
}
