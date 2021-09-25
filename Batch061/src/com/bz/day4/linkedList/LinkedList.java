package com.bz.day4.linkedList;

class Node <E>{
	E data;
	Node<E> nextAddress;
	public Node(E data) {
		this.data = data;
		this.nextAddress = null;
	}
}

public class LinkedList <E> implements List<E>{
	Node startingNode;

	@Override
	public void add(E data) {  //push //use Enqueue
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

	@Override
	public void printLinkedList() {

		Node temp = startingNode;

		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.nextAddress;
		}
	}

	@Override
	public void pop() {
		Node temp = startingNode;
		Node perv = startingNode;
		while(temp.nextAddress != null) {
			perv = temp;
			temp = temp.nextAddress;
		}
		perv.nextAddress = null;
	}

	@Override
	public void remove(E inputData) {
		Node temp = startingNode;
		Node perv = startingNode;
		
		if(temp.data.equals(inputData)) {
			startingNode = temp.nextAddress;
		}else {
			while(temp.nextAddress != null) {
				perv = temp;
				temp = temp.nextAddress;
				if(temp.data.equals(inputData)) {
					perv.nextAddress = temp.nextAddress;
					break;
				}
			}
		}
		
	}
	
	
}

//search(value) retrun boolean 
//size
//delete/remove