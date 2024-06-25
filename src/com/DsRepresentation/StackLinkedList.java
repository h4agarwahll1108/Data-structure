package com.DsRepresentation;

public class StackLinkedList<T> {

	NodeSingle top;

	public StackLinkedList() {
		top = null;
	}

	public void push(Object element) {
		NodeSingle newNode = new NodeSingle(element, null);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public T pop() {
		if (top == null) {
			System.out.println("Stack is empty ");
			return null;
		}
		@SuppressWarnings("unchecked")
		T item = (T) top.value;
		top = top.next;
		return item;

	}

}
