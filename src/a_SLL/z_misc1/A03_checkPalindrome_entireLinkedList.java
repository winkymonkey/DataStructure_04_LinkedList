package a_SLL.z_misc1;

/**
 * ********************************************************************************
 * Function to check if a singly linked list is palindrome
 * ********************************************************************************
 */
public class A03_checkPalindrome_entireLinkedList {
	/*
	 * ---------------
	 * ---USE STACK---
	 * ---------------
	 * Traverse the list
	 * push (node.data) into stack
	 * 
	 * Traverse the list again
	 * if(stack.top == node.data)
	 * 	 pop stack.top
	 * 	 top--
	 * else
	 *   break
	 *   not palindrome
	 * 
	 * 
	 * 
	 * ------------------------------
	 * ---BY REVERSING SECOND HALF---
	 * ------------------------------
	 * Get the middle of the linked list.
	 * Reverse the second half of the linked list in O(n) time
	 * Check if the first half and second half are identical.
	 * Construct the original linked list by reversing the second half again.
	 * 
	 */
}
