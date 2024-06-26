package com.DsRepresentation;

public class FindTwoNodesBelongToSameLinkedList {

	 public static void main(String[] args) {
	        // Creating two linked lists
	        LinkedList<Integer> list1 = new LinkedList<>();
	        list1.head = new NodeSingle(1,null);
	        list1.head.next = new NodeSingle(2,null);
	        list1.head.next.next = new NodeSingle(3,null);
	        list1.display();

	        LinkedList<Integer> list2 = new LinkedList<>();
	        list2.head = new NodeSingle(4,null);
	        list2.head.next = new NodeSingle(5,null);
	        list2.head.next.next = new NodeSingle(6,null);
	        list2.display();

	        // Nodes to check
	        NodeSingle node1 = list1.head.next; // Node with data 2
	        NodeSingle node2 = list1.head.next.next; // Node with data 3
	        NodeSingle node3 = list2.head.next; // Node with data 5

	        // Test the method
	        System.out.println(LinkedList.areInSameLinkedList(node1, node2)); // true
	        System.out.println(LinkedList.areInSameLinkedList(node1, node3)); // false
	    }

}
