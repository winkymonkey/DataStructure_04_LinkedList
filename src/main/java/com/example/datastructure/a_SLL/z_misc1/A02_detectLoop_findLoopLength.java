package com.example.datastructure.a_SLL.z_misc1;

/**
 * *****************************************************************************
 * Find length of loop in linked list
 * *****************************************************************************
 */
public class A02_detectLoop_findLoopLength {
	/*
	 * We need to have one more field in NODE as below.
	 * 
	 * class Node{
	 * 		Node head;
	 * 		
	 * 		int data;
	 * 		int count;
	 * 		boolean visited;
	 * 		Node next;
	 * 		
	 * 		Node(int data){
	 * 			this.data = data;
	 * 		}
	 * }
	 * 
	 * 
	 * 1st node will have count=1
	 * 2nd node will have count=2
	 * 3rd node will have count=3
	 * ......
	 * 
	 * 
	 * 
	 * Node node = head;
	 * count=1;
	 * loopLength=0;
	 * while(node!=null) {
	 * 		node.visited = true;
	 * 		node.count = count;
	 * 		count++;
	 * 		if(node.next!=null && node.next.visited) {
	 * 			//it's a loop
	 * 			loopLength = (node.count - node.next.count);
	 * 		}
	 * 		else {
	 * 			node = node.next;
	 * 		}
	 * }
	 * 
	 */
}
