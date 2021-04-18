package dataStructure.Recursion;

public class PathFinderMatrix {
	
	static int path(int n , int m) {
		if(m == 0 && n==0) {
			return 0;
		}else if(m==1 || n==1) {
			return 1;
		}else {
			return path(m,n - 1) + path(n,m - 1);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(path(4,4));

	}

}
