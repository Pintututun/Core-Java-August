package treeMap_program;

import java.util.SortedMap;
import java.util.TreeMap;

public class GetAPortionOfMapWhoseKeysAreGreaterThanAGivenKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(10, "Red");
	map.put(20, "Green");
	map.put(30, "Black");
	map.put(40, "White");
	map.put(50, "Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Portion of map whose keys are greater than 20:"+map.tailMap(20, false));
}
}
