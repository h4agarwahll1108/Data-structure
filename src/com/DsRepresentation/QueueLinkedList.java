package com.DsRepresentation;

public class QueueLinkedList<T> {
	NodeDouble rear; // next
	NodeDouble front; // previous

	public QueueLinkedList() {
		rear = null;
		front = null;

	}

	public void queue(Object element) {
		NodeDouble newNode = new NodeDouble(element, null, null);
		if (rear == null || front == null) {
			rear = newNode;
			front = newNode;
		} else {
			newNode.next = null;
			newNode.previous = rear;
			rear.next = newNode;
			rear = newNode; // [previous|value|null]-->rear will point newNode
		}
	}

	@SuppressWarnings("unchecked")
	public T dequeue() {
		if (rear == null || front == null) {
			System.out.println("Queue is Empty ");
			return null;
		}
		T item = (T) front.value;
		front = front.next;
		if (front != null) {
			front.previous = null;
		}
		return item;
	}

}
