package treeMap_program;

import java.util.TreeMap;

public class CopyContentOfOneTreeMapToAnother {
public static void main(String[] args) {
	TreeMap<String,String> map1=new TreeMap<String,String>();
	map1.put("C1", "Red");
	map1.put("C2", "Blue");
	map1.put("C3", "Green");
	map1.put("C4", "Yellow");
	System.out.println("Elements of first TreeMap:"+map1);
	TreeMap<String,String> map2=new TreeMap<String,String>();
	map2.put("A1", "White");
	map2.put("A2", "Orange");
	System.out.println("Elements ofsecond TreeMap:"+map2);
	map1.putAll(map2);
	System.out.println("After copying contents map2 to map1:"+map1);
}
}
