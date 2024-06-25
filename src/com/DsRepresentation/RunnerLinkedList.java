package com.DsRepresentation;

public class RunnerLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.addFirst(3);
		ls.addFirst(2);
		ls.addLast(4);
		ls.addLast(5);
		ls.addLast(6);
		ls.addFirst(1);
		//ls.display();
		ls.delete();
		//ls.display();
		ls.delete();
		ls.display();

	}

} 
 