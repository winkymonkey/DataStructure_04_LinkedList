package a_SLL.z_misc2;

/**
 * ********************************************************************************
 * Intersection point of two Linked Lists
 * ********************************************************************************
 */
public class A01_intersectingPointOfTwoLinkedList {
	/*
	 * ----------------------
	 * ---REGULAR APPROACH---
	 * ----------------------
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
	 * make list1 a circle (by connecting last node's next to first node) & remember the last node
	 * traverse list2
	 * if this list2 detects any loop then both lists have an intersection
	 * 
	 */
}
