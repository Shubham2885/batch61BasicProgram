package com.bz.day4.linkedList;

class Node {
	int data;
	Node nextAddress;
	public Node(int data) {
		this.data = data;
		this.nextAddress = null;
	}
}

public class LinkedList {
	static Node startingNode;
	
	public static void add(int data) {
		Node newNode = new Node(data);
		
		if(startingNode == null) {
			startingNode = newNode;
		}else {
			Node temp = startingNode;
			while(temp.nextAddress != null) {
				temp = temp.nextAddress;
			}
			temp.nextAddress = newNode;
		}
	}
	
	public static void printLinkedList() {

		Node temp = startingNode;
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.nextAddress;
		}
	}
}

//search(value) retrun boolean 
//size
//delete/remove