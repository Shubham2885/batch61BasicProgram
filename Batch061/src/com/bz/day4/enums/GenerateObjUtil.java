package com.bz.day4.enums;

import com.bz.day4.Account;
import com.bz.day4.Vahicle;
import com.bz.day4.arraydem.Student;

public class GenerateObjUtil {

	public static Object getObject(Demo demo) {
		switch (demo) {
		case ACCOUNT:
			 return new Account("Shubham","IT",1234,345);
		case STUDENT:
			return new Student("Shubham","",1);
		case VAHICALE:
			return new Vahicle();
		default:
			break;
		}
		
		return null;
	}
}
