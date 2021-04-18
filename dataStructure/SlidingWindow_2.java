package dataStructure;

import java.util.ArrayDeque;

public class SlidingWindow_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,-1,-3,5,3,6,7 , 8};
		int k= 3;
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		
		for(int i = 0 ; i < a.length; i++) {
			if(i < k) {
				arrayDeque.addLast(a[i]);
			}else {
				System.out.println(arrayDeque);
			}
		}

	}

}
