package com.bz.day4.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//List is interface and ArrayList is class
		List<String> strings = new ArrayList<String>();
		
		strings.add("Shubham");
		strings.add("sdf");
		strings.add("fw");
		strings.add("ew");
		strings.add("wer");
		strings.add("esdf");
		strings.add("Shubsdham");
		strings.add("sd");
		System.out.println(strings);
		
		System.out.println(strings.get(3));
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Shubham");
		arrayList.add("sdf");
		arrayList.add("fw");
		arrayList.add("ew");
		arrayList.add("wer");
		arrayList.add("esdf");
		arrayList.add("Shubsdham");
		arrayList.add("sd");
		
		System.out.println(arrayList);
	}
}
