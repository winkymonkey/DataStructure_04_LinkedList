package com.example.datastructure.a_SLL.a_core;

import com.example.datastructure.a_SLL.MyLinkedList;
import com.example.datastructure.a_SLL.MyLinkedList.Node;


public class A10_mergeSortList {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
        print(list.head);
        
        list.head = mergeSort(list.head);
		print(list.head);
	}
	
	
	
	private static MyLinkedList createLinkedList() {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(15);
		return list;
	}
	
	
	private static void print(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
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
		if (a == null)
			return b;
		if (b == null)
			return a;

		Node head = null;
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

		Node p1 = n; 
		Node p2 = n;

		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		return p1;
	}
	
}
