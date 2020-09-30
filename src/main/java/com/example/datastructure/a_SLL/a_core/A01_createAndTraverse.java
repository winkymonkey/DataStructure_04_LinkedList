package com.example.datastructure.a_SLL.a_core;

import com.example.datastructure.a_SLL.a_core.MyLinkedList.Node;

public class A01_createAndTraverse {
	public static void main(String[] args){
		MyLinkedList list = createLinkedList();
		printLinkedList(list);
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
	
	
	private static void printLinkedList(MyLinkedList list) {
		Node n = list.head;
		while(null != n) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
}
