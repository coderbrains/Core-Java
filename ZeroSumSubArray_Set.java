import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,-1,-41,43,-2};
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		set.add(sum);
		boolean found = false;
		
		for(int i = 0 ; i < a.length ;i++) {
			
			if(set.add(sum) == false) {
				found = true;
				break;
			}
			sum += a[i];
		}

		System.out.println("Found = " + found);
	}

}
