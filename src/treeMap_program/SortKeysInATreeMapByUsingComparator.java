package treeMap_program;

import java.util.Comparator;
import java.util.TreeMap;

public class SortKeysInATreeMapByUsingComparator{
public static void main(String[] args) {
	TreeMap<String,String> map=new TreeMap<String,String>(new sort_key());
	map.put("C2","Red");
	map.put("C4", "Green");
	map.put("C3", "Black");
	map.put("C1", "White");
	System.out.println("TreeMap elements:"+map);
}
}
class sort_key implements Comparator<String>{
	@Override
	public int compare(String str1,String str2)
	{
		return str1.compareTo(str2);
	}
}
