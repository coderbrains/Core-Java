package dataStructure.sets;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class Hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// uses hash function to store the variablea in the bag
		//position is not preserved
		
		Set<Integer> set = new HashSet<>();
		
		set.add(34);
		set.add(322);
		set.add(3);
		set.add(1);
		set.add(0);
		set.add(-12);
		
		System.out.println(set);

	}

}
