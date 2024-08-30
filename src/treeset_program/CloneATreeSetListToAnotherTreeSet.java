package treeset_program;

import java.util.TreeSet;

public class CloneATreeSetListToAnotherTreeSet {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Orange");
	ts.add("Yellow");
	ts.add("Blue");
	ts.add("Green");
	ts.add("Red");
	System.out.println("TreeSet elements:"+ts);
	TreeSet<String> ts1=(TreeSet<String>)ts.clone();
	System.out.println("New tree set element:"+ts1);
}
}
