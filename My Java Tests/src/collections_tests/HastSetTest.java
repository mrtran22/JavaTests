package collections_tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HastSetTest {

	public static void main(String[] args) {
		
		//	*** Sets do NOT have a GET method
		//	Sets are unordered collection + do not allow duplicate values
		
		Set<String> s = new HashSet<>();					// Set is an interface.  Interface itself cannot be instantiated, need to use HashSet
			
		s.add("geeks");
		s.add("for");
		s.add("practice");									// Sets are unordered, this shows up as first element	
		s.add("continues");																
		s.add("geeks");										// this duplicate NOT allowed
		System.out.println(s);
		
		Iterator<?> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
