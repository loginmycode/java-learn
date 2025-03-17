package com.important.forinterview;

public class DigitsOnly {

	public static void main(String[] args) {
		
		 String str = "asfdvsg345354fdas2435adf24";
		 String number = str.replaceAll("\\D+", "");
		 System.out.println(number);
	}
}
