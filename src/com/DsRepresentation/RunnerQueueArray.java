package com.DsRepresentation;

public class RunnerQueueArray {

	public static void main(String[] args) {
		QueueArray<Integer> qa = new QueueArray<>(4);
		qa.queue(11);
		qa.queue(12);
		qa.queue(13);
		qa.queue(14);
		qa.queue(15); //queue is full

		while (!qa.isQueueEmpty()) {
			System.out.println(qa.dequeue());
		}
		qa.dequeue();

	}

}
