package com.learn.features.java8;

public interface AddTwoNubers {
	
	public int add(int num1, int num2);
	
	public static void main(String[] args) {
		
		AddTwoNubers addNumbers =(a,b)->(a+b);
		
		int res =addNumbers.add(5, 7);
		System.out.println(res);
		
	}

}
