package treeset_program;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrder {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Orange");
	ts.add("Yellow");
	ts.add("Blue");
	ts.add("Black");
	ts.add("White");
	ts.add("Red");
	System.out.println("TreeSet list:"+ts);
	Iterator<String> itr=ts.descendingIterator();
	System.out.println("Elements in reverse order:");
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
}
}
