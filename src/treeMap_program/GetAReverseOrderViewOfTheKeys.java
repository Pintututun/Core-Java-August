package treeMap_program;

import java.util.Set;
import java.util.TreeMap;

public class GetAReverseOrderViewOfTheKeys {
public static void main(String[] args) {
	TreeMap<String,String> map=new TreeMap<String,String>();
	map.put("C2", "Red");
	map.put("C1", "Green");
	map.put("C4", "Black");
	map.put("C3", "White");
	System.out.println("Original treemap content:"+map);
    Set<String> rev=map.descendingKeySet();
    System.out.println("Reverse order view of the keys:"+rev);
}
}
