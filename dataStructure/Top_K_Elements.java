package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Top_K_Elements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the number one by one :");
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		int[] a = new int[n];
		
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number of top elements you want to show : ");
		int k = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			if(i < k) {
				priorityQueue.add(a[i]);
			}else {
				if(a[i] > priorityQueue.peek()) {
					priorityQueue.poll();
					priorityQueue.add(a[i]);
				}
			}
		}
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(priorityQueue);
		Collections.sort(arrayList , Collections.reverseOrder());
		
		System.out.println(arrayList);

		sc.close();
	}

}
