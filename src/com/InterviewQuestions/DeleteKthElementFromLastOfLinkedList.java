package com.InterviewQuestions;

public class DeleteKthElementFromLastOfLinkedList {
	static class Node {

		Object value;
		Node next;

		public Node(Object value, Node next) {
			this.value = value;
			this.next = null;
		}
	}

	static class LinkedList<T> {
		Node head;

		public LinkedList() {
			head = null;
		}

		public void addFirst(Object value) {
			Node newNode = new Node(value, null);
			if (head == null) {
				head = newNode;
			} else {
				newNode.next = head;
				head = newNode;
			}
		}

		public void delete(Node root, int k) {
			Node slowNode = root;
			Node fastNode = root;
			System.out.println();
			while (k > 0 && fastNode.next != null) {
				fastNode = fastNode.next;
				System.out.println(fastNode.value);
				k--;
			}
			if (k==1) {
				slowNode = slowNode.next;
				head = head.next;

			} else {
				while (fastNode.next != null) {

					slowNode = slowNode.next;
					fastNode = fastNode.next;

				}
				slowNode.next = slowNode.next.next;
			}
		}

		@SuppressWarnings("unchecked")
		public void display() {

			Node n = head;
			while (n != null) {
				System.out.println("Node Added : " + (T) n.value);
				n = n.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.addFirst(1);
		ls.addFirst(2);
		ls.addFirst(3);
		ls.addFirst(4);
		ls.addFirst(5);
		ls.addFirst(6);
		ls.display();
		ls.delete(ls.head, 5);
		System.out.println();
		ls.display();

	}

}
