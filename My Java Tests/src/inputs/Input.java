package inputs;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter something: ");
		scan.nextLine();
		System.out.print("DONE");
		scan.close();
	}

}
