package com.learn.features.java8.encodingdecoding;

import java.util.Base64;

public class TestEnDeCoding {

	public static void main(String[] args) {
		
		String word ="java8newFeatue";
		String encoded = Base64.getEncoder().encodeToString(word.getBytes());
		String decoded = new String(Base64.getDecoder().decode(encoded));
		
		System.out.println("encoded "+encoded);
		System.out.println("decoded "+decoded);
	}
}
