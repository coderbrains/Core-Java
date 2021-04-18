package upto_loops;

import java.util.Scanner;

public class Type_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
		int a = 10;
		double d = 12.23;
		
		d = a;
		
		System.out.println(d);
		
		a = (int)d;
		
		System.out.println("Enter The value of a :");
		int as = scanner.nextInt();
		
		System.out.println("Enter the value of db :");
		double db = scanner.nextDouble();
		
		System.out.println(as);
		System.out.println(db);
		
		
		
	}

}
