package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(4,5,2,5,752,47,2,4,11,78);
		//list =list.stream().filter(num -> num%2==0).collect(Collectors.toList());
		//System.out.println(list);
		
		list =list.stream().filter(num -> num>10).collect(Collectors.toList());
		System.out.println(list);
	}
}
