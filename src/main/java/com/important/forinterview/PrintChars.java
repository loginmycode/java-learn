package com.important.forinterview;

import java.util.stream.Collector;

public class PrintChars {

	public static void main(String[] args) {
		
		String str = "helloworld";
		
		 str.chars().mapToObj(c -> (char)c).forEach(System.out::println);
				
	}
}
