package dataStructure.maps.Hash_Equal;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pen pen = new Pen(10, "blue");
		Pen pen2 = new Pen(10, "blue");
		
//		System.out.println(pen.equals(pen2));
//		
//		System.out.println(pen);
//		System.out.println(pen2);
		
		Set<Pen> pens = new HashSet<Pen>();
		
		pens.add(pen2);
		pens.add(pen);
		
		System.out.println(pens);
		

	}

}
