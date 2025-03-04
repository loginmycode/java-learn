package com.lab.coll1;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection<String> col = new ArrayList<String>();
		col.add("Apple");
		col.add("Banana");
		col.add("Orange");
		col.add("Lemon");
		System.out.println(col);
		col.add("Banana");
		System.out.println(col);// It allows the duplicates
		col.remove("Apple");
		System.out.println(col);
		
		//Check Contains
		System.out.println(col.contains("Apple"));
		System.out.println(col.contains("Banana"));
		
		System.out.println(col.size());
		//col.clear();
		//System.out.println(col);
		
		System.out.println(col.addAll(col));
		System.out.println(col);
		//System.out.println(col.removeAll(col));
		System.out.println(col);
		
		Collection col2 = new ArrayList<>();
		col2.add("Banana");
		col2.add("Lemon");
		//System.out.println(col.removeAll(col2));
		//System.out.println(col);
		
		
		System.out.println(col.retainAll(col2));
		System.out.println(col);
		
		Collection col3 = new ArrayList<>();
		col3.add("A");
		col3.add("B");
		Collection col4 = new ArrayList<>();
		col4.add("A");
		col4.add("C");
		System.out.println(col3.retainAll(col4));
		System.out.println(col3);
		System.out.println(col4);
		
		
		
	}
}
