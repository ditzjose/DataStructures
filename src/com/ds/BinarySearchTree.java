package com.ds;

import static java.lang.System.*;
// Balanced Binary Tree (Height of the left sub) - (Height of the right sub) = 1

// In the HashMap In the bucket in Jva 8 Self Balanced Binary Search Tree is used
class Node1 {
	int data;
	Node1 left;
	Node1 right;

	Node1() {
	}

	Node1(int data) {
		this.data = data;
	}

}
// How much memory cells that will be used for the given algorithm is called as Time Complexity.
class BST {
	Node1 root;

	void push(int val) {
		Node1 current = new Node1(val);
		if (root == null) {
			root = current;
			out.println(root.data);
		} else {
			Node1 focus = root;
			while (true) {
				Node1 parent = focus;
				if (focus.data < val) {
					focus = focus.right;
					if (focus == null) {
						parent.right = current;
						out.println(parent.right.data);
						break;
					}
				} else {
					focus = focus.left;
					if (focus == null) {
						parent.left = current;
						out.println(parent.left.data);
						break;
					}
				}
			}
		}
	}

	int search(int val) {
		int count = 0;
		if (root.data == val) {
			return count;
		} else {
			Node1 focus = root;
			while (true) {
				count++;
				// Node1 parent = focus;
				if (focus.data < val) {
					focus = focus.right;
					if (focus.data == val) {
						break;
					}

				} else {
					focus = focus.left;
					if (focus.data == val) {
						break;
					}
				}

			}
			return count;
		}

	}
}

public class BinarySearchTree {
	public static void main(String... command) {
		BST tree = new BST();
		tree.push(10);
		tree.push(20);
		tree.push(30);
		tree.push(40);
		tree.push(50); // this example shows the worst case scenario
		out.println(tree.search(50));
		/*
		 Binary search tree best case(  O(logN)  ) and worst case( O(N)  )
		 */
	}
}
