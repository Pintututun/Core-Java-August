package treeMap_program;

import java.util.TreeMap;

public class GetThePortionOfMapWhoseKeysAreLessThanOrEqualToIfInclusiveIsTrueAGivenKey {
public static void main(String[] args) {
	TreeMap<String,String> map=new TreeMap<>();
	map.put("C1", "Red");
	map.put("C2", "Blue");
	map.put("C3", "White");
	map.put("C4", "Orange");
	System.out.println("Original treemap content:"+map);
	System.out.println("Portion of map whose keys are strictly less than given key:"+map.headMap("C1",true));
	System.out.println("Portion of map whose keys are strictly less than given key:"+map.headMap("C3",true));
	System.out.println("Portion of map whose keys are strictly less than given key:"+map.headMap("C4"));
	System.out.println("Portion of map whose keys are strictly less than given key:"+map.headMap("C5"));
	
}
}
