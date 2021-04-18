package arraysRevision;

import java.util.Arrays;

public class CandyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,1};
		int[] result = new int[arr.length];
		Arrays.fill(result, 1);
		
		for(int i = 1 ; i < arr.length ; i++) {
			
				if(arr[i-1] < arr[i]) {
					result[i] = result[i-1] + 1;
				}else if(arr[i - 1] >= arr[i] && i < arr.length -1){
					if(arr[i+1] >arr[i]) {
						result[i] = 1;
					}else {
						result[i+1] = 1;
						result[i] = 2;
						i++;
					}
				}
			
		}
		
		for(int a : result) {
			System.out.println(a);
		}
		
		
//		for(int i = 1 ; i < arr.length ; i++) {
//			if(arr[i-1] < arr[i]) {
//				result[i] = result[i - 1] + 1;
//			}
//		}
//		
//		for(int i = arr.length - 2 ; i >= 0 ; i--) {
//			if(arr[i] > arr[i+1]) {
//				result[i] = Math.max(result[i+1] + 1, result[i]);
//			}
//		}
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(result[i]);
//		}
		
	}

}
