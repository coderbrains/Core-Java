package upto_loops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();

		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
