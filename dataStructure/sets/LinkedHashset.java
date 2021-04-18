package dataStructure.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uses linkedlist for storing the data
		//very time efficient
		//stores the storing position of the elements 
		
		Set<Integer> ll = new LinkedHashSet<Integer>();
		
		ll.add(12);
		ll.add(0);
		ll.add(32);
		ll.add(45);
		ll.add(-90);
		ll.add(-8);
		ll.add(56);
		ll.add(3);
		
		System.out.println(ll);

	}

}
