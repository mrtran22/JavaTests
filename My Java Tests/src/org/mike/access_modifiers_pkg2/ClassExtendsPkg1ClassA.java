package org.mike.access_modifiers_pkg2;
import org.mike.access_modifiers_pkg1.*;

public class ClassExtendsPkg1ClassA extends ClassA {			// Case: different package, sub-class (extends ClassA)
	public void displayString() {
		System.out.println('"' + protectString + '"' + " from package 1 > class A > protected string");
		System.out.println('"' + publicString + '"' + " from package 1 > class A > protected string");
	}
}
