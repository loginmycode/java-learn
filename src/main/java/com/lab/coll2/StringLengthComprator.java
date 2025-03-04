package com.lab.coll2;

import java.util.Comparator;

public class StringLengthComprator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1.length()-str2.length();
	}
}
