package com.bridgelabz.linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		
		LinkedListOperation list = new LinkedListOperation();
		list.insertFirst(70);
		list.insertFirst(56);
		list.insertNthPosition(30, 2);
		list.display();
	}
}
