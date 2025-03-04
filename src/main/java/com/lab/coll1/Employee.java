package com.lab.coll1;

import java.util.Objects;

public class Employee {
	
	private String name;
	private String email;
	private String dob;
	private Address homeAddress;
	private Address officeAddress;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String email, String dob, Address homeAddress, Address officeAddress) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, email, homeAddress, name, officeAddress);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email)
				&& Objects.equals(homeAddress, other.homeAddress) && Objects.equals(name, other.name)
				&& Objects.equals(officeAddress, other.officeAddress);
	}
	
	
	

}
