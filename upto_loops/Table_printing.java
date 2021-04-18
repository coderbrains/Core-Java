package upto_loops;

import java.util.Scanner;

public class Table_printing {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		
		int num = scanner.nextInt();
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println(num + " X " + i  + "=" + num * i);
			
		}
	}

}
