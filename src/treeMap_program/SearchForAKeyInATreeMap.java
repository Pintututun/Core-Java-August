package treeMap_program;

import java.util.TreeMap;

public class SearchForAKeyInATreeMap {
public static void main(String[] args) {
	TreeMap<String,String> tr=new TreeMap<String,String>();
	tr.put("C1", "White");
	tr.put("C2", "Orange");
	tr.put("C3", "Blue");
	tr.put("C4", "Red");
	tr.put("C5", "Yellow");
	System.out.println("TreeMap elements:"+tr);
	if(tr.containsKey("C3"))
	{
		System.out.println("TreeMap contains key");
	}
	else
	{
		System.out.println("TreeMap does not contain key");
	}
	if(tr.containsKey("C5"))
	{
		System.out.println("TreeMap contains key");
	}
	else
	{
		System.out.println("TreeMap does not contain key");
	}
}
}
