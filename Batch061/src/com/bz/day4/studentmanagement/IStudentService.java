package com.bz.day4.studentmanagement;

import java.util.List;

import com.bz.day4.exceptionhandling.custom.CustomException;

public interface IStudentService {

	int addNewStudent(Student student);
	Student findStudentById(int id) throws CustomException.StudentNotFoundException;
	List<Student> findAllStudents() throws CustomException.DataNotFoundException;
	void setDoa(IStudentDoa doa);
}
