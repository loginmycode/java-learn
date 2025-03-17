package com.important.forinterview;

public class InternFuncOfString {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str1= "Hell0";
		
		System.out.println(str.hashCode());
		System.out.println(str.hashCode());
		
		String str3 = new String("Hello");
		System.out.println(str3.hashCode());
		System.out.println(str==str3);
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		String  str4 =str3.intern();
		System.out.println(System.identityHashCode(str4));
		
	}
}
