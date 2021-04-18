package dataStructure.sets;

import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> num = new TreeSet<>();
		//duplicates are not allowed and elements are kept in sorted order.
		
		num.add(12);
		num.add(23);
		num.add(2);
		num.add(21);
		
		System.out.println(num.add(11));
		
		System.out.println(num);

	}

}
