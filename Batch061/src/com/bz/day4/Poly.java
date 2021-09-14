package com.bz.day4;

//method overloading//static polymorphism // compile time poly
public class Poly {

	public void print() {
		System.out.println("print");
	}
	
	public void print(String name) {
		System.out.println("print :: name :: "+name);
	}
	
	public void print(String name, String surname) {
		System.out.println("print :: name :: "+name+ " surname :: "+surname);
	}
	
	public void print(double x,double y) {
		
	}
	
	public void print(double x) {
		System.out.println(x);
	}
	
	public int print(int x) {
		return x;
	}
	
	public static void main(String[] args) {
		Poly poly = new Poly();
		poly.print();
		poly.print(5.0,3);
	}
}
