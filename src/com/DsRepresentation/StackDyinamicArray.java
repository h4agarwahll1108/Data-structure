package com.DsRepresentation;

import java.util.Arrays;

public class StackDyinamicArray<T> {
	Object[] data;
	int top;

	public StackDyinamicArray() {
		data = new Object[1];
		top = -1;
	}

	public int getSize() {
		return data.length;
	}

	@SuppressWarnings("unchecked")
	public T getValue(int index) {
		return (T) data[index];
	}

	public void push(Object element) {
		ensureCapicity(top + 2);
		top = top + 1;
		data[top] = element;

	}

	public void ensureCapicity(int mincapacity) {
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
	public T pop() {
		if (isStackEmpty()) {
			System.out.println("Stack Is Empty ");
			return null;
		}
		T item = (T) data[top];
		top = top - 1;
		return item;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

}
