package treeMap_program;

import java.util.TreeMap;

public class SearchFor_A_ValueInTreeMap {
public static void main(String[] args) {
	TreeMap<String,String> tr=new TreeMap<String,String>();
	tr.put("C1", "White");
	tr.put("C2", "Orange");
	tr.put("C3", "Blue");
	tr.put("C4", "Red");
	tr.put("C5", "Yellow");
	System.out.println("TreeMap elements:"+tr);
	if(tr.containsValue("Orange"))
	{
		System.out.println("TreeMap contains value");
	}
	else
	{
		System.out.println("TreeMap does not contain value");
	}
	if(tr.containsValue("Blue"))
	{
		System.out.println("TreeMap contains value");
	}
	else
	{
		System.out.println("TreeMap does not contain value");
	}
}
}
