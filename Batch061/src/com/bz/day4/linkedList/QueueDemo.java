package com.bz.day4.linkedList;

public class QueueDemo {

	public static void main(String[] args) {
		
		IQueue<String> queue = new LinkedList<String>();
		
		queue.add("Shubham");
		queue.add("Sankal");
		queue.add("Manoj");
		queue.add("Saikat");
		queue.add("Ashvini");
		queue.add("Dinesh");
		queue.add("Shivani");
		queue.add("Mukesh");
		
		System.out.println("Queue List");
		queue.printLinkedList();
		
		System.out.println("Size of Queue :: "+queue.size());
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
		
		queue.printLinkedList();
	}
}
