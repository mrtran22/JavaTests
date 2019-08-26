package collections_tests;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//	Uses some of the key methods (add, get, remove, set, etc) as ArrayList, but has 
		//	additional methods - getFirst, removeLast, push/pop/peek/poll, descending iterator, etc.
		//
		//	+-------------------+---------------+------------+
		//	|	Time complexity	|	ArrayList	| LinkedList |
		//	+-------------------+---------------+------------+
		//	|	Index (get)		|		O(1)	|	O(n)	 |
		//	|	Insert (add)	|		O(1)*	|	O(1)	 |
		//	|	Delete (remove)	|		O(n)	|	O(n)	 |
		//	+-------------------+---------------+------------+
		//	  * = amortized constant times
		
		LinkedList<Integer> llist1 = new LinkedList<>();
		LinkedList<Integer> llist2 = new LinkedList<>();
		
		for(int i=1;i<=5;i++) {
			llist1.add(i);															// add()
		}
		
		for(int i=6;i<=10;i++) {
			llist2.add(i);															// add()
		}
		
		// LINKEDLIST RETRIEVAL METHODS
		System.out.println("arrList1 contains these values: " + llist1);			// Display all values in ArrayList
		System.out.println("arrList2 contains these values: " + llist2);
		llist1.addAll(llist2);														// addAll() , combine two ArrayList
		System.out.println("arrList1 after addAll() contains "
				+ "these values: " + llist1 + "\n");
		
		
		System.out.println("Using simple FOR loop WITH get() method: ");			// Simple FOR loop with get()
		for (int i=0;i<llist1.size();i++) {
			System.out.println(llist1.get(i));
		}
		
		System.out.println("\nUsing FOR-EACH loop WITHOUT get() method: ");			// FOR-EACH loop without get()
		for (int value : llist1) {
			System.out.println(value);
		}
		
		System.out.println("\nUsing Iterator collection: ");						// Iterator + hasNext() + next()
		Iterator<?> itr = llist1.iterator();										// '?' is a wildcard for unspecified types at the moment in declaration
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator<?> descItr = llist1.descendingIterator();							// Descending iterator + hasNext() + next()
		System.out.println("\nUsing Descending Iterator collection: ");						
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}
		
		System.out.println("\nFirst element removed from llist1 + set() used "
				+ "to replace index 0 after: ");	
		llist1.removeFirst();														// remove FIRST element
		llist1.set(0, 999);															// set - replaces element
		System.out.println(llist1);
		
		llist1.clear();																// clear
		System.out.println("peek() used after llist1 cleared: " + llist1.peek());	// difference between peek vs. getFirst is peek won't throw an exception if linkedlist is empty/null
	}

}
