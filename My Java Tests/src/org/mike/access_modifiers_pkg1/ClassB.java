package org.mike.access_modifiers_pkg1;

public class ClassB {
	ClassA a = new ClassA();
	
	public void method1() {
		System.out.println(a.defaultString);
	}
}
