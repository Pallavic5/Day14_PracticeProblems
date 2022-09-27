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

	public void removeFirst() {
		if (head == null) {
			System.out.println("List is Empty!!");
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			temp = null;
		}
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("List is empty!!");
		} else {
			Node temp = head;
			Node prev = null;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			temp = null;
		}
	}

	public void search(int data) {
		Node temp = head;
		int i = 1;
		boolean isFound = false;
		if (head == null) {
			System.out.println("List is empty!!");
		} else {
			while (temp != null) {
				if (temp.data == data) {
					isFound = true;
					break;
				}
				i++;
				temp = temp.next;
			}
		}
		if (isFound)
			System.out.println("Data found at the position: " + i);
		else
			System.out.println(data + " not found");
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
