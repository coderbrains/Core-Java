package dataStructure;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TimeDif {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<Integer>();
		List<Integer> al = new ArrayList<>();
		getTimediff(al);
		getTimediff(ll);
	}
	
	public static void getTimediff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 1 ; i < 100000 ; i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + " --> " + (end-start));
	}
}
