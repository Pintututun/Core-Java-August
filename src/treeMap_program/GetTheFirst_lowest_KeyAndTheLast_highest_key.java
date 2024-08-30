package treeMap_program;

import java.util.TreeMap;

public class GetTheFirst_lowest_KeyAndTheLast_highest_key {
public static void main(String[] args) {
	TreeMap<String,String> map=new TreeMap<String,String>();
	map.put("C2", "Red");
	map.put("C1", "Green");
	map.put("C4", "Black");
	map.put("C3", "White");
	System.out.println("Original treemap content:"+map);
	System.out.println("Greatest key:"+map.firstKey());
	System.out.println("Lowest key:"+map.lastKey());
}
}
