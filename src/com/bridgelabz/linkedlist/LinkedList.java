package com.bridgelabz.linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		
		LinkedListOperation list = new LinkedListOperation();
		list.insertFirst(70);
		list.insertFirst(30);
		list.insertFirst(56);
		System.out.println("Linkedlist Node");
		list.display();
		System.out.println();
		list.removeLast();
		System.out.println("\nLast Node Deleted");
		list.display();
	}
}
