package com.important.forinterview;

public class StringOperation {

	public static void main(String[] args) {
		
		String s1= new String("Raj"); 
		String s2= new String("Raj"); 
		String s3= "Raj";
		String s4= "Raj";
		
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false
	}
}
