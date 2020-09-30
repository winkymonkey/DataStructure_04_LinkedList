package a_SLL.b_search;

/**
 * *****************************************************************************
 * Find a triplet from three linked lists with sum equal to a given number
 * *****************************************************************************
 * I/P: 	12->6->29	23->5->8	90->20->59		X=101
 * O/P: 	6,5,90
 * 
 * *****************************************************************************
 */
public class A05_find_tripletSum_equalToGivenNumber {
	/*
	 * --------------------
	 * ---NAIVE SOLUTION---
	 * --------------------
	 * 3 nested loops.
	 * each loop will search in each list
	 * TIME -- O(n^3)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * Sort list2 in ascending order	//5->8->23
	 * Sort list3 in descending order	//90->59->20
	 * 
	 * Node a = list1.head;
	 * while(list1 != null) {
	 * 		Node b = list2.head;
	 * 		Node c = list3.head;
	 * 		while (b!=null && c!=null) {
	 * 			if(a.data + b.data + c.data == GivenNumber) {
	 * 				return true;
	 * 			}
	 * 			else if(a.data + b.data + c.data < GivenNumber) {
	 * 				b = b.next;
	 * 			}
	 * 			else {
	 * 				c = c.next
	 * 			}
	 * 		}
	 * 		a = a.next;
	 * }
	 * //print("not found")
	 * 
	 */
}
