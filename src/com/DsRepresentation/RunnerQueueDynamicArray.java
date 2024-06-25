package com.DsRepresentation;

public class RunnerQueueDynamicArray {

	public static void main(String[] args) {
		QueueDynamicArray<Integer> qd = new QueueDynamicArray<>();
		System.out.println("Size: " + qd.getSize());
		qd.queue(12);
		System.out.println("Size: " + qd.getSize());
		qd.queue(15);
		System.out.println("Size: " + qd.getSize());
		qd.queue(16);
		System.out.println("Size: " + qd.getSize());
		qd.queue(18);
		System.out.println("Size: " + qd.getSize());
		qd.queue(17);
		System.out.println("Size: " + qd.getSize());

		System.out.println();
		while (!qd.isQueueEmpty()) {
			System.out.println(qd.dequeue());
		}

	}

}
