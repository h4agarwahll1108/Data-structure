package com.DsRepresentation;

public class QueueArray<T> {
	Object[] queueArray;
	int size;
	int front;
	int rear;

	public QueueArray(int size) {
		this.size = size;
		queueArray = new Object[this.size];
		front = -1;
		rear = -1;
	}

	public void queue(Object element) {
		if (isQueueFull()) {
			System.out.println("Queue is Full ");
			return;
		}
		rear = rear + 1;
		queueArray[rear] = element;
		if (front == -1) {
			front = 0;
		}
	}

	public boolean isQueueFull() {
		return (rear == size - 1);
	}

	@SuppressWarnings("unchecked")
	public T dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is Empty ");
			return null;
		}
		T item = (T) queueArray[front];
		front = front + 1;
		return item;
	}

	public boolean isQueueEmpty() {
		return (front == -1 || front > rear);
	}

}
