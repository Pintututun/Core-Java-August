package treeset_program;

import java.util.TreeSet;

public class PrintFirstAndLastElement {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Orange");
	ts.add("Yellow");
	ts.add("Blue");
	ts.add("Black");
	ts.add("Green");
	ts.add("Red");
	System.out.println("TreeSet elements:"+ts);
	System.out.println("First element:"+ts.first());
	System.out.println("Last element:"+ts.last());
}
}
