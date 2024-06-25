package com.DsRepresentation;

import java.util.Arrays;

public class QueueDynamicArray<T> {

	Object[] data;
	int front;
	int rear;

	public QueueDynamicArray() {
		data = new Object[1];
		front = -1;
		rear = -1;
	}

	public int getSize() {
		return data.length;
	}

	@SuppressWarnings("unchecked")
	public T getValue(int index) {
		return (T) data[index];
	}

	public void queue(Object element) {
		enesureCapacity(rear + 2);
		rear = rear + 1;
		data[rear] = element;
		if (front == -1) {
			front = 0;
		}
	}

	private void enesureCapacity(int mincapacity) {
		int oldcapacity = getSize();
		if (mincapacity > oldcapacity) {
			int newcapacity = 2 * oldcapacity;
			if (newcapacity < mincapacity) {
				newcapacity = mincapacity;
			}
			data = Arrays.copyOf(data, newcapacity);
		}
	}

	@SuppressWarnings("unchecked")
	public T dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Stack is Empty ");
			return null;
		}
		T item = (T) data[front];
		front = front + 1;
		return item;
	}

	public boolean isQueueEmpty() {
		return (front == -1 || front > rear);
	}

}
