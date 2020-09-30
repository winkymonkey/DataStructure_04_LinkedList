package a_SLL.z_misc3;

/**
 * *****************************************************************************
 * Reverse a Linked List in groups of given size | Set 1
 * *****************************************************************************
 * I/P: 1->2->3->4->5->6->7->8->NULL,	k = 3(every group of 3 elements will be reversed)
 * O/P: 3->2->1->6->5->4->8->7->NULL
 * 
 * *****************************************************************************
 */
public class A07_reverse_linkedList_inGroupOfSize {
	/*
	 * Traverse the list
	 * p1 = head
	 * p2 = p1.next
	 * p3 = p2.next
	 * temp = p3.next
	 * 
	 * p3.next = p2
	 * p2.next = p1
	 * p1.next = temp
	 * 
	 * p1 = p1.next
	 * p2 = p1.next
	 * p3 = p2.next;
	 * temp = p3.next;
	 * 
	 */
}
