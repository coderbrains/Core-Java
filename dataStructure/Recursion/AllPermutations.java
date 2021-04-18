package dataStructure.Recursion;

import java.util.HashSet;
import java.util.Set;

public class AllPermutations {
	
	static Set<String> sets = new HashSet<>();

	public static void main(String[] args) {

		permutations("abb", 0, 2);
		
		sets.forEach(System.out::println);

	}
	
	static void permutations(String s, int l, int r) {
		if(l == r) {
			sets.add(s);
			return;
		}
		
		for (int i = l; i <= r; i++) {
			
			s = interChange(s, l, i);
			permutations(s, l+1, r);
			s = interChange(s, l, i);
		}
	}
	
	
	
	static String interChange(String s, int l, int r) {
		char[] str = s.toCharArray();
		char temp = str[l];
		str[l] = str[r];
		str[r] = temp;
		String ss = new String(str);
		return ss;
	}
	

}
