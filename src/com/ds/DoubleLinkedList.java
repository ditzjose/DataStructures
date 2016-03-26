package com.ds;
import static java.lang.System.*;
// Stack structure implemented using double linked list
//
class Node {
	Node() {

	}

	Node(int data) {
		this.data = data;
	}

	Node previous;
	Node next;
	Integer data;
}

class DLL {
	Node head;
	Node tail;

	void push(int val) {
		Node current = new Node(val);
		if (head == null) {
			head = current;
			tail = head;
		} else {
			current.previous = head;
			head.next = current;
			head = current;
			
		}
	}

	String pop() {
		String result = null;
		if (head == null) {
			result = "Empty";
			return result;
		} else {
			head = head.previous;
			if (head == null) {
				result = "Empty";
				return result;
			} else {
				result = head.data + "";
				return result;
			}
		}
	}
	
	void increment(int length,int d)
	{
		Node temp = tail;
		for(int i = 1; i <= length ; i++)
		{
			temp.data = temp.data  +d;
			temp = temp.next;
		}
	}
}

public class DoubleLinkedList {
	public static void main(String... cmd)
	{
		DLL doublell = new DLL();
		doublell.push(10);
		doublell.push(20);
		doublell.push(30);
		doublell.push(40);
		doublell.push(50);
		doublell.push(60);
		doublell.increment(5,100);
		out.println(doublell.pop());
		out.println(doublell.pop());
		out.println(doublell.pop());
		out.println(doublell.pop());
	}
}
