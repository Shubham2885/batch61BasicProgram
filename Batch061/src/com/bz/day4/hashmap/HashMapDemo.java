package com.bz.day4.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> studentData = new HashMap<String, String>();
		
		studentData.put("Shubham", "Address = At Post Khat, Tal Mouda, Dist Nagpur");
		studentData.put("Sankalp", "Address = Indor");
		studentData.put("Manoj", "Address = Latur");
		studentData.put("Dinesh", "Address = Dehli");
		studentData.put("Dinesh", "Address = Dehli");
		
		System.out.println(studentData);
		
		System.out.println(studentData.get("Shubham"));
	}
}
