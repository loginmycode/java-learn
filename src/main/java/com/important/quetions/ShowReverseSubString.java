package com.important.quetions;

public class ShowReverseSubString {
	
	public static void main(String[] args) {
		
		 String str = "a bb ccc dddd eeeee";

	       String revesedWord = new StringBuilder(str.replace(" ", "")).reverse().toString();
	       
	       String [] words = str.split(" ");
	       
	       StringBuilder result = new StringBuilder();
	       int index=0;
	       for(String word : words)
	       {
	    	   result.append(revesedWord.substring(index, index+word.length())).append(" ");
	    	   index+=word.length();
	    	
	       }
	       System.out.println(result);
	}

}
