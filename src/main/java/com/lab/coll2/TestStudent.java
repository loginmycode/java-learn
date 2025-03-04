package com.lab.coll2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student = new Student("Rama",1,20);
		Student student2 = new Student("Karana",7,14);
		Student student3 = new Student("Abi",5,12);
		Student student4 = new Student("Anu",8,16);
		Student student5 = new Student("Zulpi",2,9);
		Student student6 = new Student("Somana",9,23);
		Student student7 = new Student("Rama",1,20);
		
		
		Collection<Student> col1 = new ArrayList<Student>();
		col1.add(student);
		col1.add(student2);
		col1.add(student3);
		col1.add(student4);
		col1.add(student5);
		col1.add(student6);
		col1.add(student7);
		System.out.println("-------------------------ArrayList-------------------------");
		System.out.println(col1);
		
		
		Collection<Student> col2 = new HashSet<Student>();
		col2.add(student);
		col2.add(student2);
		col2.add(student3);
		col2.add(student4);
		col2.add(student5);
		col2.add(student6);
		col2.add(student7);
		
		System.out.println("-------------------------HashSet-------------------------");
		System.out.println(col2);
		Collection<Student> col3 = new LinkedHashSet<Student>();
		col3.add(student);
		col3.add(student2);
		col3.add(student3);
		col3.add(student4);
		col3.add(student5);
		col3.add(student6);
		col3.add(student7);
		
		System.out.println("-------------------------LinkedHashSet-------------------------");
		System.out.println(col3);
		/*
		 * Collection<Student> col4 = new TreeSet<Student>(); col4.add(student);
		 * col4.add(student2); col4.add(student3); col4.add(student4);
		 * col4.add(student5); col4.add(student6);
		 */
	//	col4.add(student7);
		//System.out.println(col4);
		
	}
}
