package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = 10;
		System.out.println("Enter the number one by one : ");
		
		
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt();
			arrayList.add(num);
		}
		
		System.out.println(arrayList.get(5));
		
		sc.close();
	}

}
