package org.mike.access_modifiers_pkg2;

public class RunAccessTest {

	public static void main(String[] args) {
		
		ClassExtendsPkg1ClassA c = new ClassExtendsPkg1ClassA();
		ClassD d = new ClassD();
		
		System.out.println("Object c has access to:");
		c.displayString();												// different package, subclass (extends ClassA)
		System.out.println();
		
		System.out.println("Object d has access to:");
		d.displayString();												// different package, non-subclass
		
	}

}
