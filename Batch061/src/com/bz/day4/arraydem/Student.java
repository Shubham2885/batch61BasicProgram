package com.bz.day4.arraydem;

public class Student {

	private String fname;
	private String lname;
	private int id;
	
//	@Override
//	public String toString() {
//		return "Student [fname=" + fname + ", lname=" + lname + "]";
//	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String fname, String lname, int id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
}
