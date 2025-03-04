package com.lab.coll1;

import java.util.Objects;

public class Address {

	private String street;
	private String city;
	private String zip;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String zip, String state) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, state, street, zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street) && Objects.equals(zip, other.zip);
	}
	
	
}
