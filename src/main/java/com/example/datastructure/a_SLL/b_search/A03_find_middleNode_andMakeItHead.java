package com.example.datastructure.a_SLL.b_search;

/**
 * *****************************************************************************
 * Make middle node head in a linked list
 * *****************************************************************************
 * I/P: 1 2 3 4 5
 * O/P: 3 1 2 4 5
 * 
 * I/P: 1 2 3 4 5 6
 * O/P: 4 1 2 3 5 6
 * 
 * *****************************************************************************
 */
public class A03_find_middleNode_andMakeItHead {
	/*
	 * p0, p1, p2 all points to head
	 * 
	 * while(p2!=null && p2.next!=null) {
	 * 		p0 = p1;
	 * 		p1 = p1.next;
	 * 		p2 = p2.next.next;
	 * }
	 * 
	 * p1 points to central node
	 * p0 points to previous node of middle
	 * 
	 * p0.next = p1.next;	//previous and next node is now connected
	 * p1.next = head;		//current node (central node) connects to head
	 * head = p1;			//head points to central node
	 * 
	 */
}
