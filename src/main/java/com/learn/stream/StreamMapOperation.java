package com.learn.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapOperation {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(6,4,6,3,62,454,24,2);
		//Multyfying with value
		List<Integer> list1 =list.stream().map(num->num*2).collect(Collectors.toList());
		System.out.println(list1);
		List<Integer> list2 =list.stream().map(num-> num+5).collect(Collectors.toList());
		System.out.println(list2);
		list.stream().distinct().forEach(System.out::println);
		list.stream().sorted().forEach(System.out::println);
		
		
		
	}
}
