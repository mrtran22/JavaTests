package collections_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//	Key methods (add, get, remove, set, etc), but has lesser methods as LinkedList
		//
		//	+-------------------+---------------+------------+
		//	|	Time complexity	|	ArrayList	| LinkedList |
		//	+-------------------+---------------+------------+
		//	|	Index (get)		|		O(1)	|	O(n)	 |
		//	|	Insert (add)	|		O(1)*	|	O(1)	 |
		//	|	Delete (remove)	|		O(n)	|	O(n)	 |
		//	+-------------------+---------------+------------+
		//	  * = amortized constant times
		
		ArrayList<Integer> arrList1 = new ArrayList<>();
		ArrayList<Integer> arrList2 = new ArrayList<>();
		List<String> arrList3 = new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			arrList1.add(i);														// add()
		}
		
		for(int i=6;i<=10;i++) {
			arrList2.add(i);														// add()
		}
		
		// ARRAYLIST RETRIEVAL METHODS
		System.out.println("arrList1 values: " + arrList1);							// Display all values in ArrayList
		System.out.println("arrList2 values: " + arrList2);
		arrList1.addAll(arrList2);													// addAll() , combine two ArrayList
		arrList3.addAll(Arrays.asList("Fee", "Fi", "Foe", "Fum"));					// addAll()
		System.out.println("arrList3 values: " + arrList3);
		System.out.println("arrList1 after addAll() contains "
				+ "these values: " + arrList1 + "\n");
		
		
		System.out.println("Using simple FOR loop WITH get() method: ");			// Simple FOR loop with get() for iteration
		for (int i=0;i<arrList1.size();i++) {
			System.out.println(arrList1.get(i));
		}
		
		System.out.println("\nUsing FOR-EACH loop WITHOUT get() method: ");			// FOR-EACH loop without get() for iteration
		for (int value : arrList1) {
			System.out.println(value);
		}
		
		System.out.println("\nUsing Iterator collection: ");						// Iterator + hasNext() + next()
		Iterator<?> itr = arrList1.iterator();										// '?' is a wildcard for unspecified types at the moment in declaration
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<Integer> listItr = arrList1.listIterator();					// List iterator
		System.out.println("\nUsing ListIterator collection: ");
		System.out.println("arrList1 size: " + arrList1.size());
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		arrList1.remove(0);																// remove() , value 1 removed and value 2 shifts to index 0
		arrList1.set(0, 999);															// set()    , replaced value 2 at index 0 to value 999
		System.out.println("\narrList1 after removing + replacing index element: ");
		for (int i : arrList1) {
			System.out.println(i);
		}
		
		// *** The same iterator declared above will fail here, after remove() method ***
		/*
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
			
		System.out.println("\nArrayList contains '300'? " + arrList1.contains(300));	// contains() , returns boolean true/false
		arrList1.clear();
		System.out.println("ArrayList size: " + arrList1.size());
		
	}

}
