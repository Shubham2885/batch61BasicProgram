package com.bz.day4.enums;

import com.bz.day4.Account;
import com.bz.day4.arraydem.Student;

public class MainGenerateObjDemo {

	public static void main(String[] args) {
		Object obj = GenerateObjUtil.getObject(Demo.STUDENT);
		
		Student std = (Student) obj;
		
		System.out.println(std);
		
	}
}
