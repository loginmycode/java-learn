package com.java8.stringjoine;

import java.util.StringJoiner;

public class TestStringJoiner {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(", ");
		joiner.add("Banana").add("Mango").add("Pappaya");
		
		System.out.println(joiner);
	}
}
