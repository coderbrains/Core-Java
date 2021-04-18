package dataStructure.maps;

import java.util.*;

public class GroupAnagrams2 {

	public static void main(String[] args) {
		
		String[] s = {"eat", "tea", "tan", "ate", "nat", "bat" , "tab" };
		
		Map<String , List<String>>  map = new HashMap<String , List<String>>();
		
		for(String str : s) {
		
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			
			map.get(sorted).add(str);
			
		}
		
			System.out.println(map.values());

	}

}
