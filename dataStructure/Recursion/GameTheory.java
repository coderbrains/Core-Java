package dataStructure.Recursion;

public class GameTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};
		
		System.out.println(coinMax(a, 0, 5));

	}
	
	static int coinMax(int[] a, int l, int r) {
		
		if(r == l+1) {
			return Math.max(a[l], a[r]);
		}else {
			
			return Math.max(
					a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1)),
					a[r] + Math.min(coinMax(a, l+1, r-1), coinMax(a, l, r-2)));			
			
		}
	}

}
