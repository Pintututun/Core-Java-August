package hasheset_programs;

import java.util.HashSet;
import java.util.Iterator;

public class IterateThroughAllElementsInHashList {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Red");
	hset.add("Yellow");
	hset.add("Orange");
	hset.add("Blue");
	hset.add("Green");
	System.out.println(hset);
	Iterator<String> itr=hset.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
