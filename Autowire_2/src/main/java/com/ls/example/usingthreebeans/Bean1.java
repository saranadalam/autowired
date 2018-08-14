package com.ls.example.usingthreebeans;

public class Bean1 {
	
	private int id;
	private String name;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Bean1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
