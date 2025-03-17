package com.important.forinterview;

import java.util.Arrays;

public class LargestPrefix {

	public static void main(String[] args) {
		String word = "javalearn java javalearned";
		System.out.println(findLargetstPre(word));
	}
	
	public static String findLargetstPre(String words)
	{
		 

	        // Split the string into an array of words
	        String[] arr = words.split(" ");

	        // Sort the array lexicographically
	        Arrays.sort(arr);

	        // Find the longest common prefix between the first and last words
	        String first = arr[0];
	        String last = arr[arr.length - 1];
	        int minLength = Math.min(first.length(), last.length());

	        int i = 0;
	        while (i < minLength && first.charAt(i) == last.charAt(i)) {
	            i++;
	        }

	        // The common prefix
	        String longestPrefix = first.substring(0, i);

	        System.out.println("Longest Common Prefix: " + longestPrefix);
			return longestPrefix;
	}
}
