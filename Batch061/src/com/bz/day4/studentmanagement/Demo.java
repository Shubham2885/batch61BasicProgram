package com.bz.day4.studentmanagement;


public class Demo {

	public static void main(String[] args) {
		IStudentService iStudentService = new StudentServiceImpl();
		IStudentDoa doa = new StudentDoaImpl();
		iStudentService.setDoa(doa);
		
		try {
//			System.out.println(iStudentService.findStudentById(24));
			System.out.println(iStudentService.findAllStudents());
		} catch (Exception e) {
			System.out.println("Exception handled :: ..."+e);
		}
		System.out.println("Proceed...");
	}
}
