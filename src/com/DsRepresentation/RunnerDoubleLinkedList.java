package com.DsRepresentation;

public class RunnerDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList<String> ds = new DoubleLinkedList<String>();
		ds.add("Hrashit");
		ds.add("Seema");
		ds.add("Sunny");
		ds.add("Aman");
		ds.display();
		ds.delete();
		ds.display();
	}

}
