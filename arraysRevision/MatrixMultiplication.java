package arraysRevision;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Dimension : ");
		
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		System.out.println("Enter the first matrix : ");
		int[][] mat1 = new int[10][10];
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				mat1[i][j] = scanner.nextInt(); 
			}
		}
		
		System.out.println("Enter The Second Matrix : ");
		int mat2[][] = new int[10][10];
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j <col ; j++) {
				mat2[i][j] = scanner.nextInt(); 
			}
		}
		
		int[][] result = new int[10][10];
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				result[i][j]= 0;
				for(int k = 0 ; k < col ; k++) {
					result[i][j]= result[i][j] + mat1[i][k] * mat2[k][j];   
				}
			}
		}
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j <col ; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
