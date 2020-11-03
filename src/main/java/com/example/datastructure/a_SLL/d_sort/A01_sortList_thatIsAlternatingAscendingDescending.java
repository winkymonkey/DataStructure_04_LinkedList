package com.example.datastructure.a_SLL.d_sort;

/**
 * *****************************************************************************
 * Sort a linked list that is sorted alternating ascending and descending orders?
 * *****************************************************************************
 * I/P: 10->40->53->30->67->12->89->NULL	(10, 53, 67, 89 are ascending)(12, 43, 67 are descending)
 * O/P: 10->12->30->43->53->67->89->NULL
 * 
 * *****************************************************************************
 */
public class A01_sortList_thatIsAlternatingAscendingDescending {
	/*
	 * --------------------
	 * ---USEING SORTING---
	 * --------------------
	 * use merge sort
	 * TIME -- O(n logn)
	 * 
	 * 
	 * 
	 * -------------------
	 * ---In O(n) Space---
	 * -------------------
	 * traverse the list
	 * 	put every odd positioned (which are ascending) in a Queue	(10,53,67,89)
	 *  put every even positioned (which are descending) in a Stack	(12,43,67)
	 * 
	 * while (stack or queue is not empty) {
	 * 	if (Queue's first element < Stack's top)
	 * 		//add Queue's first element to list
	 * 		//remove element from Queue
	 * 		//queue pointer++
	 * 	else If (Stack's top < Queue's first element)
	 * 		//add Queue's first element to list
	 * 		//pop from stack
	 * 		//top--
	 * }
	 * 
	 * if any element is remaining in stack or queue, add them back to list one by one
	 * TIME -- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * -------------------
	 * ---In O(1) Space---
	 * -------------------
	 * traverse the list
	 * 	create one list having odd positioned element (ascending) from original list - listASC
	 *  create one list having odd positioned element (descending) from original list - listDESC
	 * 
	 * reverse the list listDESC
	 * merge both the list
	 * 
	 */
}
