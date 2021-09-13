package com.bz.day4;

public class Student {

	String name;
	String address;
	int id;
	public Student(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
}
