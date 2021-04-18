package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindow {

	public static void main(String[] args) {
		
		int[] a = {1,3,-1,-3,5,3,6,7 , 8};
		int k= 3;
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for(int i = 0 ;  i <= a.length - k ; i++) {
			for(int j = i ; j < i + k ; j++) {
				priorityQueue.add(a[j]);
			}
			ArrayList<Integer> arrayList = new ArrayList<>(priorityQueue);
			Collections.sort(arrayList , Collections.reverseOrder());
			System.out.println(arrayList.get(0));
			arrayList.clear();
			priorityQueue.clear();
		}

	}

}
