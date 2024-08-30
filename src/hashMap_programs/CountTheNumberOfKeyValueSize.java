package hashMap_programs;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfKeyValueSize {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "Red");
		hmap.put(2, "Green");
		hmap.put(3, "Black");
		hmap.put(4,"Blue");
		hmap.put(5, "White");
		System.out.println("Size of hashmap:"+hmap.size());
	}
	}

