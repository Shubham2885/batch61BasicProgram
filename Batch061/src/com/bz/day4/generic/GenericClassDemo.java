package com.bz.day4.generic;

//
public class GenericClassDemo <E> {

	private E x;
	private E y;
	
	public GenericClassDemo(E x, E y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "GenericClassDemo [x=" + x + ", y=" + y + "]";
	}
	
	public E getX() {
		return x;
	}

	public E getY() {
		return y;
	}

	public <E extends Integer> void compare(E x, E y) {
		System.out.println(x.compareTo(y));
	}
	
	public <E extends String> void compare(E x, E y) {
		System.out.println(x.compareTo(y));
	}
}
