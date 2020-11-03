package com.example.datastructure.a_SLL.z_misc1;

/**
 * *****************************************************************************
 * Length of longest palindrome list in a linked list using O(1) extra space
 * *****************************************************************************
 * I/P: 2->3->7->3->2->12->24
 * O/P: 5						//The longest palindrome list is 2->3->7->3->2
 * 
 * I/P: 12->4->4->3->14
 * O/P: 2						//The longest palindrome list is 4->4
 * 
 * *****************************************************************************
 */
public class A06_findLength_ofLongestPalindromicList {
	/*
	 * Node prev = list.head;
	 * Node curr = list.head.next;
	 * count = 2;
	 * isPalindrome = false;
	 * 
	 * while (curr != null && curr.next !=null) {
	 * 	 if (prev.data == curr.next.data) {
	 * 		isPalindrome = true;
	 * 		break;
	 * 	 }
	 * 	 else {
	 * 		prev = prev.next;
	 * 		curr = curr.next;
	 * 		count++;
	 * 	 }
	 * }
	 * 
	 * if (!isPalindrome) {
	 * 	 //print 'NO'
	 * }
	 * else {
	 * 	 for (i=0 to (2*count-1)) {
	 * 		//print temp.data
	 * 		temp = temp.data
	 * 	 }
	 * }
	 * 
	 */
}
