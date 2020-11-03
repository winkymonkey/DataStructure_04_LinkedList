package com.example.datastructure.a_SLL.a_core;

import com.example.datastructure.a_SLL.MyLinkedList;
import com.example.datastructure.a_SLL.MyLinkedList.Node;


public class A07_reverseList {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		reverse(list);
		print(list.head);
	}
	
	
	private static MyLinkedList createLinkedList() {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
		return list;
	}
	
	
	private static void print(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	
	
	
	
	
	private static void reverse(MyLinkedList list) {
		Node prev = null;
        Node current = list.head;
        Node next = null;
        
        while (current != null) {
        	next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        }
        list.head = prev;			//prev is the new head
	}
	
}
