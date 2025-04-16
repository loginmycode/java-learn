package com.important.quetions;

import java.util.Arrays;

public class Test1 { 
	public static void main(String[] args) throws Exception {
		char[] chars = new char[] {'\u0097'}; 
		System.out.println(Arrays.toString(chars));
		String str = new String(chars); 
		System.out.println(str.toString());
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes));
		} }
