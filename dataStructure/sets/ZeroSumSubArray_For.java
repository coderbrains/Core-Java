package dataStructure.sets;

public class ZeroSumSubArray_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,1,-1,43,-2};
		
		int sum = 0;
		boolean found = false;
		
		for(int i = 0 ; i < a.length ;i++) {
			sum =0;
			for(int j = i ; j < a.length ; j++) {
				sum += a[j];
				if(sum == 0) {
					found = true;
					break;
				}
				
			}
			if(found)break;
		}
		
		System.out.println("Found = " + found);
		

	}

}
