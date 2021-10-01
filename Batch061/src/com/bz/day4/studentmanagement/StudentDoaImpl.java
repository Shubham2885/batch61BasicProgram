package com.bz.day4.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentDoaImpl implements IStudentDoa{
	List<Student> students = new ArrayList<Student>();;

	@Override
	public int addNewStudent(Student student) {
		students.add(student);
		return students.size();
	}

	@Override
	public List<Student> findAllStudents() {
		
		Student student1 = new Student(2, "mayur", "mane");
		Student student2 = new Student(3, "Manoj", "mane");
		Student student3 = new Student(4, "Sankalp", "mane");
		Student student4 = new Student(5, "Rahul", "mane");
		students.add(student4);
		students.add(student3);
		students.add(student1);
		students.add(student2);
		return students;
	}
}
