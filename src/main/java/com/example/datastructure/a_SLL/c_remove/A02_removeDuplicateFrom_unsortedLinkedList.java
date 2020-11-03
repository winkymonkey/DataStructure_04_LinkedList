package com.example.datastructure.a_SLL.c_remove;

/**
 * ********************************************************************************
 * Remove duplicates from an unsorted linked list
 * ********************************************************************************
 */
public class A02_removeDuplicateFrom_unsortedLinkedList {
	/*
	 * -------------------
	 * ---USING SORTING---
	 * -------------------
	 * sort the list first
	 * 
	 * then traverse the sorted list
	 * if (node.data == node.next.data)
	 * 		//remove next node
	 * else
	 * 		node = node.next;
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * traverse the list
	 * if (hashmap.contains(node.data))
	 * 	 //remove that node from list
	 * else
	 * 	 hashmap.put(node.data, true);
	 * 
	 */
}
