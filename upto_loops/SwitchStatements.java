package upto_loops;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The first number : ");
		int a = scanner.nextInt();
		
		System.out.println("Enter The Second number :");
		int b = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter The operator :");
		char operation = scanner.nextLine().charAt(0);
		
		switch (operation) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		case '%':
			System.out.println(a % b);
			break;
		

		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}

}
