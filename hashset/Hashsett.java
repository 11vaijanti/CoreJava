package hashset;

import java.util.Arrays;
import java.util.HashSet;

public class Hashsett {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		System.out.println(hs.add(10));
		System.out.println(hs.add(1));
		System.out.println(hs.add(12));
		System.out.println(hs.add(10)); //only one 10 value will be stored
		System.out.println(hs.add(32));
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));//only one null value will be stored
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(5));
		//traversing through hashset
		for(Integer i:hs) {
			System.out.println(i);
		}
		System.out.println(hs.remove(10));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		
		//converting hashset into array
		Integer[] arr = new Integer[hs.size()];
		hs.toArray();
		System.out.println(Arrays.toString(arr));
		
	}

}
