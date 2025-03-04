package com.important.forinterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheAnagrams {

	public static void main(String[] args) {
		
		 String arr[] = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
		 Map<String, List<String>> anagramGroup = new HashMap<>();
		 for(String word:arr)
		 {
			 char [] charArray = word.toCharArray();
			
			 Arrays.sort(charArray);
			 String sortedStr = new String(charArray); 
			
			 
			 anagramGroup.computeIfAbsent(sortedStr, k-> new ArrayList<>()).add(word);
			 
		 }		
		 
		 System.out.println(anagramGroup.values());
//		 for(Map.Entry<String, List<String>> entry : anagramGroup.entrySet())
//		 {
//			 System.out.println(entry.getValue());
//		 }
	}
}
