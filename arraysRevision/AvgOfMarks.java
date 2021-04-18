package arraysRevision;

import java.util.Scanner;

public class AvgOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The number of Students : ");
		int numOfStudent = scanner.nextInt();
		
		System.out.println("Enter The Marks Of the Student : ");
		int [] marks = new int[10];
		int sum = 0;
		for(int i = 0 ; i < numOfStudent ; i++ ) {
			marks[i]= scanner.nextInt();
			sum+= marks[i];
		}
		
		float avg = (float)sum / (float)numOfStudent;
		System.out.println(avg);
		
		for (int i = 0; i < numOfStudent; i++) {
			System.out.print(marks[i]);
		}
	}

}
