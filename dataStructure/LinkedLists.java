package dataStructure;

import java.util.*;


public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<Integer>();
		
		for(int i = 2 ; i < 1000 ; i*=2) {
			list.add(i);
		}
		
		System.out.println(list);
	}

}
