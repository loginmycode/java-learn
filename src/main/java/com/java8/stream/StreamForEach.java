package com.java8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamForEach {

	public static void main(String[] args) {
		
		String [] str = {"Good","Hello","How","are","you"};
		Stream<String> stream = Stream.empty();
		Stream<String> stream1 = Stream.of(str);
		
		stream1.forEach(word -> {System.out.println(word);});
		
		
		IntStream stream2 = Arrays.stream(new int [] {4,5,62,66,23,89,34});
		
		stream2.forEach(e-> {
			System.out.println(e);
		});
	}
	
}
