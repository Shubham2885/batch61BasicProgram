package com.bz.day4.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericMethodDemo {
	
	//E is generic type -> it could anything example E,E...
	//<E> same type should be used in param..
	public static <E> void genericPrint(E x) {
		System.out.println(x);
	}

	public static <E> void addTwoNumber(E x, E y){
		
	}
	
	public static void getSome(Object x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		int a = 60;
		int b = 60;
//		System.out.println(a);
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(234);
		
		int x = integerList.get(0);
		
		System.out.println(x);
		
		getSome(a);
		Integer newA = new Integer(a);
		Integer newB = new Integer(b);
		getSome(newA);
//		System.out.println(newA.compareTo(newB));
//		String str = "sdfsdf";
//		double val = 2384.23948;
//		Double
//		Date date = new Date();
//		float f = 234f;
//		Float 
//		
//		Integer integer = 1;
//		Integer integer2 = 4;
//		
//		addTwoNumber(integer,integer2);
//		genericPrint(abc);
//		genericPrint(str);
//		genericPrint(val);
//		genericPrint(date);
//		genericPrint(f);
		
		
	}
}
