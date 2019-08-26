package org.mike.access_modifiers_pkg2;
import org.mike.access_modifiers_pkg1.*;

public class ClassD {									// Case: different package, non-subclass
	ClassA a = new ClassA();							
	
	public void displayString() {
		System.out.println('"' + a.publicString + '"' + " from package 1 > class A > public string");				// can only access PUBLIC constructs in object of ClassA. cannot access private/protected/default
	}
}
