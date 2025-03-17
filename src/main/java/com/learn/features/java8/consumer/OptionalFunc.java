package com.learn.features.java8.consumer;

import java.util.Optional;

public class OptionalFunc {

	public static void main(String[] args)
    {
        String[] words = new String[10];
        Optional<String> optional = Optional.ofNullable(words[5]);
        
        if(optional.isPresent())
        {
        	System.out.println();
        
        }
        else
        	System.out.println("String is empty");
    }
}
