package com.important.forinterview;

public class StringIntern {
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
        String s2 = s1.intern(); // Moves "Hello" to String Pool
        String s3 = "Hello"; // Already in pool

        System.out.println(s1 == s2); // false (s1 is in heap, s2 is in pool)
        System.out.println(s2 == s3); // true (Both refer to the same pool object)
        System.out.println(s2);
	}
	
}
