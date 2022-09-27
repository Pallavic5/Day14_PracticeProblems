package com.bridgelabz.linkedlist;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListOperation {
	Node head;
	static int counter = 0;

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		counter++;
	}

	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		counter++;
	}

	public void insertNthPosition(int data, int pos) {
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty!!");
		} else if (pos <= 0 || pos > counter) {
			System.out.println("Invalid Position!!");
		} else if (pos == 1) {
			insertFirst(data);
		} else {
			Node temp = head;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty!!");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
		}
	}
}
