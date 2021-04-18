package dataStructure.sets;

import java.util.*;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number of elements : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		
		int sum = 0;
		boolean found = false;
		Set<Integer> sets = new HashSet<Integer>(); 
		
		for (int i = 0; i < a.length; i++) {
			
			sets.add(sum);
			sum+=a[i];
			if(sets.contains(sum)) {
				found = true;
				break;
			}
			
		}
		
		if(found)System.out.println("found = " + found);
		else System.out.println("Found = " + found);
		
		

		sc.close();
	}

}
