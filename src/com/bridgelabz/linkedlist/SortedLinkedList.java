package com.bridgelabz.linkedlist;

public class SortedLinkedList implements Comparable<SortedLinkedList> {

	int data;
	Node next;

	public SortedLinkedList(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SortedLinkedList [data=" + data + ", next=" + next + "]";
	}

	@Override
	public int compareTo(SortedLinkedList obj) {
		if (this.getData() > obj.getData()) {
			return 1;
		} else {
			return -1;
		}

	}

}
