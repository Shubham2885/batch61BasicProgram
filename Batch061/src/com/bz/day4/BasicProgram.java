package com.bz.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
		
		//assignment
	a = 29347;
		//loops
		
		// 1 for 2 while 3 do _ while
		
//		for(initilizatioin ; condition ; increament/decreament)
			
//		for(int i = 0; i==10; ) {
//			System.out.println(i);
//			i++;
//		}
		
//		int j=0;
//		while(j<10) {
//			System.out.println(j);
//			j = 9;
//		}
//		Scanner scanner = new Scanner(System.in);
//		int choose = 1;
//		do {
//			System.out.println("Enter Number for factorial");
//			int numberF = scanner.nextInt();
//			int fact = 1;
//			for(int i = 1;i<=numberF; i++) {
//				fact = fact * i;
//			}
//			
//			System.out.println("Factorial of Number is = "+ fact);
//			System.out.println("Do you want to continue : press 1 to contieu or");
//			choose = scanner.nextInt();
//		}while(choose == 1);
		
		//increment and decrement
	
		int x = 5;
		
		System.out.println("x = "+x);
		 //x = x+1; // post increment
		System.out.println("post dec x = "+x--);
		System.out.println("x = "+x);
		
		--x;
		
		System.out.println("x = "+x++);
		System.out.println("x = "+x);
		
		int row = 3;
		int col = 3;
		//declare
		int twoDarray[][] = new int[row][col];
		
		int anther2DArray[][] = {
				{1,2,3,33},{4,5,6,44},{7,8,9,66}	
		};
		
		//printing the row
		for(int i=0;i<row;i++) {
			for(int j=0;j<col+1;j++) {
				System.out.print("["+i+"]["+j+"] = "+anther2DArray[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				twoDarray[i][j] = (j+1)* 5;
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("["+i+"]["+j+"] = "+twoDarray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
