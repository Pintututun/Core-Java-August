package treeMap_program;

import java.util.SortedMap;
import java.util.TreeMap;

public class GetThePortionOfAMapWhoseKeysRangeFromAGivenKeyToAnotherkey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	SortedMap<Integer,String> sub_map=new TreeMap<Integer,String>();
	map.put(10, "Red");
	map.put(20, "Green");
	map.put(30, "Black");
	map.put(40, "White");
	map.put(50, "Pink");
	System.out.println("Original treemap content:"+map);
	sub_map=map.subMap(10, false, 40, true);
	System.out.println("Sub map key-values:"+sub_map);
}
}
