package com.lab.coll1;

import java.util.Collection;
import java.util.LinkedList;

public class UsingLinkedList {

	public static void main(String[] args) {
		
		Collection col = new LinkedList<>();
		col.add("1");
		col.add("2");
		col.add("3");
		col.add("4");
		System.out.println(col);
		col.add("0");
		System.out.println(col);
		
		col.add("B");
		col.add("A");
		System.out.println(col);
		col.add("A");
		System.out.println(col);
		
		col.addAll(col);
		System.out.println(col);
		
		
		
		
	}
}
