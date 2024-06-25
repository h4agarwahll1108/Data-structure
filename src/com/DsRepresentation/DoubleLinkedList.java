package com.DsRepresentation;

public class DoubleLinkedList<T> {
	NodeDouble head;

	public DoubleLinkedList() {
		head = null;
	}

	public void add(Object value) {
		NodeDouble newNode = new NodeDouble(value, null, null);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.next = newNode;
			head = newNode;
		}
	}

	public void delete() {
		System.out.println("Node Deleted from the start");
		head = head.next;
		head.previous = null;
	}

	@SuppressWarnings("unchecked")
	public void display() {
		NodeDouble n = head;
		while (n != null) {
			System.out.println("Node created from frist " + (T) n.value);
			n = n.next;
		}
	}

}
