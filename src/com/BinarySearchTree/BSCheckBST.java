package com.BinarySearchTree;

public class BSCheckBST {
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

	static boolean searchData(Node root, int data) {

		while (root != null) {
			if (data > root.data) {
				root = root.right;
			} else if (data < root.data) {
				root = root.left;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Node root = null;
		root = insertNode(root, 50);
		insertNode(root, 30);
		insertNode(root, 20);
		insertNode(root, 40);
		insertNode(root, 70);
		insertNode(root, 60);
		insertNode(root, 80);
		System.out.println(root.data);
		if (searchData(root, 30)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
