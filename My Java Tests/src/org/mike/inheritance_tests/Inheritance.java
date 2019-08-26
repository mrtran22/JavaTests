package org.mike.inheritance_tests;

import java.io.IOException;

public class Inheritance extends FileIO {
	
	int x=2;
	int y=3;
	
	Inheritance() throws IOException {
		super();
		//x = 2;
		//y = 3;
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Inheritance object calling super variable: x=" + super.x + ", y=" + super.y);
	}
	
	
	public static void main(String[] args) throws IOException {			// 'main' is not inherited, need this for System.out.println to work
		FileIO io = new FileIO();										// inherited from FileIO class
		System.out.println("FileIO object: x=" + io.x + ", y=" + io.y);							// needed to make x, y in superclass (FileIO) protected in order to 
																		// be accessed directly in subclass here, or use getter/setter
		Inheritance i = new Inheritance();
		System.out.println("Inheritance object: x=" + i.x + ", y=" + i.y);
		i.display();
	}
	

	

}
