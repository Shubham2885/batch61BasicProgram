package com.bz.day4;

import java.util.Date;

public class FunctionProgramming {
	
	
	
	public static int performFactorial(int number) {
		System.out.println("Enter Number for factorial");
//		int numberF = 5;
		int fact = 1;
		for(int i = 1;i<=number; i++) {
			fact = fact * i;
		}
		
//		System.out.println("Factorial of Number is = "+ fact);
		return fact;
	}
	
	// 1 not rutrun not take argurment
	public static void welcome() {
		System.out.println("Welcome");
	}
	
	//2 not return but take 1 or more arguments
	public static void printMyName(String name) {
		System.out.println("Welcome = "+name);
	}

	// 3 return something but not take any argument
	public static double getPi() {
		final double pi = 3.142;
		return pi;
	}
//	
	//4 return something and take any 1 or more argument
	public static double addition(double y) {
		return getPi()+y;
	}
	
	public static Date getCurrentDate() {
		return new Date();
	}
	
	public static Student getStudentDetails() {
		Student student = new Student("Shubham", "Address", 2);
		return student;
	}
	
	public static void lpattern(int numberOfLine) {
		for(int i=0;i<numberOfLine;i++) {
			System.out.println("*");
		}
		for(int i=0;i<numberOfLine;i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		welcome();
		printMyName("Anim");
		double val = getPi();
		System.out.println("Pi = "+val);
		
		double addition = addition(4.4);
		System.out.println("addition = "+addition);
		
		double fact = addition(performFactorial(5));
		System.out.println("Fact = "+fact);
		
		System.out.println("Current date is = "+getCurrentDate());
		
		System.out.println("Details of Student :: "+getStudentDetails());
		
		lpattern(10);
	}
}
