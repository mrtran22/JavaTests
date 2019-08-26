package scanner;

import java.util.Scanner;

public class ScanInput {

	public static void main(String[] args) {
		System.out.println("Input something: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		System.out.println("input = " + input);

	}

}
