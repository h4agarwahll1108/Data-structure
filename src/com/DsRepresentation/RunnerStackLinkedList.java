package com.DsRepresentation;

public class RunnerStackLinkedList {

	public static void main(String[] args) {
		StackLinkedList<Integer> sl = new StackLinkedList<>();
		sl.push(11);
		sl.push(12);
		sl.push(13);
		sl.push(14);
		sl.push(15);
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());

	}

}
