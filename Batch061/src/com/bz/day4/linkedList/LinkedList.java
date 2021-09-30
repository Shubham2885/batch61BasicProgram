package com.bz.day4.linkedList;

class Node <E>{
	E data;
	Node<E> nextAddress;
	public Node(E data) {
		this.data = data;
		this.nextAddress = null;
	}
}

public class LinkedList <E> implements List<E>, IStack<E>, IQueue<E>{
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
		System.out.println();
	}

	@Override
	public E pop() {
		Node temp = startingNode;
		Node perv = startingNode;
		while(temp.nextAddress != null) {
			perv = temp;
			temp = temp.nextAddress;
		}
		perv.nextAddress = null;
		return (E) temp.data;
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

	@Override
	public void deQueue() {
		Node temp = startingNode;
		startingNode = temp.nextAddress;
	}

	@Override
	public int size() {
		Node temp = startingNode;
		int count = 0;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.nextAddress;
			count ++;
		}
		return count;
	}

	@Override
	public boolean isEmply() {
		if(startingNode == null)
			return true;
		return false;
	}
}

//search(value) retrun boolean 
//size
//delete/remove