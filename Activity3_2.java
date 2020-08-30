package Activity3_2;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		System.out.println("\nHashset:"+hs);
		System.out.println("\nSize of hashset:"+hs.size());
		System.out.println("\nRemove an element:"+hs.remove(4));
		System.out.println("\nRemove an element not present:"+hs.remove(7));
		System.out.println("\nContains element 2:"+hs.contains(2));
		System.out.println(hs);
			
	
		

	}

}
