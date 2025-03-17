package com.important.forinterview;

public class RemoveStar {

	 public static void main(String[] args) {
	        /*
	        * you are given a string s, which contains stars *.

	        In one operation, you can:

	        · Choose a star in s.

	        · Remove the closest non-star character to its left, as well as remove the star itself.

	        Return the string after all stars have been removed.

	        Note:

	        · The input will be generated such that the operation is always possible.

	        · It can be shown that the resulting string will always be unique.

	         Input: s = "leet**cod*e"
	         Output: "lecoe"

	       */
	       String s = "leet**cod*e";
	        removeStars(s);


	    }

	    public static void removeStars(String str){


	        int index = str.indexOf("*");
	        System.out.println(index);

	        while (index > 0){

	            str = str.substring(0, index-1) + str.substring(index+1);

	            index = str.indexOf("*");
	            System.out.println(index);
	        }

	        System.out.println(str);

	    }

}
