package com.BinarySearchTree;

public class BSTMinValue {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	static Node newNode(int item) {
		Node temp = new Node(item);
		temp.data = item;
		temp.left = temp.right = null;
		return temp;
	}

	static Node insertNode(Node node, int data) {
		if (node == null) {
			return newNode(data);
		}
		if (data < node.data) {
			node.left = insertNode(node.left, data);
		} else if (data > node.data) {
			node.right = insertNode(node.right, data);
		}
		return node;
	}

	// -----------------------------------------------------------------------
	
	static int minValueOfBst(Node root) {

		Node curr = root;
		while (curr.left != null) {
			curr = curr.left;
		}
		return curr.data;
	}
	public static void main(String[] args) {

		Node root = null;
		root = BSTMinValue.insertNode(root, 50);
		insertNode(root, 30);
		insertNode(root, 20);
		insertNode(root, 40);
		insertNode(root, 70);
		insertNode(root, 60);
		insertNode(root, 80);
		System.out.println(root.data);
		System.out.println(minValueOfBst(root));

	}

}
