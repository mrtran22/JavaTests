package map_tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap1 = new HashMap<>();
		Map<String, String> hashMap2 = new HashMap<>();
		Map<String, String> hashMap3 = new HashMap<>();
		
		hashMap1.put("1", "one");															//	put()
		hashMap1.put("2", "two");
		hashMap1.put("3", "three");
		hashMap2.put("4", "four");
		hashMap2.put("5", "five");
		hashMap2.put("6", "six");
		hashMap3.putAll(hashMap1);															//	putAll()
		hashMap3.putAll(hashMap2);
		
		// parse a json and put into hashmap
		
		System.out.println("hashMap1 key value pairs: " + hashMap1);
		System.out.println("hashMap2 key value pairs: " + hashMap2);
		System.out.println("hashMap3 key value pairs: " + hashMap3);
		System.out.println("hashMap1 key set: " + hashMap1.keySet());
		System.out.println("hashMap2 key set: " + hashMap2.keySet());
		System.out.println("hashMap3 key set: " + hashMap3.keySet());
		
		
		System.out.println("\nhashMap1 iterated with FOR-EACH loop");						// FOR-EACH loop WITH get() for KVP iteration
		for (String k : hashMap1.keySet()) {												
			System.out.println("hashMap1 key value pairs: " + k + ":"+ hashMap1.get(k));
		}
		
		Iterator<?> itr = hashMap1.keySet().iterator();										// Iterator
		System.out.println("\nhashMap1 iterator with 'hashMap1.keySet().iterator()'");
		while(itr.hasNext()) {
			System.out.println("hashMap1 values: " + itr.next());
		}
		
		System.out.println("\nhashMap2 before replacing value of key:4");					// replace()			
		System.out.println(hashMap2);
		hashMap2.replace("4", "replacedString");
		System.out.println("hashMap2 after replacing value of key:4");
		System.out.println(hashMap2);
		
		System.out.println("\nhashMap2 before removing key value pair 4");					// remove()
		System.out.println(hashMap2);
		hashMap2.remove("4");
		System.out.println("hashMap2 after removing key value pair 4");
		System.out.println(hashMap2);
		hashMap2.put("4", "four");
		System.out.println("hashMap2 after putting back key value pair 4");					// put() again, KVP not ordered
		System.out.println(hashMap2);
		
		System.out.println("\nhashMap3 before merge: ");									// merge()
		System.out.println(hashMap3);
		hashMap3.merge("6", "seven", (oldValue, newValue) -> newValue + "-abc");
		System.out.println("hashMap3 after merging to key value pair \"4\"");
		System.out.println(hashMap3);
		
		// JSON string parsed
		// entrySet
		// contains, equal, clear
		
		
	}

}
