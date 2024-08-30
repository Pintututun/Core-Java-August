package treeMap_program;

import java.util.TreeMap;

public class GetAKey_ValueMappingAssociatedWithTheLeastKeyGreaterThanOrEqualToGivenKey_returnNullIfThereIsNoSuchKey {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(10, "Red");
	map.put(20, "Green");
	map.put(30, "Black");
	map.put(40, "White");
	map.put(50, "Pink");
	System.out.println("Original treemap content:"+map);
	System.out.println("Greater than or equal to 10:"+map.ceilingEntry(10));
	System.out.println("Greater than or equal to 30:"+map.ceilingEntry(30));
	System.out.println("Greater than or equal to 25:"+map.ceilingEntry(25));
	System.out.println("Greater than or equal to 55:"+map.ceilingEntry(55));
}
}
