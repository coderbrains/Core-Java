package upto_loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The number yopu want to find the factorial : ");
		int num = scanner.nextInt();
		int fact = 1;
		for(int i = num ; i > 0 ; i--) {
			fact *= i;
		}
		
		System.out.println(fact);
	}

}
