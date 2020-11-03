package com.example.datastructure.a_SLL.f_rearrange;

/**
 * *****************************************************************************
 * Rearrange a Linked List in Zig-Zag fashion
 * *****************************************************************************
 * Given a linked list, rearrange it such that converted list should be of the form a < b > c < d > e < f .. 
 * (where a, b, c.. are consecutive data node of linked list.)
 * *****************************************************************************
 * I/P: 11->15->20->5->10
 * O/P: 11->20->5->15->10
 * 
 * *****************************************************************************
 */
public class A04_rearrange_zigzag {
	/*
	 * flag=true
	 * 
	 * if (flag) {
	 * 		if (rightNode.data > currentNode.data)
	 * 			//it's fine
	 * 		else {
	 * 			//swap two nodes
	 * 			//flag = !flag;
	 * 		}
	 * }
	 * else {
	 * 		if (rightNode.data < currentNode.data)
	 * 			//it's fine
	 * 		else {
	 * 			//swap two nodes
	 * 			//flag = !flag;
	 * 		}
	 * }
	 */
}
