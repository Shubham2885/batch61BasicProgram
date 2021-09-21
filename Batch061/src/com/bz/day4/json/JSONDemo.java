package com.bz.day4.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bz.day4.arraydem.Student;
import com.google.gson.Gson;

public class JSONDemo {

	public static void main(String[] args) throws IOException {
		
		Student student1 = new Student("Shubham","Chavan",1);
		Student student2 = new Student("Anmol","Chavan",2);
		Student student3 = new Student("Rahul","mane",3);
//		Student student4 = new Student("sdf","sdf",4);
//		Student student5 = new Student("xcv","wer",5);
//		Student student6 = new Student("xcv","wr",6);
//		Student student7 = new Student("xcv","wr",6);
		
		//List of Students
		List<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
//		students.add(student4);
//		students.add(student5);
//		students.add(student6);
//		students.add(student7);
		
		
		Gson gson = new Gson();
		
		String jsonString = gson.toJson(students);
		
		System.out.println(jsonString);
		
		File file = new File("F:\\student.json");
		
		FileWriter fileWriter = new FileWriter(file);
		
		fileWriter.write(jsonString);
		
		fileWriter.close();
	}
}
