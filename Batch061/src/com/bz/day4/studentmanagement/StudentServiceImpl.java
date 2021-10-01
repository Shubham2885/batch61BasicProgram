package com.bz.day4.studentmanagement;

import java.util.ArrayList;
import java.util.List;

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
	public Student findStudentById(int id) {
		List<Student> students = doa.findAllStudents();
		for(int i=0;i<students.size();i++) {
			Student student = students.get(i);
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Student> findAllStudents() {
		return doa.findAllStudents();
	}

}
