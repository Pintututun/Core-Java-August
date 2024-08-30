package treeMap_program;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKeysFromATreeMap {
public static void main(String[] args) {
	TreeMap<String,String> tr=new TreeMap<String,String>();
	tr.put("C1", "White");
	tr.put("C2", "Orange");
	tr.put("C3", "Blue");
	tr.put("C4", "Red");
	tr.put("C5", "Yellow");
	System.out.println("TreeMap elements:"+tr);
	Set<String> keys=tr.keySet();
	for(String key:keys)
	{
		System.out.print(key+" ");
	}
}
}
