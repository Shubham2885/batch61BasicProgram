package com.bz.day4.hashtable;

import com.bz.day4.linkedList.LinkedList;
import com.bz.day4.linkedList.List;
import com.bz.day4.utility.UtilScanner;

public class HashTableDemo {
	
	public static void addData(int data, Object object) {
		List<Integer> list = (List) object;
		list.add(data);
	}
	
	public static void print(int key, Object object) {
		List<Integer> list = (List) object;
		System.out.print("Key "+key +"=> ");
		list.printLinkedList();
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the no of keys :: ");
		int keys = UtilScanner.getInt("Key");
		
		int inputArray[] = {23,54,67,73,23,7,3,23,78,33,49,99,53,75,26,87,25};
		
		Object objs[] = new Object[keys];
		
		for(int i=0;i<keys;i++) {
			objs[i] = new LinkedList<Integer>();
		}
		
		for(int i=0; i<inputArray.length;i++) {
			int key = inputArray[i] % keys;
			addData(inputArray[i],objs[key]);
		}
		
		for(int i=0;i<keys;i++) {
			print(i, objs[i]);
			System.out.println();
		}
	}	
}
