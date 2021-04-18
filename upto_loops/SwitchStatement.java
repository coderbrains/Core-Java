package upto_loops;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The case you want to match : ");
		int cases = sc.nextInt();
		
		switch (cases) {
		case 1:
			System.out.println("This is the first case.");
			break;
		case 2 :
			System.out.println("This is the secod case");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + cases);
		}
		
		
	}
}
