package upto_loops;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = num ; i >= 0 ; i--) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
