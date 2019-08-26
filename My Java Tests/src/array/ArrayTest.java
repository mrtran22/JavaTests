package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		String arr1[] = {"uno", "dos", "tres", "quatro"};			// declare + initialize altogether
		System.out.println("1-dimensional array: ");
		for (String s : arr1) {
			System.out.println(s);
		}
		
		int arr2[] = new int[4];									// declare array size first
		arr2[0] = 1;												// initialize after
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		System.out.println("\n1-dimensional array (declare + "
				+ "initialize seperately): ");
		for (int s : arr2) {
			System.out.println(s);
		}
		
		//	+---------------+
		//	|	2-D Array	|
		//	| int[col][row]	|
		//	+---+-----+-----+
		//	|	|  0  |  1  |
		//	+---+-----+-----+
		//	| 0 | 100 | 400 |
		//	| 1 | 200 | 500 |
		//	| 2 | 300 | 600 |
		//	+---+-----+-----+
		
		int arr3[][] = new int[2][3];								// int[col][row]
		arr3[0][0] = 100;
		arr3[0][1] = 200;
		arr3[0][2] = 300;
		arr3[1][0] = 400;
		arr3[1][1] = 500;
		arr3[1][2] = 600;
		
		System.out.println("\n2-dimensional array: ");
		for (int col=0;col<2;col++) {
			for (int row=0;row<3;row++) {
				System.out.println("arr3[" + col + "][" + row + "] = " + arr3[col][row]);
			}
		}
		
	}

}
