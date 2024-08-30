package treeMap_program;

import java.util.Map;
import java.util.TreeMap;

public class AssociateTheSpecifiedValueWithSpecifiedKey {
public static void main(String[] args) {
	TreeMap<Integer,String> tr=new TreeMap<Integer,String>();
	tr.put(1, "Red");
	tr.put(2, "Green");
	tr.put(3,"Black");
	tr.put(4, "Blue");
	for(Map.Entry<Integer,String> entry:tr.entrySet())
	{
		System.out.println(entry.getKey()+"=>"+entry.getValue());
	}
	
}
}
