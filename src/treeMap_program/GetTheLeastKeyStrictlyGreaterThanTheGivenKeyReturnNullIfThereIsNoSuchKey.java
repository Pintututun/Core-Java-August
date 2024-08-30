package treeMap_program;

import java.util.TreeMap;

public class GetTheLeastKeyStrictlyGreaterThanTheGivenKeyReturnNullIfThereIsNoSuchKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<>();
	map.put(10, "Red");
	map.put(20, "Blue");
	map.put(40, "White");
	map.put(50, "Orange");
	map.put(60, "Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Checking the entry for 10");
	System.out.println("Strictly greater than 10:"+map.higherEntry(10));
	System.out.println("Strictly greater than 20:"+map.higherEntry(20));
	System.out.println("Strictly greater than 70:"+map.higherEntry(70));
	
}
}
