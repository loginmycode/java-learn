package com.collection.comparble;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	
	private int id;
	private String name;
	private String email;
	public Employee() {

	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.email.compareTo(emp.email);
	}
	
	
	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	
}
