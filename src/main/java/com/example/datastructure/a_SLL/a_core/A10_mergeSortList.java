package com.example.datastructure.a_SLL.a_core;

import com.example.datastructure.a_SLL.MyLinkedList;
import com.example.datastructure.a_SLL.MyLinkedList.Node;


public class A10_mergeSortList {
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(15);
		
        printList(list.head);
        list.head = mergeSort(list.head);
		printList(list.head);
	}
	
	
	private static Node mergeSort(Node n) {
		if (n == null || n.next == null) {
			return n;
		}

		Node middle = getMiddle(n);				// get the middle element of the list
		Node nextOfMiddle = middle.next;		// it will become the starting point of right part of the list

		middle.next = null;						// it divides the list in 2 parts (left list & right list)
		
		Node left = mergeSort(n);				// apply mergeSort on left list
		Node right = mergeSort(nextOfMiddle);	// apply mergeSort on right list

		Node newHead = merge(left, right);		// merge left list & right list
		return newHead;
	}
	
	
	private static Node merge(Node a, Node b) {
		Node head = null;
		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.data <= b.data) {
			head = a;
			head.next = merge(a.next, b);
		}
		else {
			head = b;
			head.next = merge(a, b.next);
		}
		return head;
	}
	
	
	
	
	private static Node getMiddle(Node n) {
		if (n == null)
			return n;

		Node slow = n; 
		Node fast = n;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private static void printList(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
}
