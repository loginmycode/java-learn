package com.important.forinterview;

import java.time.LocalDate;
import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {
		
		List<String> list = List.of("Hello", "Good","How", "I am", "Please");
		
		list.stream().limit(3).forEach(System.out::println);
		
		list.stream().skip(3).forEach(System.out::println);
		
		
	}
}
