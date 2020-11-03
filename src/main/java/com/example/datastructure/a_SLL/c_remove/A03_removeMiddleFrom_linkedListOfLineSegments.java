package com.example.datastructure.a_SLL.c_remove;

/**
 * *****************************************************************************
 * Given a linked list of line segments, remove middle points
 * *****************************************************************************
 * I/P: (0,10)->(1,10)->(5,10)->(7,10)
 * 								  |
 * 								(7,5)->(20,5)->(40,5)
 * O/P: (0,10)->(7,10)
 * 				  |
 * 				(7,5)->(40,5)
 * *****************************************************************************
 */
public class A03_removeMiddleFrom_linkedListOfLineSegments {
	/*
	 * The given linked list represents a horizontal line from (0,10) to (7, 10) 
	 * followed by a vertical line from (7, 10) to (7, 5), 
	 * followed by a horizontal line from (7, 5) to (40, 5).
	 * 
	 * 
	 * class Node{
	 * 		int data1;
	 * 		int data2;
	 * 		Node next;
	 * }
	 * 
	 * 
	 * while (node!=null) {
	 * 		if (node.data2 == node.next.data2)
	 * 			go forward
	 * 			starting node's next should point to last element of this sequence
	 * 		else
	 * 			
	 * }
	 */
}
