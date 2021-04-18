package dataStructure.backTracking;

public class SourceToDestination {

	public static void main(String[] args) {
		
		int[][] a = {
				
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
				{0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
				{1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
				{0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 0, 1, 0, 0, 1, 1, 0, 0, 1}				
		};
		
		int ans = shortestPath(a, 0, 0, 8, 0);
		System.out.println(ans);
		
	}
	
	
	
	
	
	static int shortestPath(int a[][] , int i, int j, int x, int y) {
		
		int rows = a.length;
		int col = a[0].length;
		
		boolean[][] visited = new boolean[rows][col];
		
		return shortestPath(a, i, j, x, y, visited);
	}
	
	
	/* This function checks
	 * wether it is safe to visit or not
	 */
	
	
	static boolean isValid(int[][] a, int i, int j, boolean visited[][]) {
		
		int rows = a.length;
		int col = a[0].length;
		
		return i >= 0 && j >= 0 && i < rows && j < col && a[i][j] == 1 && !visited[i][j];
	}
	
	
	
	
	
	static int shortestPath(int[][] a , int i, int j, int x, int y, boolean[][] visited) {
		
		
		
		if(!isValid(a, i, j, visited)) {
			return 100000;
		}
		
			if(i == x && j == y)
				return 0;
			
			visited[i][j] = true;
			
			int left = shortestPath(a, i, j - 1, x, y, visited) + 1;
			int right = shortestPath(a, i, j+1, x, y, visited) + 1;
			int top = shortestPath(a, i-1, j, x, y, visited) + 1;
			int bottom = shortestPath(a, i+1, j, x, y, visited) + 1;
			
			/*
			 * the below line helps in backtracking possible.
			 */
			
			visited[i][j] = false;
			
			return Math.min(Math.min(left, right), Math.min(top, bottom));
		
		
	}
	
	
	
	
	
	
	
	
	
}

