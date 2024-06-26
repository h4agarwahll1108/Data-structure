package com.DsRepresentation;

public class LinkedList<T> {
	NodeSingle head;

	public LinkedList() {
		head = null;
	}

	
	public void addFirst(Object value) {
		NodeSingle newNode = new NodeSingle(value, null);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	
	public void addLast(Object value) {
		NodeSingle newNode = new NodeSingle(value, null);
		if (head == null) {
			head = newNode;
		} else {
			NodeSingle temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

		}
	}

	
	public void delete() {
		head = head.next;
	}

	
	public void display() {
		NodeSingle n = head;
		while (n != null) {
			System.out.println("Node Value: " + (T) n.value);
			n = n.next;
		}
	}

	
	public static boolean areInSameLinkedList(NodeSingle node1, NodeSingle node2) {
		if (node1 == null || node2 == null) {
			return false;
		}
		NodeSingle current1 = node1;
		while (current1.next != null) {
			current1 = current1.next;
		}
		NodeSingle current2 = node2;
		while (current2.next != null) {
			current2 = current2.next;
		}
		return current1 == current2;
	}

	
	public void addAtPosition(Object value, int position) {
		NodeSingle newNode = new NodeSingle(value, null);
		if (head == null) {
			head = newNode;
		} else {
			NodeSingle temp = head;
			int currentPosition =0;
			while (temp.next != null && currentPosition<position-1) {
				temp = temp.next;
				currentPosition++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
}
