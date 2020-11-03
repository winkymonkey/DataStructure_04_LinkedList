package com.example.datastructure.a_SLL.z_misc2;

/**
 * *****************************************************************************
 * Intersection of two Sorted Linked Lists
 * *****************************************************************************
 * I/P: list1 --- 1->2->3->4->6
 * 		list2 --- 2->4->6->8
 * O/P: output -- 2->4->6
 * 
 * *****************************************************************************
 */
public class A02_intersection {
	/*
	 * Traverse both the list simultaneously
	 * p1 will traverse list1
	 * p2 will traverse list2
	 * p3 will traverse newList
	 * 
	 * while (p1!=null && p2!=null) {
	 * 		if (p1->data == p2->data)
	 * 			//add this node in newList and p3=p3.next
	 * 		else {
	 * 			if (p1.data < p2.data)
	 * 				p1=p1.next
	 * 			else
	 * 				p2=p2.next
	 * 		}
	 * }
	 * 
	 * newList will contain intersection
	 * 
	 */
}
