package com.example.datastructure.a_SLL.f_rearrange;

/**
 * *****************************************************************************
 * Rearrange a Linked List in Zig-Zag fashion
 * *****************************************************************************
 * Given a linked list, rearrange it such that the converted list should be of the form a < b > c < d > e < f .. 
 * (where a, b, c.. are consecutive data node of linked list)
 * 
 * *****************************************************************************
 * Input:  11->15->20->5->10
 * Output: 11->20->5->15->10
 * 
 * *****************************************************************************
 */

public class F04_rearrange_zigzag {
	/*
	 * flag = true
	 * 
	 * if (flag) {										//"<" relation expected
	 *    if (currentNode.data < rightNode.data)
	 * 	      //nothing to do
	 * 	  else
	 * 	     swap currentNode and rightNode
	 * 	     flag = !flag;
	 * }
	 * else {											//">" relation expected
	 * 	  if (currentNode.data > rightNode.data)
	 * 	     //nothing to do
	 * 	  else
	 * 	     swap currentNode and rightNode
	 *       flag = !flag;
	 * }
	 * 
	 */
}
