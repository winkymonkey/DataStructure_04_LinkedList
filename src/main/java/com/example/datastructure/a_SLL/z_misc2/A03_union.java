package com.example.datastructure.a_SLL.z_misc2;

/**
 * *****************************************************************************
 * Union and Intersection of two Linked Lists
 * *****************************************************************************
 * I/P: list1 --- 1->2->3->4->6
 * 		list2 --- 2->4->6->8
 * O/P: output -- 1->2->3->4->6->8
 * 
 * *****************************************************************************
 */
public class A03_union {
	/*
	 * traverse both the list simultaneously
	 * p1 will traverse list1
	 * p2 will traverse list2
	 * p3 will traverse newList
	 * 
	 * while (p1!=null && p2!=null) {
	 * 		if (p1->data == p2->data)
	 * 			//add this node in newList and p3=p3.next
	 * 		else {
	 * 			//add both p1, p2 node in newList and p3=p3.next.next
	 * 		}
	 * }
	 * 
	 * newList will contain union
	 * 
	 */
}
