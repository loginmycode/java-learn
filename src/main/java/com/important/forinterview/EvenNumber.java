package com.important.forinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,54,6,45,75,2,547);
	list =	 list.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(list);
	
	list.stream().filter(n->n>3).forEach(System.out::println);
	
	
	
	
	
	
		
	}
}
