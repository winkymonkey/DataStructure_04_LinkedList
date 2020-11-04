package com.example.datastructure.a_SLL.d_sort;

/**
 * *****************************************************************************
 * Sort a linked list that is sorted alternating ascending and descending orders
 * *****************************************************************************
 * Input:  10->40->53->30->67->12->89->NULL		(10, 53, 67, 89 are ascending)
 * 												(12, 43, 67 are descending)
 * Output: 10->12->30->43->53->67->89->NULL
 * 
 * *****************************************************************************
 */

public class D01_sortList_thatIsAlternatingAscendingDescending {
	/*
	 * -------------------
	 * ---USING SORTING---
	 * -------------------
	 * use merge sort
	 * TIME --- O(n logn)
	 * 
	 * 
	 * 
	 * ---------------------------
	 * ---Using STACK AND QUEUE---
	 * ---------------------------
	 * traverse the list
	 * 	  put every odd positioned in a Queue
	 *    put every even positioned in a Stack
	 * 
	 * ------       	---------------------
	 * | 12 |top		| 89 | 67 | 53 | 10 |front
	 * ------       	---------------------
	 * | 30 |
	 * ------
	 * | 40 |
	 * ------
	 * 
	 * 
	 * while (stack is not empty && queue is not empty) {
	 * 	  if (Queue's first < Stack's top)
	 * 	     add Queue's first element to list
	 * 	     remove element from Queue
	 * 	     queue pointer++
	 * 	  else if (Stack's top < Queue's first element)
	 * 	     add Queue's first element to list
	 * 	     pop from stack
	 * 	     top--
	 * }
	 * if any element is remaining in stack or queue, add them back to list one by one
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---WITHOUT EXTRA SPACE---
	 * -------------------------
	 * traverse the list
	 * 	  create one list having odd positioned element (ascending) from original list - listASC
	 *    create one list having odd positioned element (descending) from original list - listDESC
	 * 
	 * reverse the list listDESC
	 * merge both the list
	 * 
	 * TIME --- O(1)+O(1)+O(n) = O(n)	[1 traversal for separate the list]+[1 traversal for reversal]+[O(n) time to merge]
	 * SPACE -- O(1)
	 * 
	 */
}
