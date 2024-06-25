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
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next= newNode;

		}
	}

	public void delete() {
		//[ System.out.println("Node Deleted from frist");
		head = head.next;
	}

	@SuppressWarnings("unchecked")
	public void display() {

		NodeSingle n = head;
		while (n != null) {
			System.out.println("Node Added in the first: " + (T) n.value);
			n = n.next;
		}

	}

}
 