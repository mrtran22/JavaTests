package json_parsing_tests;

import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJsonString {
	
	public static void main(String[] args) throws ParseException {
		
		//	+---------------------------------------------------------------+
		//	|	import org.json.simple.* libraries (above) first			|
		//	|	demonstrate use of JSONParser, JSONObject, and JSONArray	|
		//	+---------------------------------------------------------------+
		
		String jsonString = "{\"donkey\":\"animal\", \"animals\":\"[lion,tiger,liger]\", \"shark\":\"fish\", \"abalone\":\"{shell:hard,muscle:soft}\"}";
		JSONObject jsonObj = new JSONObject();
		JSONParser parser = new JSONParser();
		
		jsonObj = (JSONObject) parser.parse(jsonString);												// parse JSON string to JSON object
		System.out.println("JSON Object key value pairs after parsing JSON string 'jsonString': ");
		System.out.println(jsonObj);
		System.out.println("\nJSON Object 'donkey' key has value of: " + jsonObj.get("donkey"));		// get() value via key
		System.out.println("JSON Object keysets via keySet(): " + jsonObj.keySet());					// keySet()
		
		// Iterator
		System.out.println("\nIterating thru 'jsonObj' using Iterator");
		Iterator<?> itr = jsonObj.keySet().iterator();													// iterate
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key + ":" + jsonObj.get(key));											// display key and value
		}
		
		// Set collection to store key sets
		Set<?> s = jsonObj.keySet();																	// keySet() returns Set object.  Keys only, no values
		System.out.println("\nIterating thru keySet stored in Set collection. Only keys, no values");	
		for (Object k : s ) {
			System.out.println("from Set: " + k);
		}
		
		//	+-----------------------+
		//	|	JSONArray Example	|
		//	+-----------------------+
		String arrString = "[ [\r\n" + 
				"    1563357600000,\r\n" + 
				"    \"9432.15000000\",\r\n" + 
				"    \"9432.74000000\",\r\n" + 
				"    \"9325.00000000\",\r\n" + 
				"    \"9331.92000000\",\r\n" + 
				"    \"974.51565100\",\r\n" + 
				"    1563358499999,\r\n" + 
				"    \"9140050.28685971\",\r\n" + 
				"    9867,\r\n" + 
				"    \"475.48185400\",\r\n" + 
				"    \"4461672.06396611\",\r\n" + 
				"    \"0\"\r\n" + 
				"  ],\r\n" + 
				"  [\r\n" + 
				"    1563358500000,\r\n" + 
				"    \"9334.16000000\",\r\n" + 
				"    \"9367.91000000\",\r\n" + 
				"    \"9303.00000000\",\r\n" + 
				"    \"9352.83000000\",\r\n" + 
				"    \"752.80400000\",\r\n" + 
				"    1563359399999,\r\n" + 
				"    \"7027174.07763650\",\r\n" + 
				"    6455,\r\n" + 
				"    \"454.49768500\",\r\n" + 
				"    \"4242471.68894229\",\r\n" + 
				"    \"0\"\r\n" + 
				"  ],\r\n" + 
				"  [\r\n" + 
				"    1563359400000,\r\n" + 
				"    \"9354.06000000\",\r\n" + 
				"    \"9354.06000000\",\r\n" + 
				"    \"9228.93000000\",\r\n" + 
				"    \"9301.25000000\",\r\n" + 
				"    \"1310.47526800\",\r\n" + 
				"    1563360299999,\r\n" + 
				"    \"12169213.16879065\",\r\n" + 
				"    9643,\r\n" + 
				"    \"567.77599100\",\r\n" + 
				"    \"5273145.69167596\",\r\n" + 
				"    \"0\"\r\n" + 
				"  ]\r\n" + 
				"]";
		
		JSONArray jsonArr1 = new JSONArray();
		JSONArray jsonArr2 = new JSONArray();
		jsonArr1 = (JSONArray) parser.parse(arrString);
		//System.out.println("\nJSONArray: ");
		System.out.println("\njsonArr1.get(0): \n" + jsonArr1.get(0));
		jsonArr2 = (JSONArray) jsonArr1.get(0);															// jsonArr1.get(0) returns JSONArray
		System.out.println("jsonArr2.get(0) - get first element of "
				+ "JSONArray: \n" + jsonArr2.get(0));
		
	}

}
