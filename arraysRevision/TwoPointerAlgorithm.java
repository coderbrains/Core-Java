package arraysRevision;

public class TwoPointerAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* This will perform the required task in big-oh of n cube
		int[] arr = {-5,-3,0,1,2,4,5,12,5};
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				for(int k = j + 1 ; k < arr.length ; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}     */
		
		// Now we will try to optimize it

		int[] arr = {-5,-3,0,1,2,4,5,12};
		
		for(int i = 0 ; i < arr.length - 3 ; i++) {
			if(twoSum(arr , -arr[i] , i + 1)) {
			System.out.println("Found");	
			}else {
				System.out.println("Not found");
			}
		}
		
		
	}
	
	static boolean twoSum(int[] a , int x , int i) {
		
		int j = a.length - 1;
		
		while(i < j) {
			if(x > a[i] + a[j]) {
				i++;
			}else if(x < a[i] + a[j]) {
				j--;
			}else {
				System.out.println(-x + " " + a[i] + " " + a[j] );
				return true;
			}
		}
		return false;
	}

}
