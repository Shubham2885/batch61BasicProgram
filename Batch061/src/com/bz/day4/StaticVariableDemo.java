package com.bz.day4;

public class StaticVariableDemo {
	final static double PI = 3.142;
	
	public StaticVariableDemo() {
		//PI = PI + 5;
		System.out.println(" = "+PI);
	}
	
	public static void calCirclerArea(double radius) {
		double resutl = PI * radius * radius ;
		
		System.out.println(resutl);
	}
	
	public static void main(String[] args) {
		calCirclerArea(3);
		System.out.println(PI);
		StaticVariableDemo d1 = new StaticVariableDemo();
		StaticVariableDemo d2 = new StaticVariableDemo();
		StaticVariableDemo d3 = new StaticVariableDemo();
		
		System.out.println(d1.PI);
		//System.out.println(d2.PI);
		//System.out.println(d3.PI);
		calCirclerArea(3);
	}
}
