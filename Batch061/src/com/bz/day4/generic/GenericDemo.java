package com.bz.day4.generic;

import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		GenericClassDemo<Integer> classDemo = new GenericClassDemo<Integer>(23,32);
		
		GenericClassDemo<String> stringDemo = new GenericClassDemo<String>("a", "c");
		System.out.println(classDemo);
		System.out.println(stringDemo);
		
		classDemo.compare(classDemo.getX(), classDemo.getY());
		stringDemo.compare(stringDemo.getX(), stringDemo.getY());
	}
}
