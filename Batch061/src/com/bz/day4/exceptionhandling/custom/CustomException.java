package com.bz.day4.exceptionhandling.custom;

public class CustomException extends Exception{


//	public CustomException(String message) {
//		super(message);
//	}
	
	public static class StudentNotFoundException extends RuntimeException{
		public StudentNotFoundException(String message) {
				super(message);
		}
	}
	
	public static class DataNotFoundException extends RuntimeException{
		public DataNotFoundException(String message) {
				super(message);
		}
	}
}
