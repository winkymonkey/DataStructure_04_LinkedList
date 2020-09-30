package a_SLL.d_sort;

/**
 * *****************************************************************************
 * Sort linked list which is already sorted on absolute values
 * *****************************************************************************
 * I/P: 1 -> -2 -> -3 -> 4 -> -5
 * O/P: -5 -> -3 -> -2 -> 1 -> 4
 * 
 * I/P: -5 -> -10
 * O/P: -10 -> -5
 * 
 * *****************************************************************************
 */
public class A02_sortList_thatIsAlreadySortedOnAbsValue {
	/*
	 * ----------------------
	 * ---Regular Approach---
	 * ----------------------
	 * use merge sort
	 * TIME -- O(n logn)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---Efficient Solution---
	 * ------------------------
	 * An important observation is, all negative elements are present in reverse order.
	 * Traverse the list {
	 * 	if(we find an element that is out of order) {
	 * 		we move it to the front of linked list.
	 * 	}
	 * }
	 * 
	 */
}
