package com.bridgelabz.linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		
		LinkedListOperation list = new LinkedListOperation();
		list.insertFirst(70);
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(56);
		System.out.println("Linkedlist Node");
		list.display();
		System.out.println();
		list.search(40);
		System.out.println();
		list.removeNthPosition(3);
		System.out.println("New LinkedList");
		list.display();
		System.out.println("\n");
		list.getSize();
	}
}
