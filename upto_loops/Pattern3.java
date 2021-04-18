package upto_loops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
				for(int k = i-1 ; k > 0 ; k--) {
					System.out.print(" ");
				}for(int l = num - i + 1 ; l > 0 ; l--) {
					System.out.print(  "*" );
				}
			
			System.out.println();
		}

	}

}
