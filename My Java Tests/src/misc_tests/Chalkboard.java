package misc_tests;

import java.util.Scanner;

public class Chalkboard extends TestClass implements TestInterface {
	
	@Override
	public void intMethod1() {
		System.out.println("Interface'intMethod1()' invoked");
		System.out.println("Interface member variable value: " + interfaceString);
	}
	
	@Override
	public void intMethod2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void classAbstractMethod() {
		System.out.println("TestClass abstract method 'classAbstractMethod()' defined + invoked");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter something: ");
		String line = s.nextLine();
		System.out.println("this is the string entered: " + line);
		
		Chalkboard c = new Chalkboard();
		c.intMethod1();

		
		System.out.println("\nClass stuff inherited from 'TestClass': ");
		System.out.println("arms: " + c.arms);
		System.out.println("legs: " + c.legs);
		c.fight();
		c.rest();
		c.classAbstractMethod();
	}

	

}
