package com.bz.day4.linkedList;

import java.util.Date;

public class LinkListedDemo {

	public static void main(String[] args) {
		
//		Node node1 = new Node(1);
//		
//		
//		Node node2 = new Node(2);
//		
//		Node node3 = new Node(3);
//		Node node5 = new Node(5);
//		Node node4 = new Node(3948);
//		
//		node1.nextAddress = node2;
//		node2.nextAddress = node3;
//		node3.nextAddress = node4;
//		node4.nextAddress = node5;
//		
//		Node temp = node1;
//		
//		while(temp != null) {
//			System.out.print(temp.data + " -> ");
//			temp = temp.nextAddress;
//		}
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Shubham");
		linkedList.add("Sankal");
		linkedList.add("Manoj");
		linkedList.add("Saikat");
		linkedList.add("Ashvini");
		linkedList.add("Dinesh");
		linkedList.add("Shivani");
		linkedList.add("Mukesh");
		
		linkedList.printLinkedList();
		linkedList.pop();
		System.out.println("After deletion");
		linkedList.printLinkedList();
		linkedList.remove("Shubham");
		System.out.println();
		System.out.println("After fist deletion");
		linkedList.printLinkedList();
		linkedList.remove("Ashvini");
		
		System.out.println("After middle deletion");
		linkedList.printLinkedList();
	}
}
