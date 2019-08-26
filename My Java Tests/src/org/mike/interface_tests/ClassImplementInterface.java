package org.mike.interface_tests;


// Class can implement multiple interfaces
public class ClassImplementInterface implements TestInterface1 , TestInterface2 {

	// Defining TestInterface1 showNum() method
	@Override										
	public void showNum() {
		System.out.println("This string defined abstract method showString() in TestInterface1");
	}
	
	// Defining TestInterface2 showString() method
	@Override										
	public void showString() {
		System.out.println("This string defined abstract method showString() in TestInterface2");
	}
	
	
	
	public static void main(String[] args) {
		
	// ============== Class implementing 'TestInterface' interface example ================ //
		
		ClassImplementInterface test = new ClassImplementInterface();
		test.showNum();
		test.showString();
		
		System.out.println("Direct access to TestInterface1's field/variable 'num': " + test.num);		// same as bottom line, but bottom line is preferred
		System.out.println(TestInterface1.num);
		System.out.println("Direct access to TestInterface2's field/variable 's': " + test.s);
	}
}
