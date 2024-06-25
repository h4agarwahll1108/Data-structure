package com.DsRepresentation;

public class StackArray<T> {

	Object[] stackArray;
	int size;
	int top;

	public StackArray(int size) {
		this.size = size;
		stackArray = new Object[this.size];
		top = -1;
	}

	public void push(Object element) {
		if (isStackFull()) {
			System.out.println("Stack is Full");
			return;
		}
		top = top + 1;
		stackArray[top] = element;
	}

	public boolean isStackFull() {
		return (top == size - 1);
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		if (isStackEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T item = (T) stackArray[top];
		top = top - 1;
		return item;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

}
