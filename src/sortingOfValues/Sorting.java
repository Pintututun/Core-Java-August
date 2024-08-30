package sortingOfValues;

import java.util.*;

public class Sorting {
public static void main(String[] args) {
	Map<String,String> mp=new HashMap<>();
	mp.put("hehgo", "a");
	mp.put("hegflo", "c");
	mp.put("herteto", "t");
	mp.put("hedfdlo", "wer");
	mp.put("hesdlo", "a");
	mp.put("hedslo", "a");
//	TreeSet<Integer> tr=new TreeSet<>(mp.values());
//	for(Integer ele:tr)
//	{
//		if(mp.containsValue(ele))
//		{
//			mp.get
//		}
//	}
//	System.out.println(tr);
	 TreeMap<String, String> sortedMap = new TreeMap<>(Comparator.comparing(mp::get));
     sortedMap.putAll(mp);

     System.out.println(sortedMap);
     
}
}
