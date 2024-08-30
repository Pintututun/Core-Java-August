package treeMap_program;

import java.util.TreeMap;

public class RemoveAndGetAKeyValueMappingAssociatedWithGreatestKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<>();
	map.put(10, "Red");
	map.put(20, "Blue");
	map.put(40, "White");
	map.put(50, "Orange");
	map.put(60, "Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Remove key value pair:"+map.pollLastEntry());
	System.out.println("Treemap after removing least key :"+map);
}
}
