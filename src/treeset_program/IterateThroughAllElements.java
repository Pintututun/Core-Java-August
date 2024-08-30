package treeset_program;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateThroughAllElements {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Orange");
	ts.add("Blue");
	ts.add("Black");
	ts.add("Red");
	ts.add("Green");
	System.out.println("TreeSet element:"+ts);
	Iterator<String> itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
