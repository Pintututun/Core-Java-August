package treeMap_program;

import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetViewOfKeys {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<>();
	map.put(10, "Red");
	map.put(20, "Blue");
	map.put(40, "White");
	map.put(50, "Orange");
	map.put(60, "Pink");
	System.out.println("Original treemap content:"+map);
	NavigableSet<Integer> na=map.navigableKeySet();
	System.out.println("Navigable set view of keys:"+na);
}
}
