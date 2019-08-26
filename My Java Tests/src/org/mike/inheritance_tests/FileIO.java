package org.mike.inheritance_tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileIO {
	
	protected int x;
	protected int y;
	private FileReader fr;
	private FileWriter fw;
	BufferedReader br;
	BufferedWriter bw;
	
	FileIO() throws IOException {				// constructor for no arguments passed
		// nothing
		x = 1;
		y = 2;
		fr = new FileReader("C:\\Users\\mt\\Desktop\\Code Test\\Java\\FileIO\\lorem.txt");
		fw = new FileWriter("C:\\Users\\mt\\Desktop\\Code Test\\Java\\FileIO\\lorem1.txt", true);	// 'true' parameter enables append data to file
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
	}
	

	public static void main(String[] args) throws IOException, ParseException {
		
		FileIO io = new FileIO();
		int sum = io.x + io.y;
		System.out.println("Sum x+y = " + sum);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("one", 1);
		jsonObject.put("two", 2);
		System.out.println("JSON object: " + jsonObject);
		System.out.println("JSON get key='two' => " + jsonObject.get("two"));
		System.out.println("JSON object size: " + jsonObject.size());
		System.out.println("JSON keyset: " + jsonObject.keySet());
		
		//JSONParser jsonParser = new JSONParser();
		//jsonParser.parse(io.br);
		
		
		while (true) {
			String line = io.br.readLine();
			if (line != null) {
				io.bw.write(line);
				io.bw.newLine();
			} else {
				break;
			}
		}
		io.br.close();
		io.bw.close();
		
		

	// ============== Procedural File Read/Write code =============== //		
	/*		
  		try {
			FileReader fr = new FileReader("C:\\Users\\mt\\Desktop\\Code Test\\Java\\FileIO\\lorem.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\Users\\mt\\Desktop\\Code Test\\Java\\FileIO\\lorem1.txt", true);	// 'true' parameter enables append to file
			BufferedWriter bw = new BufferedWriter(fw);
			
			while (true) {
				String line = br.readLine();
				if (line != null) {
					bw.write(line);
					bw.newLine();
				} else {
					break;
				}
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("File/path does not exist");
		}
	*/	
	
	}

}
