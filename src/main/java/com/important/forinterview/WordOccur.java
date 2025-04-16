package com.important.forinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordOccur {

	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("apple", "orange", "bannana", "apple", "bannana");
		 
		 Map<String, Long> wordCount =list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		 
		 wordCount.forEach((word, count) -> System.out.println(word + " " + count));
		
}
}