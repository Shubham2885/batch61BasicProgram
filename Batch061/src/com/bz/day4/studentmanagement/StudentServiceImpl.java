package com.bz.day4.studentmanagement;

import java.util.ArrayList;
import java.util.List;

import com.bz.day4.exceptionhandling.custom.CustomException;

public class StudentServiceImpl implements IStudentService  {
	
	IStudentDoa doa;

	@Override
	public void setDoa(IStudentDoa doa) {
		this.doa = doa;
	}

	@Override
	public int addNewStudent(Student student) {
		return doa.addNewStudent(student);
	}

	@Override
	public Student findStudentById(int id) throws CustomException.StudentNotFoundException, NullPointerException{
		List<Student> students = doa.findAllStudents();
		for(int i=0;i<students.size();i++) {
			Student student = students.get(i);
			if(student.getId() == id) {
				return student;
			}
		}
		throw new CustomException.StudentNotFoundException("Student Not Found");
	}

	@Override
	public List<Student> findAllStudents() throws CustomException.DataNotFoundException{
		List<Student> students = doa.findAllStudents();
		if(students.isEmpty()) {
			throw new CustomException.DataNotFoundException("Data Not Found");
		}
		return students;
	}

}
