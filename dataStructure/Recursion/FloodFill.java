package dataStructure.Recursion;

public class FloodFill {

	public static void main(String[] args) {
	
		int a[][] = {				
				{1, 1, 2, 2, 3, 3, 4},
				{1, 2, 2, 2, 3, 3, 4},
				{2, 2, 3, 1, 3, 4, 4},
				{1, 2, 2, 2, 3, 3, 4 }				
		};
		
		floodFill(a, 0, 6, 9, 4);
		
		printMatrix(a);

	}
	
	static void printMatrix(int[][] a) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void floodFill(int[][] a , int r , int c, int toFill , int prevFill ) {
		
		int row = a.length;
		int col = a[0].length;
		
		if(r < 0 || r >= row || c < 0 || c >= col) {
			return;
		}else if(a[r][c] != prevFill) {
			return;
		}else {
			a[r][c] = toFill;
			floodFill(a, r-1, c, toFill, prevFill);
			floodFill(a, r, c-1, toFill, prevFill);
			floodFill(a, r+1, c, toFill, prevFill);
			floodFill(a, r, c+1, toFill, prevFill);
		}
		
	}

}
