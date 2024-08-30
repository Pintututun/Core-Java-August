package classNotes_Streams;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemo3 {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	map.put("A", "Ravi");
	map.put("B", "Ankit");
	map.put("C", "Sachin");
	map.forEach((k,v)->System.out.println("Key="+k+",Value="+v));
}
}
