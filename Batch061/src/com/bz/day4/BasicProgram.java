package com.bz.day4;

import java.util.Random;

public class BasicProgram {
	public static void main(String[] args) {
		System.out.println("Basic Program");
		
		
		//identifer is used for to identify the purpose
				
		//Local Variable
		// Variable declaration
		String name;
		
		//variable initilizatioin 
		String name1 = "Shubham";
		
		//Instance Variable
				
		//Class Variable
		
		//data type
		
		int number = 324;
		
		float decimalValue;
		
		double decimalValue1;
		
		char ch;
		
		boolean flag;
		
		// array syntax
		// datatype variableName[] = new datatype[size];
		
		int numberArray[] = new int[5];
		
		numberArray[0] = 1;
		numberArray[1] = 2;
		
		String names[] = {"Shubham","Rahul","Mayur"};
		
		System.out.println(names[0]);
		
		System.out.println(numberArray[0]);
		
		//Basic Operators
		
		
		//arithmatica opration 
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a/b);
//		System.out.println(a*b);
//		System.out.println(a%b);
		
		//comparision or relation operator
//		System.out.println("Below Relation Operator output");
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a>=b);
//		System.out.println(a<=b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
		
		//Logica Operator && || !
		
		
		//decision making
		//if(condition)
		int a = 5777;
		int b = 55;
		int c = 23;
		
		if(a>b) {
			System.out.println("A is gearter");
		}else {
			System.out.println("B is greater");
		}
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}else if(b>a && b>c) {
			System.out.println("B is greater");
		}else {
			System.out.println("C is greater");
		}
		
		int key = 8;
		switch (key) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;
		case 5:
			System.out.println("Case 5");
			break;
		case 6:
			System.out.println("Case 6");
			break;
		case 7:
			System.out.println("Case 7");
			break;
		case 8:
			System.out.println("Case 8");
			break;
		default:
			System.out.println("Case defualt");
			break;
		}
		
		Random random = new Random();
		random.doubles();
		
		Math.random();
	}
}