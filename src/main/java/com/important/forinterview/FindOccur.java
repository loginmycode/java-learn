package com.important.forinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccur {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "helo","Hii","Good","Come","Come");
		Map<String, Long> occ =list.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
		list.stream().sorted().forEach(System.out::println);
		System.out.println(occ);
		
		
	}
}
