package com.important.forinterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ch.qos.logback.core.rolling.LengthCounter;

public class CharFrequencyJava8 {

	public static void main(String[] args) {
		
		String word ="ABBDFFWEDGGEEW";
		
		
	 //word.chars().mapToObj(c->(char)c).forEach(System.out::println);
		
	Map<Character, Long> frequency =	 word.chars().mapToObj(c->(char)c)
										.collect(Collectors.groupingBy(Function.identity(),
										 Collectors.counting()));
	
	System.out.println(frequency);
	/*
	 * for(Map.Entry<Character, Long> entry: frequency.entrySet()) {
	 * System.out.println(entry.getKey()+" = "+entry.getValue()); }
	 */
	
	String word1 ="ABBDFFWEDGGEEW";
	
	String res = word1.chars().distinct()
			     .mapToObj(c-> String.valueOf((char)c))
			    		 .collect(Collectors.joining());
	
	System.out.println(res);
	
	 List<String> names = Arrays.asList("Java", "Spring", "Java", "Microservices", "Spring");
	 
	names = names.stream().distinct().collect(Collectors.toList());
	System.out.println(names);
	names =names.stream().sorted().collect(Collectors.toList());
	System.out.println(names);
	
	int [] arr = {45,3,675,2,67};
	Arrays.stream(arr).sorted().forEach(System.out::println);
	
	//List list =Arrays.stream(arr).sorted(Collections.reverseOrder()).collect(Collectors.toList());

	
	}
}
