package dataStructure.Recursion;
import java.util.*;

public class PermutationsString {
	
	static Set<String> strings = new HashSet<String>();

	public static void main(String[] args) {
		
		permutations("aabcd", 0, 3);

	}
	
	static String interChange(String s, int i, int j) {
		char[] str = s.toCharArray();
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		s = new String(str);
		return s;
	}
	
	static void permutations(String s, int l, int r) {
		
		if( l == r) {
			if(!strings.contains(s)) {
				System.out.println(s);
				strings.add(s);
			}
//			System.out.println(s);
			return;
		}else {
			
			for(int i = l; i <= r; i++) {
				
				s = interChange(s, l , i);
				permutations(s, l+1 , r);
				s = interChange(s, l, i);
			}
		}
		
	}
	
	

}
