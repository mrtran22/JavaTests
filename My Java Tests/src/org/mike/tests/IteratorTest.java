package org.mike.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import org.qa.restapi.TestBase;

public class IteratorTest {
	
	public String apiKey;
	public String s;
	
	IteratorTest() {
		apiKey = "AIzaSyC4gSoW7R7r5yq94siDaD86H3GeSiU55I0";
		s = "https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=";
		s = s + apiKey;
	}
	
	public String connect() throws IOException {
		URL url = new URL(s);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 		// (HttpURLConnection) = casting a URLConnection with support for HTTP-specific features. HttpURLConnection is abstract class and CANNOT be instantiated																		
																				// url.openConnection() returns URLConnection instance	
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type", "application/json");
	    conn.setRequestProperty("charset", "utf-8");
	    conn.connect();
	    
	    InputStream is = conn.getInputStream();
	    // **** try getOutputStream, what does that do??? ***** //
	    
	    // scanner.hasNextLine()
	    // String json = new Scanner(is, "UTF-8").useDelimiter("\\Z").next();		// This one line can consolidate the THREE lines below it	
	    Scanner scan = new Scanner(is, "UTF-8");									// Scanner(InputStream source, String charsetName)
	    String json = scan.useDelimiter("\\Z").next();
	    scan.close();
	    conn.disconnect();

		System.out.println("status code: " + conn.getResponseCode());
		System.out.println("host: " + url.getHost());
		System.out.println(json);
		return json;
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		IteratorTest conn = new IteratorTest();
		System.out.println("link: " + conn.s);
		conn.connect();
		
		String filePath = "C:\\Users\\mt\\Desktop\\Code Test\\Java\\FileIO";
		File f = new File(filePath + "\\json.txt");
		int fileCount = 0;
		while (f.exists())  {
			fileCount++;
			f = new File(filePath + "\\json" + fileCount + ".txt");
		}
		
		FileWriter fw = new FileWriter(f, true);	// 'true' parameter enables append to file
		BufferedReader br = new BufferedReader(new StringReader(conn.connect()));
		
		while (true) {
			String line = br.readLine();
			if (line != null) {
				fw.write(line);
				fw.write("\r\n");
			} else {
				break;
			}
		}
	    br.close();
		fw.close();										// Need to close writing to file before parsing JSON file below 
		
		FileReader fr = new FileReader(f);
	    JSONParser jsonParser = new JSONParser();
	    JSONObject jsonObject = (JSONObject)jsonParser.parse(fr);
	    System.out.println(f);
	    System.out.println("==================================================================");
	    
		// Convert byte[] read from file to String
		System.out.println("Convert byte[] read from file to String");
		System.out.println("File path: " + f.toString());
		byte[] encoded = Files.readAllBytes(Paths.get(f.toString()));
		String fileString = new String(encoded);								// need 'new' keyword
		System.out.println("byte[] encoded: " + encoded.toString() + " = " + fileString);
		System.out.println();
	    
	    // Set Interface
	    System.out.println("Set Interface");
	    Set<?> keys = jsonObject.keySet();
	    Iterator<?> i = keys.iterator();
	    while(i.hasNext()) {
	    	Object next = i.next();
	    	System.out.println(next);
	    	//System.out.println(jsonObject.get(next));
	    	//System.out.println(next.getClass());
	    	
	    	if (jsonObject.get(next) instanceof JSONArray) { // || jsonObject.get(next) instanceof JSONObject) {
	    		System.out.println("keys: " + keys);
	    		System.out.println("true");
	    		JSONArray arr = (JSONArray) jsonObject.get(next);
	    		System.out.println(arr.size());
	    		for(int j=0;j<arr.size();j++) {
	    			System.out.println(arr.get(j));	    		}
	    	}
	    }
	    System.out.println();
		
	    // Map Interface
	    System.out.println("Map Class example");
	    Map<String, Object> m = new HashMap<>();
	    m.put("integer", 123);
	    String s = "{\"subInteger2\":12345, \"subInteger1\":1234}";						// sub-JSON object can have same key name as parent (i.e. 'integer' = integer)
	    JSONParser p = new JSONParser();
	    JSONObject j = (JSONObject) p.parse(s);
	    m.put("integer1", j);
	    
	    System.out.println("Map size: " + m.size());
	    for(String k: m.keySet()) {
	    	System.out.println(k + " : " + m.get(k));
	    	
	    	System.out.println(m.get(k).getClass());
	    	if (m.get(k) instanceof JSONObject) {
	    		System.out.println("true json obj");			
	    		Set<?> set1 = j.keySet();
	    		System.out.println("Set: " + set1);	
	    		JSONObject j1 = new JSONObject();
	    		j1 = (JSONObject) m.get(k);										// put JSONObject sub-keys/values into new JSONObject for iteration
	    		Iterator<?> itr1 = set1.iterator();								// have to iterate thru 'Set' collection, not get() method
	    		while(itr1.hasNext()) {
	    			System.out.println(j1.get((itr1.next().toString())));									
	    		}
	    	}
	    }
	    System.out.println();
		
	    // LinkedList & ListIterator
	    System.out.println("LinkedList & ListIterator");
		LinkedList<JSONObject> list = new LinkedList<>();
		list.add(jsonObject);
		list.add(jsonObject);
		ListIterator<?> listItr = (ListIterator<?>) list.iterator();			// still need to cast "list.iterator()" to ListIterator.  '?' = placeholder? is for whatever type is returned?
		while(listItr.hasNext()) {
			//jsonObject = (JSONObject) litr.next();
			//System.out.println(jsonObject.getClass());
			//System.out.println(jsonObject.keySet());
			System.out.println(listItr.next());
		}
		System.out.println();
		
		// ArrayList & ListIterator & for-loop
		System.out.println("ArrayList & ListIterator");
		ArrayList<JSONObject> aList = new ArrayList<>();
		aList.add(jsonObject);
		aList.add(jsonObject);
		
		// Method 1: using ListIterator
		//ListIterator<?> listItr1 = (ListIterator<?>) aList.iterator();			// *** does NOT work, cannot be casted to ListIterator object like LinkedList (above)
		ListIterator<?> listItr1 = aList.listIterator();						// does NOT need to be casted, since using "listIterator()" method, return ListIterator object
		while(listItr1.hasNext()) {
			System.out.println("Method 1 (ListIterator): " + listItr1.next());
		}
			// Method 2: using for-loop
		for(int k=0;k<aList.size();k++) {
			System.out.println("Method 2 (for-loop): " + aList.get(k));
		}
		System.out.println();
		
		// LinkedHashMap - Maintain JSON order
		System.out.println("LinkedHashMap: Order of objects are maintained");
		LinkedHashMap<String, Object> lhm = new LinkedHashMap<>(); 			
		lhm.put("status", jsonObject.get("status"));
		lhm.put("results", jsonObject.get("results"));
		for (String key : lhm.keySet()) {
			System.out.println("output from for-loop: " + key + ": " + lhm.get(key));
		}
		System.out.println();
		
		// HashMap - NOT maintain JSON order
		System.out.println("HashMap: Order of objects are NOT maintained");
		HashMap<String, Object> hm = new HashMap<>();						
		hm.put("status", jsonObject.get("status"));
		hm.put("results", jsonObject.get("results"));
		for (String key : hm.keySet()) {
			System.out.println("output from for-loop: " + key + ": " + hm.get(key));
		}
	}

}
