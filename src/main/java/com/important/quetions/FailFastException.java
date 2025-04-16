package com.important.quetions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastException {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("Hello");
		list.add("Check");
		Iterator<String> iterator= list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			list.add("adding new element");
		}
	}
}
