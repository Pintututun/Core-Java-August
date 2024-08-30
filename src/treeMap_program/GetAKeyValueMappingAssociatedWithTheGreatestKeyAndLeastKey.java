package treeMap_program;

import java.util.TreeMap;

public class GetAKeyValueMappingAssociatedWithTheGreatestKeyAndLeastKey {
public static void main(String[] args) {
	TreeMap<String,String> map=new TreeMap<>();
	map.put("C1", "Red");
	map.put("C2", "Green");
	map.put("C3", "Black");
	map.put("C4", "White");
	System.out.println("Original Tree Map content:"+map);
	System.out.println("Greatest key:"+map.firstEntry());
	System.out.println("Least key:"+map.lastEntry());
}
}
