package com.learn.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StartWithChar {

	public static void main(String[] args) {
		
		List<String> list = List.of("Hello","Good","How","Are","You","And","Power");
		List<String> list2 =	list.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(list2);
		List<String> list3 =list.stream().filter(e-> e.contains("o")).collect(Collectors.toList());
		System.out.println(list3);
		
		List<String> list4 = list.stream().filter(e->e.endsWith("d")).collect(Collectors.toList());
	
		System.out.println(list4);
		
	
				
	}
}
