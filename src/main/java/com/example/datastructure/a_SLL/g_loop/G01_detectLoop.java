package com.example.datastructure.a_SLL.g_loop;

/**
 * ********************************************************************************
 * Detect loop in a linked list
 * ********************************************************************************
 */

public class G01_detectLoop {
	/*
	 * In the Node definition, add a new boolean variable 'isVisited'.
	 * 
	 * Now traverse the list.
	 * if current node's isVisited flag is marked, it means that this node visited earlier. Hence stop.
	 * otherwise mark current node as visited.
	 * 
	 * 
	 * 
	 * -------------------
	 * void detectLoop() {
	 *    Node n = list.head;
	 *    n.isVisited = true;
	 *    
	 *    while (n!=null && n.next!=null) {
	 *       if (n.next.isVisited)				//it's a loop
	 *          break;							//n.next is the starting point of the loop
	 *       else
	 *          n.isVisited = true;
	 *       
	 *       n = n.next;
	 *    }
	 * }
	 * 
	 */
}
