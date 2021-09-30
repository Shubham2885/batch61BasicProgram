package com.bz.day4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
//		String pinCode = "110234";
		
//		String firstName = "Sdfksdsdsdfsf";
		
		String mobileNo = "shubham.%@gmail.comffd";
		//{} use for length of the string 
		//^ is use for start of the string
		//$ is use for end of the string
		//[] is perticular pattern 0-9 use digit
		//[] with A-Z 
		//[] with a-z
		//[] with A-Za-z
		
		// pic code patther = ^[1-9]{2}[0-9]{4}$
		//first name ^[A-Z]{1}[a-z]{1,9}$
		//mobile no = ^[6-9]{1}[0-9]{9}$
		Pattern pattern = Pattern.compile("^[a-z.#%]+@[a-z]+.+[a-z]{2,3}$");
		Matcher matcher = pattern.matcher(mobileNo);
//		
//		if(matcher.find()) {
//			System.out.println("valid pincode");
//		}else {
//			System.out.println("Invalid Pincode");
//		}
		
		if(matcher.find()) {
			System.out.println("valid mobileNo");
		}else {
			System.out.println("Invalid mobileNo");
		}
		
	}
}
