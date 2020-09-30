package com.example.datastructure.b_DLL.z_misc;

/**
 * *****************************************************************************
 * Sort the biotonic doubly linked list
 * *****************************************************************************
 * I/P: 2 <-> 5 <-> 7 <-> 12 <-> 10 <-> 6 <-> 4 <-> 1 
 * O/P: 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 7 <-> 10 <-> 12 
 * 
 * I/P: 20 <-> 17 <-> 14 <-> 8 <-> 3 
 * O/P: 3 <-> 8 <-> 14 <-> 17 <-> 20
 * 
 * *****************************************************************************
 */
public class B01_sort_bitonicDLL {
	/*
	 * Bitonic -- a DLL which is first increasing and then decreasing.
	 * 
	 * 
	 * Traverse the DLL
	 * Find such an element(current) which is smaller than its previous node.
	 * 
	 * if(current==null)
	 * 	 //list is already sorted
	 * else {
	 * 	 //split the list into two separate lists
	 * 	 //first DLL -- starting from head node till the current�s previous node
	 * 	 //second DLL -- starting from current node till the end of the list
	 * 	 //Reverse the second DLL
	 * 	 //Merge the first and second sorted DLL 
	 * }
	 * 
	 */
}
