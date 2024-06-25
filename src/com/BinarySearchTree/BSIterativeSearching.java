package com.BinarySearchTree;

public class BSIterativeSearching {
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

	static int maxValueLeft(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int value = node.data;
		int left = maxValueLeft(node.left);
		int right = maxValueLeft(node.right);
		return Math.max(value, Math.max(left, right));
	}

	static int minValueRight(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int value1 = node.data;
		int leftmin = minValueRight(node.left);
		int rightmin = minValueRight(node.right);
		return Math.min(value1, Math.min(leftmin, rightmin));
	}

	static int isBsttree(Node node) {
		if (node == null) {
			return 1;
		}
		if (node.left != null && maxValueLeft(node.left) > node.data) {
			return 0;
		}
		if (node.right != null && minValueRight(node.right) < node.data) {
			return 0;
		}
		if (isBsttree(node.left) != 1 || isBsttree(node.right) != 1) {
			return 0;
		}
		return 1;
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
		System.out.println(isBsttree(root));
		if (isBsttree(root) == 1) {
			System.out.println("YES Tree isBST");
		} else {
			System.out.println("NO Tree isBST");
		}

	}

}
