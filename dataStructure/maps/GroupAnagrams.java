package dataStructure.maps;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"eat", "tea", "tan", "ate", "nat", "bat" , "tab" };
		
		Map<String , List<String>> ll = new HashMap<String , List<String>>(); 
		
		for(String str : s) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			
			if(!ll.containsKey(sorted)) {
				ll.put(sorted , new LinkedList<String>());
			}
			ll.get(sorted).add(str);
			
		}
		
		System.out.println(ll.values());

	}

}
