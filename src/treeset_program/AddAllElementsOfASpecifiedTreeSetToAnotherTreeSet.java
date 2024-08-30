package treeset_program;

import java.util.TreeSet;

public class AddAllElementsOfASpecifiedTreeSetToAnotherTreeSet {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Orange");
	ts.add("Blue");
	ts.add("Green");
	ts.add("Yellow");
	ts.add("Red");
	System.out.println("TreeSet elements:"+ts);
	TreeSet<String> ts1=new TreeSet<>();
	ts1.add("White");
	ts1.add("Black");
	ts1.add("Brown");
	ts1.add("Grey");
	ts1.add("Red");
	System.out.println("TreeSet elements:"+ts1);
	ts.addAll(ts1);
	System.out.println("TreeSet elements:"+ts);
	System.out.println("TreeSet size:"+ts.size());
}
}
