package com.example.datastructure.a_SLL.j_union_intersection;

/**
 * ********************************************************************************
 * Intersection point of two Linked Lists
 * ********************************************************************************
 */

public class J01_intersectingPointOfTwoLinkedList {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * traverse list1
	 * mark each node as visited
	 * 
	 * traverse list2
	 * if any node's visited attribute is already true, then it's the intersection point
	 * 
	 * 
	 * 
	 * ---------------------
	 * ---TRICKY APPROACH---
	 * ---------------------
	 * make list1 circular by connecting last node to first node & remember the last node
	 * traverse list2
	 * if this list2 detects any loop then both lists have an intersection
	 * 
	 */
}
