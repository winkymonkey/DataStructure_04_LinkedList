package com.example.datastructure.a_SLL;

public class MyLinkedList {
	Node head;  	// head of list
	
	static class Node {		//This inner class is made static so that main() can access it
		int data;
		Node next;
          
		Node(int d) {
			data = d;
			next = null;
		}
    }
}