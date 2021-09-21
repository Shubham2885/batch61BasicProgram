package com.bz.day4.arraydem;

import java.util.Scanner;

import com.bz.day4.utility.UtilScanner;

public class Main {

	public static void main(String[] args) {
		int integerArray[] = {1,2,3,4,5};
		
		String string[] =  {"Shubham","Rahul"};// new String[10];
		
//		string[0] = new String("Abc");
		
//		System.out.println(string[0]);
		
		Student classA[] = new Student[2];
		
//		Student classB[] = new Student[4];
//		
//		Student classC[] = new Student[4];
//		
//		Student classD[] = new Student[4];
		
		for(int i=0;i<2;i++) {
			Student student = new Student("","",1);
			String fname = UtilScanner.getString("fname");
			String lname =UtilScanner.getString("lname");
			student.setFname(fname);
			student.setLname(lname);
			classA[i] = student;
//			classB[i] = new Student("fnameB"+i, "lnameB"+i);
//			classC[i] = new Student("fnameC"+i, "lnameC"+i);
//			classD[i] = new Student("fnameD"+i, "lnameD"+i);
		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println(students[i].toString());
//			System.out.println(students1[i].toString());
//		}
		
		Object obj[] = {integerArray,string,classA}; 	//new Object[4];
		
//		obj[0] = integerArray;
//		obj[1] = string;
//		obj[2] = classA;
//		obj[3] = classD;
		
		ArrayDemo.showArrayDetails(obj);
//		Student studObj[] = (Student[]) obj[0];
//		
//		for(int i=0;i<10;i++) {
//			System.out.println(studObj[i].toString());
////			System.out.println(students1[i].toString());
//		}
		
	}
}
