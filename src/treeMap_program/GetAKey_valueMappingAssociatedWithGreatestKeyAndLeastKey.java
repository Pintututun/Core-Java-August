package treeMap_program;

import java.util.TreeMap;

public class GetAKey_valueMappingAssociatedWithGreatestKeyAndLeastKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(10, "Red");
	map.put(20, "Green");
	map.put(40,"Black");
	map.put(50, "White");
	map.put(60,"Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Checking the entry for 10:");
	System.out.println("Value is:"+map.floorEntry(10));
	System.out.println("Checking the entry for 30:");
	System.out.println("Value is:"+map.floorEntry(30));
	System.out.println("Checking the entry for 70:");
	System.out.println("Value is:"+map.floorEntry(70));
}
}
