package treeMap_program;

import java.util.TreeMap;

public class GetTheLeastKeyGreaterThanOrEqualToGivenKey_returnNullIfThereIsNoSuchKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(10, "Red");
	map.put(20, "Green");
	map.put(30, "Black");
	map.put(40, "White");
	map.put(50, "Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Key greater than or equal to given key:"+map.ceilingKey(10));
	System.out.println("Key greater than or equal to given key:"+map.ceilingKey(15));
	System.out.println("Key greater than or equal to given key:"+map.ceilingKey(20));
	System.out.println("Key greater than or equal to given key:"+map.ceilingKey(60));
}
}
