package treeMap_program;

import java.util.TreeMap;

public class GetTheGreatestKeyStrictlyLessThanGivenKeyReturnNullIfThereIsNoSuchKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<>();
	map.put(10, "Red");
	map.put(20, "Blue");
	map.put(40, "White");
	map.put(50, "Orange");
	map.put(60, "Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Checking the entry for 10:"+map.lowerEntry(10));
	System.out.println("Checking the entry for 20:"+map.lowerEntry(20));
	System.out.println("Checking the entry for 70:"+map.lowerEntry(70));
}
}
