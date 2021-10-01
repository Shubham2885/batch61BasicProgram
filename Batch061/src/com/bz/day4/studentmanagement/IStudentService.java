package com.bz.day4.studentmanagement;

import java.util.List;

public interface IStudentService {

	int addNewStudent(Student student);
	Student findStudentById(int id);
	List<Student> findAllStudents();
	void setDoa(IStudentDoa doa);
}
