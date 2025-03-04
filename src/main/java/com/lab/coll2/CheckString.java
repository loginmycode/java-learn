package com.lab.coll2;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;
import java.util.TreeSet;

public class CheckString {

	public static void main(String[] args) {
		
		String s = "abc";
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String a ="a";
		String b ="b";
		String ab ="ab";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(ab.hashCode());
		
		String abc ="abc";
		//    31^2*97+31^1*98+31^0*97
		//    961*97+31*98+1*97
		//    93217+3038+99
		//    96354
		
		System.out.println(abc.hashCode());
		
		
		HashSet<String> hashset = new HashSet<>();
		
		/*
		 * HashSet wont allow duplicate 
		 * It wont give insertion order
		 * 
       */
		hashset.add("Rama");
		hashset.add("Rama");
		hashset.add("Krishna");
		hashset.add("Prama");
		hashset.add("A");
		hashset.add(null);
		System.out.println(hashset);
		System.out.println(hashset.add("Krishna"));
		System.out.println("--------------------------------------------------------------");
		
		
		
		/*
		 * TreeSet will give sorting order
		 * It wont allow null values
		 * 
		 */
		
		TreeSet treeSet = new TreeSet<>();
		treeSet.add("Kannada");
		treeSet.add("English");
		treeSet.add("Hindi");
		System.out.println(treeSet);
		treeSet.add("Hindi");
		System.out.println(treeSet);
		System.out.println(treeSet.add("English"));
	//	treeSet.add(null);
		System.out.println(treeSet);
		
		
		
		
		
		
	}
}
