package a_SLL.z_misc3;

/**
 * *****************************************************************************
 * Rotate Linked List block wise
 * *****************************************************************************
 * Given a Linked List of length 'n' and block length 'k'.
 * Rotate in circular manner towards right/left each block by a number 'd'.
 * If 'd' is positive rotate towards right else rotate towards left.
 * *****************************************************************************
 * I/P: 1->2->3->4->5->6->7->8->9->NULL		k=3		d=1
 * O/P: 3->1->2->6->4->5->9->7->8->NULL
 * 			//blocks are 1,2,3 and 4,5,6 and 7,8,9 (each of length k=3)
 * 			//each block is rotated right by d=1...	3,1,2 and 6,4,5 and 9,7,8
 * 
 * I/P: 1->2->3->4->5->6->7->8->9->10->11->12->13->14->15->NULL		k=4		d=(-1)
 * O/P: 2->3->4->1->6->7->8->5->10->11->12->9->14->15->13->NULL
 * 
 * *****************************************************************************
 */
public class A06_rotateBlockWise {
	/*
	 * 
	 */
}
