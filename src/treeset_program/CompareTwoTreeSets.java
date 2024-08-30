package treeset_program;

import java.util.TreeSet;

public class CompareTwoTreeSets {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Pink");
	ts.add("Orange");
	ts.add("Blue");
	ts.add("Black");
	ts.add("White");
	ts.add("Red");
	System.out.println("First Tree set elements:"+ts);
	TreeSet<String> ts1=new TreeSet<>();
	ts1.add("White");
	ts1.add("Black");
	ts1.add("Brown");
	ts1.add("Grey");
	ts1.add("Violet");
	ts1.add("Red");
	System.out.println("Second Tree set elements:"+ts1);
	TreeSet<String> ts2=new TreeSet<>();
	for(String ele:ts)
	{
		ts2.add(ts1.contains(ele)?"Yes":"No");
	}
	System.out.println("Compared tree set:"+ts2);
}
}
