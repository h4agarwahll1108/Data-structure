package com.DsRepresentation;

public class RunnerQueueLinkedList {

	public static void main(String[] args) {
		QueueLinkedList<Integer> ql = new QueueLinkedList<>();
		ql.queue(11);
		ql.queue(12);
		ql.queue(13);
		ql.queue(14);
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());

	}

}
