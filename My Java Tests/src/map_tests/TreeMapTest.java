package map_tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap1 = new HashMap<>();
		Map<String, String> hashMap2 = new HashMap<>();
		Map<String, String> hashMap3 = new HashMap<>();
		
		hashMap1.put("john", "one");												//	HashMap unordered KVPs
		hashMap1.put("mike", "two");
		hashMap1.put("sue", "three");
		hashMap1.put("tom", "four");
		hashMap1.put("dan", "five");
		hashMap1.put("ace", "six");
		System.out.println(hashMap1);
		
		Map<String, String> treeMap1 = new TreeMap<>();								//	TreeMap sort KVPs in 'natural order' of keys	
		treeMap1.put("john", "one");
		treeMap1.put("mike", "two");
		treeMap1.put("sue", "three");
		treeMap1.put("tom", "four");
		treeMap1.put("dan", "five");
		treeMap1.put("ace", "six");
		System.out.println(treeMap1);
		
		Map<String, String> treeMap2 = new TreeMap<>(hashMap1);						//	HashMap passed as argument to TreeMap
		System.out.println(treeMap2);												//	TreeMap sort KVPs in 'natural order' of keys

		Map<String, String> LinkedHashMap1 = new LinkedHashMap<>();					//	LinkedHashMap maintains order of KVPs based on which was inserted first	
		LinkedHashMap1.put("john", "one");
		LinkedHashMap1.put("mike", "two");
		LinkedHashMap1.put("sue", "three");
		LinkedHashMap1.put("tom", "four");
		LinkedHashMap1.put("dan", "five");
		LinkedHashMap1.put("ace", "six");
		System.out.println(LinkedHashMap1);
		
	}

}
