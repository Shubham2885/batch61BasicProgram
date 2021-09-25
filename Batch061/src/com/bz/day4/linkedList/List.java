package com.bz.day4.linkedList;

public interface List <E> {

	//add data in linkedlist 
	//also used for stack push operation
	void add(E data);
	void printLinkedList();
	
	void remove(E data);
	
	int size();
	
}
