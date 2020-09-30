package a_SLL.f_rearrange;

/**
 * *****************************************************************************
 * Rearrange a given linked list in-place.
 * *****************************************************************************
 * Given a singly linked list L0 -> L1 -> � -> Ln-1 -> Ln.
 * Rearrange the nodes in the list so that the new formed list is: L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 �
 * *****************************************************************************
 * I/P: 1 -> 2 -> 3 -> 4
 * O/P: 1 -> 4 -> 2 -> 3
 * 
 * I/P: 1 -> 2 -> 3 -> 4 -> 5
 * O/P: 1 -> 5 -> 2 -> 4 -> 3
 * 
 * *****************************************************************************
 */
public class A02_rearrange_special_inPlace {
	/*
	 * Traverse the list
	 * find middle point of the list
	 * 
	 * Reverse the right side of the list with respect to middle
	 * the list 1-2-3-4-5 becomes 1-2-3-5-4
	 * one pointer p1 should stay at starting of left half (at 1 of 1-2-3)
	 * one pointer p2 should stay at starting of right half (at 5 of 5-4)
	 * 
	 * Do alternate merge of first and second halves.
	 * 
	 */
}
