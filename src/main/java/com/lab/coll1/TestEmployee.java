package com.lab.coll1;

public class TestEmployee {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Vijaynagar","Bengalore", "560040",  "Karnataka");
		Address officeAddress = new Address("MG-Road","Bengalore", "560060",  "Karnataka");
		Employee employee = new Employee("Rama", "rama@gamil.co,", "05-05-2005", homeAddress, officeAddress);
		Employee employee1 = new Employee("Rama", "rama@gamil.co,", "05-05-2005", homeAddress, officeAddress);
		System.out.println(employee.equals(employee1));
		System.out.println(employee==employee1);
	}
}
