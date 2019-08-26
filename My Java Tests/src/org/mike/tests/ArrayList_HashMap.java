package org.mike.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class ArrayList_HashMap {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		HashMap<String, String> hashMap = new HashMap<>();
		
		alist.addAll(Arrays.asList("one", "two", "three"));
		hashMap.put("one","1");
		hashMap.put("two","2");
		hashMap.put("three","3");
		
		// Display initial arraylist and hashmap
		ListIterator<?> listItr = alist.listIterator();
		while(listItr.hasNext()) {
			System.out.println("Initial arrayList elements: " + listItr.next());
		}
		
		for (String k : hashMap.keySet()) {
			System.out.println("Initial HashMap KVP = " + k + ": " +hashMap.get(k));
		}
		System.out.println("=================================");
		
		// Adding/putting + displaying values into arraylist and hashmap
		alist.add("three");									// add another duplicate element "three" to arrayList
		hashMap.put("three", "new3");						// put method REPLACES! value of initial key
		
		listItr = alist.listIterator();
		while(listItr.hasNext()) {
			System.out.println("'ADD' ArrayList elements: " + listItr.next());
		}
		
		for (String k : hashMap.keySet()) {
			System.out.println("'PUT' HashMap KVP: " + k + ": " +hashMap.get(k));
		}
	}
		
}
