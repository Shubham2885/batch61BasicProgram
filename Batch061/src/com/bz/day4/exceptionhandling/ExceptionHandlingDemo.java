package com.bz.day4.exceptionhandling;

import com.bz.day4.studentmanagement.Student;
import com.bz.day4.utility.UtilScanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Student student = null;
		
		try {
			System.out.println(student.getFname());
		}catch (NullPointerException e) {
			System.out.println("Exception handled :: "+e);
		}
		
		System.out.println("Proceed...");
		int a[] = {1,2,3,7,8};
		int x = UtilScanner.getInt("X Value");
		int y = UtilScanner.getInt("Y value");
		int z = 8;
		
		try {
			z = x/y;
			System.out.println(a[z]);
		}catch (ArithmeticException e) {
			System.out.println("Exception handled :: "+e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled :: "+e);
		}finally {
			System.out.println("finally block: ");
		}
		System.out.println(z);
		
//		int a[] = {1,2,3,7,8};
//		try {
//			System.out.println(a[8]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception handled :: "+e);
//			System.out.println(a[3]);
//		}
		
	}
}
