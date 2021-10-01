package com.bz.day4.studentmanagement;

import java.util.List;

public interface IStudentDoa {

	int addNewStudent(Student student);
	List<Student> findAllStudents();
}
