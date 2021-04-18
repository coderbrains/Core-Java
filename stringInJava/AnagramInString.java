package stringInJava;

import java.util.Scanner;

public class AnagramInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The first String :");
		String string = sc.nextLine();
		
		System.out.println("Enter The Second String : ");
		String string2 = sc.nextLine();
		
		boolean[] result = new boolean[256];
		
		char[] str1 = string.toCharArray();
		char[] str2 = string2.toCharArray();
		
		for(char c : str1) {
			int pos = (int)c;
			result[pos] = true;
		}
		
		for(char c : str2) {
			int pos = (int)c;
			result[pos] = false;
		}
		int r = 0;
		for(int i = 0 ; i <= 255 ; i++) {
			if(result[i] == true) {
				r = 1;
				break;
			}
		}
		
		if(r== 1) {
			System.out.println("Not Anagram");
		}else {
			System.out.println("Anagram");
		}
		

	}

}
