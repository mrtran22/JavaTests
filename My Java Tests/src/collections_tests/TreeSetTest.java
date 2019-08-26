package collections_tests;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		//	Sets are sorted (alpha-numerically ascending) collection + do not allow duplicate values
		
		Set<String> s = new TreeSet<>();					// Set is an interface.  Interface itself cannot be instantiated, need to use HashSet
			
		s.add("geeks");
		s.add("for");
		s.add("practice");	
		s.add("!?~");
		s.add("continues");	
		s.add("908");
		
		s.add("geeks");										// this duplicate NOT allowed
		
		System.out.println(s);
		
		Iterator<?> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
